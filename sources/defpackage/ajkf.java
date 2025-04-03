package defpackage;

import com.google.android.apps.messaging.privacy.etouffeetoggle.EtouffeeToggleActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ajkf extends aktz {
    private boolean K = false;

    public ajkf() {
        y(new ajke(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        EtouffeeToggleActivity etouffeeToggleActivity = (EtouffeeToggleActivity) this;
        akgb akgbVar = (akgb) aX();
        etouffeeToggleActivity.t = (cqoh) akgbVar.b.cz.b();
        etouffeeToggleActivity.u = (cwqc) akgbVar.e.b();
        etouffeeToggleActivity.v = akgbVar.g;
        etouffeeToggleActivity.w = (bcqg) akgbVar.b.cZ.b();
        etouffeeToggleActivity.x = (crjx) akgbVar.b.a.r.b();
        etouffeeToggleActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        etouffeeToggleActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        etouffeeToggleActivity.A = akkpVar.DA;
        etouffeeToggleActivity.B = akkpVar.ft;
        etouffeeToggleActivity.C = akisVar.cT;
        etouffeeToggleActivity.D = akgbVar.j;
        etouffeeToggleActivity.E = (elbx) akisVar.aJ.b();
        etouffeeToggleActivity.F = akgbVar.e;
        ((cwqd) etouffeeToggleActivity).H = akgbVar.c.bn;
        etouffeeToggleActivity.I = akgbVar.b.a.Sa;
        etouffeeToggleActivity.J = (eg) akgbVar.f.b();
        ((aktz) etouffeeToggleActivity).n = akgbVar.b.a.RR;
    }
}
