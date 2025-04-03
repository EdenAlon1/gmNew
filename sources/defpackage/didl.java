package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class didl implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 3) {
                z = dfxj.D(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                z2 = dfxj.D(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new GetCloudSyncOptInStatusResponse(i, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetCloudSyncOptInStatusResponse[i];
    }
}
