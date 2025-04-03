package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fanc extends fanj {
    public final eyee a;

    public fanc(eyee eyeeVar) {
        this.a = eyeeVar;
    }

    @Override // defpackage.fanj
    protected final int a() {
        return c((byte) 64);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        fanj fanjVar = (fanj) obj;
        if (a() != fanjVar.a()) {
            return a() - fanjVar.a();
        }
        fanc fancVar = (fanc) fanjVar;
        eyee eyeeVar = this.a;
        int d = eyeeVar.d();
        eyee eyeeVar2 = fancVar.a;
        if (d != eyeeVar2.d()) {
            return eyeeVar.d() - eyeeVar2.d();
        }
        return ermt.b.compare(eyeeVar.I(), fancVar.a.I());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((fanc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), this.a});
    }

    public final String toString() {
        eoeg eoegVar = eoeg.h;
        eoef eoefVar = (eoef) eoegVar;
        eoeg eoegVar2 = eoefVar.d;
        if (eoegVar2 == null) {
            eoeb eoebVar = eoefVar.b;
            if (eoebVar.d()) {
                emxf.m(!eoebVar.e(), "Cannot call upperCase() on a mixed-case alphabet");
                char[] cArr = new char[eoebVar.b.length];
                int i = 0;
                while (true) {
                    char[] cArr2 = eoebVar.b;
                    if (i >= cArr2.length) {
                        break;
                    }
                    cArr[i] = emuz.b(cArr2[i]);
                    i++;
                }
                eoeb eoebVar2 = new eoeb(eoebVar.a.concat(".upperCase()"), cArr);
                eoebVar = eoebVar.h ? eoebVar2.c() : eoebVar2;
            }
            if (eoebVar != eoefVar.b) {
                Character ch = eoefVar.c;
                eoegVar = new eoec(eoebVar);
            }
            eoefVar.d = eoegVar;
            eoegVar2 = eoegVar;
        }
        return "h'" + eoegVar2.j(this.a.I()) + "'";
    }
}
