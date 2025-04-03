package defpackage;

import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class elhj implements oni {
    public final /* synthetic */ elhk a;
    public final /* synthetic */ String b;
    public final /* synthetic */ oni c;

    public /* synthetic */ elhj(elhk elhkVar, String str, oni oniVar) {
        this.a = elhkVar;
        this.b = str;
        this.c = oniVar;
    }

    @Override // defpackage.oni
    public final boolean a(Preference preference) {
        ekww ekwwVar = this.a.a;
        oni oniVar = this.c;
        elav a = ekwwVar.a("OnPreferenceClickListener", this.b);
        try {
            boolean a2 = oniVar.a(preference);
            a.close();
            return a2;
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
