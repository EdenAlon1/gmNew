package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dicu implements dhzk {
    private final int a;
    private final dhzm b;

    public dicu(dhzk dhzkVar) {
        this.a = dhzkVar.a();
        this.b = new dicz(dhzkVar.b());
    }

    @Override // defpackage.dhzk
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dhzk
    public final dhzm b() {
        return this.b;
    }

    public final String toString() {
        int i = this.a;
        return "DataEventEntity{ type=" + (i == 1 ? "changed" : i == 2 ? "deleted" : "unknown") + ", dataitem=" + this.b.toString() + " }";
    }

    @Override // defpackage.dfvc
    public final /* bridge */ /* synthetic */ Object d() {
        return this;
    }
}
