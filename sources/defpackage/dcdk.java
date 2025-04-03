package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.FullscreenGalleryRecyclerView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserActivity;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcdk implements dcgj, cxra {
    public boolean a;
    public dcfa b;
    public dcdz c;
    public dcfs d;
    public final Context e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final GalleryBrowserActivity k;
    public final ea l;
    public final dceq m;
    public final eisx n;
    public final ffbr o;
    public final dces p;
    public final ejwd q = new ejwd<List<dche>>() { // from class: dcdk.1
        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            csjy.p("Bugle", th, "AccountFullscreenGalleryFragmentPeer: failed to load gallery data.");
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            List list = (List) obj;
            efbd.c();
            ejzm ejzmVar = dcdk.this.u;
            if (list == null) {
                List list2 = ejzmVar.e;
                int size = list2 == null ? 0 : list2.size();
                ejzmVar.e = null;
                ejzmVar.x(0, size);
            } else {
                List list3 = ejzmVar.e;
                if (list3 == null) {
                    ejzmVar.e = list;
                    ejzmVar.w(0, ejzmVar.e.size());
                } else {
                    int size2 = list3.size();
                    List list4 = ejzmVar.e;
                    ejzmVar.e = list;
                    if (size2 > list.size()) {
                        ejzmVar.x(list.size(), size2 - list.size());
                    } else if (size2 < list.size()) {
                        ejzmVar.w(size2, list.size() - size2);
                    }
                    int min = Math.min(size2, list.size());
                    ejzmVar.d.a(list4.subList(0, min), ejzmVar.e.subList(0, min), ejzmVar.a, ejzmVar);
                }
            }
            dcdk.this.k.af(epto.LOADED);
        }

        @Override // defpackage.ejwd
        public final void hB() {
        }
    };
    public final ejzn r = new dcdm(this);
    public final ejzn s = new dcdq(this);
    public final ejzn t = new dcds(this);
    public final ejzm u;
    private final ffbr v;

    public dcdk(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, dcdf dcdfVar, eisx eisxVar, ffbr ffbrVar7, dces dcesVar) {
        emwl emwlVar = new emwl() { // from class: dcdg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dche dcheVar = (dche) obj;
                boolean z = dcheVar instanceof dchg;
                dcdk dcdkVar = dcdk.this;
                if (z) {
                    return dcdkVar.r;
                }
                if (dcheVar instanceof dchc) {
                    return dcheVar.c == 2 ? dcdkVar.t : dcdkVar.s;
                }
                throw new IllegalStateException();
            }
        };
        emwl emwlVar2 = new emwl() { // from class: dcdh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Integer.valueOf(((dche) obj).a());
            }
        };
        emxf.m(true, "Equivalence is already set.");
        this.u = new ejzm(emwlVar, new emwm(emwlVar2, emwg.a));
        this.e = context;
        this.f = ffbrVar;
        this.g = ffbrVar2;
        this.v = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
        this.j = ffbrVar6;
        this.l = dcdfVar;
        this.n = eisxVar;
        this.o = ffbrVar7;
        this.p = dcesVar;
        this.m = new dceq(dcdfVar);
        this.k = (GalleryBrowserActivity) dcdfVar.G();
    }

    static void b(View view, dchc dchcVar, View.OnClickListener onClickListener) {
        view.setOnClickListener(onClickListener);
        view.setBackgroundResource(R.drawable.compose2o_tile_background);
        ((ImageView) view.findViewById(R.id.gallery_external_item_icon)).setImageResource(dchcVar.b);
        ((TextView) view.findViewById(R.id.gallery_external_item_text)).setText(dchcVar.a);
    }

    public final void a(emyl emylVar, Bundle bundle) {
        dcft dcftVar = (dcft) this.v.b();
        dcdy dcdyVar = new dcdy(this);
        AttachmentQueueState attachmentQueueState = ((dbxx) this.k).n;
        dces dcesVar = this.p;
        this.d = dcftVar.a(this.l, dcdyVar, attachmentQueueState, null, this.c, null, null, 0, dcesVar.b, emylVar);
        FullscreenGalleryRecyclerView fullscreenGalleryRecyclerView = (FullscreenGalleryRecyclerView) this.l.N().findViewById(R.id.full_screen_gallery_recycler_view);
        dcfs dcfsVar = this.d;
        dcfsVar.d = fullscreenGalleryRecyclerView;
        dcfsVar.m(bundle);
    }

    final void c() {
        int e = ((dbxx) this.k).n.e(GalleryContentItem.class);
        int color = e > 0 ? this.k.getColor(R.color.primary_brand_non_icon_color) : crlu.a(this.k, android.R.attr.colorControlNormal);
        SpannableString spannableString = new SpannableString(e > 0 ? this.k.getResources().getQuantityString(R.plurals.mediapicker_gallery_title_selection, e, Integer.valueOf(e)) : this.k.getResources().getString(R.string.mediapicker_gallery_title));
        spannableString.setSpan(new ForegroundColorSpan(color), 0, spannableString.length(), 18);
        cwpw.b(this.k.k(), spannableString);
        Drawable drawable = this.k.getDrawable(R.drawable.quantum_ic_arrow_back_black_24);
        if (drawable != null) {
            drawable.setTint(color);
            im k = this.k.k();
            if (k != null) {
                k.setHomeAsUpIndicator(drawable);
            }
        }
    }

    @Override // defpackage.cxra
    public final boolean q() {
        throw null;
    }
}
