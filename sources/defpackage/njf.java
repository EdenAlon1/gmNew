package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class njf extends nji {
    public static final byte[] a = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] o = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean p;

    public static boolean d(luv luvVar, byte[] bArr) {
        if (luvVar.b() < 8) {
            return false;
        }
        int i = luvVar.b;
        byte[] bArr2 = new byte[8];
        luvVar.F(bArr2, 0, 8);
        luvVar.K(i);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // defpackage.nji
    protected final long a(luv luvVar) {
        byte[] bArr = luvVar.a;
        return f(ndj.b(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0));
    }

    @Override // defpackage.nji
    protected final void b(boolean z) {
        super.b(z);
        if (z) {
            this.p = false;
        }
    }

    @Override // defpackage.nji
    protected final boolean c(luv luvVar, long j, njg njgVar) {
        if (d(luvVar, a)) {
            byte[] copyOf = Arrays.copyOf(luvVar.a, luvVar.c);
            int i = copyOf[9] & 255;
            List c = ndj.c(copyOf);
            if (njgVar.a == null) {
                lqb lqbVar = new lqb();
                lqbVar.a("audio/ogg");
                lqbVar.c("audio/opus");
                lqbVar.C = i;
                lqbVar.D = 48000;
                lqbVar.p = c;
                njgVar.a = new lqc(lqbVar);
                return true;
            }
        } else {
            if (!d(luvVar, o)) {
                lti.g(njgVar.a);
                return false;
            }
            lti.g(njgVar.a);
            if (!this.p) {
                this.p = true;
                luvVar.L(8);
                lrb b = nea.b(engw.p(nea.c(luvVar, false, false).a));
                if (b != null) {
                    lqc lqcVar = njgVar.a;
                    lqb lqbVar2 = new lqb(lqcVar);
                    lqbVar2.k = b.d(lqcVar.l);
                    njgVar.a = new lqc(lqbVar2);
                }
            }
        }
        return true;
    }
}
