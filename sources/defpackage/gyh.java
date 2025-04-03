package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyh implements hbs {
    private final int a;
    private final hus b;
    private final hus c;

    public gyh(hus husVar, hus husVar2, int i) {
        this.b = husVar;
        this.c = husVar2;
        this.a = i;
    }

    @Override // defpackage.hbs
    public final int a(kac kacVar, long j, int i) {
        int a = this.c.a(0, kacVar.a());
        return kacVar.c + a + (-this.b.a(0, i)) + this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyh)) {
            return false;
        }
        gyh gyhVar = (gyh) obj;
        return ffkj.e(this.b, gyhVar.b) && ffkj.e(this.c, gyhVar.c) && this.a == gyhVar.a;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.a;
    }

    public final String toString() {
        return "Vertical(menuAlignment=" + this.b + ", anchorAlignment=" + this.c + ", offset=" + this.a + ')';
    }
}
