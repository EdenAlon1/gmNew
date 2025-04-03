package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctrb extends ffhv implements ffjm {
    final /* synthetic */ ctrc a;
    final /* synthetic */ engw b;
    final /* synthetic */ fbrd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctrb(ctrc ctrcVar, engw engwVar, fbrd fbrdVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = ctrcVar;
        this.b = engwVar;
        this.c = fbrdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctrb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        engw engwVar = this.b;
        engwVar.getClass();
        this.a.s(engwVar, this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ctrb(this.a, this.b, this.c, ffguVar);
    }
}
