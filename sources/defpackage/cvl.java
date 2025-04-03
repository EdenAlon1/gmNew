package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cvl {
    public static final /* synthetic */ int a = 0;

    static {
        int i = cuo.a;
    }

    public static /* synthetic */ cvm a() {
        int i = inp.a;
        inp inpVar = ino.d;
        int i2 = huo.a;
        huo huoVar = hum.e;
        dac dacVar = cwn.a;
        if ((inpVar != ino.d && inpVar != ino.c && inpVar != ino.g && inpVar != ino.b && inpVar != ino.a && inpVar != ino.f && inpVar != ino.e) || (huoVar != hum.a && huoVar != hum.b && huoVar != hum.c && huoVar != hum.d && huoVar != hum.e && huoVar != hum.f && huoVar != hum.g && huoVar != hum.h && huoVar != hum.i)) {
            return new cuq(inpVar, huoVar);
        }
        cop copVar = cwn.b;
        Object f = copVar.f(inpVar);
        if (f == null) {
            f = new cop((byte[]) null);
            copVar.e(inpVar, f);
        }
        cop copVar2 = (cop) f;
        Object f2 = copVar2.f(huoVar);
        if (f2 == null) {
            f2 = new cuq(inpVar, huoVar);
            copVar2.e(huoVar, f2);
        }
        return (cuq) f2;
    }
}
