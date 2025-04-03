package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axdf {
    static final enhk c;
    public final axkm d;
    public final errl e;
    public final errl f;
    public final asif g;
    public final ashj h;
    public final asje i;
    public final asiv j;
    public final asik k;
    public final csiy l;
    private final ffbr n;
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/cloudstore/clearcutlogging/CmsClearcutLogger");
    public static final cfup b = cfvl.e(cfvl.b, "cms_num_failures_before_clearcut_logging", 5);
    private static final enip m = enip.s(epeg.RESTORE_CONV_PARTICIPANT_NOT_FOUND, epeg.RESTORE_MSG_CONVERSATION_MISSING, epeg.RESTORE_MSG_PARTICIPANT_MISSING);

    static {
        epfx epfxVar = epfx.RESTORE;
        epfx epfxVar2 = epfx.OPTIMIZED_RESTORE;
        epfx epfxVar3 = epfx.RESTORE_BACKUP_KEY;
        epfx epfxVar4 = epfx.OPTIMIZED_RESTORE_BACKUP_KEY;
        epfx epfxVar5 = epfx.RESTORE_ENCRYPTION_KEY;
        epfx epfxVar6 = epfx.OPTIMIZED_RESTORE_ENCRYPTION_KEY;
        epfx epfxVar7 = epfx.RESTORE_PARTICIPANT;
        epfx epfxVar8 = epfx.OPTIMIZED_RESTORE_PARTICIPANT;
        epfx epfxVar9 = epfx.RESTORE_CONVERSATION;
        epfx epfxVar10 = epfx.OPTIMIZED_RESTORE_CONVERSATION;
        epfx epfxVar11 = epfx.RESTORE_MESSAGE;
        epfx epfxVar12 = epfx.OPTIMIZED_RESTORE_MESSAGE;
        epfx epfxVar13 = epfx.BACKUP;
        epfx epfxVar14 = epfx.OPTIMIZED_BACKUP;
        endr.a(epfxVar, epfxVar2);
        endr.a(epfxVar3, epfxVar4);
        endr.a(epfxVar5, epfxVar6);
        endr.a(epfxVar7, epfxVar8);
        endr.a(epfxVar9, epfxVar10);
        endr.a(epfxVar11, epfxVar12);
        endr.a(epfxVar13, epfxVar14);
        c = enoz.a(7, new Object[]{epfxVar, epfxVar2, epfxVar3, epfxVar4, epfxVar5, epfxVar6, epfxVar7, epfxVar8, epfxVar9, epfxVar10, epfxVar11, epfxVar12, epfxVar13, epfxVar14});
    }

    public axdf(csiy csiyVar, ffbr ffbrVar, axkm axkmVar, asif asifVar, asiv asivVar, ashj ashjVar, asje asjeVar, asik asikVar, errl errlVar, errl errlVar2) {
        this.l = csiyVar;
        this.n = ffbrVar;
        this.d = axkmVar;
        this.h = ashjVar;
        this.g = asifVar;
        this.j = asivVar;
        this.i = asjeVar;
        this.k = asikVar;
        this.e = errlVar;
        this.f = errlVar2;
    }

    public static void d(Throwable th) {
        th.addSuppressed(new axde());
    }

    public static boolean u(Throwable th) {
        for (Throwable th2 : th.getSuppressed()) {
            if (th2 instanceof axde) {
                return true;
            }
        }
        return false;
    }

    private static boolean y(axeu axeuVar) {
        return axeuVar == axeu.ENABLED || axeuVar == axeu.ENABLING;
    }

    private final void z(epdw epdwVar, int i, Throwable th, int i2, int i3) {
        if (this.h.a() && th != null && u(th)) {
            return;
        }
        epds epdsVar = (epds) epdt.a.createBuilder();
        epdsVar.copyOnWrite();
        epdt epdtVar = (epdt) epdsVar.instance;
        epdtVar.c = epdwVar.w;
        epdtVar.b |= 1;
        epdsVar.copyOnWrite();
        epdt epdtVar2 = (epdt) epdsVar.instance;
        epdtVar2.g = i3 - 1;
        epdtVar2.b |= 16;
        epdsVar.copyOnWrite();
        epdt epdtVar3 = (epdt) epdsVar.instance;
        epdtVar3.d = i - 1;
        epdtVar3.b |= 2;
        epdsVar.copyOnWrite();
        epdt epdtVar4 = (epdt) epdsVar.instance;
        epdtVar4.b |= 8;
        epdtVar4.f = i2;
        epeg a2 = th != null ? axdy.a(th) : epeg.NO_FAILURE;
        epdsVar.copyOnWrite();
        epdt epdtVar5 = (epdt) epdsVar.instance;
        epdtVar5.e = a2.bs;
        epdtVar5.b |= 4;
        f((epdt) epdsVar.build());
        if (!this.h.a() || th == null) {
            return;
        }
        d(th);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [comc, java.lang.Object] */
    public final elfl a(final epgf epgfVar) {
        return this.d.e.get().h().h(new emwl() { // from class: axjr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((axez) obj).j;
            }
        }, erpp.a).h(new emwl() { // from class: axdb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                String str = (String) obj;
                epdx epdxVar = (epdx) epgfVar.toBuilder();
                epdxVar.copyOnWrite();
                epgf epgfVar2 = (epgf) epdxVar.instance;
                str.getClass();
                epgfVar2.b |= 128;
                epgfVar2.j = str;
                boolean z = axdf.this.l.a;
                epdxVar.copyOnWrite();
                epgf epgfVar3 = (epgf) epdxVar.instance;
                epgfVar3.b |= 512;
                epgfVar3.l = z;
                return (epgf) epdxVar.build();
            }
        }, this.e).i(new eroh() { // from class: axdc
            /* JADX WARN: Type inference failed for: r1v2, types: [comc, java.lang.Object] */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final epgf epgfVar2 = (epgf) obj;
                axdf axdfVar = axdf.this;
                return axdfVar.d.e.get().h().h(new emwl() { // from class: axjz
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        axez axezVar = (axez) obj2;
                        cskc cskcVar = axkm.a;
                        if ((axezVar.c & 256) == 0) {
                            return Optional.empty();
                        }
                        eyja eyjaVar = axezVar.N;
                        if (eyjaVar == null) {
                            eyjaVar = eyja.a;
                        }
                        return Optional.of(eyjaVar);
                    }
                }, erpp.a).h(new emwl() { // from class: axda
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        enru enruVar = axdf.a;
                        final epgf epgfVar3 = epgf.this;
                        return (epgf) ((Optional) obj2).map(new Function() { // from class: axcw
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                enru enruVar2 = axdf.a;
                                epdx epdxVar = (epdx) epgf.this.toBuilder();
                                long b2 = eykm.b((eyja) obj3);
                                epdxVar.copyOnWrite();
                                epgf epgfVar4 = (epgf) epdxVar.instance;
                                epgfVar4.b |= 262144;
                                epgfVar4.q = b2;
                                return (epgf) epdxVar.build();
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).orElse(epgfVar3);
                    }
                }, axdfVar.e);
            }
        }, this.e).i(new eroh() { // from class: axdd
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final epgf epgfVar2 = (epgf) obj;
                axdf axdfVar = axdf.this;
                return axdfVar.d.n().h(new emwl() { // from class: axct
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        enru enruVar = axdf.a;
                        final epgf epgfVar3 = epgf.this;
                        Optional map = ((Optional) obj2).map(new Function() { // from class: axcu
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                String str = (String) obj3;
                                enru enruVar2 = axdf.a;
                                epdx epdxVar = (epdx) epgf.this.toBuilder();
                                epdxVar.copyOnWrite();
                                epgf epgfVar4 = (epgf) epdxVar.instance;
                                str.getClass();
                                epgfVar4.b |= 256;
                                epgfVar4.k = str;
                                return epdxVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        epgfVar3.getClass();
                        return (epdx) map.orElseGet(new Supplier() { // from class: axcv
                            @Override // java.util.function.Supplier
                            public final Object get() {
                                return (epdx) epgf.this.toBuilder();
                            }
                        });
                    }
                }, axdfVar.e);
            }
        }, this.e);
    }

    public final engw b() {
        efbd.b();
        int i = engw.d;
        engr engrVar = new engr();
        try {
            if (y(this.d.a())) {
                engrVar.h(epdz.BACKUP_AND_RESTORE);
            }
            if (y(this.d.b())) {
                engrVar.h(epdz.FI_MULTI_DEVICE);
            }
            return engrVar.g();
        } catch (eygu e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [comc, java.lang.Object] */
    public final epfx c(epfx epfxVar) {
        eyja eyjaVar;
        efbd.b();
        if (this.k.a()) {
            enhk enhkVar = c;
            if (enhkVar.containsKey(epfxVar)) {
                try {
                    axkm axkmVar = this.d;
                    efbd.b();
                    axez axezVar = (axez) axkmVar.e.get().l();
                    axkmVar.j.a();
                    if (axkmVar.j.a()) {
                        eyjaVar = axezVar.I;
                        if (eyjaVar == null) {
                            eyjaVar = eyja.a;
                        }
                    } else {
                        axkmVar.j.a();
                        eyjaVar = eykm.c;
                    }
                    if (!Objects.equals(eyjaVar, eykm.c)) {
                        return (epfx) enhkVar.get(epfxVar);
                    }
                } catch (eygu e) {
                    ensk j = a.j();
                    j.Y(ente.a, "BugleCms");
                    ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/shared/cloudstore/clearcutlogging/CmsClearcutLogger", "getInitialSyncStage", (char) 1371, "CmsClearcutLogger.java")).q("Failed to parse timestamp for delta sync. Do not convert sync stage in clearcut log.");
                }
            }
        }
        return epfxVar;
    }

    public final void e(epfx epfxVar) {
        epep epepVar = (epep) epeq.a.createBuilder();
        epfx c2 = c(epfxVar);
        epepVar.copyOnWrite();
        epeq epeqVar = (epeq) epepVar.instance;
        epeqVar.c = c2.s;
        epeqVar.b |= 1;
        epepVar.copyOnWrite();
        epeq epeqVar2 = (epeq) epepVar.instance;
        epeqVar2.d = 3;
        epeqVar2.b |= 2;
        epeg epegVar = epeg.ACCOUNT_NOT_LINKED;
        epepVar.copyOnWrite();
        epeq epeqVar3 = (epeq) epepVar.instance;
        epeqVar3.e = epegVar.bs;
        epeqVar3.b |= 4;
        epepVar.a(b());
        m((epeq) epepVar.build());
    }

    public final void f(epdt epdtVar) {
        epdx epdxVar = (epdx) epgf.a.createBuilder();
        epdxVar.copyOnWrite();
        epgf epgfVar = (epgf) epdxVar.instance;
        epdtVar.getClass();
        epgfVar.d = epdtVar;
        epgfVar.b |= 2;
        r((epgf) epdxVar.build());
    }

    public final void g(epdw epdwVar, boolean z, int i, Throwable th) {
        h(false, epdwVar, z, i, th);
    }

    public final void h(boolean z, epdw epdwVar, boolean z2, int i, Throwable th) {
        if (z || ((Integer) b.e()).intValue() == i) {
            z(epdwVar, 4, th, i, true != z2 ? 3 : 2);
        }
    }

    public final void i(int i, Throwable th) {
        if (((Integer) b.e()).intValue() == i && !(this.h.a() && u(th))) {
            z(epdw.SELF_PARTICIPANT_BACKUP, 4, th, i, 1);
            if (this.h.a()) {
                d(th);
            }
        }
    }

    public final void j(epdw epdwVar, boolean z, int i, Throwable th) {
        z(epdwVar, 6, th, i, true != z ? 3 : 2);
    }

    public final void k(epgf epgfVar, final axdx axdxVar, final boolean z) {
        axnw.i(a(epgfVar).h(new emwl() { // from class: axcx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                epdx epdxVar = (epdx) obj;
                epeq epeqVar = ((epgf) epdxVar.instance).c;
                if (epeqVar == null) {
                    epeqVar = epeq.a;
                }
                axdx axdxVar2 = axdxVar;
                axdf axdfVar = axdf.this;
                epep epepVar = (epep) epeqVar.toBuilder();
                epen epenVar = (epen) epeo.a.createBuilder();
                epenVar.copyOnWrite();
                epeo epeoVar = (epeo) epenVar.instance;
                epeoVar.b |= 1;
                epeoVar.c = axdxVar2.a / 1000;
                epenVar.copyOnWrite();
                epeo epeoVar2 = (epeo) epenVar.instance;
                epeoVar2.b |= 8;
                epeoVar2.f = axdxVar2.b / 1000;
                epenVar.copyOnWrite();
                epeo epeoVar3 = (epeo) epenVar.instance;
                epeoVar3.b |= 2;
                epeoVar3.d = axdxVar2.c / 10;
                epenVar.copyOnWrite();
                epeo epeoVar4 = (epeo) epenVar.instance;
                epeoVar4.b |= 16;
                epeoVar4.g = axdxVar2.d / 10;
                epenVar.copyOnWrite();
                epeo epeoVar5 = (epeo) epenVar.instance;
                epeoVar5.b |= 4;
                epeoVar5.e = axdxVar2.e / 10;
                epenVar.copyOnWrite();
                epeo epeoVar6 = (epeo) epenVar.instance;
                epeoVar6.b |= 32;
                epeoVar6.h = axdxVar2.f / 10;
                if (axdfVar.g.a()) {
                    if (z) {
                        int i = axdxVar2.g;
                        epenVar.copyOnWrite();
                        epeo epeoVar7 = (epeo) epenVar.instance;
                        epeoVar7.b |= 32768;
                        epeoVar7.r = i;
                        int i2 = axdxVar2.h;
                        epenVar.copyOnWrite();
                        epeo epeoVar8 = (epeo) epenVar.instance;
                        epeoVar8.b |= 65536;
                        epeoVar8.s = i2;
                        int i3 = axdxVar2.k;
                        epenVar.copyOnWrite();
                        epeo epeoVar9 = (epeo) epenVar.instance;
                        epeoVar9.b |= 2048;
                        epeoVar9.n = i3;
                        int i4 = axdxVar2.l;
                        epenVar.copyOnWrite();
                        epeo epeoVar10 = (epeo) epenVar.instance;
                        epeoVar10.b |= 4096;
                        epeoVar10.o = i4;
                        long j = axdxVar2.o;
                        epenVar.copyOnWrite();
                        epeo epeoVar11 = (epeo) epenVar.instance;
                        epeoVar11.b |= 64;
                        epeoVar11.i = j;
                        long j2 = axdxVar2.p;
                        epenVar.copyOnWrite();
                        epeo epeoVar12 = (epeo) epenVar.instance;
                        epeoVar12.b |= 128;
                        epeoVar12.j = j2;
                        if (((ersq) ((arkv) axdfVar.i).a.b()).a("bugle.records_merged_message_count_in_initial_sync_database_profile")) {
                            long j3 = axdxVar2.q;
                            epenVar.copyOnWrite();
                            epeo epeoVar13 = (epeo) epenVar.instance;
                            epeoVar13.b |= 256;
                            epeoVar13.k = j3;
                        }
                    } else {
                        int i5 = axdxVar2.i;
                        epenVar.copyOnWrite();
                        epeo epeoVar14 = (epeo) epenVar.instance;
                        epeoVar14.b |= 131072;
                        epeoVar14.t = i5;
                        int i6 = axdxVar2.j;
                        epenVar.copyOnWrite();
                        epeo epeoVar15 = (epeo) epenVar.instance;
                        epeoVar15.b |= 262144;
                        epeoVar15.u = i6;
                        int i7 = axdxVar2.m;
                        epenVar.copyOnWrite();
                        epeo epeoVar16 = (epeo) epenVar.instance;
                        epeoVar16.b |= 8192;
                        epeoVar16.p = i7;
                        int i8 = axdxVar2.n;
                        epenVar.copyOnWrite();
                        epeo epeoVar17 = (epeo) epenVar.instance;
                        epeoVar17.b |= 16384;
                        epeoVar17.q = i8;
                        long j4 = axdxVar2.r;
                        epenVar.copyOnWrite();
                        epeo epeoVar18 = (epeo) epenVar.instance;
                        epeoVar18.b |= 512;
                        epeoVar18.l = j4;
                        long j5 = axdxVar2.s;
                        epenVar.copyOnWrite();
                        epeo epeoVar19 = (epeo) epenVar.instance;
                        epeoVar19.b |= 1024;
                        epeoVar19.m = j5;
                    }
                }
                epeo epeoVar20 = (epeo) epenVar.build();
                epepVar.copyOnWrite();
                epeq epeqVar2 = (epeq) epepVar.instance;
                epeoVar20.getClass();
                epeqVar2.l = epeoVar20;
                epeqVar2.b |= 512;
                epeq epeqVar3 = (epeq) epepVar.build();
                epdxVar.copyOnWrite();
                epgf epgfVar2 = (epgf) epdxVar.instance;
                epeqVar3.getClass();
                epgfVar2.c = epeqVar3;
                epgfVar2.b |= 1;
                return epdxVar;
            }
        }, this.f).h(new axcy(), this.e), new axcz(this), this.e);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(boolean r5, boolean r6, defpackage.csfz r7, j$.util.Optional r8) {
        /*
            r4 = this;
            epek r0 = defpackage.epek.a
            eyfq r0 = r0.createBuilder()
            epej r0 = (defpackage.epej) r0
            r0.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r1 = r0.instance
            epek r1 = (defpackage.epek) r1
            int r2 = r1.b
            r3 = 1
            r2 = r2 | r3
            r1.b = r2
            r1.c = r5
            r0.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r5 = r0.instance
            epek r5 = (defpackage.epek) r5
            int r1 = r5.b
            r1 = r1 | 2
            r5.b = r1
            r5.d = r6
            csfz r5 = defpackage.csfz.BACKUP_AND_RESTORE
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L4d
            boolean r5 = r8.isPresent()
            if (r5 == 0) goto L4d
            java.lang.Object r5 = r8.get()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            r0.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r6 = r0.instance
            epek r6 = (defpackage.epek) r6
            int r8 = r6.b
            r8 = r8 | 4
            r6.b = r8
            r6.e = r5
        L4d:
            epeq r5 = defpackage.epeq.a
            eyfq r5 = r5.createBuilder()
            epep r5 = (defpackage.epep) r5
            epfx r6 = defpackage.epfx.BLOCK_ON_INITIAL_BACKUP_PRECONDITIONS
            r5.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r8 = r5.instance
            epeq r8 = (defpackage.epeq) r8
            int r6 = r6.s
            r8.c = r6
            int r6 = r8.b
            r6 = r6 | r3
            r8.b = r6
            MessageType extends eyfy<MessageType, BuilderType> r6 = r0.instance
            epek r6 = (defpackage.epek) r6
            boolean r6 = r6.d
            csfz r8 = defpackage.csfz.MULTI_DEVICE
            boolean r8 = r7.equals(r8)
            if (r8 == 0) goto L7d
            MessageType extends eyfy<MessageType, BuilderType> r7 = r0.instance
            epek r7 = (defpackage.epek) r7
            boolean r7 = r7.c
        L7b:
            r6 = r6 & r7
            goto L8c
        L7d:
            csfz r8 = defpackage.csfz.BACKUP_AND_RESTORE
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L8c
            MessageType extends eyfy<MessageType, BuilderType> r7 = r0.instance
            epek r7 = (defpackage.epek) r7
            boolean r7 = r7.e
            goto L7b
        L8c:
            if (r3 == r6) goto L90
            r6 = 6
            goto L91
        L90:
            r6 = 3
        L91:
            r5.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r7 = r5.instance
            epeq r7 = (defpackage.epeq) r7
            int r6 = r6 + (-1)
            r7.d = r6
            int r6 = r7.b
            r6 = r6 | 2
            r7.b = r6
            epeg r6 = defpackage.epeg.NO_FAILURE
            r5.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r7 = r5.instance
            epeq r7 = (defpackage.epeq) r7
            int r6 = r6.bs
            r7.e = r6
            int r6 = r7.b
            r6 = r6 | 4
            r7.b = r6
            r5.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r6 = r5.instance
            epeq r6 = (defpackage.epeq) r6
            eyfy r7 = r0.build()
            epek r7 = (defpackage.epek) r7
            r7.getClass()
            r6.k = r7
            int r7 = r6.b
            r7 = r7 | 256(0x100, float:3.59E-43)
            r6.b = r7
            engw r6 = r4.b()
            r5.a(r6)
            eyfy r5 = r5.build()
            epeq r5 = (defpackage.epeq) r5
            r4.m(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axdf.l(boolean, boolean, csfz, j$.util.Optional):void");
    }

    public final void m(epeq epeqVar) {
        epdx epdxVar = (epdx) epgf.a.createBuilder();
        epdxVar.copyOnWrite();
        epgf epgfVar = (epgf) epdxVar.instance;
        epeqVar.getClass();
        epgfVar.c = epeqVar;
        epgfVar.b |= 1;
        r((epgf) epdxVar.build());
    }

    public final void n(epfx epfxVar, int i, Throwable th) {
        if (i != ((Integer) b.e()).intValue()) {
            return;
        }
        if (this.h.a() && u(th)) {
            return;
        }
        epep epepVar = (epep) epeq.a.createBuilder();
        epfx c2 = c(epfxVar);
        epepVar.copyOnWrite();
        epeq epeqVar = (epeq) epepVar.instance;
        epeqVar.c = c2.s;
        epeqVar.b |= 1;
        epepVar.copyOnWrite();
        epeq epeqVar2 = (epeq) epepVar.instance;
        epeqVar2.d = 3;
        epeqVar2.b |= 2;
        epeg a2 = axdy.a(th);
        epepVar.copyOnWrite();
        epeq epeqVar3 = (epeq) epepVar.instance;
        epeqVar3.e = a2.bs;
        epeqVar3.b |= 4;
        epepVar.a(b());
        m((epeq) epepVar.build());
        if (this.h.a()) {
            d(th);
        }
    }

    public final void o(epes epesVar) {
        epdx epdxVar = (epdx) epgf.a.createBuilder();
        epdxVar.copyOnWrite();
        epgf epgfVar = (epgf) epdxVar.instance;
        epgfVar.r = epesVar;
        epgfVar.b |= 524288;
        r((epgf) epdxVar.build());
    }

    public final void p(List list, long j, bqmn bqmnVar) {
        if (b().isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessageIdType messageIdType = (MessageIdType) it.next();
            epev epevVar = (epev) epex.a.createBuilder();
            long j2 = messageIdType.a;
            epevVar.copyOnWrite();
            epex epexVar = (epex) epevVar.instance;
            int i = 1;
            epexVar.b |= 1;
            epexVar.c = j2;
            epevVar.copyOnWrite();
            epex epexVar2 = (epex) epevVar.instance;
            epexVar2.b |= 4;
            epexVar2.d = j;
            switch (bqmnVar.ordinal()) {
                case 0:
                    break;
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 3;
                    break;
                case 3:
                    i = 5;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 7;
                    break;
                case 6:
                    i = 6;
                    break;
                case 7:
                    i = 8;
                    break;
                case 8:
                    i = 10;
                    break;
                case 9:
                    i = 9;
                    break;
                case 10:
                    i = 11;
                    break;
                case 11:
                    i = 12;
                    break;
                case 12:
                    i = 13;
                    break;
                case 13:
                    i = 14;
                    break;
                case 14:
                    i = 15;
                    break;
                case 15:
                    i = 16;
                    break;
                case 16:
                    i = 17;
                    break;
                case 17:
                    i = 18;
                    break;
                case 18:
                    i = 19;
                    break;
                case 19:
                    i = 20;
                    break;
                default:
                    throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(bqmnVar))));
            }
            epevVar.copyOnWrite();
            epex epexVar3 = (epex) epevVar.instance;
            epexVar3.e = i - 1;
            epexVar3.b = 8 | epexVar3.b;
            epex epexVar4 = (epex) epevVar.build();
            epdx epdxVar = (epdx) epgf.a.createBuilder();
            epdxVar.copyOnWrite();
            epgf epgfVar = (epgf) epdxVar.instance;
            epexVar4.getClass();
            epgfVar.n = epexVar4;
            epgfVar.b |= 4096;
            r((epgf) epdxVar.build());
        }
    }

    public final void q(epgf epgfVar) {
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_MULTI_DEVICE_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        epgfVar.getClass();
        eolvVar2.ar = epgfVar;
        eolvVar2.d |= 2048;
        eoiw eoiwVar = (eoiw) eoix.a.createBuilder();
        eovw eovwVar = csjc.a;
        eoiwVar.copyOnWrite();
        eoix eoixVar = (eoix) eoiwVar.instance;
        eoixVar.d = eovwVar.x;
        eoixVar.b |= 64;
        eoluVar.copyOnWrite();
        eolv eolvVar3 = (eolv) eoluVar.instance;
        eoix eoixVar2 = (eoix) eoiwVar.build();
        eoixVar2.getClass();
        eolvVar3.k = eoixVar2;
        eolvVar3.b |= 2;
        ((akxl) this.n.b()).o(eoluVar);
    }

    public final void r(epgf epgfVar) {
        axnw.i(a(epgfVar).h(new axcy(), this.e), new axcz(this), this.e);
    }

    public final void s(epfe epfeVar) {
        epdx epdxVar = (epdx) epgf.a.createBuilder();
        epdxVar.copyOnWrite();
        epgf epgfVar = (epgf) epdxVar.instance;
        epfeVar.getClass();
        epgfVar.e = epfeVar;
        epgfVar.b |= 4;
        r((epgf) epdxVar.build());
    }

    public final void t(epfx epfxVar) {
        epep epepVar = (epep) epeq.a.createBuilder();
        epfx c2 = c(epfxVar);
        epepVar.copyOnWrite();
        epeq epeqVar = (epeq) epepVar.instance;
        epeqVar.c = c2.s;
        epeqVar.b |= 1;
        epepVar.copyOnWrite();
        epeq epeqVar2 = (epeq) epepVar.instance;
        epeqVar2.d = 1;
        epeqVar2.b |= 2;
        epeg epegVar = epeg.NO_FAILURE;
        epepVar.copyOnWrite();
        epeq epeqVar3 = (epeq) epepVar.instance;
        epeqVar3.e = epegVar.bs;
        epeqVar3.b |= 4;
        epepVar.a(b());
        m((epeq) epepVar.build());
    }

    public final void v(epfi epfiVar, eyja eyjaVar, eyja eyjaVar2, int i) {
        long b2 = eyki.b(eykm.c(eyjaVar, eyjaVar2));
        epff epffVar = (epff) epfj.a.createBuilder();
        epffVar.copyOnWrite();
        epfj epfjVar = (epfj) epffVar.instance;
        epfjVar.c = epfiVar.A;
        epfjVar.b |= 1;
        long b3 = eykm.b(eyjaVar);
        eoul eoulVar = (eoul) eoum.a.createBuilder();
        eoulVar.copyOnWrite();
        eoum eoumVar = (eoum) eoulVar.instance;
        eoumVar.b |= 1;
        eoumVar.c = b3;
        eoulVar.copyOnWrite();
        eoum eoumVar2 = (eoum) eoulVar.instance;
        eoumVar2.b |= 2;
        eoumVar2.d = b2;
        eoum eoumVar3 = (eoum) eoulVar.build();
        epffVar.copyOnWrite();
        epfj epfjVar2 = (epfj) epffVar.instance;
        eoumVar3.getClass();
        epfjVar2.d = eoumVar3;
        epfjVar2.b |= 2;
        epffVar.copyOnWrite();
        epfj epfjVar3 = (epfj) epffVar.instance;
        epfjVar3.e = i - 1;
        epfjVar3.b |= 4;
        epfj epfjVar4 = (epfj) epffVar.build();
        epdx epdxVar = (epdx) epgf.a.createBuilder();
        epdxVar.copyOnWrite();
        epgf epgfVar = (epgf) epdxVar.instance;
        epfjVar4.getClass();
        epgfVar.i = epfjVar4;
        epgfVar.b |= 64;
        q((epgf) epdxVar.build());
    }

    public final void w(int i, boolean z, int i2, Throwable th, int i3, String str) {
        if (this.h.a() && th != null && u(th)) {
            return;
        }
        epeg a2 = axdy.a(th);
        epfk epfkVar = (epfk) epfp.a.createBuilder();
        epfkVar.copyOnWrite();
        epfp epfpVar = (epfp) epfkVar.instance;
        epfpVar.e = i - 1;
        int i4 = 1;
        epfpVar.b |= 1;
        epfkVar.copyOnWrite();
        epfp epfpVar2 = (epfp) epfkVar.instance;
        epfpVar2.f = 3;
        epfpVar2.b |= 2;
        epfkVar.copyOnWrite();
        epfp epfpVar3 = (epfp) epfkVar.instance;
        epfpVar3.g = a2.bs;
        epfpVar3.b |= 4;
        epfkVar.copyOnWrite();
        epfp epfpVar4 = (epfp) epfkVar.instance;
        epfpVar4.b |= 8;
        epfpVar4.h = i2;
        if (i3 != 0) {
            epfl epflVar = (epfl) epfm.a.createBuilder();
            epflVar.copyOnWrite();
            epfm epfmVar = (epfm) epflVar.instance;
            epfmVar.c = i3 - 1;
            epfmVar.b |= 1;
            epfm epfmVar2 = (epfm) epflVar.build();
            epfkVar.copyOnWrite();
            epfp epfpVar5 = (epfp) epfkVar.instance;
            epfmVar2.getClass();
            epfpVar5.d = epfmVar2;
            epfpVar5.c = 6;
        } else if (str != null) {
            epfn epfnVar = (epfn) epfo.a.createBuilder();
            epfnVar.copyOnWrite();
            epfo epfoVar = (epfo) epfnVar.instance;
            epfoVar.b |= 1;
            epfoVar.c = str;
            m.contains(a2);
            epfo epfoVar2 = (epfo) epfnVar.build();
            epfkVar.copyOnWrite();
            epfp epfpVar6 = (epfp) epfkVar.instance;
            epfoVar2.getClass();
            epfpVar6.d = epfoVar2;
            epfpVar6.c = 5;
        }
        epdx epdxVar = (epdx) epgf.a.createBuilder();
        epfp epfpVar7 = (epfp) epfkVar.build();
        epdxVar.copyOnWrite();
        epgf epgfVar = (epgf) epdxVar.instance;
        epfpVar7.getClass();
        epgfVar.m = epfpVar7;
        epgfVar.b |= 2048;
        if (z) {
            th.getClass();
            ArrayList arrayList = new ArrayList();
            StackTraceElement[] stackTrace = th.getStackTrace();
            stackTrace.getClass();
            if (stackTrace.length != 0) {
                arrayList.add("trace:");
                Iterator a3 = ffjw.a(stackTrace);
                while (a3.hasNext()) {
                    String stackTraceElement = ((StackTraceElement) a3.next()).toString();
                    stackTraceElement.getClass();
                    if (axdz.a(stackTraceElement)) {
                        arrayList.add(stackTraceElement);
                    }
                }
            }
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            if (suppressed.length != 0) {
                Iterator a4 = ffjw.a(suppressed);
                while (a4.hasNext()) {
                    Throwable th2 = (Throwable) a4.next();
                    th2.getClass();
                    int i5 = i4 + 1;
                    arrayList.add(a.f(i4, "suppressed-", ":"));
                    Iterator a5 = ffjw.a(th2.getStackTrace());
                    while (a5.hasNext()) {
                        String stackTraceElement2 = ((StackTraceElement) a5.next()).toString();
                        stackTraceElement2.getClass();
                        if (axdz.a(stackTraceElement2)) {
                            arrayList.add(stackTraceElement2);
                        }
                    }
                    i4 = i5;
                }
            }
            epet epetVar = (epet) epeu.a.createBuilder();
            epetVar.copyOnWrite();
            epeu epeuVar = (epeu) epetVar.instance;
            eygr eygrVar = epeuVar.b;
            if (!eygrVar.c()) {
                epeuVar.b = eyfy.mutableCopy(eygrVar);
            }
            eydl.addAll(arrayList, epeuVar.b);
            epeu epeuVar2 = (epeu) epetVar.build();
            epdxVar.copyOnWrite();
            epgf epgfVar2 = (epgf) epdxVar.instance;
            epeuVar2.getClass();
            epgfVar2.p = epeuVar2;
            epgfVar2.b |= 65536;
        }
        r((epgf) epdxVar.build());
        if (!this.h.a() || th == null) {
            return;
        }
        d(th);
    }

    public final void x(int i) {
        epeh epehVar = (epeh) epei.a.createBuilder();
        epehVar.copyOnWrite();
        epei epeiVar = (epei) epehVar.instance;
        epeiVar.c = i - 1;
        epeiVar.b |= 1;
        epehVar.copyOnWrite();
        epei epeiVar2 = (epei) epehVar.instance;
        epeiVar2.d = 2;
        epeiVar2.b = 2 | epeiVar2.b;
        epei epeiVar3 = (epei) epehVar.build();
        epdx epdxVar = (epdx) epgf.a.createBuilder();
        epdxVar.copyOnWrite();
        epgf epgfVar = (epgf) epdxVar.instance;
        epeiVar3.getClass();
        epgfVar.f = epeiVar3;
        epgfVar.b |= 8;
        r((epgf) epdxVar.build());
    }
}
