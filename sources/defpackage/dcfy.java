package defpackage;

import android.os.Bundle;
import android.util.Size;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraContentItem;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dcfy extends dcar {
    public static final /* synthetic */ int m = 0;
    private static final cskc n = cskc.g("Bugle", "GalleryContentCategory");
    private static final cfva o = cfvl.r(151334644, "init_gallery_in_constructor");
    public final dbxy c;
    protected final AttachmentQueueState d;
    final dchw e;
    public final dcfs f;
    dcfd g;
    private final ctud p;
    private final ea q;
    private final dcab r;

    public dcfy(cuxz cuxzVar, dcft dcftVar, ctud ctudVar, dchw dchwVar, eymn eymnVar, ea eaVar, dbxy dbxyVar, AttachmentQueueState attachmentQueueState, dcab dcabVar, ContentGridView contentGridView, final czgy czgyVar, int i, long j) {
        super(cuxzVar, eymnVar, i, dchwVar.l());
        this.c = dbxyVar;
        this.p = ctudVar;
        this.e = dchwVar;
        this.d = attachmentQueueState;
        this.q = eaVar;
        this.r = dcabVar;
        this.f = dcftVar.a(eaVar, dchwVar, attachmentQueueState, dcabVar, dbxyVar, czgyVar, contentGridView, i, j, new emyl() { // from class: dcfx
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = dcfy.m;
                return Boolean.valueOf(!czgy.this.fu());
            }
        });
        if (((Boolean) o.e()).booleanValue()) {
            dchwVar.h();
            dchwVar.g.f(eaVar, new llh() { // from class: dcfv
                @Override // defpackage.llh
                public final void a(Object obj) {
                    dcfy.this.z().p();
                }
            });
        }
    }

    private final void I(cxqz cxqzVar) {
        AttachmentQueueState attachmentQueueState = (AttachmentQueueState) cxqzVar.c.getParcelableExtra("attachment_queue_state_extra_key");
        dcle b = dcle.b(epts.GALLERY, eptu.EXPANDED);
        if (attachmentQueueState == null) {
            return;
        }
        if (((Boolean) cful.o.e()).booleanValue()) {
            for (GalleryContent galleryContent : this.d.i(attachmentQueueState)) {
                this.d.p(galleryContent);
                this.i.e(galleryContent, b);
            }
            for (GalleryContent galleryContent2 : attachmentQueueState.i(this.d)) {
                this.d.l(galleryContent2);
                this.i.a(galleryContent2, b, false);
            }
            return;
        }
        for (MediaContentItem mediaContentItem : this.d.h(attachmentQueueState)) {
            this.d.q(mediaContentItem);
            this.i.f(mediaContentItem, b);
        }
        for (MediaContentItem mediaContentItem2 : attachmentQueueState.h(this.d)) {
            this.d.r(mediaContentItem2);
            this.i.b(mediaContentItem2, b, false);
        }
    }

    @Override // defpackage.dcar
    protected final dbzy A() {
        return this.f;
    }

    public int F() {
        return R.layout.compose2o_permissions_item_view;
    }

    protected dcfd G(dcfs dcfsVar) {
        return dcfd.I(dcfsVar, a(), o(), F(), null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dcar
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public final dcfd z() {
        if (this.g == null) {
            this.g = G(this.f);
        }
        return this.g;
    }

    @Override // defpackage.dcae
    public int a() {
        return R.dimen.gallery_content_item_size;
    }

    @Override // defpackage.dcae
    public final int b() {
        return R.string.c2o_category_gallery_content_description;
    }

    @Override // defpackage.dcae
    protected int c() {
        return R.drawable.ic_insert_photo_white;
    }

    @Override // defpackage.dcae
    public final Set d() {
        HashSet hashSet = new HashSet();
        hashSet.add(124);
        hashSet.add(126);
        hashSet.add(130);
        return hashSet;
    }

    @Override // defpackage.dcae
    public void f(cxqz cxqzVar) {
        if (cxqzVar == null) {
            n.r("GalleryContentCategory: Full screen activity returned a null intent");
            return;
        }
        int i = cxqzVar.a;
        if (i == 130) {
            if (cxqzVar.b == -1) {
                this.f.l();
                return;
            } else {
                this.f.k();
                return;
            }
        }
        if (cxqzVar.c == null) {
            n.r("GalleryContentCategory: Full screen activity returned an empty intent");
            return;
        }
        if (i == 124) {
            I(cxqzVar);
            return;
        }
        if (i == 126) {
            if (!((Boolean) dcem.b.e()).booleanValue()) {
                I(cxqzVar);
            }
            CameraContentItem cameraContentItem = (CameraContentItem) cxqzVar.c.getParcelableExtra("camera_gallery_item");
            if (cameraContentItem != null) {
                if (!((Boolean) cful.o.e()).booleanValue()) {
                    this.d.r(cameraContentItem);
                    this.i.b(cameraContentItem, dcle.b(epts.CAMERA, eptu.EXPANDED), false);
                    return;
                }
                String str = cameraContentItem.c;
                uez o2 = ufa.o();
                o2.g(str);
                o2.l(cameraContentItem.b);
                o2.f(cameraContentItem.d);
                ((ueh) o2).a = new Size(cameraContentItem.c(), cameraContentItem.b());
                o2.e(cameraContentItem.a);
                o2.j(cameraContentItem.f);
                long j = cameraContentItem.e;
                if (j != -1) {
                    o2.h(j);
                }
                ufa m2 = o2.m();
                this.d.l(m2);
                this.i.a(m2, dcle.b(epts.CAMERA, eptu.EXPANDED), false);
            }
        }
    }

    @Override // defpackage.dcae
    public void g(Bundle bundle) {
        this.f.m(bundle);
        if (((Boolean) o.e()).booleanValue()) {
            return;
        }
        this.e.h();
        dchw dchwVar = this.e;
        dchwVar.g.f(this.q, new llh() { // from class: dcfu
            @Override // defpackage.llh
            public final void a(Object obj) {
                dcfy.this.z().p();
            }
        });
    }

    @Override // defpackage.dcae
    public void i(Bundle bundle) {
        this.f.n(bundle);
    }

    @Override // defpackage.dcat
    public final void j() {
        if (this.p.s()) {
            this.r.e(eptm.CATEGORY_HEADER);
        } else {
            this.f.r();
        }
    }

    @Override // defpackage.dcar
    protected final int k() {
        return R.string.c2o_category_name_gallery;
    }

    @Override // defpackage.dcae
    public final boolean m() {
        return true;
    }

    @Override // defpackage.dcae
    public final void v(dbzn dbznVar) {
        this.i = dbznVar;
        this.f.a = dbznVar;
    }

    @Override // defpackage.dcae
    public final void w(int i) {
        this.l = i;
        this.f.c = i;
    }
}
