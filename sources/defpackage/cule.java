package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cule {
    public static final culf a(MessagesTable.BindData bindData) {
        if (culg.b().booleanValue()) {
            if (bindData.D().c()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (bindData.C().b()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        MessageIdType D = bindData.D();
        D.getClass();
        MessageIdType D2 = bindData.D();
        D2.getClass();
        cuvb cuvbVar = new cuvb(D2);
        ConversationIdType C = bindData.C();
        C.getClass();
        ConversationIdType C2 = bindData.C();
        C2.getClass();
        cuva a = cuuz.a(C2);
        int l = bindData.l();
        boolean h = bdjs.h(bindData.s());
        boolean A = bdjs.A(bindData.s());
        String X = bindData.X();
        String X2 = bindData.X();
        cuvc cuvcVar = null;
        if (X2 != null && X2.length() != 0) {
            String X3 = bindData.X();
            X3.getClass();
            cuvcVar = new cuvc(X3);
        }
        return new culf(D, cuvbVar, C, a, l, h, A, X, cuvcVar, bindData.n() == 2, bindData.w());
    }

    public static final culf b(MessageCoreData messageCoreData) {
        if (culg.b().booleanValue()) {
            if (messageCoreData.B().c()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (messageCoreData.z().b()) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        }
        MessageIdType B = messageCoreData.B();
        B.getClass();
        MessageIdType B2 = messageCoreData.B();
        B2.getClass();
        cuvb cuvbVar = new cuvb(B2);
        ConversationIdType z = messageCoreData.z();
        z.getClass();
        ConversationIdType z2 = messageCoreData.z();
        z2.getClass();
        cuva a = cuuz.a(z2);
        int d = messageCoreData.d();
        boolean cI = messageCoreData.cI();
        boolean cS = messageCoreData.cS();
        String aA = messageCoreData.aA();
        String aA2 = messageCoreData.aA();
        cuvc cuvcVar = null;
        if (aA2 != null && aA2.length() != 0) {
            String aA3 = messageCoreData.aA();
            aA3.getClass();
            cuvcVar = new cuvc(aA3);
        }
        return new culf(B, cuvbVar, z, a, d, cI, cS, aA, cuvcVar, messageCoreData.cB(), messageCoreData.o());
    }
}
