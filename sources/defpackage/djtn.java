package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djtn {
    private final ctvb a;
    private final djrk b;

    public djtn(ctvb ctvbVar, djrk djrkVar, diwt diwtVar, dlpw dlpwVar) {
        ctvbVar.getClass();
        djrkVar.getClass();
        diwtVar.getClass();
        dlpwVar.getClass();
        this.a = ctvbVar;
        this.b = djrkVar;
    }

    public final Optional a(djtp djtpVar) {
        djtpVar.getClass();
        if (djtpVar.c() == 0) {
            ((ensz) djto.a.h()).q("Could not retrieve MSISDN from configuration. Configuration is empty.");
            return Optional.empty();
        }
        djtr m = djtpVar.m();
        if (m == null) {
            ((ensz) djto.a.h()).q("Could not retrieve MSISDN from configuration. ImsConfiguration is null.");
            return Optional.empty();
        }
        String w = m.w();
        if (w.length() == 0) {
            ((ensz) djto.a.h()).q("Could not retrieve MSISDN from configuration. Public identity is null/empty.");
            return Optional.empty();
        }
        String k = dkut.k(w, this.a);
        if (k == null) {
            return Optional.empty();
        }
        if (k.length() <= 0 || this.a.I(k)) {
            return Optional.ofNullable(this.b.a(k));
        }
        ((ensz) djto.a.j()).t("Phone number is not in canonical format. Phone number: %s", dktx.PHONE_NUMBER.c(k));
        throw new IllegalArgumentException("Phone number is not in canonical format.");
    }
}
