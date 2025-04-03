package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejhz extends ejii {
    public final ebsj a;
    private final emxc b;

    public ejhz(ebsj ebsjVar, emxc emxcVar) {
        this.a = ebsjVar;
        this.b = emxcVar;
    }

    @Override // defpackage.ejii
    public final ebsj a() {
        return this.a;
    }

    @Override // defpackage.ejii
    public final emxc b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejii) {
            ejii ejiiVar = (ejii) obj;
            if (this.a.equals(ejiiVar.a()) && this.b.equals(ejiiVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        return "Options{features=" + this.a.toString() + ", topViewCreator=Optional.absent()}";
    }
}
