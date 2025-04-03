package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzpr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int ordinal = ((dzpq) parcel.readParcelable(getClass().getClassLoader())).ordinal();
        if (ordinal == 0) {
            return dzkp.b((dzpg) parcel.readParcelable(getClass().getClassLoader()));
        }
        if (ordinal != 1) {
            return null;
        }
        return dzkp.a((dzpn) parcel.readParcelable(getClass().getClassLoader()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new dzps[i];
    }
}
