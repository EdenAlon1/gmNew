package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spa extends ffhv implements ffjm {
    final /* synthetic */ dfkh a;
    final /* synthetic */ spw b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spa(ffgu ffguVar, dfkh dfkhVar, spw spwVar) {
        super(2, ffguVar);
        this.a = dfkhVar;
        this.b = spwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((spa) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        buxo d = MessagesTable.d();
        d.z("checkHeuristics");
        long k = d.b().k(MessagesTable.c.i);
        eyja eyjaVar = this.a.c;
        if (eyjaVar == null) {
            eyjaVar = eyja.a;
        }
        if (eykm.b(eyjaVar) > k) {
            ((ensz) this.b.k.h()).q("Message timestamp check passed");
            return true;
        }
        if (this.a.d <= ((Number) this.b.a.b()).longValue()) {
            ((ensz) this.b.k.h()).q("Message count check passed");
            return true;
        }
        buxo d2 = MessagesTable.d();
        d2.z("checkHeuristics");
        if (d2.b().i() == 0) {
            ((ensz) this.b.k.h()).q("No messages found on source device");
            return false;
        }
        if (this.a.d / r8 < ((Number) this.b.b.b()).doubleValue()) {
            ((ensz) this.b.k.h()).q("Message count ratio check passed");
            return true;
        }
        ((ensz) this.b.k.h()).q("No heuristics passed");
        return false;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        spa spaVar = new spa(ffguVar, this.a, this.b);
        spaVar.c = obj;
        return spaVar;
    }
}
