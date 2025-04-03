package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cndx {
    private final ffbr a;
    private final cndj b;
    private final cpbs c;
    private final cpbw d;
    private final cmqm e;

    public cndx(ffbr ffbrVar, cndj cndjVar, cpbs cpbsVar, cpbw cpbwVar, cmqm cmqmVar) {
        ffbrVar.getClass();
        cndjVar.getClass();
        cpbsVar.getClass();
        cpbwVar.getClass();
        cmqmVar.getClass();
        this.a = ffbrVar;
        this.b = cndjVar;
        this.c = cpbsVar;
        this.d = cpbwVar;
        this.e = cmqmVar;
    }

    private final boolean b(int i, cmrm cmrmVar, cmrl cmrlVar, cndi cndiVar) {
        cmtb cmtbVar = ((cmsw) ((cndh) cndiVar).d).c;
        ffbr ffbrVar = this.a;
        String a = this.b.a(cmrmVar, cmrlVar, cmtbVar);
        cflw cflwVar = (cflw) ffbrVar.b();
        cflwVar.b(i, a);
        return cflwVar.c();
    }

    private final boolean c(int i, boolean z) {
        cpbn a = this.c.a(i);
        return z ? a.o() : a.r();
    }

    public final cndy a(boolean z, cndi cndiVar, cmrl cmrlVar, cmrm cmrmVar) {
        cmrlVar.getClass();
        cmrmVar.getClass();
        if (z) {
            if (!((cmsw) ((cndh) cndiVar).d).b.k()) {
                throw new IllegalStateException("Trying to react to a message without RCS message-id with RCS available");
            }
            this.e.b(1);
            return new cndy(cnea.SUCCESS, cndn.RCS_FALLBACK);
        }
        cndh cndhVar = (cndh) cndiVar;
        final ConversationIdType conversationIdType = cndhVar.a;
        bsob e = bsom.e();
        e.z("getConversationType");
        e.i(new Function() { // from class: cndw
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
        bseh bsehVar = (bseh) ((bskr) e.b().o()).cS();
        bsehVar.getClass();
        if (!byyr.e(bsehVar.k())) {
            if (!b(cndhVar.b, cmrmVar, cmrlVar, cndiVar)) {
                this.e.b(2);
                return new cndy(cnea.SUCCESS, cndn.SMS_TRANSPORT);
            }
            if (c(cndhVar.b, false)) {
                this.e.b(3);
                return new cndy(cnea.SUCCESS, cndn.MMS_TRANSPORT);
            }
            this.e.b(5);
            return new cndy(cnea.FAIL_MMS_UNAVAILABLE, null);
        }
        if (this.d.d(cndhVar.b)) {
            this.e.b(3);
            return new cndy(cnea.SUCCESS, cndn.MMS_TRANSPORT);
        }
        if (!b(cndhVar.b, cmrmVar, cmrlVar, cndiVar)) {
            this.e.b(2);
            return new cndy(cnea.SUCCESS, cndn.SMS_TRANSPORT);
        }
        if (c(cndhVar.b, true)) {
            this.e.b(4);
            return new cndy(cnea.FAIL_ENABLE_MMS_IN_GROUP, null);
        }
        this.e.b(5);
        return new cndy(cnea.FAIL_MMS_UNAVAILABLE, null);
    }
}
