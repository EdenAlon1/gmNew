package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acmx {
    public final errl a;
    public final eixo b;
    public final ejar c;
    public final errl d;
    public final ebwq e;
    private final aclb f;

    public acmx(eixo eixoVar, errl errlVar, ejar ejarVar, ebwq ebwqVar, errl errlVar2, aclb aclbVar) {
        this.b = eixoVar;
        this.a = errlVar;
        this.c = ejarVar;
        this.e = ebwqVar;
        this.d = errlVar2;
        this.f = aclbVar;
    }

    public final elfl a() {
        return this.f.d().i(new eroh() { // from class: acmn
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final acmx acmxVar = acmx.this;
                final ejar ejarVar = acmxVar.c;
                ejarVar.getClass();
                return (ListenableFuture) ((Optional) obj).map(new Function() { // from class: acmo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ejar.this.c((String) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).map(new Function() { // from class: acmp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return elfl.g((ListenableFuture) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).map(new Function() { // from class: acmq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((elfl) obj2).h(new emwl() { // from class: acmt
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                return Optional.of((eisx) obj3);
                            }
                        }, acmx.this.d);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(elfo.e(Optional.empty()));
            }
        }, this.d);
    }
}
