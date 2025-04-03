package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.CreateGroupRequest;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiac implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ehyj ehyjVar = new ehyj();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                ehyjVar.c(dfxj.j(parcel, readInt));
            } else if (d == 2) {
                ehyjVar.b(dfxj.t(parcel, readInt));
            } else if (d == 3) {
                ehyjVar.f(dfxj.t(parcel, readInt));
            } else if (d == 4) {
                ehyjVar.d(dfxj.z(parcel, readInt, RcsDestinationId.CREATOR));
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                byte[] E = dfxj.E(parcel, readInt);
                if (E != null) {
                    ehyjVar.e(eyee.x(E));
                }
            }
        }
        return ehyjVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CreateGroupRequest[i];
    }
}
