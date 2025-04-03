package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qiy implements qil {
    public final qic a;
    public final boolean b;
    private final String c;
    private final int d;

    public qiy(String str, int i, qic qicVar, boolean z) {
        this.c = str;
        this.d = i;
        this.a = qicVar;
        this.b = z;
    }

    @Override // defpackage.qil
    public final qdu a(qdb qdbVar, qci qciVar, qje qjeVar) {
        return new qej(qdbVar, qjeVar, this);
    }

    public final String toString() {
        return "ShapePath{name=" + this.c + ", index=" + this.d + "}";
    }
}
