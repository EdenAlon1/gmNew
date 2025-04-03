package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.GetAccountsRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dezr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        String[] strArr = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                str = dfxj.t(parcel, readInt);
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                strArr = dfxj.K(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new GetAccountsRequest(str, strArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetAccountsRequest[i];
    }
}
