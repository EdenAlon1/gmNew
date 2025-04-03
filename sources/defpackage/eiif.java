package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eiif implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Optional empty = Optional.empty();
        Optional empty2 = Optional.empty();
        Optional empty3 = Optional.empty();
        Optional empty4 = Optional.empty();
        Optional empty5 = Optional.empty();
        Optional empty6 = Optional.empty();
        int a = eijb.a(parcel);
        boolean z = false;
        Optional optional = empty;
        Optional optional2 = empty2;
        Optional optional3 = empty3;
        Optional optional4 = empty4;
        Optional optional5 = empty5;
        Optional optional6 = empty6;
        String str = null;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        while (a != Integer.MIN_VALUE) {
            switch (a) {
                case 1:
                    str = (String) eijb.h(parcel, a).get();
                    break;
                case 2:
                    optional = Optional.of(eijb.c(parcel, a).get());
                    break;
                case 3:
                    optional2 = Optional.of(eijb.c(parcel, a).get());
                    break;
                case 4:
                    optional3 = Optional.of((String) eijb.h(parcel, a).get());
                    break;
                case 5:
                    optional4 = Optional.of((String) eijb.h(parcel, a).get());
                    break;
                case 6:
                    i |= 1;
                    d = ((Double) eijb.b(parcel, a).get()).doubleValue();
                    break;
                case 7:
                    i |= 2;
                    d2 = ((Double) eijb.b(parcel, a).get()).doubleValue();
                    break;
                case 8:
                    Double d3 = (Double) eijb.b(parcel, a).get();
                    d3.doubleValue();
                    optional5 = Optional.of(d3);
                    break;
                case 9:
                    optional6 = Optional.of((String) eijb.h(parcel, a).get());
                    break;
                default:
                    eijb.i(parcel, a);
                    break;
            }
            a = eijb.a(parcel);
        }
        emxf.a(eijb.e(parcel).isPresent());
        if (i != 3 || str == null) {
            StringBuilder sb = new StringBuilder();
            if (str == null) {
                sb.append(" id");
            }
            if ((i & 1) == 0) {
                sb.append(" longitude");
            }
            if ((i & 2) == 0) {
                sb.append(" latitude");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        ehyy ehyyVar = new ehyy(optional, str, optional2, optional3, optional4, d, d2, optional5, optional6);
        double d4 = ehyyVar.b;
        emxf.m(d4 >= -180.0d && d4 <= 180.0d, "Latitude must be between -180 and 180.");
        double d5 = ehyyVar.a;
        if (d5 >= -180.0d && d5 <= 180.0d) {
            z = true;
        }
        emxf.m(z, "Longitude must be between -180 and 180.");
        ehyyVar.c.ifPresent(new Consumer() { // from class: eibi
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                emxf.m(((Double) obj).doubleValue() >= eobe.a, "Radius must be non-negative.");
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return ehyyVar;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new eibj[i];
    }
}
