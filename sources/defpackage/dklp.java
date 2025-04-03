package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dklp extends dkkj {
    public static final /* synthetic */ int ag = 0;
    private boolean Y;
    String Z;
    String aa;
    String ab;
    int ac;
    String ad;
    eegk ae;
    public final Queue af;

    public dklp(Context context, dkgm dkgmVar, ffbr ffbrVar, eenk eenkVar, eeft eeftVar, dkrp dkrpVar, diod diodVar, dkur dkurVar, InstantMessageConfiguration instantMessageConfiguration, dikx dikxVar) {
        super(context, dkgmVar, ffbrVar, eenkVar, eeftVar, dkrpVar, diodVar, dkurVar, instantMessageConfiguration, dikxVar);
        String b;
        this.af = new ArrayDeque();
        dkty.c("Creating new chat session as terminating", new Object[0]);
        eenh c = eenkVar.c("application/resource-lists+xml");
        if (c != null) {
            try {
                dkyl dkylVar = (dkyl) dkym.a(new InputStreamReader(new ByteArrayInputStream(c.a), "utf-8")).b().get(0);
                if (dkylVar != null && dkylVar.b.size() > 0) {
                    List list = dkylVar.b;
                    String[] strArr = new String[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        strArr[i] = ((dkyj) list.get(i)).d;
                    }
                    ba(strArr);
                }
                String j = eenkVar.j("Referred-By");
                if (j == null) {
                    dkty.h(dkkj.B, "Invite missing REFERRED_BY header", new Object[0]);
                } else {
                    ((dkkj) this).H = this.L.a(dkut.l(j, u(), this.m));
                }
            } catch (IOException e) {
                dkty.i(e, "Error while reading resource lists: %s", e.getMessage());
            }
        }
        eenh c2 = eenkVar.c("application/sdp");
        if (c2 == null || (b = c2.b()) == null) {
            throw new eejg("Can't create a session for an INVITE with no SDP");
        }
        this.w = b.contains("TCP/TLS/MSRP");
    }

    @Override // defpackage.dkha
    protected String A() {
        return "TerminatingChatSession";
    }

    @Override // defpackage.dkkj
    public final Optional aB() {
        String str = this.W;
        return (str == null || !str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot") || ((dkkj) this).J) ? Optional.empty() : Optional.of(dkkh.INVALID_CHAT_BOT);
    }

    @Override // defpackage.dkkj
    protected final String aD() {
        if (this.X.f()) {
            return "*";
        }
        String aD = super.aD();
        return (djac.d() && bf()) ? aD.concat(" multipart/related application/conference-info+xml") : aD;
    }

    @Override // defpackage.dkha
    protected eenh[] ak() {
        String b;
        String str;
        eenh g = this.l.g();
        if (g == null || (b = g.b()) == null) {
            throw new dkhn("Can't prepare a session without a sip dialog path");
        }
        try {
            eehg b2 = eehd.b(b);
            eegw eegwVar = (eegw) b2.c.get(0);
            eegu a = eegwVar.a("path");
            eegu a2 = eegwVar.a("fingerprint");
            if (a2 != null) {
                this.aa = a2.b;
            }
            if (a == null || (str = a.b) == null) {
                throw new dkhn("Can't prepare a prepare a session for an SDP without a PATH");
            }
            this.Z = str;
            this.ab = b2.d() ? b2.h.a : eegwVar.c.a;
            eegu a3 = eegwVar.a("msrp-cema");
            if (dizq.n()) {
                if (a3 != null) {
                    this.Y = true;
                } else {
                    try {
                        if (!this.ab.equals(eegw.d(this.Z))) {
                            aT(dkkh.INVALID_PARAMETERS);
                            throw new dkhn("Incoming SDP does not specify CEMA but path does not match C/M lines");
                        }
                    } catch (Exception e) {
                        throw new dkhn("MSRP Path is not a valid MSRP URI", e);
                    }
                }
            }
            this.ac = eegwVar.a;
            String g2 = eegb.g(eegwVar);
            this.ad = g2;
            dkty.c("Local setup attribute is %s", g2);
            if (!"active".equals(this.ad)) {
                this.ae = ay(this.Z, this);
            }
            boolean equals = "active".equals(this.ad);
            eehg eehgVar = new eehg();
            eehgVar.c(eehj.a);
            eenh eenhVar = null;
            try {
                eegw az = az(equals);
                az.e(new eegu("accept-types", aC()));
                az.e(new eegu("accept-wrapped-types", aD()));
                if (!dizq.q()) {
                    az.e(new eegu("connection", "new"));
                }
                az.e(new eegu("setup", this.ad));
                az.e((this.X.f() ? eegx.RECEIVE_ONLY : eegx.SEND_RECEIVE).g);
                if (this.Y) {
                    az.e(new eegu("msrp-cema", null));
                }
                eehgVar.a(az);
                eenhVar = new eenh(eehgVar.f(), "application/sdp");
            } catch (IllegalStateException unused) {
            }
            if (Objects.isNull(eenhVar)) {
                throw new dkhn("SIP body parts cannot be build");
            }
            return new eenh[]{eenhVar};
        } catch (eehb e2) {
            throw new dkhn(e2);
        }
    }

    @Override // defpackage.dkha
    public String[] al() {
        Optional empty;
        int i = engw.d;
        final engr engrVar = new engr();
        engr engrVar2 = new engr();
        engr engrVar3 = new engr();
        if (ai()) {
            engrVar3.h("urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session");
        } else {
            engrVar.h("+g.oma.sip-im");
        }
        if (((dkkj) this).J) {
            engrVar2.h("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot");
            try {
                empty = Collection.EL.stream(((djkv) ((djky) this.T).b()).h).filter(new Predicate() { // from class: dkln
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
                        int i2 = dklp.ag;
                        return ((String) obj).startsWith("+g.gsma.rcs.botversion");
                    }
                }).findFirst();
            } catch (IllegalStateException unused) {
                dkty.c("RegistrationContext is not available.", new Object[0]);
                empty = Optional.empty();
            }
            empty.ifPresent(new Consumer() { // from class: dklo
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    engr.this.h((String) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (((dkkj) this).E) {
            engrVar2.h("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp");
            if (this.Q) {
                engrVar2.h("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush");
            }
        }
        return dkut.D(engrVar.g(), engrVar2.g(), engrVar3.g());
    }

    @Override // defpackage.dkgd
    protected final void b() {
        dklp dklpVar;
        dkty.o("Running terminating chat session %s", this.k);
        try {
            if (this.ad.equals("passive")) {
                dklpVar = this;
            } else {
                dklpVar = this;
                try {
                    dklpVar.ae = ((dkkj) this).F.a(this.ab, this.ac, this.aa, this.Z, this.l.a, dklpVar);
                } catch (eefw e) {
                    e = e;
                    m(e);
                    dkty.i(e, "Error while setting up MSRP connection: for session %s, %s", dklpVar.k, e.getMessage());
                    return;
                }
            }
            dklpVar.ae.a();
            bd();
            int millis = (int) TimeUnit.SECONDS.toMillis(av().mTimerIdleSecs);
            while (true) {
                int i = millis;
                while (dklpVar.a == dkho.RUNNING) {
                    try {
                        dkjt ax = ax(i);
                        if (dklpVar.a != dkho.RUNNING) {
                            dkty.k("Chat session thread no longer in running state. Exiting session %s", dklpVar.k);
                            return;
                        }
                        if (ax == null) {
                            if (!((dkkj) dklpVar).E) {
                                long currentTimeMillis = System.currentTimeMillis() - dklpVar.M;
                                if (currentTimeMillis >= i) {
                                    dkty.q("Session inactivity timeout. No message sent/received for %s ms", Long.valueOf(currentTimeMillis));
                                    dkty.q("Stop chat session %s", dklpVar.k);
                                    l();
                                    return;
                                }
                                i = (int) (millis - currentTimeMillis);
                            }
                            dkty.o("No message within timeout. Polling again for session %s", dklpVar.k);
                        } else {
                            try {
                                dkty.o("Generating msrp message for session %s", dklpVar.k);
                                eegc bj = bj(ax);
                                if (bj == null) {
                                    throw new eefw("Can't generate msrp message: outgoing message is null");
                                }
                                aZ(ax, bj);
                                dkty.o("Sending msrp message %s", ax);
                                dklpVar.ae.b(bj);
                                bd();
                            } catch (eefw e2) {
                                dkty.i(e2, "Error while sending message %s, terminating session: %s", ax.k, e2.getMessage());
                                L(new dkjy(6, e2.getMessage(), e2));
                                return;
                            }
                        }
                    } catch (InterruptedException unused) {
                        dkty.q("Chat session thread interrupted. Exiting session %s", dklpVar.k);
                        return;
                    }
                }
                dkty.c("Ended terminating chat session run %s. State %s", dklpVar.k, dklpVar.a.toString());
                return;
            }
        } catch (eefw e3) {
            e = e3;
            dklpVar = this;
        }
    }
}
