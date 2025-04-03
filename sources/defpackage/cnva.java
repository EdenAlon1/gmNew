package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnva implements Runnable {
    final /* synthetic */ cnvb a;
    final /* synthetic */ cnuh b;

    public cnva(cnvb cnvbVar, cnuh cnuhVar) {
        this.a = cnvbVar;
        this.b = cnuhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessageCoreData n;
        List list = cnvb.a;
        cnvb cnvbVar = this.a;
        Optional p = cnvbVar.c.p(cnvbVar.d.l());
        p.getClass();
        bseh bsehVar = (bseh) fflm.b(p);
        if (bsehVar == null || (n = ((bdmq) cnvbVar.e.b()).n(bsehVar.C())) == null || n.cC() || cnvb.a.contains(Integer.valueOf(n.k()))) {
            return;
        }
        bdmq bdmqVar = (bdmq) cnvbVar.e.b();
        String[] strArr = MessagesTable.a;
        buxz buxzVar = new buxz();
        buxzVar.m(bsehVar.C());
        buxzVar.aj(239);
        MessageCoreData m = bdmqVar.m(new buxs(buxzVar));
        bdmq bdmqVar2 = (bdmq) cnvbVar.e.b();
        final ConversationIdType C = bsehVar.C();
        ekzz f = eleg.f("MessageDatabaseOperations#getLatestEndOfEmergencyMessage");
        try {
            bwdf c = PartsTable.c();
            c.h(new Function() { // from class: bdlw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bwdm bwdmVar = (bwdm) obj;
                    cskc cskcVar = bdmq.a;
                    bwdmVar.i(ConversationIdType.this);
                    bwdmVar.f("application/x-end-of-emergency-proto");
                    return bwdmVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            c.e(new Function() { // from class: bdlx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cskc cskcVar = bdmq.a;
                    return new bwau[]{((bwat) obj).b};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final bwdd b = c.b();
            final engw v = engw.v(247, 246, 249, 248, 250);
            buxo d = MessagesTable.d();
            d.z("getLatestEndOfEmergencyOrTombstoneMessage");
            d.h(new Function() { // from class: bdly
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar2 = (buxz) obj;
                    cskc cskcVar = bdmq.a;
                    buxzVar2.m(ConversationIdType.this);
                    return buxzVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.e(new Function() { // from class: bdlz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buum buumVar = (buum) obj;
                    cskc cskcVar = bdmq.a;
                    return new buun[]{buumVar.a, buumVar.i, buumVar.j};
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.h(new Function() { // from class: bdma
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    buxz buxzVar2 = (buxz) obj;
                    cskc cskcVar = bdmq.a;
                    final engw engwVar = engw.this;
                    final bwdd bwddVar = b;
                    buxzVar2.b(new Function() { // from class: bdlf
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            buxz buxzVar3 = (buxz) obj2;
                            cskc cskcVar2 = bdmq.a;
                            buxzVar3.ai(engw.this);
                            return buxzVar3;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }, new Function() { // from class: bdlg
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            buxz buxzVar3 = (buxz) obj2;
                            cskc cskcVar2 = bdmq.a;
                            buxzVar3.t(bwdd.this);
                            return buxzVar3;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    return buxzVar2;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            d.d(new buxl(MessagesTable.c.i, false));
            d.x(1);
            Optional findFirst = Collection.EL.stream(bdmqVar2.J(d.b())).findFirst();
            f.close();
            if (!findFirst.isPresent() || (m != null && ((MessageCoreData) findFirst.get()).o() <= m.o())) {
                cnuh cnuhVar = this.b;
                ensk j = cnvb.b.j();
                j.Y(ente.a, "BugleSatellite");
                ((enrr) j.h("com/google/android/apps/messaging/shared/satelliteapi/session/EmergencyConversationTombstoneEnforcer", "ensureTombstoneAlignedWithSatelliteSession", 127, "EmergencyConversationTombstoneEnforcer.kt")).t("eSOS Conversation missing tombstone while satellite mode is [%s]. Adding one now.", cnuhVar.name());
                engw engwVar = (engw) cnvbVar.h.a().c();
                if (engwVar.size() != 1) {
                    ensk j2 = cnvb.b.j();
                    j2.Y(ente.a, "BugleSatellite");
                    ((enrr) j2.h("com/google/android/apps/messaging/shared/satelliteapi/session/EmergencyConversationTombstoneEnforcer", "insertEmergencyUnexpectedEnd", 177, "EmergencyConversationTombstoneEnforcer.kt")).r("Unexpected number of satellite self identities %s. Skipping tombstone insert.", engwVar.size());
                    return;
                }
                cnqv cnqvVar = cnvbVar.g;
                engwVar.getClass();
                String b2 = ((aqux) ffdx.K(engwVar)).g().b();
                SelfIdentityId g = ((aqux) ffdx.K(engwVar)).g();
                ConversationIdType C2 = bsehVar.C();
                C2.getClass();
                Instant f2 = cnvbVar.j.f();
                f2.getClass();
                MessageCoreData a = cnqvVar.a(b2, g, C2, eykn.b(f2), cnqt.e);
                cnvbVar.f.a(a);
                ((bdfl) cnvbVar.k.b()).e(bsehVar.C(), a.B(), Long.valueOf(a.o()), byyt.UNARCHIVED, false);
            }
        } finally {
        }
    }
}
