package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantCoreColor;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public interface bczy {
    engw A();

    engw B(engw engwVar);

    engw C(engw engwVar);

    enhk D(engw engwVar);

    enip E(String str);

    enip F(List list);

    Optional G(ConversationIdType conversationIdType);

    Optional H(ConversationIdType conversationIdType);

    Optional I(ConversationIdType conversationIdType);

    String J(ConversationIdType conversationIdType);

    @Deprecated
    ArrayList K(cpbd cpbdVar, int i);

    List L(ConversationIdType conversationIdType);

    @Deprecated
    List M(cpxu cpxuVar);

    void N(ConversationIdType conversationIdType);

    void O();

    void P(ConversationIdType conversationIdType);

    void Q(Set set);

    void R(String str);

    void S(ArrayList arrayList);

    void T(ConversationIdType conversationIdType);

    void U(ConversationIdType conversationIdType, MessageCoreData messageCoreData, boolean z);

    void V(ConversationIdType conversationIdType, String str, int i, boolean z);

    void W(ConversationIdType conversationIdType, bsoe bsoeVar);

    void X(String str, ParticipantCoreColor participantCoreColor);

    void Y(Set set, String str, String str2);

    void Z(Set set, ParticipantsTable.BindData bindData);

    int a(ConversationIdType conversationIdType);

    boolean aa(SelfIdentityId selfIdentityId, bsoe bsoeVar);

    boolean ab(Optional optional, ParticipantsTable.BindData bindData, bdgj bdgjVar, ConversationIdType conversationIdType, boolean z, boolean z2);

    boolean ac(ConversationIdType conversationIdType);

    boolean ad(ConversationIdType conversationIdType);

    boolean ae(ConversationIdType conversationIdType);

    boolean af(long j);

    boolean ag(String str);

    boolean ah(ConversationIdType conversationIdType, String str);

    boolean ai(ConversationIdType conversationIdType);

    boolean aj(ParticipantsTable.BindData bindData, ConversationIdType conversationIdType, boolean z);

    boolean ak(ConversationIdType conversationIdType, bsoe bsoeVar);

    boolean al(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId);

    boolean am(ConversationIdType conversationIdType, String str, bdgj bdgjVar);

    boolean an(ParticipantsTable.BindData bindData, ConversationIdType conversationIdType);

    boolean ao(List list, ConversationIdType conversationIdType);

    boolean ap(Optional optional, List list, ConversationIdType conversationIdType, boolean z);

    @Deprecated
    ConversationIdType aq(long j, byyt byytVar, List list, int i, String str, long j2);

    @Deprecated
    ConversationIdType ar(long j, byyt byytVar, List list);

    @Deprecated
    bdfy as(cotp cotpVar, long j, byyt byytVar, List list, long j2);

    boolean at(List list, ConversationIdType conversationIdType);

    int b(ConversationIdType conversationIdType);

    int c(ConversationIdType conversationIdType);

    int d(ConversationIdType conversationIdType);

    int e(List list, boolean z);

    long f(ConversationIdType conversationIdType);

    long g(ConversationIdType conversationIdType);

    long h(ConversationIdType conversationIdType);

    SelfIdentityId i(ConversationIdType conversationIdType);

    bdfy j(bdgd bdgdVar);

    bdfy k(bdgd bdgdVar, boolean z);

    ConversationIdType l(bdgd bdgdVar);

    @Deprecated
    ConversationIdType m(long j);

    ConversationIdType n(cpxu cpxuVar);

    @Deprecated
    ConversationIdType o(cotp cotpVar, long j);

    ConversationIdType p(cotp cotpVar, cpxu cpxuVar);

    ConversationIdType q(long j);

    bseh r(ConversationIdType conversationIdType);

    byyt s(ConversationIdType conversationIdType);

    csgg t(ConversationIdType conversationIdType);

    engw u();

    engw v(cpxu cpxuVar);

    engw w(cotp cotpVar, cpxu cpxuVar);

    engw x(ConversationIdType conversationIdType);

    @Deprecated
    engw y(Optional optional, ConversationIdType conversationIdType);

    engw z(Optional optional, ConversationIdType conversationIdType, int i);
}
