package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class cqpt {
    public abstract cqpu a();

    public abstract void b(long j);

    public abstract void c(long j);

    public final cqpu d() {
        cqpu a = a();
        cqov cqovVar = (cqov) a;
        emxf.m(cqovVar.a >= 0, "Bytes transferred must be non-negative.");
        emxf.m(cqovVar.b >= 0, "Total bytes in file must be non-negative.");
        return a;
    }
}
