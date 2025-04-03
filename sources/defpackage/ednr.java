package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ednr extends edlm {
    public static final Parcelable.Creator<ednr> CREATOR = new ednq();

    public ednr(edpu edpuVar, edpu edpuVar2, edpu edpuVar3, edpu edpuVar4, edpu edpuVar5, edpu edpuVar6, edpu edpuVar7) {
        super(edpuVar, edpuVar2, edpuVar3, edpuVar4, edpuVar5, edpuVar6, edpuVar7);
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
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
    }
}
