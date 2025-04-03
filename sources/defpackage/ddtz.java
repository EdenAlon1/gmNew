package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ddtz extends ehbo {
    public boolean ao = false;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        final View inflate = layoutInflater.inflate(aV(), viewGroup, false);
        Dialog dialog = this.d;
        dialog.getClass();
        dialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ddtw
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                View findViewById = ((ehbn) dialogInterface).findViewById(R.id.design_bottom_sheet);
                findViewById.getClass();
                Context context = findViewById.getContext();
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.zero_state_search_location_dialog_height) + ddzb.b(context);
                findViewById.getLayoutParams().height = dimensionPixelSize;
                BottomSheetBehavior.v(findViewById).C(dimensionPixelSize);
                findViewById.requestLayout();
                final ddtz ddtzVar = ddtz.this;
                ddtzVar.aY().i().f(ddtzVar, new llh() { // from class: ddtx
                    @Override // defpackage.llh
                    public final void a(Object obj) {
                        ddtz ddtzVar2 = ddtz.this;
                        if (ddtzVar2.ao || !ddtzVar2.bb()) {
                            return;
                        }
                        ddtzVar2.ao = true;
                        ddtzVar2.aY().g().l(ddtzVar2);
                        ddtzVar2.aY().i().l(ddtzVar2);
                    }
                });
                ddtzVar.aY().g().f(ddtzVar, new llh() { // from class: ddty
                    @Override // defpackage.llh
                    public final void a(Object obj) {
                        ddtz ddtzVar2 = ddtz.this;
                        if (ddtzVar2.ao || !ddtzVar2.bb()) {
                            return;
                        }
                        ddtzVar2.ao = true;
                        ddtzVar2.aY().g().l(ddtzVar2);
                        ddtzVar2.aY().i().l(ddtzVar2);
                    }
                });
                ddtzVar.aZ(inflate);
            }
        });
        return inflate;
    }

    public abstract int aV();

    public abstract ddqu aY();

    public abstract void aZ(View view);

    public abstract boolean bb();

    @Override // defpackage.dn, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        aY().u(null);
    }
}
