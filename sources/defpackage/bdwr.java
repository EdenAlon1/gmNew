package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.gms.maps.model.LatLng;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdwr {
    public static final emyl a = cfvl.x(180026785, "no_link_preview_fetched_for_untrusted_sender_in_search");
    public static final cskc b = cskc.g("BugleAnnotation", "LinkPreviewUtils");
    public static final long c = TimeUnit.DAYS.toMillis(29);
    public final cqoh d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final akzt k;
    public final chga l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final errl q;
    public final errl r;
    public final Object s = new Object();
    public final emyz t;
    private final ffbr u;

    public bdwr(ffbr ffbrVar, cqoh cqohVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, akzt akztVar, chga chgaVar, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, errl errlVar, errl errlVar2) {
        emzf emzfVar = new emzf();
        emzfVar.f(100L);
        emzfVar.e(2L, TimeUnit.MINUTES);
        this.t = emzfVar.a();
        this.u = ffbrVar;
        this.d = cqohVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
        this.h = ffbrVar5;
        this.i = ffbrVar6;
        this.j = ffbrVar7;
        this.k = akztVar;
        this.l = chgaVar;
        this.m = ffbrVar8;
        this.n = ffbrVar9;
        this.o = ffbrVar10;
        this.p = ffbrVar11;
        this.q = errlVar;
        this.r = errlVar2;
    }

    public static boolean e(fbdl fbdlVar) {
        return (fbdlVar.c.isEmpty() && fbdlVar.d.isEmpty() && fbdlVar.g.isEmpty() && fbdlVar.e.isEmpty() && fbdlVar.f.isEmpty()) ? false : true;
    }

    public static int h(String str) {
        return TextUtils.isEmpty(str) ? 3 : 4;
    }

    public final elfl a(final String str, final MessageIdType messageIdType) {
        String valueOf = String.valueOf(String.valueOf(messageIdType));
        Object obj = this.s;
        final String concat = String.valueOf(str).concat(valueOf);
        synchronized (obj) {
            elfl elflVar = (elfl) this.t.b(concat);
            if (elflVar != null) {
                return elflVar;
            }
            final elfl h = elfo.h(new erog() { // from class: bdvz
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    elfl c2;
                    bdwr bdwrVar = bdwr.this;
                    if (!cufg.a() ? ((culz) bdwrVar.n.b()).e() : ((culw) bdwrVar.o.b()).e()) {
                        return elfo.e(Optional.empty());
                    }
                    cuha cuhaVar = (cuha) bdwrVar.p.b();
                    c2 = axol.c(cuhaVar.c, ffhe.a, ffsm.a, new cugy(cuhaVar, null));
                    return c2.h(new emwl() { // from class: bdvx
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return Optional.of((String) obj2);
                        }
                    }, bdwrVar.r);
                }
            }, this.q);
            final elfl g = elfo.g(new Callable() { // from class: bdwc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    bdwr bdwrVar = bdwr.this;
                    MessageCoreData v = ((bdmq) bdwrVar.h.b()).v(messageIdType);
                    cuku cukuVar = new cuku();
                    String a2 = ((cuma) bdwrVar.m.b()).a();
                    if (a2 == null) {
                        throw new NullPointerException("Null countryCode");
                    }
                    cukuVar.a = a2;
                    cukuVar.b = ((cuma) bdwrVar.m.b()).b();
                    cukuVar.b(cula.b);
                    if (v == null) {
                        return cukuVar.a();
                    }
                    ParticipantsTable.BindData b2 = ((bdrr) bdwrVar.i.b()).b(v.aA());
                    if (b2 == null) {
                        return cukuVar.a();
                    }
                    if (bdtd.m(b2)) {
                        cukuVar.b(cula.a);
                        return cukuVar.a();
                    }
                    cukuVar.b(cuma.c(v.z(), TextUtils.isEmpty(b2.T())));
                    return cukuVar.a();
                }
            }, this.q);
            elfl h2 = elfo.m(h, g).b(new erog() { // from class: bdwa
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    elfl elflVar2 = g;
                    bdwr bdwrVar = bdwr.this;
                    fcfn a2 = bdwrVar.l.a("Bugle");
                    culc culcVar = (culc) erqt.q(elflVar2);
                    fbdg fbdgVar = (fbdg) fbdh.a.createBuilder();
                    fbdgVar.copyOnWrite();
                    fbdh fbdhVar = (fbdh) fbdgVar.instance;
                    fcfo fcfoVar = (fcfo) a2.build();
                    fcfoVar.getClass();
                    fbdhVar.c = fcfoVar;
                    fbdhVar.b |= 1;
                    fbdgVar.copyOnWrite();
                    ((fbdh) fbdgVar.instance).d = 1;
                    fbde fbdeVar = (fbde) fbdf.a.createBuilder();
                    fbdeVar.copyOnWrite();
                    fbdf fbdfVar = (fbdf) fbdeVar.instance;
                    String str2 = str;
                    str2.getClass();
                    fbdfVar.b = 1;
                    fbdfVar.c = str2;
                    fbdgVar.copyOnWrite();
                    fbdh fbdhVar2 = (fbdh) fbdgVar.instance;
                    fbdf fbdfVar2 = (fbdf) fbdeVar.build();
                    fbdfVar2.getClass();
                    fbdhVar2.e = fbdfVar2;
                    fbdhVar2.b |= 2;
                    fbdgVar.copyOnWrite();
                    ((fbdh) fbdgVar.instance).f = fbdb.a(4);
                    fbdgVar.copyOnWrite();
                    ((fbdh) fbdgVar.instance).g = true;
                    String c2 = culcVar.c();
                    fbdgVar.copyOnWrite();
                    ((fbdh) fbdgVar.instance).j = c2;
                    String b2 = culcVar.b();
                    fbdgVar.copyOnWrite();
                    ((fbdh) fbdgVar.instance).i = b2;
                    float a3 = culcVar.a().a();
                    fbdgVar.copyOnWrite();
                    ((fbdh) fbdgVar.instance).h = a3;
                    Optional optional = (Optional) erqt.q(h);
                    if (optional.isPresent()) {
                        fcft fcftVar = (fcft) fcfw.a.createBuilder();
                        fcfu fcfuVar = (fcfu) fcfv.a.createBuilder();
                        eyee y = eyee.y((String) optional.get(), StandardCharsets.US_ASCII);
                        fcfuVar.copyOnWrite();
                        ((fcfv) fcfuVar.instance).b = y;
                        int intValue = ((Integer) cuha.a.e()).intValue();
                        fcfuVar.copyOnWrite();
                        ((fcfv) fcfuVar.instance).c = intValue;
                        fcftVar.copyOnWrite();
                        fcfw fcfwVar = (fcfw) fcftVar.instance;
                        fcfv fcfvVar = (fcfv) fcfuVar.build();
                        fcfvVar.getClass();
                        fcfwVar.c = fcfvVar;
                        fcfwVar.b = 1 | fcfwVar.b;
                        fbdgVar.copyOnWrite();
                        fbdh fbdhVar3 = (fbdh) fbdgVar.instance;
                        fcfw fcfwVar2 = (fcfw) fcftVar.build();
                        fcfwVar2.getClass();
                        fbdhVar3.k = fcfwVar2;
                        fbdhVar3.b |= 4;
                    }
                    crma crmaVar = (crma) bdwrVar.f.b();
                    fbdh fbdhVar4 = (fbdh) fbdgVar.build();
                    long intValue2 = ((Integer) ahnz.a.e()).intValue();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    fbqm a4 = crmaVar.a();
                    if (a4 == null) {
                        return elfo.d(new Exception("Cannot initialize smart messaging stub."));
                    }
                    crma.a.p("RPC: Fetching link preview");
                    return elfl.g(((fbqm) a4.j(intValue2, timeUnit)).b(fbdhVar4));
                }
            }, this.r).h(new emwl() { // from class: bdwd
                @Override // defpackage.emwl
                public final Object apply(Object obj2) {
                    emyl emylVar = bdwr.a;
                    fbdd fbddVar = ((fbdj) obj2).b;
                    if (fbddVar == null) {
                        fbddVar = fbdd.a;
                    }
                    return fbddVar.b == 1 ? (fbdl) fbddVar.c : fbdl.a;
                }
            }, erpp.a);
            this.t.d(concat, h2);
            h2.k(new csvw(new Consumer() { // from class: bdwe
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    boolean e = bdwr.e((fbdl) obj2);
                    String str2 = concat;
                    if (e) {
                        return;
                    }
                    bdwr bdwrVar = bdwr.this;
                    synchronized (bdwrVar.s) {
                        bdwrVar.t.c(str2);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Consumer() { // from class: bdwf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    String str2 = concat;
                    bdwr bdwrVar = bdwr.this;
                    synchronized (bdwrVar.s) {
                        bdwrVar.t.c(str2);
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), erpp.a);
            return h2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0.e <= r4.d.f().toEpochMilli()) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.elfl b(defpackage.fbue r5, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r6, final defpackage.fbud r7) {
        /*
            r4 = this;
            MessageType extends eyfy<MessageType, BuilderType> r0 = r7.instance
            fbue r0 = (defpackage.fbue) r0
            int r1 = r0.b
            r1 = r1 & 2
            if (r1 == 0) goto L20
            fbug r0 = r0.e
            if (r0 != 0) goto L10
            fbug r0 = defpackage.fbug.a
        L10:
            cqoh r1 = r4.d
            long r2 = r0.e
            j$.time.Instant r0 = r1.f()
            long r0 = r0.toEpochMilli()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L3a
        L20:
            java.lang.String r5 = r5.c     // Catch: java.lang.RuntimeException -> L32
            elfl r5 = r4.a(r5, r6)     // Catch: java.lang.RuntimeException -> L32
            bdwb r6 = new bdwb     // Catch: java.lang.RuntimeException -> L32
            r6.<init>()     // Catch: java.lang.RuntimeException -> L32
            errl r7 = r4.r     // Catch: java.lang.RuntimeException -> L32
            elfl r5 = r5.h(r6, r7)     // Catch: java.lang.RuntimeException -> L32
            return r5
        L32:
            r5 = move-exception
            cskc r6 = defpackage.bdwr.b
            java.lang.String r7 = "Couldn't fetch link preview."
            r6.s(r7, r5)
        L3a:
            r5 = 0
            elfl r5 = defpackage.elfo.e(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdwr.b(fbue, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, fbud):elfl");
    }

    public final elfl c(final fbud fbudVar) {
        return (((fbue) fbudVar.instance).b & 1) != 0 ? elfo.e(null) : ((crnc) this.e.b()).c(((fbue) fbudVar.instance).c).i(new eroh() { // from class: bdwg
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final fbud fbudVar2 = fbudVar;
                fbrx fbrxVar = (fbrx) obj;
                if (fbrxVar != null) {
                    fbudVar2.copyOnWrite();
                    fbue fbueVar = (fbue) fbudVar2.instance;
                    fbue fbueVar2 = fbue.a;
                    fbueVar.d = fbrxVar;
                    fbueVar.b |= 1;
                } else {
                    fbue fbueVar3 = (fbue) fbudVar2.instance;
                    if ((fbueVar3.b & 2) != 0) {
                        fbug fbugVar = fbueVar3.e;
                        if (fbugVar == null) {
                            fbugVar = fbug.a;
                        }
                        if (!fbugVar.c.isEmpty()) {
                            fbue fbueVar4 = (fbue) fbudVar2.instance;
                            fbug fbugVar2 = fbueVar4.e;
                            if (fbugVar2 == null) {
                                fbugVar2 = fbug.a;
                            }
                            if (!fbugVar2.c.equals(fbueVar4.c)) {
                                bdwr bdwrVar = bdwr.this;
                                crnc crncVar = (crnc) bdwrVar.e.b();
                                fbug fbugVar3 = ((fbue) fbudVar2.instance).e;
                                if (fbugVar3 == null) {
                                    fbugVar3 = fbug.a;
                                }
                                return crncVar.c(fbugVar3.c).h(new emwl() { // from class: bdvw
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        fbrx fbrxVar2 = (fbrx) obj2;
                                        emyl emylVar = bdwr.a;
                                        if (fbrxVar2 == null) {
                                            return null;
                                        }
                                        fbud fbudVar3 = fbud.this;
                                        fbudVar3.copyOnWrite();
                                        fbue fbueVar5 = (fbue) fbudVar3.instance;
                                        fbue fbueVar6 = fbue.a;
                                        fbueVar5.d = fbrxVar2;
                                        fbueVar5.b |= 1;
                                        return null;
                                    }
                                }, bdwrVar.r);
                            }
                        }
                    }
                }
                return elfo.e(null);
            }
        }, this.r);
    }

    public final elfl d(final fbud fbudVar) {
        ListenableFuture i;
        elfl g;
        if ((((fbue) fbudVar.instance).b & 1) == 0) {
            return elfo.e(null);
        }
        final ctyn ctynVar = (ctyn) ((Optional) this.u.b()).get();
        final fbrx fbrxVar = ((fbue) fbudVar.instance).d;
        if (fbrxVar == null) {
            fbrxVar = fbrx.a;
        }
        int i2 = fbrxVar.b;
        if ((i2 & 2) != 0) {
            i = erqt.i(fbrxVar);
        } else {
            if ((i2 & 4) != 0) {
                fbvl fbvlVar = fbrxVar.e;
                if (fbvlVar == null) {
                    fbvlVar = fbvl.a;
                }
                if (!fbvlVar.c.isEmpty()) {
                    fbvl fbvlVar2 = fbrxVar.e;
                    if (fbvlVar2 == null) {
                        fbvlVar2 = fbvl.a;
                    }
                    g = ctynVar.a(fbvlVar2.c);
                    g.getClass();
                    i = erny.g(g, eldl.d(new eroh() { // from class: ctym
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            elfl e;
                            elfl h;
                            Optional optional = (Optional) obj;
                            boolean isEmpty = optional.isEmpty();
                            final fbrx fbrxVar2 = fbrxVar;
                            if (isEmpty) {
                                return elfo.e(fbrxVar2);
                            }
                            final edqc edqcVar = (edqc) optional.get();
                            final fbrw fbrwVar = (fbrw) fbrxVar2.toBuilder();
                            fbvi fbviVar = (fbvi) fbvj.a.createBuilder();
                            if (!emxe.c(edqcVar.ac())) {
                                String ac = edqcVar.ac();
                                fbviVar.copyOnWrite();
                                fbvj fbvjVar = (fbvj) fbviVar.instance;
                                ac.getClass();
                                fbvjVar.c = ac;
                            }
                            String V = edqcVar.V();
                            if (V != null) {
                                fbviVar.copyOnWrite();
                                ((fbvj) fbviVar.instance).d = V;
                            }
                            LatLng d = edqcVar.d();
                            if (d != null) {
                                faut fautVar = (faut) fauu.a.createBuilder();
                                fautVar.copyOnWrite();
                                ((fauu) fautVar.instance).b = d.a;
                                fautVar.copyOnWrite();
                                ((fauu) fautVar.instance).c = d.b;
                                fbviVar.copyOnWrite();
                                fbvj fbvjVar2 = (fbvj) fbviVar.instance;
                                fauu fauuVar = (fauu) fautVar.build();
                                fauuVar.getClass();
                                fbvjVar2.f = fauuVar;
                                fbvjVar2.b |= 1;
                            }
                            Double N = edqcVar.N();
                            if (N != null) {
                                float floatValue = N.floatValue();
                                fbviVar.copyOnWrite();
                                ((fbvj) fbviVar.instance).e = floatValue;
                            }
                            List aq = edqcVar.aq();
                            if (aq != null) {
                                fbviVar.copyOnWrite();
                                fbvj fbvjVar3 = (fbvj) fbviVar.instance;
                                eygr eygrVar = fbvjVar3.g;
                                if (!eygrVar.c()) {
                                    fbvjVar3.g = eyfy.mutableCopy(eygrVar);
                                }
                                eydl.addAll(aq, fbvjVar3.g);
                            }
                            fbvj fbvjVar4 = (fbvj) fbviVar.build();
                            if (fbvjVar4 != null) {
                                fbrwVar.copyOnWrite();
                                fbrx fbrxVar3 = (fbrx) fbrwVar.instance;
                                fbrxVar3.d = fbvjVar4;
                                fbrxVar3.b |= 2;
                            }
                            ctyn ctynVar2 = ctyn.this;
                            if ((fbrxVar2.b & 1) != 0) {
                                h = elfo.e(null);
                            } else {
                                if (ctynVar2.a != null) {
                                    String Z = edqcVar.Z();
                                    e = TextUtils.isEmpty(Z) ? elfo.e(null) : ((crnc) ctynVar2.a.b()).b(Z).h(new emwl() { // from class: ctyi
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            fbuk fbukVar = (fbuk) obj2;
                                            if (fbukVar != null && fbukVar.c == 7) {
                                                fbrx fbrxVar4 = (fbrx) fbukVar.d;
                                                if ((fbrxVar4.b & 1) != 0) {
                                                    fbvn fbvnVar = fbrxVar4.c;
                                                    return fbvnVar == null ? fbvn.a : fbvnVar;
                                                }
                                            }
                                            return null;
                                        }
                                    }, ctynVar2.c);
                                } else {
                                    e = elfo.e(null);
                                }
                                h = e.h(new emwl() { // from class: ctyj
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        fbvn fbvnVar = (fbvn) obj2;
                                        if (fbvnVar == null) {
                                            return null;
                                        }
                                        fbrw fbrwVar2 = fbrw.this;
                                        fbrwVar2.copyOnWrite();
                                        fbrx fbrxVar4 = (fbrx) fbrwVar2.instance;
                                        fbrx fbrxVar5 = fbrx.a;
                                        fbrxVar4.c = fbvnVar;
                                        fbrxVar4.b |= 1;
                                        return null;
                                    }
                                }, ctynVar2.c);
                            }
                            return h.h(new emwl() { // from class: ctyk
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    String Z2;
                                    if ((fbrx.this.b & 8) != 0 || (Z2 = edqcVar.Z()) == null) {
                                        return null;
                                    }
                                    fbrw fbrwVar2 = fbrwVar;
                                    fbxr fbxrVar = (fbxr) fbxs.a.createBuilder();
                                    fbxrVar.copyOnWrite();
                                    ((fbxs) fbxrVar.instance).b = Z2;
                                    fbxs fbxsVar = (fbxs) fbxrVar.build();
                                    fbrwVar2.copyOnWrite();
                                    fbrx fbrxVar4 = (fbrx) fbrwVar2.instance;
                                    fbxsVar.getClass();
                                    fbrxVar4.f = fbxsVar;
                                    fbrxVar4.b |= 8;
                                    return null;
                                }
                            }, ctynVar2.c).h(new emwl() { // from class: ctyl
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    return (fbrx) fbrw.this.build();
                                }
                            }, ctynVar2.c);
                        }
                    }), ctynVar.c);
                }
            }
            if ((fbrxVar.b & 1) != 0) {
                fbvn fbvnVar = fbrxVar.c;
                if (fbvnVar == null) {
                    fbvnVar = fbvn.a;
                }
                if (ctyn.c(fbvnVar)) {
                    g = ctynVar.a(ctyn.b(fbrxVar));
                    g.getClass();
                    i = erny.g(g, eldl.d(new eroh() { // from class: ctym
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj) {
                            elfl e;
                            elfl h;
                            Optional optional = (Optional) obj;
                            boolean isEmpty = optional.isEmpty();
                            final fbrx fbrxVar2 = fbrxVar;
                            if (isEmpty) {
                                return elfo.e(fbrxVar2);
                            }
                            final edqc edqcVar = (edqc) optional.get();
                            final fbrw fbrwVar = (fbrw) fbrxVar2.toBuilder();
                            fbvi fbviVar = (fbvi) fbvj.a.createBuilder();
                            if (!emxe.c(edqcVar.ac())) {
                                String ac = edqcVar.ac();
                                fbviVar.copyOnWrite();
                                fbvj fbvjVar = (fbvj) fbviVar.instance;
                                ac.getClass();
                                fbvjVar.c = ac;
                            }
                            String V = edqcVar.V();
                            if (V != null) {
                                fbviVar.copyOnWrite();
                                ((fbvj) fbviVar.instance).d = V;
                            }
                            LatLng d = edqcVar.d();
                            if (d != null) {
                                faut fautVar = (faut) fauu.a.createBuilder();
                                fautVar.copyOnWrite();
                                ((fauu) fautVar.instance).b = d.a;
                                fautVar.copyOnWrite();
                                ((fauu) fautVar.instance).c = d.b;
                                fbviVar.copyOnWrite();
                                fbvj fbvjVar2 = (fbvj) fbviVar.instance;
                                fauu fauuVar = (fauu) fautVar.build();
                                fauuVar.getClass();
                                fbvjVar2.f = fauuVar;
                                fbvjVar2.b |= 1;
                            }
                            Double N = edqcVar.N();
                            if (N != null) {
                                float floatValue = N.floatValue();
                                fbviVar.copyOnWrite();
                                ((fbvj) fbviVar.instance).e = floatValue;
                            }
                            List aq = edqcVar.aq();
                            if (aq != null) {
                                fbviVar.copyOnWrite();
                                fbvj fbvjVar3 = (fbvj) fbviVar.instance;
                                eygr eygrVar = fbvjVar3.g;
                                if (!eygrVar.c()) {
                                    fbvjVar3.g = eyfy.mutableCopy(eygrVar);
                                }
                                eydl.addAll(aq, fbvjVar3.g);
                            }
                            fbvj fbvjVar4 = (fbvj) fbviVar.build();
                            if (fbvjVar4 != null) {
                                fbrwVar.copyOnWrite();
                                fbrx fbrxVar3 = (fbrx) fbrwVar.instance;
                                fbrxVar3.d = fbvjVar4;
                                fbrxVar3.b |= 2;
                            }
                            ctyn ctynVar2 = ctyn.this;
                            if ((fbrxVar2.b & 1) != 0) {
                                h = elfo.e(null);
                            } else {
                                if (ctynVar2.a != null) {
                                    String Z = edqcVar.Z();
                                    e = TextUtils.isEmpty(Z) ? elfo.e(null) : ((crnc) ctynVar2.a.b()).b(Z).h(new emwl() { // from class: ctyi
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            fbuk fbukVar = (fbuk) obj2;
                                            if (fbukVar != null && fbukVar.c == 7) {
                                                fbrx fbrxVar4 = (fbrx) fbukVar.d;
                                                if ((fbrxVar4.b & 1) != 0) {
                                                    fbvn fbvnVar2 = fbrxVar4.c;
                                                    return fbvnVar2 == null ? fbvn.a : fbvnVar2;
                                                }
                                            }
                                            return null;
                                        }
                                    }, ctynVar2.c);
                                } else {
                                    e = elfo.e(null);
                                }
                                h = e.h(new emwl() { // from class: ctyj
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj2) {
                                        fbvn fbvnVar2 = (fbvn) obj2;
                                        if (fbvnVar2 == null) {
                                            return null;
                                        }
                                        fbrw fbrwVar2 = fbrw.this;
                                        fbrwVar2.copyOnWrite();
                                        fbrx fbrxVar4 = (fbrx) fbrwVar2.instance;
                                        fbrx fbrxVar5 = fbrx.a;
                                        fbrxVar4.c = fbvnVar2;
                                        fbrxVar4.b |= 1;
                                        return null;
                                    }
                                }, ctynVar2.c);
                            }
                            return h.h(new emwl() { // from class: ctyk
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    String Z2;
                                    if ((fbrx.this.b & 8) != 0 || (Z2 = edqcVar.Z()) == null) {
                                        return null;
                                    }
                                    fbrw fbrwVar2 = fbrwVar;
                                    fbxr fbxrVar = (fbxr) fbxs.a.createBuilder();
                                    fbxrVar.copyOnWrite();
                                    ((fbxs) fbxrVar.instance).b = Z2;
                                    fbxs fbxsVar = (fbxs) fbxrVar.build();
                                    fbrwVar2.copyOnWrite();
                                    fbrx fbrxVar4 = (fbrx) fbrwVar2.instance;
                                    fbxsVar.getClass();
                                    fbrxVar4.f = fbxsVar;
                                    fbrxVar4.b |= 8;
                                    return null;
                                }
                            }, ctynVar2.c).h(new emwl() { // from class: ctyl
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    return (fbrx) fbrw.this.build();
                                }
                            }, ctynVar2.c);
                        }
                    }), ctynVar.c);
                }
            }
            int i3 = fbrxVar.b;
            if ((i3 & 8) != 0) {
                fbxs fbxsVar = fbrxVar.f;
                if (fbxsVar == null) {
                    fbxsVar = fbxs.a;
                }
                g = ctynVar.a(fbxsVar.b);
            } else {
                if ((i3 & 4) != 0) {
                    fbvl fbvlVar3 = fbrxVar.e;
                    if (fbvlVar3 == null) {
                        fbvlVar3 = fbvl.a;
                    }
                    if ((fbvlVar3.b & 1) != 0) {
                        ctxw ctxwVar = (ctxw) ctynVar.b.b();
                        fbvl fbvlVar4 = fbrxVar.e;
                        if (fbvlVar4 == null) {
                            fbvlVar4 = fbvl.a;
                        }
                        fauu fauuVar = fbvlVar4.d;
                        if (fauuVar == null) {
                            fauuVar = fauu.a;
                        }
                        double d = fauuVar.b;
                        fbvl fbvlVar5 = fbrxVar.e;
                        if (fbvlVar5 == null) {
                            fbvlVar5 = fbvl.a;
                        }
                        fauu fauuVar2 = fbvlVar5.d;
                        if (fauuVar2 == null) {
                            fauuVar2 = fauu.a;
                        }
                        g = ctxwVar.a(new LatLng(d, fauuVar2.c));
                    }
                }
                if ((fbrxVar.b & 4) != 0) {
                    fbvl fbvlVar6 = fbrxVar.e;
                    if (fbvlVar6 == null) {
                        fbvlVar6 = fbvl.a;
                    }
                    if (!fbvlVar6.e.isEmpty()) {
                        ctyg ctygVar = (ctyg) ctynVar.d.b();
                        fbvl fbvlVar7 = fbrxVar.e;
                        if (fbvlVar7 == null) {
                            fbvlVar7 = fbvl.a;
                        }
                        g = elfl.g(ctygVar.a(fbvlVar7.e));
                    }
                }
                i = erqt.i(fbrxVar);
            }
            g.getClass();
            i = erny.g(g, eldl.d(new eroh() { // from class: ctym
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    elfl e;
                    elfl h;
                    Optional optional = (Optional) obj;
                    boolean isEmpty = optional.isEmpty();
                    final fbrx fbrxVar2 = fbrxVar;
                    if (isEmpty) {
                        return elfo.e(fbrxVar2);
                    }
                    final edqc edqcVar = (edqc) optional.get();
                    final fbrw fbrwVar = (fbrw) fbrxVar2.toBuilder();
                    fbvi fbviVar = (fbvi) fbvj.a.createBuilder();
                    if (!emxe.c(edqcVar.ac())) {
                        String ac = edqcVar.ac();
                        fbviVar.copyOnWrite();
                        fbvj fbvjVar = (fbvj) fbviVar.instance;
                        ac.getClass();
                        fbvjVar.c = ac;
                    }
                    String V = edqcVar.V();
                    if (V != null) {
                        fbviVar.copyOnWrite();
                        ((fbvj) fbviVar.instance).d = V;
                    }
                    LatLng d2 = edqcVar.d();
                    if (d2 != null) {
                        faut fautVar = (faut) fauu.a.createBuilder();
                        fautVar.copyOnWrite();
                        ((fauu) fautVar.instance).b = d2.a;
                        fautVar.copyOnWrite();
                        ((fauu) fautVar.instance).c = d2.b;
                        fbviVar.copyOnWrite();
                        fbvj fbvjVar2 = (fbvj) fbviVar.instance;
                        fauu fauuVar3 = (fauu) fautVar.build();
                        fauuVar3.getClass();
                        fbvjVar2.f = fauuVar3;
                        fbvjVar2.b |= 1;
                    }
                    Double N = edqcVar.N();
                    if (N != null) {
                        float floatValue = N.floatValue();
                        fbviVar.copyOnWrite();
                        ((fbvj) fbviVar.instance).e = floatValue;
                    }
                    List aq = edqcVar.aq();
                    if (aq != null) {
                        fbviVar.copyOnWrite();
                        fbvj fbvjVar3 = (fbvj) fbviVar.instance;
                        eygr eygrVar = fbvjVar3.g;
                        if (!eygrVar.c()) {
                            fbvjVar3.g = eyfy.mutableCopy(eygrVar);
                        }
                        eydl.addAll(aq, fbvjVar3.g);
                    }
                    fbvj fbvjVar4 = (fbvj) fbviVar.build();
                    if (fbvjVar4 != null) {
                        fbrwVar.copyOnWrite();
                        fbrx fbrxVar3 = (fbrx) fbrwVar.instance;
                        fbrxVar3.d = fbvjVar4;
                        fbrxVar3.b |= 2;
                    }
                    ctyn ctynVar2 = ctyn.this;
                    if ((fbrxVar2.b & 1) != 0) {
                        h = elfo.e(null);
                    } else {
                        if (ctynVar2.a != null) {
                            String Z = edqcVar.Z();
                            e = TextUtils.isEmpty(Z) ? elfo.e(null) : ((crnc) ctynVar2.a.b()).b(Z).h(new emwl() { // from class: ctyi
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    fbuk fbukVar = (fbuk) obj2;
                                    if (fbukVar != null && fbukVar.c == 7) {
                                        fbrx fbrxVar4 = (fbrx) fbukVar.d;
                                        if ((fbrxVar4.b & 1) != 0) {
                                            fbvn fbvnVar2 = fbrxVar4.c;
                                            return fbvnVar2 == null ? fbvn.a : fbvnVar2;
                                        }
                                    }
                                    return null;
                                }
                            }, ctynVar2.c);
                        } else {
                            e = elfo.e(null);
                        }
                        h = e.h(new emwl() { // from class: ctyj
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                fbvn fbvnVar2 = (fbvn) obj2;
                                if (fbvnVar2 == null) {
                                    return null;
                                }
                                fbrw fbrwVar2 = fbrw.this;
                                fbrwVar2.copyOnWrite();
                                fbrx fbrxVar4 = (fbrx) fbrwVar2.instance;
                                fbrx fbrxVar5 = fbrx.a;
                                fbrxVar4.c = fbvnVar2;
                                fbrxVar4.b |= 1;
                                return null;
                            }
                        }, ctynVar2.c);
                    }
                    return h.h(new emwl() { // from class: ctyk
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            String Z2;
                            if ((fbrx.this.b & 8) != 0 || (Z2 = edqcVar.Z()) == null) {
                                return null;
                            }
                            fbrw fbrwVar2 = fbrwVar;
                            fbxr fbxrVar = (fbxr) fbxs.a.createBuilder();
                            fbxrVar.copyOnWrite();
                            ((fbxs) fbxrVar.instance).b = Z2;
                            fbxs fbxsVar2 = (fbxs) fbxrVar.build();
                            fbrwVar2.copyOnWrite();
                            fbrx fbrxVar4 = (fbrx) fbrwVar2.instance;
                            fbxsVar2.getClass();
                            fbrxVar4.f = fbxsVar2;
                            fbrxVar4.b |= 8;
                            return null;
                        }
                    }, ctynVar2.c).h(new emwl() { // from class: ctyl
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return (fbrx) fbrw.this.build();
                        }
                    }, ctynVar2.c);
                }
            }), ctynVar.c);
        }
        return elfl.g(i).h(new emwl() { // from class: bdwh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                fbrx fbrxVar2 = (fbrx) obj;
                emyl emylVar = bdwr.a;
                fbud fbudVar2 = fbud.this;
                fbudVar2.copyOnWrite();
                fbue fbueVar = (fbue) fbudVar2.instance;
                fbue fbueVar2 = fbue.a;
                fbrxVar2.getClass();
                fbueVar.d = fbrxVar2;
                fbueVar.b |= 1;
                return null;
            }
        }, this.r);
    }

    public final boolean f(bton btonVar) {
        return this.d.f().toEpochMilli() >= btonVar.k();
    }

    public final void g(final String str) {
        if (TextUtils.isEmpty(str)) {
            elfo.e(null);
        } else {
            elfo.f(new Runnable() { // from class: bdvy
                @Override // java.lang.Runnable
                public final void run() {
                    bdwr bdwrVar = bdwr.this;
                    ekzz f = eleg.f("LinkPreviewDatabaseOperations#incrementParticipantManualLinkPreviewCount");
                    String str2 = str;
                    try {
                        csix.h();
                        if (!TextUtils.isEmpty(str2)) {
                            long parseLong = Long.parseLong(str2);
                            String[] strArr = btob.a;
                            btny btnyVar = new btny();
                            btnyVar.ag("manual_link_preview_count", dtzk.a(bdvu.a(str2)));
                            btoa btoaVar = new btoa();
                            btoaVar.b(parseLong);
                            if (!btnyVar.aj(new btnz(btoaVar), "link_preview_participants_table-buildAndUpdateForParticipantId")) {
                                btne btneVar = new btne();
                                btneVar.c(parseLong);
                                btneVar.b(1L);
                                btneVar.a().l();
                            }
                        }
                        f.close();
                        if (((Boolean) cful.w.e()).booleanValue() && !((Boolean) ahnz.c.e()).booleanValue()) {
                            bdwrVar.k.c("Bugle.Share.WebLinkPreview.ManualPreviewButtonClick");
                        }
                        if (bdvu.d(str2) == ((Integer) cful.x.e()).intValue() && ((Boolean) cful.w.e()).booleanValue() && !((Boolean) ahnz.c.e()).booleanValue()) {
                            bdwrVar.k.c("Bugle.Share.WebLinkPreview.ManualPreviewThresholdReached");
                        }
                    } catch (Throwable th) {
                        try {
                            f.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, this.q);
        }
    }

    public final void i(MessageCoreData messageCoreData, int i, int i2) {
        eomy eomyVar = (eomy) eonc.a.createBuilder();
        eomyVar.copyOnWrite();
        eonc eoncVar = (eonc) eomyVar.instance;
        eoncVar.c = i - 1;
        eoncVar.b |= 1;
        eomyVar.copyOnWrite();
        eonc eoncVar2 = (eonc) eomyVar.instance;
        eoncVar2.d = eohz.a(2);
        eoncVar2.b |= 2;
        eomyVar.copyOnWrite();
        eonc eoncVar3 = (eonc) eomyVar.instance;
        eoncVar3.e = eohz.a(2);
        eoncVar3.b |= 4;
        eomyVar.copyOnWrite();
        eonc eoncVar4 = (eonc) eomyVar.instance;
        eoncVar4.f = eohz.a(2);
        eoncVar4.b |= 8;
        eomyVar.copyOnWrite();
        eonc eoncVar5 = (eonc) eomyVar.instance;
        eoncVar5.g = eohz.a(2);
        eoncVar5.b |= 16;
        if (((Boolean) cful.w.e()).booleanValue()) {
            eomyVar.copyOnWrite();
            eonc eoncVar6 = (eonc) eomyVar.instance;
            eoncVar6.h = i2 - 1;
            eoncVar6.b |= 32;
        }
        eonc eoncVar7 = (eonc) eomyVar.build();
        eoir eoirVar = (eoir) eoit.a.createBuilder();
        fbqt fbqtVar = fbqt.LINK_PREVIEW_ANNOTATION;
        eoirVar.copyOnWrite();
        eoit eoitVar = (eoit) eoirVar.instance;
        eoitVar.c = fbqtVar.a();
        eoitVar.b |= 1;
        eoirVar.copyOnWrite();
        eoit eoitVar2 = (eoit) eoirVar.instance;
        eoncVar7.getClass();
        eoitVar2.g = eoncVar7;
        eoitVar2.b |= 16;
        eoit eoitVar3 = (eoit) eoirVar.build();
        boolean equals = Objects.equals(messageCoreData.aA(), ((SelfIdentityIdImpl) messageCoreData.v()).a);
        if (!((Boolean) ahnz.b.e()).booleanValue()) {
            if (equals) {
                ((altk) this.j.b()).F(messageCoreData, eoitVar3);
            } else {
                ((altk) this.j.b()).E(messageCoreData, eoitVar3);
            }
        }
        if (i == 11 && ((Boolean) cful.w.e()).booleanValue() && !((Boolean) ahnz.c.e()).booleanValue()) {
            this.k.c("Bugle.Share.WebLinkPreview.CreateManualPreviewButton");
        }
    }

    public final void j() {
        if (((Optional) this.u.b()).isEmpty()) {
            return;
        }
    }
}
