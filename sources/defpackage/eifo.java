package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eifo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eieg eiegVar = new eieg();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                eiegVar.c((FileInformation) dfxj.n(parcel, readInt, FileInformation.CREATOR));
            } else if (d == 2) {
                eiegVar.e((FileInformation) dfxj.n(parcel, readInt, FileInformation.CREATOR));
            } else if (d == 3) {
                eiegVar.b(eyee.x(dfxj.E(parcel, readInt)));
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                eiegVar.d(eyee.x(dfxj.E(parcel, readInt)));
            }
        }
        return eiegVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FileTransferInformation[i];
    }
}
