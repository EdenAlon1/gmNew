package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hil {
    public final hfw a;
    public final boolean b;
    public final hke c;
    public final boolean d;
    public final Object e;
    public boolean f = true;

    public hil(hfw hfwVar, Object obj, boolean z, hke hkeVar, boolean z2) {
        this.a = hfwVar;
        this.b = z;
        this.c = hkeVar;
        this.d = z2;
        this.e = obj;
    }

    public final Object a() {
        if (this.b) {
            return null;
        }
        Object obj = this.e;
        if (obj != null) {
            return obj;
        }
        hfp.h("Unexpected form of a provided value");
        throw new ffbx();
    }
}
