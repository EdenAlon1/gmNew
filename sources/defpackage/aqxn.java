package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqxn extends ffhv implements ffjm {
    final /* synthetic */ azsu a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqxn(ffgu ffguVar, azsu azsuVar) {
        super(2, ffguVar);
        this.a = azsuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqxn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        azsu azsuVar = this.a;
        bxtp a = ((aqwq) ProfilesTable.d("SelfProfileRowFactory#getOrCreateSelfProfileRow", new dtuo(new aqxp(azsuVar)), new dtum(aqxq.a), new dtun(new aqxr(azsuVar)))).a();
        a.getClass();
        return a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aqxn aqxnVar = new aqxn(ffguVar, this.a);
        aqxnVar.b = obj;
        return aqxnVar;
    }
}
