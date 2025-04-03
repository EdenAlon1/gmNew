package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageExtensionHeader;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eigh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        eigi i = Message.i();
        int h = dfxj.h(parcel);
        while (parcel.dataPosition() < h) {
            int readInt = parcel.readInt();
            switch (dfxj.d(readInt)) {
                case 1:
                    i.f(dfxj.t(parcel, readInt));
                    break;
                case 2:
                    i.i((RcsDestinationId) dfxj.n(parcel, readInt, RcsDestinationId.CREATOR));
                    break;
                case 3:
                    i.c(engw.n(dfxj.z(parcel, readInt, Message.MessageContent.CREATOR)));
                    break;
                case 4:
                    i.h((RcsDestinationId) dfxj.n(parcel, readInt, RcsDestinationId.CREATOR));
                    break;
                case 5:
                    i.e(engw.n(dfxj.z(parcel, readInt, MessageExtensionHeader.CREATOR)));
                    break;
                case 6:
                    i.j(eihh.a(parcel, readInt));
                    break;
                case 7:
                    i.g(dfxj.D(parcel, readInt));
                    break;
                case 8:
                    ArrayList y = dfxj.y(parcel, readInt);
                    final Class<eigj> cls = eigj.class;
                    if (y == null) {
                        throw new dfxi("Failed to read string list of ".concat(String.valueOf(eigj.class.getName())), parcel);
                    }
                    i.d(enip.o((Collection) Collection.EL.stream(y).map(new Function() { // from class: eihd
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            Map map;
                            String str = (String) obj;
                            Map map2 = emwf.a;
                            str.getClass();
                            Map map3 = emwf.a;
                            Class cls2 = cls;
                            synchronized (map3) {
                                map = (Map) emwf.a.get(cls2);
                                if (map == null) {
                                    map = new HashMap();
                                    Iterator it = EnumSet.allOf(cls2).iterator();
                                    while (it.hasNext()) {
                                        Enum r4 = (Enum) it.next();
                                        map.put(r4.name(), new WeakReference(r4));
                                    }
                                    emwf.a.put(cls2, map);
                                }
                            }
                            WeakReference weakReference = (WeakReference) map.get(str);
                            return weakReference == null ? emux.a : emxc.i((Enum) cls2.cast(weakReference.get()));
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new Predicate() { // from class: eihe
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo439negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return ((emxc) obj).g();
                        }
                    }).map(new Function() { // from class: eihf
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return (Enum) ((emxc) obj).c();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toSet())));
                    break;
                default:
                    dfxj.C(parcel, readInt);
                    break;
            }
        }
        return i.a();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Message[i];
    }
}
