package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djar {
    public final diza a;
    public final diza b;
    public final diza c;
    public final diza d;

    public djar(djas djasVar) {
        this.a = djasVar.g("tls_socket_read_timeout_millis", 60000L);
        this.b = djasVar.h("tls_exclusively_enabled_protocols", "");
        this.c = djasVar.h("tls_explicitly_disabled_protocols", "");
        this.d = djasVar.h("tls_explicitly_disabled_ciphers", "");
    }
}
