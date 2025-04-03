package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MessageWithTextIdsQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bofb extends dtyx<boex, boez, bofb, MessageWithTextIdsQuery.BindData, boew> {
    public bofb(String[] strArr) {
        super("parts", strArr, null, null, "content_type IN ('text/plain', 'text/html', 'application/vnd.wap.xhtml+xml', 'application/vnd.gsma.rcspushlocation+xml') AND length(text) > 0", "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boez b() {
        l();
        return new boez(this.a.a());
    }
}
