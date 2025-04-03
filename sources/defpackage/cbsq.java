package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.Section;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbsq implements cbsf {
    public static final entd a = entd.c("BugleSearch");
    public static final cfup b = cfvl.i(cfvl.b, "disable_logging_clearcut_icing_search", false);
    public static final engw c = engw.r("internal.3p:Person_no_gsa");
    public static final engw d = engw.r("internal.3p:Message_no_gsa");
    public static final engw e = engw.r("internal.3p:Conversation_no_gsa");
    public final String f;
    public final Executor g;
    public final QuerySpecification h;
    public final ffbr i;
    public final dhou j;
    public final elbx k;

    public cbsq(Context context, errl errlVar, ffbr ffbrVar, dhou dhouVar, elbx elbxVar) {
        this.f = context.getPackageName();
        this.g = errlVar;
        dewf dewfVar = new dewf();
        dewfVar.b = 3;
        dewfVar.c(new Section("thing_proto", false, 0));
        dewfVar.b();
        dewfVar.c = "user-generated-query";
        this.h = dewfVar.a();
        dewf dewfVar2 = new dewf();
        dewfVar2.b();
        dewfVar2.c = "background-query";
        dewfVar2.a();
        this.i = ffbrVar;
        this.j = dhouVar;
        this.k = elbxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String c(Map map, String str) {
        faxl faxlVar = (faxl) map.get(str);
        faxlVar.getClass();
        emxf.l(faxlVar.c.size() == 1);
        return (String) faxlVar.c.get(0);
    }

    public static Map d(dewq dewqVar) {
        try {
            ArrayMap arrayMap = new ArrayMap();
            ByteBuffer c2 = dewqVar.c();
            if (c2 != null) {
                byte[] bArr = new byte[c2.remaining()];
                c2.get(bArr);
                for (faxl faxlVar : ((faxo) eyfy.parseFrom(faxo.a, bArr, eyfc.a())).b) {
                    arrayMap.put(faxlVar.b, faxlVar);
                }
            }
            return arrayMap;
        } catch (eygu e2) {
            ((ensz) ((ensz) ((ensz) a.i()).g(e2)).h("com/google/android/apps/messaging/shared/datamodel/search/icing/IcingSearchApiImpl", "getPropertiesMap", (char) 422, "IcingSearchApiImpl.java")).q("Unable to get Thing from document.");
            throw new IllegalStateException(e2);
        }
    }

    public static final Long e(dewq dewqVar) {
        String b2 = dewqVar.b();
        if (b2 == null) {
            ((ensz) ((ensz) a.j()).h("com/google/android/apps/messaging/shared/datamodel/search/icing/IcingSearchApiImpl", "getLastPathSegmentFromUri", 352, "IcingSearchApiImpl.java")).t("Couldn't get last segment for corpus %s, document uri is null.", dewqVar.a());
            return -1L;
        }
        String lastPathSegment = Uri.parse(b2).getLastPathSegment();
        lastPathSegment.getClass();
        return Long.valueOf(Long.parseLong(lastPathSegment));
    }

    @Override // defpackage.cbsf
    public final elfl a(SearchQuery searchQuery) {
        int i;
        String str = null;
        final Long l = null;
        for (SearchQuery.SearchFilter searchFilter : searchQuery.c()) {
            if (searchFilter instanceof SearchQuery.FreeTextSearchFilter) {
                str = ((SearchQuery.FreeTextSearchFilter) searchFilter).a;
            } else if (searchFilter instanceof SearchQuery.ConversationSearchFilter) {
                l = Long.valueOf(Long.parseLong(((SearchQuery.ConversationSearchFilter) searchFilter).a.a()));
            }
        }
        if (TextUtils.isEmpty(str)) {
            ((ensz) a.o().h("com/google/android/apps/messaging/shared/datamodel/search/icing/IcingSearchApiImpl", "search", 145, "IcingSearchApiImpl.java")).q("Empty query for search.");
            return elfo.e(cbne.e());
        }
        String e2 = cbst.e(str, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        if (TextUtils.isEmpty(e2)) {
            ensk o = a.o();
            o.Y(cbrm.b, str);
            ((ensz) o.h("com/google/android/apps/messaging/shared/datamodel/search/icing/IcingSearchApiImpl", "search", 156, "IcingSearchApiImpl.java")).q("Empty st query for search");
            return elfo.e(cbne.e());
        }
        cbov a2 = cbov.a(searchQuery);
        final ArrayList arrayList = new ArrayList();
        if (!a2.d || (i = a2.e) == 1 || i == 7) {
            arrayList.add(new cbsn(d, cbst.f(e2, cbst.e(str, "keywords"))));
        }
        String e3 = cbst.e(str, "name");
        if (l == null && (!a2.d || a2.e == 1)) {
            arrayList.add(new cbsn(e, cbst.f(e3, cbst.e(str, "keywords"))));
        }
        if (arrayList.isEmpty()) {
            return elfo.e(cbne.e());
        }
        final CancellationSignal a3 = searchQuery.a();
        emxf.a(!arrayList.isEmpty());
        final cmj cmjVar = new cmj();
        final cmj cmjVar2 = new cmj();
        final cmj cmjVar3 = new cmj();
        final cmj cmjVar4 = new cmj();
        final ArrayMap arrayMap = new ArrayMap();
        return elfl.g(kfg.a(new kfd() { // from class: cbsg
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                cbsq cbsqVar = cbsq.this;
                elbx elbxVar = cbsqVar.k;
                CancellationSignal cancellationSignal = a3;
                Long l2 = l;
                Set set = cmjVar;
                ArrayMap arrayMap2 = arrayMap;
                Set set2 = cmjVar2;
                List list = arrayList;
                Set set3 = cmjVar3;
                new cbsl(cbsqVar, list, cbsqVar.h, cbsqVar.g, kfbVar, elbxVar, cancellationSignal, l2, set, arrayMap2, set2, set3, cmjVar4).e();
                return "IcingSearchApiImpl.fetchMessageSearchResults";
            }
        }));
    }

    @Override // defpackage.cbsf
    public final elfl b(String str) {
        String f = cbst.f(cbst.e(str, "name"), cbst.e(str, "keywords"));
        if (TextUtils.isEmpty(f)) {
            ((ensz) a.o().h("com/google/android/apps/messaging/shared/datamodel/search/icing/IcingSearchApiImpl", "searchParticipants", BasePaymentResult.ERROR_REQUEST_TIMEOUT, "IcingSearchApiImpl.java")).q("Empty query for searchParticipants.");
            int i = engw.d;
            return elfo.e(enou.a);
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new cbsn(c, f));
        return elfl.g(kfg.a(new kfd() { // from class: cbsh
            @Override // defpackage.kfd
            public final Object a(kfb kfbVar) {
                cbsq cbsqVar = cbsq.this;
                new cbsm(cbsqVar, arrayList2, cbsqVar.h, cbsqVar.g, kfbVar, cbsqVar.k, arrayList).e();
                return "IcingSearchApiImpl.fetchParticipantSearchResults";
            }
        }));
    }
}
