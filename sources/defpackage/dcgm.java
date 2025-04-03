package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcgm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readString();
        readString.getClass();
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        eyjv eyjvVar = (eyjv) parcel.readParcelable(epsw.class.getClassLoader());
        eyjvVar.getClass();
        return new dcec(readString, readInt, readInt2, (epsw) eyjvVar.a(epsw.a, eyfc.a()), parcel.readLong());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new dcgn[i];
    }
}
