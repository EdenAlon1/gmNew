package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmjk extends ffhv implements ffjm {
    final /* synthetic */ cmjl a;
    final /* synthetic */ cmjt b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmjk(ffgu ffguVar, cmjl cmjlVar, cmjt cmjtVar) {
        super(2, ffguVar);
        this.a = cmjlVar;
        this.b = cmjtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmjk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cmjt cmjtVar = this.b;
        boolean z = cmjtVar.d != null;
        if (!z) {
            ensk f = cmjl.a.f();
            f.Y(ente.a, "BugleRcsEdits");
            ((enrr) f.h("com/google/android/apps/messaging/shared/rcsedit/analytics/transport/ClearcutIncomingEditsTransportLogger", "buildMessageEditInfo", 48, "ClearcutIncomingEditsTransportLogger.kt")).q("ClearcutIncomingEditsTransportLogger.buildMessageEditInfo with no editedMessageIdHeader");
        }
        boolean z2 = cmjtVar.e != null;
        if (!z2) {
            ensk f2 = cmjl.a.f();
            f2.Y(ente.a, "BugleRcsEdits");
            ((enrr) f2.h("com/google/android/apps/messaging/shared/rcsedit/analytics/transport/ClearcutIncomingEditsTransportLogger", "buildMessageEditInfo", 56, "ClearcutIncomingEditsTransportLogger.kt")).q("ClearcutIncomingEditsTransportLogger.buildMessageEditInfo with no editedAtTimestampHeader");
        }
        cmjt cmjtVar2 = this.b;
        cmjl cmjlVar = this.a;
        epwx epwxVar = (epwx) epwy.a.createBuilder();
        epwxVar.getClass();
        eqty.b(cmjtVar.b != null, epwxVar);
        eqty.c(eykn.a(cmjtVar.c), epwxVar);
        epwz epwzVar = (epwz) epxa.a.createBuilder();
        epwzVar.getClass();
        eqtz.c(z, epwzVar);
        eqtz.b(z2, epwzVar);
        eqtz.d(cmjtVar.f, epwzVar);
        eqty.d(eqtz.a(epwzVar), epwxVar);
        aldh.b(cmjlVar.c, cmjtVar2.a, 4, null, null, null, null, eqty.a(epwxVar), 60);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cmjk cmjkVar = new cmjk(ffguVar, this.a, this.b);
        cmjkVar.c = obj;
        return cmjkVar;
    }
}
