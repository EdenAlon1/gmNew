package defpackage;

import android.widget.ImageView;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ealp implements eall {
    public static final entd a = entd.c("GnpSdk");
    static final rig b = (rig) new rig().D(qvx.b);
    private final errl c;

    public ealp(errl errlVar) {
        this.c = errlVar;
    }

    private static final int c(int i) {
        if (i == -1) {
            return Integer.MIN_VALUE;
        }
        return i;
    }

    private static final raf d() {
        return new rad().a();
    }

    @Override // defpackage.eall
    public final ListenableFuture a(eauz eauzVar, east eastVar) {
        String h = eastVar.h();
        qzz qzzVar = new qzz(h, d());
        ((ensz) a.o().h("com/google/android/libraries/notifications/platform/internal/media/glide/impl/GlideMediaFetcherImpl", "saveMedia", 94, "GlideMediaFetcherImpl.java")).t("Saving media from url: %s", h);
        eass eassVar = (eass) eastVar;
        return erny.f(qsl.a((qqo) ((qqo) eauzVar.a.c().k(qzzVar).Q(c(eassVar.a), c(eassVar.b))).E()), new emwl() { // from class: ealn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = ealp.a;
                return null;
            }
        }, this.c);
    }

    @Override // defpackage.eall
    public final void b(eauz eauzVar, ImageView imageView, east eastVar) {
        String h = eastVar.h();
        qzz qzzVar = new qzz(h, d());
        ((ensz) a.o().h("com/google/android/libraries/notifications/platform/internal/media/glide/impl/GlideMediaFetcherImpl", "loadMediaToView", 139, "GlideMediaFetcherImpl.java")).t("Loading media to view from url: %s", h);
        eass eassVar = (eass) eastVar;
        int i = eassVar.b;
        int c = c(eassVar.a);
        int c2 = c(i);
        try {
            imageView.setVisibility(0);
            ((qqo) ((qqo) eauzVar.a.h().h(qzzVar).q(b).f(new ealo(imageView)).Q(c, c2)).E()).v(imageView);
        } catch (RuntimeException e) {
            imageView.setVisibility(8);
            ((ensz) ((ensz) ((ensz) a.i()).g(e)).h("com/google/android/libraries/notifications/platform/internal/media/glide/impl/GlideMediaFetcherImpl", "loadMediaToView", (char) 180, "GlideMediaFetcherImpl.java")).q("Failed to load image");
        }
    }
}
