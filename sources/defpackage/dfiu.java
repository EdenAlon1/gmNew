package defpackage;

import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfiu {
    public static final Feature a;
    public static final Feature b;
    public static final Feature c;
    public static final Feature d;
    public static final Feature e;
    public static final Feature f;
    public static final Feature g;
    public static final Feature h;
    public static final Feature i;
    public static final Feature[] j;

    static {
        Feature feature = new Feature("key_retrieval", 2L);
        a = feature;
        Feature feature2 = new Feature("list_recovered_security_domains", 1L);
        b = feature2;
        Feature feature3 = new Feature("start_recovery", 3L);
        c = feature3;
        Feature feature4 = new Feature("recoverability_fix", 2L);
        d = feature4;
        Feature feature5 = new Feature("lskf_consent", 1L);
        e = feature5;
        Feature feature6 = new Feature("reset_security_domain", 2L);
        f = feature6;
        Feature feature7 = new Feature("generate_open_vault_request", 1L);
        g = feature7;
        Feature feature8 = new Feature("silently_add_gaia_password_member", 1L);
        h = feature8;
        Feature feature9 = new Feature("get_domain_state", 1L);
        i = feature9;
        j = new Feature[]{feature, feature2, feature3, feature4, feature5, feature6, feature7, feature8, feature9};
    }
}
