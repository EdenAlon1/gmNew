package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.UpdateGroupResponse;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eidc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ehzt ehztVar = new ehzt();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                ehztVar.b((MessagingResult) dfxj.n(parcel, readInt, MessagingResult.CREATOR));
            }
        }
        return ehztVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UpdateGroupResponse[i];
    }
}
