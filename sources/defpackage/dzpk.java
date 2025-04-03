package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzpk {
    public static dzpj r() {
        dzmv dzmvVar = new dzmv();
        dzmvVar.k(false);
        dzmvVar.d(engw.r(Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED)));
        dzmvVar.n(-1L);
        dzmvVar.l(0L);
        dzmvVar.b(new HashMap());
        dzmvVar.o(0L);
        dzmvVar.e(eyee.b);
        dzmvVar.g(0L);
        dzmvVar.m(0L);
        return dzmvVar;
    }

    public abstract long a();

    public abstract long b();

    public abstract long c();

    public abstract long d();

    public abstract long e();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        if (((android.graphics.Bitmap) i().c()).sameAs((android.graphics.Bitmap) r7.i().c()) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r7 != r6) goto L8
            return r1
        L8:
            boolean r2 = r7 instanceof defpackage.dzpk
            if (r2 == 0) goto L118
            dzpk r7 = (defpackage.dzpk) r7
            dzpt r2 = r6.h()
            dzpt r3 = r7.h()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L118
            emxc r2 = r6.l()
            emxc r3 = r7.l()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L118
            emxc r2 = r6.j()
            emxc r3 = r7.j()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L118
            emxc r2 = r6.i()
            boolean r2 = r2.g()
            emxc r3 = r7.i()
            boolean r3 = r3.g()
            if (r2 != r3) goto L118
            emxc r2 = r6.i()
            boolean r2 = r2.g()
            if (r2 == 0) goto L78
            emxc r2 = r7.i()
            boolean r2 = r2.g()
            if (r2 == 0) goto L78
            emxc r2 = r6.i()
            java.lang.Object r2 = r2.c()
            emxc r3 = r7.i()
            java.lang.Object r3 = r3.c()
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            boolean r2 = r2.sameAs(r3)
            if (r2 == 0) goto L118
        L78:
            boolean r2 = r6.q()
            boolean r3 = r7.q()
            if (r2 != r3) goto L118
            long r2 = r6.b()
            long r4 = r7.b()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L118
            boolean r2 = r6.p()
            boolean r3 = r7.p()
            if (r2 != r3) goto L118
            java.util.Map r2 = r6.o()
            java.util.Set r2 = r2.keySet()
            java.util.Map r3 = r7.o()
            java.util.Set r3 = r3.keySet()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L118
            emxc r2 = r6.k()
            emxc r3 = r7.k()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L118
            java.util.Map r2 = r6.o()
            java.util.Set r2 = r2.keySet()
            enfc r2 = defpackage.enfc.d(r2)
            dzpi r3 = new dzpi
            r3.<init>()
            java.lang.Iterable r2 = r2.h()
            boolean r2 = defpackage.enjk.p(r2, r3)
            if (r2 == 0) goto L118
            engw r2 = r6.m()
            engw r3 = r7.m()
            boolean r2 = defpackage.enkr.h(r2, r3)
            if (r2 == 0) goto L118
            long r2 = r6.e()
            long r4 = r7.e()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L118
            long r2 = r6.f()
            long r4 = r7.f()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L118
            eyee r2 = r6.n()
            eyee r3 = r7.n()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L118
            long r2 = r6.a()
            long r4 = r7.a()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L118
            return r1
        L118:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzpk.equals(java.lang.Object):boolean");
    }

    public abstract long f();

    public abstract dzpj g();

    public abstract dzpt h();

    public final int hashCode() {
        int hashCode = ((((h().hashCode() + 527) * 31) + l().hashCode()) * 31) + j().hashCode();
        int i = true != i().g() ? 1237 : 1231;
        int i2 = true != q() ? 1237 : 1231;
        int a = (((((((((((hashCode * 31) + i) * 31) + i2) * 31) + dzph.a(b())) * 31) + (true == p() ? 1231 : 1237)) * 31) + o().keySet().hashCode()) * 31) + k().hashCode();
        Iterator it = o().values().iterator();
        while (true) {
            int i3 = a * 31;
            if (!it.hasNext()) {
                return ((((((((((i3 + m().hashCode()) * 31) + dzph.a(e())) * 31) + dzph.a(f())) * 31) + n().hashCode()) * 31) + dzph.a(a())) * 31) + dzph.a(d());
            }
            a = i3 + Arrays.hashCode((byte[]) it.next());
        }
    }

    public abstract emxc i();

    public abstract emxc j();

    public abstract emxc k();

    public abstract emxc l();

    public abstract engw m();

    public abstract eyee n();

    public abstract Map o();

    public abstract boolean p();

    public abstract boolean q();
}
