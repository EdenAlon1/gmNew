package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class isa {
    public final isb a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    private isb i;
    public boolean b = true;
    public final Map h = new HashMap();

    public isa(isb isbVar) {
        this.a = isbVar;
    }

    protected abstract int a(iwi iwiVar, imq imqVar);

    protected abstract long b(iwi iwiVar, long j);

    protected abstract Map c(iwi iwiVar);

    public final void d(imq imqVar, int i, iwi iwiVar) {
        long j;
        float f = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        loop0: while (true) {
            j = floatToRawIntBits | floatToRawIntBits2;
            do {
                j = b(iwiVar, j);
                iwiVar = iwiVar.v;
                iwiVar.getClass();
                if (ffkj.e(iwiVar, this.a.i())) {
                    break loop0;
                }
            } while (!c(iwiVar).containsKey(imqVar));
            float a = a(iwiVar, imqVar);
            long floatToRawIntBits3 = Float.floatToRawIntBits(a);
            long floatToRawIntBits4 = Float.floatToRawIntBits(a);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
        float intBitsToFloat = imqVar instanceof inv ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j >> 32));
        Map map = this.h;
        int round = Math.round(intBitsToFloat);
        if (map.containsKey(imqVar)) {
            round = ((Number) imqVar.a.a(Integer.valueOf(((Number) ffew.e(this.h, imqVar)).intValue()), Integer.valueOf(round))).intValue();
        }
        map.put(imqVar, Integer.valueOf(round));
    }

    public final void e() {
        this.b = true;
        isb h = this.a.h();
        if (h == null) {
            return;
        }
        if (this.c) {
            h.m();
        } else if (this.e || this.d) {
            h.l();
        }
        if (this.f) {
            this.a.m();
        }
        if (this.g) {
            this.a.l();
        }
        h.g().e();
    }

    public final void f() {
        this.h.clear();
        this.a.j(new irz(this));
        this.h.putAll(c(this.a.i()));
        this.b = false;
    }

    public final void g() {
        isb isbVar;
        isa g;
        isa g2;
        if (i()) {
            isbVar = this.a;
        } else {
            isb h = this.a.h();
            if (h == null) {
                return;
            }
            isbVar = h.g().i;
            if (isbVar == null || !isbVar.g().i()) {
                isb isbVar2 = this.i;
                if (isbVar2 == null || isbVar2.g().i()) {
                    return;
                }
                isb h2 = isbVar2.h();
                if (h2 != null && (g2 = h2.g()) != null) {
                    g2.g();
                }
                isb h3 = isbVar2.h();
                isbVar = (h3 == null || (g = h3.g()) == null) ? null : g.i;
            }
        }
        this.i = isbVar;
    }

    public final void h() {
        this.b = true;
        this.c = false;
        this.e = false;
        this.d = false;
        this.f = false;
        this.g = false;
        this.i = null;
    }

    public final boolean i() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean j() {
        g();
        return this.i != null;
    }
}
