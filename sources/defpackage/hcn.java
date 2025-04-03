package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hcn extends ffkk implements ffjm {
    final /* synthetic */ long a;
    final /* synthetic */ jpo b;
    final /* synthetic */ ffjm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hcn(long j, jpo jpoVar, ffjm ffjmVar) {
        super(2);
        this.a = j;
        this.b = jpoVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            hdh.c(this.a, this.b, this.c, hfdVar, 0);
        }
        return ffcu.a;
    }
}
