package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctip extends ctil {
    public static final Parcelable.Creator<ctip> CREATOR = new ctio();

    public ctip(int i, float f, String str) {
        super(i, f, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(ctir.a(this.c));
        parcel.writeFloat(this.a);
        parcel.writeString(this.b);
    }
}
