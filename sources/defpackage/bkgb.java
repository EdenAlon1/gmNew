package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.LocationAndLinkAnnotationIdsQuery;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bkgb extends dtyx<bkfx, bkfz, bkgb, LocationAndLinkAnnotationIdsQuery.BindData, bkfw> {
    public bkgb(String[] strArr) {
        super("messages_annotations", strArr, null, null, "annotation_type IN (6, 2)", "$primary");
    }

    @Override // defpackage.dtyx
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bkfz b() {
        l();
        return new bkfz(this.a.a());
    }
}
