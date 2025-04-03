package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cejw extends ffhv implements ffjm {
    final /* synthetic */ cejy a;
    final /* synthetic */ cefr b;
    final /* synthetic */ Exception c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cejw(ffgu ffguVar, cejy cejyVar, cefr cefrVar, Exception exc) {
        super(2, ffguVar);
        this.a = cejyVar;
        this.b = cefrVar;
        this.c = exc;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cejw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.a.n(epfx.RESTORE_BACKUP_KEY, this.b.b, this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cejw cejwVar = new cejw(ffguVar, this.a, this.b, this.c);
        cejwVar.d = obj;
        return cejwVar;
    }
}
