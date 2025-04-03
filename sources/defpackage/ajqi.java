package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajqi extends ffhv implements ffjm {
    final /* synthetic */ MessageIdType a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajqi(ffgu ffguVar, MessageIdType messageIdType) {
        super(2, ffguVar);
        this.a = messageIdType;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ajqi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        buxo d = MessagesTable.d();
        d.z("queryUsageStatsLoggingId");
        d.f(ajqj.a);
        d.h(new ajqk(this.a));
        MessagesTable.BindData bindData = (MessagesTable.BindData) ((buuo) d.b().o()).cS();
        if (bindData == null) {
            ensz enszVar = (ensz) ajql.a.j();
            ensn ensnVar = ajro.a;
            enszVar.Y(ajro.c, this.a.b());
            enszVar.q("LruCacheRepliesNavigationLogger queryUsageStatsLoggingId found no results");
        }
        Long l = bindData != null ? new Long(bindData.A()) : null;
        if (l != null && l.longValue() == 0) {
            return null;
        }
        return l;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ajqi ajqiVar = new ajqi(ffguVar, this.a);
        ajqiVar.b = obj;
        return ajqiVar;
    }
}
