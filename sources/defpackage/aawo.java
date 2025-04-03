package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aawo extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aawq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aawo(aawq aawqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aawqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aawo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aawq aawqVar = this.b;
            this.a = 1;
            if (aawqVar.b(0, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aawo(this.b, ffguVar);
    }
}
