package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabt {
    public final cstx a;
    public final czmd b;
    public final askd c;
    public final atho d;
    public final asqn e;
    private final cwrk f;

    public aabt(cstx cstxVar, czmd czmdVar, cwrk cwrkVar, askd askdVar, atho athoVar, asqn asqnVar) {
        cstxVar.getClass();
        czmdVar.getClass();
        cwrkVar.getClass();
        askdVar.getClass();
        this.a = cstxVar;
        this.b = czmdVar;
        this.f = cwrkVar;
        this.c = askdVar;
        this.d = athoVar;
        this.e = asqnVar;
    }

    public final axrc a(final aabn aabnVar) {
        axrc[] axrcVarArr = {new axqd(new ffix() { // from class: aabo
            @Override // defpackage.ffix
            public final Object invoke() {
                aabn aabnVar2 = aabnVar;
                String c = aabnVar2.a.c();
                c.getClass();
                aabt aabtVar = aabt.this;
                List<String> c2 = aabtVar.a.c(c);
                c2.getClass();
                List list = null;
                if (!c2.isEmpty() && c2.size() <= ((Number) czhm.f.e()).intValue()) {
                    fffs fffsVar = new fffs((byte[]) null);
                    for (String str : c2) {
                        fffsVar.add(new dmxf(str, aabtVar.b.b(str)));
                    }
                    list = ffdx.a(fffsVar);
                }
                ffix ffixVar = aabnVar2.d;
                String c3 = aabnVar2.a.c();
                c3.getClass();
                boolean z = aabnVar2.e;
                boolean z2 = aabnVar2.b;
                String str2 = aabnVar2.c;
                boolean z3 = aabnVar2.f;
                boolean z4 = aabnVar2.g;
                dofn dofnVar = aabnVar2.h;
                dnwi dnwiVar = aabnVar2.i;
                askd askdVar = aabtVar.c;
                atho athoVar = aabtVar.d;
                boolean a = askdVar.a();
                boolean z5 = false;
                if (athoVar.a() && aabtVar.c.a()) {
                    z5 = true;
                }
                domv domvVar = new domv(a, z5, aabtVar.e.a(), 46);
                return new dmxv(list, ffixVar, null, c3, z, z2, new ffix() { // from class: dmxt
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return false;
                    }
                }, new ffix() { // from class: dmxu
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        return ffcu.a;
                    }
                }, str2, true, z3, true, z4, false, dofnVar, dnwiVar, z4, domvVar);
            }
        }), axrg.a(this.f.a)};
        for (int i = 0; i < 2; i++) {
            axrc axrcVar = axrcVarArr[i];
            if (axrcVar != null && !(axrcVar instanceof axqd)) {
                axrc[] axrcVarArr2 = (axrc[]) ffdo.J(axrcVarArr).toArray(new axrc[0]);
                aabs aabsVar = new aabs((ffxx[]) Arrays.copyOf(axrcVarArr2, axrcVarArr2.length), axrcVarArr);
                ArrayList arrayList = new ArrayList(2);
                int i2 = 0;
                while (true) {
                    Object obj = null;
                    if (i2 >= 2) {
                        break;
                    }
                    axrc axrcVar2 = axrcVarArr[i2];
                    if (axrcVar2 != null) {
                        obj = axrcVar2.b();
                    }
                    arrayList.add(obj);
                    i2++;
                }
                Object[] array = arrayList.toArray(new Object[0]);
                dmxv dmxvVar = (dmxv) array[0];
                if (!((Boolean) array[1]).booleanValue()) {
                    dmxvVar = dmxv.l(dmxvVar, null, false, false, 524286);
                }
                return axrg.b(aabsVar, dmxvVar);
            }
        }
        return new axqd(new aabp(axrcVarArr));
    }
}
