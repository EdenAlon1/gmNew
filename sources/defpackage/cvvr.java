package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvvr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cvvs b;
    boolean c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvvr(ffgu ffguVar, cvvs cvvsVar) {
        super(2, ffguVar);
        this.b = cvvsVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvvr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        elfl elflVar;
        boolean z;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        if (i == 0) {
            ffci.b(obj);
            cvvs cvvsVar = this.b;
            elfl a = cvvsVar.b.a();
            elfl a2 = cvvsVar.c.a();
            a.getClass();
            this.d = a2;
            this.a = 1;
            Object c = fgfz.c(a, this);
            if (c != ffhhVar) {
                elflVar = a2;
                obj = c;
            }
            return ffhhVar;
        }
        if (i != 1) {
            z = this.c;
            ffci.b(obj);
            Object orElse = ((Optional) obj).orElse("");
            orElse.getClass();
            return new cvvq(z, (String) orElse);
        }
        elflVar = (elfl) this.d;
        ffci.b(obj);
        obj.getClass();
        boolean booleanValue = ((Boolean) obj).booleanValue();
        elflVar.getClass();
        this.d = null;
        this.c = booleanValue;
        this.a = 2;
        Object c2 = fgfz.c(elflVar, this);
        if (c2 != ffhhVar) {
            z = booleanValue;
            obj = c2;
            Object orElse2 = ((Optional) obj).orElse("");
            orElse2.getClass();
            return new cvvq(z, (String) orElse2);
        }
        return ffhhVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cvvr cvvrVar = new cvvr(ffguVar, this.b);
        cvvrVar.d = obj;
        return cvvrVar;
    }
}
