package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.GoogleTunnelServerIdExtension;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgjp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        String str = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                str = dfxj.t(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new GoogleTunnelServerIdExtension(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleTunnelServerIdExtension[i];
    }
}
