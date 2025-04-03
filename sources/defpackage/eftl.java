package defpackage;

import android.os.Looper;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eftl implements erqj {
    final /* synthetic */ eftm a;

    public eftl(eftm eftmVar) {
        this.a = eftmVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        final List list = (List) obj;
        eg G = this.a.G();
        if (G != null) {
            G.runOnUiThread(new Runnable() { // from class: eftk
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    emxf.m(Looper.getMainLooper().equals(Looper.myLooper()), "Should be called on the UI thread!");
                    List list2 = list;
                    final eftm eftmVar = eftl.this.a;
                    efth efthVar = eftmVar.d;
                    efthVar.a = engw.n(list2);
                    efthVar.p();
                    eftmVar.b.setDisplayedChild(1);
                    if (eftmVar.ag) {
                        return;
                    }
                    String string = eftmVar.m.getString("com.google.android.libraries.tachyon.countrycode.arg.COUNTRY_CODE_SELECTED");
                    for (final int i = 0; i < eftmVar.d.a(); i++) {
                        if (TextUtils.equals(((efto) eftmVar.d.a.get(i)).c, string)) {
                            eftmVar.c.post(new Runnable() { // from class: eftj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    eftm eftmVar2 = eftm.this;
                                    eftmVar2.e.ac(i, eftmVar2.B().getDimensionPixelSize(R.dimen.list_scroll_offset));
                                }
                            });
                            return;
                        }
                    }
                }
            });
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        ((ensz) ((ensz) ((ensz) eftm.a.j()).g(th)).h("com/google/android/libraries/tachyon/countrycode/CountryCodeFragment$1", "onFailure", 'f', "CountryCodeFragment.java")).q("Failed to load list of countries.");
    }
}
