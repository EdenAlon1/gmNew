package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddsr implements lkr {
    public static rig a;
    public static final rjc b;
    public final Context c;
    TextView d;
    TextView e;
    TextView f;
    ImageView g;
    crly h;
    private final lkk i;
    private final dduf j;
    private ddqs k;

    static {
        rjb rjbVar = new rjb();
        rjbVar.b();
        b = rjbVar.a();
    }

    public ddsr(Context context, lkk lkkVar, dduf ddufVar) {
        this.c = context;
        this.i = lkkVar;
        this.j = ddufVar;
    }

    @Override // defpackage.lkr
    public final lkk P() {
        return this.i;
    }

    final void a(View view) {
        this.d = (TextView) view.findViewById(R.id.zero_state_search_location_street_level_address);
        this.e = (TextView) view.findViewById(R.id.zero_state_search_location_city_level_address);
        this.f = (TextView) view.findViewById(R.id.zero_state_search_location_sender_and_date);
        this.g = (ImageView) view.findViewById(R.id.zero_state_search_location_image);
        dduf ddufVar = this.j;
        this.h = new crly(view, ddufVar.a(), ddufVar.a());
    }

    public final void b(ddqs ddqsVar) {
        c();
        this.k = ddqsVar;
        this.j.b(this.h, ddqsVar.o());
        lld d = ddqsVar.d();
        final TextView textView = this.d;
        textView.getClass();
        d.f(this, new llh() { // from class: ddsp
            @Override // defpackage.llh
            public final void a(Object obj) {
                textView.setText((String) obj);
            }
        });
        lld a2 = ddqsVar.a();
        final TextView textView2 = this.e;
        textView2.getClass();
        a2.f(this, new llh() { // from class: ddsp
            @Override // defpackage.llh
            public final void a(Object obj) {
                textView2.setText((String) obj);
            }
        });
        lld c = ddqsVar.c();
        final TextView textView3 = this.f;
        textView3.getClass();
        c.f(this, new llh() { // from class: ddsp
            @Override // defpackage.llh
            public final void a(Object obj) {
                textView3.setText((String) obj);
            }
        });
        ddqsVar.b().f(this, new llh() { // from class: ddsq
            @Override // defpackage.llh
            public final void a(Object obj) {
                ddqr ddqrVar = (ddqr) obj;
                Bitmap bitmap = ddqrVar.b;
                if (ddqrVar.a != null) {
                    ddsr ddsrVar = ddsr.this;
                    qqo i = qpt.c(ddsrVar.c).i(ddqrVar.a);
                    if (ddsr.a == null) {
                        ddsr.a = (rig) rig.a().R(R.drawable.zero_state_search_location_map_placeholder_card);
                    }
                    qqo p = i.q(ddsr.a).p(rff.c(ddsr.b));
                    Context context = ddsrVar.c;
                    p.d(qpt.c(context).e(context.getDrawable(R.drawable.zero_state_search_location_map_placeholder_card))).v(ddsrVar.g);
                }
            }
        });
    }

    public final void c() {
        ddqs ddqsVar = this.k;
        if (ddqsVar != null) {
            ddqsVar.d().l(this);
            ddqsVar.a().l(this);
            ddqsVar.b().l(this);
            ddqsVar.c().l(this);
            this.k = null;
            if (!((lkv) this.i).c.a(lkj.CREATED) || ((lkv) this.i).c.equals(lkj.DESTROYED)) {
                return;
            }
            this.d.setText("");
            this.e.setText("");
            this.f.setText("");
            qqs c = qpt.c(this.c);
            c.w(rig.a());
            c.e(this.c.getDrawable(R.drawable.zero_state_search_location_map_placeholder_card)).v(this.g);
        }
    }
}
