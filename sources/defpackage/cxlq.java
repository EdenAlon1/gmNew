package defpackage;

import com.google.android.apps.messaging.ui.appsettings.verifiedsms.VerifiedSmsSettingsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cxlq extends aktz {
    private boolean K = false;

    public cxlq() {
        y(new cxlp(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        VerifiedSmsSettingsActivity verifiedSmsSettingsActivity = (VerifiedSmsSettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        verifiedSmsSettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        verifiedSmsSettingsActivity.u = (cwqc) akgbVar.e.b();
        verifiedSmsSettingsActivity.v = akgbVar.g;
        verifiedSmsSettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        verifiedSmsSettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        verifiedSmsSettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        verifiedSmsSettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        verifiedSmsSettingsActivity.A = akkpVar.DA;
        verifiedSmsSettingsActivity.B = akkpVar.ft;
        verifiedSmsSettingsActivity.C = akisVar.cT;
        verifiedSmsSettingsActivity.D = akgbVar.j;
        verifiedSmsSettingsActivity.E = (elbx) akisVar.aJ.b();
        verifiedSmsSettingsActivity.F = akgbVar.e;
        ((cwqd) verifiedSmsSettingsActivity).H = akgbVar.c.bn;
        verifiedSmsSettingsActivity.I = akgbVar.b.a.Sa;
        verifiedSmsSettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) verifiedSmsSettingsActivity).n = akgbVar.b.a.RR;
    }
}
