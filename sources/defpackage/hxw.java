package defpackage;

import androidx.compose.ui.draw.PainterElement;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxw {
    public static /* synthetic */ hvi a(hvi hviVar, igq igqVar, huo huoVar, inp inpVar, float f, ibx ibxVar, int i) {
        if ((i & 4) != 0) {
            int i2 = huo.a;
            huoVar = hum.e;
        }
        huo huoVar2 = huoVar;
        if ((i & 8) != 0) {
            int i3 = inp.a;
            inpVar = ino.e;
        }
        inp inpVar2 = inpVar;
        boolean z = (i & 2) != 0;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return hviVar.a(new PainterElement(igqVar, z, huoVar2, inpVar2, f, ibxVar));
    }
}
