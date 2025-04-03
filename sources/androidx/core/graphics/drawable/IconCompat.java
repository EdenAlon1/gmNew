package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.a;
import defpackage.kqk;
import defpackage.ksq;

/* compiled from: PG */
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public int b;
    public Object c;
    public byte[] d;
    public Parcelable e;
    public int f;
    public int g;
    public ColorStateList h;
    public PorterDuff.Mode i;
    public String j;
    public String k;

    public IconCompat() {
        this.b = -1;
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = a;
        this.j = null;
    }

    public static IconCompat f(Bundle bundle) {
        int i = bundle.getInt(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        IconCompat iconCompat = new IconCompat(i);
        iconCompat.f = bundle.getInt("int1");
        iconCompat.g = bundle.getInt("int2");
        iconCompat.k = bundle.getString("string1");
        if (bundle.containsKey("tint_list")) {
            iconCompat.h = (ColorStateList) bundle.getParcelable("tint_list");
        }
        if (bundle.containsKey("tint_mode")) {
            iconCompat.i = PorterDuff.Mode.valueOf(bundle.getString("tint_mode"));
        }
        switch (i) {
            case -1:
            case 1:
            case 5:
                iconCompat.c = bundle.getParcelable("obj");
                return iconCompat;
            case 0:
            default:
                Log.w("IconCompat", a.h(i, "Unknown type "));
                return null;
            case 2:
            case 4:
            case 6:
                iconCompat.c = bundle.getString("obj");
                return iconCompat;
            case 3:
                iconCompat.c = bundle.getByteArray("obj");
                return iconCompat;
        }
    }

    public static IconCompat g(Bitmap bitmap) {
        ksq.a(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.c = bitmap;
        return iconCompat;
    }

    public static IconCompat h(Context context, int i) {
        ksq.a(context);
        return i(context.getResources(), context.getPackageName(), i);
    }

    public static IconCompat i(Resources resources, String str, int i) {
        ksq.a(str);
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f = i;
        if (resources != null) {
            try {
                iconCompat.c = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.c = str;
        }
        iconCompat.k = str;
        return iconCompat;
    }

    public static IconCompat k(byte[] bArr, int i) {
        ksq.a(bArr);
        IconCompat iconCompat = new IconCompat(3);
        iconCompat.c = bArr;
        iconCompat.f = 0;
        iconCompat.g = i;
        return iconCompat;
    }

    public final int a() {
        int i = this.b;
        if (i == -1) {
            return kqk.a(this.c);
        }
        if (i == 2) {
            return this.f;
        }
        toString();
        throw new IllegalStateException("called getResId() on ".concat(toString()));
    }

    public final int b() {
        int i = this.b;
        return i == -1 ? kqk.b(this.c) : i;
    }

    @Deprecated
    public final Icon c() {
        return kqk.c(this, null);
    }

    public final Uri d() {
        int i = this.b;
        if (i == -1) {
            return kqk.d(this.c);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.c);
        }
        toString();
        throw new IllegalStateException("called getUri() on ".concat(toString()));
    }

    public final Bundle e() {
        Bundle bundle = new Bundle();
        switch (this.b) {
            case -1:
                bundle.putParcelable("obj", (Parcelable) this.c);
                break;
            case 0:
            default:
                throw new IllegalArgumentException("Invalid icon");
            case 1:
            case 5:
                bundle.putParcelable("obj", (Bitmap) this.c);
                break;
            case 2:
            case 4:
            case 6:
                bundle.putString("obj", (String) this.c);
                break;
            case 3:
                bundle.putByteArray("obj", (byte[]) this.c);
                break;
        }
        bundle.putInt(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, this.b);
        bundle.putInt("int1", this.f);
        bundle.putInt("int2", this.g);
        bundle.putString("string1", this.k);
        ColorStateList colorStateList = this.h;
        if (colorStateList != null) {
            bundle.putParcelable("tint_list", colorStateList);
        }
        PorterDuff.Mode mode = this.i;
        if (mode != a) {
            bundle.putString("tint_mode", mode.name());
        }
        return bundle;
    }

    public final String j() {
        int i = this.b;
        if (i == -1) {
            return kqk.f(this.c);
        }
        if (i == 2) {
            String str = this.k;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.c).split(":", -1)[0] : this.k;
        }
        toString();
        throw new IllegalStateException("called getResPackage() on ".concat(toString()));
    }

    public final String toString() {
        String str;
        if (this.b == -1) {
            return String.valueOf(this.c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.b) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.c).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.c).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.k);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(a())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f);
                if (this.g != 0) {
                    sb.append(" off=");
                    sb.append(this.g);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.c);
                break;
        }
        if (this.h != null) {
            sb.append(" tint=");
            sb.append(this.h);
        }
        if (this.i != a) {
            sb.append(" mode=");
            sb.append(this.i);
        }
        sb.append(")");
        return sb.toString();
    }

    public IconCompat(int i) {
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = a;
        this.j = null;
        this.b = i;
    }
}
