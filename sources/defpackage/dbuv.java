package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.gaia.GaiaDittoActivity;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbuv implements ejxk {
    final /* synthetic */ dbuw a;

    public dbuv(dbuw dbuwVar) {
        this.a = dbuwVar;
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
        ensk i = dbuw.a.i();
        i.Y(ente.a, "BugleGDitto");
        ((enrr) ((enrr) ((enrr) i).g(th)).h("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer", "onLoadGaiaPairingSettingsFailure", (char) 493, "GaiaPairingSettingsFragmentPeer.java")).q("Error retrieving Gaia device pairing settings");
        dbuw dbuwVar = this.a;
        dbuwVar.d(true);
        dbuwVar.e();
        ((akzt) dbuwVar.l.b()).e("Bugle.Gaia.Pairing.Loading.Count", 2);
    }

    @Override // defpackage.ejxk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        int i;
        bzkw bzkwVar = (bzkw) obj;
        bzgu bzguVar = bzkwVar.a;
        dbuw dbuwVar = this.a;
        if (bzguVar.c) {
            ensk h = dbuw.a.h();
            h.Y(ente.a, "BugleGDitto");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer", "onLoadGaiaPairingSettingsSuccess", 437, "GaiaPairingSettingsFragmentPeer.java")).q("Gaia device pairing is enabled for the current account");
        } else {
            ensk h2 = dbuw.a.h();
            h2.Y(ente.a, "BugleGDitto");
            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/ui/gaia/GaiaPairingSettingsFragmentPeer", "onLoadGaiaPairingSettingsSuccess", 439, "GaiaPairingSettingsFragmentPeer.java")).q("Gaia device pairing is disabled for the current account");
            if (!bzkwVar.b.a.isEmpty()) {
                dbuwVar.e();
            }
        }
        ea h3 = dbuwVar.c.I().h("gaia_pairing_reset_primary");
        if (h3 == null) {
            eisx eisxVar = dbuwVar.b;
            eisxVar.getClass();
            dbtz dbtzVar = new dbtz();
            fbae.e(dbtzVar);
            ekky.b(dbtzVar, eisxVar);
            if (bzkwVar.d.equals(bzkx.c)) {
                cg cgVar = new cg(dbuwVar.c.I());
                cgVar.t(R.id.reset_primary_fragment_container, dbtzVar, "gaia_pairing_reset_primary");
                cgVar.c();
            }
        } else if (bzkwVar.d.equals(bzkx.b)) {
            cg cgVar2 = new cg(dbuwVar.c.I());
            cgVar2.n(h3);
            cgVar2.c();
        }
        dbuwVar.s = bzkwVar.c;
        dbtw dbtwVar = dbuwVar.t;
        List list = dbuwVar.s;
        list.getClass();
        dbtwVar.g = list;
        dbtwVar.p();
        boolean equals = bzkwVar.d.equals(bzkx.c);
        int size = dbuwVar.s.size();
        View findViewById = dbuwVar.c.N().findViewById(R.id.instruction_list_container);
        View findViewById2 = dbuwVar.c.N().findViewById(R.id.instruction_list);
        View findViewById3 = dbuwVar.c.N().findViewById(R.id.instruction_list_title_container);
        Button button = (Button) dbuwVar.c.N().findViewById(R.id.instruction_list_title);
        ImageView imageView = (ImageView) dbuwVar.c.N().findViewById(R.id.instruction_list_indicator);
        if (size == 0) {
            imageView.setImageResource(R.drawable.quantum_ic_expand_less_vd_theme_24);
            imageView.setImageTintList(ColorStateList.valueOf(ehdr.b(imageView, R.attr.colorPrimary)));
            findViewById2.setVisibility(0);
            button.setTextColor(ehdr.b(button, R.attr.colorPrimary));
            findViewById3.setContentDescription(dbuwVar.g.getResources().getString(R.string.instruction_how_to_pair_expanded_content_description));
            findViewById.setBackgroundResource(true != ((auya) dbuwVar.o.b()).a() ? R.drawable.highlighted_list_background : R.drawable.highlighted_list_background_coolranch);
        } else {
            imageView.setImageResource(R.drawable.quantum_ic_expand_more_vd_theme_24);
            imageView.setImageTintList(ColorStateList.valueOf(ehdr.b(imageView, R.attr.colorOnBackground)));
            findViewById2.setVisibility(8);
            button.setTextColor(ehdr.b(button, R.attr.colorOnBackground));
            findViewById3.setContentDescription(dbuwVar.g.getResources().getString(R.string.instruction_how_to_pair_collapsed_content_description));
            findViewById.setBackgroundResource(true != ((auya) dbuwVar.o.b()).a() ? R.drawable.non_highlighted_list_background : R.drawable.non_highlighted_list_background_coolranch);
        }
        if (equals) {
            imageView.setImageResource(R.drawable.quantum_ic_expand_more_vd_theme_24);
            findViewById2.setVisibility(8);
            findViewById3.setContentDescription(dbuwVar.g.getResources().getString(R.string.instruction_how_to_pair_collapsed_content_description));
        }
        int size2 = dbuwVar.s.size();
        View findViewById4 = dbuwVar.c.N().findViewById(R.id.gaia_paired_desktop_list_container);
        View findViewById5 = dbuwVar.c.N().findViewById(R.id.paired_desktops_list_title_container);
        Button button2 = (Button) dbuwVar.c.N().findViewById(R.id.paired_desktops_list_title);
        Resources resources = dbuwVar.g.getResources();
        Integer valueOf = Integer.valueOf(size2);
        button2.setText(resources.getString(R.string.paired_desktops_title, valueOf));
        View findViewById6 = dbuwVar.c.N().findViewById(R.id.gaia_paired_desktop_item_list_layout);
        ImageView imageView2 = (ImageView) dbuwVar.c.N().findViewById(R.id.paired_desktops_list_indicator);
        TextView textView = (TextView) dbuwVar.c.N().findViewById(R.id.no_paired_devices_text);
        if (size2 > 0) {
            imageView2.setImageResource(R.drawable.quantum_ic_expand_less_vd_theme_24);
            imageView2.setImageTintList(ColorStateList.valueOf(ehdr.b(imageView2, R.attr.colorPrimary)));
            findViewById6.setVisibility(0);
            textView.setVisibility(8);
            button2.setTextColor(ehdr.b(button2, R.attr.colorPrimary));
            findViewById4.setBackgroundResource(true != ((auya) dbuwVar.o.b()).a() ? R.drawable.paired_desktops_background : R.drawable.paired_desktops_background_coolranch);
            findViewById5.setContentDescription(dbuwVar.g.getResources().getString(R.string.paired_desktops_expanded_content_description, valueOf));
        } else {
            imageView2.setImageResource(R.drawable.quantum_ic_expand_more_vd_theme_24);
            imageView2.setImageTintList(ColorStateList.valueOf(ehdr.b(imageView2, R.attr.colorOnBackground)));
            findViewById6.setVisibility(8);
            button2.setTextColor(ehdr.b(button2, R.attr.colorOnBackground));
            findViewById4.setBackgroundResource(true != ((auya) dbuwVar.o.b()).a() ? R.drawable.non_highlighted_list_background : R.drawable.non_highlighted_list_background_coolranch);
            findViewById5.setContentDescription(dbuwVar.g.getResources().getString(R.string.paired_desktops_collapsed_content_description, valueOf));
        }
        if (equals) {
            imageView2.setImageResource(R.drawable.quantum_ic_expand_more_vd_theme_24);
            i = 8;
            findViewById6.setVisibility(8);
        } else {
            i = 8;
        }
        dbuwVar.c.N().findViewById(R.id.unpair_all_devices_button_container).setVisibility(dbuwVar.s.size() == 0 ? i : 0);
        bzhx bzhxVar = bzkwVar.b;
        Toolbar eZ = ((GaiaDittoActivity) dbuwVar.c.fe()).eZ();
        eZ.getClass();
        Bitmap bitmap = bzhxVar.b;
        if (bitmap != null) {
            ekmq.a(dbuwVar.g).c().g(bitmap).R(R.drawable.gm_filled_account_circle_vd_theme_24).A().w(new dbuu(eZ));
        }
        eZ.h().findItem(R.id.avatar).setTitle(bzhxVar.a);
        eZ.h().findItem(R.id.avatar).setTooltipText(bzhxVar.a);
        dbuwVar.d(dbuwVar.s.isEmpty());
        ((akzt) dbuwVar.l.b()).e("Bugle.Gaia.Pairing.Loading.Count", 1);
    }
}
