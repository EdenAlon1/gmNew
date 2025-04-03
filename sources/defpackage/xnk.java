package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xnk extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ xnq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnk(xnq xnqVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = xnqVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xnk xnkVar = new xnk(this.c, (ffgu) obj3);
        xnkVar.a = (String) obj;
        xnkVar.b = (Integer) obj2;
        return xnkVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r2 = this.a;
        Object obj2 = this.b;
        dmmp a = this.c.a();
        dsjn dsjnVar = a.a;
        String str = a.c;
        boolean z = a.e;
        dmqe dmqeVar = a.f;
        dmmo dmmoVar = a.g;
        r2.getClass();
        return new dmmp(dsjnVar, (CharSequence) r2, str, (Integer) obj2, z, dmqeVar, dmmoVar);
    }
}
