package defpackage;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbej {
    private static final cskc a = cskc.g("BugleAction", "ParcelSerializer");
    private static final eoeg b = eoeg.e;

    public static Object a(String str, Class cls, String str2) {
        Object obj = null;
        if (TextUtils.isEmpty(str2)) {
            csjb e = a.e();
            e.I("No className found when unparceling");
            e.I(cls.toString());
            e.I(". Must be parceled via old way.");
            e.r();
            return null;
        }
        if (str == null) {
            csjb e2 = a.e();
            e2.I("No byteString found when unparceling");
            e2.I(str2);
            e2.I(". Must be parceled via old way.");
            e2.r();
            return null;
        }
        byte[] k = b.k(str);
        int length = k.length;
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(k, 0, length);
        obtain.setDataPosition(0);
        try {
            try {
                obj = cls.cast(obtain.readParcelable(cls.getClassLoader()));
            } finally {
                obtain.recycle();
            }
        } catch (BadParcelableException | ClassCastException | NullPointerException e3) {
            String str3 = new String(k, 0, Math.min(k.length, 500), StandardCharsets.UTF_16LE);
            csjb b2 = a.b();
            b2.I("Caught exception when unparceling an");
            b2.I(str2);
            b2.I("parceled data:");
            b2.I(str3);
            b2.s(e3);
        }
        return obj;
    }

    public static String b(Parcelable parcelable) {
        Parcel obtain = Parcel.obtain();
        obtain.writeParcelable(parcelable, 0);
        String j = b.j(obtain.marshall());
        obtain.recycle();
        return j;
    }

    public static String c(Parcel parcel) {
        String j = b.j(parcel.marshall());
        return j.length() < 1000 ? j : j.substring(0, 1000);
    }
}
