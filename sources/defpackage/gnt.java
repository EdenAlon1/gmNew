package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gnt extends ffkk implements ffjm {
    final /* synthetic */ ffjn a;
    final /* synthetic */ goa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnt(ffjn ffjnVar, goa goaVar) {
        super(2);
        this.a = ffjnVar;
        this.b = goaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            ffjn ffjnVar = this.a;
            goa goaVar = this.b;
            goaVar.getClass();
            ffjnVar.a(goaVar, hfdVar, 0);
        }
        return ffcu.a;
    }
}
