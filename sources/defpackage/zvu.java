package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvu implements zvp {
    public final alxr a;
    public final alxr b;
    public final alxr c;
    public final ztb d;
    private final cqoh e;
    private final ffbz f;
    private final ffbz g;
    private final ffbz h;
    private final ffbz i;

    public zvu(alxr alxrVar, alxr alxrVar2, alxr alxrVar3, ztb ztbVar, cqoh cqohVar) {
        alxrVar.getClass();
        cqohVar.getClass();
        this.a = alxrVar;
        this.b = alxrVar2;
        this.c = alxrVar3;
        this.d = ztbVar;
        this.e = cqohVar;
        this.f = ffca.a(new ffix() { // from class: zvq
            @Override // defpackage.ffix
            public final Object invoke() {
                String d;
                alxr alxrVar4 = zvu.this.a;
                if (alxrVar4.g() instanceof appw) {
                    appw appwVar = (appw) alxrVar4.g();
                    String c = appwVar.c();
                    boolean z = c == null || c.length() == 0;
                    boolean z2 = !(appwVar instanceof appz) || (d = ((appz) appwVar).d()) == null || d.length() == 0;
                    if (z && z2) {
                        return new aapy(alxrVar4);
                    }
                }
                return alxrVar4;
            }
        });
        this.g = ffca.a(new ffix() { // from class: zvr
            @Override // defpackage.ffix
            public final Object invoke() {
                zvu zvuVar = zvu.this;
                alxr a = zvuVar.a();
                a.getClass();
                ztb ztbVar2 = zvuVar.d;
                alxr alxrVar4 = zvuVar.c;
                alxr a2 = alxrVar4 != null ? ztbVar2.a(alxrVar4) : null;
                alxr alxrVar5 = zvuVar.b;
                alxr a3 = alxrVar5 != null ? ztbVar2.a(alxrVar5) : null;
                dnry dnryVar = (ztb.b(a, a2) || !ztb.b(a, a3)) ? (ztb.b(a, a2) && ztb.b(a, a3)) ? dnry.c : (!ztb.b(a, a2) || ztb.b(a, a3)) ? dnry.a : dnry.d : dnry.b;
                if (zro.a(a)) {
                    if (dnryVar == dnry.b) {
                        dnryVar = dnry.a;
                    } else if (dnryVar == dnry.c) {
                        dnryVar = dnry.d;
                    }
                }
                return (a2 == null || !zro.a(a2)) ? dnryVar : dnryVar == dnry.c ? dnry.b : dnryVar == dnry.d ? dnry.a : dnryVar;
            }
        });
        this.h = ffca.a(new ffix() { // from class: zvs
            @Override // defpackage.ffix
            public final Object invoke() {
                return Boolean.valueOf(zvu.this.c == null);
            }
        });
        this.i = ffca.a(new ffix() { // from class: zvt
            @Override // defpackage.ffix
            public final Object invoke() {
                return Boolean.valueOf(zvu.this.b == null);
            }
        });
    }

    @Override // defpackage.zvp
    public final alxr a() {
        return (alxr) this.f.a();
    }

    @Override // defpackage.zvp
    public final dnry b() {
        return (dnry) this.g.a();
    }

    @Override // defpackage.zvp
    public final boolean c() {
        return this.c == null || a().v() != this.c.v();
    }

    @Override // defpackage.zvp
    public final boolean d() {
        return ((Boolean) this.h.a()).booleanValue();
    }

    @Override // defpackage.zvp
    public final boolean e() {
        return ((Boolean) this.i.a()).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zvu)) {
            return false;
        }
        zvu zvuVar = (zvu) obj;
        return ffkj.e(a(), zvuVar.a()) && b() == zvuVar.b();
    }

    @Override // defpackage.zvp
    public final boolean f() {
        alxr alxrVar = this.b;
        if (alxrVar == null) {
            return false;
        }
        return alxrVar.n().isAfter(this.e.f().minusSeconds(5L));
    }

    @Override // defpackage.zvp
    public final boolean g() {
        alxr alxrVar = this.c;
        if (alxrVar == null) {
            return true;
        }
        appj g = alxrVar.g();
        return (g instanceof appy) && ((appx) ffdx.K(((appy) g).a())).b() == 8;
    }

    @Override // defpackage.zvp
    public final boolean h() {
        return this.c == null || Math.abs(a().n().toEpochMilli() - this.c.n().toEpochMilli()) >= 3600000;
    }

    public final int hashCode() {
        return (a().hashCode() * 31) + b().hashCode();
    }
}
