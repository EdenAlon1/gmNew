package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzmy extends dzio {
    public static final Parcelable.Creator<dzmy> CREATOR = new dzmx();

    public dzmy(dzpg dzpgVar, dzps dzpsVar) {
        super(dzpgVar, dzpsVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
