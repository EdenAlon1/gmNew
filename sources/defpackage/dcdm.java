package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcdm extends ejzn {
    final /* synthetic */ dcdk a;

    public dcdm(dcdk dcdkVar) {
        this.a = dcdkVar;
    }

    @Override // defpackage.ejzn
    public final /* bridge */ /* synthetic */ View a(ViewGroup viewGroup) {
        return (GalleryContentItemView) LayoutInflater.from(this.a.e).inflate(R.layout.full_screen_gallery_compose2o_gallery_item_view, viewGroup, false);
    }

    @Override // defpackage.ejzn
    public final /* synthetic */ void b(View view, Object obj) {
        boolean o;
        final int g;
        final GalleryContentItemView galleryContentItemView = (GalleryContentItemView) view;
        dchg dchgVar = (dchg) obj;
        AttachmentQueueState attachmentQueueState = ((dbxx) this.a.k).n;
        if (((Boolean) cful.o.e()).booleanValue()) {
            GalleryContent b = dchgVar.b(eohh.GALLERY_CHOOSER);
            o = attachmentQueueState.n(b);
            g = attachmentQueueState.f(b);
            galleryContentItemView.h = b;
        } else {
            GalleryContentItem c = dchgVar.c(eohh.GALLERY_CHOOSER);
            o = attachmentQueueState.o(c);
            g = attachmentQueueState.g(c);
            galleryContentItemView.g = c;
        }
        galleryContentItemView.e(g, o);
        galleryContentItemView.a = dchgVar;
        galleryContentItemView.j(ekmq.a(this.a.e).c().q(rig.a()).p(rff.b()));
        galleryContentItemView.setOnClickListener(new View.OnClickListener() { // from class: dcdl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                GalleryContentItemView galleryContentItemView2 = galleryContentItemView;
                dcdm dcdmVar = dcdm.this;
                dcfs dcfsVar = dcdmVar.a.d;
                ufd ufdVar = galleryContentItemView2.h;
                int i = g;
                if (dcfsVar.t(ufdVar, i, galleryContentItemView2.k)) {
                    return;
                }
                dcdmVar.a.d.q((GalleryContent) galleryContentItemView2.h, (GalleryContentItem) galleryContentItemView2.g, !galleryContentItemView2.k, i);
            }
        });
    }

    @Override // defpackage.ejzn
    public final /* bridge */ /* synthetic */ void c(View view) {
        ((GalleryContentItemView) view).setOnClickListener(null);
    }
}
