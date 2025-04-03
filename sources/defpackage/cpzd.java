package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpzd {
    private static final cskc c = cskc.g("BugleDataModel", "ForwardSyncExecutionScheduler");
    public final ffbr a;
    public final ffbr b;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;

    public cpzd(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8) {
        this.d = ffbrVar;
        this.a = ffbrVar2;
        this.b = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar5;
        this.g = ffbrVar6;
        this.h = ffbrVar7;
        this.i = ffbrVar8;
    }

    private static boolean b(Instant instant) {
        return instant.toEpochMilli() >= 0;
    }

    public final elfl a(final Instant instant, final Instant instant2, final Instant instant3, final eqqh eqqhVar, final UUID uuid, final UUID uuid2) {
        int i;
        if (!((ctvb) this.d.b()).G()) {
            csjb c2 = c.c();
            c2.I("Skipping sync, not default SMS app.");
            c2.A("batchId", uuid2);
            c2.A("syncId", uuid);
            c2.r();
            ((cqcb) this.b.b()).a(uuid, uuid2, 1, engw.r(eqqd.BUGLE_NOT_DEFAULT_SMS_APP));
            return elfo.e(null);
        }
        if (((auwy) this.i.b()).a() && !((ctud) this.h.b()).k()) {
            csjb c3 = c.c();
            c3.I("Skipping sync, no permissions even though default sms app.");
            c3.A("batchId", uuid2);
            c3.A("syncId", uuid);
            c3.r();
            ((cqcb) this.b.b()).a(uuid, uuid2, 1, engw.r(eqqd.MISSING_PERMISSIONS));
            return elfo.e(null);
        }
        cskc cskcVar = c;
        csjb a = cskcVar.a();
        a.I("Request to sync messages.");
        a.z("lowerBoundTimeMillis", instant.toEpochMilli());
        a.z("upperBoundTimeMillis", instant2.toEpochMilli());
        a.z("startTimeMillis", instant3.toEpochMilli());
        a.y("initialMaxMessagesToUpdate", 0);
        a.A("batchId", uuid2);
        a.A("syncId", uuid);
        a.r();
        int i2 = 2;
        if (!eqqh.EARLIER_MESSAGES_OUT_OF_SYNC.equals(eqqhVar)) {
            if (((Boolean) ((cfup) cpze.b.get()).e()).booleanValue()) {
                if (true == b(instant)) {
                    i = 1;
                    final int i3 = i;
                    return ((coxg) this.f.b()).c(instant.isBefore(Instant.EPOCH), instant3.toEpochMilli(), instant.toEpochMilli(), instant2.toEpochMilli(), uuid).h(new emwl() { // from class: cpzc
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            engw r;
                            coxf coxfVar = (coxf) obj;
                            int ordinal = coxfVar.ordinal();
                            if (ordinal == 1) {
                                r = engw.r(eqqd.FULL_SYNC_DO_NOT_START);
                            } else if (ordinal == 2) {
                                r = engw.r(eqqd.FULL_SYNC_DELAYED);
                            } else if (ordinal != 3) {
                                int i4 = engw.d;
                                r = enou.a;
                            } else {
                                r = engw.r(eqqd.PARTIAL_SYNC_QUEUED);
                            }
                            int i5 = i3;
                            final UUID uuid3 = uuid2;
                            final UUID uuid4 = uuid;
                            cpzd cpzdVar = cpzd.this;
                            ((cqcb) cpzdVar.b.b()).a(uuid4, uuid3, i5, r);
                            if (!coxf.CAN_START.equals(coxfVar)) {
                                return null;
                            }
                            final eqqh eqqhVar2 = eqqhVar;
                            final Instant instant4 = instant3;
                            final Instant instant5 = instant2;
                            final Instant instant6 = instant;
                            ((Optional) cpzdVar.a.b()).ifPresent(new Consumer() { // from class: cpzb
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void o(Object obj2) {
                                    Instant instant7 = Instant.this;
                                    eqqh eqqhVar3 = eqqhVar2;
                                    ((cpym) obj2).a(instant7, instant5, instant4, 0, -1, eqqhVar3, uuid4, uuid3);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            return null;
                        }
                    }, (Executor) this.g.b());
                }
            } else if (b(instant)) {
                cqai a2 = ((cqaj) this.e.b()).a(-1L, instant.toEpochMilli());
                try {
                    boolean k = a2.k();
                    a2.close();
                    if (k) {
                        csjb a3 = cskcVar.a();
                        a3.I("Messages before");
                        a3.H(instant.toEpochMilli());
                        a3.I(" are in sync");
                        a3.A("batchId", uuid2);
                        a3.A("syncId", uuid);
                        a3.r();
                    } else {
                        i2 = 3;
                        if (((coxg) this.f.b()).a(instant3.toEpochMilli()) == 0) {
                            ((coxg) this.f.b()).j(instant.toEpochMilli(), eqqh.EARLIER_MESSAGES_OUT_OF_SYNC);
                        } else {
                            csjb a4 = cskcVar.a();
                            a4.I("Messages before");
                            a4.H(instant.toEpochMilli());
                            a4.I("not in sync; will do incremental sync");
                            a4.A("batchId", uuid2);
                            a4.A("syncId", uuid);
                            a4.r();
                        }
                    }
                } finally {
                }
            }
            i = 4;
            final int i32 = i;
            return ((coxg) this.f.b()).c(instant.isBefore(Instant.EPOCH), instant3.toEpochMilli(), instant.toEpochMilli(), instant2.toEpochMilli(), uuid).h(new emwl() { // from class: cpzc
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    engw r;
                    coxf coxfVar = (coxf) obj;
                    int ordinal = coxfVar.ordinal();
                    if (ordinal == 1) {
                        r = engw.r(eqqd.FULL_SYNC_DO_NOT_START);
                    } else if (ordinal == 2) {
                        r = engw.r(eqqd.FULL_SYNC_DELAYED);
                    } else if (ordinal != 3) {
                        int i4 = engw.d;
                        r = enou.a;
                    } else {
                        r = engw.r(eqqd.PARTIAL_SYNC_QUEUED);
                    }
                    int i5 = i32;
                    final UUID uuid3 = uuid2;
                    final UUID uuid4 = uuid;
                    cpzd cpzdVar = cpzd.this;
                    ((cqcb) cpzdVar.b.b()).a(uuid4, uuid3, i5, r);
                    if (!coxf.CAN_START.equals(coxfVar)) {
                        return null;
                    }
                    final eqqh eqqhVar2 = eqqhVar;
                    final Instant instant4 = instant3;
                    final Instant instant5 = instant2;
                    final Instant instant6 = instant;
                    ((Optional) cpzdVar.a.b()).ifPresent(new Consumer() { // from class: cpzb
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj2) {
                            Instant instant7 = Instant.this;
                            eqqh eqqhVar3 = eqqhVar2;
                            ((cpym) obj2).a(instant7, instant5, instant4, 0, -1, eqqhVar3, uuid4, uuid3);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return null;
                }
            }, (Executor) this.g.b());
        }
        i = i2;
        final int i322 = i;
        return ((coxg) this.f.b()).c(instant.isBefore(Instant.EPOCH), instant3.toEpochMilli(), instant.toEpochMilli(), instant2.toEpochMilli(), uuid).h(new emwl() { // from class: cpzc
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                engw r;
                coxf coxfVar = (coxf) obj;
                int ordinal = coxfVar.ordinal();
                if (ordinal == 1) {
                    r = engw.r(eqqd.FULL_SYNC_DO_NOT_START);
                } else if (ordinal == 2) {
                    r = engw.r(eqqd.FULL_SYNC_DELAYED);
                } else if (ordinal != 3) {
                    int i4 = engw.d;
                    r = enou.a;
                } else {
                    r = engw.r(eqqd.PARTIAL_SYNC_QUEUED);
                }
                int i5 = i322;
                final UUID uuid3 = uuid2;
                final UUID uuid4 = uuid;
                cpzd cpzdVar = cpzd.this;
                ((cqcb) cpzdVar.b.b()).a(uuid4, uuid3, i5, r);
                if (!coxf.CAN_START.equals(coxfVar)) {
                    return null;
                }
                final eqqh eqqhVar2 = eqqhVar;
                final Instant instant4 = instant3;
                final Instant instant5 = instant2;
                final Instant instant6 = instant;
                ((Optional) cpzdVar.a.b()).ifPresent(new Consumer() { // from class: cpzb
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        Instant instant7 = Instant.this;
                        eqqh eqqhVar3 = eqqhVar2;
                        ((cpym) obj2).a(instant7, instant5, instant4, 0, -1, eqqhVar3, uuid4, uuid3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return null;
            }
        }, (Executor) this.g.b());
    }
}
