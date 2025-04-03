package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spx extends ffhv implements ffjm {
    private /* synthetic */ Object a;

    public spx(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((spx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        buxo d = MessagesTable.d();
        d.z("getBugleDatabaseAssetInfo-messages");
        int i = d.b().i();
        bsob e = bsom.e();
        e.z("getBugleDatabaseAssetInfo-conversations");
        int i2 = e.b().i();
        bwdf c = PartsTable.c();
        c.z("getBugleDatabaseAssetInfo-parts");
        c.h(spy.a);
        return new sor(i, i2, c.b().i());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        spx spxVar = new spx(ffguVar);
        spxVar.a = obj;
        return spxVar;
    }
}
