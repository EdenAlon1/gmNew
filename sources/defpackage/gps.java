package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gps extends ffkk implements ffjm {
    final /* synthetic */ ffjm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gps(ffjm ffjmVar) {
        super(2);
        this.a = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            float f = heb.a;
            grl.a(jpo.y(gvu.a(heb.b, hfdVar), 0L, 0L, null, null, null, null, 0L, null, 3, 0, 0L, null, null, 0, 16744447), this.a, hfdVar, 0);
        }
        return ffcu.a;
    }
}
