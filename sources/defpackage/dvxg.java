package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvxg {
    public final eyfa a;
    public final Object b;

    public dvxg(eyfa eyfaVar, Object obj) {
        this.a = eyfaVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dvxg) {
            dvxg dvxgVar = (dvxg) obj;
            if (this.a.equals(dvxgVar.a) && this.b.equals(dvxgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
