package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.view.ActionMode;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aedj implements ellh {
    final /* synthetic */ aedh a;

    public aedj(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        aehn aehnVar = (aehn) ellfVar;
        boolean e = aehnVar.e();
        SelectedConversation b = aehnVar.b();
        View a = aehnVar.a();
        MessageIdType d = aehnVar.d();
        bcyl c = aehnVar.c();
        aedh aedhVar = this.a;
        if (((aube) aedhVar.bv.b()).a()) {
            ensk h = aedh.a.h();
            h.Y(ente.a, "HomeFragmentFlogger");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onConversationClick", 3286, "HomeFragmentPeer.java")).E("onConversationClick: key=%s, isLongClick=%s", b.a, e);
        } else {
            csjb a2 = aeaa.a.a();
            a2.I("onConversationClick");
            a2.A("key", b.a);
            a2.B("isLongClick", e);
            a2.r();
        }
        if (crnx.j(aedhVar.b.A())) {
            a.setFocusableInTouchMode(true);
            a.requestFocus();
        }
        if (aedhVar.aN == null) {
            if (e && !aedhVar.D()) {
                aedhVar.n();
            }
            if (aedhVar.D()) {
                czyz k = aedh.k(aedhVar.b.fe());
                HashSet hashSet = aedhVar.aV;
                if (!b.a.b()) {
                    k.b = hashSet;
                    ConversationIdType conversationIdType = b.a;
                    if (k.a.containsKey(conversationIdType)) {
                        k.a.remove(conversationIdType);
                        k.c(false, a);
                    } else {
                        k.a.put(conversationIdType, b);
                        k.c(true, a);
                    }
                    k.d();
                }
                if (aedhVar.aM.a().isPresent()) {
                    ((ActionMode) aedhVar.aM.a().get()).setTitle(((auyb) aedhVar.bz.b()).a() ? Integer.toString(k.a()) : aedhVar.b.B().getQuantityString(R.plurals.selected_count, k.a(), Integer.valueOf(k.a())));
                }
                aedhVar.aM.c();
                ((aehw) aedhVar.p.b()).q(LinearLayoutManager.bv(a) - aedhVar.q.a());
            } else {
                aedh.b(aedhVar.b).o.getClass();
                aedhVar.q(vx.bv(a), b, d, c);
            }
        } else if (!e && !aedhVar.D()) {
            aedh.b(aedhVar.b).o.getClass();
            aedhVar.q(vx.bv(a), b, d, c);
        }
        return elli.a;
    }
}
