package defpackage;

import android.app.backup.BackupManager;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class son {
    private static final enru c = enru.c("com/google/android/apps/messaging/backup/BugleOnSharedPreferenceChangeListener");
    public final Context a;
    public final sqp b;
    private final errl d;
    private final cpn e = new cpn();

    public son(Context context, errl errlVar, sqp sqpVar) {
        this.a = context;
        this.d = errlVar;
        this.b = sqpVar;
    }

    public final void a(String str, dloz dlozVar) {
        synchronized (sop.class) {
            if (this.e.containsKey(str)) {
                ensk j = c.j();
                j.Y(ente.a, "BugleBackup");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/backup/BugleOnSharedPreferenceChangeListener", "registerListener", 54, "BugleOnSharedPreferenceChangeListener.java")).t("Preference change listener for \"%s\" has already been registered.", str);
            } else {
                sop sopVar = new sop(str, dlozVar, new BackupManager(this.a), this.d);
                this.e.put(str, sopVar);
                ensk h = c.h();
                h.Y(ente.a, "BugleBackup");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/backup/BugleOnSharedPreferenceChangeListener", "registerListener", 68, "BugleOnSharedPreferenceChangeListener.java")).t("Registering preference change listener for \"%s\".", str);
                this.a.getSharedPreferences(str, 0).registerOnSharedPreferenceChangeListener(sopVar);
            }
        }
    }
}
