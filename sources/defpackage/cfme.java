package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfme implements cfmc {
    public cfme(ffbr ffbrVar, cbgf cbgfVar) {
        ffbrVar.getClass();
        cbgfVar.getClass();
    }

    @Override // defpackage.cfmc
    public final cfmf a(final ConversationIdType conversationIdType) {
        bsob e = bsom.e();
        e.z("getEncryptionId");
        e.i(new Function() { // from class: cfmd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsol bsolVar = (bsol) obj;
                bsolVar.q(ConversationIdType.this);
                return bsolVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bskr bskrVar = (bskr) e.b().p(bsom.c.av);
        try {
            engw m = bskrVar.m();
            bskrVar.close();
            m.getClass();
            return (cfmf) ffdx.M(m);
        } catch (Throwable th) {
            try {
                bskrVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
