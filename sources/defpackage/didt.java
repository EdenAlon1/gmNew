package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.FastPairAccountKeyParcelable;
import com.google.android.gms.wearable.internal.GetFastpairAccountKeyByAccountResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class didt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        FastPairAccountKeyParcelable fastPairAccountKeyParcelable = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                fastPairAccountKeyParcelable = (FastPairAccountKeyParcelable) dfxj.n(parcel, readInt, FastPairAccountKeyParcelable.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new GetFastpairAccountKeyByAccountResponse(i, fastPairAccountKeyParcelable);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetFastpairAccountKeyByAccountResponse[i];
    }
}
