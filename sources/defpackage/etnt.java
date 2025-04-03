package defpackage;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etnt extends etoy {
    public static final Set a = (Set) etto.a(new ettn() { // from class: etnn
        @Override // defpackage.ettn
        public final Object a() {
            Set set = etnt.a;
            HashSet hashSet = new HashSet();
            ethu ethuVar = new ethu();
            ethuVar.b();
            ethuVar.c(16);
            ethuVar.d();
            ethuVar.a = ethv.c;
            hashSet.add(ethuVar.a());
            ethu ethuVar2 = new ethu();
            ethuVar2.b();
            ethuVar2.c(32);
            ethuVar2.d();
            ethuVar2.a = ethv.c;
            hashSet.add(ethuVar2.a());
            ethc ethcVar = new ethc();
            ethcVar.b(16);
            ethcVar.c(32);
            ethcVar.e(16);
            ethcVar.d(16);
            ethcVar.a = ethd.c;
            ethcVar.b = ethe.c;
            hashSet.add(ethcVar.a());
            ethc ethcVar2 = new ethc();
            ethcVar2.b(32);
            ethcVar2.c(32);
            ethcVar2.e(32);
            ethcVar2.d(16);
            ethcVar2.a = ethd.c;
            ethcVar2.b = ethe.c;
            hashSet.add(ethcVar2.a());
            hashSet.add(new etkg(etkf.c));
            etmr etmrVar = new etmr();
            etmrVar.b(64);
            etmrVar.a = etms.c;
            hashSet.add(etmrVar.a());
            return DesugarCollections.unmodifiableSet(hashSet);
        }
    });
    public final etnp b;
    public final etnq c;
    public final etnr d;
    public final etns e;
    public final etgf f;
    public final eujt g;

    public etnt(etnp etnpVar, etnq etnqVar, etnr etnrVar, etgf etgfVar, etns etnsVar, eujt eujtVar) {
        this.b = etnpVar;
        this.c = etnqVar;
        this.d = etnrVar;
        this.f = etgfVar;
        this.e = etnsVar;
        this.g = eujtVar;
    }

    @Override // defpackage.etgf
    public final boolean a() {
        return this.e != etns.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof etnt)) {
            return false;
        }
        etnt etntVar = (etnt) obj;
        return Objects.equals(etntVar.b, this.b) && Objects.equals(etntVar.c, this.c) && Objects.equals(etntVar.d, this.d) && Objects.equals(etntVar.f, this.f) && Objects.equals(etntVar.e, this.e) && Objects.equals(etntVar.g, this.g);
    }

    public final int hashCode() {
        return Objects.hash(etnt.class, this.b, this.c, this.d, this.f, this.e, this.g);
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.b, this.c, this.d, this.f, this.e, this.g);
    }
}
