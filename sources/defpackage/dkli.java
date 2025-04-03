package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkli extends dkkj {
    public static final /* synthetic */ int Z = 0;
    public boolean Y;
    private eegk aa;
    private String ab;
    private String ac;
    private String ad;
    private int ae;

    public dkli(Context context, dkgm dkgmVar, ffbr ffbrVar, String str, eeft eeftVar, dkrp dkrpVar, diod diodVar, dkur dkurVar, InstantMessageConfiguration instantMessageConfiguration, int i, dikx dikxVar) {
        super(context, dkgmVar, ffbrVar, str, eeftVar, dkrpVar, diodVar, dkurVar, instantMessageConfiguration, i, dikxVar);
        dkty.c("Creating a new chat session as originating to %s", dktx.USER_ID.c(str));
    }

    @Override // defpackage.dkha
    protected final String A() {
        return "OriginatingChatSession";
    }

    @Override // defpackage.dkkj, defpackage.dkha
    protected final void P() {
        String str;
        try {
            eenh g = this.l.g();
            if (g == null) {
                throw new eehb("SDB body part cannot be null");
            }
            String b = g.b();
            if (b == null) {
                throw new eehb("SDB content cannot be null");
            }
            eehg b2 = eehd.b(b);
            eegw eegwVar = (eegw) b2.c.get(0);
            eegu a = eegwVar.a("path");
            if (a == null || a.b == null) {
                throw new eehb("Media path in SDP session description cannot be null");
            }
            eegu a2 = eegwVar.a("fingerprint");
            eegu a3 = eegwVar.a("msrp-cema");
            eegu a4 = eegwVar.a("setup");
            if (a2 != null && (str = a2.b) != null) {
                this.ac = str;
            }
            String str2 = b2.d() ? b2.h.a : eegwVar.c.a;
            String str3 = a.b;
            str3.getClass();
            int i = eegwVar.a;
            this.ad = str2;
            this.ab = str3;
            this.ae = i;
            if (dizq.n() && a3 == null && a4 != null && Objects.equals(a4.b, "active")) {
                try {
                    if (!this.ad.equals(eegw.d(this.ab))) {
                        dkty.g("Reached unimplemented CEMA retry case!", new Object[0]);
                    }
                } catch (Exception e) {
                    throw new eehb("MSRP Path is not a valid MSRP URI", e);
                }
            }
            super.P();
        } catch (Exception e2) {
            dkty.i(e2, "Error while completing session: %s", e2.getMessage());
            throw new dkhl(e2);
        }
    }

    @Override // defpackage.dkkj, defpackage.dkha
    protected final void T(eenk eenkVar) {
        if (!this.Y && aE() != null && aE().size() > 0) {
            eenkVar.r("Require: recipient-list-invite");
        }
        if (((dkkj) this).E) {
            dkty.c("Overriding accept-contact header for conference invitation.Client must only set IM tag!", new Object[0]);
            try {
                dkut.t(eenkVar, dizg.E() ? (String[]) Collection.EL.toArray(this.X.d(), new IntFunction() { // from class: dklf
                    @Override // java.util.function.IntFunction
                    public final Object apply(int i) {
                        int i2 = dkli.Z;
                        return new String[i];
                    }
                }) : dkut.C(ai()), false, false);
            } catch (eeje e) {
                dkty.q("Unable to overwrite accept-contact header: %s", e.getMessage());
            }
        }
        super.T(eenkVar);
    }

    @Override // defpackage.dkha
    protected final eenh[] ak() {
        String aD;
        eenh eenhVar;
        dkjt dkjtVar;
        eehg eehgVar = new eehg();
        eehgVar.c(eehj.a);
        final eegw d = this.w ? ((dkkj) this).F.d() : ((dkkj) this).F.b();
        if (!dizq.q()) {
            d.e(new eegu("connection", "new"));
        }
        d.e(new eegu("setup", true != ((Boolean) dizq.c().a.e.a()).booleanValue() ? "active" : "actpass"));
        d.e(new eegu("accept-types", aC()));
        if (this.X.f()) {
            aD = "*";
        } else {
            aD = super.aD();
            if (djac.d()) {
                aD = aD.concat(" multipart/related application/conference-info+xml");
            }
        }
        d.e(new eegu("accept-wrapped-types", aD));
        d.e((this.X.f() ? eegx.SEND_ONLY : eegx.SEND_RECEIVE).g);
        if (dizq.n()) {
            d.e(new eegu("msrp-cema", null));
        }
        ((!this.X.f() || (dkjtVar = this.N) == null) ? Optional.empty() : Optional.ofNullable(dkjtVar.g).map(new Function() { // from class: dkle
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = dkli.Z;
                return new eegu("file-selector", "size:" + ((edzh) obj).j());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        })).ifPresent(new Consumer() { // from class: dklh
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                eegw.this.e((eegu) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        eehgVar.a(d);
        eenh eenhVar2 = new eenh(eehgVar.f(), "application/sdp");
        if (!this.Y) {
            if (aE().size() > 0) {
                dkym dkymVar = new dkym();
                dkyl dkylVar = new dkyl();
                dkymVar.b().add(dkylVar);
                for (int i = 0; i < aE().size(); i++) {
                    dkyj dkyjVar = new dkyj((String) aE().get(i));
                    dkyjVar.f = dkyg.TO;
                    dkylVar.b.add(dkyjVar);
                }
                try {
                    return new eenh[]{eenhVar2, new eenh(dkym.e(dkymVar))};
                } catch (IOException e) {
                    dkty.i(e, "Error while generating SIP body part: %s", e.getMessage());
                    return new eenh[]{eenhVar2};
                }
            }
            dkjt dkjtVar2 = this.N;
            if (dkjtVar2 == null) {
                dkty.g("Not capable of CPM or SIMPLE IM", new Object[0]);
                return new eenh[]{eenhVar2};
            }
            if (!ai()) {
                try {
                    edzh edzhVar = dkjtVar2.g;
                    if (edzhVar == null) {
                        throw new dkhn("MessageContent is null");
                    }
                    byte[] b = eoej.b(edzhVar.d());
                    if ("message/cpim".equals(dkjtVar2.h)) {
                        eenhVar = new eenh(b, "message/cpim");
                    } else {
                        edzi edziVar = new edzi(dkjtVar2.h, "utf-8");
                        edziVar.o("imdn", "urn:ietf:params:imdn");
                        edziVar.l("sip:anonymous@anonymous.invalid");
                        edziVar.p("sip:anonymous@anonymous.invalid");
                        edziVar.m("DateTime", dktc.a().toString());
                        edziVar.n("urn:ietf:params:imdn", "Disposition-Notification", D);
                        edziVar.n("urn:ietf:params:imdn", "Message-ID", dkjtVar2.k);
                        edziVar.j(b);
                        eenhVar = new eenh(edziVar.toString(), "message/cpim");
                    }
                    eenhVar.e = dkjtVar2.b();
                    return new eenh[]{eenhVar2, eenhVar};
                } catch (IOException e2) {
                    throw new dkhn("Failed to get messageContent InputStream", e2);
                }
            }
            try {
                dkty.w(10, 3, "Queueing init INVITE to MSRP pipe %s with messageid=%s", dkjtVar2, dkjtVar2.k);
                this.K.addFirst(dkjtVar2);
            } catch (dkjy e3) {
                dkty.i(e3, "Can't queue the initial message to msrp pipe", new Object[0]);
            }
        }
        return new eenh[]{eenhVar2};
    }

    @Override // defpackage.dkha
    public final String[] al() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (ai()) {
            arrayList3.add(true != this.X.f() ? "urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session" : "urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.largemsg");
        } else {
            arrayList.add("+g.oma.sip-im");
        }
        if (((dkkj) this).E) {
            arrayList2.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
            if (this.Q) {
                arrayList2.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush");
            }
        } else if (((dkkj) this).J && dizu.d()) {
            arrayList.add(dkhz.c());
            arrayList2.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot");
        } else {
            dkjt dkjtVar = this.N;
            if (dkjtVar != null && "application/vnd.gsma.rcs-ft-http+xml".equals(dkjtVar.h)) {
                arrayList.add("require");
                arrayList.add("explicit");
                arrayList2.add("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
            }
        }
        if (this.V) {
            arrayList.add("+vnd.google.rcs.encrypted");
        } else if (((Boolean) djak.a().b.u.a()).booleanValue() || this.U) {
            arrayList.add("+g.gsma.rcs.msgrevoke");
        }
        return dkut.D(arrayList, arrayList2, arrayList3);
    }

    @Override // defpackage.dkgd
    protected final void b() {
        dkli dkliVar;
        dkty.o("Running originating chat session %s", this.k);
        try {
            dkliVar = this;
            try {
                eegk a = ((dkkj) this).F.a(this.ad, this.ae, this.ac, this.ab, this.l.a, dkliVar);
                dkliVar.aa = a;
                a.a();
                int millis = (int) TimeUnit.SECONDS.toMillis(av().mTimerIdleSecs);
                bd();
                while (true) {
                    int i = millis;
                    while (dkliVar.a == dkho.RUNNING) {
                        try {
                            dkjt ax = ax(i);
                            if (dkliVar.a != dkho.RUNNING) {
                                dkty.k("Chat session thread no longer in running state. Exiting session %s", dkliVar.k);
                                return;
                            }
                            if (ax == null) {
                                if (!((dkkj) dkliVar).E) {
                                    long currentTimeMillis = System.currentTimeMillis() - dkliVar.M;
                                    if (currentTimeMillis >= i) {
                                        dkty.q("Session inactivity timeout. No message sent/received for %d ms", Long.valueOf(currentTimeMillis));
                                        dkty.q("Stop chat session %s", dkliVar.k);
                                        l();
                                        return;
                                    }
                                    i = (int) (millis - currentTimeMillis);
                                }
                                dkty.o("No message within timeout. Polling again for session %s", dkliVar.k);
                            } else {
                                try {
                                    eegc bj = bj(ax);
                                    dkty.w(12, 3, "Generated MSRP message for session %s with messageid=%s", dkliVar.k, ax.k);
                                    if (bj == null) {
                                        throw new eefw("Can't generate msrp message: outgoing message is null");
                                    }
                                    aZ(ax, bj);
                                    dkty.w(15, 2, "Sending MSRP message with messageid=%s", ax.k);
                                    dkliVar.aa.b(bj);
                                    bd();
                                } catch (eefw e) {
                                    dkty.i(e, "Error while sending message %s, terminating session: %s", ax.k, e.getMessage());
                                    String message = e.getMessage();
                                    message.getClass();
                                    L(new dkjy(6, message, e));
                                    return;
                                }
                            }
                        } catch (InterruptedException unused) {
                            dkty.q("Chat session thread interrupted. Exiting session %s", dkliVar.k);
                            return;
                        }
                    }
                    dkty.c("Ended originating chat session run %s. State %s", dkliVar.k, dkliVar.a.toString());
                    return;
                }
            } catch (eefw e2) {
                e = e2;
                dkty.i(e, "Error while setting up MSRP connection: for session %s, %s", dkliVar.k, e.getMessage());
                m(e);
            }
        } catch (eefw e3) {
            e = e3;
            dkliVar = this;
        }
    }

    public final void bn(dkrn dkrnVar, String[] strArr) {
        bm();
        ba(strArr);
        String b = ai() ? eeja.b() : dkrnVar.d;
        String str = ai() ? dkrnVar.d : null;
        if (Objects.isNull(b)) {
            dkty.q("contributionId is empty.", new Object[0]);
        } else {
            this.y = b;
        }
        if (ai()) {
            this.z = str;
        }
        dkrnVar.f.ifPresent(new Consumer() { // from class: dklg
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                String str2 = (String) obj;
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                dkli.this.q = str2;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
