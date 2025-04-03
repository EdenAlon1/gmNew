package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fipu extends fipy {
    public String a;
    private String b;

    public fipu() {
    }

    @Override // defpackage.fipy
    public final void d(fiqk fiqkVar) {
        fiqkVar.i(this);
    }

    @Override // defpackage.fipy
    protected final String k() {
        return "destination=" + this.a + ", title=" + this.b;
    }

    public fipu(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
