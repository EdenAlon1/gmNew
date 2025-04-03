package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcri {
    public boolean b;
    public boolean c;
    public dcrr d;
    public int e;
    public int f;
    public boolean g;
    public List h;
    public List i;
    public Camera.Parameters k;
    public final Handler l;
    public final dcrg m;
    public int a = 0;
    public String j = "auto";
    private final Matrix n = new Matrix();

    public dcri(dcrg dcrgVar, Looper looper) {
        this.l = new dcrh(this, looper);
        this.m = dcrgVar;
    }

    public static boolean f(String str, List list) {
        return list != null && list.contains(str);
    }

    private final void h() {
        dcrr dcrrVar = this.d;
        if (dcrrVar == null) {
            return;
        }
        dcrrVar.a();
        this.h = null;
        this.i = null;
    }

    public final void a(int i, int i2, float f, int i3, int i4, int i5, int i6, Rect rect) {
        int i7 = (int) (i * f);
        int i8 = i5 - i7;
        int i9 = (int) (i2 * f);
        int i10 = i6 - i9;
        RectF rectF = new RectF(i8 > 0 ? cskf.c(i3 - (i7 / 2), 0, i8) : 0, i10 > 0 ? cskf.c(i4 - (i9 / 2), 0, i10) : 0, r6 + i7, i9 + r0);
        this.n.mapRect(rectF);
        rect.left = Math.round(rectF.left);
        rect.top = Math.round(rectF.top);
        rect.right = Math.round(rectF.right);
        rect.bottom = Math.round(rectF.bottom);
    }

    public final void b() {
        csjy.l("Bugle", "Cancel autofocus.");
        h();
        ((dcoz) this.m).f(new Consumer() { // from class: dcoj
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Camera camera = (Camera) obj;
                entd entdVar = dcoz.a;
                try {
                    camera.cancelAutoFocus();
                } catch (RuntimeException e) {
                    ((ensz) ((ensz) ((ensz) dcoz.a.i()).g(e)).h("com/google/android/apps/messaging/ui/mediapicker/camera/CameraManager", "cancelAutoFocus", (char) 1286, "CameraManager.java")).q("RuntimeException in CameraManager.cancelAutoFocus");
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.a = 0;
        e();
        this.l.removeMessages(0);
    }

    public final void c() {
        this.a = 0;
        h();
        e();
    }

    public final void d() {
        if (this.e == 0 || this.f == 0) {
            return;
        }
        Matrix matrix = new Matrix();
        boolean z = this.g;
        int i = this.e;
        int i2 = this.f;
        matrix.setScale(true != z ? 1.0f : -1.0f, 1.0f);
        matrix.postRotate(0.0f);
        float f = i;
        float f2 = i2;
        matrix.postScale(f / 2000.0f, f2 / 2000.0f);
        matrix.postTranslate(f / 2.0f, f2 / 2.0f);
        matrix.invert(this.n);
    }

    public final void e() {
        dcrr dcrrVar = this.d;
        if (dcrrVar == null) {
            return;
        }
        int i = this.a;
        if (i == 0) {
            if (this.h == null) {
                dcrrVar.a();
                return;
            } else {
                dcrrVar.b();
                return;
            }
        }
        if (i == 1 || i == 2) {
            dcrrVar.b();
            return;
        }
        if ("continuous-picture".equals(this.j)) {
            dcrrVar.c(false);
            return;
        }
        int i2 = this.a;
        if (i2 == 3) {
            dcrrVar.c(false);
        } else if (i2 == 4 && dcrrVar.g == 1) {
            dcrrVar.m(false, dcrrVar.n);
            dcrrVar.g = 2;
            dcrrVar.o = false;
        }
    }

    public final void g(boolean z) {
        int i = this.a;
        if (i == 2) {
            if (z) {
                this.a = 3;
            } else {
                this.a = 4;
            }
            e();
            return;
        }
        if (i == 1) {
            if (z) {
                this.a = 3;
            } else {
                this.a = 4;
            }
            e();
            if (this.h != null) {
                this.l.sendEmptyMessageDelayed(0, 3000L);
            }
        }
    }
}
