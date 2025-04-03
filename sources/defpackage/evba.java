package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evba {
    public final String a;
    public final boolean b;
    public final enkg c;
    public final evaz d;
    public final boolean e;
    public final int f;
    public final String g;
    public final Long h;
    public final enip i;
    public final Integer j;
    public final Integer k;

    public evba(evay evayVar) {
        this.a = evayVar.a;
        this.b = evayVar.g;
        this.c = engy.e(evayVar.b);
        this.d = evayVar.c;
        this.e = evayVar.d;
        this.f = evayVar.e;
        this.g = evayVar.f;
        this.h = evayVar.h;
        this.i = enip.o(evayVar.i);
        this.j = evayVar.j;
        this.k = evayVar.k;
    }

    public final String toString() {
        evaz evazVar = this.d;
        enkg enkgVar = this.c;
        return super.toString() + ": url=" + this.a + ", headers=" + enkgVar.toString() + ", allowRedirect=" + this.e + ", priority=" + this.f + ", httpMethod=" + this.g + ", postBodyData=" + String.valueOf(evazVar);
    }
}
