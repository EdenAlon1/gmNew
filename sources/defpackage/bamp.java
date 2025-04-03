package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bamp extends ffhv implements ffjm {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ bamw c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bamp(ffgu ffguVar, boolean z, boolean z2, bamw bamwVar) {
        super(2, ffguVar);
        this.a = z;
        this.b = z2;
        this.c = bamwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bamp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cskc cskcVar = bamw.a;
        bajq.d(balw.a(this.a, this.b), this.c.B);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bamp bampVar = new bamp(ffguVar, this.a, this.b, this.c);
        bampVar.d = obj;
        return bampVar;
    }
}
