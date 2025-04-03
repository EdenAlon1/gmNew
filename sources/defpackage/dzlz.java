package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzlz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        emxc emxcVar = (emxc) parcel.readSerializable();
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        return new dzma(emxcVar, new HashSet(arrayList), (emxc) parcel.readSerializable(), parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new dzma[i];
    }
}
