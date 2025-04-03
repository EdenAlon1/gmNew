package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.AnnotationSearchResult;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchResult;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cbnh {
    public abstract cbnh a(MessageIdType messageIdType);

    public abstract cbni b();

    public abstract void c(ConversationIdType conversationIdType);

    public abstract void d(boolean z);

    public abstract void e(boolean z);

    public abstract void f(fbuk fbukVar);

    public abstract void g(String str);

    public abstract void h(String str);

    public abstract void i(Long l);

    public abstract void j(String str);

    public abstract void k(String str);

    public abstract void l(String str);

    public abstract void m(String str);

    public abstract void n(Optional optional);

    public abstract void o(String str);

    public abstract void p(int i);

    public abstract void q(long j);

    public final cbnh r(AnnotationSearchResult annotationSearchResult, aolr aolrVar) {
        if (annotationSearchResult == null) {
            return this;
        }
        MessageIdType f = annotationSearchResult.f();
        f.getClass();
        cbnh a = a(f);
        annotationSearchResult.az(4, "conversation_id");
        ConversationIdType conversationIdType = annotationSearchResult.b;
        conversationIdType.getClass();
        cbmg cbmgVar = (cbmg) a;
        cbmgVar.a = conversationIdType;
        cbmgVar.b = annotationSearchResult.h();
        annotationSearchResult.az(12, "has_ea2p_bot_recipient");
        a.d(annotationSearchResult.g);
        annotationSearchResult.az(5, "received_timestamp");
        a.q(annotationSearchResult.c);
        annotationSearchResult.az(8, "full_name");
        cbmgVar.c = annotationSearchResult.e;
        Optional ofNullable = Optional.ofNullable(annotationSearchResult.h());
        aolrVar.getClass();
        a.n(ofNullable.map(new cbng(aolrVar)));
        annotationSearchResult.az(6, "sub_id");
        a.p(annotationSearchResult.d);
        cbmgVar.d = annotationSearchResult.g();
        annotationSearchResult.az(0, "_id");
        cbmgVar.e = annotationSearchResult.a;
        annotationSearchResult.az(9, "_id");
        a.e(annotationSearchResult.f > 0);
        return a;
    }

    public final void s(UrlSearchResult urlSearchResult, aolr aolrVar) {
        if (urlSearchResult == null) {
            return;
        }
        MessageIdType k = urlSearchResult.k();
        k.getClass();
        a(k);
        ConversationIdType j = urlSearchResult.j();
        j.getClass();
        c(j);
        o(urlSearchResult.r());
        d(urlSearchResult.t());
        q(urlSearchResult.i());
        m(urlSearchResult.m());
        Optional ofNullable = Optional.ofNullable(urlSearchResult.r());
        aolrVar.getClass();
        n(ofNullable.map(new cbng(aolrVar)));
        p(urlSearchResult.f());
        f(urlSearchResult.l());
        g(urlSearchResult.n());
        k(urlSearchResult.q());
        l(urlSearchResult.s());
        h(urlSearchResult.o());
        i(Long.valueOf(urlSearchResult.g()));
        j(urlSearchResult.p());
        e(urlSearchResult.h() > 0);
    }
}
