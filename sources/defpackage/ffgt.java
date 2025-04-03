package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffgt implements Serializable, ffhd {
    private final ffhd a;
    private final ffha b;

    public ffgt(ffhd ffhdVar, ffha ffhaVar) {
        ffhdVar.getClass();
        this.a = ffhdVar;
        this.b = ffhaVar;
    }

    private final int a() {
        int i = 2;
        ffgt ffgtVar = this;
        while (true) {
            ffhd ffhdVar = ffgtVar.a;
            ffgtVar = ffhdVar instanceof ffgt ? (ffgt) ffhdVar : null;
            if (ffgtVar == null) {
                return i;
            }
            i++;
        }
    }

    private final boolean b(ffha ffhaVar) {
        return ffkj.e(get(ffhaVar.getKey()), ffhaVar);
    }

    private final Object writeReplace() {
        int a = a();
        ffhd[] ffhdVarArr = new ffhd[a];
        ffkz ffkzVar = new ffkz();
        fold(ffcu.a, new ffgs(ffhdVarArr, ffkzVar));
        if (ffkzVar.a == a) {
            return new ffgq(ffhdVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ffgt) {
            ffgt ffgtVar = (ffgt) obj;
            if (ffgtVar.a() == a()) {
                ffgt ffgtVar2 = this;
                while (true) {
                    if (!ffgtVar.b(ffgtVar2.b)) {
                        break;
                    }
                    ffhd ffhdVar = ffgtVar2.a;
                    if (ffhdVar instanceof ffgt) {
                        ffgtVar2 = (ffgt) ffhdVar;
                    } else if (ffgtVar.b((ffha) ffhdVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.ffhd
    public final <R> R fold(R r, ffjm<? super R, ? super ffha, ? extends R> ffjmVar) {
        return (R) ffjmVar.a(this.a.fold(r, ffjmVar), this.b);
    }

    @Override // defpackage.ffhd
    public final <E extends ffha> E get(ffhb<E> ffhbVar) {
        ffhbVar.getClass();
        ffgt ffgtVar = this;
        while (true) {
            E e = (E) ffgtVar.b.get(ffhbVar);
            if (e != null) {
                return e;
            }
            ffhd ffhdVar = ffgtVar.a;
            if (!(ffhdVar instanceof ffgt)) {
                return (E) ffhdVar.get(ffhbVar);
            }
            ffgtVar = (ffgt) ffhdVar;
        }
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    @Override // defpackage.ffhd
    public final ffhd minusKey(ffhb<?> ffhbVar) {
        ffhbVar.getClass();
        if (this.b.get(ffhbVar) != null) {
            return this.a;
        }
        ffhd minusKey = this.a.minusKey(ffhbVar);
        return minusKey != this.a ? minusKey == ffhe.a ? this.b : new ffgt(minusKey, this.b) : this;
    }

    @Override // defpackage.ffhd
    public final ffhd plus(ffhd ffhdVar) {
        return ffgy.a(this, ffhdVar);
    }

    public final String toString() {
        return "[" + fold("", ffgr.a) + "]";
    }
}
