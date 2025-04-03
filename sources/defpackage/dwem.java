package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwem implements ffjm {
    final /* synthetic */ ffjm a;

    public dwem(ffjm ffjmVar) {
        this.a = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            this.a.a(hfdVar, 0);
        }
        return ffcu.a;
    }
}
