package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmte {
    public final List a;
    public final ffji b;
    public final ffix c;
    public final ffix d;
    public final hkx e;
    private final dmtd f;

    public dmte() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmte)) {
            return false;
        }
        dmte dmteVar = (dmte) obj;
        return ffkj.e(this.a, dmteVar.a) && ffkj.e(this.b, dmteVar.b) && ffkj.e(this.c, dmteVar.c) && ffkj.e(this.d, dmteVar.d) && ffkj.e(this.e, dmteVar.e) && ffkj.e(this.f, dmteVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + 1237;
    }

    public final String toString() {
        return "ContactBarUiData(chips=" + this.a + ", onSearchTextChange=" + this.b + ", onBackspaceInput=" + this.c + ", onDoneInput=" + this.d + ", searchText=" + this.e + ", flags=" + this.f + ")";
    }

    public dmte(List list, ffji ffjiVar, ffix ffixVar, ffix ffixVar2, hkx hkxVar, dmtd dmtdVar) {
        this.a = list;
        this.b = ffjiVar;
        this.c = ffixVar;
        this.d = ffixVar2;
        this.e = hkxVar;
        this.f = dmtdVar;
    }

    public /* synthetic */ dmte(byte[] bArr) {
        this(ffel.a, new ffji() { // from class: dmta
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((String) obj).getClass();
                return ffcu.a;
            }
        }, new ffix() { // from class: dmtb
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, new ffix() { // from class: dmtc
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, new hic("", hla.a), new dmtd((char[]) null));
    }
}
