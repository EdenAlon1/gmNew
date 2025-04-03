package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cupc implements erqj {
    final /* synthetic */ cupd a;

    public cupc(cupd cupdVar) {
        this.a = cupdVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        cupd.a.p("MoiraiApi was initialized");
        synchronized (cupd.c) {
            this.a.g = true;
        }
        if (((Boolean) cupd.b.e()).booleanValue()) {
            ((alrv) this.a.e.b()).c(new ecda("Moirai API initialized"));
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        if (th instanceof dlgk) {
            cupa cupaVar = (cupa) this.a.f.b();
            int i = ((dlgk) th).b;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            cupaVar.b(i2);
        } else {
            ((cupa) this.a.f.b()).b(-1);
        }
        synchronized (cupd.c) {
            cupd.a.s("Failed to initialize MoiraiApi.", th);
            cupd cupdVar = this.a;
            cupdVar.k = ((cqoh) cupdVar.i.b()).f().toEpochMilli() + Math.round(((Integer) cupj.a.e()).intValue() * Math.pow(((Integer) cupj.b.e()).intValue(), cupdVar.j - 1));
        }
        boolean andSet = this.a.h.getAndSet(true);
        if (!((Boolean) cupd.b.e()).booleanValue() || andSet) {
            return;
        }
        ((alrv) this.a.e.b()).c(new ecda("Moirai API initialized"));
    }
}
