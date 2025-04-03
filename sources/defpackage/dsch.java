package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsch implements drek {
    public static final dsch a = new dsch();
    public static final Parcelable.Creator<dsch> CREATOR = new dscg();

    private dsch() {
    }

    @Override // defpackage.drek
    public final String a() {
        return "STICKER_API";
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsch)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1478832996;
    }

    public final String toString() {
        return "StickerApi";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
