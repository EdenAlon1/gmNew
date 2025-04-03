package defpackage;

import android.util.Log;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eesk implements erqj {
    final /* synthetic */ eesm a;

    public eesk(eesm eesmVar) {
        this.a = eesmVar;
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        eesi eesiVar = this.a.a;
        eesiVar.e.clear();
        for (ewnp ewnpVar : (List) obj) {
            int a = ewno.a(ewnpVar.c);
            if (a == 0) {
                a = 1;
            }
            if (a - 2 != 1) {
                throw new IllegalStateException("Loaded pack type should be Regular.");
            }
            eesiVar.e.add(ewnpVar);
        }
        if (eesiVar.d) {
            eesiVar.e.add(eesi.a);
        }
        eesiVar.p();
        this.a.a();
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        Log.e("BrowseStickerPacksView", "Error fetching sticker packs", th);
        eesm eesmVar = this.a;
        if (eesmVar.b != null) {
            Snackbar.q(eesmVar, R.string.get_sticker_packs_error_msg, -1).i();
        }
        this.a.a();
        eety eetyVar = this.a.b;
        if (eetyVar != null) {
            eetyVar.C();
        }
    }
}
