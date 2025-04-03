package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.hardware.Camera;
import android.media.AudioAttributes;
import android.media.MediaActionSound;
import android.os.Looper;
import android.view.WindowManager;
import com.google.android.apps.messaging.ui.mediapicker.camera.camerafocus.RenderOverlay;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcoz implements dcrg {
    private static final AudioAttributes G;
    private static final List H;
    public static final int[] c;
    public Looper A;
    public dcre B;
    public dcqe C;
    public final dcpb D;
    public final dcpa E;
    private elfl J;
    private final ctcy K;
    private final ffbr L;
    public int d;
    public boolean e;
    public dcqb f;
    dcpe g;
    dcoy h;
    Camera i;
    MediaActionSound j;
    public int k;
    public int n;
    public int o;
    public boolean p;
    public final dcri q;
    public boolean r;
    public final Executor u;
    public final Optional v;
    public final dcqa w;
    public final errl x;
    public final errl y;
    public final Context z;
    public static final entd a = entd.c("BugleCamera");
    private static final emyl F = cfvl.x(227411292, "enable_media_action_sound_fix");
    public static final cfva b = cfvl.i(cfvl.b, "video_recorder_check_audio_format", false);
    private final Camera.CameraInfo I = new Camera.CameraInfo();
    public elfl l = elfo.c();
    public elfl m = elfo.c();
    public SettableFuture s = SettableFuture.create();
    public final AtomicBoolean t = new AtomicBoolean(true);
    private final HashSet M = new HashSet();

    static {
        cfvl.e(cfvl.b, "video_recording_quality", 5);
        G = new AudioAttributes.Builder().setContentType(4).setUsage(13).setLegacyStreamType(1).build();
        c = new int[]{0, 2, 3};
        H = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    public dcoz(Optional optional, Optional optional2, dcqa dcqaVar, errl errlVar, errl errlVar2, Context context, ctcy ctcyVar, ffbr ffbrVar, Optional optional3, Optional optional4) {
        ?? r3 = optional.get();
        this.u = r3;
        this.v = optional2;
        this.w = dcqaVar;
        this.x = errlVar;
        this.y = errlVar2;
        this.z = context;
        this.K = ctcyVar;
        this.L = ffbrVar;
        this.D = (dcpb) optional3.get();
        this.E = (dcpa) optional4.get();
        this.d = -1;
        final Looper myLooper = Looper.myLooper();
        axos.a(new Runnable() { // from class: dcoi
            @Override // java.lang.Runnable
            public final void run() {
                if (Looper.myLooper() != myLooper) {
                    dcoz.this.A = Looper.myLooper();
                }
            }
        }, r3);
        this.q = new dcri(this, Looper.getMainLooper());
    }

    private final void A() {
        Looper looper = this.A;
        if (looper == null || looper == Looper.myLooper()) {
            return;
        }
        csix.c("Expected to be on the camera thread");
    }

    private final void B() {
        this.l.cancel(false);
        this.l = elfo.c();
        this.s.cancel(false);
        this.s = SettableFuture.create();
        elfl elflVar = this.J;
        if (elflVar != null) {
            elflVar.cancel(false);
        }
        this.m.cancel(false);
        this.m = elfo.c();
    }

    private final boolean C() {
        return !this.l.isDone();
    }

    private final void D() {
        Camera camera;
        dcqb dcqbVar = this.f;
        if (dcqbVar == null) {
            return;
        }
        dcqbVar.b(0L);
        final dcqc a2 = dcqbVar.a();
        this.f = null;
        if (this.r && (camera = this.i) != null) {
            t(camera);
        }
        p();
        axos.a(new Runnable() { // from class: dcok
            @Override // java.lang.Runnable
            public final void run() {
                cbgi.i(((dclw) a2).a, dcoz.this.z).delete();
            }
        }, this.y);
    }

    static int b(int i) {
        return i & (-16);
    }

    public static boolean w(Camera.Parameters parameters, String str) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        return supportedFlashModes != null && supportedFlashModes.contains(str);
    }

    private static int z(int i) {
        List list = H;
        synchronized (list) {
            int numberOfCameras = Camera.getNumberOfCameras();
            if (numberOfCameras > 0 && numberOfCameras != list.size()) {
                list.clear();
                for (int i2 = 0; i2 < numberOfCameras; i2++) {
                    List list2 = H;
                    list2.add(new Camera.CameraInfo());
                    Camera.getCameraInfo(i2, (Camera.CameraInfo) list2.get(i2));
                }
            }
            int i3 = 0;
            while (true) {
                List list3 = H;
                if (i3 >= list3.size()) {
                    if (list3.isEmpty()) {
                        ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "chooseCameraIndexForFacingCached", 441, "CameraManager.java")).q("getNumberOfCameras returned 0 and cache was empty!");
                    }
                    return 0;
                }
                if (((Camera.CameraInfo) list3.get(i3)).facing == i) {
                    return i3;
                }
                i3++;
            }
        }
    }

    final int a() {
        dcpe dcpeVar = this.g;
        WindowManager windowManager = (WindowManager) (dcpeVar != null ? dcpeVar.getContext() : this.z).getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        int rotation = windowManager.getDefaultDisplay().getRotation();
        if (rotation == 1) {
            return 90;
        }
        if (rotation != 2) {
            return rotation != 3 ? 0 : 270;
        }
        return 180;
    }

    public final elfl c(final int i) {
        elfl elflVar = this.J;
        return elflVar != null ? elflVar.h(new emwl() { // from class: dcoe
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                MediaActionSound mediaActionSound = dcoz.this.j;
                if (mediaActionSound == null) {
                    return null;
                }
                mediaActionSound.play(i);
                return null;
            }
        }, this.y) : elfo.e(null);
    }

    public final elfl d(final float f) {
        int i = this.I.facing;
        if (C()) {
            return elfo.d(new IllegalStateException("Previous picture is already in progress."));
        }
        final Camera camera = this.i;
        if (camera == null) {
            return elfo.d(new IllegalStateException("Camera has been released before taking picture."));
        }
        final boolean z = i == 1;
        return elfo.h(new erog() { // from class: dcnj
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final dcoz dcozVar = dcoz.this;
                elfl i2 = elfl.g(dcozVar.s).i(new eroh() { // from class: dcoq
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        final SettableFuture create = SettableFuture.create();
                        final dcoz dcozVar2 = dcoz.this;
                        axos.a(new Runnable() { // from class: dcnl
                            @Override // java.lang.Runnable
                            public final void run() {
                                final SettableFuture settableFuture = create;
                                final dcoz dcozVar3 = dcoz.this;
                                Camera camera2 = dcozVar3.i;
                                if (camera2 == null) {
                                    settableFuture.setException(new dcow("Camera not open"));
                                    return;
                                }
                                if (dcozVar3.x()) {
                                    settableFuture.setException(new dcow("Camera busy"));
                                    return;
                                }
                                Camera.PictureCallback pictureCallback = new Camera.PictureCallback() { // from class: dcny
                                    @Override // android.hardware.Camera.PictureCallback
                                    public final void onPictureTaken(byte[] bArr, Camera camera3) {
                                        entd entdVar = dcoz.a;
                                        SettableFuture settableFuture2 = SettableFuture.this;
                                        if (bArr == null) {
                                            settableFuture2.setException(new dcow("Camera returned no data"));
                                        } else {
                                            settableFuture2.set(bArr);
                                        }
                                    }
                                };
                                try {
                                    dcozVar3.t(camera2);
                                    camera2.takePicture(new Camera.ShutterCallback() { // from class: dcnz
                                        @Override // android.hardware.Camera.ShutterCallback
                                        public final void onShutter() {
                                            dcoz dcozVar4 = dcoz.this;
                                            if (dcozVar4.y()) {
                                                return;
                                            }
                                            dcozVar4.j("camera_click.ogg");
                                        }
                                    }, null, pictureCallback);
                                } catch (Throwable th) {
                                    settableFuture.setException(th);
                                }
                            }
                        }, dcozVar2.u);
                        return elfl.g(create);
                    }
                }, erpp.a);
                final Camera camera2 = camera;
                final float f2 = f;
                final boolean z2 = z;
                dcozVar.l = i2.i(new eroh() { // from class: dcor
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        final int i3;
                        final int i4;
                        final byte[] bArr = (byte[]) obj;
                        Camera.Size pictureSize = camera2.getParameters().getPictureSize();
                        dcoz dcozVar2 = dcoz.this;
                        int i5 = dcozVar2.k;
                        if (i5 == 90 || i5 == 270) {
                            i3 = pictureSize.height;
                            i4 = pictureSize.width;
                        } else {
                            i3 = pictureSize.width;
                            i4 = pictureSize.height;
                        }
                        boolean z3 = z2;
                        float f3 = f2;
                        ensk n = dcoz.a.n();
                        n.Y(dcse.d, Integer.valueOf(bArr.length));
                        ((ensz) n.h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "setTakingPictureFuture", 672, "CameraManager.java")).q("taken picture (bytes)");
                        final dcqa dcqaVar = dcozVar2.w;
                        final dclv dclvVar = new dclv();
                        if (f3 == 1.0f) {
                            if (!z3) {
                                dclvVar.d(dcqaVar.a(new dcpz() { // from class: dcpx
                                    @Override // defpackage.dcpz
                                    public final void a(OutputStream outputStream) {
                                        outputStream.write(bArr);
                                    }
                                }));
                                dclvVar.e(i3);
                                dclvVar.c(i4);
                                dclvVar.b(0L);
                                dclvVar.b = "image/jpeg";
                                return erqt.i(dclvVar.a());
                            }
                            z3 = true;
                        }
                        if (f3 > 1.0f) {
                            i3 = (int) (i3 / f3);
                        } else {
                            i4 = (int) (i4 * f3);
                        }
                        return erny.f(qsl.a(((qqo) ((qqo) dcqaVar.b.b().Y(z3 ? new qtq(new rct(), new crkj()) : new rct())).Q(i3, i4)).m(bArr)), new emwl() { // from class: dcpy
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                dcqa dcqaVar2 = dcqa.this;
                                dcqb dcqbVar = dclvVar;
                                final Bitmap bitmap = (Bitmap) obj2;
                                try {
                                    dcqbVar.d(dcqaVar2.a(new dcpz() { // from class: dcpw
                                        @Override // defpackage.dcpz
                                        public final void a(OutputStream outputStream) {
                                            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, outputStream);
                                        }
                                    }));
                                    int i6 = i4;
                                    dcqbVar.e(i3);
                                    dcqbVar.c(i6);
                                    dcqbVar.b(0L);
                                    ((dclv) dcqbVar).b = "image/jpeg";
                                    return dcqbVar.a();
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }, dcqaVar.a);
                    }
                }, erpp.a);
                return dcozVar.l;
            }
        }, this.u);
    }

    public final void e() {
        if (this.e) {
            this.e = false;
            this.g = null;
            B();
            final MediaActionSound mediaActionSound = this.j;
            if (mediaActionSound != null) {
                this.y.execute(eldl.l(new Runnable() { // from class: dcns
                    @Override // java.lang.Runnable
                    public final void run() {
                        mediaActionSound.release();
                    }
                }));
                this.j = null;
            }
            axos.a(new Runnable() { // from class: dcnu
                @Override // java.lang.Runnable
                public final void run() {
                    dcoz.this.g();
                }
            }, this.u);
        }
    }

    public final void f(final Consumer consumer) {
        axos.a(new Runnable() { // from class: dcou
            @Override // java.lang.Runnable
            public final void run() {
                Camera camera = dcoz.this.i;
                if (camera != null) {
                    consumer.o(camera);
                }
            }
        }, this.u);
    }

    public final void g() {
        A();
        if (this.i == null) {
            return;
        }
        csix.f(this.s.isDone());
        D();
        ensk o = a.o();
        o.Y(dcse.a, Integer.valueOf(this.d));
        ((ensz) o.h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "internalCloseCamera", 636, "CameraManager.java")).q("Releasing camera");
        Camera camera = this.i;
        if (camera != null) {
            camera.release();
        }
        this.i = null;
        final dcri dcriVar = this.q;
        dcriVar.getClass();
        axos.a(new Runnable() { // from class: dcnk
            @Override // java.lang.Runnable
            public final void run() {
                dcri.this.c();
            }
        }, this.x);
    }

    public final void h(int i) {
        A();
        if (this.i == null && i == this.d) {
            boolean z = true;
            this.t.set(true);
            try {
                entd entdVar = a;
                ensk o = entdVar.o();
                ensn ensnVar = dcse.a;
                Integer valueOf = Integer.valueOf(i);
                o.Y(ensnVar, valueOf);
                ((ensz) o.h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "internalOpenCamera", 567, "CameraManager.java")).q("Opening camera");
                D();
                Camera open = Camera.open(i);
                this.i = open;
                r(open);
                ensk o2 = entdVar.o();
                o2.Y(dcse.a, valueOf);
                ensz enszVar = (ensz) o2.h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "internalOpenCamera", 574, "CameraManager.java");
                if (this.i == null) {
                    z = false;
                }
                enszVar.t("Opened camera %s", Boolean.valueOf(z));
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    public final void i() {
        if (this.o != a()) {
            f(new Consumer() { // from class: dcoc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    dcoz dcozVar = dcoz.this;
                    dcozVar.u((Camera) obj, dcozVar.n);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    public final void j(String str) {
        ctcp ctcpVar = new ctcp();
        ctcpVar.a = new ctcm("file:///product/media/audio/ui/".concat(str));
        ctcpVar.b = Optional.of(new ctcm("file:///system/media/audio/ui/".concat(str)));
        ctcpVar.b(G);
        ctcpVar.d(0.5f);
        axnw.h(this.K.a(ctcpVar.a()).e(ctcz.class, new emwl() { // from class: dcod
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((ensz) ((ensz) ((ensz) dcoz.a.j()).g((ctcz) obj)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "playSystemSound", 1384, "CameraManager.java")).q("Failed to play system sound");
                return ctck.c(2);
            }
        }, erpp.a));
    }

    public final void k(dcpe dcpeVar, boolean z) {
        if (z) {
            this.M.add(dcpeVar);
            if (dcpeVar.c() && dcpeVar != this.g) {
                this.l.cancel(false);
                csix.k(dcpeVar.c());
                dcpeVar.setOnTouchListener(new dcov(this));
                this.g = dcpeVar;
                f(new dcni(this));
            }
        } else {
            this.M.remove(dcpeVar);
        }
        if (this.M.isEmpty()) {
            e();
            return;
        }
        if (this.e) {
            return;
        }
        this.t.set(true);
        this.e = true;
        if (this.d == -1) {
            int z2 = z(0);
            this.d = z2;
            Camera.getCameraInfo(z2, this.I);
        }
        axos.a(new Runnable() { // from class: dcos
            @Override // java.lang.Runnable
            public final void run() {
                dcoz dcozVar = dcoz.this;
                try {
                    dcozVar.h(dcozVar.d);
                } finally {
                    dcozVar.t.set(false);
                }
            }
        }, this.u);
        if (!((Boolean) ((cfup) F.get()).e()).booleanValue()) {
            this.j = new MediaActionSound();
            this.J = elfo.g(new Callable() { // from class: dcnn
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    dcoz dcozVar = dcoz.this;
                    MediaActionSound mediaActionSound = dcozVar.j;
                    mediaActionSound.getClass();
                    mediaActionSound.load(0);
                    dcozVar.j.load(2);
                    dcozVar.j.load(3);
                    return null;
                }
            }, this.y);
        } else {
            final MediaActionSound mediaActionSound = new MediaActionSound();
            this.j = mediaActionSound;
            this.J = elfo.g(new Callable() { // from class: dcoa
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int[] iArr = dcoz.c;
                    int length = iArr.length;
                    for (int i = 0; i < 3; i++) {
                        MediaActionSound mediaActionSound2 = mediaActionSound;
                        dcoz dcozVar = dcoz.this;
                        int i2 = iArr[i];
                        if (mediaActionSound2 == dcozVar.j) {
                            mediaActionSound2.load(i2);
                        }
                    }
                    return null;
                }
            }, this.y);
        }
    }

    public final void l() {
        if (this.e) {
            f(new dcni(this));
        }
    }

    public final void m(boolean z) {
        this.r = z;
        f(new Consumer() { // from class: dcom
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                dcoz.this.t((Camera) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void n(final String str) {
        f(new Consumer() { // from class: dcop
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                Camera camera = (Camera) obj;
                entd entdVar = dcoz.a;
                Camera.Parameters parameters = camera.getParameters();
                String str2 = str;
                if (dcoz.w(parameters, str2)) {
                    camera.stopPreview();
                    parameters.setFlashMode(str2);
                    camera.setParameters(parameters);
                    camera.startPreview();
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void o(RenderOverlay renderOverlay) {
        dcrr dcrrVar = null;
        if (renderOverlay != null) {
            Iterator it = renderOverlay.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dcrt dcrtVar = (dcrt) it.next();
                if (dcrtVar instanceof dcrr) {
                    dcrrVar = (dcrr) dcrtVar;
                    break;
                }
            }
        }
        this.q.d = dcrrVar;
    }

    final void p() {
        dcqe dcqeVar = this.C;
        if (dcqeVar != null) {
            dcqeVar.a.c();
        }
        dcre dcreVar = this.B;
        if (dcreVar != null) {
            exle exleVar = dcreVar.a;
            if (exleVar.b) {
                exleVar.b();
            }
        }
    }

    public final void q() {
        csix.k(this.d >= 0);
        final int z = z(this.I.facing != 1 ? 1 : 0);
        if (x() || C() || this.d == z) {
            return;
        }
        this.t.set(true);
        B();
        this.d = z;
        Camera.getCameraInfo(z, this.I);
        axos.a(new Runnable() { // from class: dcnt
            @Override // java.lang.Runnable
            public final void run() {
                dcoz dcozVar = dcoz.this;
                int i = z;
                try {
                    try {
                        if (dcozVar.e) {
                            if (dcozVar.i != null) {
                                dcozVar.g();
                            }
                            dcozVar.h(i);
                        }
                    } catch (RuntimeException e) {
                        ensz enszVar = (ensz) dcoz.a.i();
                        enszVar.Y(dcse.a, Integer.valueOf(i));
                        ((ensz) ((ensz) enszVar.g(e)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "selectCameraByIndex", 475, "CameraManager.java")).q("RuntimeException in CameraManager.selectCameraByIndex");
                    }
                } finally {
                    dcozVar.t.set(false);
                }
            }
        }, this.u);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012b A[Catch: RuntimeException -> 0x01fb, IOException | RuntimeException -> 0x01fd, TryCatch #2 {IOException | RuntimeException -> 0x01fd, blocks: (B:10:0x0023, B:11:0x00af, B:13:0x00b5, B:16:0x00c3, B:17:0x00c6, B:19:0x00d9, B:20:0x0176, B:23:0x01d7, B:26:0x01e1, B:28:0x01ee, B:33:0x019e, B:35:0x01a6, B:38:0x01b5, B:41:0x01c0, B:43:0x01ce, B:46:0x00e1, B:48:0x00e8, B:50:0x00f2, B:53:0x0105, B:58:0x011b, B:63:0x0127, B:65:0x012b, B:66:0x0133), top: B:9:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0133 A[Catch: RuntimeException -> 0x01fb, IOException | RuntimeException -> 0x01fd, TryCatch #2 {IOException | RuntimeException -> 0x01fd, blocks: (B:10:0x0023, B:11:0x00af, B:13:0x00b5, B:16:0x00c3, B:17:0x00c6, B:19:0x00d9, B:20:0x0176, B:23:0x01d7, B:26:0x01e1, B:28:0x01ee, B:33:0x019e, B:35:0x01a6, B:38:0x01b5, B:41:0x01c0, B:43:0x01ce, B:46:0x00e1, B:48:0x00e8, B:50:0x00f2, B:53:0x0105, B:58:0x011b, B:63:0x0127, B:65:0x012b, B:66:0x0133), top: B:9:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(android.hardware.Camera r11) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcoz.r(android.hardware.Camera):void");
    }

    public final void s(dcpe dcpeVar) {
        this.M.remove(dcpeVar);
        if (this.M.isEmpty()) {
            e();
        }
    }

    public final void t(Camera camera) {
        String str;
        A();
        try {
            Camera.Parameters parameters = camera.getParameters();
            boolean z = this.r;
            boolean x = x();
            if (z) {
                str = "torch";
                if (true != x) {
                    str = "on";
                }
            } else {
                str = "off";
            }
            if (w(parameters, str)) {
                parameters.setFlashMode(str);
            }
            camera.setParameters(parameters);
        } catch (RuntimeException e) {
            ((ensz) ((ensz) ((ensz) a.i()).g(e)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "updateCameraFlashMode", (char) 1085, "CameraManager.java")).q("RuntimeException in CameraManager.updateCameraOrientation");
        }
    }

    final void u(Camera camera, int i) {
        int i2;
        A();
        csix.a(0, i % 90);
        if (this.g == null || C() || x()) {
            return;
        }
        this.o = a();
        this.n = i;
        this.p = true;
        if (this.I.facing == 1) {
            this.k = (this.I.orientation + this.n) % 360;
            i2 = (720 - (this.I.orientation + this.o)) % 360;
        } else {
            i2 = ((this.I.orientation - this.o) + 360) % 360;
            this.k = ((this.I.orientation - this.n) + 360) % 360;
        }
        if (x()) {
            return;
        }
        try {
            camera.setDisplayOrientation(i2);
            Camera.Parameters parameters = camera.getParameters();
            if (parameters != null) {
                parameters.setRotation(this.k);
                camera.setParameters(parameters);
            }
        } catch (RuntimeException e) {
            ((ensz) ((ensz) ((ensz) a.i()).g(e)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "updateCameraOrientation", (char) 1055, "CameraManager.java")).q("RuntimeException in CameraManager.updateCameraOrientation");
        }
    }

    public final boolean v() {
        return this.I.facing == 1;
    }

    public final boolean x() {
        return (this.f == null || (!this.m.isDone() && !this.m.isCancelled())) ? false : true;
    }

    public final boolean y() {
        return !this.I.canDisableShutterSound;
    }
}
