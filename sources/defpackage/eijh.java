package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eijh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ehzo ehzoVar = new ehzo();
        ehzoVar.a = eijb.f(parcel, 1, eijd.a);
        ehzoVar.b = eijb.c(parcel, 2);
        emxf.a(eijb.j(parcel).isPresent());
        return ehzoVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new eict[i];
    }
}
