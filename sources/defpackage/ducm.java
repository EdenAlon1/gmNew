package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ducm extends dufs {
    public final enip a;
    public final enip b;
    public final engw c;
    public final enhk d;

    public ducm(enip enipVar, enip enipVar2, engw engwVar, enhk enhkVar) {
        this.a = enipVar;
        this.b = enipVar2;
        this.c = engwVar;
        this.d = enhkVar;
    }

    @Override // defpackage.dufs
    public final dufr a() {
        return new ducl(this);
    }

    @Override // defpackage.dufs
    public final engw b() {
        return this.c;
    }

    @Override // defpackage.dufs
    public final enhk c() {
        return this.d;
    }

    @Override // defpackage.dufs
    public final enip d() {
        return this.a;
    }

    @Override // defpackage.dufs
    public final enip e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dufs) {
            dufs dufsVar = (dufs) obj;
            if (this.a.equals(dufsVar.d()) && this.b.equals(dufsVar.e()) && enkr.h(this.c, dufsVar.b()) && ennc.m(this.d, dufsVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        enhk enhkVar = this.d;
        engw engwVar = this.c;
        enip enipVar = this.b;
        return "SyncResult{changedElementKeys=" + String.valueOf(this.a) + ", uploadedElementKeys=" + String.valueOf(enipVar) + ", failures=" + String.valueOf(engwVar) + ", idToErrorMap=" + String.valueOf(enhkVar) + "}";
    }
}
