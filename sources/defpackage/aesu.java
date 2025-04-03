package defpackage;

import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aesu {
    public final ffbz a;
    public GalleryContent b;
    public int c;

    public aesu(final ffbr ffbrVar) {
        this.a = ffca.a(new ffix() { // from class: aess
            @Override // defpackage.ffix
            public final Object invoke() {
                return (aesr) ffbr.this.b();
            }
        });
        ffca.a(new ffix() { // from class: aest
            @Override // defpackage.ffix
            public final Object invoke() {
                Object a = aesu.this.a.a();
                a.getClass();
                return ((aesr) a).ba();
            }
        });
        this.c = -1;
    }

    public final void a(GalleryContent galleryContent) {
        galleryContent.getClass();
        this.b = galleryContent;
    }
}
