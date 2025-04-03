package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpa {
    public final ffsk a;
    public final hho b;
    public final cxj c;
    public final akzt d;

    public zpa(ffsk ffskVar, hho hhoVar, cxj cxjVar, akzt akztVar) {
        ffskVar.getClass();
        hhoVar.getClass();
        cxjVar.getClass();
        this.a = ffskVar;
        this.b = hhoVar;
        this.c = cxjVar;
        this.d = akztVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zpa)) {
            return false;
        }
        zpa zpaVar = (zpa) obj;
        return ffkj.e(this.a, zpaVar.a) && ffkj.e(this.b, zpaVar.b) && ffkj.e(this.c, zpaVar.c) && ffkj.e(this.d, zpaVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "SwipeData(coroutineScope=" + this.a + ", dragOffsetX=" + this.b + ", offsetX=" + this.c + ", counterEventLogger=" + this.d + ")";
    }
}
