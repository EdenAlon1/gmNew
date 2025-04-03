package defpackage;

import android.widget.EditText;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface uav extends cxra {
    int a(MessagePartCoreData messagePartCoreData);

    ea b();

    EditText c();

    bcvr d();

    @Deprecated
    ComposeMessageView e();

    void f(boolean z);

    void g(ajuh ajuhVar);

    void h();

    void i(long j, long j2);

    void j(boolean z, boolean z2, boolean z3);

    void k(bcpw bcpwVar);

    void l(uaw uawVar);

    void m(MessageCoreData messageCoreData);

    void n(MessageCoreData messageCoreData, boolean z);

    void o(MessageCoreData messageCoreData, boolean z, boolean z2);

    void p(MessageCoreData messageCoreData);

    @Override // defpackage.cxra
    boolean q();

    boolean r(MessagePartCoreData messagePartCoreData);
}
