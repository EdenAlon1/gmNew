package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edns implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ednt((edpu) parcel.readParcelable(edpo.class.getClassLoader()), (edpu) parcel.readParcelable(edpo.class.getClassLoader()), (edpu) parcel.readParcelable(edpo.class.getClassLoader()), (edpu) parcel.readParcelable(edpo.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ednt[i];
    }
}
