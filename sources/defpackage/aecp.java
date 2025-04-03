package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aecp implements ejlr<eyjv<aenu>, List<String>> {
    final /* synthetic */ aedh a;

    public aecp(aedh aedhVar) {
        this.a = aedhVar;
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        final List list = (List) obj2;
        final aenu aenuVar = (aenu) ((eyjv) obj).a(aenu.a, eyfc.a());
        final boolean z = aenuVar.c;
        final Runnable runnable = new Runnable() { // from class: aecn
            @Override // java.lang.Runnable
            public final void run() {
                engw e = bdgq.e(list);
                byyt byytVar = z ? byyt.UNARCHIVED : byyt.ARCHIVED;
                eoko b = eoko.b(aenuVar.d);
                if (b == null) {
                    b = eoko.UNKNOWN_BUGLE_CONVERSATION_ORIGIN;
                }
                aedh aedhVar = aecp.this.a;
                csvs.c(aedhVar.C.a(e, byytVar, b, aedhVar.al), "Bugle", "HomeFragmentPeer: failed to undo changes to conversations archive status");
            }
        };
        int i = true != z ? R.plurals.unarchived_toast_message : R.plurals.archived_toast_message;
        int size = list.size();
        String quantityString = this.a.b.B().getQuantityString(i, size, Integer.valueOf(size));
        Snackbar r = Snackbar.r(aedh.f(this.a.b), quantityString, 0);
        r.t(this.a.b.A().getResources().getString(R.string.snack_bar_undo), new View.OnClickListener() { // from class: aeco
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                runnable.run();
            }
        });
        r.n(this.a.ac.g());
        r.i();
        ((adzb) this.a.aC.b()).a(quantityString);
        eoko b = eoko.b(aenuVar.d);
        if (b == null) {
            b = eoko.UNKNOWN_BUGLE_CONVERSATION_ORIGIN;
        }
        if (b != eoko.CONVERSATION_FROM_LIST_SWIPE) {
            this.a.o();
        }
    }

    @Override // defpackage.ejlr
    public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
        if (!((aube) this.a.bv.b()).a()) {
            aeaa.a.s("Failed to change the archive status of conversations", th);
            return;
        }
        ensk j = aedh.a.j();
        j.Y(ente.a, "HomeFragmentFlogger");
        ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/home/HomeFragmentPeer$21", "onFailure", (char) 4028, "HomeFragmentPeer.java")).q("Failed to change the archive status of conversations");
    }

    @Override // defpackage.ejlr
    public final /* synthetic */ void b(Object obj) {
    }
}
