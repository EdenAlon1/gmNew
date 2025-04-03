package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehyi extends ehzx {
    private final String b;
    private final String c;
    private final enhk d;

    public ehyi(String str, String str2, enhk enhkVar) {
        this.b = str;
        this.c = str2;
        this.d = enhkVar;
    }

    @Override // defpackage.ehzx
    public final enhk a() {
        return this.d;
    }

    @Override // defpackage.ehzx
    public final String b() {
        return this.c;
    }

    @Override // defpackage.ehzx
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehzx) {
            ehzx ehzxVar = (ehzx) obj;
            if (this.b.equals(ehzxVar.c()) && this.c.equals(ehzxVar.b()) && ennc.m(this.d, ehzxVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }
}
