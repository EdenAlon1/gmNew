package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjos extends ffhv implements ffjm {
    final /* synthetic */ cjot a;
    final /* synthetic */ cjpb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjos(cjot cjotVar, cjpb cjpbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cjotVar;
        this.b = cjpbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjos) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        cjpb cjpbVar = this.b;
        cjqf cjqfVar = cjpbVar.c.e;
        ParticipantsTable.BindData bindData = ((bacf) this.a.a.c(cjpbVar.f.getAsString("address"), cjqfVar.b)).b;
        cjpb cjpbVar2 = this.b;
        cjov cjovVar = cjpbVar2.e;
        cjow cjowVar = cjpbVar2.c;
        long epochMilli = cjowVar.c.toEpochMilli();
        MessageIdType messageIdType = cjovVar.g;
        cjoq cjoqVar = cjpbVar2.d;
        cpxu cpxuVar = cjoqVar.b;
        cjqf cjqfVar2 = cjowVar.e;
        this.a.a.h(new bace(messageIdType, cjoqVar.a, bindData, cpxuVar, cjoqVar.c, epochMilli, cjqfVar2.b, cjqfVar2.f));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjos(this.a, this.b, ffguVar);
    }
}
