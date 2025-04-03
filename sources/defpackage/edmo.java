package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edmo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new edmp((edpu) parcel.readParcelable(edmh.class.getClassLoader()), (edpu) parcel.readParcelable(edmh.class.getClassLoader()), (edpu) parcel.readParcelable(edmh.class.getClassLoader()), (edpu) parcel.readParcelable(edmh.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new edmp[i];
    }
}
