package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnuy extends ffhv implements ffjm {
    final /* synthetic */ cnvb a;
    final /* synthetic */ cnuh b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnuy(ffgu ffguVar, cnvb cnvbVar, cnuh cnuhVar) {
        super(2, ffguVar);
        this.a = cnvbVar;
        this.b = cnuhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnuy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ekzz f = eleg.f("EmergencyConversationTombstoneEnforcer#ensureTombstoneAlignedWithSatelliteSession");
        try {
            cnvb cnvbVar = this.a;
            List list = cnvb.a;
            ((dtuu) cnvbVar.i.b()).d("EmergencyConversationTombstoneEnforcer#ensureTombstoneAlignedWithSatelliteSession", new cnva(this.a, this.b));
            ffig.a(f, null);
            return ffcu.a;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cnuy cnuyVar = new cnuy(ffguVar, this.a, this.b);
        cnuyVar.c = obj;
        return cnuyVar;
    }
}
