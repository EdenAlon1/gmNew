package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.cpg.callingcard.CallingCardFileData;
import com.google.android.gms.people.cpg.callingcard.CallingCardMetadata;
import com.google.android.gms.people.cpg.callingcard.CreateCallingCardRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhik implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        CallingCardFileData callingCardFileData = null;
        int i = 0;
        CallingCardMetadata callingCardMetadata = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 2) {
                callingCardFileData = (CallingCardFileData) dfxj.n(parcel, readInt, CallingCardFileData.CREATOR);
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                callingCardMetadata = (CallingCardMetadata) dfxj.n(parcel, readInt, CallingCardMetadata.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new CreateCallingCardRequest(i, callingCardFileData, callingCardMetadata);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CreateCallingCardRequest[i];
    }
}
