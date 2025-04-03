package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wba implements ehrp {
    final /* synthetic */ waz a;

    public wba(waz wazVar) {
        this.a = wazVar;
    }

    @Override // defpackage.ehro
    public final void b(ehrt ehrtVar) {
        int i = ehrtVar.e;
        if (i == 0) {
            this.a.c = new wbe();
            waz wazVar = this.a;
            wbe wbeVar = wazVar.c;
            wbeVar.aj = wazVar;
            wazVar.e(wbeVar);
            return;
        }
        if (i != 1) {
            throw new AssertionError(a.h(i, "Info & Options tab attempted to select invalid tab position"));
        }
        this.a.d = new wbf();
        waz wazVar2 = this.a;
        wbf wbfVar = wazVar2.d;
        wbfVar.aj = wazVar2;
        wazVar2.e(wbfVar);
    }

    @Override // defpackage.ehro
    public final void a(ehrt ehrtVar) {
    }

    @Override // defpackage.ehro
    public final void c(ehrt ehrtVar) {
    }
}
