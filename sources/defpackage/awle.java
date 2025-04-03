package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awle {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator");
    public final ffbr a;
    private final djsi c;
    private final djrk d;
    private final bdtd e;

    public awle(djsi djsiVar, ffbr ffbrVar, djrk djrkVar, bdtd bdtdVar) {
        this.c = djsiVar;
        this.a = ffbrVar;
        this.d = djrkVar;
        this.e = bdtdVar;
    }

    private final engw c() {
        Stream map = Collection.EL.stream(this.c.m()).map(new Function() { // from class: awkw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((avkc) awle.this.a.b()).c(((djrj) obj).a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return (engw) map.collect(endq.a);
    }

    public final Optional a(java.util.Collection collection, awkh awkhVar) {
        final Optional ofNullable = Optional.ofNullable(this.e.f(awkhVar.b()));
        boolean z = false;
        if (ofNullable.isPresent() && Collection.EL.stream(this.c.n()).map(new Function() { // from class: awkx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((djrq) obj).a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).anyMatch(new Predicate() { // from class: awky
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
                return ((Integer) obj).intValue() == ((aztg) Optional.this.get()).e();
            }
        })) {
            z = true;
        }
        Optional map = ofNullable.map(new Function() { // from class: awkz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((aztg) obj).e());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final djsi djsiVar = this.c;
        djsiVar.getClass();
        Optional map2 = map.flatMap(new Function() { // from class: awla
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return djsi.this.g(((Integer) obj).intValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: awlb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((djrj) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final avkc avkcVar = (avkc) this.a.b();
        avkcVar.getClass();
        Optional map3 = map2.map(new Function() { // from class: awlc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return avkc.this.c((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        collection.getClass();
        boolean isPresent = map3.filter(new awku(collection)).isPresent();
        if (z && isPresent) {
            ensk e = b.e();
            e.Y(ente.a, "BugleGroupManagement");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(csux.p, awkhVar.f());
            enrrVar.Y(csux.J, awkhVar.n());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator", "getCurrentSubscriptionUpdate", 206, "GroupSelfMsisdnUpdateCalculator.java")).q("Current subscription still valid, not updating");
            return Optional.empty();
        }
        Optional findFirst = Collection.EL.stream(c()).filter(new awku(collection)).findFirst();
        if (findFirst.isEmpty()) {
            ensk e2 = b.e();
            e2.Y(ente.a, "BugleGroupManagement");
            enrr enrrVar2 = (enrr) e2;
            enrrVar2.Y(csux.p, awkhVar.f());
            enrrVar2.Y(csux.J, awkhVar.n());
            ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator", "getCurrentSubscriptionUpdate", 221, "GroupSelfMsisdnUpdateCalculator.java")).q("Current subscription invalid and no other subscription available, not updating");
            return Optional.empty();
        }
        Optional map4 = this.c.i(this.d.a(((awui) findFirst.get()).d)).map(new Function() { // from class: awkx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((djrq) obj).a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final bdtd bdtdVar = this.e;
        bdtdVar.getClass();
        Optional map5 = map4.map(new Function() { // from class: awld
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return bdtd.this.g(((Integer) obj).intValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (map5.isEmpty()) {
            ensk j = b.j();
            j.Y(ente.a, "BugleGroupManagement");
            enrr enrrVar3 = (enrr) j;
            enrrVar3.Y(csux.p, awkhVar.f());
            enrrVar3.Y(csux.J, awkhVar.n());
            ((enrr) enrrVar3.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator", "getCurrentSubscriptionUpdate", 239, "GroupSelfMsisdnUpdateCalculator.java")).q("Cannot find subscription for other identity in the group, not updating");
            return Optional.empty();
        }
        ensk h = b.h();
        h.Y(ente.a, "BugleGroupManagement");
        enrr enrrVar4 = (enrr) h;
        enrrVar4.Y(csux.p, awkhVar.f());
        enrrVar4.Y(csux.J, awkhVar.n());
        enrrVar4.Y(csux.t, Integer.valueOf(((aztg) map5.get()).e()));
        ((enrr) enrrVar4.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator", "getCurrentSubscriptionUpdate", 249, "GroupSelfMsisdnUpdateCalculator.java")).q("Updating current subscription in group");
        return map5;
    }

    public final Optional b(java.util.Collection collection, awkh awkhVar) {
        Stream stream = Collection.EL.stream(c());
        collection.getClass();
        final enip enipVar = (enip) stream.filter(new awku(collection)).collect(endq.b);
        Optional k = awkhVar.k();
        enipVar.getClass();
        if (((Boolean) k.map(new Function() { // from class: awkv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(enip.this.contains((awui) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue()) {
            ensk e = b.e();
            e.Y(ente.a, "BugleGroupManagement");
            enrr enrrVar = (enrr) e;
            enrrVar.Y(csux.p, awkhVar.f());
            enrrVar.Y(csux.J, awkhVar.n());
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator", "getRcsGroupSelfMsisdnUpdate", 152, "GroupSelfMsisdnUpdateCalculator.java")).q("Self still active in group, not changing rcs group self MSISDN.");
            return Optional.empty();
        }
        Optional findFirst = Collection.EL.stream(enipVar).findFirst();
        ensk h = b.h();
        h.Y(ente.a, "BugleGroupManagement");
        enrr enrrVar2 = (enrr) h;
        enrrVar2.Y(csux.p, awkhVar.f());
        enrrVar2.Y(csux.J, awkhVar.n());
        ((enrr) enrrVar2.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/GroupSelfMsisdnUpdateCalculator", "getRcsGroupSelfMsisdnUpdate", 162, "GroupSelfMsisdnUpdateCalculator.java")).t("Self not active in group, other exists: %s.", Boolean.valueOf(findFirst.isPresent()));
        return findFirst;
    }
}
