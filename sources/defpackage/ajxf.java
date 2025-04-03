package defpackage;

import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.UUID;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajxf implements Runnable {
    final /* synthetic */ UUID a;
    final /* synthetic */ ajyr b;
    final /* synthetic */ akci c;

    public ajxf(UUID uuid, ajyr ajyrVar, akci akciVar) {
        this.a = uuid;
        this.b = ajyrVar;
        this.c = akciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object apply;
        Object apply2;
        bxkz a = bxle.a();
        a.z("completeActiveExecution");
        a.c(new ajxd(this.a));
        if (((bxjb) ((bxkf) a.b().o()).cS()) == null) {
            throw new ajww(this.a);
        }
        ajyr ajyrVar = this.b;
        UUID uuid = this.a;
        akci akciVar = this.c;
        int longValue = (int) ((Number) ajyrVar.g.b()).longValue();
        bxkz a2 = bxle.a();
        a2.z("onlyKeepLastNInactiveExecutions");
        a2.r();
        apply = new Function() { // from class: ajwk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = ajyr.a;
                return bxle.c.a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(bxle.c);
        bxke[] bxkeVarArr = {(bxke) apply};
        int intValue = bxle.c().intValue();
        if (((Integer) bxle.b.getOrDefault(bxkeVarArr[0].toString(), -1)).intValue() > intValue) {
            dtub.w("columnReference.toString()", intValue);
        }
        a2.m(bxkeVarArr);
        a2.c(new Function() { // from class: ajwl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxld bxldVar = (bxld) obj;
                bxldVar.getClass();
                ajyr.B(bxldVar);
                return bxldVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        a2.C((String) DesugarArrays.stream(new bxkw[]{new bxkw(bxle.c.a)}).map(new Function() { // from class: bxky
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((bxkw) obj).a();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
        a2.x(longValue - 1);
        final bxkx b = a2.b();
        bxkt bxktVar = new bxkt();
        bxktVar.f("onlyKeepLastNInactiveExecutions");
        apply2 = new Function() { // from class: ajwm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bxld bxldVar = (bxld) obj;
                bxldVar.getClass();
                ajyr.B(bxldVar);
                bxldVar.aq(new dtru("restore_workflow_executions._id", 4, bxkx.this));
                return bxldVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new bxld());
        bxktVar.b = new bxlc((bxld) apply2);
        bxktVar.e();
        bxktVar.d();
        ajyrVar.t(uuid, akciVar, new ajxe(ajyrVar));
    }
}
