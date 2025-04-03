package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.MessagingOperationResult;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.Conversation;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eibt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eibu e = MessagingOperationResult.e();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                e.e((MessagingResult) dfxj.n(parcel, readInt, MessagingResult.CREATOR));
            } else if (d == 2) {
                e.b((Conversation) dfxj.n(parcel, readInt, Conversation.CREATOR));
            } else if (d == 3) {
                e.d(dfxj.t(parcel, readInt));
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                e.c(dfxj.D(parcel, readInt));
            }
        }
        return e.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MessagingOperationResult[i];
    }
}
