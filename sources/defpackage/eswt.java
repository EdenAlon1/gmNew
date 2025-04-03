package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eswt {
    public static /* synthetic */ String a(int i) {
        switch (i) {
            case 2:
                return "CONVERSATION_EVENT_TYPE_UNSPECIFIED";
            case 3:
                return "INTERACTION_STATE_CHANGED";
            case 4:
                return "METADATA_MODIFIED";
            case 5:
                return "CONVERSATION_CREATED";
            case 6:
                return "CONVERSATION_DELETED";
            case 7:
                return "CONVERSATION_UPDATED";
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
