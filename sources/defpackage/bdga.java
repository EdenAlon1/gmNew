package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bdga {
    private final ffbr a;
    private final ffbr b;

    public bdga(ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    public final ConversationIdType a(String str) {
        bseh b = b(str);
        return b == null ? bdgq.a : b.C();
    }

    public final bseh b(final String str) {
        ekzz f = eleg.f("GetConversationDataFromOtherParticipantDestination#getConversationDataFromOtherParticipantDestination");
        try {
            efbd.b();
            bsob e = bsom.e();
            e.z("getConversationDataFromOtherParticipantDestination");
            e.i(new Function() { // from class: bdfz
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
            bskp bskpVar = bsom.c;
            e.e(new bsny(bskpVar.r, false), new bsny(bskpVar.a, false));
            bskr bskrVar = (bskr) e.b().o();
            try {
                csix.d(bskrVar.getCount(), 0, 1);
                if (bskrVar.getCount() > 1) {
                    ((akzt) this.a.b()).e("Bugle.Datamodel.Operations.GetConversationFromOtherParticipantDestination.ReturnedMoreThanOneConversation", bskrVar.getCount());
                    ((bazb) this.b.b()).a(false).k();
                }
                bseh bsehVar = null;
                if (bskrVar.moveToFirst()) {
                    bseh bsehVar2 = (bseh) bskrVar.cO();
                    if (bsehVar2 != null) {
                        bsehVar = bsehVar2;
                    }
                }
                bskrVar.close();
                f.close();
                return bsehVar;
            } finally {
            }
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
