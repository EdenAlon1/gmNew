package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.people.internal.SyncStatus;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhiz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        long j = 0;
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 2) {
                i = dfxj.f(parcel, readInt);
            } else if (d == 3) {
                str = dfxj.t(parcel, readInt);
            } else if (d != 4) {
                dfxj.C(parcel, readInt);
            } else {
                j = dfxj.i(parcel, readInt);
            }
        }
        dfxj.B(parcel, h);
        return new SyncStatus(i, str, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SyncStatus[i];
    }
}
