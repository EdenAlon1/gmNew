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
public final class awif implements awli {
    public static final /* synthetic */ int b = 0;
    private static final entd c = entd.c("BugleGroupManagement");
    public final ffbr a;
    private final ffbr d;
    private final aolr e;
    private final ffbr f;
    private final ffbr g;

    public awif(ffbr ffbrVar, ffbr ffbrVar2, aolr aolrVar, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.a = ffbrVar;
        this.d = ffbrVar2;
        this.e = aolrVar;
        this.f = ffbrVar3;
        this.g = ffbrVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.awli
    public final /* bridge */ /* synthetic */ awxc a(Object obj, awkh awkhVar) {
        awvy awvyVar = (awvy) obj;
        emxf.b(awvyVar.d.equals(awkhVar.n()), "Mismatch between the RCS conversation Id from the GroupFullState and ConversationsTable");
        Stream filter = Collection.EL.stream(((bczy) this.d.b()).L(awkhVar.f())).filter(new Predicate() { // from class: awhz
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
            public final boolean test(Object obj2) {
                int i = awif.b;
                return ((ParticipantsTable.BindData) obj2).U() != null;
            }
        });
        Function function = new Function() { // from class: awia
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                int i = awif.b;
                String U = ((ParticipantsTable.BindData) obj2).U();
                U.getClass();
                return U;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        final aolr aolrVar = this.e;
        aolrVar.getClass();
        enhk enhkVar = (enhk) filter.collect(endq.a(function, new Function() { // from class: awib
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return aolr.this.q((ParticipantsTable.BindData) obj2);
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }));
        awvn awvnVar = awvyVar.k;
        if (awvnVar == null) {
            awvnVar = awvn.a;
        }
        awvm b2 = awvm.b(awvnVar.c);
        if (b2 == null) {
            b2 = awvm.CAUSE_UNSPECIFIED;
        }
        if (b2.equals(awvm.CAUSE_ONLY_SELF_IN_GROUP)) {
            engi values = enhkVar.values();
            final awwr awwrVar = (awwr) awws.a.createBuilder();
            Stream map = Collection.EL.stream(values).map(new Function() { // from class: awhw
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function2) {
                    return Function$CC.$default$andThen(this, function2);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    aoku aokuVar = (aoku) obj2;
                    avkc avkcVar = (avkc) awif.this.a.b();
                    String n = aokuVar.n();
                    n.getClass();
                    return avkcVar.f(aokuVar, n);
                }

                public final /* synthetic */ Function compose(Function function2) {
                    return Function$CC.$default$compose(this, function2);
                }
            }).map(new Function() { // from class: awhx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function2) {
                    return Function$CC.$default$andThen(this, function2);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    awui awuiVar = (awui) obj2;
                    int i = awif.b;
                    awyg awygVar = (awyg) awyh.a.createBuilder();
                    awygVar.copyOnWrite();
                    awyh awyhVar = (awyh) awygVar.instance;
                    awuiVar.getClass();
                    awyhVar.c = awuiVar;
                    awyhVar.b |= 1;
                    return (awyh) awygVar.build();
                }

                public final /* synthetic */ Function compose(Function function2) {
                    return Function$CC.$default$compose(this, function2);
                }
            });
            awwrVar.getClass();
            map.forEach(new Consumer() { // from class: awhy
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
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "buildGroupUpdateToRemoveAllParticipants", 367, "GroupFullStateParticipantsConverter.java")).r("Group full state notification will remove %s participant(s) from the group in self only error state.", ((awws) awwrVar.instance).c.size());
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
        enhk enhkVar2 = (enhk) Collection.EL.stream(((bczy) this.d.b()).x(awkhVar.f())).filter(new Predicate() { // from class: awic
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
            public final boolean test(Object obj2) {
                int i = awif.b;
                return ((bjjo) obj2).g() != null;
            }
        }).collect(endq.a(new Function() { // from class: awid
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                int i = awif.b;
                String g = ((bjjo) obj2).g();
                g.getClass();
                return g;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new Function() { // from class: awie
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((bjjo) obj2).f();
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }));
        enhd enhdVar = new enhd();
        for (awwq awwqVar : awvyVar.h) {
            awui awuiVar = awwqVar.c;
            if (awuiVar == null) {
                awuiVar = awui.a;
            }
            awuh awuhVar = awuh.PHONE;
            awuh b3 = awuh.b(awuiVar.c);
            if (b3 == null) {
                b3 = awuh.UNKNOWN_TYPE;
            }
            if (awuhVar.equals(b3)) {
                enhdVar.k(awuiVar.d, awwqVar);
            } else {
                ensz enszVar2 = (ensz) ((ensz) c.j()).h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "toGroupUpdate", 124, "GroupFullStateParticipantsConverter.java");
                awuh b4 = awuh.b(awuiVar.c);
                if (b4 == null) {
                    b4 = awuh.UNKNOWN_TYPE;
                }
                enszVar2.D("Group participant does not have a ChatEndpoint of type Phone. Type: %s. ID: %s.", b4.name(), cskt.b(awuiVar.d));
            }
        }
        enhk c2 = enhdVar.c();
        awwr awwrVar2 = (awwr) awws.a.createBuilder();
        enqu it = enpw.c(enhkVar.keySet(), c2.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            awwq awwqVar2 = (awwq) c2.get(str);
            awwqVar2.getClass();
            awwp awwpVar = awwp.DEPARTED;
            awwp b5 = awwp.b(awwqVar2.d);
            if (b5 == null) {
                b5 = awwp.UNKNOWN_STATE;
            }
            if (awwpVar.equals(b5)) {
                ensk n2 = c.n();
                n2.Y(csux.o, awkhVar.f().toString());
                n2.Y(csux.J, awkhVar.n());
                ensn ensnVar = csux.n;
                awui awuiVar2 = awwqVar2.c;
                if (awuiVar2 == null) {
                    awuiVar2 = awui.a;
                }
                n2.Y(ensnVar, cskt.b(awuiVar2.d));
                ensz enszVar3 = (ensz) n2.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "updateBuilderWithParticipantsPresentOnClientAndServer", 210, "GroupFullStateParticipantsConverter.java");
                awwp b6 = awwp.b(awwqVar2.d);
                if (b6 == null) {
                    b6 = awwp.UNKNOWN_STATE;
                }
                enszVar3.t("Found a departed server participant. Generating remove participant GroupOperation. Participant status: %s", b6);
                awyg awygVar = (awyg) awyh.a.createBuilder();
                awui awuiVar3 = awwqVar2.c;
                if (awuiVar3 == null) {
                    awuiVar3 = awui.a;
                }
                awygVar.copyOnWrite();
                awyh awyhVar = (awyh) awygVar.instance;
                awuiVar3.getClass();
                awyhVar.c = awuiVar3;
                awyhVar.b |= 1;
                awxf awxfVar = awwqVar2.e;
                if (awxfVar == null) {
                    awxfVar = awxf.a;
                }
                awygVar.copyOnWrite();
                awyh awyhVar2 = (awyh) awygVar.instance;
                awxfVar.getClass();
                awyhVar2.d = awxfVar;
                awyhVar2.b |= 2;
                awwrVar2.b(awygVar);
            } else {
                awwp b7 = awwp.b(awwqVar2.d);
                if (b7 == null) {
                    b7 = awwp.UNKNOWN_STATE;
                }
                if (b7.equals(enhkVar2.get(str))) {
                    ensk n3 = c.n();
                    n3.Y(csux.o, awkhVar.f().toString());
                    n3.Y(csux.J, awkhVar.n());
                    ensn ensnVar2 = csux.n;
                    awui awuiVar4 = awwqVar2.c;
                    if (awuiVar4 == null) {
                        awuiVar4 = awui.a;
                    }
                    n3.Y(ensnVar2, cskt.b(awuiVar4.d));
                    ((ensz) n3.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "updateBuilderWithParticipantsPresentOnClientAndServer", 251, "GroupFullStateParticipantsConverter.java")).q("Found a participant present on both the server and the client.");
                } else {
                    ensk n4 = c.n();
                    n4.Y(csux.o, awkhVar.f().toString());
                    n4.Y(csux.J, awkhVar.n());
                    ensn ensnVar3 = csux.n;
                    awui awuiVar5 = awwqVar2.c;
                    if (awuiVar5 == null) {
                        awuiVar5 = awui.a;
                    }
                    n4.Y(ensnVar3, cskt.b(awuiVar5.d));
                    ensz enszVar4 = (ensz) n4.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "updateBuilderWithParticipantsPresentOnClientAndServer", 231, "GroupFullStateParticipantsConverter.java");
                    awwp b8 = awwp.b(awwqVar2.d);
                    if (b8 == null) {
                        b8 = awwp.UNKNOWN_STATE;
                    }
                    enszVar4.t("Found an updated server participant. Generating update participant GroupOperation. Participant status: %s", b8);
                    axau axauVar = (axau) axav.a.createBuilder();
                    awui awuiVar6 = awwqVar2.c;
                    if (awuiVar6 == null) {
                        awuiVar6 = awui.a;
                    }
                    axauVar.copyOnWrite();
                    axav axavVar = (axav) axauVar.instance;
                    awuiVar6.getClass();
                    axavVar.c = awuiVar6;
                    axavVar.b |= 1;
                    awwp b9 = awwp.b(awwqVar2.d);
                    if (b9 == null) {
                        b9 = awwp.UNKNOWN_STATE;
                    }
                    axauVar.copyOnWrite();
                    axav axavVar2 = (axav) axauVar.instance;
                    axavVar2.d = b9.e;
                    axavVar2.b |= 2;
                    awxf awxfVar2 = awwqVar2.e;
                    if (awxfVar2 == null) {
                        awxfVar2 = awxf.a;
                    }
                    axauVar.copyOnWrite();
                    axav axavVar3 = (axav) axauVar.instance;
                    awxfVar2.getClass();
                    axavVar3.e = awxfVar2;
                    axavVar3.b |= 4;
                    awwrVar2.copyOnWrite();
                    awws awwsVar2 = (awws) awwrVar2.instance;
                    axav axavVar4 = (axav) axauVar.build();
                    axavVar4.getClass();
                    eygr eygrVar = awwsVar2.d;
                    if (!eygrVar.c()) {
                        awwsVar2.d = eyfy.mutableCopy(eygrVar);
                    }
                    awwsVar2.d.add(axavVar4);
                }
            }
        }
        enqu it2 = enpw.b(c2.keySet(), enhkVar.keySet()).iterator();
        while (it2.hasNext()) {
            awwq awwqVar3 = (awwq) c2.get((String) it2.next());
            awwqVar3.getClass();
            awwp awwpVar2 = awwp.JOINED;
            awwp b10 = awwp.b(awwqVar3.d);
            if (b10 == null) {
                b10 = awwp.UNKNOWN_STATE;
            }
            if (!awwpVar2.equals(b10)) {
                awwp awwpVar3 = awwp.PENDING;
                awwp b11 = awwp.b(awwqVar3.d);
                if (b11 == null) {
                    b11 = awwp.UNKNOWN_STATE;
                }
                if (!awwpVar3.equals(b11)) {
                    awwp awwpVar4 = awwp.UNKNOWN_STATE;
                    awwp b12 = awwp.b(awwqVar3.d);
                    if (b12 == null) {
                        b12 = awwpVar4;
                    }
                    if (!awwpVar4.equals(b12)) {
                        ensk n5 = c.n();
                        n5.Y(csux.o, awkhVar.f().toString());
                        n5.Y(csux.J, awkhVar.n());
                        ensn ensnVar4 = csux.n;
                        awui awuiVar7 = awwqVar3.c;
                        if (awuiVar7 == null) {
                            awuiVar7 = awui.a;
                        }
                        n5.Y(ensnVar4, cskt.b(awuiVar7.d));
                        ((ensz) n5.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "updateBuilderWithParticipantsOnServerButNotOnClient", 301, "GroupFullStateParticipantsConverter.java")).q("Found a departed server participant not present on the client. Ignoring participant.");
                    }
                }
            }
            ensk n6 = c.n();
            n6.Y(csux.o, awkhVar.f().toString());
            n6.Y(csux.J, awkhVar.n());
            ensn ensnVar5 = csux.n;
            awui awuiVar8 = awwqVar3.c;
            if (awuiVar8 == null) {
                awuiVar8 = awui.a;
            }
            n6.Y(ensnVar5, cskt.b(awuiVar8.d));
            ensz enszVar5 = (ensz) n6.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "updateBuilderWithParticipantsOnServerButNotOnClient", 281, "GroupFullStateParticipantsConverter.java");
            awwp b13 = awwp.b(awwqVar3.d);
            if (b13 == null) {
                b13 = awwp.UNKNOWN_STATE;
            }
            enszVar5.t("Found a server participant not present on the client. Generating add participant GroupEvent. Participant status: %s", b13);
            awtq awtqVar = (awtq) awtr.a.createBuilder();
            awui awuiVar9 = awwqVar3.c;
            if (awuiVar9 == null) {
                awuiVar9 = awui.a;
            }
            awtqVar.copyOnWrite();
            awtr awtrVar = (awtr) awtqVar.instance;
            awuiVar9.getClass();
            awtrVar.c = awuiVar9;
            awtrVar.b |= 1;
            awwp b14 = awwp.b(awwqVar3.d);
            if (b14 == null) {
                b14 = awwp.UNKNOWN_STATE;
            }
            awtqVar.copyOnWrite();
            awtr awtrVar2 = (awtr) awtqVar.instance;
            awtrVar2.e = b14.e;
            awtrVar2.b |= 4;
            awxf awxfVar3 = awwqVar3.e;
            if (awxfVar3 == null) {
                awxfVar3 = awxf.a;
            }
            awtqVar.copyOnWrite();
            awtr awtrVar3 = (awtr) awtqVar.instance;
            awxfVar3.getClass();
            awtrVar3.d = awxfVar3;
            awtrVar3.b |= 2;
            awwrVar2.a(awtqVar);
        }
        enqu it3 = enpw.b(enhkVar.keySet(), c2.keySet()).iterator();
        while (it3.hasNext()) {
            String str2 = (String) it3.next();
            ensk n7 = c.n();
            n7.Y(csux.o, awkhVar.f().toString());
            n7.Y(csux.J, awkhVar.n());
            n7.Y(csux.n, cskt.b(str2));
            ((ensz) n7.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateParticipantsConverter", "updateBuilderWithParticipantsOnClientButNotOnServer", 326, "GroupFullStateParticipantsConverter.java")).q("Found a client participant not present on the server. Generating remove participant GroupEvent.");
            awyg awygVar2 = (awyg) awyh.a.createBuilder();
            avkc avkcVar = (avkc) this.a.b();
            aoku aokuVar = (aoku) enhkVar.get(str2);
            aokuVar.getClass();
            awui f = avkcVar.f(aokuVar, str2);
            awygVar2.copyOnWrite();
            awyh awyhVar3 = (awyh) awygVar2.instance;
            f.getClass();
            awyhVar3.c = f;
            awyhVar3.b |= 1;
            awwrVar2.b(awygVar2);
        }
        awxb awxbVar2 = (awxb) awxc.a.createBuilder();
        String str3 = awvyVar.d;
        awxbVar2.copyOnWrite();
        awxc awxcVar3 = (awxc) awxbVar2.instance;
        str3.getClass();
        awxcVar3.b |= 1;
        awxcVar3.c = str3;
        awxbVar2.copyOnWrite();
        awxc awxcVar4 = (awxc) awxbVar2.instance;
        awws awwsVar3 = (awws) awwrVar2.build();
        awwsVar3.getClass();
        awxcVar4.e = awwsVar3;
        awxcVar4.b |= 4;
        if (((atzz) this.f.b()).a()) {
            eygr eygrVar2 = awvyVar.h;
            if (eygrVar2.size() == 1) {
                awui awuiVar10 = ((awwq) eygrVar2.get(0)).c;
                if (awuiVar10 == null) {
                    awuiVar10 = awui.a;
                }
                if (!awuiVar10.equals(awkhVar.c())) {
                    ((akzt) this.g.b()).c("Bugle.RcsGroups.NotificationPipeline.FullState.OnlyOneParticipantButNotSelf.Count");
                }
                awvo awvoVar = (awvo) awvp.a.createBuilder();
                awvoVar.copyOnWrite();
                awvp awvpVar = (awvp) awvoVar.instance;
                awvpVar.b |= 1;
                awvpVar.c = true;
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
