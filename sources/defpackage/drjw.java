package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drjw extends drjx {
    public static final drjw a = new drjw();
    public static final Parcelable.Creator<drjw> CREATOR = new drjv();

    private drjw() {
        super("3gpp");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drjw)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1769496016;
    }

    public final String toString() {
        return "3GPP";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
