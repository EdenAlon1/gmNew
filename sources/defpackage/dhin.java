package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.callingcard.CallingCardFileData;
import com.google.android.gms.people.cpg.callingcard.CallingCardIdentifier;
import com.google.android.gms.people.cpg.callingcard.CallingCardMetadata;
import com.google.android.gms.people.cpg.callingcard.UpdateCallingCardRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhin implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        CallingCardIdentifier callingCardIdentifier = null;
        CallingCardFileData callingCardFileData = null;
        CallingCardMetadata callingCardMetadata = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                callingCardIdentifier = (CallingCardIdentifier) dfxj.n(parcel, readInt, CallingCardIdentifier.CREATOR);
            } else if (d == 2) {
                callingCardFileData = (CallingCardFileData) dfxj.n(parcel, readInt, CallingCardFileData.CREATOR);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                callingCardMetadata = (CallingCardMetadata) dfxj.n(parcel, readInt, CallingCardMetadata.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new UpdateCallingCardRequest(callingCardIdentifier, callingCardFileData, callingCardMetadata);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UpdateCallingCardRequest[i];
    }
}
