package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eihl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eihm b = TraceId.b();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                b.c(dfxj.t(parcel, readInt));
            }
        }
        return b.d();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new TraceId[0];
    }
}
