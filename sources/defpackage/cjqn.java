package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjqn extends ffhv implements ffjm {
    private /* synthetic */ Object a;

    public cjqn(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjqn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        bwon a = ProfilesTable.a();
        a.z("getPeopleProfileConsumerStateV2");
        a.e(cjqp.a);
        a.c(cjqq.a);
        a.r();
        int i = a.b().i();
        eorg eorgVar = (eorg) eorh.a.createBuilder();
        eorgVar.getClass();
        eorgVar.copyOnWrite();
        eorh eorhVar = (eorh) eorgVar.instance;
        eorhVar.b |= 1;
        eorhVar.c = i;
        eorgVar.copyOnWrite();
        eorh eorhVar2 = (eorh) eorgVar.instance;
        eorhVar2.b |= 2;
        eorhVar2.d = 2;
        eyfy build = eorgVar.build();
        build.getClass();
        return (eorh) build;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjqn cjqnVar = new cjqn(ffguVar);
        cjqnVar.a = obj;
        return cjqnVar;
    }
}
