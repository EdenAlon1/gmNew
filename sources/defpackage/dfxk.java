package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfxk {
    public static void A(Parcel parcel, int i, Long l) {
        if (l == null) {
            return;
        }
        F(parcel, i, 8);
        parcel.writeLong(l.longValue());
    }

    public static void B(Parcel parcel, PendingIntent pendingIntent) {
        int b = b(parcel, 1);
        PendingIntent.writePendingIntentOrNullToParcel(pendingIntent, parcel);
        c(parcel, b);
    }

    public static void C(Parcel parcel, int i, String[] strArr) {
        if (strArr == null) {
            return;
        }
        int b = b(parcel, i);
        parcel.writeStringArray(strArr);
        c(parcel, b);
    }

    public static void D(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int b = b(parcel, i);
        parcel.writeStringList(list);
        c(parcel, b);
    }

    public static void E(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr == null) {
            return;
        }
        int b = b(parcel, i);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                G(parcel, parcelable, i2);
            }
        }
        c(parcel, b);
    }

    private static void F(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    private static void G(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    public static int a(Parcel parcel) {
        return b(parcel, 20293);
    }

    public static int b(Parcel parcel, int i) {
        parcel.writeInt(i | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void c(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static void d(Parcel parcel, int i, boolean z) {
        F(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    public static void e(Parcel parcel, int i, byte b) {
        F(parcel, i, 4);
        parcel.writeInt(b);
    }

    public static void f(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                F(parcel, i, 0);
            }
        } else {
            int b = b(parcel, i);
            parcel.writeByteArray(bArr);
            c(parcel, b);
        }
    }

    public static void g(Parcel parcel, int i, double d) {
        F(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void h(Parcel parcel, int i, float f) {
        F(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void i(Parcel parcel, int i, int i2) {
        F(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void j(Parcel parcel, int i, long j) {
        F(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void k(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable == null) {
            if (z) {
                F(parcel, i, 0);
            }
        } else {
            int b = b(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            c(parcel, b);
        }
    }

    public static void l(Parcel parcel, int i, short s) {
        F(parcel, i, 4);
        parcel.writeInt(s);
    }

    public static void m(Parcel parcel, int i, String str, boolean z) {
        if (str == null) {
            if (z) {
                F(parcel, i, 0);
            }
        } else {
            int b = b(parcel, i);
            parcel.writeString(str);
            c(parcel, b);
        }
    }

    public static void n(Parcel parcel, int i, List list, boolean z) {
        if (list == null) {
            if (z) {
                F(parcel, i, 0);
                return;
            }
            return;
        }
        int b = b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Parcelable parcelable = (Parcelable) list.get(i2);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                G(parcel, parcelable, 0);
            }
        }
        c(parcel, b);
    }

    public static void o(Parcel parcel, int i, Boolean bool) {
        if (bool == null) {
            return;
        }
        F(parcel, i, 4);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void p(Parcel parcel, int i, Bundle bundle) {
        if (bundle == null) {
            return;
        }
        int b = b(parcel, i);
        parcel.writeBundle(bundle);
        c(parcel, b);
    }

    public static void q(Parcel parcel, int i, byte[][] bArr) {
        if (bArr == null) {
            return;
        }
        int b = b(parcel, i);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        c(parcel, b);
    }

    public static void r(Parcel parcel, int i, Double d) {
        if (d == null) {
            return;
        }
        F(parcel, i, 8);
        parcel.writeDouble(d.doubleValue());
    }

    public static void s(Parcel parcel, float[] fArr) {
        if (fArr == null) {
            return;
        }
        int b = b(parcel, 1);
        parcel.writeFloatArray(fArr);
        c(parcel, b);
    }

    public static void t(Parcel parcel, int i, Float f) {
        if (f == null) {
            return;
        }
        F(parcel, i, 4);
        parcel.writeFloat(f.floatValue());
    }

    public static void u(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        int b = b(parcel, i);
        parcel.writeStrongBinder(iBinder);
        c(parcel, b);
    }

    public static void v(Parcel parcel, int i, int[] iArr) {
        if (iArr == null) {
            return;
        }
        int b = b(parcel, i);
        parcel.writeIntArray(iArr);
        c(parcel, b);
    }

    public static void w(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int b = b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeInt(((Integer) list.get(i2)).intValue());
        }
        c(parcel, b);
    }

    public static void x(Parcel parcel, int i, Integer num) {
        if (num == null) {
            return;
        }
        F(parcel, i, 4);
        parcel.writeInt(num.intValue());
    }

    public static void y(Parcel parcel, int i, long[] jArr) {
        if (jArr == null) {
            return;
        }
        int b = b(parcel, i);
        parcel.writeLongArray(jArr);
        c(parcel, b);
    }

    public static void z(Parcel parcel, int i, List list) {
        if (list == null) {
            return;
        }
        int b = b(parcel, i);
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeLong(((Long) list.get(i2)).longValue());
        }
        c(parcel, b);
    }
}
