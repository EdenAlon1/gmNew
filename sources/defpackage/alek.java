package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alek extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aleo b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alek(aleo aleoVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aleoVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alek) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            aleo aleoVar = this.b;
            String str = this.c;
            this.a = 1;
            if (str.length() <= 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            cfva cfvaVar = alei.a;
            obj = (!ffel.a.contains(str) || ((ezgw) alei.d.e()).b.contains(str)) ? aleoVar.b(this) : true;
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return Boolean.valueOf(!((Boolean) obj).booleanValue());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new alek(this.b, this.c, ffguVar);
    }
}
