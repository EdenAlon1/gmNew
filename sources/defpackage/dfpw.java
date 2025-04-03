package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.GoogleCertificatesLookupQuery;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfpw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        IBinder iBinder = null;
        GoogleCertificatesLookupQuery.ClientSourceStampRequest clientSourceStampRequest = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 2:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 3:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                case 4:
                    iBinder = dfxj.l(parcel, readInt);
                    break;
                case 5:
                    z3 = dfxj.D(parcel, readInt);
                    break;
                case 6:
                    z4 = dfxj.D(parcel, readInt);
                    break;
                case 7:
                    clientSourceStampRequest = (GoogleCertificatesLookupQuery.ClientSourceStampRequest) dfxj.n(parcel, readInt, GoogleCertificatesLookupQuery.ClientSourceStampRequest.CREATOR);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new GoogleCertificatesLookupQuery(str, z, z2, iBinder, z3, z4, clientSourceStampRequest);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleCertificatesLookupQuery[i];
    }
}
