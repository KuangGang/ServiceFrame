package com.choice.scm.dao.conf;

/**
 * @author linwbai
 * @version $Id: DynamicDataSourceHolder.java, v 0.1 2018-01-17 下午5:00 linwbai Exp $$
 */
public final class DynamicDataSourceHolder {

    private static final ThreadLocal<DynamicDataSourceGlobal> holder = new ThreadLocal<>();

    private DynamicDataSourceHolder() {
        //
    }

    public static void putDataSource(DynamicDataSourceGlobal dataSource){
        holder.set(dataSource);
    }

    public static DynamicDataSourceGlobal getDataSource(){
        return holder.get();
    }

    public static void clearDataSource() {
        holder.remove();
    }

}
