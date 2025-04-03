package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvxb {
    public final eyfa a;
    public final Object b;

    public dvxb(eyfa eyfaVar, Object obj) {
        boolean z = false;
        if (eyfaVar.a() >= 200000000 && eyfaVar.a() < 300000000) {
            z = true;
        }
        emxf.a(z);
        this.a = eyfaVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dvxb) {
            dvxb dvxbVar = (dvxb) obj;
            if (this.a.equals(dvxbVar.a) && this.b.equals(dvxbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
