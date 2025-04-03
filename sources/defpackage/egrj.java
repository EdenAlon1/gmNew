package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egrj {
    private final egdg a;
    private final egda b;
    private final egjk c;
    private emxc d = emux.a;

    public egrj(egdg egdgVar, egda egdaVar, egjk egjkVar) {
        this.a = egdgVar;
        this.b = egdaVar;
        this.c = egjkVar;
    }

    public final void a() {
        if (!this.d.g()) {
            this.d = emxc.j(this.b.a());
        }
        Object c = this.d.c();
        egjk egjkVar = this.c;
        emyg emygVar = ((egdb) c).a;
        int i = egjkVar.c;
        exfv exfvVar = (exfv) exfw.a.createBuilder();
        exgp exgpVar = (exgp) exgq.a.createBuilder();
        exgpVar.copyOnWrite();
        exgq exgqVar = (exgq) exgpVar.instance;
        exgqVar.c = 7;
        exgqVar.b |= 1;
        exgpVar.copyOnWrite();
        exgq exgqVar2 = (exgq) exgpVar.instance;
        exgqVar2.d = 5;
        exgqVar2.b |= 2;
        exgpVar.copyOnWrite();
        exgq exgqVar3 = (exgq) exgpVar.instance;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        exgqVar3.e = i2;
        exgqVar3.b |= 4;
        exfvVar.copyOnWrite();
        exfw exfwVar = (exfw) exfvVar.instance;
        exgq exgqVar4 = (exgq) exgpVar.build();
        exgqVar4.getClass();
        exfwVar.d = exgqVar4;
        exfwVar.c = 1;
        exfw a = new egdc(emygVar, exfvVar).a();
        exgb exgbVar = (exgb) exgc.a.createBuilder();
        exgbVar.c(a);
        exgf exgfVar = (exgf) exgg.a.createBuilder();
        exgfVar.copyOnWrite();
        exgg exggVar = (exgg) exgfVar.instance;
        exggVar.c = 13;
        exggVar.b |= 1;
        long j = a.e;
        exgfVar.copyOnWrite();
        exgg exggVar2 = (exgg) exgfVar.instance;
        exggVar2.b |= 2;
        exggVar2.d = j;
        exgbVar.copyOnWrite();
        exgc exgcVar = (exgc) exgbVar.instance;
        exgg exggVar3 = (exgg) exgfVar.build();
        exggVar3.getClass();
        exgcVar.d = exggVar3;
        exgcVar.b |= 1;
        exgc exgcVar2 = (exgc) exgbVar.build();
        egdg egdgVar = this.a;
        exer exerVar = (exer) exes.a.createBuilder();
        exex exexVar = (exex) exey.a.createBuilder();
        boolean z = this.c.a;
        exexVar.copyOnWrite();
        exey exeyVar = (exey) exexVar.instance;
        exeyVar.b |= 4;
        exeyVar.c = z;
        exey exeyVar2 = (exey) exexVar.build();
        exerVar.copyOnWrite();
        exes exesVar = (exes) exerVar.instance;
        exeyVar2.getClass();
        exesVar.c = exeyVar2;
        exesVar.b = 1;
        egdgVar.d(exgcVar2, (exes) exerVar.build());
    }

    public final void b() {
        exgd exgdVar = (exgd) exge.a.createBuilder();
        exgdVar.copyOnWrite();
        exge exgeVar = (exge) exgdVar.instance;
        exgeVar.c = 13;
        exgeVar.b |= 1;
        this.a.e((exge) exgdVar.build());
        egdb a = this.b.a();
        emyg emygVar = a.a;
        emygVar.e();
        emygVar.f();
        this.d = emxc.j(a);
    }
}
