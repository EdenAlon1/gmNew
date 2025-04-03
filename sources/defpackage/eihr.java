package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eihr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Optional ofNullable;
        ehzx ehzxVar = (ehzx) eijb.f(parcel, 1, eihu.a).get();
        if (eijb.s(parcel, 2)) {
            parcel.readInt();
            ofNullable = Optional.ofNullable(parcel.createByteArray());
        } else {
            ofNullable = Optional.empty();
        }
        eyee x = eyee.x((byte[]) ofNullable.get());
        emxf.a(eijb.j(parcel).isPresent());
        return new ehyg(x, ehzxVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ehzv[i];
    }
}
