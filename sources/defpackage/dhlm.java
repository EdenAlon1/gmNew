package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.RegistrationInfo;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhlm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        String[] strArr = null;
        byte[] bArr = null;
        int[] iArr = null;
        String str2 = null;
        byte[] bArr2 = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 2:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 3:
                    strArr = dfxj.K(parcel, readInt);
                    break;
                case 4:
                    bArr = dfxj.E(parcel, readInt);
                    break;
                case 5:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 6:
                    iArr = dfxj.H(parcel, readInt);
                    break;
                case 7:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 8:
                    bArr2 = dfxj.E(parcel, readInt);
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
        return new RegistrationInfo(str, i, strArr, bArr, z, iArr, str2, bArr2, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RegistrationInfo[i];
    }
}
