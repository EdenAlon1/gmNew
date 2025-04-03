package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uun implements ejwd<engw<coiy>> {
    final /* synthetic */ uuy a;

    public uun(uuy uuyVar) {
        this.a = uuyVar;
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
        csjy.p("Bugle", th, "Error: getting scheduled messages within conversation. ".concat(String.valueOf(String.valueOf(this.a.ap))));
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final engw engwVar = (engw) obj;
        this.a.aB.a.ifPresent(new Consumer() { // from class: upt
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                ((akpv) obj2).I(engw.this);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ejwd
    public final void hB() {
    }
}
