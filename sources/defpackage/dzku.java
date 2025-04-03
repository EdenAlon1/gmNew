package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzku extends dzkx {
    private final dzrw a;

    public dzku(dzrw dzrwVar) {
        this.a = dzrwVar;
    }

    @Override // defpackage.dzqk
    public final int a() {
        return 4;
    }

    @Override // defpackage.dzkx, defpackage.dzqk
    public final dzrw c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzqk) {
            dzqk dzqkVar = (dzqk) obj;
            if (dzqkVar.a() == 4 && this.a.equals(dzqkVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{richText=" + this.a.toString() + "}";
    }
}
