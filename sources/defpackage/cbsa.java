package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class cbsa implements cbrn {
    public final errl c;
    public final ffbr d;
    private final ffbr f;
    private final errl g;
    private final cbpl h;
    private final ffbr i;
    private final ffbr j;
    public static final entd a = entd.c("BugleSearch");
    private static final Pattern e = Pattern.compile("[^0-9]+");
    static final cfup b = cfvl.i(cfvl.b, "disable_logging_uma_async_icing_indexer_api_impl", false);

    public cbsa(ffbr ffbrVar, errl errlVar, errl errlVar2, cbpl cbplVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.f = ffbrVar;
        this.c = errlVar;
        this.g = errlVar2;
        this.h = cbplVar;
        this.i = ffbrVar2;
        this.d = ffbrVar3;
        this.j = ffbrVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static PartsTable.BindData l(List list) {
        enqv it = ((engw) list).iterator();
        while (it.hasNext()) {
            PartsTable.BindData bindData = (PartsTable.BindData) it.next();
            if (le.x(bindData.H()) || le.t(bindData.H())) {
                return bindData;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PartsTable.BindData m(MessageIdType messageIdType) {
        PartsTable.BindData bindData;
        List m = this.h.m(messageIdType);
        PartsTable.BindData l = l(m);
        if (l == null || TextUtils.isEmpty(l.K())) {
            StringBuilder sb = new StringBuilder();
            engw engwVar = (engw) m;
            enqv it = engwVar.iterator();
            while (it.hasNext()) {
                PartsTable.BindData bindData2 = (PartsTable.BindData) it.next();
                sb.append(bindData2.H());
                sb.append(",hasText:");
                sb.append(TextUtils.isEmpty(bindData2.K()));
            }
            ensz enszVar = (ensz) a.j();
            enszVar.Y(csux.a, messageIdType.b());
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/search/icing/AsyncIcingIndexerApiImpl", "getTextPartForAnnotation", 583, "AsyncIcingIndexerApiImpl.java")).t("Annotation for a message with unexpected content types: %s.", sb);
            enqv it2 = engwVar.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    bindData = null;
                    break;
                }
                PartsTable.BindData bindData3 = (PartsTable.BindData) it2.next();
                if (!TextUtils.isEmpty(bindData3.K())) {
                    bindData = bindData3;
                    break;
                }
            }
            boolean z = false;
            if (bindData != null && !TextUtils.isEmpty(bindData.K())) {
                z = true;
            }
            emxf.b(z, "There should be a text part, content types: ".concat(sb.toString()));
            l = bindData;
        }
        l.getClass();
        return l;
    }

    private final elfl n(elfl elflVar, final List list) {
        return elflVar.h(new emwl() { // from class: cbro
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                entd entdVar = cbsa.a;
                Stream map = Collection.EL.stream(list).map(new Function() { // from class: cbrq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        final cbry cbryVar = (cbry) obj2;
                        final String str = cbryVar.a;
                        final int i = cbryVar.c;
                        final int i2 = cbryVar.d;
                        return elfo.g(new Callable() { // from class: cbrx
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ((cbsv) cbry.this.b.d.b()).b(str, i - 1, i2);
                                return null;
                            }
                        }, cbryVar.b.c);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                elfo.j((Iterable) map.collect(endq.a));
                return true;
            }
        }, this.c).e(Exception.class, new emwl() { // from class: cbrp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final Exception exc = (Exception) obj;
                entd entdVar = cbsa.a;
                Stream map = Collection.EL.stream(list).map(new Function() { // from class: cbrt
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        final cbry cbryVar = (cbry) obj2;
                        entd entdVar2 = cbsa.a;
                        final String str = cbryVar.a;
                        final int i = cbryVar.c;
                        final int i2 = cbryVar.d;
                        final Exception exc2 = exc;
                        return elfo.g(new Callable() { // from class: cbrw
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                ((cbsv) cbry.this.b.d.b()).a(str, i - 1, i2, exc2);
                                return null;
                            }
                        }, cbryVar.b.c);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i = engw.d;
                elfo.j((Iterable) map.collect(endq.a));
                return false;
            }
        }, this.c);
    }

    private static String o(ParticipantsTable.BindData bindData) {
        return TextUtils.isEmpty(bindData.R()) ? bindData.P() : bindData.R();
    }

    private static String p(String str) {
        return !TextUtils.isEmpty(str) ? e.matcher(str).replaceAll("") : "";
    }

    @Override // defpackage.cbrn
    public final elfl a(final List list) {
        return elfo.h(new erog() { // from class: cbrv
            @Override // defpackage.erog
            public final ListenableFuture a() {
                List list2 = list;
                emxf.a(list2.size() <= ((Integer) cful.K.e()).intValue());
                cbrz cbrzVar = new cbrz();
                Iterator it = list2.iterator();
                while (true) {
                    cbsa cbsaVar = cbsa.this;
                    if (!it.hasNext()) {
                        return cbsaVar.g(cbrzVar);
                    }
                    cbsc cbscVar = (cbsc) it.next();
                    int i = cbscVar.b;
                    if (i == 1) {
                        cbsaVar.i(bdhb.b(cbscVar.c), cbrzVar);
                    } else if (i == 2) {
                        cbsaVar.h(bdgq.b(cbscVar.c), cbrzVar);
                    } else if (i == 3) {
                        cbsaVar.k(cbscVar.c, cbrzVar);
                    } else if (i == 4) {
                        cbsaVar.j(cbscVar.c, cbrzVar);
                    } else {
                        if (i != 11) {
                            throw new IllegalStateException(a.h(i, "Unexpected table tye value: "));
                        }
                        String str = cbscVar.c;
                        PartsTable.BindData a2 = PartsTable.a(str);
                        if (a2 == null) {
                            ensz enszVar = (ensz) cbsa.a.j();
                            enszVar.Y(csux.s, str);
                            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/datamodel/search/icing/AsyncIcingIndexerApiImpl", "recordOperationForTranscription", 390, "AsyncIcingIndexerApiImpl.java")).q("Ignoring the call since part id is not in PartsTable");
                        } else {
                            cbsaVar.i(a2.v(), cbrzVar);
                        }
                    }
                }
            }
        }, this.c);
    }

    @Override // defpackage.cbrn
    public final elfl b(List list) {
        emxf.a(list.size() <= ((Integer) cful.K.e()).intValue());
        cbrz cbrzVar = new cbrz();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h((ConversationIdType) it.next(), cbrzVar);
        }
        return g(cbrzVar);
    }

    @Override // defpackage.cbrn
    public final elfl c(List list) {
        emxf.a(list.size() <= ((Integer) cful.K.e()).intValue());
        cbrz cbrzVar = new cbrz();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            j((String) it.next(), cbrzVar);
        }
        return g(cbrzVar);
    }

    @Override // defpackage.cbrn
    public final elfl d(List list) {
        emxf.a(list.size() <= ((Integer) cful.K.e()).intValue());
        cbrz cbrzVar = new cbrz();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i((MessageIdType) it.next(), cbrzVar);
        }
        return g(cbrzVar);
    }

    @Override // defpackage.cbrn
    public final elfl e(List list) {
        emxf.a(list.size() <= ((Integer) cful.K.e()).intValue());
        cbrz cbrzVar = new cbrz();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            k((String) it.next(), cbrzVar);
        }
        return g(cbrzVar);
    }

    @Override // defpackage.cbrn
    public final void f() {
        ((eunj) this.f.b()).b().o(this.g, new dhqs() { // from class: cbru
            @Override // defpackage.dhqs
            public final void a(dhre dhreVar) {
                entd entdVar = cbsa.a;
                if (dhreVar.m()) {
                    ((ensz) ((ensz) cbsa.a.h()).h("com/google/android/apps/messaging/shared/datamodel/search/icing/AsyncIcingIndexerApiImpl", "removeAll", 184, "AsyncIcingIndexerApiImpl.java")).q("Removed all icing index successfully.");
                    return;
                }
                ensk j = cbsa.a.j();
                Exception h = dhreVar.h();
                h.getClass();
                ((ensz) ((ensz) ((ensz) j).g(h)).h("com/google/android/apps/messaging/shared/datamodel/search/icing/AsyncIcingIndexerApiImpl", "removeAll", (char) 187, "AsyncIcingIndexerApiImpl.java")).q("Failed to remove all icing index.");
            }
        });
    }

    public final elfl g(cbrz cbrzVar) {
        int i = engw.d;
        engr engrVar = new engr();
        if (!cbrzVar.a.isEmpty()) {
            emxf.l(!cbrzVar.c.isEmpty());
            engrVar.h(n(elfl.g(duin.a(((eunj) this.f.b()).a((String[]) cbrzVar.a.toArray(new String[0])))), cbrzVar.c));
        }
        if (!cbrzVar.b.isEmpty()) {
            emxf.l(!cbrzVar.d.isEmpty());
            engrVar.h(n(elfl.g(duin.a(((eunj) this.f.b()).c((eunt[]) cbrzVar.b.toArray(new eunt[0])))), cbrzVar.d));
        }
        engw g = engrVar.g();
        if (!g.isEmpty()) {
            return elfo.a(g).h(new emwl() { // from class: cbrs
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    entd entdVar = cbsa.a;
                    return Boolean.valueOf(Collection.EL.stream((List) obj).allMatch(new Predicate() { // from class: cbrr
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo439negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj2) {
                            entd entdVar2 = cbsa.a;
                            return ((Boolean) obj2).booleanValue();
                        }
                    }));
                }
            }, this.g);
        }
        ((ensz) a.o().h("com/google/android/apps/messaging/shared/datamodel/search/icing/AsyncIcingIndexerApiImpl", "execute", 635, "AsyncIcingIndexerApiImpl.java")).q("No operations applied within applyOperationsInIcing.");
        return elfo.e(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(ConversationIdType conversationIdType, cbrz cbrzVar) {
        bseh b2 = this.h.b(conversationIdType);
        if (b2 == null || TextUtils.isEmpty(b2.X())) {
            cbrzVar.a.add(cbst.b(conversationIdType));
            cbrzVar.c.add(new cbry(this, conversationIdType.a(), 3, 3));
            return;
        }
        List L = ((bczy) this.j.b()).L(conversationIdType);
        Set set = cbrzVar.b;
        ConversationIdType C = b2.C();
        String X = b2.X();
        X.getClass();
        euny eunyVar = new euny();
        eunyVar.f(cbst.b(C));
        eunyVar.h(X);
        eunyVar.g(C.a());
        euns eunsVar = new euns();
        eunsVar.b();
        eunsVar.c();
        eunyVar.e(eunsVar);
        int i = engw.d;
        engr engrVar = new engr();
        enqv it = ((engw) L).iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            if (bindData.W() != null) {
                engrVar.h(bindData.W());
            }
            if (bindData.P() != null) {
                engrVar.h(bindData.P());
                engrVar.h(p(bindData.P()));
            }
            if (bindData.U() != null) {
                engrVar.h(bindData.U());
            }
        }
        eunyVar.b((String[]) engrVar.g().toArray(new String[0]));
        set.add(eunyVar.a());
        cbrzVar.d.add(new cbry(this, conversationIdType.a(), 3, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(MessageIdType messageIdType, cbrz cbrzVar) {
        MessagesTable.BindData d = this.h.d(messageIdType);
        if (d == null || cbvv.h(d.s()) || TextUtils.isEmpty(d.X()) || d.C().b() || d.D() == null) {
            cbrzVar.a.add(cbst.c(messageIdType));
            cbrzVar.c.add(new cbry(this, messageIdType.b(), 2, 3));
            return;
        }
        ConversationIdType C = d.C();
        String b2 = emxe.b(d.X());
        List m = this.h.m(messageIdType);
        PartsTable.BindData l = l(m);
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList();
        enqv it = ((engw) m).iterator();
        while (it.hasNext()) {
            PartsTable.BindData bindData = (PartsTable.BindData) it.next();
            if (le.f(bindData.H())) {
                arrayList2.add(bindData.J());
            }
        }
        if (!arrayList2.isEmpty()) {
            for (String str : arrayList2) {
                String[] strArr = VmtTable.a;
                byyg byygVar = new byyg(VmtTable.a);
                byygVar.z("vmt.queryOnPartId");
                byygVar.q();
                byyk byykVar = new byyk();
                byykVar.b(str);
                byygVar.k(new byyj(byykVar));
                VmtTable.BindData bindData2 = (VmtTable.BindData) dtub.c(byygVar.b());
                if (bindData2 == null || bindData2.k() != ardn.VMT_STATUS_COMPLETE || bindData2.n() == null) {
                    ensk o = a.o();
                    o.Y(csux.s, str);
                    ((ensz) o.h("com/google/android/apps/messaging/shared/datamodel/search/icing/AsyncIcingIndexerApiImpl", "recordOperationForMessage", 248, "AsyncIcingIndexerApiImpl.java")).q("Audio part does not have a completed transcription");
                } else {
                    arrayList.add(bindData2.n());
                }
            }
        }
        if ((l == null || TextUtils.isEmpty(l.K())) && arrayList.isEmpty()) {
            ensk o2 = a.o();
            o2.Y(csux.a, messageIdType.b());
            ((ensz) o2.h("com/google/android/apps/messaging/shared/datamodel/search/icing/AsyncIcingIndexerApiImpl", "recordOperationForMessage", 259, "AsyncIcingIndexerApiImpl.java")).q("Ignoring the call since message doesn't have a text part");
            return;
        }
        Set set = cbrzVar.b;
        String K = l == null ? null : l.K();
        euoc euocVar = new euoc();
        euod euodVar = new euod();
        euodVar.d("participant_id", b2);
        euocVar.c("sender", euodVar);
        euocVar.f(cbst.c(messageIdType));
        euocVar.h(messageIdType.b());
        euocVar.d("conversation_id", C.a());
        euns eunsVar = new euns();
        eunsVar.b();
        eunsVar.c();
        euocVar.e(eunsVar);
        euny eunyVar = new euny();
        eunyVar.g(C.a());
        euocVar.c("isPartOf", eunyVar);
        if (!TextUtils.isEmpty(K)) {
            euocVar.d(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, K);
        }
        if (!arrayList.isEmpty()) {
            euocVar.b((String[]) arrayList.toArray(new String[0]));
        }
        set.add(euocVar.a());
        cbrzVar.d.add(new cbry(this, messageIdType.b(), 2, 2));
    }

    public final void j(String str, cbrz cbrzVar) {
        if (!((Boolean) cful.I.e()).booleanValue()) {
            ensk o = a.o();
            o.Y(csux.V, str);
            ((ensz) o.h("com/google/android/apps/messaging/shared/datamodel/search/icing/AsyncIcingIndexerApiImpl", "recordOperationForMessageAnnotation", 351, "AsyncIcingIndexerApiImpl.java")).q("Skipping indexing call for annotation due to phenotype flag being off.");
            return;
        }
        btrw c = this.h.c(str);
        if (c == null || c.m().c() || c.l().b() || TextUtils.isEmpty(c.o())) {
            cbrzVar.a.add(cbst.a(str));
            cbrzVar.c.add(new cbry(this, str, 5, 3));
            return;
        }
        if (cbqx.c(c)) {
            Set set = cbrzVar.b;
            c.n().getClass();
            MessageIdType m = c.m();
            m.getClass();
            ConversationIdType l = c.l();
            l.getClass();
            PartsTable.BindData m2 = m(m);
            euob euobVar = new euob();
            euobVar.f(cbst.a(c.o()));
            euobVar.h(cbqx.a(c, m2));
            euobVar.d("annotation_id", c.o());
            euobVar.d("message_id", m.b());
            euobVar.d("conversation_id", l.a());
            euns eunsVar = new euns();
            eunsVar.b();
            eunsVar.c();
            euobVar.e(eunsVar);
            set.add(euobVar.a());
            cbrzVar.d.add(new cbry(this, str, 5, 2));
            return;
        }
        if (!cbqx.b(c)) {
            ensk o2 = a.o();
            o2.Y(csux.V, c.o());
            ((ensz) o2.h("com/google/android/apps/messaging/shared/datamodel/search/icing/AsyncIcingIndexerApiImpl", "recordOperationForMessageAnnotation", 378, "AsyncIcingIndexerApiImpl.java")).q("Ignoring the call since annotation is not a link/location.");
            return;
        }
        Set set2 = cbrzVar.b;
        c.n().getClass();
        MessageIdType m3 = c.m();
        m3.getClass();
        ConversationIdType l2 = c.l();
        l2.getClass();
        PartsTable.BindData m4 = m(m3);
        eunz eunzVar = new eunz();
        eunzVar.f(cbst.a(c.o()));
        eunzVar.h(cbqx.a(c, m4));
        eunzVar.d("annotation_id", c.o());
        eunzVar.d("message_id", m3.b());
        eunzVar.d("conversation_id", l2.a());
        euns eunsVar2 = new euns();
        eunsVar2.b();
        eunsVar2.c();
        eunzVar.e(eunsVar2);
        set2.add(eunzVar.a());
        cbrzVar.d.add(new cbry(this, str, 5, 2));
    }

    public final void k(String str, cbrz cbrzVar) {
        ParticipantsTable.BindData e2 = this.h.e(str);
        if (e2 == null || TextUtils.isEmpty(o(e2)) || TextUtils.isEmpty(e2.U())) {
            if (e2 != null && !((Boolean) b.e()).booleanValue()) {
                ((akzt) this.i.b()).c("Bugle.Icing.Indexing.Input.Invalid.Participant");
            }
            cbrzVar.a.add(cbst.d(str));
            cbrzVar.c.add(new cbry(this, str, 4, 3));
            return;
        }
        if (TextUtils.isEmpty(e2.T()) && !((Boolean) cful.J.e()).booleanValue()) {
            ensk o = a.o();
            o.Y(csux.m, str);
            ((ensz) o.h("com/google/android/apps/messaging/shared/datamodel/search/icing/AsyncIcingIndexerApiImpl", "recordOperationForParticipant", 325, "AsyncIcingIndexerApiImpl.java")).q("Skipping indexing call for participant due to phenotype flag being off and participant not in contacts.");
            return;
        }
        String o2 = o(e2);
        Set set = cbrzVar.b;
        String S = e2.S();
        String U = e2.U();
        String P = e2.P();
        String T = e2.T();
        String p = p(P);
        euod euodVar = new euod();
        euodVar.h(o2);
        euodVar.f(cbst.d(S));
        euodVar.d("participant_id", S);
        euodVar.d("normalized_destination", U);
        euns eunsVar = new euns();
        eunsVar.b();
        eunsVar.c();
        euodVar.e(eunsVar);
        if (!TextUtils.isEmpty(p)) {
            euodVar.d("keywords", p);
        }
        if (!TextUtils.isEmpty(T)) {
            euodVar.d("lookup_key", T);
        }
        set.add(euodVar.a());
        cbrzVar.d.add(new cbry(this, str, 4, 2));
    }
}
