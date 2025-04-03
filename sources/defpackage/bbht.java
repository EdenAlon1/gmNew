package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbht extends ffhv implements ffjm {
    private /* synthetic */ Object a;

    public bbht(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bbht) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        buxo d = MessagesTable.d();
        d.z("DatabaseBackerUpperLogger#getMessageCount");
        return new Integer(d.b().i());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bbht bbhtVar = new bbht(ffguVar);
        bbhtVar.a = obj;
        return bbhtVar;
    }
}
