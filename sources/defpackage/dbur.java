package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
class dbur implements ejwd<eixz> {
    final /* synthetic */ dbuw a;

    public dbur(dbuw dbuwVar) {
        this.a = dbuwVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        ensk j = dbuw.a.j();
        j.Y(ente.a, "BugleGDitto");
        ((enrr) ((enrr) ((enrr) j).g(th)).h("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer$2", "onError", (char) 229, "GaiaPairingSettingsFragmentPeer.java")).q("Failed to retrieve Gaia sign in status");
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        boolean equals = ((eixz) obj).k.equals("pseudonymous");
        dbuw dbuwVar = this.a;
        TextView textView = (TextView) dbuwVar.c.N().findViewById(R.id.instruction_list_item_step_one);
        TextView textView2 = (TextView) dbuwVar.c.N().findViewById(R.id.instruction_list_item_step_two);
        TextView textView3 = (TextView) dbuwVar.c.N().findViewById(R.id.instruction_list_item_step_three);
        View findViewById = dbuwVar.c.N().findViewById(R.id.instruction_list_item_one);
        if (!equals) {
            findViewById.setVisibility(8);
            textView2.setText(dbuwVar.g.getResources().getString(R.string.instruction_how_to_pair_step_one));
            textView3.setText(dbuwVar.g.getResources().getString(R.string.instruction_how_to_pair_step_two));
        } else {
            findViewById.setVisibility(0);
            textView.setText(dbuwVar.g.getResources().getString(R.string.instruction_how_to_pair_step_one));
            textView2.setText(dbuwVar.g.getResources().getString(R.string.instruction_how_to_pair_step_two));
            textView3.setText(dbuwVar.g.getResources().getString(R.string.instruction_how_to_pair_step_three));
        }
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }
}
