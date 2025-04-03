package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dklm extends dklp {
    public final boolean Y;

    public dklm(Context context, dkkq dkkqVar, ffbr ffbrVar, eenk eenkVar, eeft eeftVar, dkrp dkrpVar, diod diodVar, dkur dkurVar, InstantMessageConfiguration instantMessageConfiguration, dkjx dkjxVar, dikx dikxVar) {
        super(context, dkkqVar, ffbrVar, eenkVar, eeftVar, dkrpVar, diodVar, dkurVar, instantMessageConfiguration, dikxVar);
        String j = eenkVar.j("Referred-By");
        if (j != null) {
            ae(j, ((eehz) ffbrVar).a);
        }
        eeit b = dkut.b(eenkVar, this.m);
        b.getClass();
        String eeitVar = b.toString();
        boolean z = false;
        if (!TextUtils.isEmpty(eeitVar)) {
            String k = dkut.k(eeitVar, this.m);
            if (!TextUtils.isEmpty(k)) {
                dkty.c("Remote Uri: %s, user ID: %s", dkty.a(eeitVar), dkty.a(k));
                z = k.equalsIgnoreCase("rcse-standfw");
            }
        }
        this.Y = z;
        eenh c = eenkVar.c("application/sdp");
        if (Objects.isNull(c)) {
            throw new eejg("Invalid request: SDP missing");
        }
        String b2 = c.b();
        if (Objects.isNull(b2)) {
            throw new eejg("Invalid request: SDP missing");
        }
        this.w = b2.contains("TCP/TLS/MSRP");
    }

    @Override // defpackage.dklp, defpackage.dkha
    protected final String A() {
        return "StoreAndForwardSession";
    }

    @Override // defpackage.dklp, defpackage.dkha
    protected final eenh[] ak() {
        eegx eegxVar;
        eenh g = this.l.g();
        if (Objects.isNull(g)) {
            throw new dkhn("Remote SDP missing");
        }
        String b = g.b();
        if (Objects.isNull(b)) {
            throw new dkhn("Remote SDP missing");
        }
        try {
            eehg b2 = eehd.b(b);
            eegw eegwVar = (eegw) b2.c.get(0);
            eegu a = eegwVar.a("fingerprint");
            if (a != null) {
                this.aa = a.b;
            }
            eegu a2 = eegwVar.a("path");
            if (Objects.isNull(a2)) {
                throw new dkhn("Remote SDP missing path attribute");
            }
            String str = a2.b;
            if (Objects.isNull(str)) {
                throw new dkhn("Remote SDP missing path attribute");
            }
            this.Z = str;
            this.ab = b2.d() ? b2.h.a : eegwVar.c.a;
            this.ac = eegwVar.a;
            this.ad = eegb.g(eegwVar);
            List list = eegwVar.e;
            eegx eegxVar2 = eegx.UNKNOWN;
            eegx eegxVar3 = null;
            if (list.size() > 0) {
                int i = 0;
                while (true) {
                    if (i >= list.size()) {
                        break;
                    }
                    String str2 = ((eegu) list.get(i)).a;
                    if (!TextUtils.isEmpty(str2)) {
                        eegx[] values = eegx.values();
                        for (int i2 = 0; i2 < values.length; i2++) {
                            if (values[i2].f.equals(str2)) {
                                eegxVar = values[i2];
                                break;
                            }
                        }
                    }
                    eegxVar = null;
                    if (eegxVar != null) {
                        eegxVar3 = eegxVar;
                        break;
                    }
                    i++;
                }
            }
            if (Objects.isNull(eegxVar3)) {
                throw new dkhn("Remote SDP missing media direction attribute");
            }
            eegu eeguVar = eegxVar3.ordinal() != 2 ? eegx.SEND_RECEIVE.g : eegx.RECEIVE_ONLY.g;
            if (this.ad.equals("passive")) {
                this.ae = ay(this.Z, this);
            }
            try {
                boolean equals = "active".equals(this.ad);
                eehg eehgVar = new eehg();
                eehgVar.c(eehj.a);
                eegw az = az(equals);
                az.e(new eegu("accept-types", aC()));
                az.e(new eegu("accept-wrapped-types", aD()));
                az.e(new eegu("connection", "new"));
                az.e(new eegu("setup", this.ad));
                az.e(eeguVar);
                eehgVar.a(az);
                return new eenh[]{new eenh(eehgVar.f(), "application/sdp")};
            } catch (IllegalStateException e) {
                throw new dkhn("SIP body parts cannot be build", e);
            }
        } catch (eehb e2) {
            throw new dkhn(e2);
        }
    }

    @Override // defpackage.dklp, defpackage.dkha
    public final String[] al() {
        ArrayList arrayList;
        ArrayList arrayList2;
        if (ai()) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add("urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session");
            arrayList2 = arrayList3;
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.add("+g.oma.sip-im");
            arrayList2 = null;
        }
        return dkut.D(arrayList, null, arrayList2);
    }

    @Override // defpackage.dkkj
    public final boolean bg() {
        if (this.Y) {
            return false;
        }
        return super.bg();
    }
}
