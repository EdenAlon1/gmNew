package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckki {
    public final ffbr a;
    public final ffbr b;
    public final ffsk c;
    public final ffbr d;

    public ckki(ffbr ffbrVar, ffbr ffbrVar2, ffsk ffskVar, ffbr ffbrVar3) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        ffbrVar3.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffskVar;
        this.d = ffbrVar3;
    }

    public static final int a(Integer num) {
        if (num != null && num.intValue() == 2) {
            return 4;
        }
        if (num != null && num.intValue() == 1) {
            return 3;
        }
        return (num != null && num.intValue() == 0) ? 2 : 1;
    }
}
