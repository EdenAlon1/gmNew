package com.google.android.libraries.mdi.download.debug.sting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.dwub;
import defpackage.dwyh;
import defpackage.dwyu;
import defpackage.dwyv;
import defpackage.dwyw;
import defpackage.dwyx;
import defpackage.dxag;
import defpackage.emud;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class MddDebugInfoFragment extends dxag {
    public dwyh a;
    public dwub b;
    private dwyv c;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dwyw dwywVar = this.c.b;
        View inflate = layoutInflater.inflate(R.layout.mdd_debug_info_fragment, viewGroup, false);
        ((TextView) inflate.findViewById(R.id.debug_info)).setText(String.valueOf(((dwyx) dwywVar).a.k()).concat("\n==== END MDD DEBUG INFO ====\n\n"));
        return inflate;
    }

    @Override // defpackage.ea
    public final void ah(Menu menu, MenuInflater menuInflater) {
        dwyw dwywVar = this.c.b;
        menuInflater.inflate(R.menu.debug_info_fragment_options_menu, menu);
        final dwyu dwyuVar = (dwyu) ((dwyx) dwywVar).b;
        menu.findItem(R.id.dump_info_option).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: dwys
            public final /* synthetic */ String b = "MDD.DEBUG.LOG_INFO_ACTION";

            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                dwyu dwyuVar2 = dwyu.this;
                dwyuVar2.d.c(emud.a(dwyuVar2.c.e()), dwyuVar2.e, this.b);
                return true;
            }
        });
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        av(true);
        dwyu dwyuVar = new dwyu(this, this.a);
        dwyv dwyvVar = new dwyv(new dwyx(this.b, dwyuVar), dwyuVar);
        this.c = dwyvVar;
        dwyu dwyuVar2 = (dwyu) dwyvVar.a;
        dwyuVar2.d = emud.b(dwyuVar2.b);
        dwyuVar2.d.d(R.id.debug_info_fragment_action_callback, dwyuVar2.e);
    }
}
