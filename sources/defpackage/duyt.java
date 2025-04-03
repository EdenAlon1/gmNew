package defpackage;

import com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceClient;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duyt extends ICrossProcessPreferenceClient.Stub {
    private final WeakReference a;

    public duyt(duyw duywVar) {
        this.a = new WeakReference(duywVar);
    }

    @Override // com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceClient
    public final void onPreferenceChange(byte[] bArr) {
        enip o;
        duyw duywVar = (duyw) this.a.get();
        if (duywVar == null) {
            return;
        }
        try {
            duzc duzcVar = (duzc) eyfy.parseFrom(duzc.a, bArr, eyfc.a());
            synchronized (duywVar) {
                if (duzb.a(duzcVar.c) == 7) {
                    duywVar.c.remove(duzcVar.e);
                } else {
                    duywVar.c.put(duzcVar.e, duzk.f(duzcVar));
                }
                o = enip.o(duywVar.d);
            }
            duywVar.d(o, new enpx(duzcVar.e));
        } catch (Exception e) {
            ((enrr) ((enrr) ((enrr) duyw.a.j()).g(e)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences$CrossProcessPreferencesClient", "onPreferenceChange", 532, "CrossProcessSharedPreferences.java")).t("Failed to decode %s to PreferenceElem", bArr);
        }
    }

    @Override // com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceClient
    public final void onServerDestroy() {
        duyw duywVar = (duyw) this.a.get();
        if (duywVar == null) {
            return;
        }
        duywVar.b();
    }
}
