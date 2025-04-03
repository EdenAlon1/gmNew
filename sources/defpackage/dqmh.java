package defpackage;

import android.app.Activity;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqmh implements fbba {
    public static lmy a(Activity activity, ea eaVar, Optional optional) {
        Object obj;
        activity.getClass();
        ffnl e = ffno.e(eaVar, new ffji() { // from class: dqmf
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                ea eaVar2 = (ea) obj2;
                eaVar2.getClass();
                return eaVar2.E;
            }
        });
        optional.isPresent();
        Iterator a = e.a();
        while (true) {
            if (!a.hasNext()) {
                obj = null;
                break;
            }
            obj = a.next();
            if (!(((ea) obj) instanceof dsfw)) {
                break;
            }
        }
        ea eaVar2 = (ea) obj;
        return eaVar2 != null ? eaVar2 : (eg) activity;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
