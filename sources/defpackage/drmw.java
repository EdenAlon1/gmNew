package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drmw extends drnd {
    public static final drmw a = new drmw();
    public static final Parcelable.Creator<drmw> CREATOR = new drmv();

    private drmw() {
        super("webm");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drmw)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 266645687;
    }

    public final String toString() {
        return "WEBM";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
