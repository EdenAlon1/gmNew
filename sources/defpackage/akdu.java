package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akdu extends ffhv implements ffjm {
    final /* synthetic */ akee a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akdu(ffgu ffguVar, akee akeeVar) {
        super(2, ffguVar);
        this.a = akeeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akdu) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        MessagesTable.d().z("getMessageCount");
        return new Long(r3.b().i());
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        akdu akduVar = new akdu(ffguVar, this.a);
        akduVar.b = obj;
        return akduVar;
    }
}
