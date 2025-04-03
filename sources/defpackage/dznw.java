package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dznw extends dzre {
    public final engw a;
    public final int b;
    public final emxc c;

    public dznw(engw engwVar, int i, emxc emxcVar) {
        this.a = engwVar;
        this.b = i;
        this.c = emxcVar;
    }

    @Override // defpackage.dzre
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dzre
    public final emxc b() {
        return this.c;
    }

    @Override // defpackage.dzre
    public final engw c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzre) {
            dzre dzreVar = (dzre) obj;
            if (enkr.h(this.a, dzreVar.c()) && this.b == dzreVar.a() && this.c.equals(dzreVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.c;
        return "RichCardButtons{buttons=" + String.valueOf(this.a) + ", orientation=" + this.b + ", horizontalAlignment=" + String.valueOf(emxcVar) + "}";
    }
}
