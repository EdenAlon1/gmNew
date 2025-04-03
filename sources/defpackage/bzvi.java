package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzvi implements bzqh {
    private static final cskc a = cskc.g("BugleEtouffee", "ConversationDraftEncryptionUpdater");
    private final ffbr b;
    private final ffbr c;

    public bzvi(ffbr ffbrVar, ffbr ffbrVar2) {
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    @Override // defpackage.bzqh
    public final void a(final String str, boolean z) {
        if (bzwd.a()) {
            if (!z && bzwf.g()) {
                enqu listIterator = ((bczy) this.b.b()).E(str).listIterator();
                while (listIterator.hasNext()) {
                    ConversationIdType conversationIdType = (ConversationIdType) listIterator.next();
                    csjb c = a.c();
                    c.I("Disable encryption on the conversation.");
                    c.c(conversationIdType);
                    c.r();
                    ((bzqb) this.c.b()).i(conversationIdType, 0, caqc.DEFAULT);
                }
                return;
            }
            bsob e = bsom.e();
            e.z("onEncryptionStatusUpdate");
            e.i(new Function() { // from class: bzvh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bsol bsolVar = (bsol) obj;
                    bsolVar.C(str);
                    return bsolVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bskr bskrVar = (bskr) e.b().o();
            try {
                if (bskrVar.moveToFirst()) {
                    bseh bsehVar = (bseh) bskrVar.cO();
                    if (bzwf.g()) {
                        csjb c2 = a.c();
                        c2.I("Update encryption status.");
                        c2.c(bsehVar.C());
                        c2.B("encryptionEnabled", z);
                        c2.r();
                    }
                    ((bzqb) this.c.b()).i(bsehVar.C(), z ? 1 : 0, caqc.DEFAULT);
                }
                bskrVar.close();
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
}
