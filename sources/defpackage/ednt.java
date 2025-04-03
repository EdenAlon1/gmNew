package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ednt extends edlo {
    public static final Parcelable.Creator<ednt> CREATOR = new edns();

    public ednt(edpu edpuVar, edpu edpuVar2, edpu edpuVar3, edpu edpuVar4) {
        super(edpuVar, edpuVar2, edpuVar3, edpuVar4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
    }
}
