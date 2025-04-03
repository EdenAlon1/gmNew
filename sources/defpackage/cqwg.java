package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqwg extends cqwh {
    private final avui a;

    public cqwg(avui avuiVar) {
        this.a = avuiVar;
    }

    @Override // defpackage.cqzw
    public final int b() {
        return 2;
    }

    @Override // defpackage.cqwh, defpackage.cqzw
    public final avui c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cqzw) {
            cqzw cqzwVar = (cqzw) obj;
            if (cqzwVar.b() == 2 && this.a.equals(cqzwVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageCoreDataOrWorkQueueResult{workQueueResult=" + this.a.toString() + "}";
    }
}
