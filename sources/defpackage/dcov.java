package defpackage;

import android.graphics.Rect;
import android.hardware.Camera;
import android.view.MotionEvent;
import android.view.View;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcov implements View.OnTouchListener {
    final /* synthetic */ dcoz a;

    public dcov(dcoz dcozVar) {
        this.a = dcozVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if ((motionEvent.getActionMasked() & 1) == 1) {
            dcoz dcozVar = this.a;
            int width = view.getWidth();
            int height = view.getHeight();
            dcri dcriVar = dcozVar.q;
            if (dcriVar.e != width || dcriVar.f != height) {
                dcriVar.e = width;
                dcriVar.f = height;
                dcriVar.d();
            }
            dcoz dcozVar2 = this.a;
            int x = ((int) motionEvent.getX()) + view.getLeft();
            int y = ((int) motionEvent.getY()) + view.getTop();
            dcri dcriVar2 = dcozVar2.q;
            dcrr dcrrVar = dcriVar2.d;
            if (dcrrVar != null && (i = dcriVar2.a) != 2) {
                if (dcriVar2.h != null && (i == 1 || i == 3 || i == 4)) {
                    dcriVar2.b();
                }
                int j = dcrrVar.j();
                int j2 = dcrrVar.j();
                if (j != 0 && dcrrVar.d - dcrrVar.b != 0 && dcrrVar.e - dcrrVar.c != 0) {
                    int i2 = dcriVar2.e;
                    int i3 = dcriVar2.f;
                    if (dcriVar2.b) {
                        if (dcriVar2.h == null) {
                            dcriVar2.h = new ArrayList();
                            dcriVar2.h.add(new Camera.Area(new Rect(), 1));
                        }
                        dcriVar2.a(j, j2, 1.0f, x, y, i2, i3, ((Camera.Area) dcriVar2.h.get(0)).rect);
                    }
                    if (dcriVar2.c) {
                        if (dcriVar2.i == null) {
                            dcriVar2.i = new ArrayList();
                            dcriVar2.i.add(new Camera.Area(new Rect(), 1));
                        }
                        dcriVar2.a(j, j2, 1.5f, x, y, i2, i3, ((Camera.Area) dcriVar2.i.get(0)).rect);
                    }
                    dcrrVar.i = x;
                    dcrrVar.j = y;
                    dcrrVar.k(x, y);
                    final dcoz dcozVar3 = (dcoz) dcriVar2.m;
                    dcozVar3.f(new Consumer() { // from class: dcnv
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            String str;
                            dcoz dcozVar4 = dcoz.this;
                            Camera camera = (Camera) obj;
                            try {
                                Camera.Parameters parameters = camera.getParameters();
                                dcri dcriVar3 = dcozVar4.q;
                                Camera.Parameters parameters2 = dcriVar3.k;
                                if (parameters2 == null) {
                                    str = dcriVar3.j;
                                } else {
                                    List<String> supportedFocusModes = parameters2.getSupportedFocusModes();
                                    if (!dcriVar3.b || dcriVar3.h == null) {
                                        dcriVar3.j = "continuous-picture";
                                    } else {
                                        dcriVar3.j = "auto";
                                    }
                                    if (!dcri.f(dcriVar3.j, supportedFocusModes)) {
                                        if (dcri.f("auto", supportedFocusModes)) {
                                            dcriVar3.j = "auto";
                                        } else {
                                            dcriVar3.j = parameters2.getFocusMode();
                                        }
                                    }
                                    str = dcriVar3.j;
                                }
                                parameters.setFocusMode(str);
                                if (parameters.getMaxNumFocusAreas() > 0) {
                                    parameters.setFocusAreas(dcozVar4.q.h);
                                }
                                parameters.setMeteringAreas(dcozVar4.q.i);
                                camera.setParameters(parameters);
                            } catch (RuntimeException e) {
                                ((ensz) ((ensz) ((ensz) dcoz.a.i()).g(e)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "setFocusParameters", (char) 1313, "CameraManager.java")).q("RuntimeException in CameraManager setFocusParameters");
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    if (dcriVar2.b) {
                        csjy.l("Bugle", "Start autofocus.");
                        final dcoz dcozVar4 = (dcoz) dcriVar2.m;
                        dcozVar4.f(new Consumer() { // from class: dcoh
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                final dcoz dcozVar5 = dcoz.this;
                                try {
                                    ((Camera) obj).autoFocus(new Camera.AutoFocusCallback() { // from class: dcof
                                        @Override // android.hardware.Camera.AutoFocusCallback
                                        public final void onAutoFocus(final boolean z, Camera camera) {
                                            final dcoz dcozVar6 = dcoz.this;
                                            axos.a(new Runnable() { // from class: dcnw
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    dcoz.this.q.g(z);
                                                }
                                            }, dcozVar6.x);
                                        }
                                    });
                                } catch (RuntimeException e) {
                                    ((ensz) ((ensz) ((ensz) dcoz.a.i()).g(e)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "autoFocus", (char) 1265, "CameraManager.java")).q("RuntimeException in CameraManager.autoFocus");
                                    axos.a(new Runnable() { // from class: dcog
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            dcoz.this.q.g(false);
                                        }
                                    }, dcozVar5.x);
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        dcriVar2.a = 1;
                        dcriVar2.e();
                        dcriVar2.l.removeMessages(0);
                    } else {
                        dcriVar2.e();
                        dcriVar2.l.removeMessages(0);
                        dcriVar2.l.sendEmptyMessageDelayed(0, 3000L);
                    }
                }
            }
        }
        return true;
    }
}
