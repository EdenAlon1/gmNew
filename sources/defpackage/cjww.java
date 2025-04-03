package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjww extends ffhv implements ffjm {
    private /* synthetic */ Object a;

    public cjww(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjww) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bsob e = bsom.e();
        e.z("getTopTenMostRecentPersonalConversations");
        bsol bsolVar = new bsol();
        bsolVar.A();
        int intValue = bsom.g().intValue();
        if (intValue < 10018) {
            dtub.w("IS_ENTERPRISE", intValue);
        }
        bsolVar.aq(new dtwe("conversations.IS_ENTERPRISE", 1, 0));
        bsolVar.p();
        bsolVar.c(byyt.UNARCHIVED);
        e.h(bsolVar);
        e.e(new bsny(bsom.c.r, false));
        e.x(10);
        return ((bskr) e.b().o()).cW();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjww cjwwVar = new cjww(ffguVar);
        cjwwVar.a = obj;
        return cjwwVar;
    }
}
