package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fips extends fipy {
    public String a;
    private String b;

    public fips() {
    }

    @Override // defpackage.fipy
    public final void d(fiqk fiqkVar) {
        fiqkVar.h(this);
    }

    @Override // defpackage.fipy
    protected final String k() {
        return "destination=" + this.a + ", title=" + this.b;
    }

    public fips(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
