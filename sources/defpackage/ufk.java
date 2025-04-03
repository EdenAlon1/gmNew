package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ufk {
    public apra h = null;

    public abstract GalleryContent a();

    public abstract eohh b();

    public abstract Optional c();

    public abstract String d();

    public abstract void e(eohh eohhVar);

    public abstract void f(String str);

    public abstract void g(long j);

    public abstract void h(boolean z);

    public abstract void i(long j);

    public abstract void j(byza byzaVar);

    public abstract void k(Uri uri);

    public final GalleryContent l() {
        if (le.x(d())) {
            f("application/txt");
        }
        h(((Boolean) c().orElse(Boolean.valueOf(b() != eohh.FILE_CHOOSER))).booleanValue());
        final GalleryContent a = a();
        a.p.set(this.h);
        ((ued) a).i.ifPresent(new Consumer() { // from class: ufj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                if (((Long) obj).longValue() <= 0) {
                    GalleryContent galleryContent = GalleryContent.this;
                    ensz enszVar = (ensz) GalleryContent.o.i();
                    enszVar.aa(ensy.FULL);
                    ((ensz) enszVar.h("com/google/android/apps/messaging/conversation/draft/model/GalleryContent$Builder", "build", 152, "GalleryContent.java")).r("GalleryContent with invalid duration from source: %d", ((ued) galleryContent).c.a());
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return a;
    }
}
