package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hco extends ffkk implements ffjm {
    final /* synthetic */ long a;
    final /* synthetic */ ffjm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hco(long j, ffjm ffjmVar) {
        super(2);
        this.a = j;
        this.b = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hdh.d(this.a, this.b, hfdVar, 0);
        }
        return ffcu.a;
    }
}
