package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ffjz implements Serializable, ffmn {
    public static final Object f = ffjy.a;
    private transient ffmn a;
    private final Class b;
    private final boolean c;
    protected final Object g;
    public final String h;
    public final String i;

    protected ffjz(Object obj, Class cls, String str, String str2, boolean z) {
        this.g = obj;
        this.b = cls;
        this.h = str;
        this.i = str2;
        this.c = z;
    }

    @Override // defpackage.ffmn
    public final String b() {
        return this.h;
    }

    public final ffmn c() {
        ffmn ffmnVar = this.a;
        if (ffmnVar != null) {
            return ffmnVar;
        }
        g();
        this.a = this;
        return this;
    }

    public final ffmp e() {
        Class cls = this.b;
        if (cls == null) {
            return null;
        }
        if (this.c) {
            int i = fflc.a;
            return new ffkq(cls);
        }
        int i2 = fflc.a;
        return new ffkb(cls);
    }

    @Override // defpackage.ffmn
    public final Object f() {
        throw null;
    }

    protected abstract void g();
}
