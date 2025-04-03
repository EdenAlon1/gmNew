package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebzl extends ecap {
    public final ecat a;
    public final ecas b;
    public final ecar c;
    public final ebvw d;
    public final ebpc e;

    public ebzl(ecat ecatVar, ecas ecasVar, ecar ecarVar, ebvw ebvwVar, ebpc ebpcVar) {
        this.a = ecatVar;
        this.b = ecasVar;
        this.c = ecarVar;
        this.d = ebvwVar;
        this.e = ebpcVar;
    }

    @Override // defpackage.ecap
    public final ebpc a() {
        return this.e;
    }

    @Override // defpackage.ecap
    public final ebvw b() {
        return this.d;
    }

    @Override // defpackage.ecap
    public final ecar c() {
        return this.c;
    }

    @Override // defpackage.ecap
    public final ecas d() {
        return this.b;
    }

    @Override // defpackage.ecap
    public final ecat e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ecap) {
            ecap ecapVar = (ecap) obj;
            if (this.a.equals(ecapVar.e()) && this.b.equals(ecapVar.d()) && this.c.equals(ecapVar.c()) && this.d.equals(ecapVar.b())) {
                ecapVar.f();
                ecapVar.g();
                if (this.e.equals(ecapVar.a())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 1) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "Configuration{onViewCreatedCallback=" + this.a.toString() + ", onDismissCallback=" + this.b.toString() + ", onDestroyCallback=" + this.c.toString() + ", visualElements=" + this.d.toString() + ", isExperimental=false, largeScreenDialogAlignment=ALIGN_CENTER, materialVersion=" + this.e.toString() + "}";
    }

    @Override // defpackage.ecap
    public final void f() {
    }

    @Override // defpackage.ecap
    public final void g() {
    }
}
