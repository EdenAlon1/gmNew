package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ebcq extends ebek {
    public final ebff a;
    public final ebee b;
    public final emxc c;
    public final ebeh d;

    public ebcq(ebff ebffVar, ebee ebeeVar, emxc emxcVar, ebeh ebehVar) {
        this.a = ebffVar;
        this.b = ebeeVar;
        this.c = emxcVar;
        this.d = ebehVar;
    }

    @Override // defpackage.ebek
    public final ebee a() {
        return this.b;
    }

    @Override // defpackage.ebek
    public final ebeh b() {
        return this.d;
    }

    @Override // defpackage.ebek
    public final ebff c() {
        return this.a;
    }

    @Override // defpackage.ebek
    public final emxc d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebek) {
            ebek ebekVar = (ebek) obj;
            if (this.a.equals(ebekVar.c()) && this.b.equals(ebekVar.a()) && this.c.equals(ebekVar.d()) && this.d.equals(ebekVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        ebeh ebehVar = this.d;
        emxc emxcVar = this.c;
        ebee ebeeVar = this.b;
        return "TextualCardInitialData{cardIcon=" + this.a.toString() + ", titleData=" + ebeeVar.toString() + ", highlightId=" + String.valueOf(emxcVar) + ", visualElementsInfo=" + ebehVar.toString() + "}";
    }
}
