package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfxj {
    public static short A(Parcel parcel, int i) {
        M(parcel, i, 4);
        return (short) parcel.readInt();
    }

    public static void B(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new dfxi(a.h(i, "Overread allowed size end="), parcel);
        }
    }

    public static void C(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + g(parcel, i));
    }

    public static boolean D(Parcel parcel, int i) {
        M(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static byte[] E(Parcel parcel, int i) {
        int g = g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + g);
        return createByteArray;
    }

    public static double[] F(Parcel parcel, int i) {
        int g = g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + g);
        return createDoubleArray;
    }

    public static float[] G(Parcel parcel, int i) {
        int g = g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + g);
        return createFloatArray;
    }

    public static int[] H(Parcel parcel, int i) {
        int g = g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + g);
        return createIntArray;
    }

    public static long[] I(Parcel parcel, int i) {
        int g = g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + g);
        return createLongArray;
    }

    public static Object[] J(Parcel parcel, int i, Parcelable.Creator creator) {
        int g = g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + g);
        return createTypedArray;
    }

    public static String[] K(Parcel parcel, int i) {
        int g = g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + g);
        return createStringArray;
    }

    public static byte[][] L(Parcel parcel, int i) {
        int g = g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + g);
        return bArr;
    }

    private static void M(Parcel parcel, int i, int i2) {
        int g = g(parcel, i);
        if (g == i2) {
            return;
        }
        throw new dfxi("Expected size " + i2 + " got " + g + " (0x" + Integer.toHexString(g) + ")", parcel);
    }

    private static void N(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        throw new dfxi("Expected size " + i2 + " got " + i + " (0x" + Integer.toHexString(i) + ")", parcel);
    }

    public static byte a(Parcel parcel, int i) {
        M(parcel, i, 4);
        return (byte) parcel.readInt();
    }

    public static double b(Parcel parcel, int i) {
        M(parcel, i, 8);
        return parcel.readDouble();
    }

    public static float c(Parcel parcel, int i) {
        M(parcel, i, 4);
        return parcel.readFloat();
    }

    public static int d(int i) {
        return (char) i;
    }

    public static int e(Parcel parcel) {
        return parcel.readInt();
    }

    public static int f(Parcel parcel, int i) {
        M(parcel, i, 4);
        return parcel.readInt();
    }

    public static int g(Parcel parcel, int i) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static int h(Parcel parcel) {
        int readInt = parcel.readInt();
        int g = g(parcel, readInt);
        int d = d(readInt);
        int dataPosition = parcel.dataPosition();
        if (d != 20293) {
            throw new dfxi("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i = g + dataPosition;
        if (i < dataPosition || i > parcel.dataSize()) {
            throw new dfxi(a.r(i, dataPosition, "Size read is invalid start=", " end="), parcel);
        }
        return i;
    }

    public static long i(Parcel parcel, int i) {
        M(parcel, i, 8);
        return parcel.readLong();
    }

    public static PendingIntent j(Parcel parcel, int i) {
        int g = g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        PendingIntent readPendingIntentOrNullFromParcel = PendingIntent.readPendingIntentOrNullFromParcel(parcel);
        parcel.setDataPosition(dataPosition + g);
        return readPendingIntentOrNullFromParcel;
    }

    public static Bundle k(Parcel parcel, int i) {
        int g = g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + g);
        return readBundle;
    }

    public static IBinder l(Parcel parcel, int i) {
        int g = g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + g);
        return readStrongBinder;
    }

    public static Parcel m(Parcel parcel, int i) {
        int g = g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, g);
        parcel.setDataPosition(dataPosition + g);
        return obtain;
    }

    public static Parcelable n(Parcel parcel, int i, Parcelable.Creator creator) {
        int g = g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + g);
        return parcelable;
    }

    public static Boolean o(Parcel parcel, int i) {
        int g = g(parcel, i);
        if (g == 0) {
            return null;
        }
        N(parcel, g, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double p(Parcel parcel, int i) {
        int g = g(parcel, i);
        if (g == 0) {
            return null;
        }
        N(parcel, g, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static Float q(Parcel parcel, int i) {
        int g = g(parcel, i);
        if (g == 0) {
            return null;
        }
        N(parcel, g, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static Integer r(Parcel parcel, int i) {
        int g = g(parcel, i);
        if (g == 0) {
            return null;
        }
        N(parcel, g, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static Long s(Parcel parcel, int i) {
        int g = g(parcel, i);
        if (g == 0) {
            return null;
        }
        N(parcel, g, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static String t(Parcel parcel, int i) {
        int g = g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + g);
        return readString;
    }

    public static BigDecimal u(Parcel parcel, int i) {
        int g = g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + g);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public static BigInteger v(Parcel parcel, int i) {
        int g = g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + g);
        return new BigInteger(createByteArray);
    }

    public static ArrayList w(Parcel parcel, int i) {
        int g = g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + g);
        return arrayList;
    }

    public static ArrayList x(Parcel parcel, int i) {
        int g = g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(dataPosition + g);
        return arrayList;
    }

    public static ArrayList y(Parcel parcel, int i) {
        int g = g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + g);
        return createStringArrayList;
    }

    public static ArrayList z(Parcel parcel, int i, Parcelable.Creator creator) {
        int g = g(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (g == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + g);
        return createTypedArrayList;
    }
}
