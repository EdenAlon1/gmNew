package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.MessageReceipt;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eigv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eies eiesVar = new eies();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                eiesVar.j(eigx.values()[dfxj.f(parcel, readInt)]);
            } else if (d == 2) {
                eiesVar.g(dfxj.t(parcel, readInt));
            } else if (d == 3) {
                eiesVar.i(eihh.a(parcel, readInt));
            } else if (d == 4) {
                eiesVar.h(dfxj.t(parcel, readInt));
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                eiesVar.e(eyee.x(dfxj.E(parcel, readInt)));
            }
        }
        return eiesVar.k();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MessageReceipt[i];
    }
}
