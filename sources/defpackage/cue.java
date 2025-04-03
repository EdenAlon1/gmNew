package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cue {
    public static final cue a = new cuf(new cxe(null, null, null, null, false, null, 63));

    public final cue a(cue cueVar) {
        cui cuiVar = cueVar.b().a;
        if (cuiVar == null) {
            cuiVar = b().a;
        }
        cxa cxaVar = cueVar.b().b;
        if (cxaVar == null) {
            cxaVar = b().b;
        }
        csd csdVar = cueVar.b().c;
        if (csdVar == null) {
            csdVar = b().c;
        }
        cup cupVar = cueVar.b().d;
        if (cupVar == null) {
            cupVar = b().d;
        }
        return new cuf(new cxe(cuiVar, cxaVar, csdVar, cupVar, false, ffew.j(b().f, cueVar.b().f), 16));
    }

    public abstract cxe b();

    public final boolean equals(Object obj) {
        return (obj instanceof cue) && ffkj.e(((cue) obj).b(), b());
    }

    public final int hashCode() {
        return b().hashCode();
    }

    public final String toString() {
        if (ffkj.e(this, a)) {
            return "EnterTransition.None";
        }
        cxe b = b();
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        cui cuiVar = b.a;
        sb.append(cuiVar != null ? cuiVar.toString() : null);
        sb.append(",\nSlide - ");
        cxa cxaVar = b.b;
        sb.append(cxaVar != null ? cxaVar.toString() : null);
        sb.append(",\nShrink - ");
        csd csdVar = b.c;
        sb.append(csdVar != null ? csdVar.toString() : null);
        sb.append(",\nScale - ");
        cup cupVar = b.d;
        sb.append(cupVar != null ? cupVar.toString() : null);
        return sb.toString();
    }
}
