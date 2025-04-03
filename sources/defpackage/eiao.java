package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.GetMessagesResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.MessageNotification;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiao implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ehyq ehyqVar = new ehyq();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                ehyqVar.c((MessagingResult) dfxj.n(parcel, readInt, MessagingResult.CREATOR));
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                ehyqVar.b(dfxj.z(parcel, readInt, MessageNotification.CREATOR));
            }
        }
        return ehyqVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetMessagesResponse[i];
    }
}
