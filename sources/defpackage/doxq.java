package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
@ffbs
/* loaded from: classes4.dex */
public final class doxq implements doxr<doxs> {
    public static final doxq a = new doxq();
    public static final Parcelable.Creator<doxq> CREATOR = new doxp();

    private doxq() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doxq)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1330778708;
    }

    public final String toString() {
        return "Unknown";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
