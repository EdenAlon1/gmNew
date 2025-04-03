package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daaj implements aemi {
    public static final entd a = entd.c("Bugle");
    public final elbx b;
    public final ffbr c;
    public final ffsk d;
    public final akzt e;
    public final ejlq f;
    public final AnonymousClass1 g;
    private final Context h;
    private final ffbr i;
    private MenuItem j;
    private ffji k;

    /* JADX WARN: Type inference failed for: r1v1, types: [daaj$1] */
    public daaj(Context context, elbx elbxVar, ffbr ffbrVar, ffsk ffskVar, akzt akztVar, ffbr ffbrVar2, ejlq ejlqVar) {
        elbxVar.getClass();
        ffbrVar.getClass();
        ffskVar.getClass();
        akztVar.getClass();
        ejlqVar.getClass();
        this.h = context;
        this.b = elbxVar;
        this.c = ffbrVar;
        this.d = ffskVar;
        this.e = akztVar;
        this.i = ffbrVar2;
        this.f = ejlqVar;
        this.g = new ejlr<Void, Boolean>() { // from class: daaj.1
            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                if (((Boolean) obj2).booleanValue()) {
                    return;
                }
                daaj.this.g();
            }

            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
                ((ensz) ((ensz) daaj.a.j()).g(th)).q("Failed to leave conversations.");
                daaj.this.g();
            }

            @Override // defpackage.ejlr
            public final /* synthetic */ void b(Object obj) {
            }
        };
    }

    @Override // defpackage.aemi
    public final int a() {
        return R.id.action_leave_group;
    }

    @Override // defpackage.aemi
    public final void b(Menu menu) {
        menu.getClass();
        MenuItem add = menu.add(0, R.id.action_leave_group, 150, this.h.getString(R.string.action_leave_group));
        add.setShowAsAction(0);
        add.setEnabled(false);
        add.setVisible(false);
        this.j = add;
    }

    @Override // defpackage.aemi
    public final void c(Collection collection) {
        a.n().r("%d conversations selected for leave", collection.size());
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (daai.a((SelectedConversation) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((SelectedConversation) obj2).s == 0) {
                arrayList2.add(obj2);
            }
        }
        final ArrayList arrayList3 = new ArrayList(ffdx.n(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(new BugleConversationId(((SelectedConversation) it.next()).a));
        }
        if (arrayList3.isEmpty()) {
            ((ensz) a.j()).q("No RCS group conversations to leave.");
            return;
        }
        boolean z = arrayList3.size() == 1;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(this.h).setTitle(z ? R.string.leave_menu_leave_confirmation_title_single : R.string.leave_menu_leave_confirmation_title_multiple).setMessage(true != z ? R.string.leave_menu_leave_confirmation_text_multiple : R.string.leave_menu_leave_confirmation_text_single).setPositiveButton(R.string.dialog_confirm, new DialogInterface.OnClickListener() { // from class: daaf
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                daaj daajVar = daaj.this;
                List list = arrayList3;
                ekzm b = daajVar.b.b("LeaveGroupMenuExtension#onDialogConfirm");
                try {
                    ejlq ejlqVar = daajVar.f;
                    ffsk ffskVar = daajVar.d;
                    ffhe ffheVar = ffhe.a;
                    ejlqVar.g(new ejlp(fgfz.b(ffskVar, ekxi.a(ffheVar), ffsm.a, new daak(null, daajVar, list))), daajVar.g);
                    ffig.a(b, null);
                } finally {
                }
            }
        }).setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() { // from class: daag
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                daaj.a.n().q("Leave group dialog cancel pressed");
            }
        });
        negativeButton.getClass();
        ((ensz) a.h()).q("Asking user to confirm leaving groups");
        negativeButton.show();
    }

    @Override // defpackage.aemi
    public final void d(final ea eaVar) {
        this.k = new ffji() { // from class: daah
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                cvmt cvmtVar = (cvmt) obj;
                entd entdVar = daaj.a;
                cvmtVar.getClass();
                ellj.f(cvmtVar, ea.this);
                return ffcu.a;
            }
        };
        this.f.k(this.g);
    }

    @Override // defpackage.aemi
    public final void f(Collection collection) {
        MenuItem menuItem = this.j;
        if (menuItem == null) {
            return;
        }
        boolean z = false;
        if (!collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!daai.a((SelectedConversation) it.next())) {
                    break;
                }
            }
        }
        if (!collection.isEmpty()) {
            Iterator it2 = collection.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (((SelectedConversation) it2.next()).s == 0) {
                    z = true;
                    break;
                }
            }
        }
        String string = collection.size() > 1 ? this.h.getString(R.string.action_leave_groups) : this.h.getString(R.string.action_leave_group);
        string.getClass();
        menuItem.setEnabled(z);
        menuItem.setVisible(z);
        menuItem.setTitle(string);
    }

    public final void g() {
        ffji ffjiVar = this.k;
        if (ffjiVar == null) {
            ffkj.c("snackbarEventSender");
            ffjiVar = null;
        }
        Context context = this.h;
        ffjiVar.invoke(new cvms(context.getString(R.string.leave_groups_failure_snackbar_message), context.getString(R.string.leave_groups_failure_snackbar_action_label), new Runnable() { // from class: daae
            @Override // java.lang.Runnable
            public final void run() {
                entd entdVar = daaj.a;
            }
        }));
        adzb adzbVar = (adzb) this.i.b();
        String string = this.h.getString(R.string.leave_groups_failure_snackbar_message);
        string.getClass();
        adzbVar.a(string);
    }

    @Override // defpackage.aemi
    public final /* synthetic */ void e() {
    }
}
