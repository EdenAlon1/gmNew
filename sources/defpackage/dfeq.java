package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.authzen.gencode.server.api.BeaconSeedEntity;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfeq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        HashSet hashSet = new HashSet();
        long j = 0;
        String str = null;
        long j2 = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                String t = dfxj.t(parcel, readInt);
                hashSet.add(2);
                str = t;
            } else if (d == 3) {
                j2 = dfxj.i(parcel, readInt);
                hashSet.add(3);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                j = dfxj.i(parcel, readInt);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == h) {
            return new BeaconSeedEntity(hashSet, str, j2, j);
        }
        throw new dfxi(a.h(h, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new BeaconSeedEntity[i];
    }
}
