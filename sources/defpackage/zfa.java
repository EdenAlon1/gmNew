package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zfa extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ abcd c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfa(ffgu ffguVar, abcd abcdVar) {
        super(3, ffguVar);
        this.c = abcdVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        zfa zfaVar = new zfa((ffgu) obj3, this.c);
        zfaVar.d = (ffxy) obj;
        zfaVar.b = obj2;
        return zfaVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffxx b;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r7 = this.d;
            alxr alxrVar = (alxr) this.b;
            if (alxrVar == null) {
                b = new ffyg(null);
            } else {
                abcd abcdVar = this.c;
                ffxx a = abcdVar.d.b.a(alxrVar, cmsk.a());
                abcc abccVar = new abcc(abcdVar, alxrVar, null);
                b = fgck.b(abcdVar.a, a, abcdVar.c.h, abcdVar.b, abccVar);
            }
            this.a = 1;
            if (ffyk.c(r7, b, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
