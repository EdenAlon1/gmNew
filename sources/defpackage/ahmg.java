package defpackage;

import android.view.View;
import com.google.android.apps.messaging.lighterconversation.LighterConversationActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahmg implements View.OnClickListener {
    final /* synthetic */ ahmc a;

    public ahmg(ahmc ahmcVar) {
        this.a = ahmcVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a.d.G() instanceof LighterConversationActivity) {
            LighterConversationActivity lighterConversationActivity = (LighterConversationActivity) this.a.d.G();
            lighterConversationActivity.getClass();
            fr a = lighterConversationActivity.H().b.a();
            cg cgVar = new cg(a);
            ea h = a.h("LIGHTER_SETTINGS_FRAGMENT");
            h.getClass();
            cgVar.n(h);
            cgVar.c();
        }
    }
}
