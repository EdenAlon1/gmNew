package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehza extends eibn {
    private final String a;
    private final String b;
    private final String c;

    public ehza(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // defpackage.eibn
    public final String a() {
        return this.b;
    }

    @Override // defpackage.eibn
    public final String b() {
        return this.a;
    }

    @Override // defpackage.eibn
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eibn) {
            eibn eibnVar = (eibn) obj;
            if (this.a.equals(eibnVar.b()) && this.b.equals(eibnVar.a()) && this.c.equals(eibnVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
