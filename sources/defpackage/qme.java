package defpackage;

import com.android.ex.photo.views.PhotoView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qme implements Runnable {
    final /* synthetic */ PhotoView a;

    public qme(PhotoView photoView) {
        this.a = photoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float a = this.a.a();
        if (a > 0.0f) {
            int width = this.a.getWidth() / 2;
            int height = this.a.getHeight() / 2;
            float f = 1.0f / (1.0f - (0.0f / a));
            float f2 = 1.0f - f;
            float f3 = this.a.c.left * f2;
            float f4 = this.a.c.top * f2;
            float width2 = this.a.getWidth();
            float f5 = this.a.c.right * f2;
            float height2 = this.a.getHeight();
            float f6 = this.a.c.bottom * f2;
            float f7 = (width2 * f) + f5;
            float min = f7 > f3 ? (f7 + f3) / 2.0f : Math.min(Math.max(f7, width), f3);
            float f8 = (height2 * f) + f6;
            float min2 = f8 > f4 ? (f8 + f4) / 2.0f : Math.min(Math.max(f8, height), f4);
            qmf qmfVar = this.a.b;
            if (qmfVar.i) {
                return;
            }
            qmfVar.b = min;
            qmfVar.c = min2;
            qmfVar.e = 0.0f;
            qmfVar.h = System.currentTimeMillis();
            qmfVar.f = a;
            float f9 = qmfVar.e;
            qmfVar.d = a < 0.0f;
            qmfVar.g = (-a) / 200.0f;
            qmfVar.i = true;
            qmfVar.j = false;
            qmfVar.a.post(qmfVar);
        }
    }
}
