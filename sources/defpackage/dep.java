package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dep extends ffkk implements ffji {
    final /* synthetic */ deq a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dep(deq deqVar) {
        super(1);
        this.a = deqVar;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        long j;
        byte[] bArr;
        ibl iblVar;
        int i;
        float f;
        float f2;
        long f3;
        hxn hxnVar = (hxn) obj;
        if (jzm.d(hxnVar, this.a.b) < 0.0f || iar.b(hxnVar.a()) <= 0.0f) {
            return hxnVar.p(dei.a);
        }
        float min = Math.min(jzq.b(this.a.b, 0.0f) ? 1.0f : (float) Math.ceil(jzm.d(hxnVar, this.a.b)), (float) Math.ceil(iar.b(hxnVar.a()) / 2.0f));
        float f4 = min / 2.0f;
        long floatToRawIntBits = Float.floatToRawIntBits(f4);
        long floatToRawIntBits2 = Float.floatToRawIntBits(f4);
        float intBitsToFloat = Float.intBitsToFloat((int) (hxnVar.a() >> 32)) - min;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (hxnVar.a() & 4294967295L)) - min;
        long floatToRawIntBits3 = Float.floatToRawIntBits(intBitsToFloat);
        long floatToRawIntBits4 = Float.floatToRawIntBits(intBitsToFloat2);
        float f5 = min + min;
        boolean z = true;
        boolean z2 = f5 > iar.b(hxnVar.a());
        icr a = this.a.d.a(hxnVar.a(), hxnVar.q(), hxnVar);
        if (!(a instanceof ico)) {
            long j2 = (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L);
            long j3 = (floatToRawIntBits4 & 4294967295L) | (floatToRawIntBits3 << 32);
            if (!(a instanceof icq)) {
                boolean z3 = z2;
                if (!(a instanceof icp)) {
                    throw new ffcd();
                }
                ibq ibqVar = this.a.c;
                if (z3) {
                    j = 0;
                } else {
                    j = j2;
                    z = false;
                }
                return hxnVar.p(new dej(ibqVar, j, z ? hxnVar.a() : j3, z ? ifu.a : new ifv(min, 0.0f, 0, 0, 30)));
            }
            deq deqVar = this.a;
            ibq ibqVar2 = deqVar.c;
            iao iaoVar = ((icq) a).a;
            if (iap.c(iaoVar)) {
                return hxnVar.p(new den(z2, ibqVar2, iaoVar.e, f4, min, j2, j3, new ifv(min, 0.0f, 0, 0, 30)));
            }
            boolean z4 = z2;
            if (deqVar.a == null) {
                bArr = null;
                deqVar.a = new deh(null);
            } else {
                bArr = null;
            }
            deh dehVar = deqVar.a;
            dehVar.getClass();
            icv a2 = dehVar.a();
            a2.k();
            a2.s(iaoVar);
            if (!z4) {
                ibc ibcVar = new ibc(bArr);
                ibcVar.s(new iao(min, min, iaoVar.b() - min, iaoVar.a() - min, dek.a(iaoVar.e, min), dek.a(iaoVar.f, min), dek.a(iaoVar.g, min), dek.a(iaoVar.h, min)));
                a2.p(a2, ibcVar, 0);
            }
            return hxnVar.p(new deo(a2, ibqVar2));
        }
        deq deqVar2 = this.a;
        ibq ibqVar3 = deqVar2.c;
        ico icoVar = (ico) a;
        if (z2) {
            return hxnVar.p(new del(icoVar, ibqVar3));
        }
        if (ibqVar3 instanceof idl) {
            f3 = iby.f(ibw.d(r6), ibw.c(r6), ibw.b(r6), 1.0f, ibw.f(((idl) ibqVar3).a));
            iblVar = new ibl(f3, 5);
            i = 1;
        } else {
            iblVar = null;
            i = 0;
        }
        iam b = icoVar.a.b();
        if (deqVar2.a == null) {
            deqVar2.a = new deh(null);
        }
        deh dehVar2 = deqVar2.a;
        dehVar2.getClass();
        icv a3 = dehVar2.a();
        a3.k();
        a3.r(b);
        a3.p(a3, icoVar.a, 0);
        fflb fflbVar = new fflb();
        long ceil = ((int) Math.ceil(b.d - b.b)) << 32;
        long ceil2 = ((int) Math.ceil(b.e - b.c)) & 4294967295L;
        deh dehVar3 = deqVar2.a;
        dehVar3.getClass();
        ich ichVar = dehVar3.a;
        ibt ibtVar = dehVar3.b;
        ici iciVar = ichVar != null ? new ici(ichVar.a()) : null;
        if (iciVar == null || !ici.b(iciVar.a, 0)) {
            if (!ici.a(i, ichVar != null ? new ici(ichVar.a()) : null)) {
                z = false;
            }
        }
        long j4 = ceil | ceil2;
        if (ichVar == null || ibtVar == null || Float.intBitsToFloat((int) (hxnVar.a() >> 32)) > ichVar.c() || Float.intBitsToFloat((int) (hxnVar.a() & 4294967295L)) > ichVar.b() || !z) {
            ichVar = icj.a((int) (j4 >> 32), (int) (j4 & 4294967295L), i);
            dehVar3.a = ichVar;
            ibtVar = iav.b(ichVar);
            dehVar3.b = ibtVar;
        }
        ich ichVar2 = ichVar;
        ibt ibtVar2 = ibtVar;
        ifm ifmVar = dehVar3.c;
        if (ifmVar == null) {
            ifmVar = new ifm();
            dehVar3.c = ifmVar;
        }
        long d = kag.d(j4);
        kah q = hxnVar.q();
        ifk ifkVar = ifmVar.a;
        jzn jznVar = ifkVar.a;
        kah kahVar = ifkVar.b;
        ibt ibtVar3 = ifkVar.c;
        long j5 = ifkVar.d;
        ifkVar.a = hxnVar;
        ifkVar.b = q;
        ifkVar.c = ibtVar2;
        ifkVar.d = d;
        ibtVar2.l();
        r30.r(ibw.a, 0L, (r20 & 4) != 0 ? ifq.c(ifmVar.b(), 0L) : d, (r20 & 8) != 0 ? 1.0f : 0.0f, (r20 & 16) != 0 ? ifu.a : null, (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? 3 : 0);
        float f6 = -b.b;
        float f7 = -b.c;
        ifmVar.b.c.e(f6, f7);
        float f8 = -f7;
        float f9 = -f6;
        try {
            f2 = f8;
            f = f9;
            try {
                ifq.n(ifmVar, icoVar.a, ibqVar3, 0.0f, new ifv(f5, 0.0f, 0, 0, 30), 52);
                float intBitsToFloat3 = (Float.intBitsToFloat((int) (ifq.b(ifmVar) >> 32)) + 1.0f) / Float.intBitsToFloat((int) (ifq.b(ifmVar) >> 32));
                float intBitsToFloat4 = (Float.intBitsToFloat((int) (ifq.b(ifmVar) & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (ifq.b(ifmVar) & 4294967295L));
                long a4 = ifq.a(ifmVar);
                ifl iflVar = ifmVar.b;
                long a5 = iflVar.a();
                iflVar.b().l();
                ifm ifmVar2 = ifmVar;
                try {
                    iflVar.c.d(intBitsToFloat3, intBitsToFloat4, a4);
                    try {
                        ifq.n(ifmVar2, a3, ibqVar3, 0.0f, null, 28);
                        iflVar.b().j();
                        iflVar.h(a5);
                        ifmVar2.b.c.e(f, f2);
                        ibtVar2.j();
                        ifk ifkVar2 = ifmVar2.a;
                        ifkVar2.a = jznVar;
                        ifkVar2.b = kahVar;
                        ifkVar2.c = ibtVar3;
                        ifkVar2.d = j5;
                        ichVar2.d();
                        fflbVar.a = ichVar2;
                        return hxnVar.p(new dem(b, fflbVar, j4, iblVar));
                    } catch (Throwable th) {
                        th = th;
                        iflVar.b().j();
                        iflVar.h(a5);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                ifmVar.b.c.e(f, f2);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            f = f9;
            f2 = f8;
        }
    }
}
