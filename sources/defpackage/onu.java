package defpackage;

import androidx.preference.PreferenceGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class onu implements Runnable {
    final /* synthetic */ PreferenceGroup a;

    public onu(PreferenceGroup preferenceGroup) {
        this.a = preferenceGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            this.a.a.clear();
        }
    }
}
