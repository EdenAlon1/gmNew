package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddoc extends ffhv implements ffjm {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ ddoe f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddoc(ddoe ddoeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.f = ddoeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ddoc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x008f -> B:4:0x0092). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8) {
        /*
            r7 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r7.e
            if (r1 == 0) goto L13
            java.lang.Object r1 = r7.d
            java.lang.Object r2 = r7.c
            java.lang.Object r3 = r7.b
            java.lang.Object r4 = r7.a
            defpackage.ffci.b(r8)
            goto L92
        L13:
            defpackage.ffci.b(r8)
            ddoe r8 = r7.f
            fffs r1 = new fffs
            r2 = 0
            r1.<init>(r2)
            ejui r2 = defpackage.ddoe.a
            ddqh r2 = r8.c
            r3 = 0
            com.google.android.apps.messaging.ui.search.presenter.StarFilterDataItem r2 = r2.f(r3)
            r1.add(r2)
            com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ContentSearchFilter r2 = new com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ContentSearchFilter
            r3 = 2
            r2.<init>(r3)
            ddqh r3 = r8.c
            com.google.android.apps.messaging.ui.search.presenter.ContentFilterDataItem r2 = r3.b(r2)
            r1.add(r2)
            com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ContentSearchFilter r2 = new com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ContentSearchFilter
            r3 = 3
            r2.<init>(r3)
            ddqh r3 = r8.c
            com.google.android.apps.messaging.ui.search.presenter.ContentFilterDataItem r2 = r3.b(r2)
            r1.add(r2)
            com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ContentSearchFilter r2 = new com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ContentSearchFilter
            r3 = 5
            r2.<init>(r3)
            ddqh r3 = r8.c
            com.google.android.apps.messaging.ui.search.presenter.ContentFilterDataItem r2 = r3.b(r2)
            r1.add(r2)
            com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ContentSearchFilter r2 = new com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ContentSearchFilter
            r3 = 4
            r2.<init>(r3)
            ddqh r3 = r8.c
            com.google.android.apps.messaging.ui.search.presenter.ContentFilterDataItem r2 = r3.b(r2)
            r1.add(r2)
            java.util.Set r2 = r8.d
            java.util.Iterator r2 = r2.iterator()
            r4 = r8
            r3 = r1
            r1 = r2
            r2 = r3
        L70:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto Laf
            java.lang.Object r8 = r1.next()
            ddow r8 = (defpackage.ddow) r8
            elfl r8 = r8.a()
            r7.a = r4
            r7.b = r3
            r7.c = r2
            r7.d = r1
            r5 = 1
            r7.e = r5
            java.lang.Object r8 = defpackage.fgfz.c(r8, r7)
            if (r8 != r0) goto L92
            return r0
        L92:
            cbsx r8 = (defpackage.cbsx) r8
            boolean r5 = r8.d
            if (r5 == 0) goto L70
            r8.getClass()
            ejui r5 = defpackage.ddoe.a
            r5 = r4
            ddoe r5 = (defpackage.ddoe) r5
            ddqh r5 = r5.c
            com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ConversationListSearchFilter r6 = new com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery$ConversationListSearchFilter
            r6.<init>(r8)
            com.google.android.apps.messaging.ui.search.presenter.ConversationListFilterDataItem r8 = r5.d(r6)
            r2.add(r8)
            goto L70
        Laf:
            java.util.List r8 = defpackage.ffdx.a(r3)
            ddob r0 = new ddob
            r0.<init>()
            java.util.List r8 = defpackage.ffdx.ah(r8, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ddoc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new ddoc(this.f, ffguVar);
    }
}
