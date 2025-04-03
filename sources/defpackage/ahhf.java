package defpackage;

import com.google.android.apps.messaging.label.settings.MessageOrganizationSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ahhf extends aktz {
    private boolean K = false;

    public ahhf() {
        y(new ahhe(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        MessageOrganizationSettingsActivity messageOrganizationSettingsActivity = (MessageOrganizationSettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        messageOrganizationSettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        messageOrganizationSettingsActivity.u = (cwqc) akgbVar.e.b();
        messageOrganizationSettingsActivity.v = akgbVar.g;
        messageOrganizationSettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        messageOrganizationSettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        messageOrganizationSettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        messageOrganizationSettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        messageOrganizationSettingsActivity.A = akkpVar.DA;
        messageOrganizationSettingsActivity.B = akkpVar.ft;
        messageOrganizationSettingsActivity.C = akisVar.cT;
        messageOrganizationSettingsActivity.D = akgbVar.j;
        messageOrganizationSettingsActivity.E = (elbx) akisVar.aJ.b();
        messageOrganizationSettingsActivity.F = akgbVar.e;
        ((cwqd) messageOrganizationSettingsActivity).H = akgbVar.c.bn;
        messageOrganizationSettingsActivity.I = akgbVar.b.a.Sa;
        messageOrganizationSettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) messageOrganizationSettingsActivity).n = akgbVar.b.a.RR;
    }
}
