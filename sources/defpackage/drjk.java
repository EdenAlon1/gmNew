package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drjk extends drjx {
    public static final drjk a = new drjk();
    public static final Parcelable.Creator<drjk> CREATOR = new drjj();

    private drjk() {
        super("mp4");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drjk)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 68863063;
    }

    public final String toString() {
        return "M4A";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
