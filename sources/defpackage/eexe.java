package defpackage;

import android.content.Context;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eexe implements eewt {
    private final Context a;

    public eexe(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.eewt
    public final void a(eewp eewpVar) {
        Iterator it = eevp.a(this.a, eewm.class).iterator();
        while (it.hasNext()) {
            eewpVar.i((eewm) it.next());
        }
        Iterator it2 = eevp.a(this.a, eewl.class).iterator();
        while (it2.hasNext()) {
            eewpVar.g((eewl) it2.next());
        }
    }
}
