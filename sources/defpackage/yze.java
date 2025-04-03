package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yze extends ffhv implements ffjm {
    final /* synthetic */ yzm a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yze(yzm yzmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = yzmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((yze) c(bool, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        yzm yzmVar = this.a;
        axol.k(yzmVar.e, null, new yzd(yzmVar, null), 3);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new yze(this.a, ffguVar);
    }
}
