package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fazm {

    /* compiled from: PG */
    public interface a {
        Set fV();
    }

    public static boolean a(Context context) {
        Set fV = ((a) fazi.a(context, a.class)).fV();
        enpd enpdVar = (enpd) fV;
        fbau.a(enpdVar.e <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (fV.isEmpty()) {
            return true;
        }
        return ((Boolean) enpdVar.listIterator().next()).booleanValue();
    }
}
