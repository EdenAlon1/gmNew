package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class dcgn implements Parcelable {
    public static final Parcelable.Creator<dcgn> CREATOR = new dcgm();

    public abstract int a();

    public abstract int b();

    public abstract long c();

    public abstract epsw d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract String e();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(e());
        parcel.writeInt(b());
        parcel.writeInt(a());
        parcel.writeParcelable(new ProtoParsers.InternalDontUse(null, d()), 0);
        parcel.writeLong(c());
    }
}
