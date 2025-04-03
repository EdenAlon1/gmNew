package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiht implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Optional of;
        int i = ehzx.a;
        ehyh ehyhVar = new ehyh();
        ehyhVar.c = enoz.a;
        ehyhVar.b((String) eijb.h(parcel, 1).get());
        ehyhVar.a((String) eijb.h(parcel, 2).get());
        if (eijb.s(parcel, 3)) {
            parcel.readInt();
            int readInt = parcel.readInt();
            enhd enhdVar = new enhd();
            for (int i2 = 0; i2 < readInt; i2++) {
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (readString != null && readString2 != null) {
                    enhdVar.k(readString, readString2);
                }
            }
            of = Optional.of(enhdVar.c());
        } else {
            of = Optional.empty();
        }
        ehyhVar.c = (enhk) of.get();
        eijb.j(parcel);
        String str = ehyhVar.a;
        if (str == null) {
            throw new IllegalStateException("Property \"type\" has not been set");
        }
        ehyhVar.b(emuz.c(str));
        String str2 = ehyhVar.b;
        if (str2 == null) {
            throw new IllegalStateException("Property \"subType\" has not been set");
        }
        ehyhVar.a(emuz.c(str2));
        enhd enhdVar2 = new enhd();
        enhk enhkVar = ehyhVar.c;
        if (enhkVar == null) {
            throw new IllegalStateException("Property \"parameters\" has not been set");
        }
        enqu listIterator = enhkVar.keySet().listIterator();
        while (listIterator.hasNext()) {
            String str3 = (String) listIterator.next();
            String str4 = (String) enhkVar.get(str3);
            if (str4 != null) {
                enhdVar2.k(emuz.c(str3), str4);
            }
        }
        ehyhVar.c = enhdVar2.c();
        if (ehyhVar.a != null && ehyhVar.b != null && ehyhVar.c != null) {
            return new ehyi(ehyhVar.a, ehyhVar.b, ehyhVar.c);
        }
        StringBuilder sb = new StringBuilder();
        if (ehyhVar.a == null) {
            sb.append(" type");
        }
        if (ehyhVar.b == null) {
            sb.append(" subType");
        }
        if (ehyhVar.c == null) {
            sb.append(" parameters");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ehzx[0];
    }
}
