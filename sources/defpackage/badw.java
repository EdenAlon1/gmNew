package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.ExpireWapPushSiMessageAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class badw {
    private final ffbr a;
    private final ffbr b;
    private final cqoh c;
    private final ffbr d;
    private final bbel e;
    private final ayif f;

    public badw(ffbr ffbrVar, ffbr ffbrVar2, cqoh cqohVar, ffbr ffbrVar3, bbel bbelVar, ayif ayifVar) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = cqohVar;
        this.d = ffbrVar3;
        this.e = bbelVar;
        this.f = ayifVar;
    }

    public final long a() {
        final ConversationIdType m;
        long j = -1;
        if (((Boolean) ayhv.a.e()).booleanValue()) {
            Optional q = this.f.q("ʼWAP_PUSH_SI!ʼ");
            if (q.isEmpty()) {
                ExpireWapPushSiMessageAction.a.p("no WAP Push SI messages.");
                return -1L;
            }
            m = ((bseh) q.get()).C();
        } else {
            long e = ((covs) this.d.b()).e("ʼWAP_PUSH_SI!ʼ");
            if (e < 0) {
                ExpireWapPushSiMessageAction.a.r("deleteExpiredMessages: can not get thread.");
                return -1L;
            }
            m = ((bczy) this.b.b()).m(e);
            if (m == null) {
                ExpireWapPushSiMessageAction.a.p("no WAP Push SI messages. (null)");
                return -1L;
            }
            if (m.b()) {
                ExpireWapPushSiMessageAction.a.p("no WAP Push SI messages. (empty)");
                return -1L;
            }
        }
        long epochMilli = this.c.f().toEpochMilli();
        long a = cpdl.a();
        csjb a2 = ExpireWapPushSiMessageAction.a.a();
        a2.I("time zone offset");
        a2.H(TimeUnit.MILLISECONDS.toHours(a));
        a2.I("hour(s).");
        a2.r();
        buxo d = MessagesTable.d();
        d.z("deleteExpiredMessages");
        d.h(new Function() { // from class: badv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buxz buxzVar = (buxz) obj;
                buxzVar.m(ConversationIdType.this);
                buxzVar.K(2);
                buxzVar.aq(new dtwe("messages.mms_expiry", 7, 0L));
                return buxzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        buuo buuoVar = (buuo) d.b().o();
        ArrayList arrayList = null;
        while (true) {
            try {
                if (!buuoVar.moveToNext()) {
                    break;
                }
                long j2 = buuoVar.j();
                if (j2 > 0) {
                    long j3 = j2 + a;
                    if (j3 > epochMilli) {
                        j = j3;
                        break;
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(buuoVar.q());
                }
            } catch (Throwable th) {
                try {
                    buuoVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        buuoVar.close();
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                MessageIdType messageIdType = (MessageIdType) arrayList.get(i);
                csjb c = ExpireWapPushSiMessageAction.a.c();
                c.I("delete expired");
                c.d(messageIdType);
                c.r();
                this.e.a(((bdmq) this.a.b()).z(messageIdType));
            }
        }
        return j;
    }
}
