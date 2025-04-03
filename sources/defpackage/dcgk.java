package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserActivity;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcgk extends cslh {
    private final dcgl a;
    private final Uri b;
    private final dcgj c;

    public dcgk(dcgl dcglVar, Uri uri, dcgj dcgjVar) {
        super("Bugle.Async.ImageAndVideoPicker.prepareDocumentForAttachment.Duration", 60000L, false);
        this.a = dcglVar;
        this.b = uri;
        this.c = dcgjVar;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        String path;
        String str = null;
        if (csuu.v(this.b) && (path = this.b.getPath()) != null && this.a.d.e(new File(path))) {
            this.a.c.c("Bugle.Share.InternalDataFile.AttachAborted");
            return null;
        }
        if (csuu.z(this.b)) {
            this.a.c.c("Bugle.Share.InternalTelephonyMmsFile.AttachAborted");
            return null;
        }
        dcgl dcglVar = this.a;
        Uri uri = this.b;
        Context context = dcglVar.a;
        String q = csuu.q(context, uri);
        if (q == null) {
            if (!csjy.q("Bugle", 6)) {
                return null;
            }
            csjy.f("Bugle", "Failed to resolve content type of attachment (" + String.valueOf(this.b) + ")");
            return null;
        }
        Uri c = this.a.f.c(this.b);
        if (c == null) {
            csjy.n("Bugle", "Failed to persist attachment to scratch space (" + String.valueOf(this.b) + ")");
            return null;
        }
        dcgi dcgiVar = new dcgi();
        dcgiVar.a = q;
        dcgiVar.b = c;
        Uri uri2 = this.b;
        long j = -1;
        try {
            if ("com.android.providers.media.documents".equals(uri2.getAuthority())) {
                try {
                    String[] split = DocumentsContract.getDocumentId(uri2).split(":");
                    if (split.length == 2 && "image".equals(split[0])) {
                        str = split[1];
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
            if (str != null) {
                j = csuu.d(context, "_id = ?", str);
            } else if (DocumentsContract.isDocumentUri(context, uri2)) {
                Long l = (Long) csuu.l(context, uri2, "last_modified", new csuq());
                if (l != null) {
                    j = l.longValue();
                }
            } else {
                String n = csuu.n(context, uri2);
                if (n != null) {
                    j = csuu.d(context, "_data = ?", n);
                }
            }
        } catch (Exception e) {
            ensk i = csuu.a.i();
            i.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/shared/util/file/UriUtil", "getLastModifiedTimestamp", 740, "UriUtil.java")).t("getLastModifiedTimestamp failed on: %s", cskt.b(uri2.toString()));
        }
        dcgiVar.c = j;
        if (!le.n(q)) {
            return dcgiVar;
        }
        Rect h = this.a.e.h(dcgiVar.b, q);
        dcgiVar.d = h.width();
        dcgiVar.e = h.height();
        return dcgiVar;
    }

    @Override // defpackage.cslh
    protected final /* synthetic */ void d(Object obj) {
        dcgi dcgiVar = (dcgi) obj;
        if (dcgiVar == null) {
            return;
        }
        dcdk dcdkVar = (dcdk) this.c;
        GalleryBrowserActivity galleryBrowserActivity = dcdkVar.k;
        Uri uri = dcgiVar.b;
        String str = dcgiVar.a;
        long j = dcgiVar.c;
        int i = dcgiVar.d;
        int i2 = dcgiVar.e;
        if (galleryBrowserActivity.isDestroyed() || uri == null || str == null) {
            return;
        }
        if (!((Boolean) cful.o.e()).booleanValue()) {
            if (((dbxx) dcdkVar.k).n.r(new GalleryContentItem(uri, str, i, i2, eohh.GALLERY_LIBRARY, j))) {
                dcdkVar.k.H().e();
                return;
            }
            return;
        }
        ufk o = GalleryContent.o();
        o.k(uri);
        o.f(str);
        ((uec) o).a = new Size(i, i2);
        o.e(eohh.GALLERY_LIBRARY);
        o.i(j);
        if (((dbxx) dcdkVar.k).n.l(o.l())) {
            dcdkVar.k.H().e();
        }
    }
}
