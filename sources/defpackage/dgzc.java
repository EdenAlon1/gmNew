package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.location.NlpLocationRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        WorkSource workSource = new WorkSource();
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            if (dfxj.d(readInt) != 1) {
                dfxj.C(parcel, readInt);
            } else {
                workSource = (WorkSource) dfxj.n(parcel, readInt, WorkSource.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new NlpLocationRequest(workSource);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new NlpLocationRequest[i];
    }
}
