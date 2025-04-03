package defpackage;

import com.google.android.apps.messaging.analytics.consent.LoggingConsentSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class sew extends aktz {
    private boolean K = false;

    public sew() {
        y(new sev(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        LoggingConsentSettingsActivity loggingConsentSettingsActivity = (LoggingConsentSettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        loggingConsentSettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        loggingConsentSettingsActivity.u = (cwqc) akgbVar.e.b();
        loggingConsentSettingsActivity.v = akgbVar.g;
        loggingConsentSettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        loggingConsentSettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        loggingConsentSettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        loggingConsentSettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        loggingConsentSettingsActivity.A = akkpVar.DA;
        loggingConsentSettingsActivity.B = akkpVar.ft;
        loggingConsentSettingsActivity.C = akisVar.cT;
        loggingConsentSettingsActivity.D = akgbVar.j;
        loggingConsentSettingsActivity.E = (elbx) akisVar.aJ.b();
        loggingConsentSettingsActivity.F = akgbVar.e;
        ((cwqd) loggingConsentSettingsActivity).H = akgbVar.c.bn;
        loggingConsentSettingsActivity.I = akgbVar.b.a.Sa;
        loggingConsentSettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) loggingConsentSettingsActivity).n = akgbVar.b.a.RR;
    }
}
