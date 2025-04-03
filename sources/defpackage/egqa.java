package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egqa extends egqf {
    private final egqe a;
    private final egpx b;
    private final boolean c;
    private final fazb d;
    private final int e;
    private final int f;
    private final egqd g;
    private final emxc h;

    public egqa(egqe egqeVar, egpx egpxVar, boolean z, fazb fazbVar, int i, int i2, egqd egqdVar, emxc emxcVar) {
        this.a = egqeVar;
        this.b = egpxVar;
        this.c = z;
        this.d = fazbVar;
        this.e = i;
        this.f = i2;
        this.g = egqdVar;
        this.h = emxcVar;
    }

    @Override // defpackage.egqf
    public final int a() {
        return this.e;
    }

    @Override // defpackage.egqf
    public final int b() {
        return this.f;
    }

    @Override // defpackage.egqf
    public final egpx c() {
        return this.b;
    }

    @Override // defpackage.egqf
    public final egqd d() {
        return this.g;
    }

    @Override // defpackage.egqf
    public final egqe e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egqf) {
            egqf egqfVar = (egqf) obj;
            if (this.a.equals(egqfVar.e()) && this.b.equals(egqfVar.c()) && this.c == egqfVar.h() && this.d.equals(egqfVar.g()) && this.e == egqfVar.a() && this.f == egqfVar.b() && this.g.equals(egqfVar.d()) && this.h.equals(egqfVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.egqf
    public final emxc f() {
        return this.h;
    }

    @Override // defpackage.egqf
    public final fazb g() {
        return this.d;
    }

    @Override // defpackage.egqf
    public final boolean h() {
        return this.c;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.h;
        egqd egqdVar = this.g;
        fazb fazbVar = this.d;
        egpx egpxVar = this.b;
        return "SuggestionTab{kind=" + this.a.toString() + ", fragmentStartMode=" + egpxVar.toString() + ", enabled=" + this.c + ", fragmentLazy=" + fazbVar.toString() + ", tabNameRes=" + this.e + ", visualElementId=" + this.f + ", iconApplier=" + egqdVar.toString() + ", onTabSelected=" + String.valueOf(emxcVar) + "}";
    }
}
