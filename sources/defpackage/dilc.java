package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public enum dilc {
    UNKNOWN,
    NETWORK_UNAVAILABLE,
    NETWORK_ERROR,
    NETWORK_CHANGE,
    CONNECTIVITY_CHANGE,
    ERROR_RESPONSE,
    TIMEOUT,
    LOW_BATTERY,
    RECONFIGURATION_REQUIRED,
    SHUTDOWN,
    PHONE_ACCOUNT_REGISTRATION_FAILED,
    NO_LONGER_SIM_CALL_MANAGER,
    DISABLED,
    REREGISTRATION_REQUIRED,
    WIFI_CALLING_PREFERENCE_CHANGE,
    IMS_CALLING_NOT_ALLOWED,
    IMS_SERVICE_DISPATCHER_STOPPED,
    CANCELED,
    ACTIVE_MEDIA_NETWORK_INTERFACE_CHANGE,
    VPN_SETUP,
    VPN_TEARDOWN,
    FCM_TICKLE_KEEP_ALIVE,
    DEBUG_OPTIONS_FORCED_UNREGISTER,
    SIM_REMOVED,
    NO_RETRY_NO_DEREGISTER_FOR_TEST;

    public static dilc a(int i) {
        return (i < 0 || i > values().length + (-1)) ? UNKNOWN : values()[i];
    }

    public final boolean b() {
        return this == NETWORK_ERROR || this == NETWORK_UNAVAILABLE;
    }
}
