package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class apuw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ apva b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public apuw(apva apvaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = apvaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((apuw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            apsv b = this.b.e.b();
            int a = b != null ? b.a : this.b.i.a() + 4;
            apva apvaVar = this.b;
            apuv apuvVar = new apuv(apvaVar.g, apvaVar, a);
            this.a = 1;
            if (apvaVar.f.c.a(apuvVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        throw new ffbx();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new apuw(this.b, ffguVar);
    }
}
