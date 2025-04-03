package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjyr {
    public static /* synthetic */ String a(int i) {
        return i != 2 ? i != 3 ? i != 4 ? "UNRECOGNIZED" : "PROFILE_ACTION_REVOKE" : "PROFILE_ACTION_SHARE" : "PROFILE_ACTION_UNKNOWN";
    }

    public static int b(int i) {
        return i - 2;
    }

    public static int c(int i) {
        if (i == 0) {
            return 2;
        }
        if (i != 1) {
            return i != 2 ? 0 : 4;
        }
        return 3;
    }
}
