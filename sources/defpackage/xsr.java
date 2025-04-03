package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xsr implements xsc {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/DraftUiAdapterImpl");
    public xsq b;
    private final fgdj c;
    private final fgdj d;

    public xsr(ffsk ffskVar, ycn ycnVar, yna ynaVar, xux xuxVar, ymb ymbVar, Optional optional, Optional optional2, yju yjuVar, ygj ygjVar, Optional optional3, final avag avagVar, final xez xezVar) {
        fgdj axqfVar;
        fgdj axqfVar2;
        ffskVar.getClass();
        ycnVar.getClass();
        ynaVar.getClass();
        xuxVar.getClass();
        ymbVar.getClass();
        yjuVar.getClass();
        ygjVar.getClass();
        axol.k(ycnVar.c, ycnVar.b, new ycj(ycnVar, null), 2);
        int i = fgcz.a;
        fgcz fgczVar = fgcy.b;
        fgdj b = ymbVar.b();
        final ffji ffjiVar = new ffji() { // from class: xsd
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return ((ygz) obj).b();
            }
        };
        Object orElse = optional.map(new Function() { // from class: xsg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(new axqf(new ffix() { // from class: xsh
            @Override // defpackage.ffix
            public final Object invoke() {
                return null;
            }
        }));
        orElse.getClass();
        final ffji ffjiVar2 = new ffji() { // from class: xsi
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return ((yig) obj).b();
            }
        };
        Object orElse2 = optional3.map(new Function() { // from class: xsj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(new axqf(new ffix() { // from class: xsk
            @Override // defpackage.ffix
            public final Object invoke() {
                return null;
            }
        }));
        orElse2.getClass();
        final ffji ffjiVar3 = new ffji() { // from class: xsl
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return ((yfj) obj).a();
            }
        };
        Object orElse3 = optional2.map(new Function() { // from class: xsm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(new axqf(new ffix() { // from class: xsn
            @Override // defpackage.ffix
            public final Object invoke() {
                return null;
            }
        }));
        orElse3.getClass();
        ffjo ffjoVar = new ffjo() { // from class: xse
            @Override // defpackage.ffjo
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                dmpf dmpfVar = (dmpf) obj;
                dmmm dmmmVar = (dmmm) obj2;
                dmnb dmnbVar = (dmnb) obj3;
                dmnb dmnbVar2 = (dmnb) obj4;
                ffcf ffcfVar = dmnbVar != null ? new ffcf(dmnbVar, xsp.d) : dmpfVar != null ? new ffcf(dmpfVar, xsp.b) : dmmmVar != null ? new ffcf(dmmmVar, xsp.c) : dmnbVar2 != null ? new ffcf(dmnbVar2, xsp.e) : new ffcf(null, xsp.a);
                xsr xsrVar = xsr.this;
                boolean z = dmpfVar != null;
                boolean z2 = dmmmVar != null;
                boolean z3 = dmnbVar != null;
                boolean z4 = dmnbVar2 != null;
                dmmq dmmqVar = (dmmq) ffcfVar.a;
                xsq xsqVar = new xsq((xsp) ffcfVar.b, z, z2, z3, z4);
                if (!ffkj.e(xsqVar, xsrVar.b)) {
                    ensk f = xsr.a.f();
                    f.Y(ente.a, "BugleComposeRow2");
                    ((enrr) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/DraftUiAdapterImpl", "topUiData$lambda$9", 95, "DraftUiAdapterImpl.kt")).D("Compose row top UI data upstream changed to %s from %s", xsqVar, xsrVar.b);
                }
                xsrVar.b = xsqVar;
                return dmmqVar;
            }
        };
        b.getClass();
        fgdj[] fgdjVarArr = {b, (fgdj) orElse, (fgdj) orElse2, (fgdj) orElse3};
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                axqfVar = new axqf(new axtm(fgdjVarArr, ffjoVar));
                break;
            }
            fgdj fgdjVar = fgdjVarArr[i2];
            if (fgdjVar == null || (fgdjVar instanceof axqf)) {
                i2++;
            } else {
                fgdj[] fgdjVarArr2 = (fgdj[]) ffdo.J(fgdjVarArr).toArray(new fgdj[0]);
                axtp axtpVar = new axtp((ffxx[]) Arrays.copyOf(fgdjVarArr2, fgdjVarArr2.length), fgdjVarArr, ffjoVar);
                ArrayList arrayList = new ArrayList(4);
                for (int i3 = 0; i3 < 4; i3++) {
                    fgdj fgdjVar2 = fgdjVarArr[i3];
                    arrayList.add(fgdjVar2 != null ? fgdjVar2.c() : null);
                }
                Object[] array = arrayList.toArray(new Object[0]);
                axqfVar = fgbn.b(axtpVar, ffskVar, fgczVar, ffjoVar.a(array[0], array[1], array[2], array[3]));
            }
        }
        this.c = axqfVar;
        fgcz fgczVar2 = fgcy.b;
        fgdj b2 = ynaVar.b();
        fgdj a2 = xuxVar.a();
        fgdj a3 = yjuVar.a();
        fgdj a4 = ygjVar.a();
        ffjp ffjpVar = new ffjp() { // from class: xsf
            @Override // defpackage.ffjp
            public final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                dmmp dmmpVar = (dmmp) obj;
                dmmk dmmkVar = (dmmk) obj2;
                dmof dmofVar = (dmof) obj3;
                dmmq dmmqVar = (dmmq) obj4;
                dmml dmmlVar = (dmml) obj5;
                dmmpVar.getClass();
                dmmkVar.getClass();
                dmofVar.getClass();
                boolean z = false;
                if (avag.this.a() && xezVar.a()) {
                    z = true;
                }
                return new dmms(dmmpVar, dmmkVar, dmmqVar, dmofVar, dmmlVar, new dmmr(z));
            }
        };
        b2.getClass();
        a2.getClass();
        a3.getClass();
        axqfVar.getClass();
        a4.getClass();
        fgdj[] fgdjVarArr3 = {b2, a2, a3, axqfVar, a4};
        int i4 = 0;
        while (true) {
            if (i4 >= 5) {
                axqfVar2 = new axqf(new axtq(fgdjVarArr3, ffjpVar));
                break;
            }
            fgdj fgdjVar3 = fgdjVarArr3[i4];
            if (fgdjVar3 == null || (fgdjVar3 instanceof axqf)) {
                i4++;
                ffjpVar = ffjpVar;
            } else {
                fgdj[] fgdjVarArr4 = (fgdj[]) ffdo.J(fgdjVarArr3).toArray(new fgdj[0]);
                axtt axttVar = new axtt((ffxx[]) Arrays.copyOf(fgdjVarArr4, fgdjVarArr4.length), fgdjVarArr3, ffjpVar);
                ArrayList arrayList2 = new ArrayList(5);
                for (int i5 = 0; i5 < 5; i5++) {
                    fgdj fgdjVar4 = fgdjVarArr3[i5];
                    arrayList2.add(fgdjVar4 != null ? fgdjVar4.c() : null);
                }
                Object[] array2 = arrayList2.toArray(new Object[0]);
                axqfVar2 = fgbn.b(axttVar, ffskVar, fgczVar2, ffjpVar.f(array2[0], array2[1], array2[2], array2[3], array2[4]));
            }
        }
        this.d = axqfVar2;
    }

    @Override // defpackage.xsc
    public final fgdj a() {
        return this.d;
    }
}
