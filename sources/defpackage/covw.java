package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public final class covw implements covs, cskg {
    public static final /* synthetic */ int b = 0;
    private static final cskc c = cskc.g("Bugle", "MmsSmsThreadIdResolver");
    private static final entd d = entd.c("Bugle");
    private static final enip e = enip.t("ʼUNKNOWN_SENDER!ʼ", "ʼWAP_PUSH_SI!ʼ", "EMERGENCY+SERVICE+PROVIDER", "EMERGENCY+SERVICE+PROVIDER+DEMO");
    private final Context f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final Map n = new HashMap();
    final Function a = new Function() { // from class: covu
        @Override // java.util.function.Function
        /* renamed from: andThen */
        public final /* synthetic */ Function mo448andThen(Function function) {
            return Function$CC.$default$andThen(this, function);
        }

        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
            int i = covw.b;
            return bindData != null ? Objects.toString(bindData.U(), "") : "";
        }

        public final /* synthetic */ Function compose(Function function) {
            return Function$CC.$default$compose(this, function);
        }
    };

    public covw(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        this.f = context;
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
        this.j = ffbrVar4;
        this.k = ffbrVar5;
        this.l = ffbrVar6;
        this.m = ffbrVar7;
    }

    private static String k(ParticipantsTable.BindData bindData) {
        return e.contains(bindData.W()) ? bindData.W() : bindData.P();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean m(Collection collection, Collection collection2) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
            enqv it2 = ((engw) collection2).iterator();
            while (it2.hasNext()) {
                ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) it2.next();
                if (bdtd.m(bindData2) || !TextUtils.equals(bindData.U(), bindData2.U())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.covs
    public final long a(cotp cotpVar, String str) {
        csix.h();
        ((cotq) this.l.b()).a(cotpVar);
        if (TextUtils.isEmpty(str)) {
            ensz enszVar = (ensz) d.i();
            enszVar.aa(ensy.FULL);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "resolveFromRecipient", 248, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.resolveFromRecipient returned invalid thread id because the recipient parameter was a null recipient");
            return -1L;
        }
        ParticipantsTable.BindData b2 = bdqu.b(str);
        csix.h();
        if (b2 != null) {
            return j(cotpVar, Collections.singleton(b2));
        }
        ensz enszVar2 = (ensz) d.i();
        enszVar2.aa(ensy.FULL);
        ((ensz) enszVar2.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "resolveFromParticipant", 306, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.resolveFromParticipant returned invalid thread id because the participant parameter was a null participant");
        return -1L;
    }

    @Override // defpackage.covs
    public final long b(ConversationIdType conversationIdType) {
        csix.h();
        try {
            if (((Boolean) ayhv.a.e()).booleanValue()) {
                return ((ayfi) this.k.b()).a(conversationIdType).a();
            }
            List L = ((bczy) this.g.b()).L(conversationIdType);
            if (!L.isEmpty()) {
                i();
                return d(L);
            }
            ensz enszVar = (ensz) d.i();
            enszVar.aa(ensy.FULL);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "safeResolveFromConversationId", 336, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromConversationId can't resolve a conversation with no recipients");
            return -1L;
        } catch (circ | IllegalArgumentException | SecurityException e2) {
            ((ensz) ((ensz) ((ensz) d.i()).g(e2)).h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "safeResolveFromConversationId", (char) 345, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromConversationId failed because of some runtime exceptions");
            return -1L;
        }
    }

    @Override // defpackage.covs
    public final long c(ParticipantsTable.BindData bindData) {
        csix.h();
        if (bindData != null) {
            return d(Collections.singleton(bindData));
        }
        ensz enszVar = (ensz) d.i();
        enszVar.aa(ensy.FULL);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "safeResolveFromParticipant", 155, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromParticipant returned invalid thread id because parameter was a null participant");
        return -1L;
    }

    @Override // defpackage.covs
    public final long d(Collection collection) {
        csix.h();
        try {
            return j(covk.a, collection);
        } catch (circ | IllegalArgumentException | SecurityException e2) {
            ((ensz) ((ensz) ((ensz) d.i()).g(e2)).h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "safeResolveFromParticipants", (char) 206, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromParticipants failed");
            return -1L;
        }
    }

    @Override // defpackage.covs
    public final /* synthetic */ long e(String str) {
        return f(covk.a, str);
    }

    @Override // defpackage.covs
    public final long f(cotp cotpVar, String str) {
        csix.h();
        ((cotq) this.l.b()).a(cotpVar);
        if (!TextUtils.isEmpty(str)) {
            return h(cotpVar, Collections.singleton(str));
        }
        ensz enszVar = (ensz) d.i();
        enszVar.aa(ensy.FULL);
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "safeResolveFromRecipient", 181, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromRecipient returned invalid thread id because parameter was a null recipient");
        return -1L;
    }

    @Override // defpackage.covs
    public final /* synthetic */ long g(Collection collection) {
        return h(covk.a, collection);
    }

    @Override // defpackage.covs
    public final long h(cotp cotpVar, Collection collection) {
        csix.h();
        ((cotq) this.l.b()).a(cotpVar);
        try {
            ekzz f = eleg.f("MmsSmsThreadIdResolver.resolveFromRecipients");
            try {
                csix.h();
                ((cotq) this.l.b()).a(cotpVar);
                if (collection != null && !collection.isEmpty()) {
                    ArrayList arrayList = new ArrayList(collection.size());
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (TextUtils.isEmpty(str)) {
                            c.r("empty recipient");
                        } else {
                            arrayList.add(bdqu.b(str));
                        }
                    }
                    long j = j(cotpVar, arrayList);
                    f.close();
                    return j;
                }
                ensz enszVar = (ensz) d.i();
                enszVar.aa(ensy.FULL);
                ((ensz) enszVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "resolveFromRecipients", 274, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.resolveFromRecipients returned invalid thread id because the recipients parameter was an empty collection of recipients");
                f.close();
                return -1L;
            } finally {
            }
        } catch (circ | IllegalArgumentException | SecurityException e2) {
            ((ensz) ((ensz) ((ensz) d.i()).g(e2)).h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "safeResolveFromRecipients", (char) 230, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.safeResolveFromRecipients failed because of some runtime exceptions");
            return -1L;
        }
    }

    @Override // defpackage.covs
    public final void i() {
        synchronized (this.n) {
            this.n.clear();
        }
    }

    public final long j(cotp cotpVar, Collection collection) {
        String join;
        Long l;
        long j;
        covv covvVar;
        ((cotq) this.l.b()).a(cotpVar);
        if (collection.size() == 1) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) collection.iterator().next();
            join = bindData != null ? bindData.U() : "null";
        } else {
            join = TextUtils.join(",", (List) Collection.EL.stream(collection).map(this.a).sorted().collect(Collectors.toCollection(new Supplier() { // from class: covt
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            })));
        }
        synchronized (this.n) {
            l = (Long) this.n.get(join);
        }
        if (l != null) {
            return l.longValue();
        }
        if (collection == null || collection.isEmpty()) {
            ensz enszVar = (ensz) d.i();
            enszVar.aa(ensy.FULL);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/sms/MmsSmsThreadIdResolverImpl", "resolveFromParticipants", 401, "MmsSmsThreadIdResolverImpl.java")).q("MmsSmsThreadIdResolver.resolveFromParticipants returned invalid thread id because the participants parameter was an empty collection of participants");
            j = -1;
        } else {
            if (collection.size() == 1) {
                ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) collection.iterator().next();
                String W = bindData2.W();
                String k = k(bindData2);
                boolean equals = TextUtils.equals(W, k);
                csjb a = c.a();
                a.I("get candidate thread Ids.");
                a.M("sendDestination", W);
                a.M("displayDestination", k);
                a.B("equal destinations", equals);
                a.r();
                covvVar = (covv) this.j.b();
                coxk coxkVar = (coxk) this.h.b();
                ayvm a2 = ((ayvn) this.m.b()).a();
                covvVar.a = coxkVar.h(this.f, cotpVar, W, a2);
                if (equals || TextUtils.isEmpty(k)) {
                    covvVar.b = covvVar.a;
                } else {
                    covvVar.b = coxkVar.h(this.f, cotpVar, k, a2);
                }
            } else {
                covvVar = (covv) this.j.b();
                ArrayList arrayList = new ArrayList();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ParticipantsTable.BindData) it.next()).W());
                }
                ArrayList arrayList2 = new ArrayList(collection.size());
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(k((ParticipantsTable.BindData) it2.next()));
                }
                coxk coxkVar2 = (coxk) this.h.b();
                ayvm a3 = ((ayvn) this.m.b()).a();
                covvVar.a = coxkVar2.i(this.f, cotpVar, arrayList, a3);
                covvVar.b = coxkVar2.i(this.f, cotpVar, arrayList2, a3);
            }
            cskc cskcVar = c;
            csjb a4 = cskcVar.a();
            a4.I("resolve from");
            a4.L("participants", collection);
            a4.z("idForSendDestinations", covvVar.a);
            a4.z("idForDisplayDestinations", covvVar.b);
            a4.r();
            j = covvVar.a;
            if (j != covvVar.b) {
                if (m(collection, covvVar.a(j))) {
                    csjb a5 = cskcVar.a();
                    a5.I("resolve using idForSendDestinations:");
                    a5.H(covvVar.a);
                    a5.r();
                    ((akzt) this.i.b()).c("Bugle.Datamodel.ResolveThreadIdWithSendDestinations.Counts");
                    j = covvVar.a;
                } else {
                    java.util.Collection a6 = covvVar.a(covvVar.b);
                    if (m(collection, a6)) {
                        csjb a7 = cskcVar.a();
                        a7.I("resolve using idForDisplayDestinations:");
                        a7.H(covvVar.b);
                        a7.r();
                        ((akzt) this.i.b()).e("Bugle.Datamodel.ResolveThreadIdWithDisplayDestinations.Counts", 1);
                        j = covvVar.b;
                    } else if (a6.isEmpty()) {
                        csjb a8 = cskcVar.a();
                        a8.I("resolve for empty displayDestinationParticipants.");
                        a8.z("idForDisplayDestinations", covvVar.b);
                        a8.r();
                        ((akzt) this.i.b()).e("Bugle.Datamodel.ResolveThreadIdWithDisplayDestinations.Counts", 2);
                        j = covvVar.b;
                    } else {
                        csjb a9 = cskcVar.a();
                        a9.I("resolve for non-empty displayDestinationParticipants.");
                        a9.z("idForSendDestinations", covvVar.a);
                        a9.r();
                        ((akzt) this.i.b()).c("Bugle.Datamodel.ResolveThreadIdWithSendDestinations.Counts");
                        j = covvVar.a;
                    }
                }
            }
        }
        Map map = this.n;
        Long valueOf = Long.valueOf(j);
        synchronized (map) {
            this.n.put(join, valueOf);
        }
        valueOf.getClass();
        return j;
    }

    @Override // defpackage.cskg
    public final void l(int i) {
        i();
    }
}
