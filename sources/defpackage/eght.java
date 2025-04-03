package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eght implements erqj {
    final /* synthetic */ egdt a;
    final /* synthetic */ eghu b;

    public eght(eghu eghuVar, egdt egdtVar) {
        this.a = egdtVar;
        this.b = eghuVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ewlh ewlhVar = (ewlh) obj;
        synchronized (this) {
            List list = this.b.c;
            ewiy ewiyVar = ewlhVar.b;
            if (ewiyVar == null) {
                ewiyVar = ewiy.a;
            }
            list.addAll(ewiyVar.d);
            List list2 = this.b.d;
            egdt egdtVar = this.a;
            ewiy ewiyVar2 = ewlhVar.b;
            if (ewiyVar2 == null) {
                ewiyVar2 = ewiy.a;
            }
            list2.add(egdtVar.b(ewiyVar2.d.size()));
            eghu eghuVar = this.b;
            llg llgVar = eghuVar.e;
            engw n = engw.n(eghuVar.c);
            ewiy ewiyVar3 = ewlhVar.b;
            if (ewiyVar3 == null) {
                ewiyVar3 = ewiy.a;
            }
            int i = ewiyVar3.b & 1;
            llgVar.j(new egho(n, emux.a, 1 == i, engw.n(this.b.d)));
            eghu eghuVar2 = this.b;
            ewiy ewiyVar4 = ewlhVar.b;
            if (ewiyVar4 == null) {
                ewiyVar4 = ewiy.a;
            }
            eghuVar2.g = 1 == (ewiyVar4.b & 1);
            eghuVar2.l = false;
            this.b.f = false;
        }
        this.b.b();
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        eghu eghuVar = this.b;
        egdp a = eghuVar.a.a(th);
        egdt egdtVar = this.a;
        List list = eghuVar.d;
        exfw c = egdtVar.c(th);
        list.add(c);
        exfr exfrVar = (exfr) exfs.a.createBuilder();
        exfu exfuVar = c.f;
        if (exfuVar == null) {
            exfuVar = exfu.a;
        }
        eghu eghuVar2 = this.b;
        exfrVar.copyOnWrite();
        exfs exfsVar = (exfs) exfrVar.instance;
        exfuVar.getClass();
        exfsVar.c = exfuVar;
        exfsVar.b |= 2;
        eghuVar2.b.b((exfs) exfrVar.build());
        eghu eghuVar3 = this.b;
        eghuVar3.e.j(new egho(engw.n(eghuVar3.c), emxc.j(a), true, engw.n(eghuVar3.d)));
        this.b.l = false;
        this.b.f = true;
    }
}
