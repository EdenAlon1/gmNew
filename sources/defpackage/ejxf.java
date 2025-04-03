package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejxf extends ejys {
    private final emxc a;
    private final emxc b;
    private final emxc c;
    private final emxc d;

    public ejxf(emxc emxcVar, emxc emxcVar2, emxc emxcVar3, emxc emxcVar4) {
        this.a = emxcVar;
        this.b = emxcVar2;
        this.c = emxcVar3;
        this.d = emxcVar4;
    }

    @Override // defpackage.ejys
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.ejys
    public final emxc b() {
        return this.a;
    }

    @Override // defpackage.ejys
    public final emxc c() {
        return this.c;
    }

    @Override // defpackage.ejys
    public final emxc d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejys) {
            ejys ejysVar = (ejys) obj;
            if (this.a.equals(ejysVar.b()) && this.b.equals(ejysVar.a()) && this.c.equals(ejysVar.c()) && this.d.equals(ejysVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.d;
        emxc emxcVar2 = this.c;
        emxc emxcVar3 = this.b;
        return "LocalSubscriptionState{maybeLocalDataSource=" + this.a.toString() + ", executingLoad=" + emxcVar3.toString() + ", pendingTopicResult=" + emxcVar2.toString() + ", publishedTopicResult=" + emxcVar.toString() + "}";
    }
}
