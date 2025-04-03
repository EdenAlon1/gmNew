package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebsv extends ebtb {
    public final ebtd a;
    public final ebtd b;
    public final engw c;
    private final ebsx d;

    public ebsv(ebtd ebtdVar, ebtd ebtdVar2, ebsx ebsxVar, engw engwVar) {
        this.a = ebtdVar;
        this.b = ebtdVar2;
        this.d = ebsxVar;
        this.c = engwVar;
    }

    @Override // defpackage.ebtb
    public final ebtd a() {
        return this.a;
    }

    @Override // defpackage.ebtb
    public final ebtd b() {
        return this.b;
    }

    @Override // defpackage.ebtb
    public final engw c() {
        return this.c;
    }

    @Override // defpackage.ebtb
    public final ebsx d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        engw engwVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebtb) {
            ebtb ebtbVar = (ebtb) obj;
            if (this.a.equals(ebtbVar.a()) && this.b.equals(ebtbVar.b()) && this.d.equals(ebtbVar.d()) && ((engwVar = this.c) != null ? enkr.h(engwVar, ebtbVar.c()) : ebtbVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.d.hashCode();
        engw engwVar = this.c;
        return (hashCode * 1000003) ^ (engwVar == null ? 0 : engwVar.hashCode());
    }

    public final String toString() {
        engw engwVar = this.c;
        ebsx ebsxVar = this.d;
        ebtd ebtdVar = this.b;
        return "ImageModelLoader{imageRetriever=" + this.a.toString() + ", secondaryImageRetriever=" + ebtdVar.toString() + ", defaultImageRetriever=" + ebsxVar.toString() + ", postProcessors=" + String.valueOf(engwVar) + "}";
    }
}
