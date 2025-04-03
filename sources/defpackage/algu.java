package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class algu extends ffhv implements ffjm {
    int a;
    final /* synthetic */ algw b;
    final /* synthetic */ fjay c;
    final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public algu(algw algwVar, fjay fjayVar, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = algwVar;
        this.c = fjayVar;
        this.d = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((algu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            algw algwVar = this.b;
            fjay fjayVar = this.c;
            int i2 = this.d;
            alxo alxoVar = alxo.SENT;
            this.a = 1;
            if (algwVar.c(fjayVar, i2, alxoVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new algu(this.b, this.c, this.d, ffguVar);
    }
}
