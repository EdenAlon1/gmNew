package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class du extends dx {
    final /* synthetic */ afd a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ adu c;
    final /* synthetic */ adf d;
    final /* synthetic */ ea e;

    public du(ea eaVar, afd afdVar, AtomicReference atomicReference, adu aduVar, adf adfVar) {
        this.e = eaVar;
        this.a = afdVar;
        this.b = atomicReference;
        this.c = aduVar;
        this.d = adfVar;
    }

    @Override // defpackage.dx
    public final void a() {
        StringBuilder sb = new StringBuilder("fragment_");
        ea eaVar = this.e;
        sb.append(eaVar.l);
        sb.append("_rq#");
        sb.append(eaVar.ae.getAndIncrement());
        this.b.set(((adn) this.a.a(null)).c(sb.toString(), this.e, this.c, this.d));
    }
}
