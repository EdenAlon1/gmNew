package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hic<T> extends hkd<T> implements Parcelable {
    public static final Parcelable.Creator<hic<Object>> CREATOR = new hib();

    public hic(Object obj, hke hkeVar) {
        super(obj, hkeVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(a());
        hke hkeVar = ((hkd) this).a;
        if (ffkj.e(hkeVar, hhs.a)) {
            i2 = 0;
        } else if (ffkj.e(hkeVar, hla.a)) {
            i2 = 1;
        } else {
            if (!ffkj.e(hkeVar, hji.a)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
