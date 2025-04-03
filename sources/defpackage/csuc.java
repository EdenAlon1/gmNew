package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csuc {
    public static int a(long j) {
        if (j <= 0) {
            return 2;
        }
        if (j < 10240) {
            return 3;
        }
        if (j < 102400) {
            return 4;
        }
        if (j < 512000) {
            return 5;
        }
        if (j < 1048576) {
            return 6;
        }
        if (j < 5242880) {
            return 8;
        }
        return j < 10485760 ? 9 : 10;
    }
}
