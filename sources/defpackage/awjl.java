package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awjl implements awli {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventSelfMembershipConverter");
    public final ffbr b;
    private final awle c;
    private final ffbr d;

    public awjl(awle awleVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.c = awleVar;
        this.d = ffbrVar;
        this.b = ffbrVar2;
    }

    @Override // defpackage.awli
    public final /* bridge */ /* synthetic */ awxc a(Object obj, awkh awkhVar) {
        awvt awvtVar = (awvt) obj;
        awxb awxbVar = (awxb) awxc.a.createBuilder();
        String a2 = awkhVar.f().a();
        awxbVar.copyOnWrite();
        awxc awxcVar = (awxc) awxbVar.instance;
        a2.getClass();
        awxcVar.b |= 1;
        awxcVar.c = a2;
        final awwt awwtVar = (awwt) awww.a.createBuilder();
        awui awuiVar = awvtVar.r;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        awxbVar.copyOnWrite();
        awxc awxcVar2 = (awxc) awxbVar.instance;
        awuiVar.getClass();
        awxcVar2.l = awuiVar;
        awxcVar2.b |= 512;
        Stream[] streamArr = new Stream[3];
        streamArr[0] = Collection.EL.stream(((bczy) this.d.b()).x(awkhVar.f())).filter(new Predicate() { // from class: awjc
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
                return ((bjjo) obj2).f() == awwp.JOINED;
            }
        }).map(new Function() { // from class: awjd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((bjjo) obj2).g();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: awje
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                awjl awjlVar = awjl.this;
                String str = (String) obj2;
                if (str == null) {
                    return Optional.empty();
                }
                try {
                    return Optional.of(((avkc) awjlVar.b.b()).a(str, false));
                } catch (avkg unused) {
                    ensk j = awjl.a.j();
                    j.Y(ente.a, "BugleGroupManagement");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventSelfMembershipConverter", "toChatEndpoint", 190, "GroupEventSelfMembershipConverter.java")).q("Ignoring invalid participant in group");
                    return Optional.empty();
                }
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: awjf
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
                return ((Optional) obj2).isPresent();
            }
        }).map(new Function() { // from class: awjg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return (awui) ((Optional) obj2).get();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        streamArr[1] = Collection.EL.stream(awvtVar.g);
        awui awuiVar2 = awvtVar.r;
        if (awuiVar2 == null) {
            awuiVar2 = awui.a;
        }
        streamArr[2] = Stream.CC.of(awuiVar2);
        enip d = enpw.b((Set) Stream.CC.of((Object[]) streamArr).flatMap(new Function() { // from class: awjh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return (Stream) obj2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.b), enip.o(awvtVar.h)).d();
        Optional b = this.c.b(d, awkhVar);
        awwtVar.getClass();
        b.ifPresent(new Consumer() { // from class: awji
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                awwt awwtVar2 = awwt.this;
                awui awuiVar3 = (awui) obj2;
                awwtVar2.copyOnWrite();
                awww awwwVar = (awww) awwtVar2.instance;
                awww awwwVar2 = awww.a;
                awuiVar3.getClass();
                awwwVar.e = awuiVar3;
                awwwVar.b |= 4;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.c.a(d, awkhVar).map(new Function() { // from class: awjj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                return ((aztg) obj2).g();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).ifPresent(new Consumer() { // from class: awjk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                String c = ((SelfIdentityId) obj2).c();
                awwt awwtVar2 = awwt.this;
                awwtVar2.copyOnWrite();
                awww awwwVar = (awww) awwtVar2.instance;
                awww awwwVar2 = awww.a;
                awwwVar.b |= 8;
                awwwVar.f = c;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        awui awuiVar3 = awvtVar.r;
        if (awuiVar3 == null) {
            awuiVar3 = awui.a;
        }
        awui awuiVar4 = ((awww) awwtVar.instance).e;
        if (awuiVar4 == null) {
            awuiVar4 = awui.a;
        }
        if (!d.contains(awuiVar3) && !awuiVar4.equals(awuiVar3) && !awkhVar.c().equals(awuiVar3)) {
            ensk e = a.e();
            e.Y(ente.a, "BugleGroupManagement");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(csux.p, awkhVar.f());
            enrrVar.Y(csux.J, awkhVar.n());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventSelfMembershipConverter", "toGroupUpdate", 103, "GroupEventSelfMembershipConverter.java")).t("Self participant is not member of the group, returning %s", awwv.UNKNOWN_STATE);
            awwv awwvVar = awwv.UNKNOWN_STATE;
            awwtVar.copyOnWrite();
            awww awwwVar = (awww) awwtVar.instance;
            awwwVar.c = awwvVar.e;
            awwwVar.b |= 1;
            awxbVar.copyOnWrite();
            awxc awxcVar3 = (awxc) awxbVar.instance;
            awww awwwVar2 = (awww) awwtVar.build();
            awwwVar2.getClass();
            awxcVar3.i = awwwVar2;
            awxcVar3.b |= 64;
            return (awxc) awxbVar.build();
        }
        awui awuiVar5 = awvtVar.r;
        if (awuiVar5 == null) {
            awuiVar5 = awui.a;
        }
        Iterator<E> it = awvtVar.h.iterator();
        while (it.hasNext()) {
            if (awuiVar5.equals((awui) it.next())) {
                awxf awxfVar = awvtVar.p;
                if (awxfVar == null) {
                    awxfVar = awxf.a;
                }
                awui awuiVar6 = awxfVar.c;
                if (awuiVar6 == null) {
                    awuiVar6 = awui.a;
                }
                awwv awwvVar2 = awuiVar5.equals(awuiVar6) ? awwv.LEFT_GROUP : awwv.KICKED_OUT;
                ensk e2 = a.e();
                e2.Y(ente.a, "BugleGroupManagement");
                enrr enrrVar2 = (enrr) e2;
                enrrVar2.Y(csux.p, awkhVar.f());
                enrrVar2.Y(csux.J, awkhVar.n());
                ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupevent/GroupEventSelfMembershipConverter", "toGroupUpdate", 126, "GroupEventSelfMembershipConverter.java")).t("Self participant membership changed, reason %s", awwvVar2);
                awwtVar.copyOnWrite();
                awww awwwVar3 = (awww) awwtVar.instance;
                awwwVar3.c = awwvVar2.e;
                awwwVar3.b |= 1;
                awxf awxfVar2 = awxf.a;
                awxf awxfVar3 = awvtVar.p;
                if (awxfVar3 == null) {
                    awxfVar3 = awxfVar2;
                }
                if (!awxfVar2.equals(awxfVar3)) {
                    awxf awxfVar4 = awvtVar.p;
                    if (awxfVar4 == null) {
                        awxfVar4 = awxf.a;
                    }
                    awwtVar.copyOnWrite();
                    awww awwwVar4 = (awww) awwtVar.instance;
                    awxfVar4.getClass();
                    awwwVar4.d = awxfVar4;
                    awwwVar4.b |= 2;
                }
                awxbVar.copyOnWrite();
                awxc awxcVar4 = (awxc) awxbVar.instance;
                awww awwwVar5 = (awww) awwtVar.build();
                awwwVar5.getClass();
                awxcVar4.i = awwwVar5;
                awxcVar4.b |= 64;
                return (awxc) awxbVar.build();
            }
        }
        awwv awwvVar3 = awwv.UNKNOWN_STATE;
        awwtVar.copyOnWrite();
        awww awwwVar6 = (awww) awwtVar.instance;
        awwwVar6.c = awwvVar3.e;
        awwwVar6.b |= 1;
        awxbVar.copyOnWrite();
        awxc awxcVar5 = (awxc) awxbVar.instance;
        awww awwwVar7 = (awww) awwtVar.build();
        awwwVar7.getClass();
        awxcVar5.i = awwwVar7;
        awxcVar5.b |= 64;
        return (awxc) awxbVar.build();
    }
}
