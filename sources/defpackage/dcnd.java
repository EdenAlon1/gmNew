package defpackage;

import android.animation.TimeAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.support.constraint.ConstraintLayout;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.OrientationEventListener;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.common.SwitchImageView;
import com.google.android.apps.messaging.ui.mediapicker.camera.CameraTextureView;
import com.google.android.apps.messaging.ui.mediapicker.camera.carousel.CarouselRecyclerView;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.function.Consumer$CC;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.microedition.khronos.egl.EGLContext;
import org.chromium.net.NetError;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcnd implements cxra {
    public static final entd a = entd.c("BugleCamera");
    public SwitchImageView A;
    public SwitchImageView B;
    public FrameLayout C;
    public View D;
    public ImageView E;
    public TextView F;
    public View G;
    public dcrd H;
    public TimeAnimator I;
    public aw J;
    public aw K;
    public aw L;
    public int N;
    public int O;
    public int P;
    public Transition Q;
    public Transition R;
    public dcpn S;
    public final dclx T;
    public final tam U;
    public final errl V;
    public final ddzb W;
    public final ffbr X;
    public dctl Y;
    public Consumer Z;
    public Runnable aa;
    public Runnable ab;
    public Runnable ac;
    private final alcp ae;
    private final ffbr af;
    public final errl c;
    public final alci d;
    public final alcm e;
    public final alrv f;
    public final dcoz g;
    public OrientationEventListener k;
    public dcqd l;
    public Runnable m;
    public dcqw n;
    public dcps o;
    public boolean p;
    public ColorStateList q;
    public ColorStateList r;
    public dcpp s;
    public boolean u;
    public View v;
    public ConstraintLayout w;
    public CameraTextureView x;
    public View y;
    public CarouselRecyclerView z;
    public final long b = TimeUnit.SECONDS.toMillis(((Integer) uky.q.e()).intValue());
    public final dcnc h = new dcnc(this);
    final dcmx ad = new dcmx(this);
    final cxpz i = new dcmy(this);
    public dcnb j = dcnb.PHOTO;
    public Boolean t = true;
    public final List M = new ArrayList();

    public dcnd(dclx dclxVar, errl errlVar, alci alciVar, alcm alcmVar, alcp alcpVar, alrv alrvVar, dcoz dcozVar, ffbr ffbrVar, tam tamVar, errl errlVar2, ddzb ddzbVar, ffbr ffbrVar2) {
        this.T = dclxVar;
        this.c = errlVar;
        this.d = alciVar;
        this.e = alcmVar;
        this.ae = alcpVar;
        this.f = alrvVar;
        this.g = dcozVar;
        this.af = ffbrVar;
        this.U = tamVar;
        this.V = errlVar2;
        this.W = ddzbVar;
        this.X = ffbrVar2;
    }

    public static int j(int i) {
        return i % 180 == 0 ? 2 : 3;
    }

    private final void l(aw awVar, Transition transition, boolean z) {
        awVar.l(R.id.back_close_button, this.A.getVisibility());
        awVar.l(R.id.camera_flash_button, this.B.getVisibility());
        TransitionManager.beginDelayedTransition(this.w, transition);
        awVar.b(this.w);
        int i = true != z ? 0 : 4;
        this.A.d(R.drawable.back_arrow_shadow, i);
        this.B.d(R.drawable.back_arrow_shadow, i);
    }

    private static int m(dcnb dcnbVar) {
        int ordinal = dcnbVar.ordinal();
        if (ordinal == 0) {
            return 2;
        }
        if (ordinal == 1) {
            return 3;
        }
        throw new IllegalStateException("Unsupported mode ".concat(String.valueOf(String.valueOf(dcnbVar))));
    }

    public final void a(boolean z) {
        if (this.j.ordinal() == 1) {
            l(z ? this.L : this.K, new Fade(), z);
            return;
        }
        ensz enszVar = (ensz) a.j();
        enszVar.Y(dcse.h, this.j.toString());
        ((ensz) enszVar.h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraFragmentPeer", "animateRecordingStateLayout", 833, "CameraFragmentPeer.java")).q("Attempting to animate layout to recording state in unsupported mode");
    }

    public final void b() {
        ((ctuk) this.af.b()).j(new ctuj() { // from class: dcmo
            @Override // defpackage.ctuj
            public final void d() {
                elfl i;
                final dcnd dcndVar = dcnd.this;
                if (dcndVar.p) {
                    return;
                }
                dcndVar.O = dcndVar.N;
                int width = dcndVar.x.getWidth();
                int height = dcndVar.x.getHeight();
                dcndVar.p = true;
                dcndVar.D.performHapticFeedback(1);
                dcndVar.T.G().getWindow().addFlags(128);
                dcndVar.z.setEnabled(false);
                dcndVar.z.aQ(true);
                final dcoz dcozVar = dcndVar.g;
                if (dcozVar.t.get()) {
                    i = elfo.d(new IllegalStateException("Camera must finish opening before recording video."));
                } else {
                    if (dcozVar.B == null) {
                        dcpb dcpbVar = dcozVar.D;
                        dcre dcreVar = new dcre((EGLContext) dcozVar.v.orElse(null));
                        dcpa dcpaVar = dcozVar.E;
                        dcozVar.C = new dcqe();
                        dcozVar.C.a.a(dcreVar.a);
                        dcozVar.B = dcreVar;
                    }
                    if (dcozVar.r) {
                        dcozVar.n("torch");
                    }
                    final int b = dcoz.b(width);
                    final int b2 = dcoz.b(height);
                    i = (dcozVar.y() ? dcozVar.c(2) : elfo.e(null)).i(new eroh() { // from class: dcob
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            final dcoz dcozVar2 = dcoz.this;
                            final int i2 = b;
                            final int i3 = b2;
                            return dcozVar2.y.submit(eldl.m(new Callable() { // from class: dcoo
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    String[] strArr = le.a;
                                    dcoz dcozVar3 = dcoz.this;
                                    Context context = dcozVar3.z;
                                    Uri d = cbgi.d("mp4", context);
                                    String absolutePath = cbgi.i(d, context).getAbsolutePath();
                                    int i4 = 360 - dcozVar3.n;
                                    ensk n = dcoz.a.n();
                                    n.Y(dcse.e, absolutePath);
                                    ensn ensnVar = dcse.b;
                                    int i5 = i2;
                                    n.Y(ensnVar, Integer.valueOf(i5));
                                    ensn ensnVar2 = dcse.c;
                                    int i6 = i3;
                                    n.Y(ensnVar2, Integer.valueOf(i6));
                                    int i7 = i4 % 360;
                                    n.Y(dcse.f, Integer.valueOf(i7));
                                    ((ensz) n.h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "startVideoRecorder", 851, "CameraManager.java")).q("startRecording");
                                    dcre dcreVar2 = dcozVar3.B;
                                    dcreVar2.getClass();
                                    dcreVar2.a.a.o = i7;
                                    dcqe dcqeVar = dcozVar3.C;
                                    dcqeVar.getClass();
                                    dcreVar2.a.c(absolutePath, i5, i6, dcqeVar.a.c, ((Boolean) dcoz.b.e()).booleanValue());
                                    dcqeVar.a.b();
                                    dcpe dcpeVar = dcozVar3.g;
                                    if (dcpeVar == null) {
                                        throw new IllegalStateException("Camera preview must be registered before recording");
                                    }
                                    dcpeVar.b(dcreVar2.a);
                                    dclv dclvVar = new dclv();
                                    dclvVar.d(d);
                                    dclvVar.b = "video/mp4";
                                    dclvVar.e(i5);
                                    dclvVar.c(i6);
                                    dcozVar3.f = dclvVar;
                                    return null;
                                }
                            }));
                        }
                    }, erpp.a);
                }
                erqt.r(i, axou.a(new csvw(new Consumer() { // from class: dcmb
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        dcnd dcndVar2 = dcnd.this;
                        dcndVar2.I.start();
                        dcndVar2.F.setText(csjh.a(dcndVar2.T.z(), 0L));
                        dcndVar2.D.setContentDescription(dcndVar2.T.z().getString(R.string.camera_stop_recording));
                        dcndVar2.a(true);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }, new Consumer() { // from class: dcmc
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        dcnd dcndVar2 = dcnd.this;
                        dcndVar2.p = false;
                        dcndVar2.T.G().getWindow().clearFlags(128);
                        dcndVar2.z.setEnabled(true);
                        dcndVar2.z.aQ(false);
                        ((ensz) ((ensz) ((ensz) dcnd.a.j()).g((Throwable) obj)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraFragmentPeer", "doStartVideoRecording", 943, "CameraFragmentPeer.java")).q("startVideoRecorder failed");
                        ((akzt) dcndVar2.X.b()).c("Bugle.Camera.FullscreenCameraVideoCaptureFailed.Count");
                        dcndVar2.W.k(R.string.camera_video_capture_failure);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                })), dcndVar.V);
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

    public final void c() {
        elfl elflVar;
        if (this.I.isRunning()) {
            this.I.end();
        }
        if (i()) {
            this.x.b(null);
            this.T.G().getWindow().clearFlags(128);
            final dcoz dcozVar = this.g;
            if (dcozVar.x()) {
                dcpe dcpeVar = dcozVar.g;
                if (dcpeVar != null) {
                    dcpeVar.b(null);
                }
                if (dcozVar.r) {
                    dcozVar.n("off");
                }
                elfl g = elfo.g(new Callable() { // from class: dcon
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        dcoz dcozVar2 = dcoz.this;
                        dcozVar2.p();
                        dcozVar2.j("VideoStop.ogg");
                        dcqb dcqbVar = dcozVar2.f;
                        if (dcqbVar == null) {
                            throw new IllegalStateException("Tried to stop video recording after video tear-down.");
                        }
                        Context context = dcozVar2.z;
                        Uri uri = ((dclv) dcqbVar).a;
                        if (uri == null) {
                            throw new IllegalStateException("Property \"uri\" has not been set");
                        }
                        dcqbVar.b(csuu.c(context, uri));
                        dcqc a2 = dcqbVar.a();
                        dcozVar2.f = null;
                        return a2;
                    }
                }, dcozVar.y);
                dcozVar.m = g;
                elflVar = g;
            } else {
                elflVar = elfo.d(new IllegalStateException("StopVideoRecorder called when not recording."));
            }
            erqt.r(elflVar, axou.a(new csvw(new dcly(this), new Consumer() { // from class: dcmd
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ((ensz) ((ensz) ((ensz) dcnd.a.i()).g((Throwable) obj)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraFragmentPeer", "doStopVideoRecording", 969, "CameraFragmentPeer.java")).q("stopVideoRecorder failed");
                    dcnd dcndVar = dcnd.this;
                    ((akzt) dcndVar.X.b()).c("Bugle.Camera.FullscreenCameraVideoCaptureFailed.Count");
                    dcndVar.f(R.string.camera_video_capture_failure);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            })), this.V);
        }
        a(false);
        this.z.setEnabled(true);
        this.z.aQ(false);
        this.D.setContentDescription(this.T.z().getString(R.string.camera_start_recording));
    }

    public final void d() {
        elfl elflVar;
        if (this.p) {
            return;
        }
        this.p = true;
        this.O = this.N;
        final boolean z = !this.g.v() && this.o.a;
        if (z) {
            elflVar = this.g.d(1.0f);
        } else {
            final dcoz dcozVar = this.g;
            if (dcozVar.t.get()) {
                elflVar = elfo.d(new IllegalStateException("Camera must finish opening before taking a picture."));
            } else {
                dcozVar.l.cancel(false);
                ListenableFuture[] listenableFutureArr = new ListenableFuture[2];
                listenableFutureArr[0] = elfl.g(dcozVar.s);
                listenableFutureArr[1] = dcozVar.y() ? dcozVar.c(0) : elfo.e(null);
                dcozVar.l = elfo.k(listenableFutureArr).b(new erog() { // from class: dcnm
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        final dcoz dcozVar2 = dcoz.this;
                        return dcozVar2.y.submit(eldl.m(new Callable() { // from class: dcnr
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                dcoz dcozVar3 = dcoz.this;
                                Context context = dcozVar3.z;
                                Uri d = cbgi.d("jpg", context);
                                FileOutputStream fileOutputStream = new FileOutputStream(cbgi.i(d, context));
                                try {
                                    dcpe dcpeVar = dcozVar3.g;
                                    if (dcpeVar == null) {
                                        throw new IllegalStateException("Camera preview must be registered before taking picture");
                                    }
                                    Bitmap bitmap = dcpeVar.getBitmap();
                                    if (!dcozVar3.y()) {
                                        dcozVar3.j("camera_click.ogg");
                                    }
                                    if (dcozVar3.n != 0) {
                                        Matrix matrix = new Matrix();
                                        matrix.postRotate(-dcozVar3.n);
                                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
                                        bitmap.recycle();
                                        bitmap = createBitmap;
                                    }
                                    bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                                    dclv dclvVar = new dclv();
                                    dclvVar.b = "image/jpeg";
                                    dclvVar.b(0L);
                                    dclvVar.e(bitmap.getWidth());
                                    dclvVar.c(bitmap.getHeight());
                                    dclvVar.d(d);
                                    dcqc a2 = dclvVar.a();
                                    fileOutputStream.close();
                                    return a2;
                                } catch (Throwable th) {
                                    try {
                                        fileOutputStream.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                }
                            }
                        }));
                    }
                }, erpp.a);
                elflVar = dcozVar.l;
            }
        }
        erqt.r(elflVar, axou.a(new csvw(new dcly(this), new Consumer() { // from class: dcmj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((ensz) ((ensz) ((ensz) dcnd.a.j()).g((Throwable) obj)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraFragmentPeer", "doTakePicture", 876, "CameraFragmentPeer.java")).q("doTakePicture failed");
                dcnd dcndVar = dcnd.this;
                ((akzt) dcndVar.X.b()).c("Bugle.Camera.FullscreenCameraPhotoCaptureFailed.Count");
                dcndVar.f(R.string.camera_photo_capture_failure);
                if (z) {
                    dcndVar.g.l();
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        })), this.V);
    }

    public final void e() {
        this.m.run();
    }

    public final void f(int i) {
        this.W.k(i);
        this.p = false;
    }

    public final void g(int i) {
        if (this.T.G() == null || !this.T.aF()) {
            return;
        }
        this.T.G().setRequestedOrientation(i);
    }

    public final void h(int i) {
        int round;
        if (this.T.G() == null || this.h.a) {
            return;
        }
        if (ctid.e(this.T.G(), this.U.a) || (round = ((int) (Math.round(i / 90.0f) * 90.0f)) % 360) == this.N) {
            return;
        }
        int i2 = (360 - round) % 360;
        if (Math.abs(i2 - this.P) > 180) {
            i2 += NetError.ERR_HTTP2_INADEQUATE_TRANSPORT_SECURITY;
        }
        this.P = i2;
        this.N = round;
        final dcpp dcppVar = this.s;
        dcppVar.b = Integer.valueOf(round);
        cslq.d(new Runnable() { // from class: dcpo
            @Override // java.lang.Runnable
            public final void run() {
                dcpp dcppVar2 = dcpp.this;
                Object obj = dcppVar2.b;
                obj.getClass();
                dcppVar2.a.accept(obj);
            }
        }, 500L);
    }

    public final boolean i() {
        return this.g.x();
    }

    public final void k(dcnb dcnbVar, final int i) {
        if (this.j != dcnbVar) {
            if (i != 0) {
                Context z = this.T.z();
                dcnb dcnbVar2 = dcnb.PHOTO;
                crnx.g(z.getString(dcnbVar.d), this.z);
                alcp alcpVar = this.ae;
                final int m = m(this.j);
                final int m2 = m(dcnbVar);
                final int i2 = true != this.g.v() ? 3 : 2;
                final int j = j(this.N);
                alcpVar.o(new Supplier() { // from class: alcn
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        eptc eptcVar = (eptc) epte.a.createBuilder();
                        eptcVar.copyOnWrite();
                        epte epteVar = (epte) eptcVar.instance;
                        epteVar.c = m - 1;
                        epteVar.b |= 1;
                        eptcVar.copyOnWrite();
                        epte epteVar2 = (epte) eptcVar.instance;
                        epteVar2.d = m2 - 1;
                        epteVar2.b |= 2;
                        eptcVar.copyOnWrite();
                        epte epteVar3 = (epte) eptcVar.instance;
                        epteVar3.e = i - 1;
                        epteVar3.b |= 4;
                        eptcVar.copyOnWrite();
                        epte epteVar4 = (epte) eptcVar.instance;
                        epteVar4.f = i2 - 1;
                        epteVar4.b |= 8;
                        eptcVar.copyOnWrite();
                        epte epteVar5 = (epte) eptcVar.instance;
                        epteVar5.g = j - 1;
                        epteVar5.b |= 16;
                        return (epte) eptcVar.build();
                    }
                });
            }
            this.j = dcnbVar;
            this.z.au(dcnbVar.ordinal());
            int ordinal = this.j.ordinal();
            if (ordinal == 0) {
                l(this.J, this.R, false);
                this.E.setImageTintList(this.q);
            } else if (ordinal == 1) {
                l(this.K, this.R, false);
                this.E.setImageTintList(this.r);
            }
            this.D.setContentDescription(this.T.z().getString(dcnbVar.e));
        }
    }

    @Override // defpackage.cxra
    public final boolean q() {
        throw null;
    }
}
