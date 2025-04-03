package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ydo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ydq b;
    final /* synthetic */ String c = "ConversationDraftPersistence.saveDiff";
    final /* synthetic */ ffji d;
    final /* synthetic */ ffji e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ydo(ffgu ffguVar, ydq ydqVar, ffji ffjiVar, ffji ffjiVar2) {
        super(2, ffguVar);
        this.b = ydqVar;
        this.d = ffjiVar;
        this.e = ffjiVar2;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ydo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ydq ydqVar = this.b;
        elfl b = ydqVar.f.b(this.c, new ydp(ydqVar, this.d, this.e));
        b.getClass();
        this.a = 1;
        Object c = fgfz.c(b, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ydo ydoVar = new ydo(ffguVar, this.b, this.d, this.e);
        ydoVar.f = obj;
        return ydoVar;
    }
}
