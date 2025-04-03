package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiih implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = (String) eijb.h(parcel, 1).get();
        String str2 = (String) eijb.h(parcel, 2).get();
        String str3 = (String) eijb.h(parcel, 3).get();
        emxf.a(eijb.j(parcel).isPresent());
        return new ehza(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new eibn[i];
    }
}
