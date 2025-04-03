package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eigt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eigu e = MessageNotification.e();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                e.b((Conversation) dfxj.n(parcel, readInt, Conversation.CREATOR));
            } else if (d == 2) {
                e.d((Message) dfxj.n(parcel, readInt, Message.CREATOR));
            } else if (d == 3) {
                e.e((TraceId) dfxj.n(parcel, readInt, TraceId.CREATOR));
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else if (dizg.v()) {
                e.c(eihh.a(parcel, readInt));
            } else {
                dfxj.C(parcel, readInt);
            }
        }
        return e.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MessageNotification[i];
    }
}
