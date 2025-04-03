package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.util.Optional;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsf implements wqq {
    public final aigz a;
    public final aleq b;
    public final ffbr c;
    public final ffxx d;
    public final ffji e;
    private final Context f;
    private final ffxx g;
    private final ffxx h;
    private final ffsk i;
    private final fgcq j;
    private final Set k;

    public wsf(Context context, ffxx ffxxVar, ffxx ffxxVar2, ffsk ffskVar, aigz aigzVar, aleq aleqVar, Optional optional, ffbr ffbrVar, ffbr ffbrVar2, fgcq fgcqVar) {
        ffji a;
        context.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        ffskVar.getClass();
        aigzVar.getClass();
        aleqVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        this.f = context;
        this.g = ffxxVar;
        this.h = ffxxVar2;
        this.i = ffskVar;
        this.a = aigzVar;
        this.b = aleqVar;
        this.c = ffbrVar2;
        this.j = fgcqVar;
        cyvq cyvqVar = (cyvq) fflm.b(optional);
        this.d = fgck.c(ffxxVar, ffxxVar2, cyvqVar != null ? cyvqVar.b : new ffyg(null), ((cnpd) ffbrVar.b()).h(), fgcqVar, new wsd(this, null));
        a = axqa.a(new wse(this), 1000L, ffskVar);
        this.e = a;
        this.k = fffi.b(aaxf.a);
    }

    @Override // defpackage.wqq
    public final Set a() {
        return this.k;
    }

    @Override // defpackage.wqq
    public final ffxx b() {
        return this.d;
    }

    public final dlsr c(final engw engwVar, boolean z, boolean z2) {
        String string = this.f.getString(R.string.call_action);
        string.getClass();
        return new dlsr(string, dmzz.R, false, false, z, z2, null, false, null, new ffix() { // from class: wsc
            @Override // defpackage.ffix
            public final Object invoke() {
                wsf.this.e.invoke(engwVar);
                return ffcu.a;
            }
        }, 972);
    }
}
