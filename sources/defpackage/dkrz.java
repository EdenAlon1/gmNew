package defpackage;

import android.app.Application;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkrz {
    public static final deva a;
    public static final deva b;
    public static final deva c;
    public static final deva d;
    public static final deva e;
    public static final deva f;
    public static final deva g;
    public static final deva h;
    public static final deva i;
    private static final emyl j;

    static {
        emyl a2 = emys.a(new emyl() { // from class: dkry
            @Override // defpackage.emyl
            public final Object get() {
                return dkrz.a();
            }
        });
        j = a2;
        a = new deuw((devc) a2.get(), "last_stored_signatures_white_list", "");
        b = new deuw((devc) a2.get(), "last_stored_signatures_test_service_white_list", "");
        c = new deuw((devc) a2.get(), "last_stored_packages_white_list", "");
        d = new deuw((devc) a2.get(), "last_stored_packages_test_service_white_list", "");
        e = new deuw((devc) a2.get(), "provisionId", null);
        f = new deuy((devc) a2.get(), "operation_mode", 0);
        g = new deux((devc) a2.get(), "migration_complete", false);
        h = new deuy((devc) a2.get(), "encryption_key", 0);
        i = new deuw((devc) a2.get(), "tachyon_anonymous_device_id", null);
    }

    static /* synthetic */ devc a() {
        try {
            return new devc("carrier_services");
        } catch (NullPointerException e2) {
            try {
                Context applicationContext = ((Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext();
                applicationContext.getClass();
                devc.a = applicationContext;
                return new devc("carrier_services");
            } catch (ReflectiveOperationException | RuntimeException unused) {
                throw e2;
            }
        }
    }
}
