package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.GetGroupNotificationsResponse;
import com.google.android.rcs.client.messaging.MessagingResult;
import com.google.android.rcs.client.messaging.data.GroupNotification;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiak implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ehyo ehyoVar = new ehyo();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                ehyoVar.c((MessagingResult) dfxj.n(parcel, readInt, MessagingResult.CREATOR));
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                ehyoVar.b(dfxj.z(parcel, readInt, GroupNotification.CREATOR));
            }
        }
        return ehyoVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetGroupNotificationsResponse[i];
    }
}
