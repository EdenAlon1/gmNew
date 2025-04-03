package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apvg {
    public static final int a(engw engwVar, alxw alxwVar, ffji ffjiVar) {
        int size = engwVar.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            E e = engwVar.get(i2);
            e.getClass();
            alxw alxwVar2 = (alxw) ffjiVar.invoke(e);
            if (alxwVar.compareTo(alxwVar2) < 0) {
                i = i2 + 1;
            } else {
                if (alxwVar.compareTo(alxwVar2) <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return i;
    }
}
