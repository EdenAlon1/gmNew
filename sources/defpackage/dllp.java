package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dllp {
    public final dexf a;
    public final long b;

    public dllp(dexf dexfVar, long j) {
        emxf.b(true, "secondsFixIsValid must be >= 0");
        this.a = dexfVar;
        this.b = j;
    }

    protected abstract dllv a(dllv dllvVar, emxc emxcVar);

    protected abstract String b();
}
