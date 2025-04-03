package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.RevokeMessageRequest;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eich implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ehzj ehzjVar = new ehzj();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                ehzjVar.c(dfxj.j(parcel, readInt));
            } else if (d == 2) {
                ehzjVar.b((Conversation) dfxj.n(parcel, readInt, Conversation.CREATOR));
            } else if (d == 3) {
                ehzjVar.d(dfxj.t(parcel, readInt));
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                byte[] E = dfxj.E(parcel, readInt);
                if (E != null) {
                    ehzjVar.e(eyee.x(E));
                }
            }
        }
        return ehzjVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new RevokeMessageRequest[0];
    }
}
