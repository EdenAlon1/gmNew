package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nja extends nji {
    private ncz a;
    private niz o;

    private static boolean d(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // defpackage.nji
    protected final long a(luv luvVar) {
        if (!d(luvVar.a)) {
            return -1L;
        }
        int i = (luvVar.a[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int a = ncv.a(luvVar, i);
            luvVar.K(0);
            return a;
        }
        luvVar.L(4);
        luvVar.t();
        int a2 = ncv.a(luvVar, i);
        luvVar.K(0);
        return a2;
    }

    @Override // defpackage.nji
    protected final void b(boolean z) {
        super.b(z);
        if (z) {
            this.a = null;
            this.o = null;
        }
    }

    @Override // defpackage.nji
    protected final boolean c(luv luvVar, long j, njg njgVar) {
        byte[] bArr = luvVar.a;
        ncz nczVar = this.a;
        if (nczVar == null) {
            ncz nczVar2 = new ncz(bArr, 17);
            this.a = nczVar2;
            lqb lqbVar = new lqb(nczVar2.c(Arrays.copyOfRange(bArr, 9, luvVar.c), null));
            lqbVar.a("audio/ogg");
            njgVar.a = new lqc(lqbVar);
            return true;
        }
        if ((bArr[0] & Byte.MAX_VALUE) == 3) {
            ncy b = ncw.b(luvVar);
            ncz e = nczVar.e(b);
            this.a = e;
            this.o = new niz(e, b);
            return true;
        }
        if (!d(bArr)) {
            return true;
        }
        niz nizVar = this.o;
        if (nizVar != null) {
            nizVar.a = j;
            njgVar.b = nizVar;
        }
        lti.f(njgVar.a);
        return false;
    }
}
