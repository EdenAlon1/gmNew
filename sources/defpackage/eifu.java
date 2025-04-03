package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.GroupMember;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eifu implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eifv f = GroupMember.f();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                f.c((RcsDestinationId) dfxj.n(parcel, readInt, RcsDestinationId.CREATOR));
            } else if (d == 2) {
                f.b(dfxj.t(parcel, readInt));
            } else if (d == 3) {
                f.e((RcsDestinationId) dfxj.n(parcel, readInt, RcsDestinationId.CREATOR));
            } else if (d == 4) {
                f.d(dfxj.D(parcel, readInt));
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                f.f((eifw) eihh.b(parcel, readInt, eifw.class));
            }
        }
        return f.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GroupMember[i];
    }
}
