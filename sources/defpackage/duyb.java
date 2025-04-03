package defpackage;

import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Predicate$CC;
import java.util.Map;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duyb {
    private static final enru b = enru.c("com/google/android/libraries/inputmethod/notificationcenter/ComponentsReadinessManager");
    private static final Map c = new ConcurrentHashMap();
    public static final Map a = new ConcurrentHashMap();

    static {
        dvas.b();
    }

    private duyb() {
    }

    public static void a(duxx duxxVar) {
        if (duzy.a) {
            duya duyaVar = (duya) a.get(duxxVar.getClass());
            if (duyaVar == null || duyaVar.b != duxxVar) {
                throw new IllegalArgumentException(String.valueOf(String.valueOf(duxxVar)).concat(" is not a valid component tag"));
            }
        }
    }

    public static void b(String str, boolean z) {
        if (duzy.a && z) {
            throw new IllegalStateException(str);
        }
        ((enrr) ((enrr) b.j()).h("com/google/android/libraries/inputmethod/notificationcenter/ComponentsReadinessManager", "logErrorMessage", 616, "ComponentsReadinessManager.java")).t("%s", str);
    }

    public static void c(String str, duxx duxxVar) {
        synchronized (duyb.class) {
            Class<?> cls = duxxVar.getClass();
            Map map = c;
            duya duyaVar = (duya) map.get(str);
            Map map2 = a;
            duya duyaVar2 = (duya) map2.get(cls);
            if (duyaVar == null && duyaVar2 == null) {
                duya duyaVar3 = new duya(str, duxxVar);
                map.put(str, duyaVar3);
                map2.put(cls, duyaVar3);
            } else if (duyaVar != duyaVar2 || (duyaVar2 != null && duyaVar2.b != duxxVar)) {
                throw new IllegalArgumentException(a.v(str, " component is already registered with a different value."));
            }
        }
    }

    public static void d(final duxx duxxVar) {
        a(duxxVar);
        final duyi a2 = duyi.a();
        final Class<?> cls = duxxVar.getClass();
        dvag b2 = duyi.b(duyi.c(cls));
        try {
            a2.e(cls, duxxVar, duxxVar instanceof duyd ? new Predicate() { // from class: duyh
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
                    ConcurrentHashMap concurrentHashMap = duyi.this.d;
                    Class cls2 = (Class) obj;
                    duyc duycVar = duxxVar;
                    return (cls2 == cls && Objects.equals((duyd) concurrentHashMap.put(cls2, duycVar), duycVar)) ? false : true;
                }
            } : null);
            b2.close();
        } catch (Throwable th) {
            try {
                b2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
