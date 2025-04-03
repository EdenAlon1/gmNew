package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class emwd<A, B> implements emwl<A, B> {
    private transient emwd a;

    protected emwd() {
    }

    protected abstract Object a(Object obj);

    @Override // defpackage.emwl
    @Deprecated
    public final B apply(A a) {
        return (B) fP(a);
    }

    protected abstract Object b(Object obj);

    public Object fL(Object obj) {
        if (obj == null) {
            return null;
        }
        Object a = a(obj);
        a.getClass();
        return a;
    }

    public Object fP(Object obj) {
        if (obj == null) {
            return null;
        }
        Object b = b(obj);
        b.getClass();
        return b;
    }

    public final emwd m() {
        emwd emwdVar = this.a;
        if (emwdVar != null) {
            return emwdVar;
        }
        emwc emwcVar = new emwc(this);
        this.a = emwcVar;
        return emwcVar;
    }
}
