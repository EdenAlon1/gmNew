package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czlv extends ffhv implements ffjm {
    final /* synthetic */ czlw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czlv(czlw czlwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = czlwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((czlv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        czlw czlwVar = this.a;
        return czlwVar.a.c(czlwVar.c);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new czlv(this.a, ffguVar);
    }
}
