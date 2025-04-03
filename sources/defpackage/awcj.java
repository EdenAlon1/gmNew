package defpackage;

import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Function$CC;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awcj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ awcl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awcj(awcl awclVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = awclVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awcj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        awcl awclVar = this.b;
        this.a = 1;
        ffrh ffrhVar = new ffrh(ffhi.c(this), 1);
        ffrhVar.B();
        awclVar.d = ffrhVar;
        awci awciVar = new awci(ffrhVar, awclVar);
        ffrhVar.d(new awch(awclVar));
        final ffji ffjiVar = new ffji() { // from class: awak
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                return new LinkedHashSet();
            }
        };
        ((Set) ConcurrentMap.EL.computeIfAbsent(awclVar.b.a, awclVar.c, new Function() { // from class: awal
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ffji.this.invoke(obj2);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })).add(awciVar);
        Object m = ffrhVar.m();
        return m == ffhhVar ? ffhhVar : m;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new awcj(this.b, ffguVar);
    }
}
