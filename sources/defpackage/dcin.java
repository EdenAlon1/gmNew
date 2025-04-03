package defpackage;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifContentItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcin extends vk {
    public boolean a = true;
    public final List d = new ArrayList();
    private final qqo e;
    private final dcjb f;

    public dcin(Context context, dcjb dcjbVar) {
        this.f = dcjbVar;
        this.e = (qqo) qpt.c(context).c().q(rig.e()).p(rff.b()).R(R.drawable.compose2o_tile_background);
    }

    @Override // defpackage.vk
    public final int a() {
        return this.d.size();
    }

    @Override // defpackage.vk
    public final int dE(int i) {
        return 1;
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        return new dcjh(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.compose2o_gif_item_view_m2_sg, viewGroup, false), this.e, this.f);
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ void g(wr wrVar, int i) {
        final dcjh dcjhVar = (dcjh) wrVar;
        final GifContentItem gifContentItem = (GifContentItem) this.d.get(i);
        final boolean z = this.a;
        String str = gifContentItem.c() + ":" + gifContentItem.b();
        aw awVar = new aw();
        awVar.e(dcjhVar.v);
        awVar.a(dcjhVar.s.getId()).w = str;
        awVar.b(dcjhVar.v);
        dcjhVar.t.i(gifContentItem.a).v(dcjhVar.s);
        dcjhVar.s.setOnClickListener(new View.OnClickListener() { // from class: dcjg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dcjh dcjhVar2 = dcjh.this;
                dcjb dcjbVar = dcjhVar2.u;
                int fr = dcjhVar2.fr();
                final dcil dcilVar = (dcil) dcjbVar;
                RecyclerView recyclerView = dcilVar.k;
                dcilVar.g.i(dcilVar.a, recyclerView);
                Intent intent = new Intent();
                final GifContentItem gifContentItem2 = gifContentItem;
                intent.putExtra("gif_content_item", gifContentItem2);
                intent.putExtra("gif_position_selected", fr);
                dcilVar.a.setResult(-1, intent);
                if (!z) {
                    axos.a(new Runnable() { // from class: dcib
                        @Override // java.lang.Runnable
                        public final void run() {
                            cswe csweVar = (cswe) dcil.this.f.b();
                            String[] strArr = bxad.a;
                            bwyr bwyrVar = new bwyr();
                            GifContentItem gifContentItem3 = gifContentItem2;
                            bwyrVar.f(gifContentItem3.e);
                            bwyrVar.b(null);
                            bwyrVar.c(gifContentItem3.f);
                            bwyrVar.e(gifContentItem3.g);
                            bwyrVar.g(gifContentItem3.c());
                            bwyrVar.d(gifContentItem3.b());
                            final bwyo a = bwyrVar.a();
                            csix.h();
                            emxf.a(!TextUtils.isEmpty(a.l().toString()));
                            emxf.a(!TextUtils.isEmpty(a.m()));
                            emxf.a(!TextUtils.isEmpty(a.n()));
                            csweVar.c.a("GifDatabaseOperations#insertRecentGif", new dtus() { // from class: cswb
                                @Override // defpackage.dtus
                                public final Object a(cbwn cbwnVar) {
                                    return cswe.a(bwyo.this, cbwnVar);
                                }
                            });
                        }
                    }, dcilVar.b);
                }
                String str2 = dcilVar.t;
                if (str2 != null && dcilVar.u != 2 && (dcilVar.d instanceof cswx)) {
                    ((cswx) dcilVar.d).c(new csxi(gifContentItem2.h, str2));
                }
                ((altk) dcilVar.c.b()).aB(4, dcilVar.u, dcilVar.j.m());
                dcilVar.e(eptk.SELECTION);
            }
        });
    }

    @Override // defpackage.vk
    public final long hb(int i) {
        return ((GifContentItem) this.d.get(i)).e.hashCode();
    }
}
