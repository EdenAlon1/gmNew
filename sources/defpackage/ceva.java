package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.Comparator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class ceva {
    /* JADX WARN: Multi-variable type inference failed */
    public static ceva j(String str, engw engwVar) {
        ceze cezeVar = (ceze) engwVar.get(0);
        String q = cezeVar.q();
        int indexOf = q.indexOf("-");
        String substring = indexOf > 0 ? q.substring(indexOf + 1) : "";
        engw engwVar2 = (engw) Collection.EL.stream(engwVar).map(new Function() { // from class: ceux
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((ceze) obj).k());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.a);
        long longValue = ((Long) Collection.EL.stream(engwVar).map(new Function() { // from class: ceuy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ceze cezeVar2 = (ceze) obj;
                return (cezeVar2.s() == null || cezeVar2.s().getTime() == 0) ? Long.valueOf(cezeVar2.m()) : Long.valueOf(cezeVar2.s().getTime());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).min(new Comparator() { // from class: ceuz
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            }
        }).orElse(0L)).longValue();
        String r = cezeVar.r();
        if (true == substring.isEmpty()) {
            substring = null;
        }
        return new cetk(str, r, substring, cezeVar.q(), cezeVar.n(), cezeVar.k(), engwVar2, cezeVar.l(), longValue);
    }

    public abstract int a();

    public abstract long b();

    public abstract long c();

    public abstract engw d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public abstract String i();
}
