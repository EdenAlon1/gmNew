package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.contactkeys.E2eeContactKeyParcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgah implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        byte[] bArr = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        int i2 = 0;
        long j = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 2:
                    str2 = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    str3 = dfxj.t(parcel, readInt);
                    break;
                case 4:
                    str4 = dfxj.t(parcel, readInt);
                    break;
                case 5:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 6:
                    bArr = dfxj.E(parcel, readInt);
                    break;
                case 7:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 8:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 9:
                    str5 = dfxj.t(parcel, readInt);
                    break;
                case 10:
                    str6 = dfxj.t(parcel, readInt);
                    break;
                case 11:
                    str7 = dfxj.t(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new E2eeContactKeyParcelable(str, str2, str3, str4, j, bArr, i, i2, str5, str6, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new E2eeContactKeyParcelable[i];
    }
}
