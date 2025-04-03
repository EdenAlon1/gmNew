package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.AddUserToGroupRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehxs implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ehyd ehydVar = new ehyd();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                ehydVar.c(dfxj.j(parcel, readInt));
            } else if (d == 2) {
                ehydVar.b((Conversation) dfxj.n(parcel, readInt, Conversation.CREATOR));
            } else if (d == 3) {
                ehydVar.e((RcsDestinationId) dfxj.n(parcel, readInt, RcsDestinationId.CREATOR));
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                byte[] E = dfxj.E(parcel, readInt);
                if (E != null) {
                    ehydVar.d(eyee.x(E));
                }
            }
        }
        return ehydVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AddUserToGroupRequest[i];
    }
}
