package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzmu extends dzim {
    public static final Parcelable.Creator<dzmu> CREATOR = new dzmt();

    public dzmu(String str, String str2, dzpf dzpfVar, emxc emxcVar) {
        super(str, str2, dzpfVar, emxcVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(((dzim) this).a);
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
        parcel.writeSerializable(this.d);
    }
}
