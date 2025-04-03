package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bsol extends duav {
    public final void A() {
        aq(new dtwe("conversations.participant_count", 1, 1));
    }

    public final void B(int i) {
        aq(new dtwe("conversations.participant_count", 10, Integer.valueOf(i)));
    }

    public final void C(String str) {
        aq(new dtrt("conversations.participant_normalized_destination", 1, String.valueOf(str)));
    }

    public final void D(String str) {
        int intValue = bsom.g().intValue();
        if (intValue < 40050) {
            dtub.w("rcs_conference_uri", intValue);
        }
        aq(new dtrt("conversations.rcs_conference_uri", 1, String.valueOf(str)));
    }

    public final void E(String str) {
        int intValue = bsom.g().intValue();
        if (intValue < 40050) {
            dtub.w("rcs_group_id", intValue);
        }
        aq(new dtrt("conversations.rcs_group_id", 1, String.valueOf(str)));
    }

    public final void F() {
        int intValue = bsom.g().intValue();
        if (intValue < 40050) {
            dtub.w("rcs_group_id", intValue);
        }
        aq(new dtrx("conversations.rcs_group_id", 6));
    }

    public final void G() {
        int intValue = bsom.g().intValue();
        if (intValue < 40050) {
            dtub.w("rcs_group_id", intValue);
        }
        aq(new dtrx("conversations.rcs_group_id", 5));
    }

    public final void H() {
        int intValue = bsom.g().intValue();
        if (intValue < 40050) {
            dtub.w("rcs_group_id", intValue);
        }
        aq(new dtrt("conversations.rcs_group_id", 2, ""));
    }

    public final void I(long j) {
        int intValue = bsom.g().intValue();
        if (intValue < 10000) {
            dtub.w("rcs_session_id", intValue);
        }
        aq(new dtwe("conversations.rcs_session_id", 1, Long.valueOf(j)));
    }

    public final void J() {
        int intValue = bsom.g().intValue();
        if (intValue < 10000) {
            dtub.w("rcs_session_id", intValue);
        }
        aq(new dtwe("conversations.rcs_session_id", 2, -1L));
    }

    public final void K(cpxu cpxuVar) {
        aq(new dtrt("conversations.sms_thread_id", 1, Long.valueOf(cpxv.a(cpxuVar))));
    }

    public final void L(int i) {
        int intValue = bsom.g().intValue();
        if (intValue < 8500) {
            dtub.w("source_type", intValue);
        }
        aq(new dtwe("conversations.source_type", 1, Integer.valueOf(i)));
    }

    @Override // defpackage.duav
    public final /* synthetic */ duap a() {
        return new bsof(this);
    }

    public final void b(Function... functionArr) {
        Object apply;
        bsol[] bsolVarArr = new bsol[functionArr.length];
        for (int i = 0; i < functionArr.length; i++) {
            Function function = functionArr[i];
            String[] strArr = bsom.a;
            apply = function.apply(new bsol());
            bsolVarArr[i] = (bsol) apply;
        }
        ar(bsolVarArr);
    }

    public final void c(byyt byytVar) {
        aq(new dtwe("conversations.archive_status", 1, Integer.valueOf(byytVar == null ? 0 : byytVar.h)));
    }

    public final void d(byyt byytVar) {
        aq(new dtwe("conversations.archive_status", 2, Integer.valueOf(byytVar == null ? 0 : byytVar.h)));
    }

    public final void e(String str) {
        int intValue = bsom.g().intValue();
        if (intValue < 32000) {
            dtub.w("cms_id", intValue);
        }
        aq(new dtrt("conversations.cms_id", 1, String.valueOf(str)));
    }

    public final void f() {
        int intValue = bsom.g().intValue();
        if (intValue < 32000) {
            dtub.w("cms_id", intValue);
        }
        aq(new dtrx("conversations.cms_id", 6));
    }

    public final void g() {
        int intValue = bsom.g().intValue();
        if (intValue < 32000) {
            dtub.w("cms_id", intValue);
        }
        aq(new dtrx("conversations.cms_id", 5));
    }

    public final void h(csgg... csggVarArr) {
        int intValue = bsom.g().intValue();
        if (intValue < 58210) {
            dtub.w("cms_life_cycle", intValue);
        }
        aq(new dtrw("conversations.cms_life_cycle", 3, at((Iterable) DesugarArrays.stream(csggVarArr).map(new Function() { // from class: bsoj
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
        }).collect(Collectors.toCollection(new bsoh()))), true));
    }

    public final void i(csgg csggVar) {
        int intValue = bsom.g().intValue();
        if (intValue < 58210) {
            dtub.w("cms_life_cycle", intValue);
        }
        aq(new dtwe("conversations.cms_life_cycle", 2, Integer.valueOf(csggVar == null ? 0 : csggVar.ordinal())));
    }

    public final void j(int i) {
        int intValue = bsom.g().intValue();
        if (intValue < 10007) {
            dtub.w("conv_type", intValue);
        }
        aq(new dtwe("conversations.conv_type", 1, Integer.valueOf(i)));
    }

    public final void k(String str) {
        aq(new dtrt("conversations.current_self_id", 1, String.valueOf(str)));
    }

    public final void l() {
        int intValue = bsom.g().intValue();
        if (intValue < 29020) {
            dtub.w("delete_timestamp", intValue);
        }
        aq(new dtwe("conversations.delete_timestamp", 1, 0L));
    }

    public final void m(int i) {
        int intValue = bsom.g().intValue();
        if (intValue < 29060) {
            dtub.w("etouffee_default", intValue);
        }
        aq(new dtwe("conversations.etouffee_default", 1, Integer.valueOf(i)));
    }

    public final void n() {
        aq(new dtrt("conversations.draft_preview_uri", 11, "android.resource%"));
    }

    public final void o(boolean z) {
        int intValue = bsom.g().intValue();
        if (intValue < 59210) {
            dtub.w("has_been_e2ee", intValue);
        }
        aq(new dtwe("conversations.has_been_e2ee", 1, Integer.valueOf(z ? 1 : 0)));
    }

    public final void p() {
        int intValue = bsom.g().intValue();
        if (intValue < 12001) {
            dtub.w("has_ea2p_bot_recipient", intValue);
        }
        aq(new dtwe("conversations.has_ea2p_bot_recipient", 1, 0));
    }

    public final void q(ConversationIdType conversationIdType) {
        aq(new dtrt("conversations._id", 1, Long.valueOf(bdgq.a(conversationIdType))));
    }

    public final void r(long j) {
        aq(new dtwe("conversations._id", 7, Long.valueOf(j)));
    }

    public final void s(dtzj dtzjVar) {
        aq(new dtru("conversations._id", 3, dtzjVar));
    }

    public final void t(Iterable iterable) {
        engr engrVar = new engr();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            engrVar.h(String.valueOf(bdgq.a((ConversationIdType) it.next())));
        }
        aq(new dtrw("conversations._id", 3, at(engrVar.g()), true));
    }

    public final void u(long j) {
        aq(new dtwe("conversations._id", 10, Long.valueOf(j)));
    }

    public final void v(dtzj dtzjVar) {
        aq(new dtru("conversations._id", 4, dtzjVar));
    }

    public final void w(ConversationIdType conversationIdType) {
        aq(new dtrt("conversations._id", 2, Long.valueOf(bdgq.a(conversationIdType))));
    }

    public final void x(int i) {
        int intValue = bsom.g().intValue();
        if (intValue < 10006) {
            dtub.w("join_state", intValue);
        }
        aq(new dtwe("conversations.join_state", 1, Integer.valueOf(i)));
    }

    public final void y(int i) {
        int intValue = bsom.g().intValue();
        if (intValue < 10006) {
            dtub.w("join_state", intValue);
        }
        aq(new dtwe("conversations.join_state", 2, Integer.valueOf(i)));
    }

    public final void z() {
        int intValue = bsom.g().intValue();
        if (intValue < 59220) {
            dtub.w("marked_as_unread", intValue);
        }
        aq(new dtwe("conversations.marked_as_unread", 1, 1));
    }
}
