package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dert {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 2:
                return "SATELLITE_SESSION_UNKNOWN";
            case 3:
                return "SATELLITE_SESSION_OFF";
            case 4:
                return "SATELLITE_SESSION_DEMO";
            case 5:
                return "SATELLITE_SESSION_NON_EMERGENCY";
            case 6:
                return "SATELLITE_SESSION_EMERGENCY";
            case 7:
                return "SATELLITE_SESSION_DISABLING";
            case 8:
                return "SATELLITE_SESSION_ENDING_EMERGENCY";
            case 9:
                return "SATELLITE_SESSION_NON_STARGATE_SESSION";
            default:
                return "UNRECOGNIZED";
        }
    }

    public static int b(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
            case 6:
                return 8;
            case 7:
                return 9;
            default:
                return 0;
        }
    }
}
