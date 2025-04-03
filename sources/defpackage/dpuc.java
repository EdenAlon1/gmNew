package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpuc implements avf {
    final /* synthetic */ dpui a;
    final /* synthetic */ atl b;
    final /* synthetic */ int c;
    final /* synthetic */ ffrf d;

    public dpuc(dpui dpuiVar, atl atlVar, int i, ffrf ffrfVar) {
        this.a = dpuiVar;
        this.b = atlVar;
        this.c = i;
        this.d = ffrfVar;
    }

    @Override // defpackage.avf
    public final void a(avl avlVar) {
        dpui dpuiVar = this.a;
        dpfr dpfrVar = dpuiVar.f;
        if (dpfrVar != null) {
            dpfrVar.a(dpuiVar.a(this.b, this.c), drlu.a, avlVar);
        }
        this.d.w(ffci.a(avlVar));
    }

    @Override // defpackage.avf
    public final void b(avh avhVar) {
        this.d.w(avhVar);
    }
}
