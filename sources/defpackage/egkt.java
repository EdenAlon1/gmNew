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
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egkt extends egkv {
    public lmw a;
    public egrf b;
    public dvyc c;
    public egbx d;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(true != fdrm.l() ? R.layout.photo_picker_infinite_scroll_layout : R.layout.photo_picker_infinite_scroll_layout_art_style, viewGroup, false);
        this.c.b.a(89734).b(inflate);
        kvo.r(inflate, Y(R.string.op3_choose_photo));
        if (fdrm.h()) {
            kvd.k(inflate, new kud() { // from class: egkr
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
        this.b.k(this);
        materialToolbar.t(new View.OnClickListener() { // from class: egks
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                egkt.this.b.l();
            }
        });
        ewiw ewiwVar = (ewiw) ProtoParsers.f(this.m, "clusterKey", ewiw.a, eyfc.a());
        final egkx egkxVar = (egkx) this.a.a(egkx.class);
        String str = ewiwVar.c;
        if (!egkxVar.c.g()) {
            egkxVar.c = emxc.j(str);
            egkxVar.a.p(egkxVar.b.a(str).e, new llh() { // from class: egkw
                @Override // defpackage.llh
                public final void a(Object obj) {
                    egkx.this.a.j((egih) obj);
                }
            });
        }
        this.d.a(Q(), (RecyclerView) this.Q.findViewById(R.id.photo_picker_recycler_grid), (LinearProgressIndicator) this.Q.findViewById(R.id.photo_picker_loading_view), egkxVar, emxc.j(ewiwVar), 8);
    }

    @Override // defpackage.egkv, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.e) {
            return;
        }
        fazg.a(this);
    }
}
