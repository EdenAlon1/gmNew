package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.TriggerGroupNotificationRequest;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eicv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ehzq ehzqVar = new ehzq();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                ehzqVar.c(dfxj.j(parcel, readInt));
            } else if (d == 2) {
                ehzqVar.b((Conversation) dfxj.n(parcel, readInt, Conversation.CREATOR));
            } else if (d != 3) {
                dfxj.C(parcel, readInt);
            } else {
                byte[] E = dfxj.E(parcel, readInt);
                if (E != null) {
                    ehzqVar.d(eyee.x(E));
                }
            }
        }
        return ehzqVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TriggerGroupNotificationRequest[i];
    }
}
