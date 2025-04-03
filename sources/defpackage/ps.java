package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ps implements Parcelable {
    public static final Parcelable.Creator<ps> CREATOR = new pr();
    public int a;

    public ps() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public ps(Parcel parcel) {
        this.a = parcel.readInt();
    }
}
