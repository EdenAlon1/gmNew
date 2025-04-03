package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Duration;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiid implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Optional of;
        Optional.empty();
        Optional empty = Optional.empty();
        int i = new int[]{1, 2}[((Integer) eijb.d(parcel, 1).get()).intValue()];
        if (i == 0) {
            throw new NullPointerException("Null state");
        }
        if (eijb.s(parcel, 2)) {
            parcel.readInt();
            of = Optional.of(Duration.ofSeconds(parcel.readLong()));
        } else {
            of = Optional.empty();
        }
        Optional of2 = Optional.of(of.get());
        Optional c = eijb.c(parcel, 3);
        if (c.isPresent()) {
            empty = Optional.of(c.get());
        }
        eijb.j(parcel);
        return new ehyw(i, of2, empty);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new eibe[i];
    }
}
