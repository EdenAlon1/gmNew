package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqyo implements aqyt {
    public final djtp a;
    private final ffbz b;
    private final ffbz c;
    private final ffbz d;
    private final ffbz e;
    private final boolean f;

    public aqyo(csuk csukVar, ffbr ffbrVar, csmk csmkVar, djtp djtpVar) {
        csukVar.getClass();
        ffbrVar.getClass();
        csmkVar.getClass();
        this.a = djtpVar;
        this.b = ffca.a(new ffix() { // from class: aqyj
            @Override // defpackage.ffix
            public final Object invoke() {
                return Integer.valueOf(aqyn.a(csmk.d(Optional.of(aqyo.this.a))));
            }
        });
        this.c = ffca.a(new ffix() { // from class: aqyk
            @Override // defpackage.ffix
            public final Object invoke() {
                return Integer.valueOf(aqyn.a(csmk.e(Optional.of(aqyo.this.a))));
            }
        });
        this.d = ffca.a(new ffix() { // from class: aqyl
            @Override // defpackage.ffix
            public final Object invoke() {
                return Integer.valueOf(aqyn.a(csmk.c(Optional.of(aqyo.this.a))));
            }
        });
        this.e = ffca.a(new ffix() { // from class: aqym
            @Override // defpackage.ffix
            public final Object invoke() {
                return Integer.valueOf(csuk.c(aqyo.this.a));
            }
        });
        this.f = true;
    }

    @Override // defpackage.aqyt
    public final int a() {
        return ((Number) this.b.a()).intValue();
    }

    @Override // defpackage.aqyt
    public final int b() {
        return ((Number) this.d.a()).intValue();
    }

    @Override // defpackage.aqyt
    public final int c() {
        return ((Number) this.e.a()).intValue();
    }

    @Override // defpackage.aqyt
    public final int d() {
        return ((Number) this.c.a()).intValue();
    }

    @Override // defpackage.aqyt
    public final boolean e() {
        return this.f;
    }
}
