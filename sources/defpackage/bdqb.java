package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdqb {

    /* compiled from: PG */
    public interface a {
        Optional fe();
    }

    public static final bdpy a(String str) {
        bdpy bdpyVar = bdpy.a;
        if (str != null) {
            List U = ffpc.U(str, new char[]{':'});
            ArrayList arrayList = new ArrayList();
            Iterator it = U.iterator();
            while (it.hasNext()) {
                Long h = ffpc.h((String) it.next());
                if (h != null) {
                    arrayList.add(h);
                }
            }
            if (arrayList.size() != 2) {
                arrayList = null;
            }
            if (arrayList != null) {
                return new bdpy(((Number) arrayList.get(0)).longValue(), ((Number) arrayList.get(1)).longValue());
            }
        }
        return bdpy.a;
    }

    public static final bdpy b() {
        bdpy d = d();
        return d == null ? bdpy.c : d;
    }

    public static final String c(bdpy bdpyVar) {
        bdpyVar.getClass();
        return bdpyVar.d + ":" + bdpyVar.e;
    }

    public static final bdpy d() {
        Optional fe = ((a) ctba.a(a.class)).fe();
        final ffji ffjiVar = new ffji() { // from class: bdpz
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return ((bdpw) obj).a();
            }
        };
        return (bdpy) fe.map(new Function() { // from class: bdqa
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
    }
}
