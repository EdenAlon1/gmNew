package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzac {
    private final ejvb a;
    private final ejvp b;

    public bzac(ejvb ejvbVar, ejvp ejvpVar) {
        this.a = ejvbVar;
        this.b = ejvpVar;
    }

    public static void b(dtyq dtyqVar, Object obj, lkk lkkVar, ejvp ejvpVar) {
        dtyqVar.M(lkkVar, new bzab(ejvpVar, obj));
    }

    public final ejuh a(final dtyq dtyqVar, final byzu byzuVar, Object obj, lkk lkkVar) {
        b(dtyqVar, obj, lkkVar, this.b);
        return new ejuy(this.a, new eros() { // from class: bzaa
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                return new erph(byzu.this.a(dtyqVar));
            }
        }, obj);
    }
}
