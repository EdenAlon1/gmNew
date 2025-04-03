package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xfw extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ xhp c;
    final /* synthetic */ xgb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xfw(xhp xhpVar, xgb xgbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = xhpVar;
        this.d = xgbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xfw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [doxs] */
    /* JADX WARN: Type inference failed for: r0v15, types: [doxs] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        xgv xgvVar;
        doxs doxsVar;
        doxs doxsVar2;
        xhl xhlVar;
        dren drenVar;
        dren drenVar2;
        doyc doycVar;
        doyc doycVar2;
        ffhh ffhhVar = ffhh.a;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                ?? r0 = (doxs) this.a;
                ffci.b(obj);
                doycVar2 = r0;
                xgvVar = xgu.a((ctau) obj);
                doycVar = doycVar2;
                return new xfq(doycVar, xgvVar);
            }
            if (i == 2) {
                ?? r02 = (doxs) this.a;
                ffci.b(obj);
                drenVar2 = r02;
                xgvVar = xgu.a((ctau) obj);
                drenVar = drenVar2;
                return new xfq(drenVar, xgvVar);
            }
            if (i == 3) {
                xhlVar = (xhl) this.a;
                ffci.b(obj);
                return new xfr(xhlVar, xgu.a((ctau) obj));
            }
            doxsVar2 = (doxs) this.a;
            ffci.b(obj);
            xgvVar = xgu.a((ctau) obj);
            doxsVar = doxsVar2;
            return new xfq(doxsVar, xgvVar);
        }
        ffci.b(obj);
        xhp xhpVar = this.c;
        xgvVar = null;
        if (xhpVar instanceof xhk) {
            doycVar = ((xhk) xhpVar).b;
            if (this.d.d.a()) {
                comc comcVar = (comc) this.d.c.b();
                this.a = doycVar;
                this.b = 1;
                Object c = comcVar.c(this);
                if (c != ffhhVar) {
                    doycVar2 = doycVar;
                    obj = c;
                    xgvVar = xgu.a((ctau) obj);
                    doycVar = doycVar2;
                }
            }
            return new xfq(doycVar, xgvVar);
        }
        if (xhpVar instanceof xhj) {
            drenVar = ((xhj) xhpVar).b;
            if (this.d.d.a()) {
                comc comcVar2 = (comc) this.d.c.b();
                this.a = drenVar;
                this.b = 2;
                Object c2 = comcVar2.c(this);
                if (c2 != ffhhVar) {
                    drenVar2 = drenVar;
                    obj = c2;
                    xgvVar = xgu.a((ctau) obj);
                    drenVar = drenVar2;
                }
            }
            return new xfq(drenVar, xgvVar);
        }
        if (!(xhpVar instanceof xhl)) {
            if (!(xhpVar instanceof xho)) {
                throw new ffcd();
            }
            doxsVar = ((xho) xhpVar).a;
            if (this.d.d.a()) {
                comc comcVar3 = (comc) this.d.c.b();
                this.a = doxsVar;
                this.b = 4;
                Object c3 = comcVar3.c(this);
                if (c3 != ffhhVar) {
                    doxsVar2 = doxsVar;
                    obj = c3;
                    xgvVar = xgu.a((ctau) obj);
                    doxsVar = doxsVar2;
                }
            }
            return new xfq(doxsVar, xgvVar);
        }
        if (!this.d.d.a()) {
            return null;
        }
        xhl xhlVar2 = (xhl) this.c;
        comc comcVar4 = (comc) this.d.c.b();
        this.a = xhlVar2;
        this.b = 3;
        Object c4 = comcVar4.c(this);
        if (c4 != ffhhVar) {
            xhlVar = xhlVar2;
            obj = c4;
            return new xfr(xhlVar, xgu.a((ctau) obj));
        }
        return ffhhVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new xfw(this.c, this.d, ffguVar);
    }
}
