package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egic implements erqj {
    final /* synthetic */ egdt a;
    final /* synthetic */ boolean b;
    final /* synthetic */ egie c;

    public egic(egie egieVar, egdt egdtVar, boolean z) {
        this.a = egdtVar;
        this.b = z;
        this.c = egieVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ewll ewllVar = (ewll) obj;
        synchronized (this) {
            ewlt ewltVar = ewllVar.b;
            if (ewltVar == null) {
                ewltVar = ewlt.a;
            }
            this.c.c.addAll(ewltVar.e);
            this.c.d.add(this.a.b(ewltVar.e.size()));
            egie egieVar = this.c;
            egieVar.e.j(new eghp(engw.n(egieVar.c), emux.a, 1 == (ewltVar.b & 1), engw.n(this.c.d)));
            egie egieVar2 = this.c;
            egieVar2.g = 1 == (ewltVar.b & 1);
            egieVar2.o = false;
            egie egieVar3 = this.c;
            egieVar3.f = false;
            if (egieVar3.g) {
                egdg egdgVar = egieVar3.a;
                exfm exfmVar = (exfm) exfn.a.createBuilder();
                int i = true != ewltVar.e.isEmpty() ? 109 : 108;
                exfmVar.copyOnWrite();
                exfn exfnVar = (exfn) exfmVar.instance;
                exfnVar.c = i - 1;
                exfnVar.b |= 1;
                egdgVar.a((exfn) exfmVar.build());
            }
            if (this.b && !this.c.d()) {
                egdg egdgVar2 = this.c.a;
                exfm exfmVar2 = (exfm) exfn.a.createBuilder();
                exfmVar2.copyOnWrite();
                exfn exfnVar2 = (exfn) exfmVar2.instance;
                exfnVar2.c = 106;
                exfnVar2.b |= 1;
                long j = this.c.h;
                exfmVar2.copyOnWrite();
                exfn exfnVar3 = (exfn) exfmVar2.instance;
                exfnVar3.b |= 2;
                exfnVar3.d = j;
                egdgVar2.a((exfn) exfmVar2.build());
            }
        }
        this.c.b();
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        egie egieVar = this.c;
        egdp a = egieVar.b.a(th);
        egdt egdtVar = this.a;
        List list = egieVar.d;
        exfw c = egdtVar.c(th);
        list.add(c);
        exfr exfrVar = (exfr) exfs.a.createBuilder();
        exfu exfuVar = c.f;
        if (exfuVar == null) {
            exfuVar = exfu.a;
        }
        egie egieVar2 = this.c;
        exfrVar.copyOnWrite();
        exfs exfsVar = (exfs) exfrVar.instance;
        exfuVar.getClass();
        exfsVar.c = exfuVar;
        exfsVar.b |= 2;
        egieVar2.a.b((exfs) exfrVar.build());
        egie egieVar3 = this.c;
        egieVar3.e.j(new eghp(engw.n(egieVar3.c), emxc.j(a), true, engw.n(egieVar3.d)));
        this.c.o = false;
        this.c.f = true;
    }
}
