package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dotd implements ffjm {
    final /* synthetic */ dotb a;
    final /* synthetic */ hzi b;

    public dotd(dotb dotbVar, hzi hziVar) {
        this.a = dotbVar;
        this.b = hziVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dotb dotbVar = this.a;
            dosv.b(dotbVar.a, this.b, hfdVar, 0);
        }
        return ffcu.a;
    }
}
