package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drla extends drld {
    public static final drla a = new drla();
    public static final Parcelable.Creator<drla> CREATOR = new drkz();

    private drla() {
        super("webp");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drla)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -312061990;
    }

    public final String toString() {
        return "WEBP";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
