package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sqb extends ffhv implements ffjm {
    final /* synthetic */ sqf a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sqb(ffgu ffguVar, sqf sqfVar) {
        super(2, ffguVar);
        this.a = sqfVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sqb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.c.c();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        sqb sqbVar = new sqb(ffguVar, this.a);
        sqbVar.b = obj;
        return sqbVar;
    }
}
