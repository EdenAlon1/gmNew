package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etab {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 2:
                return "OBJECT_EVENT_TYPE_UNSPECIFIED";
            case 3:
                return "FLAG_CHANGED";
            case 4:
                return "PAYLOAD_MODIFIED";
            case 5:
                return "OBJECT_CREATED";
            case 6:
                return "OBJECT_DELETED";
            case 7:
                return "OBJECT_UPDATED";
            default:
                return "UNRECOGNIZED";
        }
    }

    public static int b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i == 3) {
            return 5;
        }
        if (i != 4) {
            return i != 5 ? 0 : 7;
        }
        return 6;
    }
}
