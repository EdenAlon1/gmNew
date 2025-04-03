package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.ConversationIdsQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class beiy extends dtyx<beiw, beix, beiy, ConversationIdsQuery.BindData, beiv> {
    public beiy(String[] strArr) {
        super("conversations", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final beix b() {
        l();
        return new beix(this.a.a());
    }
}
