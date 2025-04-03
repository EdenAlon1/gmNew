package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drel implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new drem((drme) Enum.valueOf(drme.class, parcel.readString()), (drld) parcel.readParcelable(drem.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong(), (drek) parcel.readParcelable(drem.class.getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new drem[i];
    }
}
