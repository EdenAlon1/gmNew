package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.callingcard.CallingCardIdentifier;
import com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus;
import com.google.android.gms.people.cpg.callingcard.CreateCallingCardResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhil implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        CallingCardRequestStatus callingCardRequestStatus = null;
        CallingCardIdentifier callingCardIdentifier = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                callingCardRequestStatus = (CallingCardRequestStatus) dfxj.n(parcel, readInt, CallingCardRequestStatus.CREATOR);
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                callingCardIdentifier = (CallingCardIdentifier) dfxj.n(parcel, readInt, CallingCardIdentifier.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new CreateCallingCardResponse(callingCardRequestStatus, callingCardIdentifier);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CreateCallingCardResponse[i];
    }
}
