package defpackage;

import com.google.android.apps.messaging.notifications.settings.NotificationSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aipw extends aktz {
    private boolean K = false;

    public aipw() {
        y(new aipv(this));
    }

    @Override // defpackage.akug, defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.K) {
            return;
        }
        this.K = true;
        NotificationSettingsActivity notificationSettingsActivity = (NotificationSettingsActivity) this;
        akgb akgbVar = (akgb) aX();
        notificationSettingsActivity.t = (cqoh) akgbVar.b.cz.b();
        notificationSettingsActivity.u = (cwqc) akgbVar.e.b();
        notificationSettingsActivity.v = akgbVar.g;
        notificationSettingsActivity.w = (bcqg) akgbVar.b.cZ.b();
        notificationSettingsActivity.x = (crjx) akgbVar.b.a.r.b();
        notificationSettingsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        notificationSettingsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        notificationSettingsActivity.A = akkpVar.DA;
        notificationSettingsActivity.B = akkpVar.ft;
        notificationSettingsActivity.C = akisVar.cT;
        notificationSettingsActivity.D = akgbVar.j;
        notificationSettingsActivity.E = (elbx) akisVar.aJ.b();
        notificationSettingsActivity.F = akgbVar.e;
        ((cwqd) notificationSettingsActivity).H = akgbVar.c.bn;
        notificationSettingsActivity.I = akgbVar.b.a.Sa;
        notificationSettingsActivity.J = (eg) akgbVar.f.b();
        ((aktz) notificationSettingsActivity).n = akgbVar.b.a.RR;
    }
}
