package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzaf extends dzbg {
    public final dzsc a;
    public final boolean b;
    public final dzbf c;

    public dzaf(dzsc dzscVar, boolean z, dzbf dzbfVar) {
        this.a = dzscVar;
        this.b = z;
        this.c = dzbfVar;
    }

    @Override // defpackage.dzbg
    public final dzbf a() {
        return this.c;
    }

    @Override // defpackage.dzbg
    public final dzsc b() {
        return this.a;
    }

    @Override // defpackage.dzbg
    public final boolean c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzbg) {
            dzbg dzbgVar = (dzbg) obj;
            dzsc dzscVar = this.a;
            if (dzscVar != null ? dzscVar.equals(dzbgVar.b()) : dzbgVar.b() == null) {
                if (this.b == dzbgVar.c() && this.c.equals(dzbgVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        dzsc dzscVar = this.a;
        return (((((dzscVar == null ? 0 : dzscVar.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        dzbf dzbfVar = this.c;
        return "TachyonMessage{suggestionList=" + String.valueOf(this.a) + ", skipNotification=" + this.b + ", oneOfType=" + dzbfVar.toString() + "}";
    }
}
