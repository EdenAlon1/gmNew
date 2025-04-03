package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eife implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eiea eieaVar = new eiea();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                eieaVar.d(new int[]{1, 2}[dfxj.f(parcel, readInt)]);
            } else if (d == 2) {
                eieaVar.c(dfxj.t(parcel, readInt));
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                eieaVar.b((RcsDestinationId) dfxj.n(parcel, readInt, RcsDestinationId.CREATOR));
            }
        }
        return eieaVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Conversation[i];
    }
}
