package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eihw implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Optional empty = Optional.empty();
        Optional empty2 = Optional.empty();
        if (eijb.a(parcel) == 1) {
            Optional h = eijb.h(parcel, 1);
            if (h.isPresent()) {
                empty = Optional.of((String) h.get());
            }
        }
        Optional optional = empty;
        int intValue = ((Integer) eijb.d(parcel, 2).get()).intValue();
        ehzx ehzxVar = (ehzx) eijb.f(parcel, 3, eihu.a).get();
        String str = (String) eijb.h(parcel, 4).get();
        Object obj = eijb.c(parcel, 5).get();
        eijb.j(parcel);
        return new ehyl(optional, intValue, ehzxVar, str, (Instant) obj, empty2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new eiag[0];
    }
}
