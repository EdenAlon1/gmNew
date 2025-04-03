package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eob implements ipo {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final dqs e;
    public final int f;
    public final int g;
    public final int h;
    public final emu i;
    public final emu j;
    public final float k;
    public final int l;
    public final boolean m;
    public final dvz n;
    public final ffsk o;
    private final ipo p;
    private final boolean q;
    private final List r;
    private final List s;

    public eob(List list, int i, int i2, int i3, dqs dqsVar, int i4, int i5, int i6, emu emuVar, emu emuVar2, float f, int i7, boolean z, dvz dvzVar, ipo ipoVar, boolean z2, List list2, List list3, ffsk ffskVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = dqsVar;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = emuVar;
        this.j = emuVar2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = dvzVar;
        this.p = ipoVar;
        this.q = z2;
        this.r = list2;
        this.s = list3;
        this.o = ffskVar;
    }

    public final int a() {
        return -this.f;
    }

    public final long b() {
        return (k() << 32) | (j() & 4294967295L);
    }

    public final eob c(int i) {
        int i2;
        if (!this.q && !this.a.isEmpty() && this.i != null && (i2 = this.l - i) >= 0) {
            int i3 = this.b + this.c;
            if (i2 < i3) {
                float f = i;
                float f2 = this.k;
                if (this.j != null) {
                    float f3 = f / i3;
                    float f4 = f2 - f3;
                    if (f4 < 0.5f && f4 > -0.5f) {
                        emu emuVar = (emu) ffdx.K(this.a);
                        emu emuVar2 = (emu) ffdx.P(this.a);
                        if (i < 0) {
                            if (Math.min((emuVar.h + i3) - this.f, (emuVar2.h + i3) - this.g) <= (-i)) {
                                return null;
                            }
                        } else if (Math.min(this.f - emuVar.h, this.g - emuVar2.h) <= i) {
                            return null;
                        }
                        List list = this.a;
                        int size = list.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            ((emu) list.get(i4)).a(i);
                        }
                        List list2 = this.r;
                        int size2 = list2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            ((emu) list2.get(i5)).a(i);
                        }
                        List list3 = this.s;
                        int size3 = list3.size();
                        for (int i6 = 0; i6 < size3; i6++) {
                            ((emu) list3.get(i6)).a(i);
                        }
                        return new eob(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k - f3, this.l - i, this.m || i > 0, this.n, this.p, this.q, this.r, this.s, this.o);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.ipo
    public final int j() {
        return this.p.j();
    }

    @Override // defpackage.ipo
    public final int k() {
        return this.p.k();
    }

    @Override // defpackage.ipo
    public final Map m() {
        return this.p.m();
    }

    @Override // defpackage.ipo
    public final ffji n() {
        return this.p.n();
    }

    @Override // defpackage.ipo
    public final void o() {
        this.p.o();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ eob(java.util.List r21, int r22, int r23, int r24, defpackage.dqs r25, int r26, int r27, int r28, defpackage.dvz r29, defpackage.ipo r30, defpackage.ffsk r31) {
        /*
            r20 = this;
            r16 = 0
            ffel r17 = defpackage.ffel.a
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r18 = r17
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r28
            r14 = r29
            r15 = r30
            r19 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eob.<init>(java.util.List, int, int, int, dqs, int, int, int, dvz, ipo, ffsk):void");
    }
}
