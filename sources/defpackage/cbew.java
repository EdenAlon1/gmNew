package defpackage;

import android.provider.ContactsContract;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.lang.Iterable$EL;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbew implements cbeq {
    private static final cskc a = cskc.g("BugleDataModel", "ParticipantFullRefresh");
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/datamodel/participantrefresh/ParticipantFullRefreshImpl");
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final ffbr d;
    private final ffbr e;
    private final cbfr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final Optional k;
    private final Optional l;
    private final aswk m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;
    private final ffbr s;

    public cbew(ffbr ffbrVar, ffbr ffbrVar2, cbfr cbfrVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, Optional optional, Optional optional2, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, aswk aswkVar, ffbr ffbrVar11, ffbr ffbrVar12) {
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = cbfrVar;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
        this.j = ffbrVar6;
        this.k = optional;
        this.l = optional2;
        this.n = ffbrVar7;
        this.o = ffbrVar8;
        this.p = ffbrVar9;
        this.q = ffbrVar10;
        this.m = aswkVar;
        this.s = ffbrVar11;
        this.r = ffbrVar12;
    }

    private final void d() {
        ((cbfs) this.d.b()).a();
        cbfr cbfrVar = this.f;
        cbfrVar.b.set(false);
        cbfrVar.d = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void e(int i) {
        ecri ecriVar;
        Set set;
        Consumer consumer;
        bvpo bvpoVar;
        try {
            ekzz f = eleg.f("ParticipantFullRefresh.refreshParticipants");
            try {
                ((azzf) this.n.b()).h();
                Iterable$EL.forEach((Set) this.q.b(), new Consumer() { // from class: cber
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        ((cbft) obj).c();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                });
                try {
                    cskc cskcVar = a;
                    csjb c = cskcVar.c();
                    c.I("Start participant refresh. refreshMode:");
                    int i2 = 1;
                    c.I(i != 1 ? "SELF_ONLY" : "FULL");
                    c.r();
                    if (((cbfs) this.d.b()).c()) {
                        axuq axuqVar = (axuq) this.o.b();
                        if (i == 1) {
                            ecri ecriVar2 = this.f.d;
                            ((akzt) axuqVar.b.b()).e("Bugle.Contacts.Sync.ParticipantsRefresh.Start.Count", ecriVar2 != null ? 1 : 0);
                            d();
                            ecriVar = ecriVar2;
                        } else {
                            ecriVar = null;
                        }
                        final cbfs cbfsVar = (cbfs) this.d.b();
                        ((bdtd) cbfsVar.g.b()).k();
                        axnw.h(((aqvh) cbfsVar.w.b()).a().b().h(new emwl() { // from class: cbfk
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                final engw engwVar = (engw) obj;
                                final cbfs cbfsVar2 = cbfs.this;
                                cbfsVar2.h.d("ParticipantRefresh#refreshConversationsSelfIds", new Runnable() { // from class: cbfc
                                    /* JADX WARN: Code restructure failed: missing block: B:12:0x0134, code lost:
                                    
                                        if (r7.e(r4.h(), r10) != false) goto L23;
                                     */
                                    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d4, code lost:
                                    
                                        if (j$.util.Collection.EL.stream(((defpackage.bdfp) r7.v.b()).e(r4.h())).map(new defpackage.cbfm(r7)).anyMatch(new defpackage.cbfn(r12)) == false) goto L15;
                                     */
                                    @Override // java.lang.Runnable
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final void run() {
                                        /*
                                            Method dump skipped, instructions count: 380
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbfc.run():void");
                                    }
                                });
                                return null;
                            }
                        }, cbfsVar.x));
                        cbfsVar.h.d("ParticipantRefresh#refreshDefaultCurrentSelfIds", new Runnable() { // from class: cbfb
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.lang.Runnable
                            public final void run() {
                                enru enruVar = cbfs.a;
                                bvvn e = ParticipantsTable.e();
                                e.z("ParticipantRefresh#refreshDefaultCurrentSelfIds");
                                e.h(new Function() { // from class: cbfi
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bvvw bvvwVar = (bvvw) obj;
                                        enru enruVar2 = cbfs.a;
                                        bvvwVar.w(-1);
                                        int intValue = ParticipantsTable.i().intValue();
                                        if (intValue < 2000) {
                                            dtub.w("sim_slot_id", intValue);
                                        }
                                        bvvwVar.aq(new dtwe("participants.sim_slot_id", 7, -1));
                                        return bvvwVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                engw y = e.b().y();
                                if (((enou) y).c != 1) {
                                    ensk j = cbfs.a.j();
                                    j.Y(ente.a, "BugleDataModel");
                                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/participantrefresh/ParticipantRefresh", "refreshDefaultCurrentSelfIds", 844, "ParticipantRefresh.java")).q("Default self participant not found");
                                    return;
                                }
                                final ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) y.get(0);
                                bvvn e2 = ParticipantsTable.e();
                                e2.z("ParticipantRefresh#selfParticipantIdsSameSimSlot");
                                e2.h(new Function() { // from class: cbfj
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bvvw bvvwVar = (bvvw) obj;
                                        enru enruVar2 = cbfs.a;
                                        bvvwVar.x(-1);
                                        bvvwVar.v(ParticipantsTable.BindData.this.q());
                                        return bvvwVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                engw f2 = e2.b().f();
                                if (((enou) f2).c != 1) {
                                    ensk j2 = cbfs.a.j();
                                    j2.Y(ente.a, "BugleDataModel");
                                    ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/datamodel/participantrefresh/ParticipantRefresh", "refreshDefaultCurrentSelfIds", 859, "ParticipantRefresh.java")).q("Self participant with subId > -1 and SIM slot same as default self participant not found");
                                } else {
                                    String str = (String) f2.get(0);
                                    String[] strArr = bsom.a;
                                    bsoe bsoeVar = new bsoe();
                                    bsoeVar.ak();
                                    bsoeVar.n(str);
                                    bsoeVar.g(bindData.S());
                                }
                            }
                        });
                        ArrayList arrayList = new ArrayList();
                        bvvn e = ParticipantsTable.e();
                        e.z("refreshParticipantsInternal");
                        if (i == 2) {
                            e.h(new Function() { // from class: cbet
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    bvvw bvvwVar = (bvvw) obj;
                                    bvvwVar.x(-2);
                                    return bvvwVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                        } else {
                            e.r();
                        }
                        final engw y = e.b().y();
                        enqv it = y.iterator();
                        int i3 = 0;
                        boolean z = false;
                        while (it.hasNext()) {
                            try {
                                bvpoVar = ((ParticipantsTable.BindData) it.next()).C();
                            } catch (Exception e2) {
                                e = e2;
                                bvpoVar = null;
                            }
                            try {
                                boolean d = ((cbfs) this.d.b()).d(bvpoVar);
                                ParticipantsTable.BindData a2 = bvpoVar.a();
                                if (ContactsContract.Contacts.isEnterpriseContactId(a2.u())) {
                                    i3++;
                                }
                                if (d) {
                                    z |= bdtd.m(a2);
                                    ((cbfs) this.d.b()).b(a2);
                                    String str = bvpoVar.a;
                                    ((azzu) this.j.b()).b(str, a2);
                                    arrayList.add(str);
                                }
                            } catch (Exception e3) {
                                e = e3;
                                if (bvpoVar == null) {
                                    a.s("Failed to update participant=null", e);
                                } else {
                                    csjb e4 = a.e();
                                    e4.I("Failed to update");
                                    e4.f(bvpoVar.a);
                                    e4.m(bvpoVar.d);
                                    e4.k(bvpoVar.f);
                                    e4.s(e);
                                }
                            }
                        }
                        if (i != 2) {
                            if (this.m.a()) {
                                this.l.ifPresent(new Consumer() { // from class: cbeu
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void o(Object obj) {
                                        ((cvfy) ((ffbr) obj).b()).c(y);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                                        return Consumer$CC.$default$andThen(this, consumer2);
                                    }
                                });
                            } else {
                                this.k.ifPresent(new Consumer() { // from class: cbev
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void o(Object obj) {
                                        ((cvfe) ((ffbr) obj).b()).e(y);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                                        return Consumer$CC.$default$andThen(this, consumer2);
                                    }
                                });
                            }
                        }
                        csjb c2 = a.c();
                        c2.I("Number of participants refreshed:");
                        c2.G(arrayList.size());
                        c2.r();
                        ((akzt) this.r.b()).e("Bugle.Datamodel.ParticipantRefresh.WorkProfileSynced.Count", i3);
                        if (!arrayList.isEmpty()) {
                            ((bczy) this.e.b()).S(arrayList);
                        }
                        if (z) {
                            ((cbgf) this.g.b()).b();
                            ((cbgf) this.g.b()).a();
                        }
                        ((alrv) this.i.b()).c(new ecda("Participants refreshed"));
                        if (i == 1) {
                            int i4 = ((enou) y).c;
                            int size = arrayList.size();
                            if (ecriVar != null) {
                                ((alrv) axuqVar.a.b()).h(ecriVar, axup.a);
                            }
                            akzt akztVar = (akzt) axuqVar.b.b();
                            if (i4 > 0) {
                                akztVar.e("Bugle.Contacts.Sync.ParticipantsRefresh.UpdateRatio.Count", (int) Math.ceil((size * 100.0d) / i4));
                            }
                            if (size <= 0) {
                                i2 = 0;
                            }
                            akztVar.e("Bugle.Contacts.Sync.ParticipantsRefresh.End.Count", i2);
                        }
                        set = (Set) this.q.b();
                        consumer = new Consumer() { // from class: cbes
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                ((cbft) obj).d();
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                                return Consumer$CC.$default$andThen(this, consumer2);
                            }
                        };
                    } else {
                        cskcVar.p("Skipping participant refresh because of permissions");
                        set = (Set) this.q.b();
                        consumer = new Consumer() { // from class: cbes
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj) {
                                ((cbft) obj).d();
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                                return Consumer$CC.$default$andThen(this, consumer2);
                            }
                        };
                    }
                    Iterable$EL.forEach(set, consumer);
                    f.close();
                } catch (Throwable th) {
                    Iterable$EL.forEach((Set) this.q.b(), new Consumer() { // from class: cbes
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ((cbft) obj).d();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                            return Consumer$CC.$default$andThen(this, consumer2);
                        }
                    });
                    throw th;
                }
            } finally {
            }
        } finally {
            ((azzf) this.n.b()).g();
        }
    }

    @Override // defpackage.cbeq
    public final void a() {
        this.c.set(false);
        e(1);
    }

    @Override // defpackage.cbeq
    public final void b() {
        if (((Boolean) this.s.b()).booleanValue()) {
            ensk h = b.h();
            h.Y(ente.a, "BugleRecipientSync");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/participantrefresh/ParticipantFullRefreshImpl", "refreshParticipantsIfNeeded", 153, "ParticipantFullRefreshImpl.java")).q("Skipped full participant refresh because ContactRecipientIncrementalSync is enabled");
            if (((cbfs) this.d.b()).c()) {
                d();
                return;
            }
            return;
        }
        if (((cbfs) this.d.b()).c()) {
            ((cbfs) this.d.b()).a();
            if (this.f.b.get() && this.c.compareAndSet(false, true)) {
                ensk h2 = b.h();
                h2.Y(ente.a, "BugleRecipientSync");
                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/datamodel/participantrefresh/ParticipantFullRefreshImpl", "refreshParticipantsIfNeeded", 161, "ParticipantFullRefreshImpl.java")).q("Started full participant refresh");
                ((baiv) this.h.b()).a().y(301, 0L);
                return;
            }
        }
        ensk h3 = b.h();
        h3.Y(ente.a, "BugleRecipientSync");
        ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/shared/datamodel/participantrefresh/ParticipantFullRefreshImpl", "refreshParticipantsIfNeeded", 166, "ParticipantFullRefreshImpl.java")).q("Skipped full participant refresh");
    }

    @Override // defpackage.cbeq
    public final void c() {
        e(2);
        if (((cbfs) this.d.b()).c()) {
            axnw.h(((azqd) this.p.b()).c());
        }
    }
}
