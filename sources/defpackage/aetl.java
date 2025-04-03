package defpackage;

import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aetl {
    public static final void a(ea eaVar, GalleryContent galleryContent, drwg drwgVar, int i) {
        eaVar.getClass();
        galleryContent.getClass();
        if (drwgVar == drwg.a) {
            byza byzaVar = byza.GOOGLE_PHOTOS_LINK;
            ufk g = galleryContent.g();
            g.j(byzaVar);
            galleryContent = g.l();
        }
        ellj.f(new aetc(galleryContent, i), eaVar);
    }
}
