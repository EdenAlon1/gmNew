package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avic {
    public static final emyl a = cfvl.w("set_media_download_error_retryable");
    public static final cfup b = cfvl.e(cfvl.b, "max_retries_for_business_info_download", 1);
    public static final cfva c;
    public static final emyl d;
    public static final emyl e;
    public static final emyl f;
    public static final cfup g;
    public static final emyl h;

    static {
        ecwh ecwhVar = cfvl.b;
        ezgv ezgvVar = (ezgv) ezgw.a.createBuilder();
        ezgvVar.b("wallet.google.com");
        ezgvVar.b("pay.google.com");
        c = cfvl.u(ecwhVar, "bugle_phenotype__rbm_wallet_url_list", (ezgw) ezgvVar.build(), new ecwg() { // from class: avib
            @Override // defpackage.ecwg
            public final Object a(byte[] bArr) {
                return (ezgw) eyfy.parseFrom(ezgw.a, bArr);
            }
        });
        d = cfvl.w("use_exponential_backoff_instead_for_business_info");
        e = cfvl.w("log_cronet_errors_for_business_info");
        f = cfvl.w("use_bot_info_dimain_from_rcs_config");
        g = cfvl.h(cfvl.b, "business_info_bot_domain_override", "");
        h = cfvl.w("support_paths_in_bot_domain");
    }
}
