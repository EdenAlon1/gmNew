package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diyq {
    public final diza a;
    public final diza b;
    public final diza c;
    public final diza d;
    public final diza e;
    public final diza f;
    public final diza g;
    public final diza h;
    public final diza i;
    public final diza j;
    public final diza k;
    public final diza l;

    public diyq(diyr diyrVar) {
        this.a = diyrVar.i("verifier_info_enabled", false);
        this.b = diyrVar.i("verified_sms_token_enabled", true);
        this.c = diyrVar.h("bot_info_request_version", "1.5");
        this.d = diyrVar.h("debug_business_info_domain", "");
        this.e = diyrVar.h("nonstandard_rbm_phone_numbers_regex", "^(tel:)?\\+[0-9]{7,15}$");
        this.f = diyrVar.g("client_timeout_sec", 120L);
        this.g = diyrVar.g("client_ringing_period_sec", 30L);
        this.h = diyrVar.g("immediate_retry_backoff_sec", 2L);
        this.i = diyrVar.g("immediate_retry_backoff_rate_sec", 2L);
        this.j = diyrVar.g("max_immediate_retries", 5L);
        this.k = diyrVar.g("server_retry_backoff_sec", 300L);
        this.l = diyrVar.g("server_retry_backoff_rate", 3L);
    }
}
