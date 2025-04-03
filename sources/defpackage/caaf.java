package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caaf extends ffhv implements ffjm {
    final /* synthetic */ caag a;
    final /* synthetic */ int b;
    final /* synthetic */ caqc c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caaf(ffgu ffguVar, caag caagVar, int i, caqc caqcVar) {
        super(2, ffguVar);
        this.a = caagVar;
        this.b = i;
        this.c = caqcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((caaf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.e(this.b, this.c);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        caaf caafVar = new caaf(ffguVar, this.a, this.b, this.c);
        caafVar.d = obj;
        return caafVar;
    }
}
