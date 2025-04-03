package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.Flag;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhkf implements Parcelable.Creator {
    public static boolean a(int i) {
        return i == 0;
    }

    public static boolean b(Object obj) {
        return obj == null;
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        boolean z = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        double d = 0.0d;
        long j = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 2:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 4:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 5:
                    d = dfxj.b(parcel, readInt);
                    break;
                case 6:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 7:
                    bArr = dfxj.E(parcel, readInt);
                    break;
                case 8:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 9:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 10:
                    i3 = dfxj.f(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new Flag(str, j, z, d, str2, bArr, i, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Flag[i];
    }
}
