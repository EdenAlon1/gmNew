package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsj implements jse {
    public final jtd a;
    public final jsq b;
    public final jtc c;
    public final ffji d = new jsh(this);
    private final jtg e;
    private final jtr f;

    public jsj(jtd jtdVar, jtg jtgVar, jtr jtrVar, jsq jsqVar, jtc jtcVar) {
        this.a = jtdVar;
        this.e = jtgVar;
        this.f = jtrVar;
        this.b = jsqVar;
        this.c = jtcVar;
    }

    @Override // defpackage.jse
    public final hkx a(jsf jsfVar, jsy jsyVar, int i, int i2) {
        int i3 = ((jrp) this.e).a;
        if (i3 != 0 && i3 != Integer.MAX_VALUE) {
            jsyVar = new jsy(ffmk.i(jsyVar.i + i3, 1, 1000));
        }
        return b(new jtp(jsfVar, jsyVar, i, i2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [hkx, java.lang.Object, jtu] */
    public final hkx b(jtp jtpVar) {
        jsi jsiVar = new jsi(this, jtpVar);
        jtr jtrVar = this.f;
        synchronized (jtrVar.a) {
            jtu jtuVar = (jtu) jtrVar.b.c(jtpVar);
            if (jtuVar != null) {
                if (jtuVar.b()) {
                    return jtuVar;
                }
            }
            try {
                ?? invoke = jsiVar.invoke(new jtq(jtrVar, jtpVar));
                synchronized (jtrVar.a) {
                    if (jtrVar.b.c(jtpVar) == null && invoke.b()) {
                        jtrVar.b.d(jtpVar, invoke);
                    }
                }
                return invoke;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }
}
