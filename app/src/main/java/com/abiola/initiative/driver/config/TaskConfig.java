package com.abiola.initiative.driver.config;


public final class TaskConfig {
    public static final String HTTP_HOST = "http://aauaforum.com";
    public static final String DIR_URL = "/mobile";
//    public static final String HTTP_HOST = "";
//    public static final String DIR_URL = "";
    public static final String DIR_ACTION_URL = DIR_URL + "/";
    public static final String GET_DRIVER_DATA_URL = HTTP_HOST + DIR_ACTION_URL + "driver_data";
    public static final String SEND_LEAVE_URL = HTTP_HOST + DIR_ACTION_URL + "send_leave";
    public static final String GET_RESERVATIONS_URL = HTTP_HOST + DIR_ACTION_URL + "get_driver_reservation";
    public static final String SAVE_BOOKING_DETAILS = HTTP_HOST + DIR_ACTION_URL + "end_service";
}
