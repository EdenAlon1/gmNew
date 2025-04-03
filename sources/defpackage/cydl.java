package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cydl implements cxym {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;

    public cydl(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
    }

    @Override // defpackage.cxym
    public final /* bridge */ /* synthetic */ cxyl a(cxyg cxygVar, ConversationIdType conversationIdType, cxyw cxywVar) {
        Context context = (Context) this.a.b();
        context.getClass();
        cyai cyaiVar = (cyai) this.b.b();
        ejwl ejwlVar = (ejwl) this.c.b();
        ejwlVar.getClass();
        cydk cydkVar = (cydk) this.d.b();
        conversationIdType.getClass();
        cxywVar.getClass();
        return new cydd(context, cyaiVar, ejwlVar, cydkVar, cxygVar);
    }
}
