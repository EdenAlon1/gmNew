package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drms extends drnd {
    public static final drms a = new drms();
    public static final Parcelable.Creator<drms> CREATOR = new drmp();

    private drms() {
        super("mpeg");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drms)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 266358435;
    }

    public final String toString() {
        return "MPEG";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
