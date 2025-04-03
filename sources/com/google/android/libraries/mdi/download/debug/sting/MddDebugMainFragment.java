package com.google.android.libraries.mdi.download.debug.sting;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.messaging.R;
import defpackage.cg;
import defpackage.dwyh;
import defpackage.dwyy;
import defpackage.dwzu;
import defpackage.dwzy;
import defpackage.dwzz;
import defpackage.dxaa;
import defpackage.dxab;
import defpackage.dxac;
import defpackage.dxad;
import defpackage.dxai;
import defpackage.dxak;
import defpackage.emud;
import defpackage.enrr;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class MddDebugMainFragment extends dxai {
    public dwyh a;
    private dxab b;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dxac dxacVar = this.b.b;
        View inflate = layoutInflater.inflate(R.layout.mdd_debug_container_fragment, viewGroup, false);
        if (bundle == null) {
            try {
                dxak dxakVar = new dxak();
                cg cgVar = new cg(((dxad) dxacVar).b.I());
                cgVar.s(R.id.file_group_list_container, dxakVar);
                cgVar.c();
            } catch (RuntimeException e) {
                ((enrr) ((enrr) ((enrr) dxad.a.j()).g(e)).h("com/google/android/libraries/mdi/download/debug/common/filegroups/MddDebugMainFragmentUiProviderImpl", "setupView", '5', "MddDebugMainFragmentUiProviderImpl.java")).q("Unable to add list fragment");
            }
        }
        Button button = (Button) inflate.findViewById(R.id.clear_storage);
        dxad dxadVar = (dxad) dxacVar;
        dwzu dwzuVar = dxadVar.c;
        dwzz c = dxaa.c();
        ((dwyy) c).a = "MDD.DEBUG.CLEAR_ACTION";
        final dxaa a = c.a();
        final dwzy dwzyVar = (dwzy) dwzuVar;
        button.setOnClickListener(new View.OnClickListener() { // from class: dwzw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dwzy dwzyVar2 = dwzy.this;
                emud emudVar = dwzyVar2.c;
                dxaa dxaaVar = a;
                emudVar.c(emud.a(dwzyVar2.a(dxaaVar)), dwzyVar2.d, dxaaVar);
            }
        });
        Button button2 = (Button) inflate.findViewById(R.id.refresh_file_groups);
        dwzu dwzuVar2 = dxadVar.c;
        dwzz c2 = dxaa.c();
        ((dwyy) c2).a = "MDD.DEBUG.REFRESH_ACTION";
        final dxaa a2 = c2.a();
        final dwzy dwzyVar2 = (dwzy) dwzuVar2;
        button2.setOnClickListener(new View.OnClickListener() { // from class: dwzw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dwzy dwzyVar22 = dwzy.this;
                emud emudVar = dwzyVar22.c;
                dxaa dxaaVar = a2;
                emudVar.c(emud.a(dwzyVar22.a(dxaaVar)), dwzyVar22.d, dxaaVar);
            }
        });
        return inflate;
    }

    @Override // defpackage.ea
    public final void ah(Menu menu, MenuInflater menuInflater) {
        dxac dxacVar = this.b.b;
        SubMenu addSubMenu = menu.addSubMenu("Run MDD Task...");
        MenuItem add = addSubMenu.add("Maintenance Task");
        dxad dxadVar = (dxad) dxacVar;
        dwzu dwzuVar = dxadVar.c;
        dwzz c = dxaa.c();
        dwyy dwyyVar = (dwyy) c;
        dwyyVar.a = "MDD.DEBUG.TRIGGER_MDD_ACTION";
        dwyyVar.b = "MDD.MAINTENANCE.PERIODIC.GCM.TASK";
        final dxaa a = c.a();
        final dwzy dwzyVar = (dwzy) dwzuVar;
        add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: dwzv
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                dwzy dwzyVar2 = dwzy.this;
                emud emudVar = dwzyVar2.c;
                dxaa dxaaVar = a;
                emudVar.c(emud.a(dwzyVar2.a(dxaaVar)), dwzyVar2.d, dxaaVar);
                return true;
            }
        });
        MenuItem add2 = addSubMenu.add("Charging Task");
        dwzu dwzuVar2 = dxadVar.c;
        dwzz c2 = dxaa.c();
        dwyy dwyyVar2 = (dwyy) c2;
        dwyyVar2.a = "MDD.DEBUG.TRIGGER_MDD_ACTION";
        dwyyVar2.b = "MDD.CHARGING.PERIODIC.TASK";
        final dxaa a2 = c2.a();
        final dwzy dwzyVar2 = (dwzy) dwzuVar2;
        add2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: dwzv
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                dwzy dwzyVar22 = dwzy.this;
                emud emudVar = dwzyVar22.c;
                dxaa dxaaVar = a2;
                emudVar.c(emud.a(dwzyVar22.a(dxaaVar)), dwzyVar22.d, dxaaVar);
                return true;
            }
        });
        MenuItem add3 = addSubMenu.add("Cellular Charging Task");
        dwzu dwzuVar3 = dxadVar.c;
        dwzz c3 = dxaa.c();
        dwyy dwyyVar3 = (dwyy) c3;
        dwyyVar3.a = "MDD.DEBUG.TRIGGER_MDD_ACTION";
        dwyyVar3.b = "MDD.CELLULAR.CHARGING.PERIODIC.TASK";
        final dxaa a3 = c3.a();
        final dwzy dwzyVar3 = (dwzy) dwzuVar3;
        add3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: dwzv
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                dwzy dwzyVar22 = dwzy.this;
                emud emudVar = dwzyVar22.c;
                dxaa dxaaVar = a3;
                emudVar.c(emud.a(dwzyVar22.a(dxaaVar)), dwzyVar22.d, dxaaVar);
                return true;
            }
        });
        MenuItem add4 = addSubMenu.add("Wifi Charging Task");
        dwzu dwzuVar4 = dxadVar.c;
        dwzz c4 = dxaa.c();
        dwyy dwyyVar4 = (dwyy) c4;
        dwyyVar4.a = "MDD.DEBUG.TRIGGER_MDD_ACTION";
        dwyyVar4.b = "MDD.WIFI.CHARGING.PERIODIC.TASK";
        final dxaa a4 = c4.a();
        final dwzy dwzyVar4 = (dwzy) dwzuVar4;
        add4.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: dwzv
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                dwzy dwzyVar22 = dwzy.this;
                emud emudVar = dwzyVar22.c;
                dxaa dxaaVar = a4;
                emudVar.c(emud.a(dwzyVar22.a(dxaaVar)), dwzyVar22.d, dxaaVar);
                return true;
            }
        });
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        av(true);
        dwzy dwzyVar = new dwzy(this, this.a);
        dxab dxabVar = new dxab(new dxad(this, dwzyVar), dwzyVar);
        this.b = dxabVar;
        dwzy dwzyVar2 = (dwzy) dxabVar.a;
        dwzyVar2.c = emud.b(dwzyVar2.b);
        dwzyVar2.c.d(R.id.main_fragment_action_callback, dwzyVar2.d);
    }
}
