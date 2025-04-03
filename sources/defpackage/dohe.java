package defpackage;

import android.graphics.Paint;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dohe implements ffjn {
    final /* synthetic */ eey a;
    final /* synthetic */ dohg b;
    final /* synthetic */ ffji c;
    final /* synthetic */ ffix d;

    public dohe(eey eeyVar, dohg dohgVar, ffji ffjiVar, ffix ffixVar) {
        this.a = eeyVar;
        this.b = dohgVar;
        this.c = ffjiVar;
        this.d = ffixVar;
    }

    @Override // defpackage.ffjn
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        final long f;
        Object obj4;
        final hho hhoVar;
        final boolean z;
        final eey eeyVar;
        ffix ffixVar;
        final float f2;
        ils ilsVar;
        float f3;
        boolean z2;
        hvi hviVar = (hvi) obj;
        hfd hfdVar = (hfd) obj2;
        ((Number) obj3).intValue();
        hviVar.getClass();
        hfdVar.v(1208236223);
        Object f4 = hfdVar.f();
        if (f4 == hfc.a) {
            f4 = hgs.a(ffhe.a, hfdVar);
            hfdVar.y(f4);
        }
        final ffsk ffskVar = (ffsk) f4;
        hfdVar.v(665917764);
        Object f5 = hfdVar.f();
        if (f5 == hfc.a) {
            Object hicVar = new hic(new iar((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), hla.a);
            hfdVar.y(hicVar);
            f5 = hicVar;
        }
        hho hhoVar2 = (hho) f5;
        hfdVar.o();
        hfdVar.v(665919772);
        Object f6 = hfdVar.f();
        if (f6 == hfc.a) {
            Object hicVar2 = new hic(Float.valueOf(0.0f), hla.a);
            hfdVar.y(hicVar2);
            f6 = hicVar2;
        }
        final hho hhoVar3 = (hho) f6;
        hfdVar.o();
        hfdVar.v(665921725);
        Object f7 = hfdVar.f();
        if (f7 == hfc.a) {
            Object hicVar3 = new hic(false, hla.a);
            hfdVar.y(hicVar3);
            f7 = hicVar3;
        }
        hho hhoVar4 = (hho) f7;
        hfdVar.o();
        boolean z3 = this.a.i() || ((Boolean) hhoVar4.a()).booleanValue();
        hfdVar.v(1139304201);
        float floatValue = ((Number) cxo.c(true != z3 ? 0.0f : 1.0f, cxu.c(true != z3 ? 500 : 150, true != z3 ? 1000 : 0, null, 4), null, hfdVar, 0, 28).a()).floatValue();
        hfdVar.o();
        hfdVar.v(665934794);
        f = iby.f(ibw.d(r3), ibw.c(r3), ibw.b(r3), 0.38f, ibw.f(gft.a(hfdVar).q));
        hfdVar.o();
        hfdVar.v(665938229);
        final long j = gft.a(hfdVar).q;
        hfdVar.o();
        hfdVar.v(665941275);
        final long j2 = gft.a(hfdVar).a;
        hfdVar.o();
        hfdVar.v(665944276);
        final long j3 = gft.a(hfdVar).a;
        hfdVar.o();
        hfdVar.v(665947194);
        final long j4 = gft.a(hfdVar).b;
        hfdVar.o();
        final hho hhoVar5 = hhoVar4;
        boolean z4 = hfdVar.e(jdr.j) == kah.b;
        Object e = hfdVar.e(jdr.e);
        eey eeyVar2 = this.a;
        final dohg dohgVar = this.b;
        boolean z5 = z4;
        final ffji ffjiVar = this.c;
        ffix ffixVar2 = this.d;
        final jzn jznVar = (jzn) e;
        hfdVar.v(-643454658);
        boolean D = hfdVar.D(eeyVar2) | hfdVar.A(floatValue) | hfdVar.A(2.0f) | hfdVar.D(dohgVar) | hfdVar.A(4.0f) | hfdVar.C(j) | hfdVar.C(j2) | hfdVar.C(f) | hfdVar.C(j3) | hfdVar.C(j4) | hfdVar.E(z5) | hfdVar.D(ffjiVar);
        Object f8 = hfdVar.f();
        if (D || f8 == hfc.a) {
            hhoVar = hhoVar2;
            z = z5;
            eeyVar = eeyVar2;
            ffixVar = ffixVar2;
            f2 = floatValue;
            ilsVar = null;
            obj4 = new ffji() { // from class: dohb
                @Override // defpackage.ffji
                public final Object invoke(Object obj5) {
                    ifo ifoVar = (ifo) obj5;
                    ifoVar.getClass();
                    hho hhoVar6 = hho.this;
                    if (!iar.f(((iar) hhoVar6.a()).a, ifoVar.b())) {
                        hhoVar6.b(new iar(ifoVar.b()));
                    }
                    dohg dohgVar2 = dohgVar;
                    hho hhoVar7 = hhoVar5;
                    eey eeyVar3 = eeyVar;
                    ifoVar.p();
                    boolean booleanValue = ((Boolean) hhoVar7.a()).booleanValue();
                    eei eeiVar = (eei) ffdx.M(eeyVar3.d().i());
                    if (eeiVar != null) {
                        float f9 = f2;
                        if (eeyVar3.i() || booleanValue || f9 > 0.0f) {
                            Float f10 = dohgVar2.a;
                            hho hhoVar8 = hhoVar3;
                            float intBitsToFloat = Float.intBitsToFloat((int) (ifoVar.b() & 4294967295L));
                            float em = ifoVar.em(2.0f);
                            float f11 = intBitsToFloat - (em + em);
                            int d = eeyVar3.d().d() - eeyVar3.d().i().size();
                            hhoVar8.b(Float.valueOf(Math.max(f10.floatValue() * f11, (f11 * f11) / (((eeyVar3.d().e() - eeyVar3.d().f()) / eeyVar3.d().i().size()) * r6))));
                            float f12 = d > 0 ? eeiVar.a / d : 1.0f;
                            boolean z6 = z;
                            float em2 = (f11 + ifoVar.em(2.0f)) - ((Number) hhoVar8.a()).floatValue();
                            float em3 = z6 ? ifoVar.em(1.0f) + (ifoVar.em(2.0f) / 2.0f) : ((Float.intBitsToFloat((int) (ifoVar.b() >> 32)) - ifoVar.em(2.0f)) - ifoVar.em(1.0f)) - (ifoVar.em(2.0f) / 2.0f);
                            long j5 = f;
                            float em4 = ifoVar.em(2.0f);
                            long floatToRawIntBits = Float.floatToRawIntBits(em3);
                            long floatToRawIntBits2 = Float.floatToRawIntBits(em4);
                            float em5 = ifoVar.em(2.0f);
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (ifoVar.b() & 4294967295L));
                            float em6 = ifoVar.em(2.0f);
                            float f13 = intBitsToFloat2 - (em6 + em6);
                            long floatToRawIntBits3 = Float.floatToRawIntBits(em5);
                            long floatToRawIntBits4 = Float.floatToRawIntBits(f13);
                            float em7 = ifoVar.em(1.0f);
                            ifq.k(ifoVar, j5, (floatToRawIntBits << 32) | (floatToRawIntBits2 & 4294967295L), (floatToRawIntBits3 << 32) | (floatToRawIntBits4 & 4294967295L), (Float.floatToRawIntBits(ifoVar.em(1.0f)) & 4294967295L) | (Float.floatToRawIntBits(em7) << 32), null, f9, 208);
                            float em8 = z6 ? ifoVar.em(1.0f) : (Float.intBitsToFloat((int) (ifoVar.b() >> 32)) - ifoVar.em(4.0f)) - ifoVar.em(1.0f);
                            ffji ffjiVar2 = ffjiVar;
                            long j6 = j2;
                            long j7 = j;
                            float f14 = f12 * em2;
                            if (true != booleanValue) {
                                j6 = j7;
                            }
                            long floatToRawIntBits5 = Float.floatToRawIntBits(em8);
                            float em9 = ifoVar.em(4.0f);
                            float floatValue2 = ((Number) hhoVar8.a()).floatValue();
                            long floatToRawIntBits6 = Float.floatToRawIntBits(floatValue2) & 4294967295L;
                            float em10 = ifoVar.em(2.0f);
                            long j8 = j6;
                            ifq.k(ifoVar, j8, (floatToRawIntBits5 << 32) | (Float.floatToRawIntBits(f14) & 4294967295L), (Float.floatToRawIntBits(em9) << 32) | floatToRawIntBits6, (Float.floatToRawIntBits(ifoVar.em(2.0f)) & 4294967295L) | (Float.floatToRawIntBits(em10) << 32), null, f9, 208);
                            String str = (String) ffjiVar2.invoke(eeiVar);
                            if (booleanValue && str != null) {
                                long j9 = j4;
                                float el = ifoVar.el(kal.c(45));
                                Paint paint = new Paint();
                                paint.setTextAlign(Paint.Align.CENTER);
                                paint.setTextSize(el);
                                paint.setColor(iby.b(j9));
                                paint.setAntiAlias(true);
                                float em11 = ifoVar.em(8.0f);
                                float em12 = ifoVar.em(16.0f);
                                float em13 = ifoVar.em(32.0f);
                                float f15 = el + em12 + em12;
                                float f16 = f15 / 2.0f;
                                float max = Math.max(paint.measureText(str) + em13 + em13, f15);
                                float em14 = ifoVar.em(2.0f);
                                float em15 = z6 ? em8 + ifoVar.em(4.0f) + em11 : (em8 - em11) - max;
                                long j10 = j3;
                                float max2 = Math.max(ifoVar.em(2.0f), (f14 + (((Number) hhoVar8.a()).floatValue() / 2.0f)) - f15);
                                ibc ibcVar = new ibc((byte[]) null);
                                float f17 = em15 + max;
                                float f18 = max2 + f15;
                                long floatToRawIntBits7 = Float.floatToRawIntBits(f16) << 32;
                                long floatToRawIntBits8 = Float.floatToRawIntBits(f16) & 4294967295L;
                                long floatToRawIntBits9 = Float.floatToRawIntBits(f16) << 32;
                                long floatToRawIntBits10 = Float.floatToRawIntBits(f16) & 4294967295L;
                                float f19 = true != z6 ? em14 : f16;
                                long floatToRawIntBits11 = Float.floatToRawIntBits(f19) << 32;
                                long floatToRawIntBits12 = Float.floatToRawIntBits(f19) & 4294967295L;
                                if (true != z6) {
                                    em14 = f16;
                                }
                                ibcVar.s(new iao(em15, max2, f17, f18, floatToRawIntBits8 | floatToRawIntBits7, floatToRawIntBits9 | floatToRawIntBits10, floatToRawIntBits11 | floatToRawIntBits12, (Float.floatToRawIntBits(em14) << 32) | (Float.floatToRawIntBits(em14) & 4294967295L)));
                                ifq.h(ifoVar, ibcVar, j10, null, 60);
                                iav.a(ifoVar.t().b()).drawText(str, em15 + (max / 2.0f), (max2 + f16) - ((paint.descent() + paint.ascent()) / 2.0f), paint);
                            }
                        }
                    }
                    return ffcu.a;
                }
            };
            hhoVar5 = hhoVar5;
            hfdVar.y(obj4);
        } else {
            hhoVar = hhoVar2;
            obj4 = f8;
            z = z5;
            eeyVar = eeyVar2;
            ffixVar = ffixVar2;
            f2 = floatValue;
            ilsVar = null;
        }
        hfdVar.o();
        hvi c = hxs.c(hviVar, (ffji) obj4);
        if (eeyVar.i() || f2 > 0.0f) {
            f3 = 4.0f;
            z2 = true;
        } else {
            f3 = 4.0f;
            z2 = false;
        }
        final float em = jznVar.em(f3) + jznVar.em(24.0f);
        hfdVar.v(-643409063);
        boolean D2 = hfdVar.D(eeyVar) | hfdVar.D(jznVar) | hfdVar.A(2.0f) | hfdVar.F(ffskVar);
        Object f9 = hfdVar.f();
        if (D2 || f9 == hfc.a) {
            final hho hhoVar6 = hhoVar;
            final eey eeyVar3 = eeyVar;
            f9 = new ffji() { // from class: dohc
                @Override // defpackage.ffji
                public final Object invoke(Object obj5) {
                    float floatValue2 = ((Float) obj5).floatValue();
                    eey eeyVar4 = eey.this;
                    int d = eeyVar4.d().d();
                    ffqy.d(ffskVar, null, null, new dohd(eeyVar4, Math.min(Math.max((int) ((floatValue2 * d) / ((Float.intBitsToFloat((int) (((iar) hhoVar6.a()).a & 4294967295L)) - jznVar.em(2.0f)) - ((Number) hhoVar3.a()).floatValue())), 0), d - 1), null), 3);
                    return ffcu.a;
                }
            };
            hfdVar.y(f9);
        }
        final ffji ffjiVar2 = (ffji) f9;
        hfdVar.o();
        final ffix ffixVar3 = ffixVar;
        final hho hhoVar7 = hhoVar;
        final boolean z6 = z;
        final boolean z7 = z2;
        hvi b = iln.b(c, ilsVar, new ffji() { // from class: doha
            /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
            
                if (r3 != 3) goto L31;
             */
            @Override // defpackage.ffji
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r11) {
                /*
                    r10 = this;
                    android.view.MotionEvent r11 = (android.view.MotionEvent) r11
                    r11.getClass()
                    boolean r0 = r1
                    r1 = 0
                    if (r0 != 0) goto Lc
                    goto L9d
                Lc:
                    ffji r0 = r7
                    hho r2 = r5
                    int r3 = r11.getAction()
                    r4 = 1
                    if (r3 == 0) goto L4e
                    if (r3 == r4) goto L39
                    r5 = 2
                    if (r3 == r5) goto L21
                    r11 = 3
                    if (r3 == r11) goto L39
                    goto L9d
                L21:
                    java.lang.Object r2 = r2.a()
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 == 0) goto L9d
                    float r11 = r11.getY()
                    java.lang.Float r11 = java.lang.Float.valueOf(r11)
                    r0.invoke(r11)
                    goto L4c
                L39:
                    java.lang.Object r11 = r2.a()
                    java.lang.Boolean r11 = (java.lang.Boolean) r11
                    boolean r11 = r11.booleanValue()
                    if (r11 == 0) goto L9d
                    java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
                    r2.b(r11)
                L4c:
                    r1 = r4
                    goto L9d
                L4e:
                    float r3 = r4
                    hho r5 = r3
                    boolean r6 = r2
                    r7 = 32
                    if (r6 == 0) goto L5a
                    r8 = 0
                    goto L69
                L5a:
                    java.lang.Object r8 = r5.a()
                    iar r8 = (defpackage.iar) r8
                    long r8 = r8.a
                    long r8 = r8 >> r7
                    int r8 = (int) r8
                    float r8 = java.lang.Float.intBitsToFloat(r8)
                    float r8 = r8 - r3
                L69:
                    if (r6 != 0) goto L79
                    java.lang.Object r3 = r5.a()
                    iar r3 = (defpackage.iar) r3
                    long r5 = r3.a
                    long r5 = r5 >> r7
                    int r3 = (int) r5
                    float r3 = java.lang.Float.intBitsToFloat(r3)
                L79:
                    float r5 = r11.getX()
                    int r6 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
                    if (r6 > 0) goto L9d
                    int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                    if (r3 > 0) goto L9d
                    ffix r1 = r6
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
                    r2.b(r3)
                    r1.invoke()
                    float r11 = r11.getY()
                    java.lang.Float r11 = java.lang.Float.valueOf(r11)
                    r0.invoke(r11)
                    goto L4c
                L9d:
                    java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
                    return r11
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.doha.invoke(java.lang.Object):java.lang.Object");
            }
        });
        hfdVar.o();
        return b;
    }
}
