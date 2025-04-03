package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Size;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraContentItem;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcgy extends dcfy {
    public static final /* synthetic */ int t = 0;
    private final boolean A;
    private int B;
    private uh C;
    public final cqoh n;
    dcqf o;
    public final Optional p;
    public int q;
    public final czgy r;
    public dcgn s;
    private final dcgx u;
    private final dcgw v;
    private int w;
    private int x;
    private int y;
    private int z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public dcgy(final defpackage.ugs r17, defpackage.cuxz r18, defpackage.dcft r19, defpackage.ctud r20, defpackage.cqoh r21, defpackage.ffbr r22, defpackage.adgn r23, boolean r24, final defpackage.dcbc r25) {
        /*
            r16 = this;
            r0 = r25
            r15 = r0
            dcav r15 = (defpackage.dcav) r15
            ea r1 = r15.a
            deaf r2 = new deaf
            java.lang.Class<dchs> r3 = defpackage.dchs.class
            r2.<init>(r1, r3)
            r1 = r22
            lml r1 = r2.b(r1)
            r4 = r1
            dchw r4 = (defpackage.dchw) r4
            eymn r5 = defpackage.eymn.CAMERA_GALLERY
            ea r6 = r15.a
            dbxy r7 = r15.d
            com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState r8 = r15.b
            dcgp r9 = new dcgp
            r1 = r17
            r9.<init>()
            com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView r10 = r15.i
            czgy r11 = r15.g
            int r12 = r15.h
            cfva r0 = defpackage.dedt.a
            java.lang.Object r0 = r0.e()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L55
            czgy r0 = r15.g
            boolean r0 = r0.fu()
            if (r0 == 0) goto L49
            czgy r0 = r15.g
            long r0 = r0.o()
            goto L57
        L49:
            czgy r0 = r15.g
            cpbn r0 = r0.H()
            int r0 = r0.d()
            long r0 = (long) r0
            goto L57
        L55:
            r0 = 0
        L57:
            r2 = r19
            r3 = r20
            r13 = r0
            r0 = r16
            r1 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = -1
            r0.B = r1
            r1 = r21
            r0.n = r1
            dcgx r1 = new dcgx
            r1.<init>(r0)
            r0.u = r1
            dcgw r1 = new dcgw
            r1.<init>(r0)
            r0.v = r1
            j$.util.Optional r1 = r23.a()
            r0.p = r1
            czgy r1 = r15.g
            r0.r = r1
            r1 = r24
            r0.A = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcgy.<init>(ugs, cuxz, dcft, ctud, cqoh, ffbr, adgn, boolean, dcbc):void");
    }

    @Override // defpackage.dcfy
    public final int F() {
        return R.layout.compose2o_camera_gallery_storage_permission_item_view;
    }

    @Override // defpackage.dcfy
    protected final dcfd G(dcfs dcfsVar) {
        return ((Boolean) cjja.a.e()).booleanValue() ? dcfd.I(dcfsVar, -2, o(), R.layout.compose2o_camera_gallery_storage_permission_item_view, new dcgs(this)) : super.G(dcfsVar);
    }

    public final int I() {
        if (this.b == null || z().a() <= this.e.c() + 1 || this.e.b(0) == 2) {
            return 0;
        }
        int a = (z().a() - 1) - (z().H() ? 1 : 0);
        return Math.max(0, this.b.getWidth() - ((((this.b.getHeight() / this.e.l()) * (((a + this.e.l()) - 1) / this.e.l())) + (z().H() ? (this.y + this.x) + this.z : 0)) + this.x));
    }

    final uh J() {
        if (this.C == null) {
            this.C = new dcgu(this);
        }
        return this.C;
    }

    public final void K() {
        int L;
        View U;
        int i;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.b.o;
        if (linearLayoutManager == null || this.o == null || (U = linearLayoutManager.U((L = linearLayoutManager.L()))) == null) {
            return;
        }
        int height = this.b.getHeight();
        int i2 = this.w;
        int i3 = height - (i2 + i2);
        int gG = (int) (i3 / this.o.a().gG());
        if (L == 0) {
            i = (E() ? this.b.getWidth() - U.getRight() : U.getLeft()) + gG;
        } else {
            i = 0;
        }
        if (this.o.a().getRight() != U.getRight()) {
            this.o.c(gG, i3, i);
        }
    }

    public final boolean L() {
        return ((Boolean) uky.e.e()).booleanValue() ? this.A && this.e.f : this.e.f;
    }

    @Override // defpackage.dcfy, defpackage.dcae
    public final int a() {
        return -2;
    }

    @Override // defpackage.dcfy, defpackage.dcae
    protected final int c() {
        return -1;
    }

    @Override // defpackage.dcfy, defpackage.dcae
    public final void f(cxqz cxqzVar) {
        Uri uri;
        dcgn dcgnVar;
        super.f(cxqzVar);
        if (cxqzVar == null || cxqzVar.a != 127 || cxqzVar.b != -1 || (uri = (Uri) cxqzVar.c.getParcelableExtra("android.intent.extra.STREAM")) == null || (dcgnVar = this.s) == null) {
            return;
        }
        String e = dcgnVar.e();
        int b = dcgnVar.b();
        int a = dcgnVar.a();
        epsw d = this.s.d();
        long c = this.s.c();
        if (!((Boolean) cful.o.e()).booleanValue()) {
            CameraContentItem cameraContentItem = new CameraContentItem(uri, e, b, a, -1L, eohh.MINI_CAMERA, c, d);
            this.d.r(cameraContentItem);
            this.i.b(cameraContentItem, dcle.b(epts.CAMERA, eptu.COLLAPSED), false);
            return;
        }
        uez o = ufa.o();
        o.g(e);
        o.l(uri);
        o.f(eohh.MINI_CAMERA);
        ((ueh) o).a = new Size(b, a);
        o.e(d);
        o.j(c);
        ufa m = o.m();
        this.d.l(m);
        this.i.a(m, dcle.b(epts.CAMERA, eptu.COLLAPSED), false);
    }

    @Override // defpackage.dcfy, defpackage.dcae
    public final void g(Bundle bundle) {
        super.g(bundle);
        if (bundle != null) {
            this.s = (dcgn) bundle.getParcelable("mini_camera_capture");
        }
    }

    @Override // defpackage.dcar, defpackage.dcae
    public final void gB(View view) {
        super.gB(view);
        if (L()) {
            this.o = (dcqf) new crly(view, R.id.camera_container_view_stub, R.id.camera_container).b();
            if (!this.r.fu()) {
                this.p.ifPresent(new Consumer() { // from class: dcgq
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((aeqo) obj).b(dcgy.this.o.a());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            this.o.e(new dcgt(this));
            Resources resources = this.o.a().getResources();
            this.w = resources.getDimensionPixelSize(R.dimen.camera_gallery_category_vertical_margin);
            this.x = resources.getDimensionPixelSize(R.dimen.camera_gallery_camera_item_horizontal_margin);
            this.y = resources.getDimensionPixelSize(R.dimen.category_overflow_width);
            this.q = resources.getDimensionPixelSize(R.dimen.camera_gallery_placeholder_start_margin);
            this.z = resources.getDimensionPixelSize(R.dimen.category_content_overflow_item_margin_end);
        }
        this.b.addOnLayoutChangeListener(this.v);
        this.b.H = null;
        J().f(this.b);
    }

    @Override // defpackage.dcfy, defpackage.dcae
    public final void i(Bundle bundle) {
        super.i(bundle);
        dcgn dcgnVar = this.s;
        if (dcgnVar != null) {
            bundle.putParcelable("mini_camera_capture", dcgnVar);
        }
    }

    @Override // defpackage.dcar
    protected final tx l() {
        return new dcgv(this);
    }

    @Override // defpackage.dcar, defpackage.dcae
    public final int n() {
        return R.layout.compose2o_camera_gallery_roll_recycler_view_m2;
    }

    @Override // defpackage.dcae
    public final int o() {
        return L() ? R.layout.compose2o_camera_gallery_placeholder : R.layout.compose2o_empty_placeholder;
    }

    @Override // defpackage.dcae
    public final void p(Configuration configuration) {
        View view;
        if (this.o != null) {
            dcfd dcfdVar = this.g;
            if (dcfdVar != null && (view = dcfdVar.e) != null) {
                int i = view.getResources().getConfiguration().orientation;
                ConstraintLayout constraintLayout = (ConstraintLayout) dcfdVar.e;
                kkk kkkVar = new kkk();
                constraintLayout.getClass();
                kkkVar.d(constraintLayout);
                kkkVar.b(R.id.camera_place_holder).d.A = i == 2 ? "W,4:3" : "H,4:3";
                kkkVar.c(constraintLayout);
            }
            this.o.d(configuration);
        }
        if (this.B != configuration.screenHeightDp) {
            this.b.post(new Runnable() { // from class: dcgo
                @Override // java.lang.Runnable
                public final void run() {
                    View b;
                    dcgy dcgyVar = dcgy.this;
                    vx vxVar = dcgyVar.b.o;
                    if (vxVar == null || (b = dcgyVar.J().b(vxVar)) == null) {
                        return;
                    }
                    int[] c = dcgyVar.J().c(vxVar, b);
                    dcgyVar.b.scrollBy(c[0], c[1]);
                }
            });
            this.B = configuration.screenHeightDp;
        }
    }

    @Override // defpackage.dcae
    public final void s() {
        dcqf dcqfVar = this.o;
        if (dcqfVar != null) {
            dcqfVar.b();
        }
    }

    @Override // defpackage.dcar
    protected final wc y() {
        return this.u;
    }
}
