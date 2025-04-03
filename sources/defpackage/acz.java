package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acz {
    public static final /* synthetic */ int a = 0;
    private static final hik b = new hgq(hla.a, acy.a);

    public static final acd a(hfd hfdVar) {
        acd acdVar = (acd) hfdVar.e(b);
        if (acdVar == null) {
            hfdVar.v(544166745);
            View view = (View) hfdVar.e(AndroidCompositionLocals_androidKt.g);
            view.getClass();
            acdVar = (acd) ffno.f(ffno.j(ffno.e(view, acg.a), ach.a));
            hfdVar.o();
        } else {
            hfdVar.v(544164296);
            hfdVar.o();
        }
        if (acdVar != null) {
            hfdVar.v(544164377);
            hfdVar.o();
            return acdVar;
        }
        hfdVar.v(544168748);
        Object obj = (Context) hfdVar.e(AndroidCompositionLocals_androidKt.b);
        while (true) {
            if (!(obj instanceof ContextWrapper)) {
                obj = null;
                break;
            }
            if (obj instanceof acd) {
                break;
            }
            obj = ((ContextWrapper) obj).getBaseContext();
        }
        acd acdVar2 = (acd) obj;
        hfdVar.o();
        return acdVar2;
    }
}
