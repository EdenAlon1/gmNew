package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evdv implements fdxp {
    private static final enru a = enru.c("com/google/frameworks/client/data/android/impl/CredentialStrategyInterceptor");

    @Override // defpackage.fdxp
    public final fdxo a(febs febsVar, fdxj fdxjVar, fdxk fdxkVar) {
        final evcz evczVar = (evcz) fdxjVar.h(evcy.a);
        if (evczVar != null) {
            ((enrr) ((enrr) a.e()).h("com/google/frameworks/client/data/android/impl/CredentialStrategyInterceptor", "interceptCall", 30, "CredentialStrategyInterceptor.java")).t("Using CredentialStrategy: %s", evczVar.getClass());
            return fdxr.b(fdxkVar, evez.a(new ffbr() { // from class: evdu
                @Override // defpackage.ffbr, defpackage.ffbq
                public final Object b() {
                    return engw.r(evcz.this.a());
                }
            })).a(febsVar, fdxjVar);
        }
        ((enrr) ((enrr) a.e()).h("com/google/frameworks/client/data/android/impl/CredentialStrategyInterceptor", "interceptCall", 38, "CredentialStrategyInterceptor.java")).q("Did not set CredentialStrategy");
        return fdxkVar.a(febsVar, fdxjVar);
    }
}
