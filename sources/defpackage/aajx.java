package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aajx implements aaju {
    public final ffbr a;
    public final aspz b;
    private final ffbr c;
    private final asoe d;
    private final ffsk e;
    private final cwrk f;

    public aajx(ffbr ffbrVar, asoe asoeVar, ffbr ffbrVar2, ffsk ffskVar, cwrk cwrkVar, aspz aspzVar) {
        ffbrVar.getClass();
        ffskVar.getClass();
        cwrkVar.getClass();
        this.c = ffbrVar;
        this.d = asoeVar;
        this.a = ffbrVar2;
        this.e = ffskVar;
        this.f = cwrkVar;
        this.b = aspzVar;
    }

    @Override // defpackage.aaju
    public final axrc a(alxr alxrVar) {
        fgdj axqfVar;
        alxrVar.getClass();
        if (this.d.a()) {
            apyd i = alxrVar.i();
            apyv a = i != null ? i.a() : null;
            apxx apxxVar = a instanceof apxx ? (apxx) a : null;
            if (apxxVar != null) {
                fgdj fgdjVar = (fgdj) ((Map) this.c.b()).get(apxxVar.a);
                if (fgdjVar == null) {
                    axqfVar = null;
                } else {
                    cwrk cwrkVar = this.f;
                    ffsk ffskVar = this.e;
                    int i2 = fgcz.a;
                    fgcz fgczVar = fgcy.b;
                    ffjm ffjmVar = new ffjm() { // from class: aajv
                        @Override // defpackage.ffjm
                        public final Object a(Object obj, Object obj2) {
                            eykv eykvVar = (eykv) obj;
                            if (((Boolean) obj2).booleanValue()) {
                                return eykvVar;
                            }
                            return null;
                        }
                    };
                    fgdj[] fgdjVarArr = {fgdjVar, cwrkVar.a};
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 2) {
                            axqfVar = new axqf(new axte(fgdjVarArr, ffjmVar));
                            break;
                        }
                        fgdj fgdjVar2 = fgdjVarArr[i3];
                        if (fgdjVar2 == null || (fgdjVar2 instanceof axqf)) {
                            i3++;
                        } else {
                            fgdj[] fgdjVarArr2 = (fgdj[]) ffdo.J(fgdjVarArr).toArray(new fgdj[0]);
                            axth axthVar = new axth((ffxx[]) Arrays.copyOf(fgdjVarArr2, fgdjVarArr2.length), fgdjVarArr, ffjmVar);
                            ArrayList arrayList = new ArrayList(2);
                            for (int i4 = 0; i4 < 2; i4++) {
                                fgdj fgdjVar3 = fgdjVarArr[i4];
                                arrayList.add(fgdjVar3 != null ? fgdjVar3.c() : null);
                            }
                            Object[] array = arrayList.toArray(new Object[0]);
                            axqfVar = fgbn.b(axthVar, ffskVar, fgczVar, ffjmVar.a(array[0], array[1]));
                        }
                    }
                }
                if (axqfVar != null) {
                    return axrg.a(axqfVar);
                }
            }
        }
        return null;
    }

    @Override // defpackage.aaju
    public final void b(alxr alxrVar) {
        alxrVar.getClass();
        axol.k(this.e, null, new aajw(this, alxrVar, null), 3);
    }
}
