package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kqk {
    public static int a(Object obj) {
        int resId;
        if (Build.VERSION.SDK_INT >= 28) {
            resId = ((Icon) obj).getResId();
            return resId;
        }
        try {
            return ((Integer) obj.getClass().getMethod("getResId", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon resource", e);
            return 0;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        }
    }

    public static int b(Object obj) {
        int type;
        if (Build.VERSION.SDK_INT >= 28) {
            type = ((Icon) obj).getType();
            return type;
        }
        try {
            return ((Integer) obj.getClass().getMethod("getType", new Class[0]).invoke(obj, new Object[0])).intValue();
        } catch (IllegalAccessException e) {
            Objects.toString(obj);
            Log.e("IconCompat", "Unable to get icon type ".concat(String.valueOf(obj)), e);
            return -1;
        } catch (NoSuchMethodException e2) {
            Objects.toString(obj);
            Log.e("IconCompat", "Unable to get icon type ".concat(String.valueOf(obj)), e2);
            return -1;
        } catch (InvocationTargetException e3) {
            Objects.toString(obj);
            Log.e("IconCompat", "Unable to get icon type ".concat(String.valueOf(obj)), e3);
            return -1;
        }
    }

    public static Icon c(IconCompat iconCompat, Context context) {
        Icon createWithBitmap;
        switch (iconCompat.b) {
            case -1:
                return (Icon) iconCompat.c;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                createWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.c);
                break;
            case 2:
                createWithBitmap = Icon.createWithResource(iconCompat.j(), iconCompat.f);
                break;
            case 3:
                createWithBitmap = Icon.createWithData((byte[]) iconCompat.c, iconCompat.f, iconCompat.g);
                break;
            case 4:
                createWithBitmap = Icon.createWithContentUri((String) iconCompat.c);
                break;
            case 5:
                createWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) iconCompat.c);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    createWithBitmap = Icon.createWithAdaptiveBitmapContentUri(iconCompat.d());
                    break;
                } else {
                    if (context == null) {
                        Uri d = iconCompat.d();
                        Objects.toString(d);
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: ".concat(String.valueOf(d)));
                    }
                    Uri d2 = iconCompat.d();
                    String scheme = d2.getScheme();
                    InputStream inputStream = null;
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStream = context.getContentResolver().openInputStream(d2);
                        } catch (Exception e) {
                            Objects.toString(d2);
                            Log.w("IconCompat", "Unable to load image from URI: ".concat(String.valueOf(d2)), e);
                        }
                    } else {
                        try {
                            inputStream = new FileInputStream(new File((String) iconCompat.c));
                        } catch (FileNotFoundException e2) {
                            Objects.toString(d2);
                            Log.w("IconCompat", "Unable to load image from path: ".concat(String.valueOf(d2)), e2);
                        }
                    }
                    if (inputStream == null) {
                        Uri d3 = iconCompat.d();
                        Objects.toString(d3);
                        throw new IllegalStateException("Cannot load adaptive icon from uri: ".concat(String.valueOf(d3)));
                    }
                    createWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStream));
                    break;
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.h;
        if (colorStateList != null) {
            createWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.i;
        if (mode != IconCompat.a) {
            createWithBitmap.setTintMode(mode);
        }
        return createWithBitmap;
    }

    public static Uri d(Object obj) {
        Uri uri;
        if (Build.VERSION.SDK_INT >= 28) {
            uri = ((Icon) obj).getUri();
            return uri;
        }
        try {
            return (Uri) obj.getClass().getMethod("getUri", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon uri", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        }
    }

    public static IconCompat e(Object obj) {
        ksw.h(obj);
        int b = b(obj);
        if (b == 2) {
            return IconCompat.i(null, f(obj), a(obj));
        }
        if (b == 4) {
            Uri d = d(obj);
            ksq.a(d);
            String uri = d.toString();
            ksq.a(uri);
            IconCompat iconCompat = new IconCompat(4);
            iconCompat.c = uri;
            return iconCompat;
        }
        if (b != 6) {
            IconCompat iconCompat2 = new IconCompat(-1);
            iconCompat2.c = obj;
            return iconCompat2;
        }
        Uri d2 = d(obj);
        ksq.a(d2);
        String uri2 = d2.toString();
        ksq.a(uri2);
        IconCompat iconCompat3 = new IconCompat(6);
        iconCompat3.c = uri2;
        return iconCompat3;
    }

    public static String f(Object obj) {
        String resPackage;
        if (Build.VERSION.SDK_INT >= 28) {
            resPackage = ((Icon) obj).getResPackage();
            return resPackage;
        }
        try {
            return (String) obj.getClass().getMethod("getResPackage", new Class[0]).invoke(obj, new Object[0]);
        } catch (IllegalAccessException e) {
            Log.e("IconCompat", "Unable to get icon package", e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        }
    }
}
