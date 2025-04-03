package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edno implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ednp((edph) parcel.readParcelable(edpi.class.getClassLoader()), parcel.readArrayList(edpi.class.getClassLoader()), parcel.readArrayList(edpi.class.getClassLoader()), parcel.readArrayList(edpi.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ednp[i];
    }
}
