package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.ChannelEventParcelable;
import com.google.android.gms.wearable.internal.ChannelImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dibr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        int i2 = 0;
        ChannelImpl channelImpl = null;
        int i3 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                channelImpl = (ChannelImpl) dfxj.n(parcel, readInt, ChannelImpl.CREATOR);
            } else if (d == 3) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 4) {
                i3 = dfxj.f(parcel, readInt);
            } else if (d != 5) {
                dfxj.C(parcel, readInt);
            } else {
                i2 = dfxj.f(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new ChannelEventParcelable(channelImpl, i, i3, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ChannelEventParcelable[i];
    }
}
