package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.GroupRemoteCapabilities;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eifz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eiel eielVar = new eiel();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                eielVar.d(dfxj.D(parcel, readInt));
            } else if (d == 2) {
                eielVar.c(Boolean.valueOf(dfxj.D(parcel, readInt)));
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                eielVar.b(Boolean.valueOf(dfxj.D(parcel, readInt)));
            }
        }
        return eielVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroupRemoteCapabilities[i];
    }
}
