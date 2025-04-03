package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiit implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str;
        Instant instant;
        String str2;
        ehzb ehzbVar = new ehzb();
        ehzbVar.d(eibr.values()[((Integer) eijb.d(parcel, 1).get()).intValue()]);
        ehzbVar.b = (String) eijb.h(parcel, 2).get();
        ehzbVar.c = (Instant) eijb.c(parcel, 3).get();
        ehzbVar.c((String) eijb.h(parcel, 4).get());
        eijb.j(parcel);
        if (ehzbVar.b().isPresent()) {
            if (!ehzbVar.a().g.contains(ehzbVar.b().get())) {
                ehzbVar.d(eibr.UNKNOWN);
                ehzbVar.c(ehzbVar.a().f);
            }
        } else {
            ehzbVar.c(ehzbVar.a().f);
        }
        eibr eibrVar = ehzbVar.a;
        if (eibrVar != null && (str = ehzbVar.b) != null && (instant = ehzbVar.c) != null && (str2 = ehzbVar.d) != null) {
            return new ehzc(eibrVar, str, instant, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (ehzbVar.a == null) {
            sb.append(" type");
        }
        if (ehzbVar.b == null) {
            sb.append(" messageId");
        }
        if (ehzbVar.c == null) {
            sb.append(" timestamp");
        }
        if (ehzbVar.d == null) {
            sb.append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new eibs[i];
    }
}
