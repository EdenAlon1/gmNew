package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajst extends ffhv implements ffjm {
    final /* synthetic */ ajtb a;
    final /* synthetic */ ajqt b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajst(ffgu ffguVar, ajtb ajtbVar, ajqt ajqtVar) {
        super(2, ffguVar);
        this.a = ajtbVar;
        this.b = ajqtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajst) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ajsr.a(this.a.d(this.b));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajst ajstVar = new ajst(ffguVar, this.a, this.b);
        ajstVar.c = obj;
        return ajstVar;
    }
}
