package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehyg extends ehzv {
    private final eyee a;
    private final ehzx b;

    public ehyg(eyee eyeeVar, ehzx ehzxVar) {
        this.a = eyeeVar;
        this.b = ehzxVar;
    }

    @Override // defpackage.ehzv
    public final ehzx a() {
        return this.b;
    }

    @Override // defpackage.ehzv
    public final eyee b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ehzv) {
            ehzv ehzvVar = (ehzv) obj;
            if (this.a.equals(ehzvVar.b()) && this.b.equals(ehzvVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
