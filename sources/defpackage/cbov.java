package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbov {
    private static final entd i = entd.c("BugleSearch");
    public final String a;
    public final ConversationIdType b;
    public final String c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final cbsx h;
    private cboy j;

    private cbov(cbsx cbsxVar) {
        this.j = null;
        this.g = true;
        this.h = cbsxVar;
        this.a = null;
        this.b = bdgq.a;
        this.c = null;
        this.f = false;
        this.d = false;
        this.e = 1;
    }

    public static cbov a(SearchQuery searchQuery) {
        cbov cbovVar;
        boolean z = false;
        if (searchQuery == null) {
            return new cbov(null, bdgq.a, null, false);
        }
        List<SearchQuery.SearchFilter> c = searchQuery.c();
        ConversationIdType conversationIdType = bdgq.a;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        ConversationIdType conversationIdType2 = conversationIdType;
        int i2 = 1;
        boolean z3 = false;
        cbsx cbsxVar = null;
        for (SearchQuery.SearchFilter searchFilter : c) {
            if (searchFilter instanceof SearchQuery.ConversationSearchFilter) {
                conversationIdType2 = ((SearchQuery.ConversationSearchFilter) searchFilter).a;
                ensk n = i.n();
                n.Y(csux.o, conversationIdType2.toString());
                ((ensz) n.h("com/google/android/apps/messaging/shared/datamodel/search/common/QueryInfo", "infoFromQuery", 150, "QueryInfo.java")).q("Search query has conversation.");
            } else if (searchFilter instanceof SearchQuery.ContentSearchFilter) {
                i2 = ((SearchQuery.ContentSearchFilter) searchFilter).a;
                ensk n2 = i.n();
                n2.Y(csux.U, Integer.valueOf(i2));
                ((ensz) n2.h("com/google/android/apps/messaging/shared/datamodel/search/common/QueryInfo", "infoFromQuery", 157, "QueryInfo.java")).q("Search query has content.");
                z3 = true;
            } else if (searchFilter instanceof SearchQuery.ParticipantSearchFilter) {
                str2 = ((SearchQuery.ParticipantSearchFilter) searchFilter).a;
                ensk n3 = i.n();
                n3.Y(cbrm.f, str2);
                ((ensz) n3.h("com/google/android/apps/messaging/shared/datamodel/search/common/QueryInfo", "infoFromQuery", 163, "QueryInfo.java")).q("Search query has participant.");
            } else if (searchFilter instanceof SearchQuery.FreeTextSearchFilter) {
                str = ((SearchQuery.FreeTextSearchFilter) searchFilter).a;
                ensk n4 = i.n();
                n4.Y(cbrm.c, str);
                ((ensz) n4.h("com/google/android/apps/messaging/shared/datamodel/search/common/QueryInfo", "infoFromQuery", 169, "QueryInfo.java")).q("Search query has free text.");
            } else if (searchFilter instanceof SearchQuery.StarSearchFilter) {
                ensk n5 = i.n();
                n5.Y(cbrm.d, true);
                ((ensz) n5.h("com/google/android/apps/messaging/shared/datamodel/search/common/QueryInfo", "infoFromQuery", 175, "QueryInfo.java")).q("Search query has star filter.");
                z2 = true;
            } else if (searchFilter instanceof SearchQuery.ConversationListSearchFilter) {
                cbsxVar = ((SearchQuery.ConversationListSearchFilter) searchFilter).a;
                ensk n6 = i.n();
                n6.Y(cbrm.e, true);
                ((ensz) n6.h("com/google/android/apps/messaging/shared/datamodel/search/common/QueryInfo", "infoFromQuery", 182, "QueryInfo.java")).q("Search query has ConversationList filter.");
                z = true;
            }
        }
        if (z) {
            cbsxVar.getClass();
            cbovVar = new cbov(cbsxVar);
        } else {
            cbovVar = z3 ? new cbov(str, conversationIdType2, str2, i2, z2) : new cbov(str, conversationIdType2, str2, z2);
        }
        cboy b = searchQuery.b();
        if (b != null) {
            cbovVar.j = b;
        }
        return cbovVar;
    }

    public final Optional b() {
        return Optional.ofNullable(this.j);
    }

    public final boolean c() {
        return !this.b.b();
    }

    public final boolean d() {
        return !TextUtils.isEmpty(this.a);
    }

    public final boolean e() {
        return !TextUtils.isEmpty(this.c);
    }

    public final boolean f() {
        return (d() || c() || e() || this.d || this.f || this.g) ? false : true;
    }

    private cbov(String str, ConversationIdType conversationIdType, String str2, int i2, boolean z) {
        this.h = null;
        this.j = null;
        this.a = str;
        this.b = conversationIdType;
        this.c = str2;
        this.d = true;
        this.e = i2;
        this.f = z;
        this.g = false;
    }

    private cbov(String str, ConversationIdType conversationIdType, String str2, boolean z) {
        this.h = null;
        this.j = null;
        this.a = str;
        this.b = conversationIdType;
        this.c = str2;
        this.f = z;
        this.d = false;
        this.e = 1;
        this.g = false;
    }
}
