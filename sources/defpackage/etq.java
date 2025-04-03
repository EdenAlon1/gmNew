package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class etq extends ffkk implements ffjm {
    final /* synthetic */ hvi a;
    final /* synthetic */ fhi b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public etq(hvi hviVar, fhi fhiVar, ffjm ffjmVar, int i) {
        super(2);
        this.a = hviVar;
        this.b = fhiVar;
        this.c = ffjmVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        hvi hviVar = this.a;
        fhi fhiVar = this.b;
        int i = this.d;
        eub.a(hviVar, fhiVar, this.c, (hfd) obj, hip.a(i | 1));
        return ffcu.a;
    }
}
