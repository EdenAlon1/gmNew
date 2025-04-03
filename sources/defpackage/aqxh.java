package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqxh extends ffhv implements ffjm {
    final /* synthetic */ aqxl a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqxh(ffgu ffguVar, aqxl aqxlVar) {
        super(2, ffguVar);
        this.a = aqxlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqxh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bvvn e = ParticipantsTable.e();
        e.z("toProfilesTableBindData");
        bvvw bvvwVar = new bvvw();
        bvvwVar.b(new aqxi(this.a));
        e.k(new bvvs(bvvwVar));
        engw cW = ((bvti) e.b().o()).cW();
        cW.getClass();
        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) ffdx.K(cW);
        bindData.getClass();
        return aqli.a(bindData);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        aqxh aqxhVar = new aqxh(ffguVar, this.a);
        aqxhVar.b = obj;
        return aqxhVar;
    }
}
