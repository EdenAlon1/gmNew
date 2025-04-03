package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eknw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList createTypedArrayList = parcel.createTypedArrayList(Intent.CREATOR);
        String readString = parcel.readString();
        int readInt2 = parcel.readInt();
        return new eknx(readInt, createTypedArrayList, readString, readInt2 != 0, parcel.readInt() == 1 ? Integer.valueOf(parcel.readInt()) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new eknx[i];
    }
}
