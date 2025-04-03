package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzqh {
    public static /* synthetic */ String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "CHIPS_ONLY" : "RICH_TEXT" : "CUSTOM" : "TEXT" : "UNSUPPORTED";
    }

    public static int b(int i) {
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i != 3) {
            return i != 4 ? 1 : 5;
        }
        return 4;
    }
}
