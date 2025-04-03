package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fbh {
    public static final fbh a = new fbh(null, null);
    public final ioc b;
    public final jpg c;

    public fbh(ioc iocVar, jpg jpgVar) {
        this.b = iocVar;
        this.c = jpgVar;
    }

    public static /* synthetic */ fbh a(fbh fbhVar, ioc iocVar, jpg jpgVar, int i) {
        if ((i & 1) != 0) {
            iocVar = fbhVar.b;
        }
        if ((i & 2) != 0) {
            jpgVar = fbhVar.c;
        }
        return new fbh(iocVar, jpgVar);
    }
}
