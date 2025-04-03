package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fiqi extends fipy {
    public String a;

    public fiqi() {
    }

    @Override // defpackage.fipy
    public final void d(fiqk fiqkVar) {
        fiqkVar.o(this);
    }

    @Override // defpackage.fipy
    protected final String k() {
        return "literal=".concat(String.valueOf(this.a));
    }

    public fiqi(String str) {
        this.a = str;
    }
}
