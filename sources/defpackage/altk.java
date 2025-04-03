package defpackage;

import android.app.NotificationChannel;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.BackgroundLoadingMessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public interface altk extends dkpi {
    public static final long a = TimeUnit.DAYS.toMillis(1);
    public static final long b = TimeUnit.DAYS.toMillis(7);
    public static final long c = TimeUnit.DAYS.toMillis(28);
    public static final cfva d = cfvl.c(cfvl.b, "conversation_protocol_full_condition_ratio", 1.0d);
    public static final emyl e = cfvl.x(254207979, "enable_message_attachment_size_instrumentation");

    void A(bdhg bdhgVar, MessageCoreData messageCoreData, int i, eqyl eqylVar);

    void B(bdhg bdhgVar, MessageCoreData messageCoreData, int i, eqyl eqylVar, eooi eooiVar);

    void C(bdhg bdhgVar, MessageCoreData messageCoreData, int i, eqyl eqylVar);

    void D(bdhg bdhgVar, MessageCoreData messageCoreData, int i, eqxi eqxiVar, eqyl eqylVar);

    void E(MessageCoreData messageCoreData, eoit eoitVar);

    void F(MessageCoreData messageCoreData, eoit eoitVar);

    void G(MessageCoreData messageCoreData, String str);

    void H(MessageCoreData messageCoreData, String str);

    @Deprecated
    void I(MessageCoreData messageCoreData, int i, eopq eopqVar);

    void J(MessageCoreData messageCoreData, Integer num, int i, eonp eonpVar);

    void K(alrk alrkVar);

    void L(MessageCoreData messageCoreData);

    void M(MessageCoreData messageCoreData, int i);

    void N(MessageCoreData messageCoreData, int i, int i2);

    void O(MessageCoreData messageCoreData, int i, eoop eoopVar);

    void P(MessageCoreData messageCoreData, int i, long j, akzo akzoVar, eoop eoopVar);

    void Q(MessageCoreData messageCoreData, int i, int i2, eooi eooiVar);

    void R(int i, int i2, int i3, int i4, long j, int i5, long j2, ConversationIdType conversationIdType);

    void S(ConversationIdType conversationIdType, int i, long j);

    void T(int i);

    void U(epgr epgrVar, epgt epgtVar);

    void V(alrl alrlVar);

    void W(MessageCoreData messageCoreData, int i);

    void X(MessageCoreData messageCoreData, eoty eotyVar);

    void Y(int i, int i2);

    void Z(epyw epywVar, MessageCoreData messageCoreData, int i);

    @Override // defpackage.dkpi
    void a(eyxs eyxsVar);

    void aA(int i, String str, int i2);

    void aB(int i, int i2, int i3);

    void aC(MessageCoreData messageCoreData, int i, int i2, int i3, int i4, int i5, eqxi eqxiVar, int i6, int i7, Optional optional, Optional optional2, Optional optional3);

    void aD(MessageCoreData messageCoreData, int i, long j, boolean z, int i2);

    void aE(eoqn eoqnVar, int i, List list);

    void aF(int i, int i2, String str);

    @Deprecated
    void aG(int i, String str);

    void aH(int i, eorw eorwVar, String str);

    void aI(MessageCoreData messageCoreData, int i, eqyl eqylVar, int i2, int i3);

    void aJ(int i);

    void aK(int i, int i2);

    void aL(int i);

    void aM();

    void aN(MessageCoreData messageCoreData, Optional optional);

    @Deprecated
    void aO();

    void aP(MessageCoreData messageCoreData, int i, akzo akzoVar, eoop eoopVar);

    void aQ(eoqn eoqnVar);

    void aR(int i);

    @Deprecated
    void aa(String str, int i, String str2);

    void ab(eovo eovoVar, cvam cvamVar, long j);

    @Deprecated
    void ac(String str, int i, String str2, String str3, byzi byziVar);

    void ad(int i);

    void ae(eooi eooiVar, fjay fjayVar, akzo akzoVar);

    void af();

    void ag(MessageCoreData messageCoreData);

    void ah(int i);

    void ai(boolean z);

    void aj();

    void ak();

    void al();

    boolean am();

    void an(aoku aokuVar, byzi byziVar, String str);

    void ao(int i, int i2, int i3, long j, int i4, long j2, ConversationIdType conversationIdType);

    void ap(bdhg bdhgVar, eqxi eqxiVar, eqyl eqylVar);

    void aq(MessageCoreData messageCoreData, Optional optional, eqyl eqylVar, akzo akzoVar);

    void ar(NotificationChannel notificationChannel, NotificationChannel notificationChannel2);

    void as();

    int at();

    @Deprecated
    void au(int i);

    void av(String str, int i);

    void aw(int i);

    void ax(ConversationIdType conversationIdType, eoko eokoVar, int i, int i2, boolean z, Boolean bool, boolean z2, boolean z3, int i3, List list, boolean z4, int i4, boolean z5, int i5);

    void ay(ConversationIdType conversationIdType, int i);

    @Deprecated
    void az(int i);

    @Override // defpackage.dkpi
    void b(eyxz eyxzVar);

    int d();

    alsa e();

    BackgroundLoadingMessageUsageStatisticsData f(Callable callable, eooi eooiVar);

    elfl g();

    eoux h(long j);

    eoux i(String str);

    ListenableFuture j();

    @Deprecated
    String k(Optional optional);

    void l();

    void m(eoiv eoivVar);

    void n(long j);

    void o(boolean z, boolean z2);

    @Deprecated
    void p(String str, int i, String str2, String str3, byzi byziVar);

    @Deprecated
    void q(String str, int i, String str2, String str3, byzi byziVar);

    void r();

    void s(ConversationIdType conversationIdType, eoko eokoVar, int i);

    @Deprecated
    void t(eokw eokwVar, ConversationIdType conversationIdType, eoko eokoVar, boolean z, byyt byytVar);

    void u(ConversationIdType conversationIdType, eokl eoklVar);

    void v(boolean z, boolean z2);

    void w(String str, eumg eumgVar);

    void x(long j, boolean z);

    void y();

    void z();
}
