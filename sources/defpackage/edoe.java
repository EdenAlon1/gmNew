package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edoe implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String readString = parcel.readInt() == 0 ? parcel.readString() : null;
        String readString2 = parcel.readInt() == 0 ? parcel.readString() : null;
        String readString3 = parcel.readInt() == 0 ? parcel.readString() : null;
        String readString4 = parcel.readInt() == 0 ? parcel.readString() : null;
        String readString5 = parcel.readInt() == 0 ? parcel.readString() : null;
        Double valueOf = Double.valueOf(parcel.readDouble());
        edmm edmmVar = (edmm) parcel.readParcelable(edqh.class.getClassLoader());
        String str = null;
        String str2 = readString2;
        String str3 = readString3;
        String str4 = readString4;
        String str5 = readString5;
        String readString6 = parcel.readString();
        if (parcel.readInt() == 0) {
            str = parcel.readString();
        }
        return new edof(readString, str2, str3, str4, str5, valueOf, edmmVar, readString6, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new edof[i];
    }
}
