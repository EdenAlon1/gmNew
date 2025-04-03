package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iax implements ich {
    public final Bitmap a;

    public iax(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // defpackage.ich
    public final int a() {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3 = this.a.getConfig();
        config3.getClass();
        if (config3 == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config3 == Bitmap.Config.RGB_565) {
            return 2;
        }
        if (config3 == Bitmap.Config.ARGB_4444) {
            return 0;
        }
        config = Bitmap.Config.RGBA_F16;
        if (config3 == config) {
            return 3;
        }
        config2 = Bitmap.Config.HARDWARE;
        return config3 == config2 ? 4 : 0;
    }

    @Override // defpackage.ich
    public final int b() {
        return this.a.getHeight();
    }

    @Override // defpackage.ich
    public final int c() {
        return this.a.getWidth();
    }

    @Override // defpackage.ich
    public final void d() {
        this.a.prepareToDraw();
    }
}
