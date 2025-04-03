package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Map;
import j$.util.Optional;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chwv implements ciin {
    public static final /* synthetic */ int k = 0;
    private static final enru l = enru.c("com/google/android/apps/messaging/shared/net/handler/InboxSendRpcHandler");
    private static final cfup m = cfvl.e(cfvl.b, "ditto_max_hours_to_retry_push", 24);
    private final boolean A;
    private final boolean B;
    private final eyee C;
    private final Optional D;
    private String E = "";
    private long F = 0;
    public final ffbr a;
    public final fcek b;
    public final String c;
    public final chep d;
    public final eyee e;
    public final String f;
    public final fcek g;
    public final ffbr h;
    public final ervk i;
    public String j;
    private final fazb n;
    private final akzt o;
    private final ffbr p;
    private final bzek q;
    private final chhw r;
    private final chyv s;
    private final fcek t;
    private final fbzr u;
    private final long v;
    private final cqoh w;
    private final ctyx x;
    private final bzgd y;
    private final errl z;

    public chwv(cgzv cgzvVar, cqoh cqohVar, ctyx ctyxVar, bzgd bzgdVar, chep chepVar, errl errlVar, ffbr ffbrVar, fazb fazbVar, akzt akztVar, chyw chywVar, ffbr ffbrVar2, chyp chypVar, chhw chhwVar, chhw chhwVar2, ffbr ffbrVar3, bzek bzekVar, chwu chwuVar) {
        String str;
        esaa esaaVar;
        this.j = "";
        this.w = cqohVar;
        this.x = ctyxVar;
        this.y = bzgdVar;
        this.d = chepVar;
        this.a = ffbrVar;
        this.n = fazbVar;
        this.o = akztVar;
        this.p = ffbrVar2;
        this.q = bzekVar;
        chhw chhwVar3 = true == ((cgcu) ffbrVar3.b()).a() ? chhwVar2 : chhwVar;
        this.r = chhwVar3;
        this.h = ffbrVar3;
        this.s = chywVar.a(chhwVar3, chypVar);
        this.C = chwuVar.o;
        Optional optional = chwuVar.p;
        this.D = optional;
        fcek fcekVar = chwuVar.a;
        this.t = fcekVar;
        if (((cgcu) ffbrVar3.b()).a() && optional.isPresent()) {
            this.b = ((bzge) optional.get()).d;
        } else {
            this.b = fcekVar;
        }
        this.z = errlVar;
        this.c = UUID.randomUUID().toString();
        if (!TextUtils.isEmpty(chwuVar.d)) {
            this.j = chwuVar.d;
        }
        fbzr fbzrVar = chwuVar.i;
        if (fbzrVar == null) {
            this.u = fbzr.STATUS;
        } else {
            this.u = fbzrVar;
        }
        this.v = chwuVar.j;
        this.e = chwuVar.e;
        this.A = chwuVar.f;
        this.B = chwuVar.g;
        this.f = chwuVar.m;
        this.g = chwuVar.n;
        ervj ervjVar = (ervj) ervk.a.createBuilder();
        long micros = TimeUnit.MILLISECONDS.toMicros(cqohVar.f().toEpochMilli());
        ervjVar.copyOnWrite();
        ((ervk) ervjVar.instance).f = micros;
        esaa esaaVar2 = chwuVar.b;
        ervjVar.copyOnWrite();
        ((ervk) ervjVar.instance).g = esaaVar2.a();
        boolean z = chwuVar.l;
        ervjVar.copyOnWrite();
        ((ervk) ervjVar.instance).e = z;
        int i = chwuVar.k;
        ervjVar.copyOnWrite();
        ((ervk) ervjVar.instance).d = i;
        if (!bzgdVar.w(this.b)) {
            ervjVar.copyOnWrite();
            ((ervk) ervjVar.instance).j = true;
        }
        if (!TextUtils.isEmpty(chwuVar.c)) {
            String str2 = chwuVar.c;
            ervjVar.copyOnWrite();
            ervk ervkVar = (ervk) ervjVar.instance;
            str2.getClass();
            ervkVar.b = str2;
        }
        if (!chwuVar.h.H()) {
            try {
                eyee t = cgzvVar.t(chwuVar.h, this.b);
                if (t == null || t.H()) {
                    csjy.l("BugleNetwork", "Encrypted Request Error was empty");
                } else if (((cgcu) ffbrVar3.b()).a()) {
                    ervjVar.copyOnWrite();
                    ((ervk) ervjVar.instance).k = t;
                } else {
                    ervjVar.copyOnWrite();
                    ((ervk) ervjVar.instance).c = t;
                }
            } catch (GeneralSecurityException e) {
                csjy.h("BugleNetwork", e, "Request Error Encryption Failed");
            }
        }
        if (!chwuVar.e.H()) {
            if (chwuVar.f || (esaaVar = chwuVar.b) == esaa.CREATE_GAIA_PAIRING_CLIENT_INIT || esaaVar == esaa.CREATE_GAIA_PAIRING_CLIENT_FINISHED || esaaVar == esaa.CANCEL_GAIA_PAIRING) {
                eyee eyeeVar = chwuVar.e;
                ervjVar.copyOnWrite();
                ervk ervkVar2 = (ervk) ervjVar.instance;
                eyeeVar.getClass();
                ervkVar2.h = eyeeVar;
            } else {
                try {
                    eyee t2 = cgzvVar.t(chwuVar.e, this.b);
                    if (t2 == null || t2.H()) {
                        csjy.l("BugleNetwork", "encryptedData was empty");
                    } else {
                        ervjVar.copyOnWrite();
                        ((ervk) ervjVar.instance).i = t2;
                    }
                } catch (GeneralSecurityException e2) {
                    csjy.h("BugleNetwork", e2, "Encryption failed");
                }
            }
        }
        ervk ervkVar3 = (ervk) ervjVar.build();
        this.i = ervkVar3;
        esaa b = esaa.b(ervkVar3.g);
        if (!(b == null ? esaa.UNRECOGNIZED : b).equals(esaa.GET_UPDATES) || chwuVar.e.H()) {
            esaa b2 = esaa.b(ervkVar3.g);
            csjy.c("BugleNetwork", "Created InboxSendRequest, type: ".concat(String.valueOf(String.valueOf(b2 == null ? esaa.UNRECOGNIZED : b2))));
            return;
        }
        try {
            esaa b3 = esaa.b(ervkVar3.g);
            String valueOf = String.valueOf(b3 == null ? esaa.UNRECOGNIZED : b3);
            switch (erxh.a(((erxi) eyfy.parseFrom(erxi.a, chwuVar.e, eyfc.a())).b)) {
                case 1:
                    str = "UPDATE_NOT_SET";
                    break;
                case 2:
                default:
                    str = "null";
                    break;
                case 3:
                    str = "CONVERSATION";
                    break;
                case 4:
                    str = "MESSAGE";
                    break;
                case 5:
                    str = "TYPING";
                    break;
                case 6:
                    str = "SETTINGS";
                    break;
                case 7:
                    str = "USER_ALERT";
                    break;
                case 8:
                    str = "BROWSER_PRESENCE_CHECK";
                    break;
                case 9:
                    str = "PARTICIPANTS";
                    break;
                case 10:
                    str = "CONVERSATION_TYPE";
                    break;
                case 11:
                    str = "FAVORITE_STICKER_PACKS";
                    break;
                case 12:
                    str = "RECENT_STICKERS";
                    break;
                case 13:
                    str = "CLOUD_STORE_INFO";
                    break;
                case 14:
                    str = "GET_BLOB_FOR_ATTACHMENT_PROGRESS_UPDATE";
                    break;
                case 15:
                    str = "UNPAIR_GAIA_PAIRING";
                    break;
                case 16:
                    str = "GAIA_PAIRING_INFO";
                    break;
            }
            csjy.c("BugleNetwork", a.m(str, valueOf, "Created InboxSendRequest, type: ", "."));
        } catch (eygu unused) {
            csjy.f("BugleNetwork", "Created InboxSendRequest, type: " + esaa.GET_UPDATES.a() + " with unknown inner type");
        }
    }

    public static void r(Throwable th) {
        if (th != null) {
            csjy.n("BugleNetwork", "Error executing RPC for Ditto InboxSendRpcHandler: ".concat(String.valueOf(th.getMessage())));
        }
    }

    @Deprecated
    public static void s(chep chepVar, fbzx fbzxVar, fcek fcekVar) {
        csjy.m("BugleNetwork", "result is %s", fbzxVar);
        long j = fbzxVar.c;
        if (j <= 0) {
            return;
        }
        synchronized (chepVar.e) {
            if (((Long) Map.EL.getOrDefault(chepVar.f, fcekVar, 0L)).longValue() < j) {
                chepVar.f.put(fcekVar, Long.valueOf(j));
            }
        }
    }

    private final void t(String str, long j) {
        if (j < this.x.e(str, Long.MAX_VALUE)) {
            this.x.k(str, j);
        }
    }

    @Override // defpackage.ciin
    public final long a() {
        return this.F;
    }

    @Override // defpackage.ciin
    public final ciil b() {
        return (((cgcu) this.h.b()).a() && p().equals("GDitto")) ? new ciih("GDitto") : ciil.c;
    }

    @Override // defpackage.ciin
    public final ListenableFuture c(fcfo fcfoVar) {
        fbzu fbzuVar = (fbzu) fbzv.a.createBuilder();
        fbzuVar.copyOnWrite();
        fbzv fbzvVar = (fbzv) fbzuVar.instance;
        fcfoVar.getClass();
        fbzvVar.f = fcfoVar;
        fbzvVar.b |= 4;
        fbzuVar.copyOnWrite();
        fbzv fbzvVar2 = (fbzv) fbzuVar.instance;
        fbzvVar2.c = this.t;
        fbzvVar2.b |= 1;
        fbzq fbzqVar = (fbzq) fbzt.a.createBuilder();
        fbzqVar.copyOnWrite();
        fbzt fbztVar = (fbzt) fbzqVar.instance;
        String str = this.c;
        str.getClass();
        fbztVar.c = str;
        fbzqVar.copyOnWrite();
        ((fbzt) fbzqVar.instance).k = this.u.a();
        fbzs fbzsVar = fbzs.DITTO;
        fbzqVar.copyOnWrite();
        ((fbzt) fbzqVar.instance).d = fbzsVar.a();
        eyee byteString = this.i.toByteString();
        fbzqVar.copyOnWrite();
        ((fbzt) fbzqVar.instance).e = byteString;
        fbzuVar.copyOnWrite();
        fbzv fbzvVar3 = (fbzv) fbzuVar.instance;
        fbzt fbztVar2 = (fbzt) fbzqVar.build();
        fbztVar2.getClass();
        fbzvVar3.e = fbztVar2;
        fbzvVar3.b |= 2;
        long j = this.v;
        if (j != 0) {
            fbzuVar.copyOnWrite();
            ((fbzv) fbzuVar.instance).g = j;
        }
        if (((cgcu) this.h.b()).a() && p().equals("GDitto")) {
            fbzuVar.a(this.C);
        }
        final fbzv fbzvVar4 = (fbzv) fbzuVar.build();
        this.E = fcfoVar.c;
        esaa b = esaa.b(this.i.g);
        if (b == null) {
            b = esaa.UNRECOGNIZED;
        }
        if (b.equals(esaa.GET_UPDATES)) {
            try {
                if (erxh.a(((erxi) eyfy.parseFrom(erxi.a, this.e, eyfc.a())).b) == 4) {
                    return ((bzaw) this.p.b()).b(this.b).h(new emwl() { // from class: chwr
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            int i = chwv.k;
                            return fbzv.this;
                        }
                    }, this.z).e(Exception.class, new emwl() { // from class: chws
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            int i = chwv.k;
                            csjy.p("BugleNetwork", (Exception) obj, "setDittoLastPushTimeMillis did not complete successfully");
                            return fbzv.this;
                        }
                    }, this.z);
                }
            } catch (eygu unused) {
                csjy.f("BugleNetwork", "CreateRequest, type: " + esaa.GET_UPDATES.a() + " with unknown inner type");
            }
        }
        return erqt.i(fbzvVar4);
    }

    @Override // defpackage.ciin
    public final String f() {
        return "InboxSendRpcHandler";
    }

    @Override // defpackage.ciin
    public final String g() {
        return this.E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0137, code lost:
    
        if (((defpackage.cgcu) r18.h.b()).a() != false) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0165  */
    @Override // defpackage.ciin
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(java.lang.Throwable r19) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chwv.h(java.lang.Throwable):void");
    }

    @Override // defpackage.ciin
    public final void i() {
        if (((cgcu) this.h.b()).a()) {
            esaa b = esaa.b(this.i.g);
            if (b == null) {
                b = esaa.UNRECOGNIZED;
            }
            csjy.j("BugleNetwork", "Executing RPC: className=%s, type=%s, dcrId=%s, tachyonId=%s, browserId=%s, proxy=%s", "InboxSendRpcHandler", Integer.valueOf(b.a()), this.i.b, this.c, this.b.c, this.r.getClass().getSimpleName());
            return;
        }
        esaa b2 = esaa.b(this.i.g);
        if (b2 == null) {
            b2 = esaa.UNRECOGNIZED;
        }
        csjy.j("BugleNetwork", "Executing RPC: className=%s, type=%s, dcrId=%s, tachyonId=%s, browserId=%s", "InboxSendRpcHandler", Integer.valueOf(b2.a()), this.i.b, this.c, this.b.c);
    }

    @Override // defpackage.ciin
    public final void j() {
        if (((cgcu) this.h.b()).a()) {
            esaa b = esaa.b(this.i.g);
            if (b == null) {
                b = esaa.UNRECOGNIZED;
            }
            csjy.j("BugleNetwork", "Received result for RPC: className=%s, type=%s, dcrId=%s, tachyonId=%s, browserId=%s, proxy=%s", "InboxSendRpcHandler", Integer.valueOf(b.a()), this.i.b, this.c, this.b.c, this.r.getClass().getSimpleName());
            return;
        }
        esaa b2 = esaa.b(this.i.g);
        if (b2 == null) {
            b2 = esaa.UNRECOGNIZED;
        }
        csjy.j("BugleNetwork", "Received result for RPC: className=%s, type=%s, dcrId=%s, tachyonId=%s, browserId=%s", "InboxSendRpcHandler", Integer.valueOf(b2.a()), this.i.b, this.c, this.b.c);
    }

    @Override // defpackage.cijo
    public final void k() {
        Status.Code code = Status.Code.OK;
        esaa b = esaa.b(this.i.g);
        if (b == null) {
            b = esaa.UNRECOGNIZED;
        }
        if (b.ordinal() != 19) {
            return;
        }
        try {
            erxi erxiVar = (erxi) eyfy.parseFrom(erxi.a, this.e, eyfc.a());
            int i = erxiVar.b;
            int a = erxh.a(i);
            if (a == 0) {
                throw null;
            }
            int i2 = a - 1;
            if (i2 == 2) {
                erur erurVar = (erur) Collections.min((i == 2 ? (eruy) erxiVar.c : eruy.a).b, new Comparator() { // from class: chwq
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int i3 = chwv.k;
                        return Long.compare(((erur) obj).f, ((erur) obj2).f);
                    }
                });
                if (erurVar != null) {
                    t("ditto_oldest_conversation_needing_update_timestamp_ms", TimeUnit.MICROSECONDS.toMillis(erurVar.f));
                    return;
                }
                return;
            }
            if (i2 == 3) {
                eygr eygrVar = (i == 3 ? (esac) erxiVar.c : esac.a).b;
                long micros = TimeUnit.MILLISECONDS.toMicros(this.w.f().toEpochMilli()) - TimeUnit.HOURS.toMicros(((Integer) m.e()).intValue());
                Iterator<E> it = eygrVar.iterator();
                long j = Long.MAX_VALUE;
                while (it.hasNext()) {
                    long j2 = ((erzn) it.next()).h;
                    if (j2 < micros) {
                        csjy.d("BugleNetworkRetry", "Message is skipped. Timestamp %d is older than cut-off %d.", Long.valueOf(j2), Long.valueOf(micros));
                    } else if (j2 < j) {
                        j = j2;
                    }
                }
                if (j != Long.MAX_VALUE) {
                    t("ditto_oldest_message_needing_update_timestamp_ms", TimeUnit.MICROSECONDS.toMillis(j));
                    return;
                }
                return;
            }
            if (i2 == 5) {
                this.x.h("ditto_settings_need_update", true);
                return;
            }
            if (i2 != 6) {
                return;
            }
            esea b2 = esea.b((i == 6 ? (esec) erxiVar.c : esec.a).b);
            if (b2 == null) {
                b2 = esea.UNRECOGNIZED;
            }
            int ordinal = b2.ordinal();
            if (ordinal == 1 || ordinal == 2 || ordinal == 3) {
                this.x.j("ditto_browser_inactive_needs_update", (erxiVar.b == 6 ? (esec) erxiVar.c : esec.a).b);
            } else {
                this.x.h("ditto_user_alert_needs_update", true);
            }
        } catch (eygu e) {
            csjy.h("BugleNetworkRetry", e, "Failed to unmarshall GetUpdatesResponse");
        }
    }

    public final cila m() {
        cikz cikzVar = (cikz) cila.a.createBuilder();
        cikzVar.copyOnWrite();
        cila cilaVar = (cila) cikzVar.instance;
        cilaVar.c = this.t;
        cilaVar.b |= 1;
        esaa b = esaa.b(this.i.g);
        if (b == null) {
            b = esaa.UNRECOGNIZED;
        }
        cikzVar.copyOnWrite();
        ((cila) cikzVar.instance).d = b.a();
        String str = this.i.b;
        cikzVar.copyOnWrite();
        cila cilaVar2 = (cila) cikzVar.instance;
        str.getClass();
        cilaVar2.e = str;
        eyee eyeeVar = this.e;
        cikzVar.copyOnWrite();
        cila cilaVar3 = (cila) cikzVar.instance;
        eyeeVar.getClass();
        cilaVar3.f = eyeeVar;
        boolean z = this.A;
        cikzVar.copyOnWrite();
        cila cilaVar4 = (cila) cikzVar.instance;
        cilaVar4.b |= 8;
        cilaVar4.n = z;
        fbzr fbzrVar = this.u;
        cikzVar.copyOnWrite();
        ((cila) cikzVar.instance).g = fbzrVar.a();
        boolean z2 = this.i.e;
        cikzVar.copyOnWrite();
        ((cila) cikzVar.instance).h = z2;
        int i = this.i.d;
        cikzVar.copyOnWrite();
        ((cila) cikzVar.instance).i = i;
        long j = this.v;
        cikzVar.copyOnWrite();
        ((cila) cikzVar.instance).j = j;
        boolean z3 = this.B;
        cikzVar.copyOnWrite();
        cila cilaVar5 = (cila) cikzVar.instance;
        cilaVar5.b |= 32;
        cilaVar5.p = z3;
        String str2 = this.f;
        if (str2 != null) {
            cikzVar.copyOnWrite();
            ((cila) cikzVar.instance).k = str2;
        }
        fcek fcekVar = this.g;
        if (fcekVar != null) {
            cikzVar.copyOnWrite();
            cila cilaVar6 = (cila) cikzVar.instance;
            cilaVar6.l = fcekVar;
            cilaVar6.b |= 2;
        }
        String str3 = this.j;
        if (str3 != null) {
            cikzVar.copyOnWrite();
            cila cilaVar7 = (cila) cikzVar.instance;
            cilaVar7.b |= 16;
            cilaVar7.o = str3;
        }
        if (((cgcu) this.h.b()).a() && p().equals("GDitto")) {
            fcek fcekVar2 = ((bzge) this.D.get()).d;
            cikzVar.copyOnWrite();
            cila cilaVar8 = (cila) cikzVar.instance;
            cilaVar8.c = fcekVar2;
            cilaVar8.b |= 1;
            if (this.g == null) {
                fcek fcekVar3 = ((bzge) this.D.get()).a;
                cikzVar.copyOnWrite();
                cila cilaVar9 = (cila) cikzVar.instance;
                cilaVar9.l = fcekVar3;
                cilaVar9.b |= 2;
            }
            if (!this.C.H()) {
                eyee eyeeVar2 = this.C;
                cikzVar.copyOnWrite();
                cila cilaVar10 = (cila) cikzVar.instance;
                eyeeVar2.getClass();
                cilaVar10.b |= 4;
                cilaVar10.m = eyeeVar2;
            }
        }
        return (cila) cikzVar.build();
    }

    @Override // defpackage.ciin
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final ListenableFuture d(chrv chrvVar, fbzv fbzvVar) {
        csjy.m("BugleNetwork", "Sent InboxSendRequest: %s", fbzvVar.toString());
        return chrvVar.a().e(fbzvVar);
    }

    @Override // defpackage.ciin
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final ListenableFuture e(fbzx fbzxVar) {
        long j;
        if (fbzxVar != null) {
            fcfq fcfqVar = fbzxVar.b;
            if (fcfqVar == null) {
                fcfqVar = fcfq.a;
            }
            j = fcfqVar.b;
        } else {
            j = 0;
        }
        this.F = j;
        return erqt.i(fbzxVar);
    }

    public final String p() {
        return this.t.d;
    }

    public final void q(ListenableFuture listenableFuture) {
        axnw.h(elfl.g(listenableFuture).h(new emwl() { // from class: chwn
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chwv chwvVar = chwv.this;
                chwv.s(chwvVar.d, (fbzx) obj, chwvVar.b);
                return null;
            }
        }, this.z).e(fedn.class, new emwl() { // from class: chwo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chwv.r((fedn) obj);
                return null;
            }
        }, this.z).e(cgyc.class, new emwl() { // from class: chwp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chwv.r((cgyc) obj);
                return null;
            }
        }, this.z));
    }

    @Override // defpackage.cijo
    public final /* synthetic */ void l() {
    }
}
