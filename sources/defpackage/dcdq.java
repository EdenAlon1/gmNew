package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserExternalItemView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcdq extends ejzn {
    final /* synthetic */ dcdk a;

    public dcdq(dcdk dcdkVar) {
        this.a = dcdkVar;
    }

    @Override // defpackage.ejzn
    public final /* bridge */ /* synthetic */ View a(ViewGroup viewGroup) {
        return (GalleryBrowserExternalItemView) LayoutInflater.from(this.a.e).inflate(R.layout.compose2o_gallery_browser_external_item_view_m2, viewGroup, false);
    }

    @Override // defpackage.ejzn
    public final /* bridge */ /* synthetic */ void b(View view, Object obj) {
        GalleryBrowserExternalItemView galleryBrowserExternalItemView = (GalleryBrowserExternalItemView) view;
        dchc dchcVar = (dchc) obj;
        int i = dchcVar.c;
        if (i == 3) {
            dcdk.b(galleryBrowserExternalItemView, dchcVar, new View.OnClickListener() { // from class: dcdn
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    dcdq.this.a.d.o();
                }
            });
        } else if (i == 7) {
            dcdk.b(galleryBrowserExternalItemView, dchcVar, new View.OnClickListener() { // from class: dcdp
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    dcdq.this.a.c.j(eptm.EXPAND);
                }
            });
        } else {
            if (i != 11) {
                return;
            }
            dcdk.b(galleryBrowserExternalItemView, dchcVar, new View.OnClickListener() { // from class: dcdo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    dcdq.this.a.d.p();
                }
            });
        }
    }

    @Override // defpackage.ejzn
    public final /* bridge */ /* synthetic */ void c(View view) {
        ((GalleryBrowserExternalItemView) view).setOnClickListener(null);
    }
}
