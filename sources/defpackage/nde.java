package defpackage;

import java.io.EOFException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nde {
    private final luv a = new luv(10);

    public final lrb a(ncp ncpVar, nga ngaVar) {
        lrb lrbVar = null;
        int i = 0;
        while (true) {
            try {
                ncpVar.i(this.a.a, 0, 10);
                this.a.K(0);
                if (this.a.l() != 4801587) {
                    break;
                }
                this.a.L(3);
                int i2 = this.a.i();
                int i3 = i2 + 10;
                if (lrbVar == null) {
                    byte[] bArr = new byte[i3];
                    System.arraycopy(this.a.a, 0, bArr, 0, 10);
                    ncpVar.i(bArr, 10, i2);
                    lrbVar = new ngc(ngaVar).c(bArr, i3);
                } else {
                    ncpVar.g(i2);
                }
                i += i3;
            } catch (EOFException unused) {
            }
        }
        ncpVar.k();
        ncpVar.g(i);
        return lrbVar;
    }
}
