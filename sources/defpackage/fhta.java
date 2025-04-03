package defpackage;

import java.security.SecureRandom;
import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fhta {
    protected static final fhsx[] a = new fhsx[0];
    public final fhsu b;
    protected final fhsx c;
    protected final fhsx d;
    protected final fhsx[] e;
    public Hashtable f = null;

    protected fhta(fhsu fhsuVar, fhsx fhsxVar, fhsx fhsxVar2, fhsx[] fhsxVarArr) {
        this.b = fhsuVar;
        this.c = fhsxVar;
        this.d = fhsxVar2;
        this.e = fhsxVarArr;
    }

    public abstract boolean a();

    public boolean b() {
        throw null;
    }

    public fhsx c() {
        throw null;
    }

    public abstract fhta d(fhta fhtaVar);

    public abstract fhta e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fhta) {
            return m((fhta) obj);
        }
        return false;
    }

    public abstract fhta f();

    protected final int g() {
        return this.b.h;
    }

    public final fhsx h() {
        l();
        return this.c;
    }

    public final int hashCode() {
        int i = ~this.b.hashCode();
        if (n()) {
            return i;
        }
        fhta j = j();
        return (i ^ (j.c.hashCode() * 17)) ^ (j.c().hashCode() * 257);
    }

    protected final fhta i(fhsx fhsxVar, fhsx fhsxVar2) {
        fhsx fhsxVar3 = this.d;
        return new fhsz(this.b, this.c.h(fhsxVar), fhsxVar3.h(fhsxVar2));
    }

    public final fhta j() {
        int g;
        if (!n() && (g = g()) != 0 && g != 5) {
            fhsx p = p();
            if (!p.n()) {
                AtomicReference atomicReference = fhpy.a;
                fhpx fhpxVar = fhpy.b;
                while (!atomicReference.compareAndSet(null, fhpxVar) && atomicReference.get() == null) {
                }
                fhpx fhpxVar2 = (fhpx) fhpy.a.get();
                if (fhpxVar2.a.get() == null) {
                    fhpxVar2.a.set(new SecureRandom());
                }
                SecureRandom secureRandom = (SecureRandom) fhpxVar2.a.get();
                fhsu fhsuVar = this.b;
                int i = ((fhst) fhsuVar).a;
                fhss fhssVar = (fhss) fhsuVar;
                fhsx h = fhssVar.c(fhss.a(secureRandom, i)).h(fhssVar.c(fhss.a(secureRandom, i)));
                return k(p.h(h).g().h(h));
            }
        }
        return this;
    }

    final fhta k(fhsx fhsxVar) {
        int g = g();
        if (g != 1) {
            if (g == 2 || g == 3 || g == 4) {
                fhsx k = fhsxVar.k();
                return i(k, k.h(fhsxVar));
            }
            if (g != 6) {
                throw new IllegalStateException("not a projective coordinate system");
            }
        }
        return i(fhsxVar, fhsxVar);
    }

    protected final void l() {
        if (!o()) {
            throw new IllegalStateException("point not in normal form");
        }
    }

    public final boolean m(fhta fhtaVar) {
        if (fhtaVar != null) {
            fhsu fhsuVar = this.b;
            boolean n = n();
            fhsu fhsuVar2 = fhtaVar.b;
            boolean n2 = fhtaVar.n();
            if (!n && !n2) {
                if (!fhsuVar.g(fhsuVar2)) {
                    return false;
                }
                fhta[] fhtaVarArr = new fhta[2];
                fhtaVarArr[0] = this;
                fhtaVarArr[1] = fhsuVar.f(fhtaVar);
                for (int i = 0; i < 2; i++) {
                    fhta fhtaVar2 = fhtaVarArr[i];
                    if (fhtaVar2 != null && fhsuVar != fhtaVar2.b) {
                        throw new IllegalArgumentException("'points' entries must be null or on this curve");
                    }
                }
                int i2 = fhsuVar.h;
                if (i2 != 0 && i2 != 5) {
                    fhsx[] fhsxVarArr = new fhsx[2];
                    int[] iArr = new int[2];
                    int i3 = 0;
                    for (int i4 = 0; i4 < 2; i4++) {
                        fhta fhtaVar3 = fhtaVarArr[i4];
                        if (fhtaVar3 != null && !fhtaVar3.o()) {
                            fhsxVarArr[i3] = fhtaVar3.p();
                            iArr[i3] = i4;
                            i3++;
                        }
                    }
                    if (i3 != 0) {
                        fhsx[] fhsxVarArr2 = new fhsx[i3];
                        fhsxVarArr2[0] = fhsxVarArr[0];
                        int i5 = 0;
                        while (true) {
                            int i6 = i5 + 1;
                            if (i6 >= i3) {
                                break;
                            }
                            fhsxVarArr2[i6] = fhsxVarArr2[i5].h(fhsxVarArr[i6]);
                            i5 = i6;
                        }
                        fhsx g = fhsxVarArr2[i5].g();
                        while (i5 > 0) {
                            int i7 = i5 - 1;
                            fhsx fhsxVar = fhsxVarArr[i5];
                            fhsxVarArr[i5] = fhsxVarArr2[i7].h(g);
                            g = g.h(fhsxVar);
                            i5 = i7;
                        }
                        fhsxVarArr[0] = g;
                        for (int i8 = 0; i8 < i3; i8++) {
                            int i9 = iArr[i8];
                            fhtaVarArr[i9] = fhtaVarArr[i9].k(fhsxVarArr[i8]);
                        }
                    }
                }
                fhta fhtaVar4 = fhtaVarArr[0];
                fhta fhtaVar5 = fhtaVarArr[1];
                return fhtaVar4.c.equals(fhtaVar5.c) && fhtaVar4.c().equals(fhtaVar5.c());
            }
            if (n && n2 && fhsuVar.g(fhsuVar2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean n() {
        if (this.c == null || this.d == null) {
            return true;
        }
        fhsx[] fhsxVarArr = this.e;
        return fhsxVarArr.length > 0 && fhsxVarArr[0].o();
    }

    public final boolean o() {
        int g = g();
        return g == 0 || g == 5 || n() || this.e[0].n();
    }

    public final fhsx p() {
        fhsx[] fhsxVarArr = this.e;
        if (fhsxVarArr.length <= 0) {
            return null;
        }
        return fhsxVarArr[0];
    }

    public final String toString() {
        if (n()) {
            return "INF";
        }
        StringBuffer stringBuffer = new StringBuffer("(");
        stringBuffer.append(this.c);
        stringBuffer.append(',');
        stringBuffer.append(this.d);
        for (int i = 0; i < this.e.length; i++) {
            stringBuffer.append(',');
            stringBuffer.append(this.e[i]);
        }
        stringBuffer.append(')');
        return stringBuffer.toString();
    }
}
