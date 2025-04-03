package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdh.SyncPolicy;
import com.google.android.gms.mdh.SyncSubPolicy;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhdv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        SyncSubPolicy syncSubPolicy = null;
        SyncSubPolicy syncSubPolicy2 = null;
        SyncSubPolicy syncSubPolicy3 = null;
        SyncSubPolicy syncSubPolicy4 = null;
        Integer num = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    i = dfxj.f(parcel, readInt);
                    break;
                case 2:
                    syncSubPolicy = (SyncSubPolicy) dfxj.n(parcel, readInt, SyncSubPolicy.CREATOR);
                    break;
                case 3:
                    syncSubPolicy2 = (SyncSubPolicy) dfxj.n(parcel, readInt, SyncSubPolicy.CREATOR);
                    break;
                case 4:
                    syncSubPolicy3 = (SyncSubPolicy) dfxj.n(parcel, readInt, SyncSubPolicy.CREATOR);
                    break;
                case 5:
                    syncSubPolicy4 = (SyncSubPolicy) dfxj.n(parcel, readInt, SyncSubPolicy.CREATOR);
                    break;
                case 6:
                    num = dfxj.r(parcel, readInt);
                    break;
                case 7:
                    z = dfxj.D(parcel, readInt);
                    break;
                case 8:
                    z2 = dfxj.D(parcel, readInt);
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        dfxj.B(parcel, h);
        return new SyncPolicy(i, syncSubPolicy, syncSubPolicy2, syncSubPolicy3, syncSubPolicy4, num, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SyncPolicy[i];
    }
}
