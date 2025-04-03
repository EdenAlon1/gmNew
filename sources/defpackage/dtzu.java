package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtzu {
    public final dtvs a;
    public int b;
    public dtza c;
    public final boolean d;
    public final boolean e;

    public dtzu(dtvs dtvsVar, dtza dtzaVar, boolean z) {
        this.b = 0;
        this.a = dtvsVar;
        this.c = dtzaVar;
        this.d = z;
        this.e = false;
    }

    public static dtzu b() {
        return new dtzu(null, dtza.B().a());
    }

    public final dtyo a() {
        return ((dtrj) this.c).v != null ? new dtyo() { // from class: dtzt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((dtrj) dtzu.this.c).v;
            }
        } : dtvs.a(this.b);
    }

    public final void c() {
        this.b++;
    }

    public dtzu(dtvs dtvsVar, dtza dtzaVar, boolean z, byte[] bArr) {
        this.b = 0;
        this.a = dtvsVar;
        this.c = dtzaVar;
        this.d = false;
        this.e = z;
    }

    public dtzu(dtvs dtvsVar, dtza dtzaVar) {
        this(dtvsVar, dtzaVar, false, null);
    }
}
