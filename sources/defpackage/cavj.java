package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.car.app.hardware.info.EnergyProfile;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cavj implements cavm {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin");
    public final ffbr b;
    public final ReentrantReadWriteLock c;
    public final ThreadLocal d;
    private final alba e;
    private final atks f;
    private final AtomicInteger g;

    public cavj(ffbr ffbrVar, alba albaVar, atks atksVar) {
        ffbrVar.getClass();
        albaVar.getClass();
        this.b = ffbrVar;
        this.e = albaVar;
        this.f = atksVar;
        this.c = new ReentrantReadWriteLock(true);
        this.d = new ThreadLocal() { // from class: cavi
            @Override // java.lang.ThreadLocal
            protected final /* synthetic */ Object initialValue() {
                return false;
            }
        };
        this.g = new AtomicInteger(0);
    }

    @Override // defpackage.cavm
    public final /* synthetic */ int e(Exception exc, int i, dtwd dtwdVar) {
        return 1;
    }

    public final long f(ffix ffixVar) {
        albb a2 = this.e.a();
        ffixVar.invoke();
        return a2.a();
    }

    public final void g(final ffix ffixVar) {
        long f = f(new ffix() { // from class: cavd
            @Override // defpackage.ffix
            public final Object invoke() {
                cavj.this.c.writeLock().lock();
                return ffcu.a;
            }
        });
        try {
            enru enruVar = a;
            ensk h = enruVar.h();
            h.Y(ente.a, "BugleDatabase");
            ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "withMaintenanceWriteLock", 181, "DatabaseMaintenancePlugin.kt")).s("Took %dms acquire the lock for maintenance", f);
            long f2 = f(new ffix() { // from class: cave
                @Override // defpackage.ffix
                public final Object invoke() {
                    ffix.this.invoke();
                    return ffcu.a;
                }
            });
            ensk h2 = enruVar.h();
            h2.Y(ente.a, "BugleDatabase");
            ((enrr) h2.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "withMaintenanceWriteLock", 183, "DatabaseMaintenancePlugin.kt")).s("Completed maintenance operations after %dms", f2);
        } finally {
            this.c.writeLock().unlock();
        }
    }

    @Override // defpackage.cavm
    public final Closeable l(dtwd dtwdVar) {
        dtrg dtrgVar = (dtrg) dtwdVar;
        int ordinal = dtrgVar.b.ordinal();
        if (ordinal == 6) {
            this.d.set(true);
            return null;
        }
        if (ordinal == 8 || ordinal == 15) {
            this.d.set(false);
            return null;
        }
        if (((Boolean) this.d.get()).booleanValue()) {
            return null;
        }
        if (!this.c.readLock().tryLock()) {
            int incrementAndGet = this.g.incrementAndGet();
            enru enruVar = a;
            ensk j = enruVar.j();
            j.Y(ente.a, "BugleDatabase");
            ((enrr) j.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "openBlockableOperation", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "DatabaseMaintenancePlugin.kt")).B("Blocking new DB operation %s for maintenance. Queue number %d", dtrgVar.a, incrementAndGet);
            long f = f(new ffix() { // from class: cavg
                @Override // defpackage.ffix
                public final Object invoke() {
                    cavj.this.c.readLock().lock();
                    return ffcu.a;
                }
            });
            ensk h = enruVar.h();
            h.Y(ente.a, "BugleDatabase");
            ((enrr) h.h("com/google/android/apps/messaging/shared/datamodel/layer/DatabaseMaintenancePlugin", "openBlockableOperation", 109, "DatabaseMaintenancePlugin.kt")).y("Maintenance operation blocked DB operation %s for %d ms.", f, incrementAndGet);
            this.g.decrementAndGet();
        }
        return new Closeable() { // from class: cavh
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                cavj.this.c.readLock().unlock();
            }
        };
    }

    @Override // defpackage.cavm
    public final boolean n() {
        return ((ersq) ((atkd) this.f).a.b()).a("bugle.enable_database_maintenance_plugin");
    }

    @Override // defpackage.cavm
    public final /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // defpackage.cavm
    public final /* synthetic */ Cursor a(Cursor cursor, dtwd dtwdVar) {
        return cursor;
    }
}
