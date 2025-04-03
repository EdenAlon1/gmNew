package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wpa extends ffhv implements ffjm {
    int a;
    final /* synthetic */ wpe b;
    final /* synthetic */ fbup c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpa(ffgu ffguVar, wpe wpeVar, fbup fbupVar) {
        super(2, ffguVar);
        this.b = wpeVar;
        this.c = fbupVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wpa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            wpe wpeVar = this.b;
            fbup fbupVar = this.c;
            this.a = 1;
            obj = wpeVar.c(fbupVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        Integer num = (Integer) obj;
        if (num == null) {
            return null;
        }
        ((wmf) ((Optional) this.b.c.b()).get()).a(num.intValue() + ((int) ((Number) this.b.k.b()).longValue()));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        wpa wpaVar = new wpa(ffguVar, this.b, this.c);
        wpaVar.d = obj;
        return wpaVar;
    }
}
