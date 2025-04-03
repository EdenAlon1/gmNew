package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzkt extends dzkx {
    private final dzqj a;

    public dzkt(dzqj dzqjVar) {
        this.a = dzqjVar;
    }

    @Override // defpackage.dzqk
    public final int a() {
        return 3;
    }

    @Override // defpackage.dzkx, defpackage.dzqk
    public final dzqj b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzqk) {
            dzqk dzqkVar = (dzqk) obj;
            if (dzqkVar.a() == 3 && this.a.equals(dzqkVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{custom=" + this.a.toString() + "}";
    }
}
