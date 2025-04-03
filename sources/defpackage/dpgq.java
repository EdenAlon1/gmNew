package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpgq implements dpgr {
    public static final dpgq a = new dpgq();
    public static final Parcelable.Creator<dpgq> CREATOR = new dpgp();

    private dpgq() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpgq)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -370821057;
    }

    public final String toString() {
        return "System";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
