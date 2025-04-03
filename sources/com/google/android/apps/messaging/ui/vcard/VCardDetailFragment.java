package com.google.android.apps.messaging.ui.vcard;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.attachment.VCardAttachmentView;
import com.google.android.apps.messaging.ui.vcard.VCardDetailFragment;
import defpackage.axul;
import defpackage.bcpt;
import defpackage.bcyd;
import defpackage.bcye;
import defpackage.bcyv;
import defpackage.bcyw;
import defpackage.crjb;
import defpackage.csix;
import defpackage.csjy;
import defpackage.ddzb;
import defpackage.ddze;
import defpackage.ddzg;
import defpackage.ddzk;
import defpackage.emxf;
import defpackage.enrr;
import defpackage.ense;
import defpackage.ente;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VCardDetailFragment extends ddze implements bcyv, crjb {
    public final bcpt a = new bcpt();
    public axul ag;
    public ddzb ah;
    private ddzg ai;
    public ExpandableListView b;
    public Uri c;
    public Uri d;
    public bcye e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        csix.l(this.c);
        View inflate = layoutInflater.inflate(R.layout.vcard_detail_fragment, viewGroup, false);
        inflate.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: ddzh
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                view.setPadding(0, windowInsets.getSystemWindowInsetTop(), 0, 0);
                return windowInsets;
            }
        });
        ExpandableListView expandableListView = (ExpandableListView) inflate.findViewById(R.id.list);
        this.b = expandableListView;
        expandableListView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ddzi
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                VCardDetailFragment vCardDetailFragment = VCardDetailFragment.this;
                ExpandableListView expandableListView2 = vCardDetailFragment.b;
                expandableListView2.setIndicatorBounds(expandableListView2.getWidth() - vCardDetailFragment.B().getDimensionPixelSize(R.dimen.vcard_detail_group_indicator_width), vCardDetailFragment.b.getWidth());
            }
        });
        this.b.setOnChildClickListener(new ExpandableListView.OnChildClickListener() { // from class: ddzj
            @Override // android.widget.ExpandableListView.OnChildClickListener
            public final boolean onChildClick(ExpandableListView expandableListView2, View view, int i, int i2, long j) {
                return VCardDetailFragment.this.p(view);
            }
        });
        bcyd a = this.e.a(this.c);
        a.c = this;
        this.a.c(a);
        return inflate;
    }

    @Override // defpackage.bcyv
    public final void a(bcyw bcywVar) {
        this.a.d();
        this.ah.k(R.string.failed_loading_vcard);
        G().finish();
    }

    @Override // defpackage.ea
    public final boolean aM(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_add_contact) {
            return false;
        }
        this.a.d();
        new ddzk(this, ((bcyd) this.a.a()).o()).e(new Void[0]);
        return true;
    }

    @Override // defpackage.ea
    public final void ah(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.vcard_detail_fragment_menu_m2, menu);
        bcpt bcptVar = this.a;
        MenuItem findItem = menu.findItem(R.id.action_add_contact);
        boolean z = false;
        if (bcptVar.g() && ((bcyd) this.a.a()).q()) {
            z = true;
        }
        findItem.setVisible(z);
    }

    @Override // defpackage.ea
    public final void ai() {
        super.ai();
        if (this.a.g()) {
            this.a.f();
        }
        this.b.setAdapter((ExpandableListAdapter) null);
    }

    @Override // defpackage.bcyv
    public final void b(bcyw bcywVar) {
        emxf.a(true);
        this.a.d();
        bcyd bcydVar = (bcyd) bcywVar;
        emxf.a(bcydVar.q());
        ddzg ddzgVar = new ddzg(G(), bcydVar.p(), this, this.b);
        this.ai = ddzgVar;
        this.b.setAdapter(ddzgVar);
        if (this.ai.getGroupCount() == 1) {
            this.b.expandGroup(0);
        }
        G().invalidateOptionsMenu();
    }

    @Override // defpackage.crjb
    public final void c(bcyw bcywVar) {
        try {
            Intent c = bcywVar.c();
            if (c != null) {
                aQ(c);
            }
        } catch (Exception e) {
            enrr enrrVar = (enrr) csjy.a.g();
            enrrVar.Y(ente.a, "Bugle");
            enrrVar.Z(ense.a);
            ((enrr) ((enrr) enrrVar.g(e)).h("com/google/android/apps/messaging/shared/util/common/LogUtil", "v", 223, "LogUtil.java")).t("%s", "VCardDetailFragment: fail to start activity");
        }
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        av(true);
    }

    public final /* synthetic */ boolean p(View view) {
        Intent c;
        if ((view instanceof VCardAttachmentView) && (c = ((bcyw) ((VCardAttachmentView) view).g.a()).c()) != null) {
            try {
                aQ(c);
                return true;
            } catch (ActivityNotFoundException unused) {
            }
        }
        return false;
    }

    @Override // defpackage.crjb
    public final void d() {
    }
}
