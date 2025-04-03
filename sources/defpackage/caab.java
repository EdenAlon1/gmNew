package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caab extends ffhv implements ffjm {
    int a;
    final /* synthetic */ caag b;
    final /* synthetic */ enip c;
    final /* synthetic */ eozn d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public caab(ffgu ffguVar, caag caagVar, enip enipVar, eozn eoznVar) {
        super(2, ffguVar);
        this.b = caagVar;
        this.c = enipVar;
        this.d = eoznVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((caab) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        elfl a = ((caen) this.b.d.b()).a(this.b.l, this.c, this.d);
        this.a = 1;
        Object c = fgfz.c(a, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        caab caabVar = new caab(ffguVar, this.b, this.c, this.d);
        caabVar.e = obj;
        return caabVar;
    }
}
