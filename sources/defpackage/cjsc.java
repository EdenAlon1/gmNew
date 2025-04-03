package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjsc extends ffhv implements ffjm {
    final /* synthetic */ cjsn a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjsc(ffgu ffguVar, cjsn cjsnVar) {
        super(2, ffguVar);
        this.a = cjsnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjsc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object b = this.a.c.b();
        b.getClass();
        return fflm.b((Optional) b);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjsc cjscVar = new cjsc(ffguVar, this.a);
        cjscVar.b = obj;
        return cjscVar;
    }
}
