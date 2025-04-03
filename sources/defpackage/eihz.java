package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eihz implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Optional empty = Optional.empty();
        eiag eiagVar = (eiag) eijb.f(parcel, 1, eihx.a).get();
        Optional f = eijb.f(parcel, 2, eihx.a);
        if (f.isPresent()) {
            empty = Optional.of((eiag) f.get());
        }
        emxf.a(eijb.j(parcel).isPresent());
        return new ehym(eiagVar, empty);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new eiah[0];
    }
}
