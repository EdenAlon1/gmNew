package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awjb implements awli {
    public static final /* synthetic */ int b = 0;
    private static final entd c = entd.c("BugleGroupManagement");
    public final ffbr a;
    private final ffbr d;
    private final aolr e;
    private final ffbr f;

    public awjb(ffbr ffbrVar, aolr aolrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.d = ffbrVar;
        this.e = aolrVar;
        this.a = ffbrVar2;
        this.f = ffbrVar3;
    }

    private final engw b(final awkh awkhVar, final boolean z) {
        Stream filter = Collection.EL.stream(((bczy) this.d.b()).L(awkhVar.f())).filter(new Predicate() { // from class: awix
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i = awjb.b;
                return ((ParticipantsTable.BindData) obj).U() != null;
            }
        });
        final aolr aolrVar = this.e;
        aolrVar.getClass();
        Stream filter2 = filter.map(new Function() { // from class: awiy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return aolr.this.q((ParticipantsTable.BindData) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: awiz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                aoku aokuVar = (aoku) obj;
                avkc avkcVar = (avkc) awjb.this.a.b();
                String n = aokuVar.n();
                n.getClass();
                return avkcVar.f(aokuVar, n);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: awja
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                awui awuiVar = (awui) obj;
                int i = awjb.b;
                return z || !awuiVar.equals(awkhVar.c());
            }
        });
        int i = engw.d;
        return (engw) filter2.collect(endq.a);
    }

    @Override // defpackage.awli
    public final /* bridge */ /* synthetic */ awxc a(Object obj, awkh awkhVar) {
        awvt awvtVar = (awvt) obj;
        emxf.b(awvtVar.e.equals(awkhVar.n()), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        awvn awvnVar = awvtVar.q;
        if (awvnVar == null) {
            awvnVar = awvn.a;
        }
        awvm b2 = awvm.b(awvnVar.c);
        if (b2 == null) {
            b2 = awvm.CAUSE_UNSPECIFIED;
        }
        if (b2.equals(awvm.CAUSE_ONLY_SELF_IN_GROUP)) {
            final awwr awwrVar = (awwr) awws.a.createBuilder();
            Stream map = Collection.EL.stream(b(awkhVar, true)).map(new Function() { // from class: awiu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    awui awuiVar = (awui) obj2;
                    int i = awjb.b;
                    awyg awygVar = (awyg) awyh.a.createBuilder();
                    awygVar.copyOnWrite();
                    awyh awyhVar = (awyh) awygVar.instance;
                    awuiVar.getClass();
                    awyhVar.c = awuiVar;
                    awyhVar.b |= 1;
                    return (awyh) awygVar.build();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            awwrVar.getClass();
            map.forEach(new Consumer() { // from class: awiv
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj2) {
                    awwr.this.c((awyh) obj2);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (((awws) awwrVar.instance).c.size() > 0) {
                ensz enszVar = (ensz) c.h();
                enszVar.Y(csux.o, awkhVar.f().toString());
                enszVar.Y(csux.J, awkhVar.n());
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventParticipantsConverter", "buildGroupUpdateToRemoveAllParticipants", 152, "GroupEventParticipantsConverter.java")).r("Group event will remove %s participant(s) from the group in self only error state.", ((awws) awwrVar.instance).c.size());
            }
            awxb awxbVar = (awxb) awxc.a.createBuilder();
            String n = awkhVar.n();
            awxbVar.copyOnWrite();
            awxc awxcVar = (awxc) awxbVar.instance;
            awxcVar.b |= 1;
            awxcVar.c = n;
            awxbVar.copyOnWrite();
            awxc awxcVar2 = (awxc) awxbVar.instance;
            awws awwsVar = (awws) awwrVar.build();
            awwsVar.getClass();
            awxcVar2.e = awwsVar;
            awxcVar2.b |= 4;
            return (awxc) awxbVar.build();
        }
        awwr awwrVar2 = (awwr) awws.a.createBuilder();
        for (awui awuiVar : awvtVar.g) {
            ensk n2 = c.n();
            n2.Y(csux.o, awkhVar.f().toString());
            n2.Y(csux.J, awkhVar.n());
            n2.Y(csux.n, cskt.b(awuiVar.d));
            ((ensz) n2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventParticipantsConverter", "toGroupUpdate", 90, "GroupEventParticipantsConverter.java")).q("Participant from the server to add to the client.");
            awtq awtqVar = (awtq) awtr.a.createBuilder();
            awtqVar.copyOnWrite();
            awtr awtrVar = (awtr) awtqVar.instance;
            awuiVar.getClass();
            awtrVar.c = awuiVar;
            awtrVar.b |= 1;
            awxf awxfVar = awvtVar.p;
            if (awxfVar == null) {
                awxfVar = awxf.a;
            }
            awtqVar.copyOnWrite();
            awtr awtrVar2 = (awtr) awtqVar.instance;
            awxfVar.getClass();
            awtrVar2.d = awxfVar;
            awtrVar2.b |= 2;
            awwrVar2.a(awtqVar);
        }
        for (awui awuiVar2 : awvtVar.h) {
            ensk n3 = c.n();
            n3.Y(csux.o, awkhVar.f().toString());
            n3.Y(csux.J, awkhVar.n());
            n3.Y(csux.n, cskt.b(awuiVar2.d));
            ((ensz) n3.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventParticipantsConverter", "toGroupUpdate", 108, "GroupEventParticipantsConverter.java")).q("Participant from the server to remove from the client.");
            awyg awygVar = (awyg) awyh.a.createBuilder();
            awygVar.copyOnWrite();
            awyh awyhVar = (awyh) awygVar.instance;
            awuiVar2.getClass();
            awyhVar.c = awuiVar2;
            awyhVar.b |= 1;
            awxf awxfVar2 = awvtVar.p;
            if (awxfVar2 == null) {
                awxfVar2 = awxf.a;
            }
            awygVar.copyOnWrite();
            awyh awyhVar2 = (awyh) awygVar.instance;
            awxfVar2.getClass();
            awyhVar2.d = awxfVar2;
            awyhVar2.b |= 2;
            awwrVar2.b(awygVar);
        }
        awxb awxbVar2 = (awxb) awxc.a.createBuilder();
        String n4 = awkhVar.n();
        awxbVar2.copyOnWrite();
        awxc awxcVar3 = (awxc) awxbVar2.instance;
        awxcVar3.b |= 1;
        awxcVar3.c = n4;
        awxbVar2.copyOnWrite();
        awxc awxcVar4 = (awxc) awxbVar2.instance;
        awws awwsVar2 = (awws) awwrVar2.build();
        awwsVar2.getClass();
        awxcVar4.e = awwsVar2;
        awxcVar4.b |= 4;
        if (((atzz) this.f.b()).a()) {
            awws awwsVar3 = ((awxc) awxbVar2.instance).e;
            if (awwsVar3 == null) {
                awwsVar3 = awws.a;
            }
            if (awwsVar3.b.size() <= 0 && enpw.b((enip) Collection.EL.stream(b(awkhVar, false)).collect(endq.b), (enip) Collection.EL.stream(awwsVar3.c).map(new Function() { // from class: awiw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    awui awuiVar3 = ((awyh) obj2).c;
                    return awuiVar3 == null ? awui.a : awuiVar3;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(endq.b)).isEmpty()) {
                ensz enszVar2 = (ensz) c.h();
                enszVar2.Y(csux.p, awkhVar.f());
                enszVar2.Y(csux.J, awkhVar.n());
                ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventParticipantsConverter", "isOnlySelfInGroup", 184, "GroupEventParticipantsConverter.java")).q("RCS_GROUP_SELF_ONLY state detected");
                awvo awvoVar = (awvo) awvp.a.createBuilder();
                boolean z = !awkhVar.d().equals(ayhd.RCS_GROUP_SELF_ONLY);
                awvoVar.copyOnWrite();
                awvp awvpVar = (awvp) awvoVar.instance;
                awvpVar.b |= 1;
                awvpVar.c = z;
                ayhd ayhdVar = ayhd.RCS_GROUP_SELF_ONLY;
                awvoVar.copyOnWrite();
                awvp awvpVar2 = (awvp) awvoVar.instance;
                awvpVar2.d = ayhdVar.a();
                awvpVar2.b |= 2;
                awxbVar2.copyOnWrite();
                awxc awxcVar5 = (awxc) awxbVar2.instance;
                awvp awvpVar3 = (awvp) awvoVar.build();
                awvpVar3.getClass();
                awxcVar5.j = awvpVar3;
                awxcVar5.b |= 128;
            }
        }
        return (awxc) awxbVar2.build();
    }
}
