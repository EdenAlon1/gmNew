package defpackage;

import android.view.KeyEvent;
import androidx.compose.ui.focus.FocusTargetNode;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dse extends dpb implements ijb, ixn, isu {
    private ffjm A;
    private ffjm B;
    private dqq C;
    public final ijj a;
    public final dsp b;
    public final dmt c;
    private dik d;
    private dpq j;
    private final drf k;
    private final dna l;
    private final drr o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [dpq] */
    /* JADX WARN: Type inference failed for: r8v0, types: [dse, isz] */
    public dse(dsg dsgVar, dik dikVar, dpq dpqVar, dqs dqsVar, boolean z, boolean z2, dwn dwnVar, dmk dmkVar) {
        super(drp.a, z, dwnVar, dqsVar);
        this.d = dikVar;
        this.j = dpqVar;
        ijj ijjVar = new ijj();
        this.a = ijjVar;
        drf drfVar = new drf(z);
        M(drfVar);
        this.k = drfVar;
        dna dnaVar = new dna(cxb.a(drp.d));
        this.l = dnaVar;
        dik dikVar2 = this.d;
        ?? r1 = this.j;
        dsp dspVar = new dsp(dsgVar, dikVar2, r1 == 0 ? dnaVar : r1, dqsVar, z2, ijjVar, new dsa(this));
        this.b = dspVar;
        drr drrVar = new drr(dspVar, z);
        this.o = drrVar;
        dmt dmtVar = new dmt(dqsVar, dspVar, z2, dmkVar);
        M(dmtVar);
        this.c = dmtVar;
        M(new ijo(drrVar, ijjVar));
        M(new FocusTargetNode(2, null, 4));
        M(new epm(dmtVar));
        M(new dgj(new drs(this)));
    }

    private final void i() {
        if (this.z) {
            jzn g = isx.g(this);
            this.l.b = cxb.a(g);
        }
    }

    @Override // defpackage.dpb
    public final Object b(ffjm ffjmVar, ffgu ffguVar) {
        dsp dspVar = this.b;
        Object i = dspVar.i(dhy.b, new dru(ffjmVar, dspVar, null), ffguVar);
        return i == ffhh.a ? i : ffcu.a;
    }

    @Override // defpackage.dpb, defpackage.hvh
    public final void dL() {
        dU();
        i();
        dqq dqqVar = this.C;
        if (dqqVar != null) {
            dqqVar.b = isx.g(this);
        }
    }

    @Override // defpackage.hvh
    public final boolean dM() {
        return false;
    }

    @Override // defpackage.ixn
    public final void dO(jkv jkvVar) {
        if (this.g && (this.A == null || this.B == null)) {
            this.A = new dsc(this);
            this.B = new dsd(this, null);
        }
        ffjm ffjmVar = this.A;
        if (ffjmVar != null) {
            ffmx[] ffmxVarArr = jkr.a;
            jku jkuVar = jjl.a;
            jkvVar.e(jjl.d, new jjb(null, ffjmVar));
        }
        ffjm ffjmVar2 = this.B;
        if (ffjmVar2 != null) {
            ffmx[] ffmxVarArr2 = jkr.a;
            jku jkuVar2 = jjl.a;
            jkvVar.e(jjl.e, ffjmVar2);
        }
    }

    @Override // defpackage.hvh
    public final void dT() {
        i();
        dqq dqqVar = this.C;
        if (dqqVar != null) {
            dqqVar.b = isx.g(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.dpb, defpackage.ixl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dV(defpackage.iki r7, defpackage.ikk r8, long r9) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dse.dV(iki, ikk, long):void");
    }

    @Override // defpackage.ixn
    public final /* synthetic */ boolean dZ() {
        return false;
    }

    @Override // defpackage.ixn
    public final /* synthetic */ boolean ea() {
        return false;
    }

    public final void f(dsg dsgVar, dqs dqsVar, dik dikVar, boolean z, boolean z2, dpq dpqVar, dwn dwnVar, dmk dmkVar) {
        boolean z3;
        boolean z4 = false;
        boolean z5 = true;
        if (this.g != z) {
            this.o.a = z;
            this.k.b = z;
            z3 = true;
        } else {
            z3 = false;
        }
        dpq dpqVar2 = dpqVar == null ? this.l : dpqVar;
        dsp dspVar = this.b;
        ijj ijjVar = this.a;
        if (!ffkj.e(dspVar.a, dsgVar)) {
            dspVar.a = dsgVar;
            z4 = true;
        }
        dspVar.b = dikVar;
        if (dspVar.d != dqsVar) {
            dspVar.d = dqsVar;
            z4 = true;
        }
        if (dspVar.e != z2) {
            dspVar.e = z2;
        } else {
            z5 = z4;
        }
        dspVar.c = dpqVar2;
        dspVar.f = ijjVar;
        dmt dmtVar = this.c;
        dmtVar.a = dqsVar;
        dmtVar.c = z2;
        dmtVar.d = dmkVar;
        this.d = dikVar;
        this.j = dpqVar;
        B(drp.a, z, dwnVar, this.b.k() ? dqs.a : dqs.b, z5);
        if (z3) {
            this.A = null;
            this.B = null;
            ixo.a(this);
        }
    }

    @Override // defpackage.dpb
    public final void h(long j) {
        ffqy.d(this.a.f(), null, null, new drw(this, j, null), 3);
    }

    @Override // defpackage.dpb
    public final boolean k() {
        dsp dspVar = this.b;
        if (dspVar.a.i()) {
            return true;
        }
        dik dikVar = dspVar.b;
        return dikVar != null && dikVar.g();
    }

    @Override // defpackage.ijb
    public final boolean u(KeyEvent keyEvent) {
        long floatToRawIntBits;
        int floatToRawIntBits2;
        if (!this.g || ((!iiw.a(iiz.b(keyEvent), iiw.s) && !iiw.a(iiz.b(keyEvent), iiw.r)) || !iiy.a(iiz.a(keyEvent), 2) || keyEvent.isCtrlPressed())) {
            return false;
        }
        if (this.b.k()) {
            float f = (int) (this.c.i & 4294967295L);
            if (!iiw.a(iiz.b(keyEvent), iiw.r)) {
                f = -f;
            }
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits2 = Float.floatToRawIntBits(f);
        } else {
            float f2 = (int) (this.c.i >> 32);
            if (!iiw.a(iiz.b(keyEvent), iiw.r)) {
                f2 = -f2;
            }
            floatToRawIntBits = Float.floatToRawIntBits(f2);
            floatToRawIntBits2 = Float.floatToRawIntBits(0.0f);
        }
        ffqy.d(D(), null, null, new dry(this, (floatToRawIntBits2 & 4294967295L) | (floatToRawIntBits << 32), null), 3);
        return true;
    }

    @Override // defpackage.ijb
    public final boolean v(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.dpb
    public final void g(long j) {
    }
}
