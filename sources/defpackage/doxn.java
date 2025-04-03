package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doxn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        String readString = parcel.readString();
        if (readString.hashCode() == -1854434950 && readString.equals("SCOTTY")) {
            return new doxo();
        }
        throw new IllegalArgumentException();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new doxo[i];
    }
}
