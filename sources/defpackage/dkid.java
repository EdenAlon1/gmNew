package defpackage;

import android.text.TextUtils;
import j$.util.OptionalLong;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkid {
    private final dkib a;

    public dkid(dkib dkibVar) {
        this.a = dkibVar;
    }

    final dkht a(String str, boolean z) {
        dkht b = this.a.b();
        if (str != null) {
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.im")) {
                b.e(true);
                if (djao.u() && z) {
                    b.q(str.contains(dkmn.a()));
                } else {
                    b.q(true);
                }
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.ft")) {
                b.n(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftthumb")) {
                b.f(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush")) {
                b.k(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopullft")) {
                b.j(true);
            }
            if (str.contains("+g.gsma.rcs.ipvideocallonly")) {
                b.o(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel") || str.contains("+g.gsma.rcs.ipcall")) {
                b.m(true);
            }
            if ((str.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel") || str.contains("+g.gsma.rcs.ipcall")) && str.contains("video")) {
                b.Q();
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.joyn.intmsg")) {
                b.h(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp")) {
                b.i(true);
            }
            if (str.contains("+g.jibe.stickers")) {
                b.s(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callcomposer")) {
                b.P();
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callunanswered")) {
                b.R();
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedmap")) {
                b.S();
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedsketch")) {
                b.T();
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftsms")) {
                b.g(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gppapplication.ims.iari.rcs.geosms")) {
                b.l(true);
            }
            if (str.contains("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot")) {
                b.p(true);
                if (str.contains(dkht.d())) {
                    b.r(true);
                }
            }
        }
        return b;
    }

    final dkht b(eenj eenjVar, boolean z) {
        OptionalLong empty;
        if (eenjVar == null) {
            throw new IllegalArgumentException("SIP message must not be null");
        }
        dkht a = a(eenjVar.j("Contact"), z);
        String j = eenjVar.j("P-Last-Online");
        if (TextUtils.isEmpty(j)) {
            empty = OptionalLong.empty();
        } else {
            try {
                empty = OptionalLong.of(Long.parseLong(j) * 1000);
            } catch (Exception unused) {
                dkty.q("Unable to parse last activity timestamp: %s", j);
                empty = OptionalLong.empty();
            }
        }
        if (empty.isPresent()) {
            a.e = empty.getAsLong();
        }
        return a;
    }
}
