package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.MarkAsReadAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aedq implements bbcb {
    final /* synthetic */ aedr a;

    public aedq(aedr aedrVar) {
        this.a = aedrVar;
    }

    @Override // defpackage.bbcb
    public final /* bridge */ /* synthetic */ void a(bbcd bbcdVar, Action action, Object obj, Object obj2) {
        ((ddzb) this.a.c.b()).k(R.string.mark_all_messages_as_read_confirmation);
        int a = ((MarkAsReadAction) action).t.a("total_messages_marked_as_read");
        csjb a2 = this.a.a.a();
        a2.G(a);
        a2.I(" message(s) marked as read and/or notified");
        a2.r();
    }

    @Override // defpackage.bbcb
    public final /* bridge */ /* synthetic */ void b(bbcd bbcdVar, Object obj, Object obj2) {
        this.a.a.r("Failed to mark all messages as read");
    }
}
