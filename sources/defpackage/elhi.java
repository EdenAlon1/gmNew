package defpackage;

import androidx.preference.Preference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final /* synthetic */ class elhi implements onh {
    public final /* synthetic */ elhk a;
    public final /* synthetic */ String b;
    public final /* synthetic */ onh c;

    public /* synthetic */ elhi(elhk elhkVar, String str, onh onhVar) {
        this.a = elhkVar;
        this.b = str;
        this.c = onhVar;
    }

    @Override // defpackage.onh
    public final boolean a(Preference preference, Object obj) {
        ekww ekwwVar = this.a.a;
        onh onhVar = this.c;
        elav a = ekwwVar.a("OnPreferenceChangeListener", this.b);
        try {
            boolean a2 = onhVar.a(preference, obj);
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
