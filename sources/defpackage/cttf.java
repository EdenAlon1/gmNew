package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cttf extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cttm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cttf(cttm cttmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cttmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cttf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cttm cttmVar = this.b;
        this.a = 1;
        Object c = cttmVar.b.c(this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cttf(this.b, ffguVar);
    }
}
