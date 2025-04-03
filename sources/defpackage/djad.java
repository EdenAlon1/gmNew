package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djad {
    public final diza a;
    public final diza b;
    public final diza c;
    public final diza d;

    public djad(djae djaeVar) {
        this.a = djaeVar.f("download_timeout_seconds", 60);
        this.b = djaeVar.f("upload_timeout_seconds", 180);
        this.c = djaeVar.i("enable_domain_logging", false);
        this.d = djaeVar.i("enable_reconfiguration_on_forbidden", false);
    }
}
