package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekpd extends ekpg {
    public final String a;
    public final Integer b;
    private final evbl c;

    public ekpd(String str, Integer num, evbl evblVar) {
        this.a = str;
        this.b = num;
        this.c = evblVar;
    }

    @Override // defpackage.ekpg
    public final evbl a() {
        return this.c;
    }

    @Override // defpackage.ekpg
    public final Integer b() {
        return this.b;
    }

    @Override // defpackage.ekpg
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ekpg) {
            ekpg ekpgVar = (ekpg) obj;
            String str = this.a;
            if (str != null ? str.equals(ekpgVar.c()) : ekpgVar.c() == null) {
                Integer num = this.b;
                if (num != null ? num.equals(ekpgVar.b()) : ekpgVar.b() == null) {
                    if (this.c.equals(ekpgVar.a())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        Integer num = this.b;
        return ((((hashCode ^ 1000003) * 1000003) ^ (num != null ? num.hashCode() : 0)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "GrpcClientConfig{host=" + this.a + ", port=" + this.b + ", rpcServiceConfig=" + this.c.toString() + "}";
    }
}
