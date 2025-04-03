package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dttm {
    private static final enru b = enru.c("com/google/android/libraries/databaseannotations/support/D26rDatabaseInterfaceOverrider");
    public final ConcurrentMap a = new ConcurrentHashMap();
    private final ffbr c;

    public dttm(ffbr ffbrVar) {
        this.c = ffbrVar;
    }

    public final void a() {
        dtve dtveVar = (dtve) this.a.remove("backup");
        if (dtveVar != null) {
            dtveVar.w();
        }
    }

    public final void b() {
        this.a.remove("backup");
    }

    public final synchronized void c(String str) {
        if (dtub.x()) {
            dtve dtveVar = (dtve) this.a.get("backup");
            if (dtveVar != null) {
                if (!((dtqy) dtveVar.l()).a.equals(str)) {
                    throw new IllegalStateException("Attempting to set new override for db handle [backup], which is already set");
                }
                if (((dtqy) dtveVar.l()).a.equals(str)) {
                    ((enrr) ((enrr) b.h()).h("com/google/android/libraries/databaseannotations/support/D26rDatabaseInterfaceOverrider", "setStorageFileName", 56, "D26rDatabaseInterfaceOverrider.java")).t("Override already set for db handle [%s]", "backup");
                    return;
                }
            }
            dttz l = dtub.e("backup").l();
            int i = ((dtqy) l).c;
            dttx i2 = dttz.i();
            i2.b(i);
            ((dtqx) i2).a = ((dtqy) l).b;
            i2.g(((dtqy) l).d);
            i2.f(str);
            i2.c(true);
            i2.d(((dtqy) l).f);
            i2.e(((dtqy) l).g);
            dttz a = i2.a();
            cbcj cbcjVar = (cbcj) this.c.b();
            cbcjVar.getClass();
            this.a.put("backup", cbcjVar.a(a));
        }
    }
}
