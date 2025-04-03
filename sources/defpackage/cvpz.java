package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvpz {
    public static /* synthetic */ String a(int i) {
        return i != 2 ? i != 3 ? i != 4 ? "UNRECOGNIZED" : "UNSTAR" : "STAR" : "UNKNOWN_ACTION";
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
