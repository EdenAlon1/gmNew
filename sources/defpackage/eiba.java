package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.GroupOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiba implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ehyt ehytVar = new ehyt();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                ehytVar.c((MessagingResult) dfxj.n(parcel, readInt, MessagingResult.CREATOR));
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                ehytVar.b((Conversation) dfxj.n(parcel, readInt, Conversation.CREATOR));
            }
        }
        return ehytVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroupOperationResult[i];
    }
}
