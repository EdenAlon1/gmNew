package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zkm {
    public final alxi a;
    public final byyt b;
    public final boolean c;
    public final boolean d;

    public zkm(alxi alxiVar, byyt byytVar, boolean z, boolean z2) {
        this.a = alxiVar;
        this.b = byytVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zkm)) {
            return false;
        }
        zkm zkmVar = (zkm) obj;
        return this.a == zkmVar.a && this.b == zkmVar.b && this.c == zkmVar.c && this.d == zkmVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + zkl.a(this.c)) * 31) + zkl.a(this.d);
    }

    public final String toString() {
        return "ConversationPropertiesProjection(kind=" + this.a + ", archiveStatus=" + this.b + ", longPressActionsEnabled=" + this.c + ", shouldShowSimName=" + this.d + ")";
    }
}
