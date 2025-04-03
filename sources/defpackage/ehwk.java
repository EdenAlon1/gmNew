package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehwk extends ehwh {
    final /* synthetic */ dhri a;
    final /* synthetic */ ehwh b;
    final /* synthetic */ ehwr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehwk(ehwr ehwrVar, dhri dhriVar, dhri dhriVar2, ehwh ehwhVar) {
        super(dhriVar);
        this.a = dhriVar2;
        this.b = ehwhVar;
        this.c = ehwrVar;
    }

    @Override // defpackage.ehwh
    public final void a() {
        synchronized (this.c.f) {
            final ehwr ehwrVar = this.c;
            final dhri dhriVar = this.a;
            ehwrVar.e.add(dhriVar);
            dhriVar.a.s(new dhqs() { // from class: ehwj
                @Override // defpackage.dhqs
                public final void a(dhre dhreVar) {
                    dhri dhriVar2 = dhriVar;
                    ehwr ehwrVar2 = ehwr.this;
                    synchronized (ehwrVar2.f) {
                        ehwrVar2.e.remove(dhriVar2);
                    }
                }
            });
            if (this.c.l.getAndIncrement() > 0) {
                this.c.b.d("Already connected to the service.", new Object[0]);
            }
            ehwr ehwrVar2 = this.c;
            ehwh ehwhVar = this.b;
            if (ehwrVar2.n == null && !ehwrVar2.g) {
                ehwrVar2.b.d("Initiate binding to the service.", new Object[0]);
                ehwrVar2.d.add(ehwhVar);
                ehwrVar2.m = new ehwq(ehwrVar2);
                ehwrVar2.g = true;
                if (!ehwrVar2.a.bindService(ehwrVar2.h, ehwrVar2.m, 1)) {
                    ehwrVar2.b.d("Failed to bind to the service.", new Object[0]);
                    ehwrVar2.g = false;
                    Iterator it = ehwrVar2.d.iterator();
                    while (it.hasNext()) {
                        ((ehwh) it.next()).b(new ehws());
                    }
                    ehwrVar2.d.clear();
                }
            } else if (ehwrVar2.g) {
                ehwrVar2.b.d("Waiting to bind to the service.", new Object[0]);
                ehwrVar2.d.add(ehwhVar);
            } else {
                ehwhVar.run();
            }
        }
    }
}
