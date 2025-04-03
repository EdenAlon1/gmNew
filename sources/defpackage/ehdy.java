package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehdy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new eheb((ehfd) parcel.readParcelable(ehfd.class.getClassLoader()), (ehfd) parcel.readParcelable(ehfd.class.getClassLoader()), (ehea) parcel.readParcelable(ehea.class.getClassLoader()), (ehfd) parcel.readParcelable(ehfd.class.getClassLoader()), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new eheb[i];
    }
}
