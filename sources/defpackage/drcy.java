package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drcy {
    private final int a;

    public drcy(int i) {
        this.a = i;
    }

    public final Bitmap a(Bitmap bitmap) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        int i = this.a;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, config);
        createBitmap.getClass();
        createBitmap.eraseColor(0);
        Canvas canvas = new Canvas(createBitmap);
        Path path = new Path();
        float f = this.a * 0.5f;
        path.addCircle(f, f, f, Path.Direction.CCW);
        canvas.clipPath(path);
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        int width = (bitmap.getWidth() - min) / 2;
        int height = (bitmap.getHeight() - min) / 2;
        Rect rect = new Rect(width, height, width + min, min + height);
        int i2 = this.a;
        canvas.drawBitmap(bitmap, rect, new Rect(0, 0, i2, i2), (Paint) null);
        return createBitmap;
    }
}
