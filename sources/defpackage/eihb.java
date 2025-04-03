package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eihb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eieu eieuVar = new eieu();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                eieuVar.c(new int[]{1, 2}[dfxj.f(parcel, readInt)]);
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                eieuVar.b(dfxj.t(parcel, readInt));
            }
        }
        return eieuVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RcsDestinationId[i];
    }
}
