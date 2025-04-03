package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etaj {
    public static /* synthetic */ String a(int i) {
        return i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNRECOGNIZED" : "PARTICIPANT_UPDATED" : "PARTICIPANT_DELETED" : "PARTICIPANT_CREATED" : "PARTICIPANT_EVENT_TYPE_UNSPECIFIED";
    }

    public static int b(int i) {
        if (i == 0) {
            return 2;
        }
        if (i == 1) {
            return 3;
        }
        if (i != 2) {
            return i != 3 ? 0 : 5;
        }
        return 4;
    }
}
