package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssw extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ssx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssw(ffgu ffguVar, ssx ssxVar) {
        super(3, ffguVar);
        this.c = ssxVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ssw sswVar = new ssw((ffgu) obj3, this.c);
        sswVar.d = (ffxy) obj;
        sswVar.b = obj2;
        return sswVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r6 = this.d;
            boolean booleanValue = ((Boolean) this.b).booleanValue();
            ssx ssxVar = this.c;
            if (ssxVar.b) {
                ssxVar.b = false;
            } else if (booleanValue) {
                ssxVar.a.f(false);
            }
            ssx ssxVar2 = this.c;
            this.a = 1;
            if (ffyk.c(r6, ssxVar2.a, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
