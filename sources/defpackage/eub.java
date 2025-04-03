package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eub {
    public static final void a(hvi hviVar, fhi fhiVar, ffjm ffjmVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-20551815);
        if (i3 == 0) {
            i2 = (true != b.D(hviVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.F(fhiVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffjmVar) ? 128 : 256;
        }
        if (b.J((i2 & 147) != 146, i2 & 1)) {
            int i4 = huo.a;
            ipn a = dyc.a(hum.a, true);
            int a2 = hey.a(b);
            hfm hfmVar = (hfm) b;
            hqb ai = hfmVar.ai();
            hvi b2 = huz.b(b, hviVar);
            int i5 = ist.a;
            ffix ffixVar = iss.a;
            b.x();
            if (hfmVar.z) {
                b.j(ffixVar);
            } else {
                b.z();
            }
            hlc.b(b, a, iss.e);
            hlc.b(b, ai, iss.d);
            ffjm ffjmVar2 = iss.f;
            if (hfmVar.z || !ffkj.e(hfmVar.R(), Integer.valueOf(a2))) {
                Integer valueOf = Integer.valueOf(a2);
                hfmVar.ad(valueOf);
                b.h(valueOf, ffjmVar2);
            }
            hlc.b(b, b2, iss.c);
            esr.c(fhiVar, ffjmVar, b, (i2 >> 3) & 126);
            b.n();
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new etq(hviVar, fhiVar, ffjmVar, i);
        }
    }

    public static final void b(fhi fhiVar, boolean z, hfd hfdVar, int i) {
        int i2;
        exq d;
        jpg jpgVar;
        eva evaVar;
        int i3 = i & 6;
        hfd b = hfdVar.b(626339208);
        if (i3 == 0) {
            i2 = (true != b.F(fhiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != b.E(z) ? 16 : 32;
        }
        if (!b.J((i2 & 19) != 18, i2 & 1)) {
            b.s();
        } else if (z) {
            b.v(-1290871266);
            eva evaVar2 = fhiVar.d;
            jpg jpgVar2 = null;
            if (evaVar2 != null && (d = evaVar2.d()) != null && (jpgVar = d.a) != null && (evaVar = fhiVar.d) != null && !evaVar.l) {
                jpgVar2 = jpgVar;
            }
            if (jpgVar2 == null) {
                b.v(-1290547720);
            } else {
                b.v(-1290547719);
                if (jpm.i(fhiVar.f().c)) {
                    b.v(-1684125606);
                    ((hfm) b).Z();
                } else {
                    b.v(-1685176940);
                    int a = fhiVar.b.a(jpm.e(fhiVar.f().c));
                    int a2 = fhiVar.b.a(jpm.a(fhiVar.f().c));
                    jyi q = jpgVar2.q(a);
                    jyi q2 = jpgVar2.q(Math.max(a2 - 1, 0));
                    eva evaVar3 = fhiVar.d;
                    if (evaVar3 == null || !((Boolean) evaVar3.i.a()).booleanValue()) {
                        b.v(-1684494630);
                        ((hfm) b).Z();
                    } else {
                        b.v(-1684758905);
                        fhm.a(true, q, fhiVar, b, ((i2 << 6) & 896) | 6);
                        ((hfm) b).Z();
                    }
                    eva evaVar4 = fhiVar.d;
                    if (evaVar4 == null || !((Boolean) evaVar4.j.a()).booleanValue()) {
                        b.v(-1684147430);
                        ((hfm) b).Z();
                    } else {
                        b.v(-1684410744);
                        fhm.a(false, q2, fhiVar, b, ((i2 << 6) & 896) | 6);
                        ((hfm) b).Z();
                    }
                    ((hfm) b).Z();
                }
                eva evaVar5 = fhiVar.d;
                if (evaVar5 != null) {
                    if (!ffkj.e(fhiVar.p.a(), fhiVar.f().a())) {
                        evaVar5.m(false);
                    }
                    if (evaVar5.p()) {
                        if (evaVar5.r()) {
                            fhiVar.A();
                        } else {
                            fhiVar.k();
                        }
                    }
                }
            }
            ((hfm) b).Z();
            ((hfm) b).Z();
        } else {
            b.v(651162175);
            ((hfm) b).Z();
            fhiVar.k();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new etr(fhiVar, z, i);
        }
    }

    public static final void c(fhi fhiVar, hfd hfdVar, int i) {
        int i2;
        jlm e;
        hvi c;
        int i3 = i & 6;
        hfd b = hfdVar.b(-1436003720);
        if (i3 == 0) {
            i2 = (true != b.F(fhiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (b.J((i2 & 3) != 2, i2 & 1)) {
            eva evaVar = fhiVar.d;
            if (evaVar == null || !((Boolean) evaVar.k.a()).booleanValue() || (e = fhiVar.e()) == null || e.a() <= 0) {
                b.v(-288579234);
                ((hfm) b).Z();
            } else {
                b.v(-289887155);
                boolean D = b.D(fhiVar);
                hfm hfmVar = (hfm) b;
                Object R = hfmVar.R();
                if (D || R == hfc.a) {
                    R = new fgs(fhiVar);
                    hfmVar.ad(R);
                }
                evy evyVar = (evy) R;
                jzn jznVar = (jzn) b.e(jdr.e);
                int a = fhiVar.b.a(jpm.e(fhiVar.f().c));
                eva evaVar2 = fhiVar.d;
                exq d = evaVar2 != null ? evaVar2.d() : null;
                d.getClass();
                jpg jpgVar = d.a;
                iam n = jpgVar.n(ffmk.i(a, 0, jpgVar.a.a.a()));
                long floatToRawIntBits = (Float.floatToRawIntBits(n.b + (jznVar.em(2.0f) / 2.0f)) << 32) | (4294967295L & Float.floatToRawIntBits(n.e));
                boolean C = b.C(floatToRawIntBits);
                Object R2 = hfmVar.R();
                if (C || R2 == hfc.a) {
                    R2 = new ets(floatToRawIntBits);
                    hfmVar.ad(R2);
                }
                fcu fcuVar = (fcu) R2;
                hve hveVar = hvi.e;
                boolean F = b.F(evyVar) | b.F(fhiVar);
                Object R3 = hfmVar.R();
                if (F || R3 == hfc.a) {
                    R3 = new etx(evyVar, fhiVar);
                    hfmVar.ad(R3);
                }
                hvi a2 = ilv.a(hveVar, evyVar, (PointerInputEventHandler) R3);
                boolean C2 = b.C(floatToRawIntBits);
                Object R4 = hfmVar.R();
                if (C2 || R4 == hfc.a) {
                    R4 = new ety(floatToRawIntBits);
                    hfmVar.ad(R4);
                }
                c = jjs.c(a2, false, (ffji) R4);
                equ.b(fcuVar, c, 0L, b, 0);
                hfmVar.Z();
            }
        } else {
            b.s();
        }
        hio L = b.L();
        if (L != null) {
            L.d = new etz(fhiVar, i);
        }
    }

    public static final void d(eva evaVar) {
        jwj jwjVar = evaVar.c;
        if (jwjVar != null) {
            evaVar.p.invoke(jvu.b(evaVar.b.a, null, 0L, 3));
            while (true) {
                jvw jvwVar = jwjVar.a;
                AtomicReference atomicReference = jvwVar.b;
                if (atomicReference.compareAndSet(jwjVar, null)) {
                    jvwVar.a.f();
                    break;
                } else if (atomicReference.get() != jwjVar) {
                    break;
                }
            }
        }
        evaVar.c = null;
    }

    public static final void e(eva evaVar, jvu jvuVar, jvj jvjVar) {
        jwj jwjVar;
        ioc e;
        long a;
        iam iamVar;
        hrw a2 = hrv.a();
        ffji k = a2 != null ? a2.k() : null;
        hrw b = hrv.b(a2);
        try {
            exq d = evaVar.d();
            if (d != null && (jwjVar = evaVar.c) != null && (e = evaVar.e()) != null) {
                evw evwVar = evaVar.a;
                jpg jpgVar = d.a;
                if (evaVar.p()) {
                    int a3 = jvjVar.a(jpm.c(jvuVar.c));
                    if (a3 < jpgVar.a.a.a()) {
                        iamVar = jpgVar.m(a3);
                    } else if (a3 != 0) {
                        iamVar = jpgVar.m(a3 - 1);
                    } else {
                        a = ewf.a(evwVar.b, evwVar.e, evwVar.f, ewf.a, 1);
                        iamVar = new iam(0.0f, 0.0f, 1.0f, (int) (a & 4294967295L));
                    }
                    long i = e.i((Float.floatToRawIntBits(iamVar.c) & 4294967295L) | (Float.floatToRawIntBits(iamVar.b) << 32));
                    float intBitsToFloat = Float.intBitsToFloat((int) (i >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (i & 4294967295L));
                    iam a4 = ian.a((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), (Float.floatToRawIntBits(iamVar.e - iamVar.c) & 4294967295L) | (Float.floatToRawIntBits(iamVar.d - iamVar.b) << 32));
                    if (jwjVar.a()) {
                        jwjVar.b.b(a4);
                    }
                }
            }
        } finally {
            hrv.e(a2, b, k);
        }
    }

    public static final void f(jvw jvwVar, eva evaVar, jvu jvuVar, juw juwVar, jvj jvjVar) {
        evaVar.c = ewe.c(jvwVar, jvuVar, evaVar.b, juwVar, evaVar.p, evaVar.q);
        e(evaVar, jvuVar, jvjVar);
    }

    public static final boolean g(hkx hkxVar) {
        return ((Boolean) hkxVar.a()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:133:0x026c, code lost:
    
        if (r4 == defpackage.hfc.a) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03ed, code lost:
    
        if (r2.f == r7) goto L211;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x04c2, code lost:
    
        if (r4 > ((r2 != null ? r2.longValue() : 0) + 5000)) goto L247;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05cb  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x063b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x078f  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x07a9  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0822  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0845  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0855  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x090d  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0907  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x07f8  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x026f  */
    /* JADX WARN: Type inference failed for: r80v4 */
    /* JADX WARN: Type inference failed for: r80v5 */
    /* JADX WARN: Type inference failed for: r80v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(defpackage.jvu r65, defpackage.ffji r66, defpackage.hvi r67, defpackage.jpo r68, defpackage.jwn r69, defpackage.ffji r70, defpackage.dwn r71, defpackage.ibq r72, boolean r73, int r74, int r75, defpackage.juw r76, defpackage.euv r77, boolean r78, defpackage.ffjn r79, defpackage.hfd r80, int r81, int r82) {
        /*
            Method dump skipped, instructions count: 2456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eub.h(jvu, ffji, hvi, jpo, jwn, ffji, dwn, ibq, boolean, int, int, juw, euv, boolean, ffjn, hfd, int, int):void");
    }

    public static final void i(eva evaVar, hzi hziVar) {
        if (!evaVar.p()) {
            hziVar.b();
            return;
        }
        jdt jdtVar = evaVar.t;
        if (jdtVar != null) {
            jdtVar.b();
        }
    }
}
