package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjp extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public zjp(ffgu ffguVar) {
        super(3, ffguVar);
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        zjp zjpVar = new zjp((ffgu) obj3);
        zjpVar.c = (ffxy) obj;
        zjpVar.b = (Object[]) obj2;
        return zjpVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r4 = this.c;
            engw a = engq.a(ffdo.J((zhr[]) this.b));
            this.a = 1;
            if (r4.fQ(a, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
