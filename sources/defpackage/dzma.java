package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzma extends dzik {
    public static final Parcelable.Creator<dzma> CREATOR = new dzlz();

    public dzma(emxc emxcVar, Set set, emxc emxcVar2, String str) {
        super(emxcVar, set, emxcVar2, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b);
        parcel.writeStringList(arrayList);
        parcel.writeSerializable(this.c);
        parcel.writeString(this.d);
    }
}
