package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Map;
import j$.util.function.BiConsumer$CC;
import java.util.function.BiConsumer;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public final class eihu {
    public static final Parcelable.Creator a = new eiht();

    public static void a(final Parcel parcel, ehzx ehzxVar) {
        eijb.r(parcel, 1, ehzxVar.c());
        eijb.r(parcel, 2, ehzxVar.b());
        final enhk a2 = ehzxVar.a();
        parcel.writeInt(3);
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        int i = ((enoz) a2).d;
        int dataPosition2 = parcel.dataPosition();
        parcel.writeInt(i);
        Map.EL.forEach(a2, new BiConsumer() { // from class: eiiw
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String str = (String) obj;
                Parcel parcel2 = parcel;
                parcel2.writeString(str);
                parcel2.writeString((String) a2.get(str));
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        eijb.k(parcel, dataPosition, dataPosition2);
        eijb.l(parcel);
    }
}
