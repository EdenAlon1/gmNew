package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buxz extends duav {
    public final void A(MessageIdType messageIdType) {
        aq(new dtrt("messages._id", 2, Long.valueOf(bdhb.a(messageIdType))));
    }

    public final void B(boolean z) {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 30010) {
            dtub.w("is_hidden", intValue);
        }
        aq(new dtwe("messages.is_hidden", 1, Integer.valueOf(z ? 1 : 0)));
    }

    public final void C(Optional optional) {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 60370) {
            dtub.w("message_persistence_id", intValue);
        }
        aq(new dtrt("messages.message_persistence_id", 1, bdhj.b(optional)));
    }

    public final void D() {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 60370) {
            dtub.w("message_persistence_id", intValue);
        }
        aq(new dtrx("messages.message_persistence_id", 5));
    }

    public final void E(int i) {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 13020) {
            dtub.w("message_report_status", intValue);
        }
        aq(new dtwe("messages.message_report_status", 1, Integer.valueOf(i)));
    }

    public final void F() {
        aq(new dtwe("messages.seen", 1, 0));
    }

    public final void G(bdhg bdhgVar) {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 35030) {
            dtub.w("original_rcs_message_id", intValue);
        }
        aq(new dtrt("messages.original_rcs_message_id", 1, bdhg.d(bdhgVar)));
    }

    public final void H(dtzj dtzjVar) {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 35030) {
            dtub.w("original_rcs_message_id", intValue);
        }
        aq(new dtru("messages.original_rcs_message_id", 3, dtzjVar));
    }

    public final void I(byzg byzgVar) {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 58720) {
            dtub.w("outgoing_delivery_report_status", intValue);
        }
        aq(new dtwe("messages.outgoing_delivery_report_status", 1, Integer.valueOf(byzgVar == null ? 0 : byzgVar.ordinal())));
    }

    public final void J(byzg byzgVar) {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 58720) {
            dtub.w("outgoing_read_report_status", intValue);
        }
        aq(new dtwe("messages.outgoing_read_report_status", 1, Integer.valueOf(byzgVar == null ? 0 : byzgVar.ordinal())));
    }

    public final void K(int i) {
        aq(new dtwe("messages.message_protocol", 1, Integer.valueOf(i)));
    }

    public final void L(int... iArr) {
        aq(new dtrw("messages.message_protocol", 3, au(iArr), true));
    }

    public final void M(int i) {
        aq(new dtwe("messages.message_protocol", 2, Integer.valueOf(i)));
    }

    public final void N(int i) {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 29060) {
            dtub.w("etouffee_status", intValue);
        }
        aq(new dtwe("messages.etouffee_status", 1, Integer.valueOf(i)));
    }

    public final void O(bdhg bdhgVar) {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 41040) {
            dtub.w("rcs_message_id_with_text_type", intValue);
        }
        aq(new dtrt("messages.rcs_message_id_with_text_type", 1, bdhg.d(bdhgVar)));
    }

    public final void P(boolean z) {
        aq(new dtwe("messages.read", 1, Integer.valueOf(z ? 1 : 0)));
    }

    public final void Q(long j) {
        aq(new dtwe("messages.received_timestamp", 1, Long.valueOf(j)));
    }

    public final void R(long j) {
        aq(new dtwe("messages.received_timestamp", 7, Long.valueOf(j)));
    }

    public final void S(long j) {
        aq(new dtwe("messages.received_timestamp", 9, Long.valueOf(j)));
    }

    public final void T(long j) {
        aq(new dtwe("messages.received_timestamp", 8, Long.valueOf(j)));
    }

    public final void U(long j) {
        aq(new dtwe("messages.received_timestamp", 10, Long.valueOf(j)));
    }

    public final void V(bdgr bdgrVar) {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 59490) {
            dtub.w("satellite_datagram_id", intValue);
        }
        aq(new dtrt("messages.satellite_datagram_id", 1, bdgr.d(bdgrVar)));
    }

    public final void W(String str) {
        aq(new dtrt("messages.self_id", 1, str));
    }

    public final void X(String str) {
        aq(new dtrt("messages.sender_id", 1, String.valueOf(str)));
    }

    public final void Y(Iterable iterable) {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 54040) {
            dtub.w("sender_send_destination", intValue);
        }
        aq(new dtrw("messages.sender_send_destination", 3, at(iterable), false));
    }

    public final void Z(long j) {
        aq(new dtwe("messages.sent_timestamp", 7, Long.valueOf(j)));
    }

    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new buxs(this);
    }

    public final void aa(long j) {
        aq(new dtwe("messages.sent_timestamp", 9, Long.valueOf(j)));
    }

    public final void ab(Uri uri) {
        aq(new dtrt("messages.sms_message_uri", 1, uri));
    }

    public final void ac(Iterable iterable) {
        aq(new dtrw("messages.sms_message_uri", 3, at(iterable), false));
    }

    public final void ad() {
        aq(new dtrx("messages.sms_message_uri", 6));
    }

    public final void ae() {
        aq(new dtrx("messages.sms_message_uri", 5));
    }

    public final void af(int i) {
        aq(new dtwe("messages.message_status", 1, Integer.valueOf(i)));
    }

    public final void ag() {
        aq(new dtwe("messages.message_status", 7, 267));
    }

    public final void ah(int i) {
        aq(new dtwe("messages.message_status", 9, Integer.valueOf(i)));
    }

    public final void ai(Iterable iterable) {
        aq(new dtrw("messages.message_status", 3, at(iterable), true));
    }

    public final void aj(int... iArr) {
        aq(new dtrw("messages.message_status", 3, au(iArr), true));
    }

    public final void ak(int i, int i2) {
        aq(new dtzc("messages.message_status", String.valueOf(i), String.valueOf(i2)));
    }

    public final void al() {
        aq(new dtwe("messages.message_status", 8, Integer.valueOf(BasePaymentResult.ERROR_REQUEST_FAILED)));
    }

    public final void am(int i) {
        aq(new dtwe("messages.message_status", 10, Integer.valueOf(i)));
    }

    public final void an(Iterable iterable) {
        aq(new dtrw("messages.message_status", 4, at(iterable), true));
    }

    public final void ao(int... iArr) {
        aq(new dtrw("messages.message_status", 4, au(iArr), true));
    }

    public final void ap(int i) {
        aq(new dtwe("messages.message_status", 2, Integer.valueOf(i)));
    }

    public final void b(Function... functionArr) {
        Object apply;
        buxz[] buxzVarArr = new buxz[functionArr.length];
        for (int i = 0; i < functionArr.length; i++) {
            Function function = functionArr[i];
            String[] strArr = MessagesTable.a;
            apply = function.apply(new buxz());
            buxzVarArr[i] = (buxz) apply;
        }
        ar(buxzVarArr);
    }

    public final void c() {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 49060) {
            dtub.w("awaiting_reverse_sync", intValue);
        }
        aq(new dtwe("messages.awaiting_reverse_sync", 1, 1));
    }

    public final void d(String str) {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 8500) {
            dtub.w("cloud_sync_id", intValue);
        }
        aq(new dtrt("messages.cloud_sync_id", 1, String.valueOf(str)));
    }

    public final void e() {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 8500) {
            dtub.w("cloud_sync_id", intValue);
        }
        aq(new dtrx("messages.cloud_sync_id", 6));
    }

    public final void f(String str) {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 31010) {
            dtub.w("cms_id", intValue);
        }
        aq(new dtrt("messages.cms_id", 1, String.valueOf(str)));
    }

    public final void g(Iterable iterable) {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 31010) {
            dtub.w("cms_id", intValue);
        }
        aq(new dtrw("messages.cms_id", 3, at(iterable), false));
    }

    public final void h() {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 31010) {
            dtub.w("cms_id", intValue);
        }
        aq(new dtrx("messages.cms_id", 5));
    }

    public final void i(csgg csggVar) {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 58210) {
            dtub.w("cms_life_cycle", intValue);
        }
        aq(new dtwe("messages.cms_life_cycle", 1, Integer.valueOf(csggVar == null ? 0 : csggVar.ordinal())));
    }

    public final void j(Iterable iterable) {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 58210) {
            dtub.w("cms_life_cycle", intValue);
        }
        aq(new dtrw("messages.cms_life_cycle", 3, at((Iterable) enqc.a(iterable).map(new Function() { // from class: buxx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((csgg) obj).ordinal());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new buxw()))), true));
    }

    public final void k(csgg... csggVarArr) {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 58210) {
            dtub.w("cms_life_cycle", intValue);
        }
        aq(new dtrw("messages.cms_life_cycle", 3, at((Iterable) DesugarArrays.stream(csggVarArr).map(new Function() { // from class: buxu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((csgg) obj).ordinal());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new buxw()))), true));
    }

    public final void l(csgg csggVar) {
        int intValue = MessagesTable.g().intValue();
        if (intValue < 58210) {
            dtub.w("cms_life_cycle", intValue);
        }
        aq(new dtwe("messages.cms_life_cycle", 2, Integer.valueOf(csggVar == null ? 0 : csggVar.ordinal())));
    }

    public final void m(ConversationIdType conversationIdType) {
        aq(new dtrt("messages.conversation_id", 1, Long.valueOf(bdgq.a(conversationIdType))));
    }

    public final void n(dtzj dtzjVar) {
        aq(new dtru("messages.conversation_id", 1, dtzjVar));
    }

    public final void o(dtzj dtzjVar) {
        aq(new dtru("messages.conversation_id", 3, dtzjVar));
    }

    public final void p(Iterable iterable) {
        engr engrVar = new engr();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            engrVar.h(String.valueOf(bdgq.a((ConversationIdType) it.next())));
        }
        aq(new dtrw("messages.conversation_id", 3, at(engrVar.g()), true));
    }

    public final void q(MessageIdType messageIdType) {
        aq(new dtrt("messages._id", 1, Long.valueOf(bdhb.a(messageIdType))));
    }

    public final void r(dtzj dtzjVar) {
        aq(new dtru("messages._id", 1, dtzjVar));
    }

    public final void s(long j) {
        aq(new dtwe("messages._id", 7, Long.valueOf(j)));
    }

    public final void t(dtzj dtzjVar) {
        aq(new dtru("messages._id", 3, dtzjVar));
    }

    public final void u(Iterable iterable) {
        engr engrVar = new engr();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            engrVar.h(String.valueOf(bdhb.a((MessageIdType) it.next())));
        }
        aq(new dtrw("messages._id", 3, at(engrVar.g()), true));
    }

    public final void v(MessageIdType... messageIdTypeArr) {
        aq(new dtrw("messages._id", 3, at((Iterable) DesugarArrays.stream(messageIdTypeArr).map(new Function() { // from class: buxt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return String.valueOf(bdhb.a((MessageIdType) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new buxw()))), true));
    }

    public final void w(long j) {
        aq(new dtwe("messages._id", 8, Long.valueOf(j)));
    }

    public final void x(long j) {
        aq(new dtwe("messages._id", 10, Long.valueOf(j)));
    }

    public final void y(dtzj dtzjVar) {
        aq(new dtru("messages._id", 4, dtzjVar));
    }

    public final void z(Iterable iterable) {
        engr engrVar = new engr();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            engrVar.h(String.valueOf(bdhb.a((MessageIdType) it.next())));
        }
        aq(new dtrw("messages._id", 4, at(engrVar.g()), true));
    }
}
