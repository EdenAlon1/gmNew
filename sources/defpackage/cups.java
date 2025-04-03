package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cups extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cupt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cups(cupt cuptVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cuptVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cups) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cupj cupjVar = (cupj) this.b.a.b();
            this.a = 1;
            if (cupjVar.a(this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cups(this.b, ffguVar);
    }
}
