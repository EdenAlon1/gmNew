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
public final class egpu extends egpr {
    public egpw b;
    public egbx c;
    public dvyc d;
    public egrf e;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(true != fdrm.l() ? R.layout.photo_picker_infinite_scroll_layout : R.layout.photo_picker_infinite_scroll_layout_art_style, viewGroup, false);
        this.d.b.a(89727).b(inflate);
        kvo.r(inflate, Y(R.string.op3_choose_photo));
        if (fdrm.h()) {
            kvd.k(inflate, new kud() { // from class: egps
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
        materialToolbar.w(R.string.op3_choose_photo);
        this.e.k(this);
        materialToolbar.t(new View.OnClickListener() { // from class: egpt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                egpu.this.e.l();
            }
        });
        this.c.a(Q(), (RecyclerView) this.Q.findViewById(R.id.photo_picker_recycler_grid), (LinearProgressIndicator) this.Q.findViewById(R.id.photo_picker_loading_view), this.b, emux.a, 11);
    }

    @Override // defpackage.egpr, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.a) {
            return;
        }
        fazg.a(this);
    }
}
