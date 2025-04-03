package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.mdh.MdhFootprint;
import com.google.android.gms.mdh.MdhFootprintsReadResult;
import com.google.android.gms.mdh.SyncStatus;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhdt implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        ArrayList arrayList = null;
        SyncStatus syncStatus = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                arrayList = dfxj.z(parcel, readInt, MdhFootprint.CREATOR);
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                syncStatus = (SyncStatus) dfxj.n(parcel, readInt, SyncStatus.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new MdhFootprintsReadResult(arrayList, syncStatus);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MdhFootprintsReadResult[i];
    }
}
