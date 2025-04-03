package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import defpackage.pcl;
import java.nio.charset.Charset;

/* compiled from: PG */
/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(pcl pclVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.b = pclVar.b(iconCompat.b, 1);
        byte[] bArr = iconCompat.d;
        if (pclVar.A(2)) {
            bArr = pclVar.B();
        }
        iconCompat.d = bArr;
        iconCompat.e = pclVar.d(iconCompat.e, 3);
        iconCompat.f = pclVar.b(iconCompat.f, 4);
        iconCompat.g = pclVar.b(iconCompat.g, 5);
        iconCompat.h = (ColorStateList) pclVar.d(iconCompat.h, 6);
        iconCompat.j = pclVar.j(iconCompat.j, 7);
        iconCompat.k = pclVar.j(iconCompat.k, 8);
        iconCompat.i = PorterDuff.Mode.valueOf(iconCompat.j);
        switch (iconCompat.b) {
            case -1:
                Parcelable parcelable = iconCompat.e;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.c = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.e;
                if (parcelable2 != null) {
                    iconCompat.c = parcelable2;
                    return iconCompat;
                }
                byte[] bArr2 = iconCompat.d;
                iconCompat.c = bArr2;
                iconCompat.b = 3;
                iconCompat.f = 0;
                iconCompat.g = bArr2.length;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                iconCompat.c = new String(iconCompat.d, Charset.forName("UTF-16"));
                if (iconCompat.b == 2 && iconCompat.k == null) {
                    iconCompat.k = ((String) iconCompat.c).split(":", -1)[0];
                    return iconCompat;
                }
                return iconCompat;
            case 3:
                iconCompat.c = iconCompat.d;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, pcl pclVar) {
        iconCompat.j = iconCompat.i.name();
        switch (iconCompat.b) {
            case -1:
                iconCompat.e = (Parcelable) iconCompat.c;
                break;
            case 1:
            case 5:
                iconCompat.e = (Parcelable) iconCompat.c;
                break;
            case 2:
                iconCompat.d = ((String) iconCompat.c).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.d = (byte[]) iconCompat.c;
                break;
            case 4:
            case 6:
                iconCompat.d = iconCompat.c.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.b;
        if (i != -1) {
            pclVar.s(i, 1);
        }
        byte[] bArr = iconCompat.d;
        if (bArr != null) {
            pclVar.l(2);
            pclVar.o(bArr);
        }
        Parcelable parcelable = iconCompat.e;
        if (parcelable != null) {
            pclVar.u(parcelable, 3);
        }
        int i2 = iconCompat.f;
        if (i2 != 0) {
            pclVar.s(i2, 4);
        }
        int i3 = iconCompat.g;
        if (i3 != 0) {
            pclVar.s(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.h;
        if (colorStateList != null) {
            pclVar.u(colorStateList, 6);
        }
        String str = iconCompat.j;
        if (str != null) {
            pclVar.w(str, 7);
        }
        String str2 = iconCompat.k;
        if (str2 != null) {
            pclVar.w(str2, 8);
        }
    }
}
