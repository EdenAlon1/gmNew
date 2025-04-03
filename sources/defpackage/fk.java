package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fk implements Parcelable {
    public static final Parcelable.Creator<fk> CREATOR = new fj();
    final String a;
    final int b;

    public fk(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
    }

    public fk(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readInt();
    }
}
