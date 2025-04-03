package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiib implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ehyu ehyuVar = new ehyu();
        ehyuVar.b(((Integer) eijb.d(parcel, 1).get()).intValue() == 1);
        emxf.a(eijb.j(parcel).isPresent());
        return ehyuVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new eibd[i];
    }
}
