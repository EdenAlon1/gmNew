package defpackage;

import android.os.Build;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class donm {
    public static final hik a = new hgq(hla.a, new ffix() { // from class: donl
        @Override // defpackage.ffix
        public final Object invoke() {
            hik hikVar = donm.a;
            return donm.a(dwjz.a, false, false);
        }
    });

    public static final donk a(dwjy dwjyVar, boolean z, boolean z2) {
        long f;
        long e;
        long f2;
        long j;
        dwjyVar.getClass();
        long j2 = dwjyVar.W;
        long a2 = doni.a(dwjyVar.V);
        long a3 = doni.a(j2);
        long j3 = dwjyVar.a;
        long j4 = dwjyVar.Y;
        long j5 = dwjyVar.P;
        long j6 = dwjyVar.g;
        long j7 = dwjyVar.ac;
        long j8 = dwjyVar.e;
        long j9 = dwjyVar.p;
        donh donhVar = new donh(j8, j9, j7, j9, j6, j9, a2, a3, j3, j4, j5);
        dooo doooVar = doop.a;
        dwjyVar.getClass();
        long c = iby.c(kps.e(iby.b(dwjyVar.S), iby.b(dwjyVar.R), 0.4f));
        float[] fArr = new float[3];
        long j10 = dwjyVar.R;
        kps.j(iby.b(j10), fArr);
        float max = Math.max(fArr[2], 0.9f);
        donf donfVar = new donf(dong.a(j10, max), dong.a(c, (-0.04f) + max), dong.a(dwjyVar.S, max - 0.06f));
        long j11 = dwjyVar.s;
        long d = iby.d(4294756660L);
        long d2 = iby.d(4294372010L);
        long d3 = iby.d(4280229663L);
        long j12 = ibw.d;
        f = iby.f(ibw.d(j11), ibw.c(j11), ibw.b(j11), 0.6f, ibw.f(j11));
        long j13 = dwjyVar.W;
        long d4 = iby.d(4293542709L);
        long j14 = ibw.d;
        long e2 = iby.e(PrivateKeyType.INVALID, 0, 0, 10);
        long j15 = ibw.d;
        long d5 = iby.d(4284441448L);
        e = iby.e(252, 238, 238, PrivateKeyType.INVALID);
        long d6 = iby.d(4292339455L);
        long d7 = iby.d(4291290367L);
        long d8 = iby.d(4292666111L);
        long d9 = iby.d(4285746081L);
        long d10 = iby.d(4291607039L);
        long d11 = iby.d(4289842940L);
        long d12 = iby.d(4280229663L);
        long d13 = iby.d(4282549748L);
        long d14 = iby.d(4288377547L);
        long d15 = iby.d(4292437360L);
        f2 = iby.f(ibw.d(j13), ibw.c(j13), ibw.b(j13), 0.52f, ibw.f(j13));
        long d16 = iby.d(4280192574L);
        long d17 = iby.d(4292423717L);
        long j16 = dwjyVar.a;
        if (z2) {
            j = Build.VERSION.SDK_INT >= 34 ? dwjyVar.c : dwjyVar.v;
        } else {
            j = j16;
        }
        long j17 = dwjyVar.b;
        long j18 = dwjyVar.a;
        long j19 = dwjyVar.p;
        return new donk(dwjyVar, donhVar, doooVar, donfVar, d, j19, d2, j19, d3, j12, f, false, z, d4, j14, e2, j15, d5, e, d6, d7, d8, d9, d10, d11, d13, d14, d15, d12, f2, d16, j18, d17, j16, j17, j);
    }
}
