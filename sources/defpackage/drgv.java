package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drgv implements dtal {
    final /* synthetic */ drgw a;

    public drgv(drgw drgwVar) {
        this.a = drgwVar;
    }

    @Override // defpackage.dtal
    public final void a() {
        ffud ffudVar = this.a.j;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        this.a.h.invoke();
    }

    @Override // defpackage.dtal
    public final void b() {
        drgw drgwVar = this.a;
        drgwVar.i = ffqy.d(drgwVar.b, null, null, new drgq(drgwVar, null), 3);
    }

    @Override // defpackage.dtal
    public final void c(String str) {
        ffud ffudVar = this.a.j;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        drgw drgwVar = this.a;
        drgwVar.j = ffqy.d(drgwVar.b, null, null, new drgu(drgwVar, str, null), 3);
    }
}
