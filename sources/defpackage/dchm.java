package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dchm extends ejte {
    final /* synthetic */ ejvp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dchm(elbx elbxVar, Executor executor, ejvp ejvpVar) {
        super(elbxVar, "GalleryAsyncContentObserver", executor);
        this.a = ejvpVar;
    }

    @Override // defpackage.ejte
    public final void a(boolean z, Uri uri) {
        this.a.a(erqt.i(null), "gallery_content_key");
    }
}
