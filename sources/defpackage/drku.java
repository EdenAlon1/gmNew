package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drku extends drld {
    public static final drku a = new drku();
    public static final Parcelable.Creator<drku> CREATOR = new drkt();

    private drku() {
        super("png");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drku)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 405569035;
    }

    public final String toString() {
        return "PNG";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
