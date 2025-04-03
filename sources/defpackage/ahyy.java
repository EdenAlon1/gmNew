package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahyy extends ffhv implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ ahzb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahyy(String str, ahzb ahzbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = str;
        this.b = ahzbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahyy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        final String str = this.a;
        if (str.length() == 0) {
            str = null;
        }
        this.b.c.c(new ffji() { // from class: ahyx
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                return xhu.c((xhu) obj2, str, null, null, false, null, null, false, 1, 766);
            }
        });
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ahyy(this.a, this.b, ffguVar);
    }
}
