package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ogl extends ogo {
    public static final ogl a;
    public final ofz b;
    public final List c;
    public final int d;
    public final int e;
    public final ofy f;
    public final ofy g = null;

    static {
        List b = ffdx.b(oll.a);
        ofw ofwVar = ofw.b;
        ofw ofwVar2 = ofw.a;
        a = new ogl(ofz.a, b, 0, 0, new ofy(ofwVar, ofwVar2, ofwVar2));
    }

    public ogl(ofz ofzVar, List list, int i, int i2, ofy ofyVar) {
        this.b = ofzVar;
        this.c = list;
        this.d = i;
        this.e = i2;
        this.f = ofyVar;
        if (ofzVar != ofz.c && i < 0) {
            throw new IllegalArgumentException("Prepend insert defining placeholdersBefore must be > 0, but was " + i);
        }
        if (ofzVar != ofz.b && i2 < 0) {
            throw new IllegalArgumentException("Append insert defining placeholdersAfter must be > 0, but was " + i2);
        }
        if (ofzVar == ofz.a && list.isEmpty()) {
            throw new IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00b7 -> B:10:0x00bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0071 -> B:11:0x008e). Please report as a decompilation issue!!! */
    @Override // defpackage.ogo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ffjm r18, defpackage.ffgu r19) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ogl.b(ffjm, ffgu):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogl)) {
            return false;
        }
        ogl oglVar = (ogl) obj;
        if (this.b != oglVar.b || !ffkj.e(this.c, oglVar.c) || this.d != oglVar.d || this.e != oglVar.e || !ffkj.e(this.f, oglVar.f)) {
            return false;
        }
        ofy ofyVar = oglVar.g;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        return ((((((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e) * 31) + this.f.hashCode()) * 31;
    }

    public final String toString() {
        String c;
        Iterator it = this.c.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((oll) it.next()).c.size();
        }
        int i2 = this.d;
        String valueOf = i2 != -1 ? String.valueOf(i2) : "none";
        int i3 = this.e;
        String valueOf2 = i3 != -1 ? String.valueOf(i3) : "none";
        StringBuilder sb = new StringBuilder("PageEvent.Insert for ");
        sb.append(this.b);
        sb.append(", with ");
        sb.append(i);
        sb.append(" items (\n                    |   first item: ");
        oll ollVar = (oll) ffdx.M(this.c);
        sb.append(ollVar != null ? ffdx.M(ollVar.c) : null);
        sb.append("\n                    |   last item: ");
        oll ollVar2 = (oll) ffdx.Q(this.c);
        sb.append(ollVar2 != null ? ffdx.Q(ollVar2.c) : null);
        sb.append("\n                    |   placeholdersBefore: ");
        sb.append(valueOf);
        sb.append("\n                    |   placeholdersAfter: ");
        sb.append(valueOf2);
        sb.append("\n                    |   sourceLoadStates: ");
        sb.append(this.f);
        sb.append("\n                    ");
        c = ffpc.c(sb.toString().concat("|)"), "|");
        return c;
    }
}
