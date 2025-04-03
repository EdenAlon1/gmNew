package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctjp extends ffhv implements ffjm {
    final /* synthetic */ ctko a;
    final /* synthetic */ String b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctjp(ffgu ffguVar, ctko ctkoVar, String str) {
        super(2, ffguVar);
        this.a = ctkoVar;
        this.b = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctjp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ((ctqh) this.a.b.b()).f(this.b).orElse(null);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ctjp ctjpVar = new ctjp(ffguVar, this.a, this.b);
        ctjpVar.c = obj;
        return ctjpVar;
    }
}
