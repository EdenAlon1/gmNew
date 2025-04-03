package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddjs implements aemi, upk {
    private static final cskc a = cskc.f("Bugle", ddjs.class);
    private final ddle b;
    private final adsd c;
    private MenuItem d;

    public ddjs(ddle ddleVar, adsd adsdVar) {
        this.b = ddleVar;
        this.c = adsdVar;
    }

    private static boolean g(Collection collection) {
        return (collection.size() == 1 && ddjr.b() && !ddjr.c()) ? false : true;
    }

    @Override // defpackage.aemi
    public final int a() {
        return R.id.action_set_reminder;
    }

    @Override // defpackage.aemi
    public final void b(Menu menu) {
        MenuItem add = menu.add(0, R.id.action_set_reminder, 110, R.string.action_set_reminder);
        this.d = add;
        add.setShowAsAction(10);
        this.d.setIcon(R.drawable.quantum_ic_alarm_vd_theme_24);
    }

    @Override // defpackage.aemi
    public final void c(Collection collection) {
        if (g(collection)) {
            a.m("Reminder menu icon shouldn't be displayed.");
            return;
        }
        SelectedConversation selectedConversation = (SelectedConversation) collection.iterator().next();
        if (selectedConversation.c.c()) {
            a.m("Msg ID null. Reminder menu icon shouldn't be displayed.");
            return;
        }
        ddln createBuilder = ddlo.a.createBuilder();
        String b = selectedConversation.c.b();
        createBuilder.copyOnWrite();
        ddlo ddloVar = (ddlo) createBuilder.instance;
        b.getClass();
        ddloVar.b |= 2;
        ddloVar.d = b;
        ConversationIdType conversationIdType = selectedConversation.a;
        conversationIdType.getClass();
        String a2 = conversationIdType.a();
        createBuilder.copyOnWrite();
        ddlo ddloVar2 = (ddlo) createBuilder.instance;
        a2.getClass();
        ddloVar2.b |= 4;
        ddloVar2.e = a2;
        long j = selectedConversation.e;
        createBuilder.copyOnWrite();
        ddlo ddloVar3 = (ddlo) createBuilder.instance;
        ddloVar3.b |= 16;
        ddloVar3.g = j;
        boolean z = selectedConversation.e > 0;
        createBuilder.copyOnWrite();
        ddlo ddloVar4 = (ddlo) createBuilder.instance;
        ddloVar4.b |= 8;
        ddloVar4.f = z;
        createBuilder.copyOnWrite();
        ddlo ddloVar5 = (ddlo) createBuilder.instance;
        ddloVar5.h = 9;
        ddloVar5.b |= 32;
        this.b.a(createBuilder.build());
    }

    @Override // defpackage.aemi
    public final void f(Collection collection) {
        if (g(collection)) {
            this.d.setVisible(false);
            return;
        }
        SelectedConversation selectedConversation = (SelectedConversation) collection.iterator().next();
        if (selectedConversation.f.h() || selectedConversation.c.c()) {
            this.d.setVisible(false);
        } else {
            this.d.setVisible(true);
            this.d.setTitle(selectedConversation.e > 0 ? R.string.action_edit_reminder : R.string.action_set_reminder);
        }
    }

    @Override // defpackage.upk
    public final void h(bcse bcseVar) {
        ddln createBuilder = ddlo.a.createBuilder();
        String b = bcseVar.u().b();
        createBuilder.copyOnWrite();
        ddlo ddloVar = (ddlo) createBuilder.instance;
        b.getClass();
        ddloVar.b |= 2;
        ddloVar.d = b;
        String a2 = bcseVar.t().a();
        createBuilder.copyOnWrite();
        ddlo ddloVar2 = (ddlo) createBuilder.instance;
        a2.getClass();
        ddloVar2.b |= 4;
        ddloVar2.e = a2;
        long j = bcseVar.j;
        createBuilder.copyOnWrite();
        ddlo ddloVar3 = (ddlo) createBuilder.instance;
        ddloVar3.b |= 16;
        ddloVar3.g = j;
        boolean aq = bcseVar.aq();
        createBuilder.copyOnWrite();
        ddlo ddloVar4 = (ddlo) createBuilder.instance;
        ddloVar4.b |= 8;
        ddloVar4.f = aq;
        createBuilder.copyOnWrite();
        ddlo ddloVar5 = (ddlo) createBuilder.instance;
        ddloVar5.h = 8;
        ddloVar5.b |= 32;
        this.b.a(createBuilder.build());
        this.c.a(9);
    }

    @Override // defpackage.upk
    public final void b(Menu menu, vyw vywVar) {
        if (vywVar.a() == 1 && ddjr.b()) {
            bcse bcseVar = (bcse) vywVar.b().iterator().next();
            if (bcseVar.aY() || bcseVar.au()) {
                return;
            }
            MenuItem add = menu.add(0, R.id.action_set_reminder, 110, true != bcseVar.aq() ? R.string.action_set_reminder : R.string.action_edit_reminder);
            this.d = add;
            add.setShowAsAction(10);
            this.d.setIcon(R.drawable.quantum_ic_alarm_vd_theme_24);
        }
    }

    @Override // defpackage.aemi
    public final void e() {
    }

    @Override // defpackage.aemi
    public final void d(ea eaVar) {
    }
}
