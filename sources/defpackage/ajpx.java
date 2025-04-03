package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajpx extends ffhv implements ffjm {
    final /* synthetic */ ajpy a;
    final /* synthetic */ ajqd b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajpx(ffgu ffguVar, ajpy ajpyVar, ajqd ajqdVar, List list) {
        super(2, ffguVar);
        this.a = ajpyVar;
        this.b = ajqdVar;
        this.c = list;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajpx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ajqd ajqdVar = this.b;
        String str = ajqdVar.b.b;
        if (str == null) {
            throw new IllegalArgumentException("ClearcutIncomingRepliesTransportLogger.buildMessageReplyInfo with empty rcsMessageId");
        }
        ajpy ajpyVar = this.a;
        List list = this.c;
        eqfp eqfpVar = (eqfp) eqfq.a.createBuilder();
        eqfpVar.getClass();
        equd.c(!ajqdVar.d.c(), eqfpVar);
        eqfr eqfrVar = (eqfr) eqfs.a.createBuilder();
        eqfrVar.getClass();
        eqyj.c(ajqdVar.c.k(), eqfrVar);
        eqyj.b(ajqdVar.e, eqfrVar);
        eqyj.d(str, eqfrVar);
        equd.b(eqyj.a(eqfrVar), eqfpVar);
        aldh.b(ajpyVar.b, ajqdVar.a, 4, null, list, null, equd.a(eqfpVar), null, 84);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajpx ajpxVar = new ajpx(ffguVar, this.a, this.b, this.c);
        ajpxVar.d = obj;
        return ajpxVar;
    }
}
