package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Collection;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import java.nio.charset.StandardCharsets;
import java.util.EnumSet;
import java.util.List;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crwv extends crvh {
    private static final enhk f;
    public final aolr c;
    private final ckch g;
    private final ckds h;
    private final coxk i;
    private final List j;
    private final ParticipantsTable.BindData k;
    private final bseh l;
    private final MessageCoreData m;
    private final boolean n;
    private final long o;
    private final enhk p;
    private final akzt q;
    private final bqvj r;
    private final ffbr s;
    private final atab t;
    private static final cskc d = cskc.g("BugleCms", "CmsConversationBuilderImpl");
    private static final enru e = enru.c("com/google/android/apps/messaging/shared/util/cloudstore/CmsConversationBuilderImpl");
    public static final emyl b = cfvl.w("cms_include_conversation_metadata_fields");

    static {
        enhd enhdVar = new enhd();
        enhdVar.k(byyt.UNARCHIVED, eshu.ACTIVE);
        enhdVar.k(byyt.ARCHIVED, eshu.ARCHIVED);
        enhdVar.k(byyt.KEEP_ARCHIVED, eshu.KEEP_ARCHIVED);
        enhdVar.k(byyt.SPAM_FOLDER, eshu.SPAM_FOLDER);
        enhdVar.k(byyt.BLOCKED_FOLDER, eshu.BLOCKED_FOLDER);
        enhdVar.k(byyt.CROSS_COUNTRY_FOLDER, eshu.CROSS_COUNTRY_FOLDER);
        f = enhdVar.c();
    }

    public crwv(ffbr ffbrVar, ckch ckchVar, ckds ckdsVar, coxk coxkVar, akzt akztVar, aolr aolrVar, ffbr ffbrVar2, atab atabVar, crwx crwxVar, bqvj bqvjVar) {
        super(ffbrVar);
        this.g = ckchVar;
        this.h = ckdsVar;
        this.i = coxkVar;
        this.l = crwxVar.c();
        this.j = crwxVar.e();
        this.k = crwxVar.d();
        this.m = crwxVar.b();
        this.n = crwxVar.g();
        this.c = aolrVar;
        this.s = ffbrVar2;
        this.q = akztVar;
        this.o = crwxVar.a();
        this.p = crwxVar.f();
        this.t = atabVar;
        this.r = bqvjVar;
    }

    private final String e(List list) {
        String str = (String) Collection.EL.stream(list).map(new Function() { // from class: crwr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String U;
                aoku aokuVar;
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                cfva cfvaVar = aoqm.a;
                if (((Boolean) new aopl().get()).booleanValue()) {
                    aokuVar = crwv.this.c.q(bindData);
                    U = aokuVar.o();
                } else {
                    U = bindData.U();
                    aokuVar = null;
                }
                if (TextUtils.isEmpty(U) || (((Boolean) new aopl().get()).booleanValue() && aokuVar != null && aokuVar.E())) {
                    U = bindData.W();
                }
                if (emxe.c(U)) {
                    throw new crwu();
                }
                return U;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).sorted().collect(Collectors.joining(","));
        byte[] bArr = new byte[16];
        int i = eodh.a;
        eodf.a.c(str, StandardCharsets.UTF_8).h(bArr);
        return eoeg.h.f().j(bArr);
    }

    private final String f() {
        if (this.l.k() != 2) {
            return e(this.j);
        }
        bseh bsehVar = this.l;
        String ac = bsehVar.ac();
        if (emxe.c(bsehVar.ad())) {
            throw new csgu(String.format("Conversation RCS Group id is null or empty! ConversationId is: [%s]", this.l.C()));
        }
        String ad = this.l.ad();
        ad.getClass();
        return ad.concat(emxe.b(ac));
    }

    private final void g(eswp eswpVar) {
        Optional empty = Optional.empty();
        try {
            esic esicVar = (esic) esid.a.createBuilder();
            eyja d2 = eykm.d(this.o);
            esicVar.copyOnWrite();
            esid esidVar = (esid) esicVar.instance;
            d2.getClass();
            esidVar.c = d2;
            esidVar.b |= 1;
            empty = Optional.of((esid) esicVar.build());
        } catch (IllegalArgumentException e2) {
            csjb e3 = d.e();
            e3.z("latestIncomingReadMessageTimestampMs", this.o);
            e3.I("Ignored invalid timestamp from BugleDb.");
            e3.s(e2);
        }
        if (empty.isPresent()) {
            byte[] byteArray = ((eydl) empty.get()).toByteArray();
            esii esiiVar = (esii) esij.a.createBuilder();
            l(byteArray, this.r, esiiVar);
            eswpVar.a("most_recent_read_message_time_phone", ((esij) esiiVar.build()).toByteString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void h(eswp eswpVar, EnumSet enumSet, boolean z) {
        esih esihVar;
        String str;
        cpbd l;
        int i;
        esif esifVar;
        if (enumSet.contains(crwp.FREQUENTLY_CHANGED_PART)) {
            eydp eydpVar = (eydp) eydq.a.createBuilder();
            eydpVar.copyOnWrite();
            ((eydq) eydpVar.instance).b = "type.googleapis.com/communication.messages.proto.cloud_store.encrypted_data.EncryptedData";
            eshw eshwVar = (eshw) eshx.a.createBuilder();
            esie esieVar = (esie) esif.a.createBuilder();
            MessageCoreData messageCoreData = this.m;
            if (messageCoreData == null) {
                esifVar = (esif) esieVar.build();
            } else {
                List list = this.j;
                final String aA = messageCoreData.aA();
                Optional findFirst = Collection.EL.stream(list).filter(new Predicate() { // from class: crwt
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
                    public final boolean test(Object obj) {
                        emyl emylVar = crwv.b;
                        return ((ParticipantsTable.BindData) obj).S().equals(aA);
                    }
                }).findFirst();
                if (findFirst.isPresent()) {
                    String Q = ((ParticipantsTable.BindData) findFirst.get()).Q();
                    String R = ((ParticipantsTable.BindData) findFirst.get()).R();
                    cfva cfvaVar = aoqm.a;
                    String aokrVar = ((Boolean) new aopl().get()).booleanValue() ? this.c.t((ParticipantsTable.BindData) findFirst.get()).G().toString() : ((ParticipantsTable.BindData) findFirst.get()).P();
                    if (Q != null) {
                        esieVar.copyOnWrite();
                        esif esifVar2 = (esif) esieVar.instance;
                        esifVar2.b = 1;
                        esifVar2.c = Q;
                    } else if (R != null) {
                        esieVar.copyOnWrite();
                        esif esifVar3 = (esif) esieVar.instance;
                        esifVar3.b = 1;
                        esifVar3.c = R;
                    } else if (aokrVar != null) {
                        esieVar.copyOnWrite();
                        esif esifVar4 = (esif) esieVar.instance;
                        esifVar4.b = 1;
                        esifVar4.c = aokrVar;
                    }
                }
                String ag = this.l.ag();
                if (ag != null) {
                    esieVar.copyOnWrite();
                    ((esif) esieVar.instance).d = ag;
                }
                String ab = this.l.ab();
                if (ab == null) {
                    ab = "unknown/unknown";
                }
                if (le.f(ab)) {
                    i = 8;
                } else if (le.j(ab)) {
                    i = 6;
                } else if (le.t(ab)) {
                    i = 11;
                } else if (le.n(ab)) {
                    i = 4;
                } else if (le.A(ab)) {
                    i = 9;
                } else if (le.z(ab)) {
                    i = 10;
                } else if (le.x(ab)) {
                    i = 3;
                } else {
                    MessageCoreData messageCoreData2 = this.m;
                    i = (messageCoreData2 == null || !cbvv.h(messageCoreData2.k())) ? 2 : 12;
                }
                esieVar.copyOnWrite();
                ((esif) esieVar.instance).f = i - 2;
                boolean z2 = !this.m.cK();
                esieVar.copyOnWrite();
                ((esif) esieVar.instance).e = z2;
                esifVar = (esif) esieVar.build();
            }
            eshwVar.copyOnWrite();
            eshx eshxVar = (eshx) eshwVar.instance;
            esifVar.getClass();
            eshxVar.c = esifVar;
            eshxVar.b |= 1;
            boolean z3 = this.n;
            eshwVar.copyOnWrite();
            ((eshx) eshwVar.instance).d = z3;
            String ah = this.l.ah();
            if (ah != null) {
                eshwVar.copyOnWrite();
                ((eshx) eshwVar.instance).g = ah;
            }
            eshu eshuVar = (eshu) f.getOrDefault(this.l.G(), eshu.ACTIVE);
            if (csgj.a() && ((Boolean) ((cfup) b.get()).e()).booleanValue()) {
                eswpVar.a("metadata_conversation_status", eyee.A(String.valueOf(eshuVar.a())));
            }
            eshwVar.copyOnWrite();
            ((eshx) eshwVar.instance).e = eshuVar.a();
            long x = this.l.x();
            eshwVar.copyOnWrite();
            ((eshx) eshwVar.instance).f = x;
            byte[] byteArray = ((eshx) eshwVar.build()).toByteArray();
            esii esiiVar = (esii) esij.a.createBuilder();
            l(byteArray, this.r, esiiVar);
            eyee byteString = ((esij) esiiVar.build()).toByteString();
            eydpVar.copyOnWrite();
            ((eydq) eydpVar.instance).c = byteString;
            eswpVar.copyOnWrite();
            eswr eswrVar = (eswr) eswpVar.instance;
            eydq eydqVar = (eydq) eydpVar.build();
            eswr eswrVar2 = eswr.a;
            eydqVar.getClass();
            eswrVar.h = eydqVar;
            eswrVar.b |= 2;
            byyt G = this.l.G();
            int i2 = (G == byyt.ARCHIVED || G == byyt.KEEP_ARCHIVED || G == byyt.SPAM_FOLDER || G == byyt.BLOCKED_FOLDER || G == byyt.CROSS_COUNTRY_FOLDER) ? 4 : 3;
            eswpVar.copyOnWrite();
            ((eswr) eswpVar.instance).f = i2 - 2;
        }
        if (enumSet.contains(crwp.RARELY_CHANGED_PART)) {
            eydp eydpVar2 = (eydp) eydq.a.createBuilder();
            eydpVar2.copyOnWrite();
            ((eydq) eydpVar2.instance).b = "type.googleapis.com/communication.messages.proto.cloud_store.encrypted_data.EncryptedData";
            eshy eshyVar = (eshy) eshz.a.createBuilder();
            engr engrVar = new engr();
            for (ParticipantsTable.BindData bindData : this.j) {
                String L = bindData.L();
                if (TextUtils.isEmpty(L)) {
                    k(bindData.S(), 1);
                } else {
                    engrVar.h(L);
                }
            }
            if (z && this.l.k() != 2) {
                bseh bsehVar = this.l;
                String R2 = bsehVar.R();
                String Q2 = bsehVar.Q();
                emxf.a(!TextUtils.isEmpty(R2));
                String e2 = e(this.j);
                R2.getClass();
                if (R2.startsWith("cms:")) {
                    if (!TextUtils.isEmpty(Q2) && !Q2.equals(e2)) {
                        throw new cshe(e2, Q2);
                    }
                    this.q.c("Bugle.Cms.UpdateConversation.Participants.Match.Count");
                } else {
                    if (!e2.equals(R2)) {
                        throw new cshd(R2, e2);
                    }
                    this.q.c("Bugle.Cms.UpdateConversation.Participants.Match.Count");
                }
            }
            engw g = engrVar.g();
            eshyVar.copyOnWrite();
            eshz eshzVar = (eshz) eshyVar.instance;
            eygr eygrVar = eshzVar.g;
            if (!eygrVar.c()) {
                eshzVar.g = eyfy.mutableCopy(eygrVar);
            }
            eydl.addAll(g, eshzVar.g);
            String X = this.l.X();
            if (!TextUtils.isEmpty(X)) {
                eshyVar.copyOnWrite();
                eshz eshzVar2 = (eshz) eshyVar.instance;
                X.getClass();
                eshzVar2.c = X;
            }
            djrv djrvVar = (djrv) this.s.b();
            ParticipantsTable.BindData bindData2 = this.k;
            int i3 = (!byyr.d(this.l.k()) || djrvVar.x(bindData2 == null ? -1 : bindData2.r())) ? 2 : 3;
            eshyVar.copyOnWrite();
            ((eshz) eshyVar.instance).d = esib.a(i3);
            esig esigVar = (esig) esih.a.createBuilder();
            ParticipantsTable.BindData bindData3 = this.k;
            if (bindData3 == null) {
                esihVar = (esih) esigVar.build();
            } else {
                int r = bindData3.r();
                esigVar.copyOnWrite();
                ((esih) esigVar.instance).b = r;
                esihVar = (esih) esigVar.build();
            }
            eshyVar.copyOnWrite();
            eshz eshzVar3 = (eshz) eshyVar.instance;
            esihVar.getClass();
            eshzVar3.e = esihVar;
            eshzVar3.b |= 1;
            eshp eshpVar = (eshp) ((esho) eshp.a.createBuilder()).build();
            eshyVar.copyOnWrite();
            eshz eshzVar4 = (eshz) eshyVar.instance;
            eshpVar.getClass();
            eshzVar4.f = eshpVar;
            eshzVar4.b |= 2;
            boolean z4 = this.l.H() == byyy.NAME_IS_AUTOMATIC;
            eshyVar.copyOnWrite();
            ((eshz) eshyVar.instance).i = z4;
            boolean am = this.l.am();
            eshyVar.copyOnWrite();
            ((eshz) eshyVar.instance).h = am;
            ParticipantsTable.BindData bindData4 = this.k;
            if (bindData4 != null) {
                String L2 = bindData4.L();
                if (TextUtils.isEmpty(L2)) {
                    k(this.k.S(), 1);
                } else {
                    eshyVar.copyOnWrite();
                    eshz eshzVar5 = (eshz) eshyVar.instance;
                    L2.getClass();
                    eshzVar5.j = L2;
                }
            }
            if (this.l.k() == 2) {
                if (((Boolean) ayhv.a.e()).booleanValue()) {
                    str = this.h.q(this.l.C());
                } else {
                    bseh bsehVar2 = this.l;
                    coxk coxkVar = this.i;
                    cpxu M = bsehVar2.M();
                    String I = coxkVar.I(M);
                    if (I != null) {
                        aoku aokuVar = (aoku) this.i.K(I).get(0);
                        if (((Boolean) ((cfup) ckds.a.get()).e()).booleanValue()) {
                            ckch ckchVar = this.g;
                            cfva cfvaVar2 = aoqm.a;
                            l = ckchVar.c(M, aokuVar.k(((Boolean) new aoqj().get()).booleanValue()), "");
                        } else {
                            ckds ckdsVar = this.h;
                            cfva cfvaVar3 = aoqm.a;
                            l = ckdsVar.l(M, aokuVar.k(((Boolean) new aoqj().get()).booleanValue()), "");
                        }
                        str = l.e;
                    } else {
                        str = null;
                    }
                }
                Optional ofNullable = Optional.ofNullable(emxe.a(str));
                if (ofNullable.isPresent()) {
                    String str2 = (String) ofNullable.get();
                    eshyVar.copyOnWrite();
                    ((eshz) eshyVar.instance).k = str2;
                }
                if (csgj.a() && ((Boolean) ((cfup) csfu.e.get()).e()).booleanValue() && !TextUtils.isEmpty(this.l.ae())) {
                    String ae = this.l.ae();
                    ae.getClass();
                    eshyVar.copyOnWrite();
                    ((eshz) eshyVar.instance).m = ae;
                }
                if (csgj.a() && ((Boolean) ((cfup) csfu.h.get()).e()).booleanValue()) {
                    long j = this.l.K().a;
                    eshyVar.copyOnWrite();
                    ((eshz) eshyVar.instance).n = j;
                }
                if (csgj.a() && ((Boolean) ((cfup) csfu.i.get()).e()).booleanValue()) {
                    int a = this.l.A().a();
                    eshyVar.copyOnWrite();
                    ((eshz) eshyVar.instance).o = a;
                }
                if (csgj.a() && ((Boolean) ((cfup) csgj.v.get()).e()).booleanValue() && this.l.ac() != null) {
                    String ac = this.l.ac();
                    ac.getClass();
                    eshyVar.copyOnWrite();
                    ((eshz) eshyVar.instance).l = ac;
                }
            }
            eshs eshsVar = (eshs) ((enot) csbr.e).d.get(Integer.valueOf(this.l.m()));
            if (eshsVar == null) {
                eshsVar = eshs.UNKNOWN_CONVERSATION_JOIN_STATE;
            }
            eshyVar.copyOnWrite();
            ((eshz) eshyVar.instance).p = eshsVar.a();
            eshv eshvVar = (eshv) ((enot) csbr.d).d.get(Integer.valueOf(this.l.k()));
            if (eshvVar == null) {
                eshvVar = eshv.UNKNOWN_CONVERSATION_TYPE;
            }
            eshyVar.copyOnWrite();
            ((eshz) eshyVar.instance).q = eshvVar.a();
            esht eshtVar = (esht) ((enot) csbr.f).d.get(Integer.valueOf(this.l.r()));
            if (eshtVar == null) {
                eshtVar = esht.CONVERSATION_SEND_MODE_AUTO;
            }
            eshyVar.copyOnWrite();
            ((eshz) eshyVar.instance).r = eshtVar.a();
            boolean ao = this.l.ao();
            eshyVar.copyOnWrite();
            ((eshz) eshyVar.instance).s = ao;
            if (csgj.a() && ((Boolean) ((cfup) b.get()).e()).booleanValue()) {
                eswpVar.a("read_only_status", eyee.A(String.valueOf(esib.a(i3))));
                eswpVar.a("join_state", eyee.A(String.valueOf(eshsVar.a())));
                eswpVar.a("conversation_type", eyee.A(String.valueOf(eshvVar.a())));
                eswpVar.a("send_mode", eyee.A(String.valueOf(eshtVar.a())));
            }
            if (this.t.a()) {
                esia esiaVar = (esia) ((enot) csbr.l).d.get(this.l.L());
                if (esiaVar == null) {
                    esiaVar = esia.STATUS_UNKNOWN_MMS_GROUP_UPGRADE_STATUS;
                }
                eshyVar.copyOnWrite();
                ((eshz) eshyVar.instance).t = esiaVar.a();
            }
            byte[] byteArray2 = ((eshz) eshyVar.build()).toByteArray();
            esii esiiVar2 = (esii) esij.a.createBuilder();
            l(byteArray2, this.r, esiiVar2);
            eyee byteString2 = ((esij) esiiVar2.build()).toByteString();
            eydpVar2.copyOnWrite();
            ((eydq) eydpVar2.instance).c = byteString2;
            eswpVar.copyOnWrite();
            eswr eswrVar3 = (eswr) eswpVar.instance;
            eydq eydqVar2 = (eydq) eydpVar2.build();
            eswr eswrVar4 = eswr.a;
            eydqVar2.getClass();
            eswrVar3.i = eydqVar2;
            eswrVar3.b |= 4;
        }
        if (enumSet.contains(crwp.ADDITIONAL_FIELDS_PART)) {
            final eshf eshfVar = (eshf) eshh.a.createBuilder();
            Map.EL.forEach(this.p, new BiConsumer() { // from class: crws
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    emyl emylVar = crwv.b;
                    String name = ((eshn) obj).name();
                    eshf.this.a(name, (eyee) obj2);
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            });
            esii esiiVar3 = (esii) esij.a.createBuilder();
            l(((eshh) eshfVar.build()).toByteArray(), this.r, esiiVar3);
            eswpVar.a("additional_fields", ((esij) esiiVar3.build()).toByteString());
        }
    }

    private final void i(eswp eswpVar) {
        String f2 = f();
        String Q = this.l.Q();
        if (!f2.equals(Q)) {
            if (this.l.k() != 2 && !TextUtils.isEmpty(Q)) {
                throw new cshe(f2, Q);
            }
            ensk h = e.h();
            h.Y(ente.a, "BugleCms");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsConversationBuilderImpl", "maybeRenewCmsCorrelationId", 262, "CmsConversationBuilderImpl.java")).J("Re-populate cms correlation id for conversation %s. Previous correlation_id = %s, new correlation_id = %s", ((eswr) eswpVar.instance).c, Q, f2);
            String[] strArr = bsom.a;
            bsoe bsoeVar = new bsoe();
            bsoeVar.j(f2);
            bsoeVar.f(this.l.C());
        }
        eswpVar.copyOnWrite();
        eswr eswrVar = (eswr) eswpVar.instance;
        eswr eswrVar2 = eswr.a;
        f2.getClass();
        eswrVar.d = f2;
    }

    public final eswr c() {
        csix.h();
        eswp eswpVar = (eswp) eswr.a.createBuilder();
        String R = this.l.R();
        if (!TextUtils.isEmpty(R)) {
            eswpVar.copyOnWrite();
            eswr eswrVar = (eswr) eswpVar.instance;
            R.getClass();
            eswrVar.c = R;
        } else if (this.t.a()) {
            String valueOf = String.valueOf(String.valueOf(UUID.randomUUID()));
            ensk e2 = e.e();
            e2.Y(ente.a, "BugleCms");
            enrr enrrVar = (enrr) ((enrr) e2).h("com/google/android/apps/messaging/shared/util/cloudstore/CmsConversationBuilderImpl", "buildCmsConversation", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "CmsConversationBuilderImpl.java");
            String a = this.l.C().a();
            String concat = "cms:".concat(valueOf);
            enrrVar.D("Use UUID = %s for conversation = %s", concat, a);
            eswpVar.copyOnWrite();
            ((eswr) eswpVar.instance).c = concat;
        } else {
            String f2 = f();
            eswpVar.copyOnWrite();
            eswr eswrVar2 = (eswr) eswpVar.instance;
            f2.getClass();
            eswrVar2.c = f2;
        }
        if (this.t.a()) {
            i(eswpVar);
        }
        g(eswpVar);
        h(eswpVar, EnumSet.allOf(crwp.class), false);
        return (eswr) eswpVar.build();
    }

    public final eswr d(EnumSet enumSet) {
        csix.h();
        emxf.b(!enumSet.isEmpty(), "updateType should be specified.");
        eswp eswpVar = (eswp) eswr.a.createBuilder();
        String R = this.l.R();
        if (!TextUtils.isEmpty(R)) {
            eswpVar.copyOnWrite();
            eswr eswrVar = (eswr) eswpVar.instance;
            R.getClass();
            eswrVar.c = R;
        }
        if (this.t.a()) {
            i(eswpVar);
        }
        g(eswpVar);
        h(eswpVar, enumSet, true);
        return (eswr) eswpVar.build();
    }
}
