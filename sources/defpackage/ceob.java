package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceob extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ceod b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceob(ffgu ffguVar, ceod ceodVar) {
        super(2, ffguVar);
        this.b = ceodVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceob) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        this.a = 1;
        buxo d = MessagesTable.d();
        d.z("BugleDbCmsObjectCounter#countAllObjects-messages");
        int i2 = d.b().i();
        bvvn e = ParticipantsTable.e();
        e.z("BugleDbCmsObjectCounter#countAllObjects-participants");
        int i3 = e.b().i();
        bsob e2 = bsom.e();
        e2.z("BugleDbCmsObjectCounter#countAllObjects-conversations");
        cenx cenxVar = new cenx(i2, e2.b().i(), i3);
        return cenxVar != ffhhVar ? cenxVar : ffhhVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ceob ceobVar = new ceob(ffguVar, this.b);
        ceobVar.c = obj;
        return ceobVar;
    }
}
