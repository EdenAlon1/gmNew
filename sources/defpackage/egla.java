package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.progressindicator.LinearProgressIndicator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egla extends eglc {
    public lmw a;
    public egrf b;
    public dvyc c;
    public egbe d;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(true != fdrm.l() ? R.layout.photo_picker_infinite_scroll_layout : R.layout.photo_picker_infinite_scroll_layout_art_style, viewGroup, false);
        if (fdrm.l()) {
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.photo_picker_recycler_grid);
            int dimensionPixelSize = B().getDimensionPixelSize(R.dimen.photo_picker_cluster_horizontal_padding);
            recyclerView.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        }
        this.c.b.a(89733).b(inflate);
        kvo.r(inflate, Y(R.string.op3_picker_browse_face_groups_title));
        if (fdrm.h()) {
            kvd.k(inflate, new kud() { // from class: egkz
                @Override // defpackage.kud
                public final kxh ey(View view, kxh kxhVar) {
                    kpt f = kxhVar.f(519);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    marginLayoutParams.leftMargin = f.b;
                    marginLayoutParams.bottomMargin = f.e;
                    marginLayoutParams.rightMargin = f.d;
                    marginLayoutParams.topMargin = f.c;
                    view.setLayoutParams(marginLayoutParams);
                    return kxh.a;
                }
            });
        }
        return inflate;
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        MaterialToolbar materialToolbar = (MaterialToolbar) this.Q.findViewById(R.id.photo_picker_infinite_scroll_toolbar);
        materialToolbar.w(R.string.op3_picker_browse_face_groups_title);
        this.b.k(this);
        materialToolbar.t(new View.OnClickListener() { // from class: egky
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                egla.this.b.l();
            }
        });
        egle egleVar = (egle) this.a.a(egle.class);
        RecyclerView recyclerView = (RecyclerView) this.Q.findViewById(R.id.photo_picker_recycler_grid);
        LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) this.Q.findViewById(R.id.photo_picker_loading_view);
        egbe egbeVar = this.d;
        ffbr ffbrVar = egbeVar.a;
        lkr Q = Q();
        egav egavVar = (egav) ffbrVar.b();
        egrf egrfVar = (egrf) egbeVar.b.b();
        egrfVar.getClass();
        egdg egdgVar = (egdg) egbeVar.c.b();
        egdgVar.getClass();
        egda egdaVar = (egda) egbeVar.d.b();
        egdaVar.getClass();
        egde egdeVar = (egde) egbeVar.e.b();
        recyclerView.getClass();
        linearProgressIndicator.getClass();
        egleVar.getClass();
        new egbd(egavVar, egrfVar, egdgVar, egdaVar, egdeVar, Q, recyclerView, linearProgressIndicator, egleVar);
    }

    @Override // defpackage.eglc, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.e) {
            return;
        }
        fazg.a(this);
    }
}
