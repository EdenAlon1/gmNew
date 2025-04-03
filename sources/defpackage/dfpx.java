package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GoogleCertificatesLookupResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfpx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        GoogleCertificatesLookupResponse googleCertificatesLookupResponse = null;
        long j = 0;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 2:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 3:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 4:
                    i2 = dfxj.f(parcel, readInt);
                    break;
                case 5:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 6:
                    googleCertificatesLookupResponse = (GoogleCertificatesLookupResponse) dfxj.n(parcel, readInt, GoogleCertificatesLookupResponse.CREATOR);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new GoogleCertificatesLookupResponse(z, str, i, i2, j, googleCertificatesLookupResponse);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleCertificatesLookupResponse[i];
    }
}
