package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drjs extends drjx {
    public static final drjs a = new drjs();
    public static final Parcelable.Creator<drjs> CREATOR = new drjr();

    private drjs() {
        super("ogg");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drjs)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 68865580;
    }

    public final String toString() {
        return "OGG";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
