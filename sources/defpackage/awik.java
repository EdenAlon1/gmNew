package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awik implements awli {
    public static final /* synthetic */ int a = 0;
    private static final entd b = entd.c("BugleGroupManagement");
    private final awle c;

    public awik(awle awleVar) {
        this.c = awleVar;
    }

    public static awwv b(awwq awwqVar) {
        awwp awwpVar = awwp.DEPARTED;
        awwp b2 = awwp.b(awwqVar.d);
        if (b2 == null) {
            b2 = awwp.UNKNOWN_STATE;
        }
        if (!awwpVar.equals(b2)) {
            return awwv.MEMBERSHIP_CONFIRMED;
        }
        awui awuiVar = awwqVar.c;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        awxf awxfVar = awwqVar.e;
        if (awxfVar == null) {
            awxfVar = awxf.a;
        }
        awui awuiVar2 = awxfVar.c;
        if (awuiVar2 == null) {
            awuiVar2 = awui.a;
        }
        return awuiVar.equals(awuiVar2) ? awwv.LEFT_GROUP : awwv.KICKED_OUT;
    }

    @Override // defpackage.awli
    public final /* bridge */ /* synthetic */ awxc a(Object obj, awkh awkhVar) {
        awvy awvyVar = (awvy) obj;
        awxb awxbVar = (awxb) awxc.a.createBuilder();
        String a2 = awkhVar.f().a();
        awxbVar.copyOnWrite();
        awxc awxcVar = (awxc) awxbVar.instance;
        a2.getClass();
        awxcVar.b |= 1;
        awxcVar.c = a2;
        final awwt awwtVar = (awwt) awww.a.createBuilder();
        awui awuiVar = awvyVar.l;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        awxbVar.copyOnWrite();
        awxc awxcVar2 = (awxc) awxbVar.instance;
        awuiVar.getClass();
        awxcVar2.l = awuiVar;
        awxcVar2.b |= 512;
        Stream map = Collection.EL.stream(awvyVar.h).filter(new Predicate() { // from class: awii
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
                return awik.b((awwq) obj2).equals(awwv.MEMBERSHIP_CONFIRMED);
            }
        }).map(new Function() { // from class: awij
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                awui awuiVar2 = ((awwq) obj2).c;
                return awuiVar2 == null ? awui.a : awuiVar2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        engw engwVar = (engw) map.collect(endq.a);
        Optional b2 = this.c.b(engwVar, awkhVar);
        awwtVar.getClass();
        b2.ifPresent(new Consumer() { // from class: awig
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                awwt awwtVar2 = awwt.this;
                awui awuiVar2 = (awui) obj2;
                awwtVar2.copyOnWrite();
                awww awwwVar = (awww) awwtVar2.instance;
                awww awwwVar2 = awww.a;
                awuiVar2.getClass();
                awwwVar.e = awuiVar2;
                awwwVar.b |= 4;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.c.a(engwVar, awkhVar).ifPresent(new Consumer() { // from class: awih
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj2) {
                int i2 = awik.a;
                String str = ((SelfIdentityIdImpl) ((aztg) obj2).g()).a;
                awwt awwtVar2 = awwt.this;
                awwtVar2.copyOnWrite();
                awww awwwVar = (awww) awwtVar2.instance;
                awww awwwVar2 = awww.a;
                awwwVar.b |= 8;
                awwwVar.f = str;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        for (awwq awwqVar : awvyVar.h) {
            awui awuiVar2 = awvyVar.l;
            if (awuiVar2 == null) {
                awuiVar2 = awui.a;
            }
            awui awuiVar3 = awwqVar.c;
            if (awuiVar3 == null) {
                awuiVar3 = awui.a;
            }
            if (awuiVar2.equals(awuiVar3)) {
                awwv b3 = b(awwqVar);
                ensk n = b.n();
                n.Y(csux.o, awkhVar.f().toString());
                n.Y(csux.J, awkhVar.n());
                ((ensz) n.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateSelfMembershipConverter", "toGroupUpdate", 84, "GroupFullStateSelfMembershipConverter.java")).t("Explicit self participant membership state found %s", b3);
                awwtVar.copyOnWrite();
                awww awwwVar = (awww) awwtVar.instance;
                awwwVar.c = b3.e;
                awwwVar.b |= 1;
                awxf awxfVar = awxf.a;
                awxf awxfVar2 = awwqVar.e;
                if (awxfVar2 == null) {
                    awxfVar2 = awxfVar;
                }
                if (!awxfVar.equals(awxfVar2)) {
                    awxf awxfVar3 = awwqVar.e;
                    if (awxfVar3 == null) {
                        awxfVar3 = awxf.a;
                    }
                    awwtVar.copyOnWrite();
                    awww awwwVar2 = (awww) awwtVar.instance;
                    awxfVar3.getClass();
                    awwwVar2.d = awxfVar3;
                    awwwVar2.b |= 2;
                }
                awxbVar.copyOnWrite();
                awxc awxcVar3 = (awxc) awxbVar.instance;
                awww awwwVar3 = (awww) awwtVar.build();
                awwwVar3.getClass();
                awxcVar3.i = awwwVar3;
                awxcVar3.b |= 64;
                return (awxc) awxbVar.build();
            }
        }
        awwv awwvVar = awwv.KICKED_OUT;
        ensk n2 = b.n();
        n2.Y(csux.o, awkhVar.f().toString());
        n2.Y(csux.J, awkhVar.n());
        ((ensz) n2.h("com/google/android/apps/messaging/shared/chatapi/groups/fullstate/GroupFullStateSelfMembershipConverter", "toGroupUpdate", 106, "GroupFullStateSelfMembershipConverter.java")).q("Explicit self participant membership state not found. Assuming has been removed from the group.");
        awwtVar.copyOnWrite();
        awww awwwVar4 = (awww) awwtVar.instance;
        awwwVar4.c = awwvVar.e;
        awwwVar4.b |= 1;
        awxbVar.copyOnWrite();
        awxc awxcVar4 = (awxc) awxbVar.instance;
        awww awwwVar5 = (awww) awwtVar.build();
        awwwVar5.getClass();
        awxcVar4.i = awwwVar5;
        awxcVar4.b |= 64;
        return (awxc) awxbVar.build();
    }
}
