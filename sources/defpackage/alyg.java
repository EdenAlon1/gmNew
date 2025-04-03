package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alyg implements alyw {
    public final appj a;

    public alyg(appj appjVar) {
        appjVar.getClass();
        this.a = appjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof alyg) && ffkj.e(this.a, ((alyg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageSummary(content=" + this.a + ")";
    }
}
