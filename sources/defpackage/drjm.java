package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drjm extends drjx {
    public static final drjm a = new drjm();
    public static final Parcelable.Creator<drjm> CREATOR = new drjl();

    private drjm() {
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
        if (!(obj instanceof drjm)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 68863917;
    }

    public final String toString() {
        return "MP3";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
