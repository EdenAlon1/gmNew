package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cug {
    public static final cug a = new cuh(new cxe(null, null, null, null, false, null, 63));
    private static final cug b = new cuh(new cxe(null, null, null, null, true, null, 47));

    public final cug a(cug cugVar) {
        cui cuiVar = cugVar.b().a;
        if (cuiVar == null) {
            cuiVar = b().a;
        }
        cxa cxaVar = cugVar.b().b;
        if (cxaVar == null) {
            cxaVar = b().b;
        }
        csd csdVar = cugVar.b().c;
        if (csdVar == null) {
            csdVar = b().c;
        }
        cup cupVar = cugVar.b().d;
        if (cupVar == null) {
            cupVar = b().d;
        }
        boolean z = true;
        if (!cugVar.b().e && !b().e) {
            z = false;
        }
        return new cuh(new cxe(cuiVar, cxaVar, csdVar, cupVar, z, ffew.j(b().f, cugVar.b().f)));
    }

    public abstract cxe b();

    public final boolean equals(Object obj) {
        return (obj instanceof cug) && ffkj.e(((cug) obj).b(), b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        if (ffkj.e(this, a)) {
            return "ExitTransition.None";
        }
        if (ffkj.e(this, b)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        cxe b2 = b();
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        cui cuiVar = b2.a;
        sb.append(cuiVar != null ? cuiVar.toString() : null);
        sb.append(",\nSlide - ");
        cxa cxaVar = b2.b;
        sb.append(cxaVar != null ? cxaVar.toString() : null);
        sb.append(",\nShrink - ");
        csd csdVar = b2.c;
        sb.append(csdVar != null ? csdVar.toString() : null);
        sb.append(",\nScale - ");
        cup cupVar = b2.d;
        sb.append(cupVar != null ? cupVar.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(b2.e);
        return sb.toString();
    }
}
