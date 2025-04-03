package defpackage;

import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnix {
    public final ffbr a;

    public cnix(ffbr ffbrVar) {
        this.a = ffbrVar;
    }

    public final void a(final cniz cnizVar) {
        Iterable$EL.forEach((Set) this.a.b(), new Consumer() { // from class: cniw
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                final cnih cnihVar = (cnih) obj;
                final cniz cnizVar2 = cniz.this;
                axnw.h(elfo.f(new Runnable() { // from class: cnif
                    @Override // java.lang.Runnable
                    public final void run() {
                        cnih.this.a(cnizVar2);
                    }
                }, cnihVar.a));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void b(final cniz cnizVar, final boolean z) {
        Iterable$EL.forEach((Set) this.a.b(), new Consumer() { // from class: cniv
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                final cnih cnihVar = (cnih) obj;
                if (z) {
                    return;
                }
                final cniz cnizVar2 = cniz.this;
                axnw.h(elfo.f(new Runnable() { // from class: cnig
                    @Override // java.lang.Runnable
                    public final void run() {
                        cnih.this.a(cnizVar2);
                    }
                }, cnihVar.a));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
