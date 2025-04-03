package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyoy extends ffhv implements ffjr {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    /* synthetic */ Object f;

    public cyoy(ffgu ffguVar) {
        super(7, ffguVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [alxg, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r1 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.e;
        Object obj6 = this.f;
        obj2.getClass();
        amfx amfxVar = (amfx) obj2;
        eoxn E = amfxVar.E();
        eoxn eoxnVar = eoxn.SEND_MODE_XMS;
        boolean z = r1.e().h || amfxVar.t();
        fffs fffsVar = new fffs((byte[]) null);
        if (obj6 != null) {
            dlsr dlsrVar = (dlsr) obj6;
            dmzz dmzzVar = dlsrVar.b;
            dmzzVar.getClass();
            fffsVar.add(new cypu(new dnlz(dlsrVar.a, null, null, null, null, new dnlf(dmzzVar), null, dlsrVar.k, 94)));
        }
        dlsr dlsrVar2 = (dlsr) obj3;
        String str = dlsrVar2.a;
        dmzz dmzzVar2 = dlsrVar2.b;
        dmzzVar2.getClass();
        fffsVar.add(new cypu(new dnlz(str, null, null, null, null, new dnlf(dmzzVar2), null, dlsrVar2.k, 94)));
        if (z && obj4 != null) {
            final dlsr dlsrVar3 = (dlsr) obj4;
            fffsVar.add(new cypu(new dnlc(dlsrVar3.a, dlsrVar3.b, E == eoxnVar, new ffix() { // from class: cyox
                @Override // defpackage.ffix
                public final Object invoke() {
                    dlsr.this.k.invoke();
                    return ffcu.a;
                }
            })));
        }
        if (obj5 != null) {
            dlsr dlsrVar4 = (dlsr) obj5;
            dmzz dmzzVar3 = dlsrVar4.b;
            dmzzVar3.getClass();
            fffsVar.add(new cypu(new dnlz(dlsrVar4.a, null, null, null, null, new dnlf(dmzzVar3), null, dlsrVar4.k, 94), 2));
        }
        return new cyor(engq.a(ffdx.a(fffsVar)));
    }

    @Override // defpackage.ffjr
    public final /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        cyoy cyoyVar = new cyoy((ffgu) obj7);
        cyoyVar.a = (alxg) obj;
        cyoyVar.b = (alxj) obj2;
        cyoyVar.c = (dlsr) obj3;
        cyoyVar.d = (dlsr) obj4;
        cyoyVar.e = (dlsr) obj5;
        cyoyVar.f = (dlsr) obj6;
        return cyoyVar.b(ffcu.a);
    }
}
