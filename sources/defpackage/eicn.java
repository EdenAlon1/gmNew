package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eicn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eico j = SendMessageRequest.j();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    j.c(dfxj.j(parcel, readInt));
                    continue;
                case 2:
                    j.b((Conversation) dfxj.n(parcel, readInt, Conversation.CREATOR));
                    continue;
                case 3:
                    j.d((Message) dfxj.n(parcel, readInt, Message.CREATOR));
                    continue;
                case 4:
                    j.e((MessageClass) dfxj.n(parcel, readInt, MessageClass.CREATOR));
                    continue;
                case 5:
                    j.h((TraceId) dfxj.n(parcel, readInt, TraceId.CREATOR));
                    continue;
                case 6:
                    byte[] E = dfxj.E(parcel, readInt);
                    if (E != null) {
                        j.g(eyee.x(E));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (!dizg.E()) {
                        break;
                    } else {
                        j.f((eigz) eihh.b(parcel, readInt, eigz.class));
                        break;
                    }
            }
            dfxj.C(parcel, readInt);
        }
        return j.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SendMessageRequest[0];
    }
}
