package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dote implements ffjm {
    final /* synthetic */ dotb a;
    final /* synthetic */ boolean b;

    public dote(dotb dotbVar, boolean z) {
        this.a = dotbVar;
        this.b = z;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dotb dotbVar = this.a;
            boolean z = this.b;
            dosl doslVar = dotbVar.a;
            dose.h(dotbVar.b, z, (doslVar instanceof dosk) && ((dosk) doslVar).c != null, hfdVar, 0);
        }
        return ffcu.a;
    }
}
