package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drjq extends drjx {
    public static final drjq a = new drjq();
    public static final Parcelable.Creator<drjq> CREATOR = new drjp();

    private drjq() {
        super("mpg-latm");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drjq)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1597975660;
    }

    public final String toString() {
        return "MPG_LATM";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
