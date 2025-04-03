package defpackage;

import com.google.android.apps.messaging.ui.conversation.message.statuschangelist.MessageStatusListActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class czmk extends cwpv {
    private boolean n = false;

    public czmk() {
        y(new czmj(this));
    }

    @Override // defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        MessageStatusListActivity messageStatusListActivity = (MessageStatusListActivity) this;
        akgb akgbVar = (akgb) aX();
        messageStatusListActivity.t = (cqoh) akgbVar.b.cz.b();
        messageStatusListActivity.u = (cwqc) akgbVar.e.b();
        messageStatusListActivity.v = akgbVar.g;
        messageStatusListActivity.w = (bcqg) akgbVar.b.cZ.b();
        messageStatusListActivity.x = (crjx) akgbVar.b.a.r.b();
        messageStatusListActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        messageStatusListActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        messageStatusListActivity.A = akkpVar.DA;
        messageStatusListActivity.B = akkpVar.ft;
        messageStatusListActivity.C = akisVar.cT;
        messageStatusListActivity.D = akgbVar.j;
        messageStatusListActivity.E = (elbx) akisVar.aJ.b();
        messageStatusListActivity.F = akgbVar.e;
    }
}
