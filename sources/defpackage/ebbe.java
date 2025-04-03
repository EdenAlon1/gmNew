package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebbe extends ebas {
    public final ebaq a;
    public final ebaq b;
    public final ebaq c;

    public ebbe(ebaq ebaqVar, ebaq ebaqVar2, ebaq ebaqVar3) {
        this.a = ebaqVar;
        this.b = ebaqVar2;
        this.c = ebaqVar3;
    }

    @Override // defpackage.ebas
    public final ebaq a() {
        return this.c;
    }

    @Override // defpackage.ebas
    public final ebaq b() {
        return this.a;
    }

    @Override // defpackage.ebas
    public final ebaq c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebas) {
            ebas ebasVar = (ebas) obj;
            if (this.a.equals(ebasVar.b()) && this.b.equals(ebasVar.c()) && this.c.equals(ebasVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        ebaq ebaqVar = this.c;
        ebaq ebaqVar2 = this.b;
        return "AccountMenuClickListeners{myAccountClickListener=" + this.a.toString() + ", useAnotherAccountClickListener=" + ebaqVar2.toString() + ", manageAccountsClickListener=" + ebaqVar.toString() + "}";
    }
}
