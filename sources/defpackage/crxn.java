package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crxn implements crwz {
    public static final cskc a = cskc.g("BugleCms", "CmsConversationFactoryImpl");
    private static final enhk h;
    public final cryl b;
    public final crwy c;
    public final crwo d;
    public final eswr e;
    public boolean g;
    private final bdtd k;
    private final atab l;
    private final Supplier i = new crxl(this);
    public final Supplier f = new crxm(this);
    private final emyl j = emys.a(new emyl() { // from class: crxb
        @Override // defpackage.emyl
        public final Object get() {
            crxn crxnVar = crxn.this;
            try {
                crwo crwoVar = crxnVar.d;
                eyee eyeeVar = (eyee) DesugarCollections.unmodifiableMap(crxnVar.e.g).get("additional_fields");
                if (eyeeVar == null) {
                    eshh eshhVar = eshh.a;
                    eshhVar.getClass();
                    return eshhVar;
                }
                esij esijVar = (esij) eyfy.parseFrom(esij.a, eyeeVar, eyfc.a());
                esijVar.getClass();
                eyhs a2 = crwoVar.a.a(esijVar, eshh.a);
                a2.getClass();
                return (eshh) a2;
            } catch (cryh e) {
                csjb e2 = crxn.a.e();
                e2.I("Conversation AdditionalFields decryption succeeded. Original exception is logged below.");
                e2.A("cmsConversationId", crxnVar.e.c);
                e2.s(e);
                crxnVar.g = true;
                return (eshh) e.a;
            } catch (eygu e3) {
                csjb b = crxn.a.b();
                b.I("Failed to create AdditionalFieldsPart");
                b.A("cmsConversationId", crxnVar.e.c);
                b.s(e3);
                throw new crxh(e3);
            }
        }
    });

    static {
        enhd enhdVar = new enhd();
        enhdVar.k(eshu.ACTIVE, byyt.UNARCHIVED);
        enhdVar.k(eshu.ARCHIVED, byyt.ARCHIVED);
        enhdVar.k(eshu.KEEP_ARCHIVED, byyt.KEEP_ARCHIVED);
        enhdVar.k(eshu.SPAM_FOLDER, byyt.SPAM_FOLDER);
        enhdVar.k(eshu.BLOCKED_FOLDER, byyt.BLOCKED_FOLDER);
        enhdVar.k(eshu.CROSS_COUNTRY_FOLDER, byyt.CROSS_COUNTRY_FOLDER);
        h = enhdVar.c();
    }

    public crxn(bdtd bdtdVar, cryl crylVar, crwy crwyVar, crwo crwoVar, atab atabVar, eswr eswrVar) {
        this.k = bdtdVar;
        this.b = crylVar;
        this.c = crwyVar;
        this.d = crwoVar;
        this.e = eswrVar;
        this.l = atabVar;
    }

    private static eshx h(eshx eshxVar, eshx eshxVar2) {
        return eshxVar.f >= eshxVar2.f ? eshxVar : eshxVar2;
    }

    @Override // defpackage.crwz
    public final bseh a() {
        ayhd b;
        eshs eshsVar;
        efbd.b();
        eshz a2 = ((crxm) this.f).a();
        eshx a3 = ((crxl) this.i).a();
        String[] strArr = bsom.a;
        bsem bsemVar = new bsem();
        String str = this.e.c;
        if (!TextUtils.isEmpty(str)) {
            bsemVar.f(str);
        }
        String str2 = a2.c;
        if (!TextUtils.isEmpty(str2)) {
            bsemVar.M(str2);
        }
        int i = a2.q;
        esia esiaVar = null;
        eshv eshvVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : eshv.CONVERSATION_TYPE_GROUP_RCS : eshv.CONVERSATION_TYPE_GROUP_XMS : eshv.CONVERSATION_TYPE_ONE_ON_ONE : eshv.UNKNOWN_CONVERSATION_TYPE;
        if (eshvVar == null) {
            eshvVar = eshv.UNRECOGNIZED;
        }
        Integer num = (Integer) csbr.d.get(eshvVar);
        if (num != null) {
            bsemVar.i(num.intValue());
        }
        bsemVar.N(a2.i ? byyy.NAME_IS_AUTOMATIC : byyy.NAME_IS_MANUAL);
        bsemVar.k(((SelfIdentityIdImpl) this.k.e().g()).a);
        bsemVar.Y(a2.g.size());
        boolean isEmpty = this.e.e.isEmpty();
        eshx eshxVar = eshx.a;
        if (!isEmpty) {
            try {
                eshxVar = (eshx) eyfy.parseFrom(eshx.a, eoeg.e.k(this.e.e), eyfc.a());
            } catch (eygu | IllegalArgumentException e) {
                csjb e2 = a.e();
                e2.I("Could not decode snippet from subject");
                e2.A("cmsConversationId", this.e.c);
                e2.s(e);
            }
        }
        eswr eswrVar = this.e;
        eshx eshxVar2 = eshx.a;
        eyee eyeeVar = (eyee) DesugarCollections.unmodifiableMap(eswrVar.g).get("temp_snippet");
        if (eyeeVar != null) {
            try {
                eshxVar2 = (eshx) eyfy.parseFrom(eshx.a, eyeeVar, eyfc.a());
            } catch (eygu e3) {
                csjb e4 = a.e();
                e4.I("Could not decode snippet from opaque data");
                e4.A("cmsConversationId", this.e.c);
                e4.s(e3);
            }
        }
        eshx h2 = h(a3, h(eshxVar2, eshxVar));
        esif esifVar = h2.c;
        if (esifVar == null) {
            esifVar = esif.a;
        }
        String str3 = esifVar.d;
        if (!TextUtils.isEmpty(str3)) {
            bsemVar.at(str3);
        }
        bsemVar.ax(h2.g);
        bsemVar.au(h2.f);
        eshu b2 = eshu.b(a3.e);
        if (b2 == null) {
            b2 = eshu.UNRECOGNIZED;
        }
        bsemVar.c((byyt) h.getOrDefault(b2, byyt.UNARCHIVED));
        int i2 = a2.r;
        esht eshtVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : esht.CONVERSATION_SEND_MODE_XMS_LATCH : esht.CONVERSATION_SEND_MODE_XMS : esht.CONVERSATION_SEND_MODE_AUTO;
        if (eshtVar == null) {
            eshtVar = esht.UNRECOGNIZED;
        }
        Integer num2 = (Integer) csbr.f.get(eshtVar);
        boolean z = false;
        bsemVar.ap(num2 != null ? num2.intValue() : 0);
        bsemVar.J(a2.s);
        if (!TextUtils.isEmpty(this.e.c)) {
            final eygr eygrVar = ((crxm) this.f).a().g;
            bvvn e5 = ParticipantsTable.e();
            e5.z("+getIncludeEmailAddress");
            e5.h(new Function() { // from class: crxe
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bvvw bvvwVar = (bvvw) obj;
                    cskc cskcVar = crxn.a;
                    bvvwVar.e(eygrVar);
                    bvvwVar.aq(new dtrt("participants.normalized_destination", 11, "%@%"));
                    bvvwVar.w(-2);
                    return bvvwVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            z = Collection.EL.stream(e5.b().y()).anyMatch(new Predicate() { // from class: crxf
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
                    return bdqv.c((ParticipantsTable.BindData) obj);
                }
            });
        }
        bsemVar.C(z);
        bsemVar.g(csgg.CMS_RESTORE_IN_PROGRESS);
        if ((!((Boolean) ayhv.a.e()).booleanValue() || a2.l.isEmpty()) && num != null && num.intValue() == 2) {
            bsemVar.E(4);
        } else {
            switch (a2.p) {
                case 0:
                    eshsVar = eshs.UNKNOWN_CONVERSATION_JOIN_STATE;
                    break;
                case 1:
                    eshsVar = eshs.CONVERSATION_JOIN_STATE_JOINED;
                    break;
                case 2:
                    eshsVar = eshs.CONVERSATION_JOIN_STATE_INVITED;
                    break;
                case 3:
                    eshsVar = eshs.CONVERSATION_JOIN_STATE_LEFT;
                    break;
                case 4:
                    eshsVar = eshs.CONVERSATION_JOIN_STATE_DIFFERENT_CONFIG;
                    break;
                case 5:
                    eshsVar = eshs.CONVERSATION_JOIN_STATE_RECOVERED_FROM_TELEPHONY;
                    break;
                case 6:
                    eshsVar = eshs.CONVERSATION_JOIN_STATE_RCS_GROUP_CREATION_FAILED;
                    break;
                case 7:
                    eshsVar = eshs.CONVERSATION_JOIN_STATE_FORKED;
                    break;
                case 8:
                    eshsVar = eshs.CONVERSATION_JOIN_STATE_SETTING_UP_FOR_VANILLA_RCS;
                    break;
                case 9:
                    eshsVar = eshs.CONVERSATION_JOIN_STATE_RCS_GROUP_CREATION_IN_PROGRESS;
                    break;
                case 10:
                    eshsVar = eshs.CONVERSATION_JOIN_STATE_SATELLITE_ENDED;
                    break;
                default:
                    eshsVar = null;
                    break;
            }
            if (eshsVar == null) {
                eshsVar = eshs.UNRECOGNIZED;
            }
            Integer num3 = (Integer) csbr.e.get(eshsVar);
            if (num3 != null) {
                bsemVar.E(num3.intValue());
            }
        }
        String str4 = a2.k;
        if (!TextUtils.isEmpty(str4)) {
            bsemVar.ai(str4);
        }
        String str5 = a2.l;
        if (csgj.a() && ((Boolean) ((cfup) csgj.v.get()).e()).booleanValue() && !TextUtils.isEmpty(str5)) {
            bsemVar.af(str5);
        }
        if (num != null && num.intValue() == 2) {
            String str6 = a2.m;
            if (csgj.a() && ((Boolean) ((cfup) csfu.e.get()).e()).booleanValue() && !TextUtils.isEmpty(str6)) {
                bsemVar.ak(str6);
            }
            if (csgj.a() && ((Boolean) ((cfup) csfu.h.get()).e()).booleanValue()) {
                bsemVar.ag(new cknh(a2.n));
            }
            if (csgj.a() && ((Boolean) ((cfup) csfu.i.get()).e()).booleanValue() && (b = ayhd.b(a2.o)) != null) {
                bsemVar.x(b);
            }
        }
        if (this.l.a()) {
            String str7 = this.e.d;
            if (!TextUtils.isEmpty(str7)) {
                bsemVar.e(str7);
            }
            switch (a2.t) {
                case 0:
                    esiaVar = esia.STATUS_UNKNOWN_MMS_GROUP_UPGRADE_STATUS;
                    break;
                case 1:
                    esiaVar = esia.STATUS_NOT_ELIGIBLE_BECAUSE_INACTIVE;
                    break;
                case 2:
                    esiaVar = esia.STATUS_NOT_ELIGIBLE_NOT_EVERYONE_RCS;
                    break;
                case 3:
                    esiaVar = esia.STATUS_NOT_ELIGIBLE_WAITING_FOR_OUTDATED_GM_CLIENT;
                    break;
                case 4:
                    esiaVar = esia.STATUS_ELIGIBLE_FOR_UPGRADE_BUT_NOT_ACTIVE_UPGRADER;
                    break;
                case 5:
                    esiaVar = esia.STATUS_UPGRADE_STARTED;
                    break;
                case 6:
                    esiaVar = esia.STATUS_RCS_GROUP_CREATION_FAILED;
                    break;
                case 7:
                    esiaVar = esia.STATUS_RCS_GROUP_CREATION_SUCCEEDED;
                    break;
                case 8:
                    esiaVar = esia.STATUS_UPGRADE_FAILED;
                    break;
                case 9:
                    esiaVar = esia.STATUS_UPGRADE_COMPLETE;
                    break;
            }
            if (esiaVar == null) {
                esiaVar = esia.UNRECOGNIZED;
            }
            ckte ckteVar = (ckte) csbr.l.get(esiaVar);
            ckteVar.getClass();
            bsemVar.L(ckteVar);
        }
        return bsemVar.a();
    }

    @Override // defpackage.crwz
    public final engw b() {
        return engw.n(((crxm) this.f).a().g);
    }

    @Override // defpackage.crwz
    public final engw c() {
        efbd.b();
        if (TextUtils.isEmpty(this.e.c)) {
            int i = engw.d;
            return enou.a;
        }
        final engw b = b();
        bvvn e = ParticipantsTable.e();
        e.z("+getBugleParticipantIds");
        e.h(new Function() { // from class: crxd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                cskc cskcVar = crxn.a;
                bvvwVar.e(b);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        engw f = e.b().f();
        if (((enou) f).c >= b.size()) {
            return (engw) Collection.EL.stream(f).map(new Function() { // from class: crxc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cskc cskcVar = crxn.a;
                    String[] strArr = bsdr.a;
                    bsco bscoVar = new bsco();
                    bscoVar.f(Long.parseLong((String) obj));
                    return bscoVar.a();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(endq.a);
        }
        csjb e2 = a.e();
        e2.I("Failed to resolve one or more participants for CMS ids");
        e2.I(b);
        e2.A("cmsConversationId", this.e.c);
        e2.r();
        throw new crxk();
    }

    @Override // defpackage.crwz
    public final enip d() {
        final enip o = enip.o(b());
        bvvn e = ParticipantsTable.e();
        e.z("+getMissingCmsParticipantIds");
        e.h(new Function() { // from class: crxg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvvw bvvwVar = (bvvw) obj;
                cskc cskcVar = crxn.a;
                bvvwVar.e(enip.this);
                return bvvwVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bvti bvtiVar = (bvti) e.b().p(ParticipantsTable.c.E);
        try {
            engw k = bvtiVar.k();
            bvtiVar.close();
            return enpw.b(o, enip.o(k)).d();
        } catch (Throwable th) {
            try {
                bvtiVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.crwz
    public final eshh e() {
        efbd.b();
        return (eshh) this.j.get();
    }

    @Override // defpackage.crwz
    public final boolean f() {
        return this.g;
    }
}
