package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgwp {
    private final ffbr a;
    private final ffbr b;

    public cgwp(ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    public final int a() {
        if (((Long) this.a.b()).longValue() == -1) {
            return 3;
        }
        int b = fgti.b(((Long) this.a.b()).intValue());
        if (b != 0) {
            return b;
        }
        return 3;
    }
}
