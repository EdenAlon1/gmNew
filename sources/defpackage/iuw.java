package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class iuw extends iuv implements ipl {
    private Map f;
    public final iwi g;
    public long h = 0;
    public final ipc n = new ipc(this);
    public final cog o;
    private ipo p;

    public iuw(iwi iwiVar) {
        this.g = iwiVar;
        int i = cow.a;
        this.o = new cog((byte[]) null);
    }

    public final isb A() {
        ivd ivdVar = this.g.r.y.p;
        ivdVar.getClass();
        return ivdVar;
    }

    public final void B(long j) {
        if (!kaa.f(this.h, j)) {
            this.h = j;
            ivd ivdVar = L().y.p;
            if (ivdVar != null) {
                ivdVar.s();
            }
            T(this.g);
        }
        if (this.k) {
            return;
        }
        P(K());
    }

    public final void C(ipo ipoVar) {
        ffcu ffcuVar;
        Map map;
        if (ipoVar != null) {
            y((ipoVar.k() << 32) | (ipoVar.j() & 4294967295L));
            ffcuVar = ffcu.a;
        } else {
            ffcuVar = null;
        }
        if (ffcuVar == null) {
            y(0L);
        }
        if (!ffkj.e(this.p, ipoVar) && ipoVar != null && ((((map = this.f) != null && !map.isEmpty()) || !ipoVar.m().isEmpty()) && !ffkj.e(ipoVar.m(), this.f))) {
            ((ivd) A()).p.e();
            Map map2 = this.f;
            if (map2 == null) {
                map2 = new LinkedHashMap();
                this.f = map2;
            }
            map2.clear();
            map2.putAll(ipoVar.m());
        }
        this.p = ipoVar;
    }

    public final long D(iuw iuwVar) {
        long j = 0;
        iuw iuwVar2 = this;
        while (!ffkj.e(iuwVar2, iuwVar)) {
            boolean z = iuwVar2.i;
            j = kaa.d(j, iuwVar2.h);
            iwi iwiVar = iuwVar2.g.v;
            iwiVar.getClass();
            iuwVar2 = iwiVar.C();
            iuwVar2.getClass();
        }
        return j;
    }

    @Override // defpackage.iuv
    public final long I() {
        return this.h;
    }

    @Override // defpackage.iuv
    public final ioc J() {
        return this.n;
    }

    @Override // defpackage.iuv
    public final ipo K() {
        ipo ipoVar = this.p;
        if (ipoVar != null) {
            return ipoVar;
        }
        imn.a("LookaheadDelegate has not been measured yet when measureResult is requested.");
        throw new ffbx();
    }

    @Override // defpackage.iuv, defpackage.ivn
    public final iui L() {
        return this.g.r;
    }

    @Override // defpackage.iuv
    public final iuv M() {
        iwi iwiVar = this.g.u;
        if (iwiVar != null) {
            return iwiVar.C();
        }
        return null;
    }

    @Override // defpackage.iuv
    public final iuv N() {
        iwi iwiVar = this.g.v;
        if (iwiVar != null) {
            return iwiVar.C();
        }
        return null;
    }

    @Override // defpackage.iuv
    public final void Q() {
        ee(this.h, 0.0f, null);
    }

    @Override // defpackage.iuv
    public final boolean S() {
        return this.p != null;
    }

    public int a(int i) {
        throw null;
    }

    public int b(int i) {
        throw null;
    }

    public int c(int i) {
        throw null;
    }

    public int d(int i) {
        throw null;
    }

    @Override // defpackage.jzn
    public final float ec() {
        return this.g.ec();
    }

    @Override // defpackage.jzx
    public final float ed() {
        return this.g.ed();
    }

    @Override // defpackage.iqk
    protected final void ee(long j, float f, ffji ffjiVar) {
        B(j);
        if (this.j) {
            return;
        }
        t();
    }

    @Override // defpackage.iuv, defpackage.iny
    public final boolean eu() {
        return true;
    }

    @Override // defpackage.iqk, defpackage.inx
    public final Object f() {
        return this.g.f();
    }

    @Override // defpackage.iny
    public final kah q() {
        return this.g.q();
    }

    protected void t() {
        K().o();
    }

    public final long u() {
        return (this.a << 32) | (this.b & 4294967295L);
    }
}
