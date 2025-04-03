package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum evww {
    REQUEST_PERMISSIONS,
    APP_SETTINGS_REDIRECT,
    IN_APP_BROWSER_REDIRECT,
    ACTIONDATA_NOT_SET;

    public static evww a(int i) {
        if (i == 0) {
            return ACTIONDATA_NOT_SET;
        }
        if (i == 1) {
            return REQUEST_PERMISSIONS;
        }
        if (i == 2) {
            return APP_SETTINGS_REDIRECT;
        }
        if (i != 3) {
            return null;
        }
        return IN_APP_BROWSER_REDIRECT;
    }
}
