package defpackage;

import android.content.Context;
import android.view.ScaleGestureDetector;
import com.google.android.apps.messaging.conversation.messagelist.MessageListRecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uum implements ejwd<cymp> {
    final /* synthetic */ uuy a;

    public uum(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        csjy.p("Bugle", th, "Error getting conversation scale enabled state");
        uuy uuyVar = this.a;
        MessageListRecyclerView messageListRecyclerView = uuyVar.az;
        if (messageListRecyclerView == null) {
            return;
        }
        ea eaVar = uuyVar.e;
        uvr H = messageListRecyclerView.H();
        Context z = eaVar.z();
        z.getClass();
        H.a = new ScaleGestureDetector(z, (ScaleGestureDetector.OnScaleGestureListener) this.a.H.b());
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cymp cympVar = (cymp) obj;
        MessageListRecyclerView messageListRecyclerView = this.a.az;
        if (messageListRecyclerView == null) {
            return;
        }
        if (!cympVar.d) {
            messageListRecyclerView.H().a = null;
            return;
        }
        uvr H = messageListRecyclerView.H();
        Context z = this.a.e.z();
        z.getClass();
        H.a = new ScaleGestureDetector(z, (ScaleGestureDetector.OnScaleGestureListener) this.a.H.b());
    }

    @Override // defpackage.ejwd
    public final void hB() {
    }
}
