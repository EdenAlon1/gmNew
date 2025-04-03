package defpackage;

import android.util.Log;
import com.google.research.xeno.effect.Effect;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class deti {
    public final /* synthetic */ detn a;
    public final /* synthetic */ dtlp b;

    public /* synthetic */ deti(detn detnVar, dtlp dtlpVar) {
        this.a = detnVar;
        this.b = dtlpVar;
    }

    public final void a(String str, Effect effect, String str2) {
        String str3 = detj.a;
        detn detnVar = this.a;
        if (effect == null) {
            detnVar.e = new deth(detl.FAILURE, str2);
            Log.w(detj.a, "ES effect " + str + " failed to load: ", new RuntimeException(str2));
        } else {
            detnVar.e = new deth(detl.SUCCESS, str2);
            detnVar.d = effect;
            Log.d(detj.a, "ES effect " + str + " loaded successfully");
        }
        this.b.a.invoke(detnVar);
    }
}
