package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eijc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ehzf ehzfVar = new ehzf();
        ehzfVar.c(new int[]{1, 2}[((Integer) eijb.d(parcel, 1).get()).intValue()]);
        ehzfVar.b((String) eijb.h(parcel, 2).get());
        emxf.a(eijb.j(parcel).isPresent());
        return ehzfVar.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new eica[i];
    }
}
