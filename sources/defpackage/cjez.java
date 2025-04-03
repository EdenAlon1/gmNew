package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjez extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjfw b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjez(ffgu ffguVar, cjfw cjfwVar) {
        super(2, ffguVar);
        this.b = cjfwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjez) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ffxx b = this.b.d.b();
            this.a = 1;
            obj = fgbj.a(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        return Boolean.valueOf(((cjen) obj).e);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjez cjezVar = new cjez(ffguVar, this.b);
        cjezVar.c = obj;
        return cjezVar;
    }
}
