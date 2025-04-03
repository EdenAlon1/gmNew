package defpackage;

import android.app.backup.BackupManager;
import android.content.SharedPreferences;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sop implements SharedPreferences.OnSharedPreferenceChangeListener {
    public final BackupManager b;
    private final errl d;
    private final String e;
    private final dloz f;
    private static final enru c = enru.c("com/google/android/apps/messaging/backup/BugleOnSharedPreferenceChangeListenerDelegate");
    static final cfup a = cfvl.q(160945957);

    public sop(String str, dloz dlozVar, BackupManager backupManager, errl errlVar) {
        this.d = errlVar;
        dlozVar.getClass();
        this.e = str;
        this.f = dlozVar;
        this.b = backupManager;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        boolean b = this.f.b(str);
        ensk g = c.g();
        g.Y(ente.a, "BugleBackup");
        ((enrr) ((enrr) g).h("com/google/android/apps/messaging/backup/BugleOnSharedPreferenceChangeListenerDelegate", "onSharedPreferenceChanged", 75, "BugleOnSharedPreferenceChangeListenerDelegate.java")).J("Preference \"%s\" in \"%s\" was modified. %s", str, this.e, true != b ? "Ignoring (key not backed up)." : "Scheduling a backup.");
        if (b) {
            if (((Boolean) a.e()).booleanValue()) {
                axnw.h(elfo.f(new Runnable() { // from class: soo
                    @Override // java.lang.Runnable
                    public final void run() {
                        sop.this.b.dataChanged();
                    }
                }, this.d));
            } else {
                this.b.dataChanged();
            }
        }
    }
}
