package defpackage;

import com.android.ex.photo.views.PhotoView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qmg implements Runnable {
    public final PhotoView a;
    public float b;
    public float c;
    public long d = -1;
    public boolean e;
    public boolean f;

    public qmg(PhotoView photoView) {
        this.a = photoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        float f2;
        if (this.f) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.d;
        float f3 = j != -1 ? currentTimeMillis - j : 0.0f;
        if (j == -1) {
            this.d = currentTimeMillis;
        }
        if (f3 >= 100.0f) {
            f2 = this.b;
            f = this.c;
        } else {
            float f4 = 100.0f - f3;
            float f5 = this.b / f4;
            float f6 = this.c / f4;
            float f7 = f5 * 10.0f;
            if (Math.abs(f7) > Math.abs(this.b) || Float.isNaN(f7)) {
                f7 = this.b;
            }
            float f8 = 10.0f * f6;
            if (Math.abs(f8) > Math.abs(this.c) || Float.isNaN(f8)) {
                f8 = this.c;
            }
            float f9 = f7;
            f = f8;
            f2 = f9;
        }
        this.a.b(f2, f);
        float f10 = this.b - f2;
        this.b = f10;
        float f11 = this.c - f;
        this.c = f11;
        if (f10 == 0.0f && f11 == 0.0f) {
            this.e = false;
            this.f = true;
        }
        if (this.f) {
            return;
        }
        this.a.post(this);
    }
}
