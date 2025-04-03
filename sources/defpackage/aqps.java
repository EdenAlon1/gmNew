package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqps extends ffhv implements ffjm {
    int a;
    final /* synthetic */ aqpu b;
    final /* synthetic */ ParticipantsTable.BindData c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqps(aqpu aqpuVar, ParticipantsTable.BindData bindData, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = aqpuVar;
        this.c = bindData;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqps) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        aqqc aqqcVar = (aqqc) this.b.c.b();
        ParticipantsTable.BindData bindData = this.c;
        this.a = 1;
        Object c = aqqcVar.c(bindData, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqps(this.b, this.c, ffguVar);
    }
}
