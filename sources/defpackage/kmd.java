package defpackage;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmd extends knb {
    private IconCompat a;
    private IconCompat b;
    private boolean c;
    private boolean d;

    private static IconCompat g(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            return kqk.e((Icon) parcelable);
        }
        if (parcelable instanceof Bitmap) {
            return IconCompat.g((Bitmap) parcelable);
        }
        return null;
    }

    @Override // defpackage.knb
    protected final String a() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // defpackage.knb
    public final void b(kls klsVar) {
        Bitmap bitmap;
        kni kniVar = (kni) klsVar;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(kniVar.b).setBigContentTitle(this.h);
        if (this.a != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                kmc.a(bigContentTitle, kqk.c(this.a, kniVar.a));
            } else if (this.a.b() == 1) {
                IconCompat iconCompat = this.a;
                int i = iconCompat.b;
                if (i == -1) {
                    Object obj = iconCompat.c;
                    bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmap = (Bitmap) iconCompat.c;
                } else {
                    if (i != 5) {
                        Objects.toString(iconCompat);
                        throw new IllegalStateException("called getBitmap() on ".concat(iconCompat.toString()));
                    }
                    Bitmap bitmap2 = (Bitmap) iconCompat.c;
                    int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                    Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    Paint paint = new Paint(3);
                    paint.setColor(0);
                    float f = min;
                    float f2 = 0.010416667f * f;
                    paint.setShadowLayer(f2, 0.0f, 0.020833334f * f, 1023410176);
                    float f3 = f * 0.5f;
                    float f4 = 0.9166667f * f3;
                    canvas.drawCircle(f3, f3, f4, paint);
                    paint.setShadowLayer(f2, 0.0f, 0.0f, 503316480);
                    canvas.drawCircle(f3, f3, f4, paint);
                    paint.clearShadowLayer();
                    paint.setColor(-16777216);
                    BitmapShader bitmapShader = new BitmapShader(bitmap2, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                    Matrix matrix = new Matrix();
                    matrix.setTranslate((-(bitmap2.getWidth() - min)) / 2.0f, (-(bitmap2.getHeight() - min)) / 2.0f);
                    bitmapShader.setLocalMatrix(matrix);
                    paint.setShader(bitmapShader);
                    canvas.drawCircle(f3, f3, f4, paint);
                    canvas.setBitmap(null);
                    bitmap = createBitmap;
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmap);
            }
        }
        if (this.c) {
            IconCompat iconCompat2 = this.b;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                kmb.a(bigContentTitle, kqk.c(iconCompat2, kniVar.a));
            }
        }
        if (this.j) {
            bigContentTitle.setSummaryText(this.i);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            kmc.c(bigContentTitle, this.d);
            kmc.b(bigContentTitle, null);
        }
    }

    @Override // defpackage.knb
    protected final void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.largeIcon.big");
        bundle.remove("android.picture");
        bundle.remove("android.pictureIcon");
        bundle.remove("android.showBigPictureWhenCollapsed");
    }

    @Override // defpackage.knb
    protected final void d(Bundle bundle) {
        super.d(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.b = g(bundle.getParcelable("android.largeIcon.big"));
            this.c = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        this.a = parcelable != null ? g(parcelable) : g(bundle.getParcelable("android.pictureIcon"));
        this.d = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }

    public final void e(Bitmap bitmap) {
        this.b = bitmap == null ? null : IconCompat.g(bitmap);
        this.c = true;
    }

    public final void f(Bitmap bitmap) {
        this.a = bitmap == null ? null : IconCompat.g(bitmap);
    }
}
