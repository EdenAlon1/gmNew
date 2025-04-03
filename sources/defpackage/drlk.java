package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drlk {
    public final drkd a;
    public final drkf b;
    private final drkb c;

    public drlk() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drlk)) {
            return false;
        }
        drlk drlkVar = (drlk) obj;
        return ffkj.e(this.a, drlkVar.a) && ffkj.e(this.b, drlkVar.b) && ffkj.e(this.c, drlkVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "MediaCapabilities(image=" + this.a + ", video=" + this.b + ", audio=" + this.c + ")";
    }

    public /* synthetic */ drlk(drkd drkdVar, int i) {
        drkdVar = (i & 1) != 0 ? new drkd(3) : drkdVar;
        drkf drkfVar = new drkf(null);
        drkb drkbVar = drkb.a;
        drkdVar.getClass();
        this.a = drkdVar;
        this.b = drkfVar;
        this.c = drkbVar;
    }
}
