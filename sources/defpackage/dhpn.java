package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.signin.internal.SignInResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhpn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        ConnectionResult connectionResult = null;
        int i = 0;
        ResolveAccountResponse resolveAccountResponse = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 2) {
                connectionResult = (ConnectionResult) dfxj.n(parcel, readInt, ConnectionResult.CREATOR);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                resolveAccountResponse = (ResolveAccountResponse) dfxj.n(parcel, readInt, ResolveAccountResponse.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new SignInResponse(i, connectionResult, resolveAccountResponse);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInResponse[i];
    }
}
