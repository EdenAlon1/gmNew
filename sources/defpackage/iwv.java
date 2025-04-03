package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.Reference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class iwv {
    public static /* synthetic */ iwu a(iwx iwxVar, ffjm ffjmVar, ffix ffixVar, iga igaVar, boolean z, int i) {
        Object obj = null;
        if ((i & 4) != 0) {
            igaVar = null;
        }
        if (igaVar != null) {
            return new jem(igaVar, null, (AndroidComposeView) iwxVar, ffjmVar, ffixVar);
        }
        if (((i & 8) == 0) && z) {
            AndroidComposeView androidComposeView = (AndroidComposeView) iwxVar;
            if (androidComposeView.isHardwareAccelerated() && androidComposeView.B) {
                try {
                    return new jfp((AndroidComposeView) iwxVar, ffjmVar, ffixVar);
                } catch (Throwable unused) {
                    androidComposeView.B = false;
                }
            }
            if (androidComposeView.x == null) {
                if (!jgm.c) {
                    jgl.a(new View(androidComposeView.getContext()));
                }
                androidComposeView.x = jgm.d ? new jea(androidComposeView.getContext()) : new jgn(androidComposeView.getContext());
                androidComposeView.addView(androidComposeView.x);
            }
            jea jeaVar = androidComposeView.x;
            jeaVar.getClass();
            return new jgm(androidComposeView, jeaVar, ffjmVar, ffixVar);
        }
        AndroidComposeView androidComposeView2 = (AndroidComposeView) iwxVar;
        jgo jgoVar = androidComposeView2.K;
        jgoVar.a();
        while (true) {
            hne hneVar = jgoVar.a;
            int i2 = hneVar.b;
            if (i2 == 0) {
                break;
            }
            Object obj2 = ((Reference) hneVar.c(i2 - 1)).get();
            if (obj2 != null) {
                obj = obj2;
                break;
            }
        }
        iwu iwuVar = (iwu) obj;
        if (iwuVar != null) {
            iwuVar.h(ffjmVar, ffixVar);
            return iwuVar;
        }
        iaw iawVar = androidComposeView2.T;
        return new jem(iawVar.a(), iawVar, androidComposeView2, ffjmVar, ffixVar);
    }
}
