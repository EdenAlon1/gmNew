package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eisx implements Parcelable {
    public static final Parcelable.Creator<eisx> CREATOR = new eisw();

    public static eisx b(int i) {
        emxf.m(i >= -1, "Invalid AccountId");
        return new eisz(i);
    }

    @Deprecated
    public abstract int a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(a());
    }
}
