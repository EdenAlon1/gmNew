package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yap extends ffhv implements ffjm {
    int a;
    final /* synthetic */ yar b;
    final /* synthetic */ xhm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yap(ffgu ffguVar, yar yarVar, xhm xhmVar) {
        super(2, ffguVar);
        this.b = yarVar;
        this.c = xhmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((yap) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        yar yarVar = this.b;
        xhl xhlVar = (xhl) this.c;
        this.a = 1;
        yak yakVar = yarVar.c;
        Object a = ffra.a(ekxi.a(yakVar.b), new yai(null, xhlVar, yakVar), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        yap yapVar = new yap(ffguVar, this.b, this.c);
        yapVar.d = obj;
        return yapVar;
    }
}
