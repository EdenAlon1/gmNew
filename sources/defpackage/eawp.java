package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eawp {
    public final WeakReference a;
    public final Object b;
    public final ebtb c;
    public final eave d;
    public boolean e;
    private final Executor f;

    public eawp(Object obj, ebtb ebtbVar, ImageView imageView, Executor executor, eave eaveVar) {
        imageView.getClass();
        this.a = new WeakReference(imageView);
        this.c = ebtbVar;
        this.b = obj;
        this.f = executor;
        this.d = eaveVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Bitmap a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        engw engwVar = ((ebsv) this.c).c;
        if (engwVar != null && !engwVar.isEmpty()) {
            int i = ((enou) engwVar).c;
            for (int i2 = 0; i2 < i; i2++) {
                if (((ebta) engwVar.get(i2)).ordinal() == 0) {
                    Map map = eawq.a;
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int min = Math.min(width, height);
                    int i3 = min - width;
                    int i4 = min - height;
                    Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    float f = min / 2;
                    canvas.drawCircle(f, f, f, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas.drawBitmap(bitmap, i3 / 2, i4 / 2, paint);
                    bitmap = createBitmap;
                }
            }
        }
        return bitmap;
    }

    public final void b(Context context) {
        e(ebsx.a(context), true);
    }

    public final void c() {
        efbd.c();
        ImageView imageView = (ImageView) this.a.get();
        if (this.e || imageView == null) {
            return;
        }
        eawq.b(imageView, null);
    }

    public final void d(Runnable runnable) {
        if (efbd.g()) {
            this.f.execute(runnable);
        } else {
            runnable.run();
        }
    }

    public final void e(Drawable drawable, boolean z) {
        final ImageView imageView = (ImageView) this.a.get();
        if (this.e || imageView == null) {
            return;
        }
        final eawo eawoVar = new eawo(this, drawable, z);
        imageView.addOnAttachStateChangeListener(eawoVar);
        int[] iArr = kvo.a;
        if (imageView.isAttachedToWindow()) {
            imageView.post(new Runnable() { // from class: eawh
                @Override // java.lang.Runnable
                public final void run() {
                    eawoVar.onViewAttachedToWindow(imageView);
                }
            });
        }
    }
}
