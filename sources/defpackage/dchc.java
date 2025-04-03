package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dchc extends dche {
    public final int a;
    public final int b;
    private int d;

    public dchc(int i, int i2, int i3) {
        super(i);
        this.d = -1;
        this.a = i2;
        this.b = i3;
    }

    @Override // defpackage.dche
    public final int a() {
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int hashCode = hashCode();
        this.d = hashCode;
        return hashCode;
    }

    @Override // defpackage.dche
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dchc)) {
            return false;
        }
        dchc dchcVar = (dchc) obj;
        return super.equals(obj) && this.a == dchcVar.a && this.b == dchcVar.b;
    }

    @Override // defpackage.dche
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
