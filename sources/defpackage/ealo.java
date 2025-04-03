package defpackage;

import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ealo implements rif {
    final /* synthetic */ ImageView a;

    public ealo(ImageView imageView) {
        this.a = imageView;
    }

    @Override // defpackage.rif
    public final boolean a(qwp qwpVar, Object obj, rix rixVar, boolean z) {
        this.a.setVisibility(8);
        ((ensz) ((ensz) ((ensz) ealp.a.i()).g(qwpVar)).h("com/google/android/libraries/notifications/platform/internal/media/glide/impl/GlideMediaFetcherImpl$1", "onLoadFailed", (char) 158, "GlideMediaFetcherImpl.java")).q("Failed to load image");
        return false;
    }

    @Override // defpackage.rif
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2, rix rixVar, qsy qsyVar, boolean z) {
        ((ensz) ealp.a.o().h("com/google/android/libraries/notifications/platform/internal/media/glide/impl/GlideMediaFetcherImpl$1", "onResourceReady", 169, "GlideMediaFetcherImpl.java")).t("Resource taken from %s", qsyVar);
        return false;
    }
}
