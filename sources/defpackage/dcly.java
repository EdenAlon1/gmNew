package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.camera.carousel.CarouselRecyclerView;
import com.google.android.apps.messaging.ui.mediaviewer.CameraMediaViewerCloseButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerPrimaryButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerSaveButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class dcly implements Consumer {
    public final /* synthetic */ dcnd a;

    public /* synthetic */ dcly(dcnd dcndVar) {
        this.a = dcndVar;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        dcqc dcqcVar = (dcqc) obj;
        final Uri d = dcqcVar.d();
        final String e = dcqcVar.e();
        final int b = dcqcVar.b();
        final int a = dcqcVar.a();
        final long c = dcqcVar.c();
        final dcnd dcndVar = this.a;
        if (!dcndVar.T.aI()) {
            dcndVar.p = false;
            return;
        }
        if (le.n(e)) {
            dcndVar.f.c(new ecda("Image taken"));
            crnx.g(dcndVar.T.B().getString(R.string.photo_taken), dcndVar.C);
        } else if (le.A(e)) {
            if (c < 200) {
                dcndVar.f(R.string.video_media_failure);
                return;
            } else {
                dcndVar.f.c(new ecda("Video recorded"));
                crnx.g(dcndVar.T.B().getString(R.string.video_taken), dcndVar.C);
            }
        }
        final boolean v = dcndVar.g.v();
        final boolean z = dcndVar.o.a;
        final int j = dcnd.j(dcndVar.O);
        final epsw e2 = dcndVar.d.e(e, j, v, z, Long.valueOf(c), 2);
        dcndVar.aa = new Runnable() { // from class: dcmi
            @Override // java.lang.Runnable
            public final void run() {
                dcnd dcndVar2 = dcnd.this;
                dcndVar2.l.c(d, e, b, a, c, e2);
                dcndVar2.g.e();
                dcndVar2.m.run();
            }
        };
        dcndVar.Z = new Consumer() { // from class: dcmk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                dcnd dcndVar2 = dcnd.this;
                Optional optional = (Optional) obj2;
                dcndVar2.l.c((Uri) optional.map(new Function() { // from class: dcmg
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        return ((MediaViewerItem) obj3).b();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(d), (String) optional.map(new Function() { // from class: dcmh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj3) {
                        return ((MediaViewerItem) obj3).h();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(e), b, a, c, e2);
                dcndVar2.g.e();
                dcndVar2.m.run();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        };
        dcndVar.ac = new Runnable() { // from class: dcml
            @Override // java.lang.Runnable
            public final void run() {
                final dcnd dcndVar2 = dcnd.this;
                final Uri uri = d;
                axos.a(new Runnable() { // from class: dcme
                    @Override // java.lang.Runnable
                    public final void run() {
                        cbgi.j(dcnd.this.T.z(), uri);
                    }
                }, dcndVar2.c);
                dcndVar2.w.setVisibility(0);
                dctl dctlVar = dcndVar2.Y;
                if (dctlVar != null) {
                    cg cgVar = new cg(dcndVar2.T.I());
                    cgVar.n(dctlVar);
                    cgVar.c();
                    dcndVar2.Y = null;
                }
                dcndVar2.g.l();
                dcndVar2.p = false;
                dcndVar2.g(1);
                ddwu.b(dcndVar2.v, new Runnable() { // from class: dcmf
                    @Override // java.lang.Runnable
                    public final void run() {
                        CarouselRecyclerView carouselRecyclerView = dcnd.this.z;
                        dcry dcryVar = (dcry) carouselRecyclerView.n;
                        if (dcryVar != null) {
                            carouselRecyclerView.ak(dcryVar.e);
                        }
                    }
                });
            }
        };
        dcndVar.ab = new Runnable() { // from class: dcmm
            @Override // java.lang.Runnable
            public final void run() {
                dcnd dcndVar2 = dcnd.this;
                alcm alcmVar = dcndVar2.e;
                final String str = e;
                alcmVar.e(str, j, v, z, Long.valueOf(c), 2);
                final dcei dceiVar = (dcei) dcndVar2.l;
                final Uri uri = d;
                final Runnable runnable = new Runnable() { // from class: dcef
                    @Override // java.lang.Runnable
                    public final void run() {
                        sfx a2 = dcei.this.d.a("Bugle.Async.BuglePhotoViewController.onOptionsItemSelected.Duration");
                        a2.b(uri, str, null, null);
                        a2.e(new Void[0]);
                    }
                };
                ((ctuk) dceiVar.c.b()).k(new ctuj() { // from class: dceg
                    @Override // defpackage.ctuj
                    public final void d() {
                        runnable.run();
                    }

                    @Override // defpackage.ctuj
                    public final /* synthetic */ boolean e() {
                        return true;
                    }

                    @Override // defpackage.ctuj
                    public final /* synthetic */ void a() {
                    }

                    @Override // defpackage.ctuj
                    public final /* synthetic */ void b() {
                    }

                    @Override // defpackage.ctuj
                    public final /* synthetic */ void c() {
                    }
                });
            }
        };
        dcndVar.g(10);
        try {
            if (dcndVar.Y == null) {
                dcuf dcufVar = new dcuf();
                dcufVar.e = d;
                dcufVar.g = e;
                dctk e3 = MediaViewerButton.e();
                e3.e(R.string.camera_attach_media);
                e3.d(R.drawable.quantum_ic_check_white_24);
                e3.b(R.string.camera_attach_media_description);
                e3.c(new MediaViewerPrimaryButtonEvent());
                dcufVar.h = e3.a();
                dctk e4 = MediaViewerButton.e();
                e4.b(R.string.camera_save_media_description);
                e4.d(R.drawable.quantum_ic_save_alt_white_24);
                e4.c(new MediaViewerSaveButtonEvent());
                dcufVar.i = new ArrayList(engw.r(e4.a()));
                dctk e5 = MediaViewerButton.e();
                e5.b(R.string.discard);
                e5.c(new CameraMediaViewerCloseButtonEvent());
                dcufVar.j = e5.a();
                dcufVar.b(5);
                dcufVar.l = 1;
                dcufVar.m = ((Boolean) dcut.b.e()).booleanValue();
                dctl a2 = dcufVar.a();
                cg cgVar = new cg(dcndVar.T.I());
                cgVar.s(R.id.confirmation_container, a2);
                cgVar.c();
                dcndVar.Y = a2;
            }
            dcndVar.w.setVisibility(4);
        } catch (IllegalStateException e6) {
            ((ensz) ((ensz) ((ensz) dcnd.a.i()).g(e6)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraFragmentPeer", "onMediaReady", (char) 267, "CameraFragmentPeer.java")).q("onMediaReady MediaViewerFragment not added");
            dcndVar.f(R.string.camera_media_capture_failure);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
