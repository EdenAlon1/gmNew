package defpackage;

import android.content.Context;
import com.google.android.gms.auth.api.internal.IAuthService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfdt extends dfra {
    public dfdt(Context context, dfbf dfbfVar) {
        super(context, dfbe.b, dfbfVar, dfqz.a);
    }

    public final dhre a() {
        dfun dfunVar = new dfun();
        dfunVar.a = new dfuf() { // from class: dfdr
            @Override // defpackage.dfuf
            public final void a(Object obj, Object obj2) {
                ((IAuthService) ((dfdl) obj).w()).getSpatulaHeader(new dfds((dhri) obj2));
            }
        };
        dfunVar.c = 1520;
        return i(dfunVar.a());
    }
}
