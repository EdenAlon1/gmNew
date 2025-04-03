package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.MessageExtensionHeader;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eigq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eieq eieqVar = new eieq();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                eieqVar.c(dfxj.t(parcel, readInt));
            } else if (d == 2) {
                eieqVar.b(dfxj.t(parcel, readInt));
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                eieqVar.d(dfxj.t(parcel, readInt));
            }
        }
        return eieqVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MessageExtensionHeader[i];
    }
}
