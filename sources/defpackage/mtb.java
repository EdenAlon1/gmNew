package defpackage;

import android.net.Uri;
import java.util.Map;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mtb implements lwn {
    private final lwn a;
    private final int b;
    private final byte[] c;
    private int d;
    private final mul e;

    public mtb(lwn lwnVar, int i, mul mulVar) {
        lti.a(i > 0);
        this.a = lwnVar;
        this.b = i;
        this.e = mulVar;
        this.c = new byte[1];
        this.d = i;
    }

    @Override // defpackage.lpp
    public final int a(byte[] bArr, int i, int i2) {
        int i3 = this.d;
        if (i3 == 0) {
            int i4 = 0;
            if (this.a.a(this.c, 0, 1) != -1) {
                int i5 = (this.c[0] & PrivateKeyType.INVALID) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int a = this.a.a(bArr2, i4, i6);
                        if (a != -1) {
                            i4 += a;
                            i6 -= a;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        mul mulVar = this.e;
                        luv luvVar = new luv(bArr2, i5);
                        long max = !mulVar.m ? mulVar.j : Math.max(mulVar.n.c(true), mulVar.j);
                        int b = luvVar.b();
                        ndu nduVar = mulVar.l;
                        lti.f(nduVar);
                        nduVar.m(luvVar, b);
                        nduVar.o(max, 1, b, 0, null);
                        mulVar.m = true;
                    }
                }
                i3 = this.b;
                this.d = i3;
            }
            return -1;
        }
        int a2 = this.a.a(bArr, i, Math.min(i3, i2));
        if (a2 != -1) {
            this.d -= a2;
        }
        return a2;
    }

    @Override // defpackage.lwn
    public final long b(lwv lwvVar) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.lwn
    public final Uri c() {
        return this.a.c();
    }

    @Override // defpackage.lwn
    public final void d() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.lwn
    public final Map e() {
        return this.a.e();
    }

    @Override // defpackage.lwn
    public final void f(lxp lxpVar) {
        lti.f(lxpVar);
        this.a.f(lxpVar);
    }
}
