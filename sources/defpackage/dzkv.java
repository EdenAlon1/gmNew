package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzkv extends dzkx {
    private final String a;

    public dzkv(String str) {
        this.a = str;
    }

    @Override // defpackage.dzqk
    public final int a() {
        return 2;
    }

    @Override // defpackage.dzkx, defpackage.dzqk
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dzqk) {
            dzqk dzqkVar = (dzqk) obj;
            if (dzqkVar.a() == 2 && this.a.equals(dzqkVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MessageContent{text=" + this.a + "}";
    }
}
