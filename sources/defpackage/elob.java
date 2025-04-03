package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class elob extends elod {
    private final Object a;

    public elob(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.elod
    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof elod) {
            elod elodVar = (elod) obj;
            elodVar.b();
            Object obj2 = this.a;
            if (obj2 != null ? obj2.equals(elodVar.a()) : elodVar.a() == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return (obj == null ? 0 : obj.hashCode()) ^ 385623362;
    }

    public final String toString() {
        return "ExecutionResult{startDictation=false, output=" + String.valueOf(this.a) + "}";
    }

    @Override // defpackage.elod
    public final void b() {
    }
}
