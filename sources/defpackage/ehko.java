package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehko implements Parcelable {
    public static final Parcelable.Creator<ehko> CREATOR = new ehkn();
    int a;
    ehik b;

    public ehko() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, 0);
    }

    public ehko(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = (ehik) parcel.readParcelable(getClass().getClassLoader());
    }
}
