package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spl extends ffhv implements ffjm {
    final /* synthetic */ dfjl a;
    final /* synthetic */ spw b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spl(ffgu ffguVar, dfjl dfjlVar, spw spwVar) {
        super(2, ffguVar);
        this.a = dfjlVar;
        this.b = spwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((spl) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        dfjl dfjlVar = this.a;
        dfjlVar.copyOnWrite();
        dfjm dfjmVar = (dfjm) dfjlVar.instance;
        dfjm dfjmVar2 = dfjm.a;
        dfjmVar.b |= 1;
        dfjmVar.c = Long.MAX_VALUE;
        return dfjlVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        spl splVar = new spl(ffguVar, this.a, this.b);
        splVar.c = obj;
        return splVar;
    }
}
