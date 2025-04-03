package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drlc extends drld {
    public static final drlc a = new drlc();
    public static final Parcelable.Creator<drlc> CREATOR = new drlb();

    private drlc() {
        super("x-ms-bmp");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drlc)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 168151633;
    }

    public final String toString() {
        return "X_MS_BMP";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
