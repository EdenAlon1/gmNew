package defpackage;

import android.content.Context;
import android.support.v7.widget.GridLayoutManager;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqxg {
    public static final dqky a = new dqky(new ffji() { // from class: dqxd
        @Override // defpackage.ffji
        public final Object invoke(Object obj) {
            Set set = (Set) obj;
            dqky dqkyVar = dqxg.a;
            set.getClass();
            return ffdx.ah(set, new dqxf());
        }
    });
    public static final List b;

    static {
        ffbz ffbzVar = dqnz.a;
        b = ffdx.ak(dqny.a());
    }

    public static final dqwt a(Context context, int i, ffji ffjiVar, ffjm ffjmVar, int i2, ffji ffjiVar2) {
        return new dqya(context, i, ffjiVar, new GridLayoutManager(i2), ffjmVar, ffjiVar2);
    }
}
