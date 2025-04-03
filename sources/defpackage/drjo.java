package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drjo extends drjx {
    public static final drjo a = new drjo();
    public static final Parcelable.Creator<drjo> CREATOR = new drjn();

    private drjo() {
        super("mpg");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drjo)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 68863937;
    }

    public final String toString() {
        return "MPG";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
