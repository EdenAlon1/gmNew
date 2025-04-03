package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayDeque;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axkm {
    public static final cskc a = cskc.g("BugleCms", "CmsSettingsDataService");
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/cloudstore/cmssettingsdata/CmsSettingsDataService");
    public static final cfup c = cfvl.e(cfvl.b, "previous_session_ids_including_current_to_count", 5);
    public final cqoh d;
    public final emyl e;
    public final errl f;
    public final ejvp g;
    public final ffbr h;
    public final axkw i;
    public final asik j;
    public final AtomicReference k;
    public final AtomicReference l;
    public final asyf m;
    public final axkl n = new axkl(this);
    private final ejvb o;
    private final errl p;
    private final errl q;
    private final Set r;
    private final ffbr s;
    private final asjt t;

    public axkm(final ffbr ffbrVar, cqoh cqohVar, ejvb ejvbVar, errl errlVar, errl errlVar2, errl errlVar3, Set set, ejvp ejvpVar, ffbr ffbrVar2, axkw axkwVar, asik asikVar, ffbr ffbrVar3, asjt asjtVar, AtomicReference atomicReference, asyf asyfVar, AtomicReference atomicReference2) {
        this.d = cqohVar;
        this.o = ejvbVar;
        this.f = errlVar;
        this.p = errlVar2;
        this.q = errlVar3;
        this.g = ejvpVar;
        this.h = ffbrVar2;
        this.s = ffbrVar3;
        this.t = asjtVar;
        this.i = axkwVar;
        this.e = new emyl() { // from class: axfj
            @Override // defpackage.emyl
            public final Object get() {
                cskc cskcVar = axkm.a;
                comu c2 = comv.c();
                c2.d(comb.CMS_SETTINGS);
                c2.f(axez.a);
                c2.c(new Supplier() { // from class: axhv
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new axkh();
                    }
                });
                return ((comy) ffbr.this.b()).a(c2.a());
            }
        };
        this.j = asikVar;
        this.r = set;
        this.l = atomicReference;
        this.m = asyfVar;
        this.k = atomicReference2;
    }

    private final void at(long j, long j2, long j3, String str) {
        if (this.t.a()) {
            crze.a(str);
            return;
        }
        csjb b2 = a.b();
        b2.I(str);
        b2.z("messageCount", j);
        b2.z("incrementValue", j2);
        b2.z("totalCount", j3);
        b2.r();
        if (((Optional) this.s.b()).isPresent()) {
            ((cfyt) ((Optional) this.s.b()).get()).b(new IllegalStateException(str)).k(axnw.b(), erpp.a);
        }
    }

    public static axez d(axez axezVar, String str) {
        axep builder = axezVar.toBuilder();
        builder.copyOnWrite();
        axez axezVar2 = (axez) builder.instance;
        axezVar2.b |= 16;
        axezVar2.h = emxe.b(str);
        builder.copyOnWrite();
        axez axezVar3 = (axez) builder.instance;
        axezVar3.b |= 1024;
        axezVar3.n = 0;
        return builder.build();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final elfl A(final Function function) {
        return this.e.get().j(new emwl() { // from class: axfg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Object apply;
                cskc cskcVar = axkm.a;
                apply = Function.this.apply(((axez) obj).toBuilder());
                return ((axep) apply).build();
            }
        }).h(new emwl() { // from class: axfh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                axkm.this.N();
                return null;
            }
        }, this.f);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final elfl B(final Function function, final Function function2) {
        return this.e.get().j(new emwl() { // from class: axke
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Object apply;
                cskc cskcVar = axkm.a;
                apply = Function.this.apply(((axez) obj).toBuilder());
                return ((axep) apply).build();
            }
        }).h(new emwl() { // from class: axkf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Object apply;
                axkm.this.N();
                apply = function2.apply((axez) obj);
                return apply;
            }
        }, this.f);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final elfl C(final Function function) {
        return this.e.get().j(new emwl() { // from class: axjy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Object apply;
                cskc cskcVar = axkm.a;
                apply = Function.this.apply(((axez) obj).toBuilder());
                return ((axep) apply).build();
            }
        }).h(new emwl() { // from class: axka
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                return null;
            }
        }, this.f);
    }

    public final fglt D() {
        fglt fgltVar = (fglt) this.l.get();
        if (fgltVar != null) {
            return fgltVar == fglt.UNKNOWN_CLOUD_SYNC_STATUS ? fglt.NOT_ENABLED : fgltVar;
        }
        k().h(new emwl() { // from class: axga
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                axez axezVar = (axez) obj;
                axeu b2 = axeu.b(axezVar.r);
                if (b2 == null) {
                    b2 = axeu.UNSPECIFIED_STATUS;
                }
                axkm axkmVar = axkm.this;
                axeu b3 = axeu.b(axezVar.l);
                if (b3 == null) {
                    b3 = axeu.UNSPECIFIED_STATUS;
                }
                axkl axklVar = axkmVar.n;
                if (!axklVar.a.m.a()) {
                    axklVar.a.l.set(axkl.d(b2));
                    return null;
                }
                int ordinal = b2.ordinal();
                axklVar.a.l.set(ordinal != 1 ? ordinal != 2 ? fglt.NOT_ENABLED : b2 == b3 ? fglt.FI_INITIAL_SYNC_IN_PROGRESS : fglt.BNR_INITIAL_SYNC_IN_PROGRESS : b2 == b3 ? fglt.FI_ENABLED : fglt.BNR_ENABLED);
                return null;
            }
        }, this.q);
        return fglt.UNKNOWN_CLOUD_SYNC_STATUS;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [comc, java.lang.Object] */
    public final void E() {
        efbd.b();
        ensk h = b.h();
        h.Y(ente.a, "BugleCms");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/cloudstore/cmssettingsdata/CmsSettingsDataService", "cleanupDeltaSyncFieldsSync", 1871, "CmsSettingsDataService.java")).q("Cleaning up delta sync fields.");
        this.e.get().m(new emwl() { // from class: axiz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axezVar.I = null;
                axezVar.c &= -17;
                builder.copyOnWrite();
                axez axezVar2 = (axez) builder.instance;
                axezVar2.M = null;
                axezVar2.c &= -129;
                builder.copyOnWrite();
                axez axezVar3 = (axez) builder.instance;
                axezVar3.H = null;
                axezVar3.c &= -9;
                builder.copyOnWrite();
                axez axezVar4 = (axez) builder.instance;
                axezVar4.c &= -33;
                axezVar4.J = axez.a.J;
                builder.copyOnWrite();
                axez axezVar5 = (axez) builder.instance;
                axezVar5.c &= -65;
                axezVar5.K = axez.a.K;
                return builder.build();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final void F() {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axiu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axezVar.u = null;
                axezVar.b &= -131073;
                return builder.build();
            }
        });
        N();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final void G() {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axfm
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return axkm.d((axez) obj, "");
            }
        });
        N();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final void H() {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axir
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axezVar.C = null;
                axezVar.b &= -1073741825;
                return builder.build();
            }
        });
        N();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final void I() {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axhh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axezVar.P = null;
                axezVar.c &= -1025;
                return builder.build();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final void J() {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axgu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axezVar.b &= -1048577;
                axezVar.w = false;
                return builder.build();
            }
        });
        N();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final void K(final long j) {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axfu
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                axey axeyVar = ((axez) builder.instance).z;
                if (axeyVar == null) {
                    axeyVar = axey.a;
                }
                long j2 = j;
                long j3 = axeyVar.c;
                axex axexVar = (axex) axey.a.createBuilder();
                long j4 = j3 + j2;
                axexVar.copyOnWrite();
                axey axeyVar2 = (axey) axexVar.instance;
                axeyVar2.b |= 1;
                axeyVar2.c = j4;
                axey axeyVar3 = (axey) axexVar.build();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axeyVar3.getClass();
                axezVar.z = axeyVar3;
                axezVar.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
                return builder.build();
            }
        });
        N();
    }

    public final void L() {
        ((dtuu) this.h.b()).g(new dtut() { // from class: axhl
            @Override // defpackage.dtut
            public final ekzz a() {
                cskc cskcVar = axkm.a;
                return eleg.f("CSDS::notifyAppSettingsUi::runAfterCommit");
            }
        }, "CmsSettingsDataService#notifyAppSettingsUi", new Runnable() { // from class: axhn
            @Override // java.lang.Runnable
            public final void run() {
                axkm.this.g.a(elfo.e(null), csfw.a);
                axkm.a.p("Notify App Settings Ui called.");
            }
        });
    }

    public final void M() {
        if (csgj.a()) {
            if (((dtuu) this.h.b()).i()) {
                ((dtuu) this.h.b()).g(new dtut() { // from class: axgv
                    @Override // defpackage.dtut
                    public final ekzz a() {
                        cskc cskcVar = axkm.a;
                        return eleg.f("CSDS::notifyBnrSettingsUi::runAfterCommit");
                    }
                }, "CmsSettingsDataService#notifyBnrSettingsUi", new Runnable() { // from class: axgw
                    @Override // java.lang.Runnable
                    public final void run() {
                        axkm.this.g.a(elfo.e(null), csfv.a);
                        axkm.a.p("Notify Bnr Settings Ui called after transaction commit");
                    }
                });
            } else {
                this.g.a(elfo.e(null), csfv.a);
                a.p("Notify Bnr Settings Ui called");
            }
        }
    }

    public final void N() {
        this.g.a(elfo.e(null), "CMS_SETTINGS_DATA_SOURCE_CONTENT_KEY");
    }

    public final void O() {
        enqu listIterator = ((enpx) this.r).listIterator();
        while (listIterator.hasNext()) {
            final axkz axkzVar = (axkz) listIterator.next();
            axkzVar.getClass();
            elfo.f(new Runnable() { // from class: axid
                @Override // java.lang.Runnable
                public final void run() {
                    axkz.this.a();
                }
            }, this.p).k(axnw.c(new Consumer() { // from class: axie
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ensk h = axkm.b.h();
                    h.Y(ente.a, "BugleCms");
                    ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/cloudstore/cmssettingsdata/CmsSettingsDataService", "notifyRestoreComplete", 1248, "CmsSettingsDataService.java")).t("Notified listener %s for restore complete", axkz.this);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), this.f);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final void P() {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axhz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.clear();
                return builder.build();
            }
        });
        this.l.set(fglt.UNKNOWN_CLOUD_SYNC_STATUS);
        N();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [comc, java.lang.Object] */
    public final void Q() {
        efbd.b();
        this.i.a(false);
        this.e.get().m(new emwl() { // from class: axfp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axezVar.G = null;
                axezVar.c &= -5;
                return builder.build();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final void R() {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axhe
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axezVar.b |= 4096;
                axezVar.p = 0;
                return builder.build();
            }
        });
        N();
    }

    public final void S(axeu axeuVar) {
        T(axeuVar, true);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final void T(final axeu axeuVar, boolean z) {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axfa
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axezVar.r = axeu.this.h;
                axezVar.b |= 16384;
                return builder.build();
            }
        });
        if (this.m.a()) {
            this.l.set(null);
        } else {
            this.n.c(axeuVar);
        }
        N();
        if (z) {
            M();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final void U(final axes axesVar) {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axfw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axezVar.y = axes.this.d;
                axezVar.b |= 16777216;
                return builder.build();
            }
        });
        N();
        M();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final void V(final eyja eyjaVar) {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axfq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                eyja eyjaVar2 = eyja.this;
                eyjaVar2.getClass();
                axezVar.I = eyjaVar2;
                axezVar.c |= 16;
                return builder.build();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final void W(final eyja eyjaVar) {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axho
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                eyja eyjaVar2 = eyja.this;
                eyjaVar2.getClass();
                axezVar.M = eyjaVar2;
                axezVar.c |= 128;
                return builder.build();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final void X(final eyja eyjaVar) {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axil
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                eyja eyjaVar2 = eyja.this;
                eyjaVar2.getClass();
                axezVar.H = eyjaVar2;
                axezVar.c |= 8;
                return builder.build();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [comc, java.lang.Object] */
    public final void Y(final String str) {
        efbd.b();
        ensk h = b.h();
        h.Y(ente.a, "BugleCms");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/cloudstore/cmssettingsdata/CmsSettingsDataService", "setDeltaSyncFieldsDuringOptOutSync", 1888, "CmsSettingsDataService.java")).q("Setting up delta sync PriorToCmsGaiaId field.");
        this.e.get().m(new emwl() { // from class: axgh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axezVar.I = null;
                axezVar.c &= -17;
                builder.copyOnWrite();
                axez axezVar2 = (axez) builder.instance;
                String str2 = str;
                str2.getClass();
                axezVar2.c |= 64;
                axezVar2.K = str2;
                builder.copyOnWrite();
                axez axezVar3 = (axez) builder.instance;
                axezVar3.H = null;
                axezVar3.c &= -9;
                builder.copyOnWrite();
                axez axezVar4 = (axez) builder.instance;
                axezVar4.c &= -33;
                axezVar4.J = axez.a.J;
                return builder.build();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    @Deprecated
    public final void Z(final boolean z) {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axkc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axezVar.b |= 8192;
                axezVar.q = z;
                return builder.build();
            }
        });
        N();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final axeu a() {
        efbd.b();
        axeu b2 = axeu.b(((axez) this.e.get().l()).r);
        return b2 == null ? axeu.UNSPECIFIED_STATUS : b2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    @Deprecated
    public final void aa(final boolean z) {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axkb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axezVar.b |= 2;
                axezVar.e = z;
                return builder.build();
            }
        });
        N();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final void ab(final axew axewVar) {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axjt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axezVar.o = axew.this.g;
                axezVar.b |= 2048;
                return builder.build();
            }
        });
        N();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final void ac(final long j) {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axgc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                axez axezVar = (axez) obj;
                axep builder = axezVar.toBuilder();
                axky axkyVar = axezVar.C;
                if (axkyVar == null) {
                    axkyVar = axky.a;
                }
                long j2 = j;
                axkm.this.an(axkyVar.f, 0L, j2, "The total messages to backup will be smaller than the backed up message count");
                axkx axkxVar = (axkx) axkyVar.toBuilder();
                axkxVar.copyOnWrite();
                axky axkyVar2 = (axky) axkxVar.instance;
                axkyVar2.b |= 16;
                axkyVar2.e = j2;
                builder.copyOnWrite();
                axez axezVar2 = (axez) builder.instance;
                axky axkyVar3 = (axky) axkxVar.build();
                axkyVar3.getClass();
                axezVar2.C = axkyVar3;
                axezVar2.b |= 1073741824;
                return builder.build();
            }
        });
        N();
    }

    public final void ad(axmi axmiVar) {
        ae(axmiVar, true);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [comc, java.lang.Object] */
    public final void ae(final axmi axmiVar, boolean z) {
        efbd.b();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.e.get().m(new emwl() { // from class: axhq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                axez axezVar = (axez) obj;
                cskc cskcVar = axkm.a;
                axmi b2 = axmi.b(axezVar.f);
                if (b2 == null) {
                    b2 = axmi.INITIAL_SYNC_STATUS_NOT_SET;
                }
                axmi axmiVar2 = axmi.this;
                if (b2.equals(axmi.RESTORE) && axmiVar2.equals(axmi.BACKUP)) {
                    atomicBoolean.set(true);
                }
                axep builder = axezVar.toBuilder();
                builder.copyOnWrite();
                axez axezVar2 = (axez) builder.instance;
                axezVar2.f = axmiVar2.j;
                axezVar2.b |= 4;
                return builder.build();
            }
        });
        if (atomicBoolean.get()) {
            O();
        }
        N();
        if (z) {
            M();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final void af(final axeu axeuVar) {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axkd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axezVar.l = axeu.this.h;
                axezVar.b |= 256;
                return builder.build();
            }
        });
        if (((Boolean) ((cfup) csgj.Y.get()).e()).booleanValue()) {
            this.k.set(axeuVar);
        }
        if (this.m.a()) {
            this.l.set(null);
        } else {
            this.n.c(axeuVar);
        }
        N();
        if (csgj.a() && ((Boolean) ((cfup) cshy.a.get()).e()).booleanValue()) {
            L();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final void ag(final String str) {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axgp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                String str2 = str;
                str2.getClass();
                axezVar.c |= 64;
                axezVar.K = str2;
                return builder.build();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final void ah(final String str) {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axkg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                String str2 = str;
                str2.getClass();
                axezVar.c |= 32;
                axezVar.J = str2;
                return builder.build();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final void ai(final boolean z) {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axgi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axezVar.b |= 536870912;
                axezVar.B = z;
                return builder.build();
            }
        });
        N();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [comc, java.lang.Object] */
    public final void aj(final String str) {
        efbd.b();
        if (emxe.c(str)) {
            a.p("Clearing session id.");
        } else {
            csjb c2 = a.c();
            c2.I("Setting session id.");
            c2.A("sessionId", str);
            c2.r();
        }
        this.e.get().m(new emwl() { // from class: axfc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                String str2 = str;
                if (!TextUtils.isEmpty(str2)) {
                    ArrayDeque arrayDeque = new ArrayDeque(DesugarCollections.unmodifiableList(((axez) builder.instance).L));
                    arrayDeque.add(str2);
                    while (!arrayDeque.isEmpty() && arrayDeque.size() > ((Integer) axkm.c.e()).intValue()) {
                        arrayDeque.pollFirst();
                    }
                    builder.copyOnWrite();
                    ((axez) builder.instance).L = eyfy.emptyProtobufList();
                    builder.copyOnWrite();
                    axez axezVar = (axez) builder.instance;
                    eygr eygrVar = axezVar.L;
                    if (!eygrVar.c()) {
                        axezVar.L = eyfy.mutableCopy(eygrVar);
                    }
                    eydl.addAll(arrayDeque, axezVar.L);
                }
                builder.copyOnWrite();
                axez axezVar2 = (axez) builder.instance;
                str2.getClass();
                axezVar2.b |= 64;
                axezVar2.j = str2;
                return builder.build();
            }
        });
        N();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    @Deprecated
    public final boolean ak() {
        efbd.b();
        return ((axez) this.e.get().l()).e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final boolean al() {
        efbd.b();
        return ((axez) this.e.get().l()).v;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final elfl am() {
        return this.e.get().j(new emwl() { // from class: axhw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final axep builder = ((axez) obj).toBuilder();
                ((dtuu) axkm.this.h.b()).d("CmsSettingsDataService#incrementInitialSyncProgressDataParticipantsToBackupCount", new Runnable() { // from class: axgm
                    @Override // java.lang.Runnable
                    public final void run() {
                        cskc cskcVar = axkm.a;
                        axep axepVar = axep.this;
                        axky axkyVar = ((axez) axepVar.instance).C;
                        if (axkyVar == null) {
                            axkyVar = axky.a;
                        }
                        axkx axkxVar = (axkx) axkyVar.toBuilder();
                        int i = axkyVar.m + 1;
                        axkxVar.copyOnWrite();
                        axky axkyVar2 = (axky) axkxVar.instance;
                        axkyVar2.b |= 4096;
                        axkyVar2.m = i;
                        axepVar.copyOnWrite();
                        axez axezVar = (axez) axepVar.instance;
                        axky axkyVar3 = (axky) axkxVar.build();
                        axkyVar3.getClass();
                        axezVar.C = axkyVar3;
                        axezVar.b |= 1073741824;
                    }
                });
                return builder.build();
            }
        }).h(new emwl() { // from class: axhx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                return null;
            }
        }, erpp.a);
    }

    public final void an(long j, long j2, long j3, String str) {
        if (j + j2 > j3 || j < 0 || j2 < 0) {
            if (!csgj.a()) {
                at(j, j2, j3, str);
                return;
            }
            if (j < 0) {
                csjb b2 = a.b();
                b2.I("The negative messageCount is invalid");
                b2.z("messageCount", j);
                b2.r();
                return;
            }
            if (j2 < 0) {
                csjb b3 = a.b();
                b3.I("The negative incrementValue is invalid");
                b3.z("incrementValue", j2);
                b3.r();
                return;
            }
            if ((j2 != 0 || j <= j3) && (j2 <= 0 || j > j3)) {
                return;
            }
            at(j, j2, j3, str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final elfl ao() {
        return this.e.get().j(new emwl() { // from class: axjl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axezVar.b |= 2097152;
                axezVar.x = true;
                return builder.build();
            }
        }).h(new emwl() { // from class: axjs
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                axkm.this.N();
                return null;
            }
        }, this.f);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final void ap() {
        efbd.b();
        this.e.get().m(new emwl() { // from class: axhi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axezVar.b |= 524288;
                axezVar.v = true;
                return builder.build();
            }
        });
        N();
    }

    public final elfl aq(final int i) {
        return A(new Function() { // from class: axjk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                axep axepVar = (axep) obj;
                cskc cskcVar = axkm.a;
                axkq axkqVar = ((axez) axepVar.instance).s;
                if (axkqVar == null) {
                    axkqVar = axkq.a;
                }
                int i2 = i;
                axkn axknVar = (axkn) axkqVar.toBuilder();
                axknVar.copyOnWrite();
                axkq axkqVar2 = (axkq) axknVar.instance;
                axkqVar2.e = i2 - 1;
                axkqVar2.b |= 4;
                axkq axkqVar3 = (axkq) axknVar.build();
                axepVar.copyOnWrite();
                axez axezVar = (axez) axepVar.instance;
                axkqVar3.getClass();
                axezVar.s = axkqVar3;
                axezVar.b |= 32768;
                return axepVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final elfl ar(final int i) {
        return A(new Function() { // from class: axhr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                axep axepVar = (axep) obj;
                cskc cskcVar = axkm.a;
                axkq axkqVar = ((axez) axepVar.instance).s;
                if (axkqVar == null) {
                    axkqVar = axkq.a;
                }
                int i2 = i;
                axkn axknVar = (axkn) axkqVar.toBuilder();
                axknVar.copyOnWrite();
                axkq axkqVar2 = (axkq) axknVar.instance;
                axkqVar2.d = i2 - 1;
                axkqVar2.b |= 2;
                axkq axkqVar3 = (axkq) axknVar.build();
                axepVar.copyOnWrite();
                axez axezVar = (axez) axepVar.instance;
                axkqVar3.getClass();
                axezVar.s = axkqVar3;
                axezVar.b |= 32768;
                return axepVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final elfl as(final int i) {
        return A(new Function() { // from class: axjf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                axep axepVar = (axep) obj;
                cskc cskcVar = axkm.a;
                axkq axkqVar = ((axez) axepVar.instance).s;
                if (axkqVar == null) {
                    axkqVar = axkq.a;
                }
                int i2 = i;
                axkn axknVar = (axkn) axkqVar.toBuilder();
                axknVar.copyOnWrite();
                axkq axkqVar2 = (axkq) axknVar.instance;
                axkqVar2.c = i2 - 1;
                axkqVar2.b |= 1;
                axkq axkqVar3 = (axkq) axknVar.build();
                axepVar.copyOnWrite();
                axez axezVar = (axez) axepVar.instance;
                axkqVar3.getClass();
                axezVar.s = axkqVar3;
                axezVar.b |= 32768;
                return axepVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final axeu b() {
        efbd.b();
        axeu b2 = axeu.b(((axez) this.e.get().l()).l);
        return b2 == null ? axeu.UNSPECIFIED_STATUS : b2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final axez c() {
        return (axez) this.e.get().l();
    }

    public final ejuh e() {
        return new ejuy(this.o, new eros() { // from class: axhd
            /* JADX WARN: Type inference failed for: r2v3, types: [comc, java.lang.Object] */
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                return new erph(axkm.this.e.get().h());
            }
        }, "CMS_SETTINGS_DATA_SOURCE_CONTENT_KEY");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final elfl f() {
        return this.e.get().h().h(new emwl() { // from class: axgx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                axeu b2 = axeu.b(((axez) obj).r);
                return b2 == null ? axeu.UNSPECIFIED_STATUS : b2;
            }
        }, erpp.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final elfl g() {
        return this.e.get().h().h(new emwl() { // from class: axjw
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                axei axeiVar = ((axez) obj).u;
                return axeiVar == null ? axei.a : axeiVar;
            }
        }, this.f);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final elfl h() {
        return this.e.get().h().h(new emwl() { // from class: axgn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axes b2 = axes.b(((axez) obj).y);
                return b2 == null ? axes.ENCRYPTION_STATUS_UNSPECIFIED : b2;
            }
        }, this.f);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final elfl i() {
        return this.e.get().h().h(new emwl() { // from class: axii
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eyja eyjaVar = ((axez) obj).I;
                return eyjaVar == null ? eyja.a : eyjaVar;
            }
        }, erpp.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final elfl j() {
        return this.e.get().h().h(new emwl() { // from class: axhf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Integer.valueOf(((axez) obj).n);
            }
        }, erpp.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final elfl k() {
        return this.e.get().h();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final elfl l() {
        return this.e.get().h().h(new emwl() { // from class: axfn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                axkq axkqVar = ((axez) obj).s;
                return axkqVar == null ? axkq.a : axkqVar;
            }
        }, erpp.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final elfl m() {
        return this.e.get().h().h(new emwl() { // from class: axio
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                axez axezVar = (axez) obj;
                axkm axkmVar = axkm.this;
                axkmVar.j.a();
                if (axkmVar.j.a()) {
                    eyja eyjaVar = axezVar.I;
                    return eyjaVar == null ? eyja.a : eyjaVar;
                }
                axkmVar.j.a();
                return eykm.c;
            }
        }, erpp.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final elfl n() {
        return this.e.get().h().h(new emwl() { // from class: axgd
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                axez axezVar = (axez) obj;
                cskc cskcVar = axkm.a;
                return (axezVar.b & 8) != 0 ? Optional.of(axezVar.g) : Optional.empty();
            }
        }, erpp.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final elfl o() {
        return this.e.get().h().h(new emwl() { // from class: axhs
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Integer.valueOf(((axez) obj).p);
            }
        }, erpp.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final elfl p() {
        return this.e.get().h().h(new emwl() { // from class: axhk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                eyev eyevVar = ((axez) obj).P;
                return eyevVar == null ? eyev.a : eyevVar;
            }
        }, this.f);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    @Deprecated
    public final elfl q() {
        return this.e.get().h().h(new emwl() { // from class: axib
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((axez) obj).e);
            }
        }, erpp.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final elfl r() {
        return this.e.get().h().h(new emwl() { // from class: axgz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                axeu b2 = axeu.b(((axez) obj).l);
                return b2 == null ? axeu.UNSPECIFIED_STATUS : b2;
            }
        }, erpp.a);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [comc, java.lang.Object] */
    public final elfl s() {
        return this.e.get().h().h(new emwl() { // from class: axhj
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((axez) obj).B);
            }
        }, erpp.a);
    }

    public final elfl t(final int i) {
        return A(new Function() { // from class: axht
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final axep axepVar = (axep) obj;
                dtuu dtuuVar = (dtuu) axkm.this.h.b();
                final int i2 = i;
                dtuuVar.d("CmsSettingsDataService#incrementInitialSyncProgressDataRestoredConversationsCount", new Runnable() { // from class: axgl
                    @Override // java.lang.Runnable
                    public final void run() {
                        cskc cskcVar = axkm.a;
                        axep axepVar2 = axep.this;
                        axky axkyVar = ((axez) axepVar2.instance).C;
                        if (axkyVar == null) {
                            axkyVar = axky.a;
                        }
                        int i3 = i2;
                        int i4 = axkyVar.h;
                        axkx axkxVar = (axkx) axkyVar.toBuilder();
                        int i5 = i4 + i3;
                        axkxVar.copyOnWrite();
                        axky axkyVar2 = (axky) axkxVar.instance;
                        axkyVar2.b |= 128;
                        axkyVar2.h = i5;
                        axepVar2.copyOnWrite();
                        axez axezVar = (axez) axepVar2.instance;
                        axky axkyVar3 = (axky) axkxVar.build();
                        axkyVar3.getClass();
                        axezVar.C = axkyVar3;
                        axezVar.b |= 1073741824;
                    }
                });
                return axepVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final elfl u(final long j) {
        return A(new Function() { // from class: axiq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final axkm axkmVar = axkm.this;
                final axep axepVar = (axep) obj;
                dtuu dtuuVar = (dtuu) axkmVar.h.b();
                final long j2 = j;
                dtuuVar.d("CmsSettingsDataService#incrementInitialSyncProgressDataRestoredMessagesCount", new Runnable() { // from class: axic
                    @Override // java.lang.Runnable
                    public final void run() {
                        axep axepVar2 = axepVar;
                        axky axkyVar = ((axez) axepVar2.instance).C;
                        if (axkyVar == null) {
                            axkyVar = axky.a;
                        }
                        long j3 = j2;
                        axkm axkmVar2 = axkm.this;
                        long j4 = axkyVar.c;
                        long j5 = axkyVar.d;
                        axkmVar2.an(j5, j3, j4, "The restored message count will be more than the total messages to restore");
                        axkx axkxVar = (axkx) axkyVar.toBuilder();
                        axkxVar.copyOnWrite();
                        axky axkyVar2 = (axky) axkxVar.instance;
                        axkyVar2.b |= 2;
                        axkyVar2.d = j5 + j3;
                        axepVar2.copyOnWrite();
                        axez axezVar = (axez) axepVar2.instance;
                        axky axkyVar3 = (axky) axkxVar.build();
                        axkyVar3.getClass();
                        axezVar.C = axkyVar3;
                        axezVar.b |= 1073741824;
                    }
                });
                return axepVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final elfl v(final int i) {
        return A(new Function() { // from class: axhb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final axep axepVar = (axep) obj;
                dtuu dtuuVar = (dtuu) axkm.this.h.b();
                final int i2 = i;
                dtuuVar.d("CmsSettingsDataService#incrementInitialSyncProgressDataRestoredParticipantsCount", new Runnable() { // from class: axip
                    @Override // java.lang.Runnable
                    public final void run() {
                        cskc cskcVar = axkm.a;
                        axep axepVar2 = axep.this;
                        axky axkyVar = ((axez) axepVar2.instance).C;
                        if (axkyVar == null) {
                            axkyVar = axky.a;
                        }
                        int i3 = i2;
                        int i4 = axkyVar.l;
                        axkx axkxVar = (axkx) axkyVar.toBuilder();
                        int i5 = i4 + i3;
                        axkxVar.copyOnWrite();
                        axky axkyVar2 = (axky) axkxVar.instance;
                        axkyVar2.b |= 2048;
                        axkyVar2.l = i5;
                        axepVar2.copyOnWrite();
                        axez axezVar = (axez) axepVar2.instance;
                        axky axkyVar3 = (axky) axkxVar.build();
                        axkyVar3.getClass();
                        axezVar.C = axkyVar3;
                        axezVar.b |= 1073741824;
                    }
                });
                return axepVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final elfl w(final String str) {
        return B(new Function() { // from class: axfx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                return axkm.d(((axep) obj).build(), str).toBuilder();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: axfy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((axez) obj).h;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final elfl x(final int i) {
        return B(new Function() { // from class: axfk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                axep axepVar = (axep) obj;
                cskc cskcVar = axkm.a;
                axepVar.copyOnWrite();
                axez axezVar = (axez) axepVar.instance;
                axez axezVar2 = axez.a;
                axezVar.b |= 4096;
                axezVar.p = i;
                return axepVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: axfl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((axez) obj).p);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final elfl y(final eyja eyjaVar) {
        return A(new Function() { // from class: axjm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                axep axepVar = (axep) obj;
                cskc cskcVar = axkm.a;
                axepVar.copyOnWrite();
                axez axezVar = (axez) axepVar.instance;
                axez axezVar2 = axez.a;
                eyja eyjaVar2 = eyja.this;
                eyjaVar2.getClass();
                axezVar.S = eyjaVar2;
                axezVar.c |= 16384;
                return axepVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final elfl z(final boolean z) {
        return A(new Function() { // from class: axfz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                axep axepVar = (axep) obj;
                cskc cskcVar = axkm.a;
                axepVar.copyOnWrite();
                axez axezVar = (axez) axepVar.instance;
                axez axezVar2 = axez.a;
                axezVar.b |= 1048576;
                axezVar.w = z;
                return axepVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
