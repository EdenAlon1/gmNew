package defpackage;

import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajgc extends alhh implements ajfs {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajgc(ffbr ffbrVar, ajfr ajfrVar, Executor executor) {
        super(ffbrVar, ajfrVar, executor);
        ffbrVar.getClass();
        executor.getClass();
    }

    private final void h(final ffji ffjiVar) {
        o(new Supplier() { // from class: ajfu
            @Override // java.util.function.Supplier
            public final Object get() {
                eppa a = epoz.a((epox) epoy.a.createBuilder());
                ffji.this.invoke(a);
                return a.a();
            }
        });
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new ajgb(ajga.a);
    }

    @Override // defpackage.ajfs
    public final void b() {
        h(new ffji() { // from class: ajfw
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                eppa eppaVar = (eppa) obj;
                eppaVar.getClass();
                eppaVar.b(4);
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.ajfs
    public final void c() {
        h(new ffji() { // from class: ajfx
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                eppa eppaVar = (eppa) obj;
                eppaVar.getClass();
                eppaVar.b(8);
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.ajfs
    public final void d() {
        h(new ffji() { // from class: ajfz
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                eppa eppaVar = (eppa) obj;
                eppaVar.getClass();
                eppaVar.b(3);
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.ajfs
    public final void e() {
        h(new ffji() { // from class: ajfy
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                eppa eppaVar = (eppa) obj;
                eppaVar.getClass();
                eppaVar.b(2);
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.ajfs
    public final void f() {
        h(new ffji() { // from class: ajft
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                eppa eppaVar = (eppa) obj;
                eppaVar.getClass();
                eppaVar.b(7);
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.ajfs
    public final void g() {
        h(new ffji() { // from class: ajfv
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                eppa eppaVar = (eppa) obj;
                eppaVar.getClass();
                eppaVar.b(6);
                return ffcu.a;
            }
        });
    }
}
