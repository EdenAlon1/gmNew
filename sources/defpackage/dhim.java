package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.callingcard.CallingCardMetadata;
import com.google.android.gms.people.cpg.callingcard.CallingCardRequestStatus;
import com.google.android.gms.people.cpg.callingcard.GetCallingCardResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhim implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        CallingCardRequestStatus callingCardRequestStatus = null;
        Uri uri = null;
        String str = null;
        CallingCardMetadata callingCardMetadata = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                callingCardRequestStatus = (CallingCardRequestStatus) dfxj.n(parcel, readInt, CallingCardRequestStatus.CREATOR);
            } else if (d == 2) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 3) {
                uri = (Uri) dfxj.n(parcel, readInt, Uri.CREATOR);
            } else if (d == 4) {
                str = dfxj.t(parcel, readInt);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                callingCardMetadata = (CallingCardMetadata) dfxj.n(parcel, readInt, CallingCardMetadata.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new GetCallingCardResponse(callingCardRequestStatus, i, uri, str, callingCardMetadata);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetCallingCardResponse[i];
    }
}
