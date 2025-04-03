package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duyi implements duof {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/notificationcenter/NotificationCenter");
    public static final duyd b = new duyd() { // from class: duyi.1
        @Override // defpackage.duyc
        public final /* synthetic */ void a() {
        }
    };
    private static volatile duyi e;
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    private final ConcurrentHashMap f = new ConcurrentHashMap();
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public duyi() {
        duoe.a.a(this);
    }

    public static duyi a() {
        duyi duyiVar;
        duyi duyiVar2 = e;
        if (duyiVar2 != null) {
            return duyiVar2;
        }
        synchronized (duyi.class) {
            duyiVar = e;
            if (duyiVar == null) {
                duyiVar = new duyi();
                e = duyiVar;
            }
        }
        return duyiVar;
    }

    public static dvag b(String str) {
        return new dvag(dvah.b(str));
    }

    public static String c(Class cls) {
        return dvah.b(dvah.a(cls));
    }

    public final void d(duyj duyjVar, Class cls, Executor executor) {
        duyk duykVar = new duyk(duyjVar, cls, executor);
        synchronized (cls) {
            WeakHashMap weakHashMap = (WeakHashMap) this.c.get(cls);
            if (weakHashMap == null) {
                weakHashMap = new WeakHashMap();
                this.c.put(cls, weakHashMap);
            } else if (weakHashMap.get(duyjVar) != null) {
                ((enrr) ((enrr) a.i()).h("com/google/android/libraries/inputmethod/notificationcenter/NotificationCenter", "registerListenerInternal", 378, "NotificationCenter.java")).D("Listener %s is already registered for notification %s", duyjVar, cls);
                return;
            }
            weakHashMap.put(duyjVar, duykVar);
            duyc duycVar = (duyc) this.d.get(cls);
            if (duycVar != null) {
                duykVar.a(cls, duycVar, duyjVar);
            }
            WeakHashMap weakHashMap2 = (WeakHashMap) this.f.get(cls);
            enhk j = weakHashMap2 == null ? null : enhk.j(weakHashMap2);
            if (j != null) {
                enqu listIterator = j.entrySet().listIterator();
                while (listIterator.hasNext()) {
                    final Map.Entry entry = (Map.Entry) listIterator.next();
                    ((Executor) entry.getValue()).execute(new Runnable() { // from class: duye
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((duyl) entry.getKey()).a();
                        }
                    });
                }
            }
            if (duycVar != null) {
                duykVar.b();
            }
        }
    }

    public final void e(Class cls, duyc duycVar, Predicate predicate) {
        boolean test;
        Object apply;
        Class cls2 = cls;
        do {
            final ConcurrentHashMap concurrentHashMap = this.c;
            Function function = new Function() { // from class: duyg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function2) {
                    return Function$CC.$default$andThen(this, function2);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (WeakHashMap) ConcurrentHashMap.this.get((Class) obj);
                }

                public final /* synthetic */ Function compose(Function function2) {
                    return Function$CC.$default$compose(this, function2);
                }
            };
            synchronized (cls2) {
                if (predicate != null) {
                    test = predicate.test(cls2);
                    if (!test) {
                        if (cls2 == cls) {
                            return;
                        }
                    }
                }
                apply = function.apply(cls2);
                WeakHashMap weakHashMap = (WeakHashMap) apply;
                if (weakHashMap != null && !weakHashMap.isEmpty()) {
                    duyk[] duykVarArr = new duyk[weakHashMap.size()];
                    int i = 0;
                    for (Map.Entry entry : weakHashMap.entrySet()) {
                        duyk duykVar = (duyk) entry.getValue();
                        duykVarArr[i] = duykVar;
                        duykVar.a(cls, duycVar, (duyj) entry.getKey());
                        i++;
                    }
                    for (int i2 = 0; i2 < i; i2++) {
                        duykVarArr[i2].b();
                    }
                }
            }
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                return;
            }
        } while (duyc.class.isAssignableFrom(cls2));
    }
}
