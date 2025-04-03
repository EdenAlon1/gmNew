package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.MessageClass;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eigm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eign e = MessageClass.e();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                e.e((eigp) eihh.b(parcel, readInt, eigp.class));
            } else if (d == 2) {
                e.d((eigo) eihh.b(parcel, readInt, eigo.class));
            } else if (d == 3) {
                e.c(dfxj.D(parcel, readInt));
            } else if (d == 4 && ((Boolean) MessageClass.a.a()).booleanValue()) {
                e.b(dfxj.D(parcel, readInt));
            } else {
                dfxj.C(parcel, readInt);
            }
        }
        return e.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MessageClass[0];
    }
}
