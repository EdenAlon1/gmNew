package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjfk extends ffhv implements ffjm {
    /* synthetic */ Object a;
    final /* synthetic */ eisx b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjfk(eisx eisxVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjfk) c((cjen) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cjek cjekVar = (cjek) ((cjen) this.a).toBuilder();
        cjekVar.getClass();
        int i = ((cjen) cjekVar.instance).d;
        eisz eiszVar = (eisz) this.b;
        if (eiszVar.a != i) {
            cjfx.c(cjekVar);
        }
        int i2 = eiszVar.a;
        cjekVar.copyOnWrite();
        cjen cjenVar = (cjen) cjekVar.instance;
        cjenVar.b |= 1;
        cjenVar.d = i2;
        return cjfx.a(cjekVar);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjfk cjfkVar = new cjfk(this.b, ffguVar);
        cjfkVar.a = obj;
        return cjfkVar;
    }
}
