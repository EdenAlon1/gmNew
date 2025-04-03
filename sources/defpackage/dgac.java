package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.constellation.IdTokenRequest;
import com.google.android.gms.constellation.ImsiRequest;
import com.google.android.gms.constellation.VerifyPhoneNumberRequest;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgac implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        IdTokenRequest idTokenRequest = null;
        Bundle bundle = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        boolean z = false;
        int i = 0;
        long j = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    str = dfxj.t(parcel, readInt);
                    break;
                case 2:
                    j = dfxj.i(parcel, readInt);
                    break;
                case 3:
                    idTokenRequest = (IdTokenRequest) dfxj.n(parcel, readInt, IdTokenRequest.CREATOR);
                    break;
                case 4:
                    bundle = dfxj.k(parcel, readInt);
                    break;
                case 5:
                    arrayList = dfxj.z(parcel, readInt, ImsiRequest.CREATOR);
                    break;
                case 6:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 7:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 8:
                    arrayList2 = dfxj.w(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new VerifyPhoneNumberRequest(str, j, idTokenRequest, bundle, arrayList, z, i, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new VerifyPhoneNumberRequest[i];
    }
}
