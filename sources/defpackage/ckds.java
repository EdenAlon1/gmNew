package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.ims.rcsservice.group.GroupInfo;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public interface ckds extends cfug, cijg {
    public static final emyl a = cfvl.w("migrate_telephony_methods_to_rcs_telephony_access");

    boolean A(ConversationIdType conversationIdType);

    boolean B(ckdr ckdrVar);

    boolean C(Intent intent);

    boolean D();

    boolean E(ConversationIdType conversationIdType);

    @Deprecated
    boolean F(int i);

    boolean G();

    boolean H();

    @Deprecated
    boolean I();

    boolean J(int i);

    boolean K(MessageCoreData messageCoreData);

    @Deprecated
    ConversationIdType L(long j, cpxu cpxuVar, GroupInfo groupInfo, Optional optional, int i, Optional optional2, boolean z, int i2);

    void M(Bundle bundle);

    boolean N(MessageCoreData messageCoreData, int i, int i2, long j);

    void O(MessageCoreData messageCoreData, int i, long j);

    int P();

    int d();

    int e(boolean z);

    int f(Optional optional);

    ln g(MessageCoreData messageCoreData);

    @Deprecated
    aztg h();

    ckdr i();

    ckdr j(bdhg bdhgVar);

    @Deprecated
    cpbd k(long j, String str, String str2);

    @Deprecated
    cpbd l(cpxu cpxuVar, String str, String str2);

    @Deprecated
    Optional m(aoku aokuVar);

    @Deprecated
    Optional n();

    Optional o();

    @Deprecated
    String p(String str, String str2);

    String q(ConversationIdType conversationIdType);

    String r();

    @Deprecated
    String s();

    void t();

    void u();

    void v();

    void w(eyte eyteVar);

    void x(long j);

    @Deprecated
    void y();

    @Deprecated
    void z();
}
