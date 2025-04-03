package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class chvy extends ffhv implements ffjm {
    public chvy(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return new chvy((ffgu) obj2).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        eslm eslmVar = (eslm) esln.a.createBuilder();
        eslmVar.getClass();
        eslo.b(eslmVar);
        return eslo.a(eslmVar).toByteString();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new chvy(ffguVar);
    }
}
