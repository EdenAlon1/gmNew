package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fitc extends fita {
    private static final long serialVersionUID = 8019982251647420015L;
    public final firl a;

    public fitc(firl firlVar, firn firnVar) {
        super(firnVar);
        if (!firlVar.f()) {
            throw new IllegalArgumentException("The field must be supported");
        }
        this.a = firlVar;
    }

    @Override // defpackage.firl
    public long a(long j, int i) {
        return this.a.a(j, i);
    }

    @Override // defpackage.firl
    public long b(long j, long j2) {
        return this.a.b(j, j2);
    }

    @Override // defpackage.firl
    public long c() {
        return this.a.c();
    }

    @Override // defpackage.firl
    public final boolean e() {
        return this.a.e();
    }
}
