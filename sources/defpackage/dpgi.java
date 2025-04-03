package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpgi implements dpgj {
    public static final dpgi a = new dpgi();
    public static final Parcelable.Creator<dpgi> CREATOR = new dpgh();

    private dpgi() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpgi)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1172323945;
    }

    public final String toString() {
        return "GallerySource.SystemPicker";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
