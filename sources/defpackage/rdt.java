package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rdt {
    private static final rjz a = new rjy(new rjz() { // from class: rds
        @Override // defpackage.rjz
        public final Object a() {
            Bitmap.Config config;
            if (Build.VERSION.SDK_INT == 34) {
                Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ALPHA_8);
                config = Bitmap.Config.HARDWARE;
                Bitmap copy = createBitmap.copy(config, false);
                createBitmap.recycle();
                r2 = copy == null;
                if (Log.isLoggable("GainmapWorkaroundCalc", 2)) {
                    Log.v("GainmapWorkaroundCalc", a.q(r2, "calculateNeedsGainmapDecodeWorkaround="));
                }
                if (copy != null) {
                    copy.recycle();
                }
            }
            return Boolean.valueOf(r2);
        }
    });

    public static boolean a(BitmapFactory.Options options) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT != 34) {
            return false;
        }
        Bitmap.Config config2 = options.inPreferredConfig;
        config = Bitmap.Config.HARDWARE;
        if (config2 == config) {
            return ((Boolean) a.a()).booleanValue();
        }
        return false;
    }
}
