package defpackage;

import com.google.android.apps.messaging.ui.conversation.details.ConversationDetailsActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cyom extends cwqd {
    private boolean n = false;

    public cyom() {
        y(new cyol(this));
    }

    @Override // defpackage.cwqj, defpackage.cwqh, defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        ConversationDetailsActivity conversationDetailsActivity = (ConversationDetailsActivity) this;
        akgb akgbVar = (akgb) aX();
        conversationDetailsActivity.t = (cqoh) akgbVar.b.cz.b();
        conversationDetailsActivity.u = (cwqc) akgbVar.e.b();
        conversationDetailsActivity.v = akgbVar.g;
        conversationDetailsActivity.w = (bcqg) akgbVar.b.cZ.b();
        conversationDetailsActivity.x = (crjx) akgbVar.b.a.r.b();
        conversationDetailsActivity.y = akgbVar.h;
        akis akisVar = akgbVar.b;
        conversationDetailsActivity.z = akisVar.b.nH;
        akkp akkpVar = akisVar.a;
        conversationDetailsActivity.A = akkpVar.DA;
        conversationDetailsActivity.B = akkpVar.ft;
        conversationDetailsActivity.C = akisVar.cT;
        conversationDetailsActivity.D = akgbVar.j;
        conversationDetailsActivity.E = (elbx) akisVar.aJ.b();
        conversationDetailsActivity.F = akgbVar.e;
        ((cwqd) conversationDetailsActivity).H = akgbVar.c.bn;
        conversationDetailsActivity.I = akgbVar.b.a.Sa;
        conversationDetailsActivity.J = (eg) akgbVar.f.b();
    }
}
