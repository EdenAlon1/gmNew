package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ohw extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ oia b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohw(oia oiaVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = oiaVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ohw) c((olp) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        olp olpVar = (olp) this.a;
        int i = -olpVar.c;
        int i2 = this.b.b.f;
        boolean z = true;
        if (i <= i2 && (-olpVar.d) <= i2) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ohw ohwVar = new ohw(this.b, ffguVar);
        ohwVar.a = obj;
        return ohwVar;
    }
}
