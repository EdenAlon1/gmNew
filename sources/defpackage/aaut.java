package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aaut extends ffhv implements ffjm {
    /* synthetic */ boolean a;
    final /* synthetic */ aauv b;
    final /* synthetic */ ffsk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aaut(aauv aauvVar, ffsk ffskVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aauvVar;
        this.c = ffskVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((aaut) c(bool, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        if (this.a) {
            ((ajge) this.b.b.b()).c();
        }
        ffsl.e(this.c, null);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aaut aautVar = new aaut(this.b, this.c, ffguVar);
        aautVar.a = ((Boolean) obj).booleanValue();
        return aautVar;
    }
}
