package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aonz implements aolr {
    public static final /* synthetic */ int i = 0;
    public final fazb b;
    public final fazb c;
    public final fazb d;
    public final fazb e;
    public final fazb f;
    public final fazb g;
    public final fazb h;
    private final fazb j;
    private final fazb k;
    private final fazb l;
    private final fazb m;

    public aonz(fazb fazbVar, fazb fazbVar2, fazb fazbVar3, fazb fazbVar4, fazb fazbVar5, fazb fazbVar6, fazb fazbVar7, fazb fazbVar8, fazb fazbVar9, fazb fazbVar10, fazb fazbVar11) {
        this.d = fazbVar;
        this.c = fazbVar2;
        this.j = fazbVar3;
        this.e = fazbVar4;
        this.b = fazbVar5;
        this.f = fazbVar6;
        this.g = fazbVar7;
        this.k = fazbVar8;
        this.l = fazbVar9;
        this.m = fazbVar10;
        this.h = fazbVar11;
    }

    private final aoku B(ParticipantsTable.BindData bindData, String str) {
        aoih aoihVar = (aoih) this.k.b();
        String W = bindData.W();
        String U = bindData.U();
        String P = bindData.P();
        int o = bindData.o();
        return aoihVar.e(W, U, P, o == 1, str, new emyl() { // from class: aonj
            @Override // defpackage.emyl
            public final Object get() {
                return ((ctvb) aonz.this.c.b()).r();
            }
        });
    }

    @Override // defpackage.aolr
    public final Optional A(ParticipantsTable.BindData bindData) {
        return bdrw.c(aoih.t(bindData.W(), bindData.U())) ? Optional.empty() : Optional.of(B(bindData, bindData.U()));
    }

    @Override // defpackage.aobh
    public final aoku a(String str) {
        return ((aoih) this.k.b()).a(str);
    }

    @Override // defpackage.aobh
    public final aoku b(awui awuiVar) {
        return ((aoih) this.k.b()).b(awuiVar);
    }

    @Override // defpackage.aobh
    public final aoku c(String str, emyl emylVar) {
        return ((aoih) this.k.b()).c(emxe.b(str), emylVar);
    }

    @Override // defpackage.aobh
    public final aoku d(djrj djrjVar) {
        return ((aoih) this.k.b()).d(djrjVar);
    }

    @Override // defpackage.aobh
    public final aoku e(String str, String str2, String str3, boolean z, String str4, emyl emylVar) {
        return ((aoih) this.k.b()).e(str, str2, str3, z, str4, emylVar);
    }

    @Override // defpackage.aobh
    public final aoku f() {
        return ((aoih) this.k.b()).f();
    }

    @Override // defpackage.aobh
    public final aoku g(aoku aokuVar, emyl emylVar) {
        return ((aoih) this.k.b()).g(aokuVar, emylVar);
    }

    @Override // defpackage.aobh
    public final aoku h(aoku aokuVar, final String str) {
        return g(aokuVar, new emyl() { // from class: aoni
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aonz.i;
                return str;
            }
        });
    }

    @Override // defpackage.aobh
    public final aoku i(aoku aokuVar, boolean z) {
        return ((aoih) this.k.b()).i(aokuVar, z);
    }

    @Override // defpackage.aobh
    public final aoku j(aoku aokuVar, int i2) {
        return ((aoih) this.k.b()).j(aokuVar, i2);
    }

    @Override // defpackage.aobh
    public final aoku k(aoku aokuVar) {
        return ((aoih) this.k.b()).k(aokuVar);
    }

    @Override // defpackage.aolr
    public final aoku l() {
        return ((aokt) this.m.b()).c(new emyl() { // from class: aona
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aonz.i;
                return "EMERGENCY+SERVICE+PROVIDER";
            }
        }, new emyl() { // from class: aonb
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aonz.i;
                return "EMERGENCY+SERVICE+PROVIDER";
            }
        }, new emyl() { // from class: aonc
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aonz.i;
                return Optional.of("EMERGENCY+SERVICE+PROVIDER");
            }
        }, new emyl() { // from class: aond
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aonz.i;
                return "EMERGENCY+SERVICE+PROVIDER";
            }
        }, new emyl() { // from class: aone
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aonz.i;
                return "EMERGENCY+SERVICE+PROVIDER";
            }
        }, new aonr(), new emyl() { // from class: aonf
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aonz.i;
                return new aokr("EMERGENCY+SERVICE+PROVIDER");
            }
        }, new emyl() { // from class: aong
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aonz.i;
                return aoqz.SATELLITE_ESP;
            }
        }, new aonr(), new aonr());
    }

    @Override // defpackage.aolr
    public final aoku m() {
        return ((aokt) this.m.b()).c(new emyl() { // from class: aonk
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aonz.i;
                return "EMERGENCY+SERVICE+PROVIDER+DEMO";
            }
        }, new emyl() { // from class: aonl
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aonz.i;
                return "EMERGENCY+SERVICE+PROVIDER+DEMO";
            }
        }, new emyl() { // from class: aonm
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aonz.i;
                return Optional.of("EMERGENCY+SERVICE+PROVIDER+DEMO");
            }
        }, new emyl() { // from class: aonn
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aonz.i;
                return "EMERGENCY+SERVICE+PROVIDER+DEMO";
            }
        }, new emyl() { // from class: aono
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aonz.i;
                return "EMERGENCY+SERVICE+PROVIDER+DEMO";
            }
        }, new aonr(), new emyl() { // from class: aonp
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aonz.i;
                return new aokr("EMERGENCY+SERVICE+PROVIDER+DEMO");
            }
        }, new emyl() { // from class: aonq
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aonz.i;
                return aoqz.SATELLITE_ESP;
            }
        }, new aonr(), new aonr());
    }

    @Override // defpackage.aolr
    public final aoku n(String str) {
        if (((asvn) this.l.b()).a() && aojl.a(str)) {
            return l();
        }
        if (((asvn) this.l.b()).a() && aojl.b(str)) {
            return m();
        }
        if (((Optional) this.j.b()).isPresent() && ((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && TextUtils.equals(str, ((cjdk) ((Optional) this.j.b()).get()).r())) {
            return v();
        }
        if (dizg.N()) {
            return ((aoih) this.k.b()).c(str, new emyl() { // from class: aons
                @Override // defpackage.emyl
                public final Object get() {
                    return ((ctvb) aonz.this.c.b()).j();
                }
            });
        }
        return ((aoih) this.k.b()).c(str, emys.a(new emyl() { // from class: aont
            @Override // defpackage.emyl
            public final Object get() {
                aonz aonzVar = aonz.this;
                return Optional.of(((ctve) aonzVar.e.b()).b(((ctwb) aonzVar.b.b()).b()));
            }
        }));
    }

    @Override // defpackage.aolr
    public final aoku o(ParticipantsTable.BindData bindData) {
        return B(bindData, bindData.P());
    }

    @Override // defpackage.aolr
    public final aoku p(String str) {
        if (((asvn) this.l.b()).a() && aojl.a(str)) {
            return l();
        }
        if (((asvn) this.l.b()).a() && aojl.b(str)) {
            return m();
        }
        if (((Optional) this.j.b()).isPresent() && TextUtils.equals(str, ((cjdk) ((Optional) this.j.b()).get()).r())) {
            return v();
        }
        return ((aoih) this.k.b()).c(str, emys.a(new emyl() { // from class: aonu
            @Override // defpackage.emyl
            public final Object get() {
                return Optional.of(((ctvb) aonz.this.c.b()).A());
            }
        }));
    }

    @Override // defpackage.aolr
    public final aoku q(ParticipantsTable.BindData bindData) {
        return B(bindData, bindData.U());
    }

    @Override // defpackage.aolr
    public final aoku r(String str) {
        return ((aoih) this.k.b()).c(str, new emyl() { // from class: aomx
            @Override // defpackage.emyl
            public final Object get() {
                aonz aonzVar = aonz.this;
                int a = ((ckby) aonzVar.f.b()).a(ckcf.g);
                return Optional.of(((aukb) aonzVar.h.b()).a() ? ((ctwb) aonzVar.b.b()).h(a).s() : ((ctve) aonzVar.e.b()).b(a));
            }
        });
    }

    @Override // defpackage.aolr
    public final aoku s(qmc qmcVar) {
        if (qmcVar instanceof bcqa) {
            cfva cfvaVar = aoqm.a;
            if (((Boolean) new aopc().get()).booleanValue()) {
                return ((bcqa) qmcVar).l;
            }
        }
        return qmcVar.f < 0 ? ((aoih) this.k.b()).c(qmcVar.c, new aonr()) : n(qmcVar.c);
    }

    @Override // defpackage.aolr
    public final aoku t(ParticipantsTable.BindData bindData) {
        return B(bindData, bindData.W());
    }

    @Override // defpackage.aolr
    public final aoku u(String str, final int i2) {
        return (((asvn) this.l.b()).a() && aojl.a(str)) ? l() : (((asvn) this.l.b()).a() && aojl.b(str)) ? m() : (((Optional) this.j.b()).isPresent() && ((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() && TextUtils.equals(str, ((cjdk) ((Optional) this.j.b()).get()).r())) ? v() : c(str, new emyl() { // from class: aonv
            @Override // defpackage.emyl
            public final Object get() {
                aonz aonzVar = aonz.this;
                boolean a = ((aukb) aonzVar.h.b()).a();
                int i3 = i2;
                String s = a ? ((ctwb) aonzVar.b.b()).h(i3).s() : ((ctve) aonzVar.e.b()).b(i3);
                return TextUtils.isEmpty(s) ? Optional.empty() : Optional.of(s);
            }
        });
    }

    @Override // defpackage.aolr
    public final aoku v() {
        if (((Optional) this.j.b()).isEmpty()) {
            throw new UnsupportedOperationException("Penpal bot is not supported.");
        }
        final cjdk cjdkVar = (cjdk) ((Optional) this.j.b()).get();
        return ((aokt) this.m.b()).c(new emyl() { // from class: aonw
            @Override // defpackage.emyl
            public final Object get() {
                return cjdk.this.r();
            }
        }, new emyl() { // from class: aonw
            @Override // defpackage.emyl
            public final Object get() {
                return cjdk.this.r();
            }
        }, new emyl() { // from class: aonx
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aonz.i;
                return Optional.of(cjdk.this.r());
            }
        }, new emyl() { // from class: aonw
            @Override // defpackage.emyl
            public final Object get() {
                return cjdk.this.r();
            }
        }, new emyl() { // from class: aonw
            @Override // defpackage.emyl
            public final Object get() {
                return cjdk.this.r();
            }
        }, new emyl() { // from class: aony
            @Override // defpackage.emyl
            public final Object get() {
                return Optional.of(((avkc) aonz.this.g.b()).a(cjdkVar.r(), false));
            }
        }, new emyl() { // from class: aomy
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aonz.i;
                return new aokr(cjdk.this.r());
            }
        }, new emyl() { // from class: aomz
            @Override // defpackage.emyl
            public final Object get() {
                int i2 = aonz.i;
                return aoqz.PENPAL_BOT;
            }
        }, new aonr(), new aonr());
    }

    @Override // defpackage.aolr
    public final aoku w(aoku aokuVar) {
        return h(aokuVar, ((ctvb) this.c.b()).n(emxe.b(aokuVar.n())));
    }

    @Override // defpackage.aolr
    public final aoku x(final aoku aokuVar) {
        emyl emylVar = new emyl() { // from class: aonh
            @Override // defpackage.emyl
            public final Object get() {
                return ((aoqw) aonz.this.d.b()).e(emxe.b(aokuVar.n()));
            }
        };
        return ((Boolean) aodp.c.e()).booleanValue() ? ((aokt) this.m.b()).a(aokuVar, emylVar) : ((aokt) this.m.b()).b(aokuVar, (String) emylVar.get());
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
    @Override // defpackage.aolr
    public final engw z(avkl avklVar) {
        engr engrVar = new engr();
        if (avklVar.d()) {
            engw c = avklVar.c();
            int size = c.size();
            for (int i2 = 0; i2 < size; i2++) {
                engrVar.h(((aoih) this.k.b()).b((awui) c.get(i2)));
            }
        } else {
            engrVar.h(((aoih) this.k.b()).b(avklVar.a()));
        }
        return engrVar.g();
    }
}
