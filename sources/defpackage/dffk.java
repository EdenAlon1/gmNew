package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.OtpRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dffk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        boolean z = false;
        String str = null;
        AppDescription appDescription = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 2) {
                str = dfxj.t(parcel, readInt);
            } else if (d == 3) {
                appDescription = (AppDescription) dfxj.n(parcel, readInt, AppDescription.CREATOR);
            } else if (d == 4) {
                bArr = dfxj.E(parcel, readInt);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                z = dfxj.D(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new OtpRequest(i, str, appDescription, bArr, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new OtpRequest[i];
    }
}
