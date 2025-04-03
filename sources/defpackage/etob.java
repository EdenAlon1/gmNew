package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etob extends etoy {
    public final etnz a;
    public final etny b;
    public final etnw c;
    public final etoa d;

    public etob(etnz etnzVar, etny etnyVar, etnw etnwVar, etoa etoaVar) {
        this.a = etnzVar;
        this.b = etnyVar;
        this.c = etnwVar;
        this.d = etoaVar;
    }

    @Override // defpackage.etgf
    public final boolean a() {
        return this.d != etoa.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof etob)) {
            return false;
        }
        etob etobVar = (etob) obj;
        return this.a == etobVar.a && this.b == etobVar.b && this.c == etobVar.c && this.d == etobVar.d;
    }

    public final int hashCode() {
        return Objects.hash(etob.class, this.a, this.b, this.c, this.d);
    }
}
