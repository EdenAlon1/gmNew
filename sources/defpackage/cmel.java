package defpackage;

import j$.util.Collection;
import j$.util.Comparator;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmel {
    public static final cskc a = cskc.g("Bugle", "RcsApplicationDataService");
    public static final ejui b = new ejtz("phone_number_input_ui_events_data_source_key");
    public static final ejui c = new ejtz("google_tos_ui_events_data_source_key");
    public final comc d;
    public final ffbr e;
    public final ejvo f;
    public final ejvo g;
    private final ejvo h;
    private final ffbr i;
    private final ffbr j;
    private final errl k;

    public cmel(comc comcVar, ffbr ffbrVar, ejvo ejvoVar, ejvo ejvoVar2, ejvo ejvoVar3, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar) {
        this.d = comcVar;
        this.e = ffbrVar;
        this.h = ejvoVar;
        this.f = ejvoVar2;
        this.g = ejvoVar3;
        this.i = ffbrVar2;
        this.j = ffbrVar3;
        this.k = errlVar;
    }

    public static cmbm a(cmbl cmblVar, clzf clzfVar) {
        boolean test;
        boolean test2;
        Predicate predicate = new Predicate() { // from class: cmcy
            public final /* synthetic */ Predicate and(Predicate predicate2) {
                return Predicate$CC.$default$and(this, predicate2);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate2) {
                return Predicate$CC.$default$or(this, predicate2);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int b2;
                clzf clzfVar2 = (clzf) obj;
                cskc cskcVar = cmel.a;
                int b3 = clzd.b(clzfVar2.c);
                return b3 != 0 && b3 == 3 && (b2 = clzb.b(clzfVar2.d)) != 0 && b2 == 3;
            }
        };
        clzf clzfVar2 = (clzf) Collection.EL.stream(DesugarCollections.unmodifiableList(((cmbm) cmblVar.instance).b)).max(Comparator.CC.comparing(new Function() { // from class: cmcz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eyja eyjaVar = ((clzf) obj).e;
                return eyjaVar == null ? eyja.a : eyjaVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new cmcl())).orElse(clzf.a);
        test = predicate.test(clzfVar);
        if (test) {
            test2 = predicate.test(clzfVar2);
            if (test2) {
                a.m("Back to back requests from ProvisioningEngine, updating most recent PhoneNumberInputUIEvent");
                int indexOf = DesugarCollections.unmodifiableList(((cmbm) cmblVar.instance).b).indexOf(clzfVar2);
                cmblVar.copyOnWrite();
                cmbm cmbmVar = (cmbm) cmblVar.instance;
                cmbmVar.a();
                cmbmVar.b.remove(indexOf);
                clza builder = clzfVar2.toBuilder();
                eyja eyjaVar = clzfVar.e;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                builder.copyOnWrite();
                clzf clzfVar3 = (clzf) builder.instance;
                eyjaVar.getClass();
                clzfVar3.e = eyjaVar;
                clzfVar3.b |= 4;
                cmblVar.a(builder.build());
                return (cmbm) cmblVar.build();
            }
        }
        cmblVar.a(clzfVar);
        return (cmbm) cmblVar.build();
    }

    public static engw j(List list, clxy clxyVar) {
        boolean test;
        boolean test2;
        ArrayList arrayList = new ArrayList(list);
        Predicate predicate = new Predicate() { // from class: cmcj
            public final /* synthetic */ Predicate and(Predicate predicate2) {
                return Predicate$CC.$default$and(this, predicate2);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate2) {
                return Predicate$CC.$default$or(this, predicate2);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int a2;
                clxy clxyVar2 = (clxy) obj;
                cskc cskcVar = cmel.a;
                int a3 = clxw.a(clxyVar2.c);
                return a3 != 0 && a3 == 3 && (a2 = clxv.a(clxyVar2.e)) != 0 && a2 == 3;
            }
        };
        clxy clxyVar2 = (clxy) Collection.EL.stream(arrayList).max(Comparator.CC.comparing(new Function() { // from class: cmck
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eyja eyjaVar = ((clxy) obj).f;
                return eyjaVar == null ? eyja.a : eyjaVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new cmcl())).orElse(clxy.a);
        test = predicate.test(clxyVar);
        if (test) {
            test2 = predicate.test(clxyVar2);
            if (test2) {
                a.m("Back to back requests from ProvisioningEngine, updating most recent GoogleTosUiEvent");
                arrayList.remove(clxyVar2);
                clxu clxuVar = (clxu) clxyVar2.toBuilder();
                eyja eyjaVar = clxyVar.f;
                if (eyjaVar == null) {
                    eyjaVar = eyja.a;
                }
                clxuVar.copyOnWrite();
                clxy clxyVar3 = (clxy) clxuVar.instance;
                eyjaVar.getClass();
                clxyVar3.f = eyjaVar;
                clxyVar3.b |= 8;
                arrayList.add((clxy) clxuVar.build());
                return engw.n(arrayList);
            }
        }
        arrayList.add(clxyVar);
        return engw.n(arrayList);
    }

    public final cmes b(String str) {
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(new eygq(((cmbx) this.d.l()).s, cmbx.u));
        if (unmodifiableMap.containsKey(str)) {
            return (cmes) unmodifiableMap.get(str);
        }
        int d = ((ctyw) this.i.b()).a(-1).d("buglesub_rcs_provision_info_state", -1);
        ffbr ffbrVar = this.j;
        cmes cmesVar = cmes.RCS_SUCCESS_NOTIFICATION_STATE_UNSPECIFIED;
        if (((cort) ffbrVar.b()).a().f.equals(str)) {
            if (d == 2) {
                cmesVar = cmes.RCS_SUCCESS_NOTIFICATION_STATE_SUCCESS_AWAITING_NOTIFY;
            } else if (d == 4) {
                cmesVar = cmes.RCS_SUCCESS_NOTIFICATION_STATE_NOTIFIED;
            }
        }
        k(str, cmesVar);
        return cmesVar;
    }

    public final elfl c(final String str, final clzf clzfVar) {
        elfl j = this.d.j(new emwl() { // from class: cmeh
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cmbx cmbxVar = (cmbx) obj;
                cskc cskcVar = cmel.a;
                cmbf cmbfVar = (cmbf) cmbxVar.toBuilder();
                String str2 = str;
                cmbm cmbmVar = cmbm.a;
                str2.getClass();
                eyhm eyhmVar = cmbxVar.g;
                if (eyhmVar.containsKey(str2)) {
                    cmbmVar = (cmbm) eyhmVar.get(str2);
                }
                cmbm a2 = cmel.a((cmbl) cmbmVar.toBuilder(), clzfVar);
                str2.getClass();
                a2.getClass();
                cmbfVar.copyOnWrite();
                cmbx cmbxVar2 = (cmbx) cmbfVar.instance;
                eyhm eyhmVar2 = cmbxVar2.g;
                if (!eyhmVar2.b) {
                    cmbxVar2.g = eyhmVar2.a();
                }
                cmbxVar2.g.put(str2, a2);
                return (cmbx) cmbfVar.build();
            }
        });
        ejtv ejtvVar = new ejtv();
        ejtvVar.b(j);
        ejtvVar.a = new emwl() { // from class: cmei
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cmel.a;
                return cmel.a((cmbl) cmbm.a.createBuilder((cmbm) obj), clzf.this);
            }
        };
        ejtvVar.c(b);
        return elfl.g(this.h.a(ejtvVar.a())).h(new emwl() { // from class: cmej
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cmel.a;
                return null;
            }
        }, erpp.a);
    }

    public final elfl d() {
        return e().h(new emwl() { // from class: cmdh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cmel.a;
                return engw.n(((cmbx) obj).p);
            }
        }, this.k);
    }

    public final elfl e() {
        return this.d.h().e(cmby.class, new emwl() { // from class: cmcw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cmel.a.s("Failed to read RcsApplicationData", (cmby) obj);
                ((akzt) cmel.this.e.b()).c("Bugle.Rcs.Application.Data.Retrieval.Failure.Count");
                return cmbx.a;
            }
        }, this.k);
    }

    public final elfl f(final String str) {
        return e().h(new emwl() { // from class: cmdu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cmel.a;
                return (String) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((cmbx) obj).r), str, "Default");
            }
        }, erpp.a);
    }

    public final elfl g(final String str, final cmay cmayVar) {
        elfl j = this.d.j(new emwl() { // from class: cmdl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cmel.a;
                cmbf cmbfVar = (cmbf) ((cmbx) obj).toBuilder();
                cmay cmayVar2 = cmayVar;
                cmayVar2.getClass();
                cmbfVar.copyOnWrite();
                cmbx cmbxVar = (cmbx) cmbfVar.instance;
                eyhm eyhmVar = cmbxVar.h;
                if (!eyhmVar.b) {
                    cmbxVar.h = eyhmVar.a();
                }
                cmbxVar.h.put(dksc.g("phone_number_record_for_sim_", str), cmayVar2);
                return (cmbx) cmbfVar.build();
            }
        });
        ejtv ejtvVar = new ejtv();
        ejtvVar.b(j);
        ejtvVar.c("phone_number_record_data_source_key");
        return elfl.g(this.f.a(ejtvVar.a())).h(new emwl() { // from class: cmdm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cmel.a;
                return null;
            }
        }, erpp.a);
    }

    public final elfl h(final String str, final cmbc cmbcVar) {
        return this.d.j(new emwl() { // from class: cmch
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cmel.a;
                cmbf cmbfVar = (cmbf) ((cmbx) obj).toBuilder();
                String str2 = str;
                str2.getClass();
                cmbc cmbcVar2 = cmbcVar;
                cmbcVar2.getClass();
                cmbfVar.copyOnWrite();
                cmbx cmbxVar = (cmbx) cmbfVar.instance;
                eyhm eyhmVar = cmbxVar.l;
                if (!eyhmVar.b) {
                    cmbxVar.l = eyhmVar.a();
                }
                cmbxVar.l.put(str2, cmbcVar2);
                return (cmbx) cmbfVar.build();
            }
        }).h(new emwl() { // from class: cmci
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cmel.a;
                return null;
            }
        }, erpp.a);
    }

    public final elfl i(final String str, final int i) {
        return this.d.j(new emwl() { // from class: cmdy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cmel.a;
                cmbf cmbfVar = (cmbf) ((cmbx) obj).toBuilder();
                String str2 = str;
                str2.getClass();
                cmbfVar.copyOnWrite();
                cmbx cmbxVar = (cmbx) cmbfVar.instance;
                eyhm eyhmVar = cmbxVar.j;
                if (!eyhmVar.b) {
                    cmbxVar.j = eyhmVar.a();
                }
                cmbxVar.j.put(str2, Integer.valueOf(i));
                return (cmbx) cmbfVar.build();
            }
        }).h(new emwl() { // from class: cmdz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cmel.a;
                return null;
            }
        }, erpp.a);
    }

    public final void k(final String str, final cmes cmesVar) {
        this.d.m(new emwl() { // from class: cmcr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cmel.a;
                cmbf cmbfVar = (cmbf) ((cmbx) obj).toBuilder();
                String str2 = str;
                str2.getClass();
                cmes cmesVar2 = cmesVar;
                cmesVar2.getClass();
                cmbfVar.copyOnWrite();
                cmbx cmbxVar = (cmbx) cmbfVar.instance;
                eyhm eyhmVar = cmbxVar.s;
                if (!eyhmVar.b) {
                    cmbxVar.s = eyhmVar.a();
                }
                new eygq(cmbxVar.s, cmbx.u).put(str2, cmesVar2);
                return (cmbx) cmbfVar.build();
            }
        });
    }

    public final void l(final String str, final String str2) {
        this.d.m(new emwl() { // from class: cmca
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cmel.a;
                cmbf cmbfVar = (cmbf) ((cmbx) obj).toBuilder();
                String str3 = str;
                str3.getClass();
                String str4 = str2;
                str4.getClass();
                cmbfVar.copyOnWrite();
                cmbx cmbxVar = (cmbx) cmbfVar.instance;
                eyhm eyhmVar = cmbxVar.r;
                if (!eyhmVar.b) {
                    cmbxVar.r = eyhmVar.a();
                }
                cmbxVar.r.put(str3, str4);
                return (cmbx) cmbfVar.build();
            }
        });
    }

    public final elfl m(final String str, final int i) {
        return this.d.j(new emwl() { // from class: cmds
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cmel.a;
                cmbf cmbfVar = (cmbf) ((cmbx) obj).toBuilder();
                cmen cmenVar = (cmen) cmeo.a.createBuilder();
                cmenVar.copyOnWrite();
                ((cmeo) cmenVar.instance).b = i - 2;
                cmeo cmeoVar = (cmeo) cmenVar.build();
                String str2 = str;
                str2.getClass();
                cmeoVar.getClass();
                cmbfVar.copyOnWrite();
                cmbx cmbxVar = (cmbx) cmbfVar.instance;
                eyhm eyhmVar = cmbxVar.n;
                if (!eyhmVar.b) {
                    cmbxVar.n = eyhmVar.a();
                }
                cmbxVar.n.put(str2, cmeoVar);
                return (cmbx) cmbfVar.build();
            }
        }).h(new emwl() { // from class: cmdt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = cmel.a;
                return null;
            }
        }, erpp.a);
    }
}
