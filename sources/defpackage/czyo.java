package defpackage;

import com.google.android.apps.messaging.ui.conversationlist.ForwardMessageActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class czyo extends cwps {
    private boolean n = false;

    public czyo() {
        y(new czyn(this));
    }

    @Override // defpackage.cwqf
    protected final void B() {
        if (this.n) {
            return;
        }
        this.n = true;
        ForwardMessageActivity forwardMessageActivity = (ForwardMessageActivity) this;
        akgb akgbVar = (akgb) aX();
        forwardMessageActivity.t = (cqoh) akgbVar.b.cz.b();
        forwardMessageActivity.u = (cwqc) akgbVar.e.b();
        forwardMessageActivity.v = akgbVar.g;
        forwardMessageActivity.w = (bcqg) akgbVar.b.cZ.b();
        forwardMessageActivity.x = (crjx) akgbVar.b.a.r.b();
        forwardMessageActivity.y = akgbVar.h;
        forwardMessageActivity.z = akgbVar.b.b.nH;
    }
}
