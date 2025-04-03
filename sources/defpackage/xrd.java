package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xrd {
    public static final int a(xrc xrcVar, xrc xrcVar2) {
        xrcVar.getClass();
        xrcVar2.getClass();
        xrc xrcVar3 = xrc.a;
        if (xrcVar == xrcVar3 && xrcVar2 == xrcVar3) {
            return 1;
        }
        if (xrcVar == xrcVar3 && xrcVar2 == xrc.b) {
            return 2;
        }
        xrc xrcVar4 = xrc.b;
        if (xrcVar == xrcVar4 && xrcVar2 == xrcVar3) {
            return 3;
        }
        if (xrcVar == xrcVar4 && xrcVar2 == xrcVar4) {
            return 4;
        }
        throw new IllegalArgumentException("Unhandled state " + xrcVar.name() + " to " + xrcVar2.name());
    }
}
