package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class edsd {
    public abstract edse a();

    public abstract void b(dhqd dhqdVar);

    public abstract void c(long j);

    public final edse d() {
        edse a = a();
        edqc edqcVar = ((edre) a).a;
        if (edqcVar != null) {
            emxf.b(edqcVar.ac() != null, "Place must have a valid place id.");
        }
        return a;
    }
}
