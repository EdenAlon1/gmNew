package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.kids.IndividualContactRequest;
import com.google.android.gms.kids.RequestContext;
import com.google.android.gms.kids.TrustedContactsRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgss implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        IndividualContactRequest[] individualContactRequestArr = null;
        RequestContext requestContext = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                individualContactRequestArr = (IndividualContactRequest[]) dfxj.J(parcel, readInt, IndividualContactRequest.CREATOR);
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                requestContext = (RequestContext) dfxj.n(parcel, readInt, RequestContext.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new TrustedContactsRequest(individualContactRequestArr, requestContext);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TrustedContactsRequest[i];
    }
}
