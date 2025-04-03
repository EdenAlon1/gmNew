package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dssc implements ffjm {
    final /* synthetic */ dsrv a;
    final /* synthetic */ ffjm b;

    public dssc(dsrv dsrvVar, ffjm ffjmVar) {
        this.a = dsrvVar;
        this.b = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dwho.a(dnaa.a(this.a.a, hfdVar), this.a.b, null, 0L, hfdVar, 0, 12);
            this.b.a(hfdVar, 0);
        }
        return ffcu.a;
    }
}
