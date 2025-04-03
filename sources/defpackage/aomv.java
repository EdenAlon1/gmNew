package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aomv implements aolr {
    public static final /* synthetic */ int i = 0;
    public final ffbr b;
    public final fazb c;
    public final fazb d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final fazb h;
    private final fazb j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;

    public aomv(fazb fazbVar, fazb fazbVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, final ffbr ffbrVar5, final fazb fazbVar3, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, fazb fazbVar4, final ffbr ffbrVar10) {
        ffbr ffbrVar11 = new ffbr() { // from class: aols
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                int i2 = aomv.i;
                return true;
            }
        };
        this.d = fazbVar;
        this.c = fazbVar2;
        this.e = new alxb(ffbrVar11, ffbrVar);
        this.b = new alxb(ffbrVar11, ffbrVar2);
        this.f = new alxb(ffbrVar11, ffbrVar3);
        this.g = ffbrVar4;
        this.j = new fazb() { // from class: aomd
            @Override // defpackage.fazb
            public final Object b() {
                int i2 = aomv.i;
                return ((aukc) ffbr.this.b()).a() ? (aobh) fazbVar3.b() : (aobh) ffbrVar5.b();
            }
        };
        this.k = new alxb(ffbrVar11, ffbrVar6);
        this.l = new alxb(ffbrVar11, ffbrVar7);
        this.m = new alxb(ffbrVar11, ffbrVar8);
        this.n = new alxb(ffbrVar11, ffbrVar9);
        this.h = fazbVar4;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aobh, java.lang.Object] */
    private final aoku B(ParticipantsTable.BindData bindData, String str) {
        ?? b = this.j.b();
        String W = bindData.W();
        String U = bindData.U();
        String P = bindData.P();
        int o = bindData.o();
        return b.e(W, U, P, o == 1, str, new emyl() { // from class: aome
            @Override // defpackage.emyl
            public final Object get() {
                return ((ctvb) aomv.this.c.b()).r();
            }
        });
    }

    @Override // defpackage.aolr
    public final Optional A(ParticipantsTable.BindData bindData) {
        return bdrw.c(aodp.u(bindData.W(), bindData.U())) ? Optional.empty() : Optional.of(B(bindData, bindData.U()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku a(String str) {
        return this.j.b().a(str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku b(awui awuiVar) {
        return this.j.b().b(awuiVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku c(String str, emyl emylVar) {
        return this.j.b().c(str, emylVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku d(djrj djrjVar) {
        return this.j.b().d(djrjVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku e(String str, String str2, String str3, boolean z, String str4, emyl emylVar) {
        return this.j.b().e(str, str2, str3, z, str4, emylVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku f() {
        return this.j.b().f();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku g(aoku aokuVar, emyl emylVar) {
        return this.j.b().g(aokuVar, emylVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku h(aoku aokuVar, String str) {
        return this.j.b().h(aokuVar, str);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku i(aoku aokuVar, boolean z) {
        return this.j.b().i(aokuVar, z);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku j(aoku aokuVar, int i2) {
        return this.j.b().j(aokuVar, i2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aobh
    public final aoku k(aoku aokuVar) {
        return this.j.b().k(aokuVar);
    }

    @Override // defpackage.aolr
    public final aoku l() {
        return ((aokt) this.l.b()).c(new emyl() { // from class: aomp
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aomv.i;
                return "EMERGENCY+SERVICE+PROVIDER";
            }
        }, new emyl() { // from class: aomq
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aomv.i;
                return "EMERGENCY+SERVICE+PROVIDER";
            }
        }, new emyl() { // from class: aomr
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aomv.i;
                return Optional.of("EMERGENCY+SERVICE+PROVIDER");
            }
        }, new emyl() { // from class: aoms
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aomv.i;
                return "EMERGENCY+SERVICE+PROVIDER";
            }
        }, new emyl() { // from class: aomt
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aomv.i;
                return "EMERGENCY+SERVICE+PROVIDER";
            }
        }, new aomo(), new emyl() { // from class: aomu
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aomv.i;
                return new aokr("EMERGENCY+SERVICE+PROVIDER");
            }
        }, new emyl() { // from class: aolt
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aomv.i;
                return aoqz.SATELLITE_ESP;
            }
        }, new aomo(), new aomo());
    }

    @Override // defpackage.aolr
    public final aoku m() {
        return ((aokt) this.l.b()).c(new emyl() { // from class: aolu
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aomv.i;
                return "EMERGENCY+SERVICE+PROVIDER+DEMO";
            }
        }, new emyl() { // from class: aolv
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aomv.i;
                return "EMERGENCY+SERVICE+PROVIDER+DEMO";
            }
        }, new emyl() { // from class: aolw
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aomv.i;
                return Optional.of("EMERGENCY+SERVICE+PROVIDER+DEMO");
            }
        }, new emyl() { // from class: aolx
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aomv.i;
                return "EMERGENCY+SERVICE+PROVIDER+DEMO";
            }
        }, new emyl() { // from class: aoly
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aomv.i;
                return "EMERGENCY+SERVICE+PROVIDER+DEMO";
            }
        }, new aomo(), new emyl() { // from class: aolz
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aomv.i;
                return new aokr("EMERGENCY+SERVICE+PROVIDER+DEMO");
            }
        }, new emyl() { // from class: aoma
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aomv.i;
                return aoqz.SATELLITE_ESP;
            }
        }, new aomo(), new aomo());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aobh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [aobh, java.lang.Object] */
    @Override // defpackage.aolr
    public final aoku n(String str) {
        if (((asvn) this.k.b()).a() && aojl.a(str)) {
            return l();
        }
        if (((asvn) this.k.b()).a() && aojl.b(str)) {
            return m();
        }
        if (((Optional) this.n.b()).isPresent() && ((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && TextUtils.equals(str, ((cjdk) ((Optional) this.n.b()).get()).r())) {
            return v();
        }
        if (dizg.N()) {
            return this.j.b().c(str, new emyl() { // from class: aomb
                @Override // defpackage.emyl
                public final Object get() {
                    return ((ctvb) aomv.this.c.b()).j();
                }
            });
        }
        return this.j.b().c(str, emys.a(new emyl() { // from class: aomc
            @Override // defpackage.emyl
            public final Object get() {
                aomv aomvVar = aomv.this;
                return Optional.of(((ctve) aomvVar.e.b()).b(((ctwb) aomvVar.b.b()).b()));
            }
        }));
    }

    @Override // defpackage.aolr
    public final aoku o(ParticipantsTable.BindData bindData) {
        return B(bindData, bindData.P());
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aolr
    public final aoku p(String str) {
        if (((asvn) this.k.b()).a() && aojl.a(str)) {
            return l();
        }
        if (((asvn) this.k.b()).a() && aojl.b(str)) {
            return m();
        }
        if (((Optional) this.n.b()).isPresent() && ((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && TextUtils.equals(str, ((cjdk) ((Optional) this.n.b()).get()).r())) {
            return v();
        }
        return this.j.b().c(str, emys.a(new emyl() { // from class: aomn
            @Override // defpackage.emyl
            public final Object get() {
                return Optional.of(((ctvb) aomv.this.c.b()).A());
            }
        }));
    }

    @Override // defpackage.aolr
    public final aoku q(ParticipantsTable.BindData bindData) {
        return B(bindData, bindData.U());
    }

    @Override // defpackage.aolr
    public final aoku r(String str) {
        return c(str, new emyl() { // from class: aomh
            @Override // defpackage.emyl
            public final Object get() {
                aomv aomvVar = aomv.this;
                int a = ((ckby) aomvVar.f.b()).a(ckcf.f);
                return Optional.of(((aukb) aomvVar.h.b()).a() ? ((ctwb) aomvVar.b.b()).h(a).s() : ((ctve) aomvVar.e.b()).b(a));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [aobh, java.lang.Object] */
    @Override // defpackage.aolr
    public final aoku s(qmc qmcVar) {
        if (qmcVar instanceof bcqa) {
            cfva cfvaVar = aoqm.a;
            if (((Boolean) new aopc().get()).booleanValue()) {
                return ((bcqa) qmcVar).l;
            }
        }
        if (qmcVar.f >= 0) {
            return n(qmcVar.c);
        }
        if (((astm) this.m.b()).a()) {
            return n(qmcVar.c);
        }
        fazb fazbVar = this.j;
        return fazbVar.b().c(qmcVar.c, new aomo());
    }

    @Override // defpackage.aolr
    public final aoku t(ParticipantsTable.BindData bindData) {
        return B(bindData, bindData.W());
    }

    @Override // defpackage.aolr
    public final aoku u(String str, final int i2) {
        return c(str, new emyl() { // from class: aomg
            @Override // defpackage.emyl
            public final Object get() {
                aomv aomvVar = aomv.this;
                boolean a = ((aukb) aomvVar.h.b()).a();
                int i3 = i2;
                String s = a ? ((ctwb) aomvVar.b.b()).h(i3).s() : ((ctve) aomvVar.e.b()).b(i3);
                return TextUtils.isEmpty(s) ? Optional.empty() : Optional.of(s);
            }
        });
    }

    @Override // defpackage.aolr
    public final aoku v() {
        if (((Optional) this.n.b()).isEmpty()) {
            throw new UnsupportedOperationException("Penpal bot is not supported.");
        }
        final cjdk cjdkVar = (cjdk) ((Optional) this.n.b()).get();
        return ((aokt) this.l.b()).c(new emyl() { // from class: aomi
            @Override // defpackage.emyl
            public final Object get() {
                return cjdk.this.r();
            }
        }, new emyl() { // from class: aomi
            @Override // defpackage.emyl
            public final Object get() {
                return cjdk.this.r();
            }
        }, new emyl() { // from class: aomj
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aomv.i;
                return Optional.of(cjdk.this.r());
            }
        }, new emyl() { // from class: aomi
            @Override // defpackage.emyl
            public final Object get() {
                return cjdk.this.r();
            }
        }, new emyl() { // from class: aomi
            @Override // defpackage.emyl
            public final Object get() {
                return cjdk.this.r();
            }
        }, new emyl() { // from class: aomk
            @Override // defpackage.emyl
            public final Object get() {
                return Optional.of(((avkc) aomv.this.g.b()).a(cjdkVar.r(), false));
            }
        }, new emyl() { // from class: aoml
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aomv.i;
                return new aokr(cjdk.this.r());
            }
        }, new emyl() { // from class: aomm
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aomv.i;
                return aoqz.PENPAL_BOT;
            }
        }, new aomo(), new aomo());
    }

    @Override // defpackage.aolr
    public final aoku w(aoku aokuVar) {
        return h(aokuVar, ((ctvb) this.c.b()).n(emxe.b(aokuVar.n())));
    }

    @Override // defpackage.aolr
    public final aoku x(final aoku aokuVar) {
        emyl emylVar = new emyl() { // from class: aomf
            @Override // defpackage.emyl
            public final Object get() {
                return ((aoqw) aomv.this.d.b()).e(emxe.b(aokuVar.n()));
            }
        };
        return ((Boolean) aodp.c.e()).booleanValue() ? ((aokt) this.l.b()).a(aokuVar, emylVar) : ((aokt) this.l.b()).b(aokuVar, (String) emylVar.get());
    }

    @Override // defpackage.aolr
    public final engw y(List list) {
        engr engrVar = new engr();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            engrVar.h(B(bindData, bindData.U()));
        }
        return engrVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [aobh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [aobh, java.lang.Object] */
    @Override // defpackage.aolr
    public final engw z(avkl avklVar) {
        engr engrVar = new engr();
        if (avklVar.d()) {
            engw c = avklVar.c();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                engrVar.h(this.j.b().b((awui) c.get(i2)));
            }
        } else {
            engrVar.h(this.j.b().b(avklVar.a()));
        }
        return engrVar.g();
    }
}
