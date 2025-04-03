package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azlm extends ffhv implements ffjm {
    int a;
    final /* synthetic */ azlv b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azlm(azlv azlvVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = azlvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azlm) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return null;
        }
        azlv azlvVar = this.b;
        this.a = 1;
        if (azlvVar.h(this) == ffhhVar) {
            return ffhhVar;
        }
        return null;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new azlm(this.b, ffguVar);
    }
}
