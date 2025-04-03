package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjfa extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjfw b;
    final /* synthetic */ eisx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjfa(ffgu ffguVar, cjfw cjfwVar, eisx eisxVar) {
        super(2, ffguVar);
        this.b = cjfwVar;
        this.c = eisxVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjfa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        return Boolean.valueOf(ffkj.e(DesugarCollections.unmodifiableMap(((cjen) obj).c).get(new Integer(this.c.a())), true));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjfa cjfaVar = new cjfa(ffguVar, this.b, this.c);
        cjfaVar.d = obj;
        return cjfaVar;
    }
}
