package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzkw extends dzkx {
    private final eyee a;

    public dzkw(eyee eyeeVar) {
        this.a = eyeeVar;
    }

    @Override // defpackage.dzqk
    public final int a() {
        return 1;
    }

    @Override // defpackage.dzkx, defpackage.dzqk
    public final eyee e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzqk) {
            dzqk dzqkVar = (dzqk) obj;
            if (dzqkVar.a() == 1 && this.a.equals(dzqkVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{unsupported=" + this.a.toString() + "}";
    }
}
