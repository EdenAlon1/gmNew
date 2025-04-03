package defpackage;

import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class achr extends cwqd {
    private boolean n = false;

    public achr() {
        y(new achq(this));
    }

    @Override // defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        DiagnosticsActivity diagnosticsActivity = (DiagnosticsActivity) this;
        akgb akgbVar = (akgb) aX();
        diagnosticsActivity.t = (cqoh) akgbVar.b.cz.b();
        diagnosticsActivity.u = (cwqc) akgbVar.e.b();
        diagnosticsActivity.v = akgbVar.g;
        diagnosticsActivity.w = (bcqg) akgbVar.b.cZ.b();
        diagnosticsActivity.x = (crjx) akgbVar.b.a.r.b();
        diagnosticsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        diagnosticsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        diagnosticsActivity.A = akkpVar.DA;
        diagnosticsActivity.B = akkpVar.ft;
        diagnosticsActivity.C = akisVar.cT;
        diagnosticsActivity.D = akgbVar.j;
        diagnosticsActivity.E = (elbx) akisVar.aJ.b();
        diagnosticsActivity.F = akgbVar.e;
        ((cwqd) diagnosticsActivity).H = akgbVar.c.bn;
        diagnosticsActivity.I = akgbVar.b.a.Sa;
        diagnosticsActivity.J = (eg) akgbVar.f.b();
    }
}
