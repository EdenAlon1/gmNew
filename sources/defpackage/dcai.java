package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcai {
    public final dcah a;
    public final int b;

    public dcai(dcah dcahVar, int i) {
        this.a = dcahVar;
        this.b = i;
    }

    public final void a(dcal dcalVar) {
        this.a.e(dcalVar, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dcai dcaiVar = (dcai) obj;
            if (this.b == dcaiVar.b && Objects.equals(this.a, dcaiVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b));
    }
}
