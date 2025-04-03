package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyhy implements cxym {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public cyhy(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
    }

    @Override // defpackage.cxym
    public final /* bridge */ /* synthetic */ cxyl a(cxyg cxygVar, ConversationIdType conversationIdType, cxyw cxywVar) {
        Context context = (Context) this.a.b();
        context.getClass();
        cxzq cxzqVar = (cxzq) this.b.b();
        Optional optional = (Optional) this.c.b();
        conversationIdType.getClass();
        cxywVar.getClass();
        return new cyhx(context, cxzqVar, optional, cxygVar);
    }
}
