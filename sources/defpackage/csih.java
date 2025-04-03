package defpackage;

import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class csih implements csib {
    public final ffbr a;
    private final Executor b;

    public csih(ffbr ffbrVar, errl errlVar) {
        this.a = ffbrVar;
        this.b = new ersb(errlVar);
    }

    @Override // defpackage.csib
    public final void c() {
        axnw.h(elfo.f(new Runnable() { // from class: csif
            @Override // java.lang.Runnable
            public final void run() {
                Iterable$EL.forEach((Set) csih.this.a.b(), new Consumer() { // from class: csid
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((csic) obj).a();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }, this.b));
    }

    @Override // defpackage.csib
    public final void f() {
        axnw.h(elfo.f(new Runnable() { // from class: csie
            @Override // java.lang.Runnable
            public final void run() {
                Iterable$EL.forEach((Set) csih.this.a.b(), new Consumer() { // from class: csig
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        ((csic) obj).b();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }, this.b));
    }

    @Override // defpackage.csib
    public final /* synthetic */ void a() {
    }

    @Override // defpackage.csib
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.csib
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.csib
    public final /* synthetic */ void e() {
    }
}
