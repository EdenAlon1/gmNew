package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egew implements erqj {
    final /* synthetic */ emwl a;
    final /* synthetic */ egex b;
    final /* synthetic */ int c;

    public egew(egex egexVar, emwl emwlVar, int i) {
        this.a = emwlVar;
        this.c = i;
        this.b = egexVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.g.j((egfk) this.a.apply((List) obj));
        exfv exfvVar = (exfv) exfw.a.createBuilder();
        exfx exfxVar = (exfx) exfy.a.createBuilder();
        exfxVar.copyOnWrite();
        exfy exfyVar = (exfy) exfxVar.instance;
        exfyVar.c = this.c - 1;
        exfyVar.b |= 1;
        exfvVar.copyOnWrite();
        exfw exfwVar = (exfw) exfvVar.instance;
        exfy exfyVar2 = (exfy) exfxVar.build();
        exfyVar2.getClass();
        exfwVar.d = exfyVar2;
        exfwVar.c = 9;
        this.b.e.b(exfvVar);
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        List c = emyt.c(th);
        c.getClass();
        qwp qwpVar = (qwp) enjk.i(enjk.d(c, new emxi(qwp.class)), null);
        exfv exfvVar = (exfv) exfw.a.createBuilder();
        exfx exfxVar = (exfx) exfy.a.createBuilder();
        exfxVar.copyOnWrite();
        exfy exfyVar = (exfy) exfxVar.instance;
        exfyVar.c = this.c - 1;
        exfyVar.b |= 1;
        exfvVar.copyOnWrite();
        exfw exfwVar = (exfw) exfvVar.instance;
        exfy exfyVar2 = (exfy) exfxVar.build();
        exfyVar2.getClass();
        exfwVar.d = exfyVar2;
        exfwVar.c = 9;
        exfu a = egcy.a(qwpVar);
        exfvVar.copyOnWrite();
        exfw exfwVar2 = (exfw) exfvVar.instance;
        a.getClass();
        exfwVar2.f = a;
        exfwVar2.b |= 2;
        this.b.e.b(exfvVar);
        this.b.g.j(egfk.b(egdp.RETRYABLE));
    }
}
