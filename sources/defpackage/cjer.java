package defpackage;

import j$.util.DesugarCollections;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjer extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjfw b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjer(ffgu ffguVar, cjfw cjfwVar) {
        super(2, ffguVar);
        this.b = cjfwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjer) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
        cjen cjenVar = (cjen) obj;
        if ((cjenVar.b & 1) == 0) {
            return null;
        }
        int i = cjenVar.d;
        Boolean bool = (Boolean) DesugarCollections.unmodifiableMap(cjenVar.c).get(new Integer(i));
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return new Integer(i);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjer cjerVar = new cjer(ffguVar, this.b);
        cjerVar.c = obj;
        return cjerVar;
    }
}
