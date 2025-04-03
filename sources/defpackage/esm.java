package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class esm extends ffkk implements ffjm {
    final /* synthetic */ fhi a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esm(fhi fhiVar, ffjm ffjmVar, int i) {
        super(2);
        this.a = fhiVar;
        this.b = ffjmVar;
        this.c = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int a = hip.a(this.c | 1);
        esr.c(this.a, this.b, (hfd) obj, a);
        return ffcu.a;
    }
}
