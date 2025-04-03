package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eame extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eamf b;
    final /* synthetic */ exyd c;
    final /* synthetic */ eagp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eame(eamf eamfVar, exyd exydVar, eagp eagpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eamfVar;
        this.c = exydVar;
        this.d = eagpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eame) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        eamf eamfVar = this.b;
        exyd exydVar = this.c;
        eagp eagpVar = this.d;
        this.a = 1;
        Object b = eamfVar.a.b(exydVar, eagpVar, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eame(this.b, this.c, this.d, ffguVar);
    }
}
