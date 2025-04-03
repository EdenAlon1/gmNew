package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alrh extends ffhv implements ffjm {
    final /* synthetic */ alri a;
    final /* synthetic */ MessageCoreData b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alrh(alri alriVar, MessageCoreData messageCoreData, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = alriVar;
        this.b = messageCoreData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((alrh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2;
        ffci.b(obj);
        Set set = alri.b;
        MessageCoreData messageCoreData = this.b;
        if (!set.contains(Integer.valueOf(messageCoreData.d())) || messageCoreData.cB() || messageCoreData.k() != 100 || messageCoreData.as().length() <= 0) {
            return Optional.empty();
        }
        final List g = this.b.d() == 3 ? ffdx.g(new Integer(0), new Integer(1)) : ffdx.b(new Integer(3));
        MessageCoreData messageCoreData2 = this.b;
        ffbr ffbrVar = this.a.d;
        long o = messageCoreData2.o();
        Object b = ffbrVar.b();
        b.getClass();
        final long millis = o - eykn.c((eyev) b).toMillis();
        buxo d = MessagesTable.d();
        d.z("findDuplicateMessageIdAsync");
        final MessageCoreData messageCoreData3 = this.b;
        d.h(new Function() { // from class: alqz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj3) {
                buxz buxzVar = (buxz) obj3;
                buxzVar.m(MessageCoreData.this.z());
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final MessageCoreData messageCoreData4 = this.b;
        d.h(new Function() { // from class: alra
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj3) {
                buxz buxzVar = (buxz) obj3;
                buxzVar.X(MessageCoreData.this.aA());
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.h(new Function() { // from class: alrb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj3) {
                buxz buxzVar = (buxz) obj3;
                buxzVar.af(100);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.h(new Function() { // from class: alrc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj3) {
                buxz buxzVar = (buxz) obj3;
                buxzVar.aq(new dtrw("messages.message_protocol", 3, buxz.at(g), true));
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.h(new Function() { // from class: alrd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj3) {
                buxz buxzVar = (buxz) obj3;
                buxzVar.N(0);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final MessageCoreData messageCoreData5 = this.b;
        d.h(new Function() { // from class: alre
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj3) {
                buxz buxzVar = (buxz) obj3;
                buxzVar.W(((SelfIdentityIdImpl) MessageCoreData.this.v()).a);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final MessageCoreData messageCoreData6 = this.b;
        d.h(new Function() { // from class: alrf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj3) {
                buxz buxzVar = (buxz) obj3;
                buxzVar.U(MessageCoreData.this.o());
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        d.h(new Function() { // from class: alrg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj3) {
                buxz buxzVar = (buxz) obj3;
                buxzVar.R(millis);
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw y = d.b().y();
        y.getClass();
        alri alriVar = this.a;
        MessageCoreData messageCoreData7 = this.b;
        enqv it = y.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            MessageCoreData v = ((bdmq) alriVar.c.b()).v(((MessagesTable.BindData) obj2).D());
            if (v != null && v.c() == messageCoreData7.c() && ffkj.e(v.as(), messageCoreData7.as())) {
                break;
            }
        }
        MessagesTable.BindData bindData = (MessagesTable.BindData) obj2;
        if (bindData == null) {
            return Optional.empty();
        }
        ensk h = alri.a.h();
        h.Y(ente.a, "BugleUsageStatistics");
        enrr enrrVar = (enrr) h;
        enrrVar.Y(csux.b, bindData.D());
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/analytics/statistics/DuplicateMessageChecker$findDuplicateMessageIdAsync$1", "invokeSuspend", 84, "DuplicateMessageChecker.kt")).q("Found a duplicate message.");
        return Optional.of(new Long(bindData.A()));
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new alrh(this.a, this.b, ffguVar);
    }
}
