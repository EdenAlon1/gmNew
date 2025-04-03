package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvxc {
    public final eyfa a;
    public final Object b;

    public dvxc(eyfa eyfaVar, Object obj) {
        boolean z = false;
        if (eyfaVar.a() >= 100000000 && eyfaVar.a() < 200000000) {
            z = true;
        }
        emxf.a(z);
        this.a = eyfaVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dvxc) {
            dvxc dvxcVar = (dvxc) obj;
            if (this.a.equals(dvxcVar.a) && this.b.equals(dvxcVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
