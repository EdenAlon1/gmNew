package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gok extends ffkk implements ffjm {
    final /* synthetic */ goa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gok(goa goaVar) {
        super(2);
        this.a = goaVar;
    }

    @Override // defpackage.ffjm
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            grl.b(this.a.b.a, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, hfdVar, 0, 0, 131070);
        }
        return ffcu.a;
    }
}
