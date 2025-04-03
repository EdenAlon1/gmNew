package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeey {
    public static final /* synthetic */ int a = 0;
    private static final enhk b;
    private static final engf c;
    private static final enhk d;
    private static final enhk e;
    private static final engf f;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k(fiyj.class, 35);
        enhdVar.k(fizp.class, 33);
        enhdVar.k(fiwh.class, 1);
        enhdVar.k(fiwd.class, 28);
        b = enhdVar.c();
        engd engdVar = new engd();
        engdVar.d(fiyj.class, ezaa.DNS_QUERY_TYPE_NAPTR);
        engdVar.d(fizp.class, ezaa.DNS_QUERY_TYPE_SRV);
        engdVar.d(fiwh.class, ezaa.DNS_QUERY_TYPE_A);
        engdVar.d(fiwd.class, ezaa.DNS_QUERY_TYPE_AAAA);
        c = engdVar.c();
        enhd enhdVar2 = new enhd();
        enhdVar2.k(0, eyzy.DNS_QUERY_RESULT_SUCCESS);
        enhdVar2.k(3, eyzy.DNS_QUERY_RESULT_FAILURE);
        enhdVar2.k(4, eyzy.DNS_QUERY_RESULT_FAILURE);
        enhdVar2.k(2, eyzy.DNS_QUERY_RESULT_FAILURE);
        enhdVar2.k(1, eyzy.DNS_QUERY_RESULT_FAILURE);
        d = enhdVar2.c();
        enhd enhdVar3 = new enhd();
        enhdVar3.k(3, eyzw.DNS_FAILURE_TYPE_HOST_NOT_FOUND);
        enhdVar3.k(4, eyzw.DNS_FAILURE_TYPE_QUERY_TYPE_NOT_FOUND);
        enhdVar3.k(2, eyzw.DNS_FAILURE_TYPE_TRANSIENT);
        enhdVar3.k(1, eyzw.DNS_FAILURE_TYPE_GENERIC);
        e = enhdVar3.c();
        engd engdVar2 = new engd();
        engdVar2.d(ClassCastException.class, eyzt.DNS_CLIENT_EXCEPTION_TYPE_CLASS_CAST);
        engdVar2.d(fjad.class, eyzt.DNS_CLIENT_EXCEPTION_TYPE_TEXT_PARSE);
        engdVar2.d(ExceptionInInitializerError.class, eyzt.DNS_CLIENT_EXCEPTION_TYPE_EXCEPTION_IN_INITIALIZATION_ERROR);
        engdVar2.d(NoClassDefFoundError.class, eyzt.DNS_CLIENT_EXCEPTION_TYPE_NO_CLASS_DEF_FOUND_ERROR);
        engdVar2.d(RuntimeException.class, eyzt.DNS_CLIENT_EXCEPTION_TYPE_RUNTIME);
        f = engdVar2.c();
    }

    static int a(Class cls) {
        Integer num = (Integer) b.get(cls);
        cls.getName();
        num.getClass();
        return num.intValue();
    }

    static eeer b(String str, Class cls, String[] strArr) {
        long e2 = e();
        String str2 = strArr.length == 0 ? null : strArr[0];
        str.getClass();
        return new eedn(str, (ezaa) c.getOrDefault(cls, ezaa.DNS_QUERY_TYPE_UNKNOWN), str2, e2, false);
    }

    public static eees c(eeer eeerVar, Throwable th) {
        long e2 = e();
        eyzt eyztVar = (eyzt) f.getOrDefault(th.getClass(), eyzt.DNS_CLIENT_EXCEPTION_TYPE_UNKNOWN);
        engw engwVar = eees.g;
        return new eedo(eeerVar, eyzy.DNS_QUERY_RESULT_FAILURE, eees.g, Optional.of(eyzw.DNS_FAILURE_TYPE_CLIENT_EXCEPTION), Optional.of(eyztVar), e2);
    }

    static eees d(eefi eefiVar, eeer eeerVar, List list) {
        List list2 = (list == null || list.isEmpty()) ? null : (List) Collection.EL.stream(list).map(new Function() { // from class: eeex
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                fizg fizgVar = (fizg) obj;
                boolean z = fizgVar instanceof fiyj;
                int i = eeey.a;
                if (z) {
                    return ((fiyj) fizgVar).c.b(true);
                }
                if (fizgVar instanceof fizp) {
                    return ((fizp) fizgVar).d.b(true);
                }
                if (fizgVar instanceof fiwh) {
                    return ((fiwh) fizgVar).e().getHostAddress();
                }
                if (fizgVar instanceof fiwd) {
                    return ((fiwd) fizgVar).e().getHostAddress();
                }
                throw new IllegalStateException("unexpected record type in response");
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toList());
        long e2 = e();
        eyzy eyzyVar = (eyzy) d.getOrDefault(Integer.valueOf(eefiVar.a()), eyzy.DNS_QUERY_RESULT_UNKNOWN);
        eyzw eyzwVar = eefiVar.a() != 0 ? (eyzw) e.getOrDefault(Integer.valueOf(eefiVar.a()), eyzw.DNS_FAILURE_TYPE_UNKNOWN) : null;
        engw engwVar = eees.g;
        if (eyzy.DNS_QUERY_RESULT_SUCCESS.equals(eyzyVar)) {
            emxf.b(eyzwVar == null, "expected null failure type on success");
        } else if (eyzy.DNS_QUERY_RESULT_FAILURE.equals(eyzyVar)) {
            emxf.b(eyzwVar != null, "expected failure type");
        }
        if (list2 == null) {
            list2 = eees.g;
        }
        return new eedo(eeerVar, eyzyVar, list2, Optional.ofNullable(eyzwVar), Optional.empty(), e2);
    }

    private static long e() {
        return System.nanoTime() / 1000000;
    }
}
