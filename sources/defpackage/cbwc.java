package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.BiFunction$CC;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbwc {
    public final errm a;
    private final dtuu c;
    private final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public cbwc(dtuu dtuuVar, errm errmVar) {
        this.c = dtuuVar;
        this.a = errmVar;
    }

    public final Integer a(MessageIdType messageIdType) {
        if (messageIdType.c()) {
            return null;
        }
        return (Integer) this.b.get(messageIdType);
    }

    public final Integer b(bdhg bdhgVar) {
        if (bdhgVar.i()) {
            return null;
        }
        return (Integer) this.d.get(bdhgVar);
    }

    public final boolean c(bdhg bdhgVar, int i) {
        if (bdhgVar.i()) {
            return false;
        }
        return d(bdhgVar, this.d, i);
    }

    public final boolean d(final Object obj, final ConcurrentHashMap concurrentHashMap, final int i) {
        final AtomicInteger atomicInteger = new AtomicInteger(-999);
        Integer num = (Integer) ConcurrentMap.EL.merge(concurrentHashMap, obj, Integer.valueOf(i), new BiFunction() { // from class: cbvz
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj2, Object obj3) {
                Integer num2 = (Integer) obj2;
                atomicInteger.set(num2.intValue());
                return Integer.valueOf(Math.max(num2.intValue(), ((Integer) obj3).intValue()));
            }
        });
        if (num.intValue() == i) {
            this.c.g(new dtut() { // from class: cbwa
                @Override // defpackage.dtut
                public final ekzz a() {
                    return eleg.f("StatusTracker::updateStatus");
                }
            }, null, new Runnable() { // from class: cbwb
                @Override // java.lang.Runnable
                public final void run() {
                    final ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                    final Object obj2 = obj;
                    final int i2 = i;
                    axnw.e(cbwc.this.a.schedule(eldl.l(new Runnable() { // from class: cbvy
                        @Override // java.lang.Runnable
                        public final void run() {
                            ConcurrentHashMap.this.remove(obj2, Integer.valueOf(i2));
                        }
                    }), 3L, TimeUnit.SECONDS));
                }
            });
        }
        return atomicInteger.get() == -999 || atomicInteger.get() != num.intValue();
    }
}
