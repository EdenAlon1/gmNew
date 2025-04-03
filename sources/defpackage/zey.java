package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zey extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ zfi c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zey(ffgu ffguVar, zfi zfiVar) {
        super(3, ffguVar);
        this.c = zfiVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        zey zeyVar = new zey((ffgu) obj3, this.c);
        zeyVar.d = (ffxy) obj;
        zeyVar.b = obj2;
        return zeyVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        dmcg dmcgVar;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r7 = this.d;
            alxr alxrVar = (alxr) this.b;
            if (alxrVar != null) {
                zfi zfiVar = this.c;
                dmcgVar = zfiVar.c.a(alxrVar, new dmci(2, 2), new Float(1.0f));
            } else {
                dmcgVar = null;
            }
            ffyg ffygVar = new ffyg(dmcgVar);
            this.a = 1;
            if (ffyk.c(r7, ffygVar, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
