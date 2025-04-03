package defpackage;

import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ActionMode;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserActivity;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dceq {
    public final GalleryBrowserActivity a;
    public final ea b;
    private final ActionMode.Callback c = new dcep(this);

    /* compiled from: PG */
    public final class a implements ellf {
    }

    public dceq(ea eaVar) {
        this.b = eaVar;
        this.a = (GalleryBrowserActivity) eaVar.G();
    }

    private final boolean c() {
        return this.a.W().isPresent();
    }

    public final void a() {
        GalleryBrowserActivity galleryBrowserActivity = this.a;
        im k = galleryBrowserActivity.k();
        int e = ((dbxx) galleryBrowserActivity).n.e(GalleryContentItem.class);
        String quantityString = e > 0 ? ((Boolean) dcem.a.e()).booleanValue() ? this.a.getResources().getQuantityString(R.plurals.mediapicker_gallery_title_selection_alternate, e, Integer.valueOf(e)) : this.a.getResources().getQuantityString(R.plurals.mediapicker_gallery_title_selection, e, Integer.valueOf(e)) : this.a.getResources().getString(R.string.mediapicker_gallery_title);
        int d = ehdr.d(this.a, e > 0 ? R.attr.colorPrimaryBrandIcon : android.R.attr.colorControlNormal, "FullscreenGalleryActionBarController");
        if (e <= 0) {
            if (c()) {
                this.a.X();
                Drawable drawable = this.a.getDrawable(R.drawable.quantum_ic_arrow_back_black_24);
                if (k != null) {
                    k.setHomeAsUpIndicator(drawable);
                }
            }
            SpannableString spannableString = new SpannableString(quantityString);
            spannableString.setSpan(new ForegroundColorSpan(d), 0, spannableString.length(), 18);
            this.a.setTitle(new SpannableString(quantityString));
            return;
        }
        if (!c()) {
            GalleryBrowserActivity galleryBrowserActivity2 = this.a;
            ActionMode.Callback callback = this.c;
            View view = this.b.Q;
            view.getClass();
            galleryBrowserActivity2.ab(callback, view, null);
            Drawable drawable2 = this.a.getDrawable(R.drawable.quantum_ic_close_black_24);
            if (k != null) {
                k.setHomeAsUpIndicator(drawable2);
            }
        }
        GalleryBrowserActivity galleryBrowserActivity3 = this.a;
        cwpu cwpuVar = ((cwpv) galleryBrowserActivity3).p;
        if (cwpuVar == null) {
            return;
        }
        cwpuVar.a = quantityString;
        galleryBrowserActivity3.Z();
    }

    public final boolean b() {
        if (!c()) {
            return false;
        }
        this.a.X();
        return true;
    }
}
