package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckrt implements ckru {
    static final cfup a = cfvl.f(cfvl.b, "rcs_group_name_change_server_response_client_timeout_ms", 17000);

    @Override // defpackage.ckru
    public final Duration a() {
        return Duration.ofMillis(((Long) a.e()).longValue());
    }
}
