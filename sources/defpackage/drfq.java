package defpackage;

import com.google.android.apps.messaging.R;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class drfq extends ffkh implements ffjm {
    public drfq(Object obj) {
        super(2, obj, drgb.class, "onSearchFailed", "onSearchFailed(Ljava/lang/CharSequence;Ljava/io/IOException;)V", 0);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((CharSequence) obj).getClass();
        ((IOException) obj2).getClass();
        drgb drgbVar = (drgb) this.g;
        int i = drgb.ay;
        drgb.bi(drgbVar, Integer.valueOf(R.drawable.quantum_gm_ic_sentiment_dissatisfied_vd_theme_24), null, drgbVar.ap.compareAndSet(false, true) ? Integer.valueOf(R.string.search_rendering_unable_to_search) : null, null, null, 26);
        if (((drfe) drgbVar.bA()).g()) {
            drgbVar.ba();
        }
        return ffcu.a;
    }
}
