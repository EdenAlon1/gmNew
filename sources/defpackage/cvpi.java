package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvpi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvpl b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvpi(ffgu ffguVar, cvpl cvplVar, String str) {
        super(2, ffguVar);
        this.b = cvplVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvpi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cvpl cvplVar = this.b;
        String str = this.c;
        this.a = 1;
        Object b = cvplVar.b(str, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cvpi cvpiVar = new cvpi(ffguVar, this.b, this.c);
        cvpiVar.d = obj;
        return cvpiVar;
    }
}
