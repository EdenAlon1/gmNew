package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.LruCache;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.messaging.lighter.ui.avatar.ContactAvatarView;
import java.lang.ref.WeakReference;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzxu {
    private static WeakReference a = new WeakReference(null);
    private final LruCache b = new LruCache(50);

    public static synchronized dzxu a() {
        synchronized (dzxu.class) {
            dzxu dzxuVar = (dzxu) a.get();
            if (dzxuVar != null) {
                return dzxuVar;
            }
            dzxu dzxuVar2 = new dzxu();
            a = new WeakReference(dzxuVar2);
            return dzxuVar2;
        }
    }

    /* JADX WARN: Type inference failed for: r10v13, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.CharSequence, java.lang.Object] */
    public final synchronized Bitmap b(dzpb dzpbVar, int i, dzxx dzxxVar) {
        Bitmap bitmap;
        String str;
        Bitmap bitmap2;
        Bitmap bitmap3;
        int i2;
        RectF[] rectFArr;
        dzxp dzxpVar = new dzxp(dzpbVar.d(), i);
        dzxt dzxtVar = (dzxt) this.b.get(dzxpVar);
        if (dzxtVar != null && dzxtVar.c().equals(dzpbVar.g()) && dzxtVar.a() == dzpbVar.hashCode()) {
            bitmap2 = dzxtVar.b();
        }
        emxc g = dzpbVar.g();
        if (g == null) {
            throw new NullPointerException("Null imageUrl");
        }
        int hashCode = dzpbVar.hashCode();
        int i3 = dzxpVar.a;
        ContactAvatarView contactAvatarView = dzxxVar.a;
        int[] iArr = contactAvatarView.b;
        int i4 = contactAvatarView.c;
        Drawable drawable = contactAvatarView.getContext().getDrawable(R.drawable.product_logo_avatar_anonymous_white_color_48);
        if (dzpbVar.f().g()) {
            List asList = Arrays.asList((Bitmap) dzpbVar.f().c());
            if (asList.size() > 4) {
                dyhr.f("AvatarUtils", ">4 bitmaps provided. Using first 4 and ignoring the rest.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            int size = asList.size();
            float width = createBitmap.getWidth();
            float height = createBitmap.getHeight();
            if (size <= 0) {
                throw new IllegalArgumentException();
            }
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            if (size != 1) {
                i2 = 0;
                if (size == 2) {
                    bitmap3 = createBitmap;
                    float f3 = ((float) dzxr.a) * width;
                    rectFArr = new RectF[]{new RectF(0.0f, 0.0f, f3, f3), new RectF(width - f3, height - f3, width, height)};
                } else if (size != 3) {
                    rectFArr = new RectF[]{new RectF(0.0f, 0.0f, f, f2), new RectF(f, 0.0f, width, f2), new RectF(0.0f, f2, f, height), new RectF(f, f2, width, height)};
                    bitmap3 = createBitmap;
                } else {
                    float f4 = width / 4.0f;
                    float f5 = height / 4.0f;
                    bitmap3 = createBitmap;
                    float sqrt = (height - f5) - ((float) (f5 * Math.sqrt(3.0d)));
                    rectFArr = new RectF[]{new RectF(f4, sqrt - f5, 3.0f * f4, sqrt + f5), new RectF(0.0f, f2, f, height), new RectF(f, f2, width, height)};
                }
            } else {
                bitmap3 = createBitmap;
                i2 = 0;
                rectFArr = new RectF[]{new RectF(0.0f, 0.0f, width, height)};
            }
            for (int i5 = i2; i5 < rectFArr.length; i5++) {
                RectF rectF = rectFArr[i5];
                BitmapShader bitmapShader = new BitmapShader((Bitmap) asList.get(i5), Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
                Matrix matrix = new Matrix();
                matrix.setRectToRect(new RectF(0.0f, 0.0f, r7.getWidth(), r7.getHeight()), rectF, Matrix.ScaleToFit.FILL);
                bitmapShader.setLocalMatrix(matrix);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setShader(bitmapShader);
                canvas.drawRoundRect(rectF, rectF.width() / 2.0f, rectF.height() / 2.0f, paint);
            }
            bitmap = bitmap3;
        } else {
            float f6 = i3;
            int hashCode2 = dzpbVar.d().d().hashCode();
            if (dzpbVar.i().g() && !TextUtils.isEmpty(dzpbVar.i().c())) {
                Object c = dzpbVar.i().c();
                hashCode2 = ((String) c).length() > 4 ? ((String) c).substring(((String) c).length() - 4).hashCode() : ((String) c).hashCode();
            }
            int abs = Math.abs(hashCode2 % iArr.length);
            if (dzpbVar.i().g() && !dzpbVar.d().b().equals(dzpf.DEVICE_ID)) {
                char[] charArray = Normalizer.normalize(dzpbVar.i().c(), Normalizer.Form.NFKC).toCharArray();
                int length = charArray.length;
                int i6 = 0;
                while (true) {
                    if (i6 >= length) {
                        str = null;
                        break;
                    }
                    char c2 = charArray[i6];
                    if (Character.isLetter(c2)) {
                        str = Character.toString(Character.toUpperCase(c2));
                        break;
                    }
                    i6++;
                }
                if (!TextUtils.isEmpty(str)) {
                    int i7 = iArr[abs];
                    Bitmap createBitmap2 = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                    Paint paint2 = new Paint();
                    paint2.setAntiAlias(true);
                    paint2.setColor(i7);
                    float f7 = f6 / 2.0f;
                    canvas2.drawCircle(f7, f7, f7, paint2);
                    Paint paint3 = new Paint();
                    paint3.setTextAlign(Paint.Align.CENTER);
                    paint3.setColor(i4);
                    paint3.setTypeface(Typeface.create(Typeface.SANS_SERIF, 0));
                    paint3.setTextSize(f6 * 0.6f);
                    paint3.setAntiAlias(true);
                    paint3.getTextBounds(str, 0, 1, new Rect());
                    canvas2.drawText(str, f7, ((i3 + r7.bottom) - r7.top) / 2.0f, paint3);
                    bitmap = createBitmap2;
                }
            }
            int i8 = iArr[abs];
            Bitmap createBitmap3 = Bitmap.createBitmap(i3, i3, Bitmap.Config.ARGB_8888);
            Canvas canvas3 = new Canvas(createBitmap3);
            canvas3.drawColor(0, PorterDuff.Mode.CLEAR);
            Paint paint4 = new Paint();
            paint4.setAntiAlias(true);
            paint4.setColor(i8);
            float f8 = f6 / 2.0f;
            canvas3.drawCircle(f8, f8, f8, paint4);
            drawable.setBounds(new Rect(0, 0, i3, i3));
            drawable.setTint(i4);
            drawable.draw(canvas3);
            bitmap = createBitmap3;
        }
        if (bitmap == null) {
            throw new NullPointerException("Null avatar");
        }
        dzxq dzxqVar = new dzxq(bitmap, g, hashCode);
        this.b.put(dzxpVar, dzxqVar);
        bitmap2 = dzxqVar.a;
        return bitmap2;
    }
}
