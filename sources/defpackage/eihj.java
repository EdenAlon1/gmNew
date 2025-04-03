package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import com.google.android.rcs.client.messaging.data.SubjectExtension;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eihj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eiev eievVar = new eiev();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                eievVar.b((RcsDestinationId) dfxj.n(parcel, readInt, RcsDestinationId.CREATOR));
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                eievVar.c(eihh.a(parcel, readInt));
            }
        }
        return eievVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SubjectExtension[i];
    }
}
