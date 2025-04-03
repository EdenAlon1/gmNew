package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SearchResults;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dews implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        String str = null;
        int[] iArr = null;
        byte[] bArr = null;
        Bundle[] bundleArr = null;
        Bundle[] bundleArr2 = null;
        Bundle[] bundleArr3 = null;
        int[] iArr2 = null;
        String[] strArr = null;
        byte[] bArr2 = null;
        double[] dArr = null;
        Bundle bundle = null;
        long[] jArr = null;
        long[] jArr2 = null;
        Bundle[] bundleArr4 = null;
        int[] iArr3 = null;
        byte[] bArr3 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 2:
                    iArr = dfxj.H(parcel, readInt);
                    break;
                case 3:
                    bArr = dfxj.E(parcel, readInt);
                    break;
                case 4:
                    bundleArr = (Bundle[]) dfxj.J(parcel, readInt, Bundle.CREATOR);
                    break;
                case 5:
                    bundleArr2 = (Bundle[]) dfxj.J(parcel, readInt, Bundle.CREATOR);
                    break;
                case 6:
                    bundleArr3 = (Bundle[]) dfxj.J(parcel, readInt, Bundle.CREATOR);
                    break;
                case 7:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 8:
                    iArr2 = dfxj.H(parcel, readInt);
                    break;
                case 9:
                    strArr = dfxj.K(parcel, readInt);
                    break;
                case 10:
                    bArr2 = dfxj.E(parcel, readInt);
                    break;
                case 11:
                    dArr = dfxj.F(parcel, readInt);
                    break;
                case 12:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                case 13:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 14:
                    jArr = dfxj.I(parcel, readInt);
                    break;
                case 15:
                    jArr2 = dfxj.I(parcel, readInt);
                    break;
                case 16:
                    bundleArr4 = (Bundle[]) dfxj.J(parcel, readInt, Bundle.CREATOR);
                    break;
                case 17:
                    iArr3 = dfxj.H(parcel, readInt);
                    break;
                case 18:
                    bArr3 = dfxj.E(parcel, readInt);
                    break;
                case 19:
                    z = dfxj.D(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new SearchResults(str, iArr, bArr, bundleArr, bundleArr2, bundleArr3, i, iArr2, strArr, bArr2, dArr, bundle, i2, jArr, jArr2, bundleArr4, iArr3, bArr3, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SearchResults[i];
    }
}
