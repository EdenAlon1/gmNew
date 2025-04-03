package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.lighterconversation.LighterConversationActivity;
import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahlz implements MenuItem.OnMenuItemClickListener {
    final /* synthetic */ ahma a;

    public ahlz(ahma ahmaVar) {
        this.a = ahmaVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        eg fe = this.a.b.fe();
        if (!(fe instanceof LighterConversationActivity)) {
            return true;
        }
        ahln H = ((LighterConversationActivity) fe).H();
        Intent intent = H.b.getIntent();
        eisx eisxVar = (eisx) intent.getParcelableExtra("account_id");
        if (eisxVar == null) {
            ahln.a.m("Account ID null!");
            H.b.finish();
            return true;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("account_context", intent.getSerializableExtra("account_context"));
        bundle.putSerializable("conversation_id", (Serializable) intent.getParcelableExtra("conversation_id"));
        ahmb ahmbVar = new ahmb();
        fbae.e(ahmbVar);
        ekky.b(ahmbVar, eisxVar);
        ahmbVar.at(bundle);
        cg cgVar = new cg(H.b.a());
        cgVar.t(R.id.lighter_conversation_fragment_container, ahmbVar, "LIGHTER_SETTINGS_FRAGMENT");
        cgVar.c();
        return true;
    }
}
