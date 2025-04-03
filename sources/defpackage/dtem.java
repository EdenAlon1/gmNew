package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtem implements drnj {
    public static final dtem a = new dtem();
    public static final Parcelable.Creator<dtem> CREATOR = new dtel();

    private dtem() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dtem)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return -1149300421;
    }

    public final String toString() {
        return "VoiceRecorderSource";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
