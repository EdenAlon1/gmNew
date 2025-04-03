package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.firebase.appindexing.internal.Thing;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euoz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int h = dfxj.h(parcel);
        Status status = null;
        Thing thing = null;
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            int d = dfxj.d(readInt);
            if (d == 1) {
                status = (Status) dfxj.n(parcel, readInt, Status.CREATOR);
            } else if (d != 2) {
                dfxj.C(parcel, readInt);
            } else {
                thing = (Thing) dfxj.n(parcel, readInt, Thing.CREATOR);
            }
        }
        dfxj.B(parcel, h);
        return new euoy(status, thing);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new euoy[i];
    }
}
