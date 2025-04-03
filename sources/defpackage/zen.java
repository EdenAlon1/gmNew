package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zen {
    private static final enru a = enru.c("com/google/android/apps/messaging/conversation2/image/LoggingGlideErrorListener");
    private final akzt b;

    public zen(akzt akztVar) {
        akztVar.getClass();
        this.b = akztVar;
    }

    public final void a(qwp qwpVar, Object obj, int i) {
        String f = obj instanceof Uri ? cskt.f((Uri) obj) : "unknown";
        ensk i2 = a.i();
        i2.Y(ente.a, "BugleGlide");
        ((enrr) ((enrr) i2).g(qwpVar).h("com/google/android/apps/messaging/conversation2/image/LoggingGlideErrorListener", "onLoadFailed", 25, "LoggingGlideErrorListener.kt")).t("Glide load %s failed", f);
        this.b.e("Bugle.Glide.Error.Count", i);
    }
}
