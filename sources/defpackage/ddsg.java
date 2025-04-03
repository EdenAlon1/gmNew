package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddsg extends cxps {
    public final dduf A;
    public boolean B;
    public final Context t;
    public final View u;
    public final TextView v;
    public final TextView w;
    public final TextView x;
    public final ImageView y;
    public final crly z;

    public ddsg(Context context, lkr lkrVar, View view, dduf ddufVar) {
        super(lkrVar.P(), view);
        this.B = false;
        this.t = context;
        this.A = ddufVar;
        this.u = view;
        this.v = (TextView) view.findViewById(R.id.zero_state_search_link_title);
        this.x = (TextView) view.findViewById(R.id.zero_state_search_link_sender_and_date);
        this.w = (TextView) view.findViewById(R.id.zero_state_search_link_sub_title);
        this.y = (ImageView) view.findViewById(R.id.zero_state_search_link_image);
        this.z = new crly(view, ddufVar.a(), ddufVar.a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cxps
    protected final /* bridge */ /* synthetic */ void E(Object obj) {
        obj.m();
        this.A.b(this.z, obj.o());
        D(obj.e(), new llh() { // from class: ddsb
            @Override // defpackage.llh
            public final void a(Object obj2) {
                ddsg.this.v.setText((String) obj2);
            }
        });
        D(obj.a(), new llh() { // from class: ddsc
            @Override // defpackage.llh
            public final void a(Object obj2) {
                ddsg.this.w.setText((String) obj2);
            }
        });
        D(obj.c(), new llh() { // from class: ddsd
            @Override // defpackage.llh
            public final void a(Object obj2) {
                ddsg.this.x.setText((String) obj2);
            }
        });
        D(obj.c(), new llh() { // from class: ddse
            @Override // defpackage.llh
            public final void a(Object obj2) {
                ddsg.this.x.setText((String) obj2);
            }
        });
        D(obj.b(), new llh() { // from class: ddsf
            @Override // defpackage.llh
            public final void a(Object obj2) {
                ddsg ddsgVar = ddsg.this;
                Uri uri = (Uri) obj2;
                if (ddsgVar.B && uri == null) {
                    qpt.e(ddsgVar.y).e(ddsgVar.t.getResources().getDrawable(R.drawable.zero_state_search_link_icon_placeholder_card)).v(ddsgVar.y);
                    ddsgVar.B = false;
                    return;
                }
                if (uri != null) {
                    qpt.e(ddsgVar.y).f(uri).p(rff.c(ddsh.h)).q(rig.a().R(R.drawable.zero_state_search_link_icon_placeholder_card)).v(ddsgVar.y);
                    ddsgVar.B = true;
                }
            }
        });
    }
}
