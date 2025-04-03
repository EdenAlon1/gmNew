package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.GroupEvent;
import com.google.android.rcs.client.messaging.data.GroupInformation;
import com.google.android.rcs.client.messaging.data.GroupNotification;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eifx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eiek eiekVar = new eiek();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                eiekVar.b((Conversation) dfxj.n(parcel, readInt, Conversation.CREATOR));
            } else if (d == 2) {
                eiekVar.d((GroupInformation) dfxj.n(parcel, readInt, GroupInformation.CREATOR));
            } else if (d == 3 && djag.n()) {
                eiekVar.c((GroupEvent) dfxj.n(parcel, readInt, GroupEvent.CREATOR));
            } else {
                dfxj.C(parcel, readInt);
            }
        }
        return eiekVar.e();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroupNotification[i];
    }
}
