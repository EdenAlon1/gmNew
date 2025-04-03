package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzhl implements bzgw {
    private final comc a;
    private final errl b;
    private final ejvp c;

    public bzhl(comc comcVar, errl errlVar, ejvp ejvpVar) {
        this.a = comcVar;
        this.b = errlVar;
        this.c = ejvpVar;
    }

    public static boolean n(bzgu bzguVar) {
        return bzguVar.c && (bzguVar.b & 2) != 0;
    }

    @Override // defpackage.bzgw
    public final elfl a() {
        return this.a.j(new emwl() { // from class: bzhi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                bzgt bzgtVar = (bzgt) ((bzgu) obj).toBuilder();
                bzgtVar.copyOnWrite();
                bzgu bzguVar = (bzgu) bzgtVar.instance;
                bzguVar.b &= -5;
                bzguVar.e = 0L;
                return (bzgu) bzgtVar.build();
            }
        }).h(new emwl() { // from class: bzhj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                bzgu bzguVar = (bzgu) obj;
                bzhl.this.m();
                return bzguVar;
            }
        }, this.b);
    }

    @Override // defpackage.bzgw
    public final elfl b() {
        return this.a.h();
    }

    @Override // defpackage.bzgw
    public final elfl c() {
        return this.a.h().h(new emwl() { // from class: bzhh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((bzgu) obj).d;
            }
        }, erpp.a);
    }

    @Override // defpackage.bzgw
    public final elfl d() {
        return this.a.h().h(new emwl() { // from class: bzhb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                bzgu bzguVar = (bzgu) obj;
                return bzhl.n(bzguVar) ? bzguVar.d : "";
            }
        }, erpp.a);
    }

    @Override // defpackage.bzgw
    public final elfl e() {
        return this.a.h().h(new emwl() { // from class: bzgy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((bzgu) obj).c);
            }
        }, erpp.a);
    }

    @Override // defpackage.bzgw
    public final elfl f() {
        return this.a.h().h(new emwl() { // from class: bzha
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((bzgu) obj).f);
            }
        }, erpp.a);
    }

    @Override // defpackage.bzgw
    public final elfl g() {
        return this.a.h().h(new emwl() { // from class: bzhg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Long.valueOf(((bzgu) obj).e);
            }
        }, erpp.a);
    }

    @Override // defpackage.bzgw
    public final elfl h() {
        return this.a.h().h(new emwl() { // from class: bzgz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(bzhl.n((bzgu) obj));
            }
        }, erpp.a);
    }

    @Override // defpackage.bzgw
    public final elfl i(final boolean z) {
        return this.a.j(new emwl() { // from class: bzhe
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                bzgt bzgtVar = (bzgt) ((bzgu) obj).toBuilder();
                bzgtVar.copyOnWrite();
                bzgu bzguVar = (bzgu) bzgtVar.instance;
                bzguVar.b |= 8;
                bzguVar.f = z;
                return (bzgu) bzgtVar.build();
            }
        }).h(new emwl() { // from class: bzhf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, this.b);
    }

    @Override // defpackage.bzgw
    public final elfl j(final long j) {
        return this.a.j(new emwl() { // from class: bzgx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                bzgt bzgtVar = (bzgt) ((bzgu) obj).toBuilder();
                bzgtVar.copyOnWrite();
                bzgu bzguVar = (bzgu) bzgtVar.instance;
                bzguVar.b |= 4;
                bzguVar.e = j;
                return (bzgu) bzgtVar.build();
            }
        }).h(new emwl() { // from class: bzhc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return null;
            }
        }, this.b);
    }

    @Override // defpackage.bzgw
    public final void k() {
        this.a.m(new emwl() { // from class: bzhk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                bzgt bzgtVar = (bzgt) ((bzgu) obj).toBuilder();
                bzgtVar.copyOnWrite();
                bzgu bzguVar = (bzgu) bzgtVar.instance;
                bzguVar.b &= -3;
                bzguVar.d = bzgu.a.d;
                bzgtVar.copyOnWrite();
                bzgu bzguVar2 = (bzgu) bzgtVar.instance;
                bzguVar2.b |= 1;
                bzguVar2.c = false;
                return (bzgu) bzgtVar.build();
            }
        });
        m();
    }

    @Override // defpackage.bzgw
    public final void l(final String str) {
        this.a.m(new emwl() { // from class: bzhd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                bzgt bzgtVar = (bzgt) ((bzgu) obj).toBuilder();
                bzgtVar.copyOnWrite();
                bzgu bzguVar = (bzgu) bzgtVar.instance;
                String str2 = str;
                str2.getClass();
                bzguVar.b |= 2;
                bzguVar.d = str2;
                bzgtVar.copyOnWrite();
                bzgu bzguVar2 = (bzgu) bzgtVar.instance;
                bzguVar2.b |= 1;
                bzguVar2.c = true;
                return (bzgu) bzgtVar.build();
            }
        });
        m();
    }

    public final void m() {
        this.c.a(elfo.e(null), "DEVICE_PAIRING_SETTINGS_KEY");
    }
}
