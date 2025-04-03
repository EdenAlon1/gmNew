package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azsy extends ffhv implements ffjm {
    final /* synthetic */ aztd a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public azsy(ffgu ffguVar, aztd aztdVar) {
        super(2, ffguVar);
        this.a = aztdVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((azsy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bvvn e = ParticipantsTable.e();
        e.z("ParticipantsTableUpgrader-upgrade");
        e.h(azta.a);
        e.h(aztb.a);
        dtvy i = dtvz.i(bxth.a().b(), bxth.c.h, ParticipantsTable.c.a);
        i.d(true);
        e.G(i.g());
        engw y = e.b().y();
        y.getClass();
        aztd aztdVar = this.a;
        aztdVar.b.d("ParticipantsTableUpgrader#upgrade", new azsz(y, aztdVar));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        azsy azsyVar = new azsy(ffguVar, this.a);
        azsyVar.b = obj;
        return azsyVar;
    }
}
