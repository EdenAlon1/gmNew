package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgdm {
    public static final fgho a = new fgho("NONE");
    public static final fgho b = new fgho("PENDING");

    public static final fgcm a(Object obj) {
        if (obj == null) {
            obj = fgfg.a;
        }
        return new fgdl(obj);
    }

    public static final ffxx b(fgdj fgdjVar, ffhd ffhdVar, int i, int i2) {
        boolean z = ffso.a;
        return (((i < 0 || i >= 2) && i != -2) || i2 != 2) ? fgcu.c(fgdjVar, ffhdVar, i, i2) : fgdjVar;
    }
}
