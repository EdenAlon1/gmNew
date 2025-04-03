package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgwo extends cgwq {
    private final eruw a;
    private final boolean b;

    public cgwo(eruw eruwVar, boolean z) {
        if (eruwVar == null) {
            throw new NullPointerException("Null type");
        }
        this.a = eruwVar;
        this.b = z;
    }

    @Override // defpackage.cgwq
    public final eruw a() {
        return this.a;
    }

    @Override // defpackage.cgwq
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgwq) {
            cgwq cgwqVar = (cgwq) obj;
            if (this.a.equals(cgwqVar.a()) && this.b == cgwqVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "ConversationTypeInfo{type=" + this.a.toString() + ", needsRefresh=" + this.b + "}";
    }
}
