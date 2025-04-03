package defpackage;

import android.os.Build;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dopk implements ffjq {
    public static final dopk a = new dopk();

    @Override // defpackage.ffjq
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        hfd hfdVar;
        donk a2;
        long f;
        long e;
        long f2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        dwjy dwjyVar = (dwjy) obj2;
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        boolean booleanValue3 = ((Boolean) obj4).booleanValue();
        hfd hfdVar2 = (hfd) obj5;
        ((Number) obj6).intValue();
        dwjyVar.getClass();
        hfdVar2.v(20658371);
        hik hikVar = donm.a;
        if (booleanValue) {
            long j = dwjyVar.m;
            long j2 = dwjyVar.h;
            long j3 = dwjyVar.ae;
            long j4 = dwjyVar.p;
            long j5 = dwjyVar.n;
            long j6 = dwjyVar.X;
            long j7 = dwjyVar.Y;
            float[] fArr = {0.0f, 0.0f, r16};
            kps.j(iby.b(j7), fArr);
            float f3 = fArr[2] + 0.03f;
            if (f3 <= 1.0f) {
                j7 = iby.c(kps.c(fArr));
            }
            donh donhVar = new donh(j, j2, j3, j4, j5, j2, j6, j7, dwjyVar.h, dwjyVar.U, dwjyVar.p);
            long j8 = dwjyVar.aa;
            long j9 = dwjyVar.Z;
            dooo doooVar = doop.b;
            donf donfVar = new donf(iby.c(kps.e(iby.b(j8), iby.b(j9), 0.4f)), iby.c(kps.e(iby.b(dwjyVar.aa), iby.b(dwjyVar.Z), 0.7f)), iby.c(kps.e(iby.b(dwjyVar.aa), iby.b(dwjyVar.Z), 0.8f)));
            long d = iby.d(4294756660L);
            long j10 = dwjyVar.p;
            long d2 = iby.d(4294372010L);
            long j11 = dwjyVar.p;
            long j12 = dwjyVar.s;
            long j13 = dwjyVar.T;
            long d3 = iby.d(4280229663L);
            long j14 = ibw.d;
            f = iby.f(ibw.d(j12), ibw.c(j12), ibw.b(j12), 0.6f, ibw.f(j12));
            long d4 = iby.d(4293814108L);
            long d5 = iby.d(4280295716L);
            long c = iby.c(452114613);
            long d6 = iby.d(4279440148L);
            long d7 = iby.d(4293125091L);
            e = iby.e(96, 20, 16, PrivateKeyType.INVALID);
            long d8 = iby.d(4281230558L);
            long d9 = iby.d(4282159075L);
            long d10 = iby.d(4288183273L);
            long d11 = iby.d(4294306808L);
            long d12 = iby.d(4291607039L);
            long d13 = iby.d(4289842940L);
            long d14 = iby.d(4294306808L);
            long d15 = iby.d(4282549748L);
            long d16 = iby.d(4288377547L);
            long d17 = iby.d(4292437360L);
            f2 = iby.f(ibw.d(j13), ibw.c(j13), ibw.b(j13), 0.52f, ibw.f(j13));
            long d18 = iby.d(4284201332L);
            long d19 = iby.d(4279440148L);
            long d20 = iby.d(4293814108L);
            long d21 = iby.d(4279440148L);
            long j15 = dwjyVar.q;
            hfdVar = hfdVar2;
            a2 = new donk(dwjyVar, donhVar, doooVar, donfVar, d, j10, d2, j11, d3, j14, f, true, booleanValue2, d4, d5, c, d6, d7, e, d8, d9, d10, d11, d12, d13, d15, d16, d17, d14, f2, d18, d19, d20, d21, j15, (!booleanValue3 || Build.VERSION.SDK_INT < 34) ? dwjyVar.J : dwjyVar.n);
        } else {
            hfdVar = hfdVar2;
            a2 = donm.a(dwjyVar, booleanValue2, booleanValue3);
        }
        hfdVar.o();
        return a2;
    }
}
