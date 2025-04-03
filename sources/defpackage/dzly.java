package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzly extends dzii {
    public static final Parcelable.Creator<dzly> CREATOR = new dzlx();

    public dzly(long j, dzjd dzjdVar, eyee eyeeVar, dziz dzizVar) {
        super(j, dzjdVar, eyeeVar, dzizVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeSerializable(this.b);
        parcel.writeSerializable(this.c);
        parcel.writeString(this.d.name());
    }
}
