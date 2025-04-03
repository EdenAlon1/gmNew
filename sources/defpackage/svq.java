package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class svq extends ffhv implements ffjm {
    final /* synthetic */ Object a;
    final /* synthetic */ svr b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public svq(ffgu ffguVar, Object obj, svr svrVar) {
        super(2, ffguVar);
        this.a = obj;
        this.b = svrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((svq) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        Object obj2 = this.a;
        if (ffch.d(obj2)) {
            List<ParticipantsTable.BindData> list = (List) obj2;
            ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
            for (ParticipantsTable.BindData bindData : list) {
                bcxj bcxjVar = this.b.a;
                azze azzeVar = (azze) bcxjVar.a.b();
                azzeVar.getClass();
                aolr aolrVar = (aolr) bcxjVar.b.b();
                aolrVar.getClass();
                bindData.getClass();
                arrayList.add(new bcxi(azzeVar, aolrVar, bindData));
            }
            obj2 = arrayList;
        }
        return new ffch(obj2);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        svq svqVar = new svq(ffguVar, this.a, this.b);
        svqVar.c = obj;
        return svqVar;
    }
}
