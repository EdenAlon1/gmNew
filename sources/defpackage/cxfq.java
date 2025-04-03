package defpackage;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxfq implements ActionMode.Callback {
    final /* synthetic */ cxfr a;

    public cxfq(cxfr cxfrVar) {
        this.a = cxfrVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_delete_message) {
            return false;
        }
        cxfr cxfrVar = this.a;
        ehft ehftVar = new ehft(cxfrVar.c.G());
        ehftVar.y(cxfrVar.c.B().getQuantityString(R.plurals.delete_message_confirmation_dialog_title, 1, 1));
        ehftVar.m(R.string.delete_message_confirmation_dialog_text);
        ehftVar.t(R.string.delete_message_confirmation_button, new cxfp(cxfrVar));
        ehftVar.o(android.R.string.cancel, null);
        ehftVar.s(new cxfo(cxfrVar));
        ehftVar.create().show();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        cxfr cxfrVar = this.a;
        if (cxfrVar.n == -1) {
            return false;
        }
        cxfrVar.c.G().getMenuInflater().inflate(R.menu.sim_messages_fragment_select_menu, menu);
        View customView = actionMode.getCustomView();
        if (crnx.j(this.a.c.G())) {
            int i = engw.d;
            engr engrVar = new engr();
            engrVar.h(menu.findItem(R.id.action_delete_message));
            engw g = engrVar.g();
            StringBuilder sb = new StringBuilder();
            int i2 = ((enou) g).c;
            for (int i3 = 0; i3 < i2; i3++) {
                MenuItem menuItem = (MenuItem) g.get(i3);
                if (menuItem.isVisible()) {
                    sb.append(menuItem.getTitle());
                    sb.append(" ");
                }
            }
            crnx.k(customView, customView.getContext().getResources().getString(R.string.contextual_action_bar_description_prefix, sb.toString()));
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.a.b(-1);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }
}
