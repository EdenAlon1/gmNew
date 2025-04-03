package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chgl {
    public static final cfup a = cfvl.h(cfvl.b, "cms_environment", "prod");

    public chgl(axkm axkmVar) {
        axkmVar.getClass();
    }

    public static final String a() {
        if (!csjc.e() && !csjc.f()) {
            return "jibemessagestore.googleapis.com";
        }
        Optional.empty();
        Object e = a.e();
        e.getClass();
        String str = (String) e;
        return str.equals("autopush") ? "autopush-jibemessagestore.sandbox.googleapis.com" : str.equals("staging") ? "staging-jibemessagestore.sandbox.googleapis.com" : "jibemessagestore.googleapis.com";
    }
}
