package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.TreeSet;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjag implements Serializable {
    private static final long serialVersionUID = -125354057735389003L;
    private TreeSet a = new TreeSet();

    private fjag() {
    }

    private static void c(fixd fixdVar, TreeSet treeSet, int i) {
        int intValue = ((((Integer) treeSet.last()).intValue() & PrivateKeyType.INVALID) >> 3) + 1;
        int[] iArr = new int[intValue];
        fixdVar.g(i);
        fixdVar.g(intValue);
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            int intValue2 = ((Integer) it.next()).intValue();
            int i2 = (intValue2 & PrivateKeyType.INVALID) >> 3;
            iArr[i2] = (1 << (7 - (intValue2 % 8))) | iArr[i2];
        }
        for (int i3 = 0; i3 < intValue; i3++) {
            fixdVar.g(iArr[i3]);
        }
    }

    public final void a(fixd fixdVar) {
        if (this.a.size() == 0) {
            return;
        }
        TreeSet treeSet = new TreeSet();
        Iterator it = this.a.iterator();
        int i = -1;
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            int i2 = intValue >> 8;
            if (i2 != i) {
                if (treeSet.size() > 0) {
                    c(fixdVar, treeSet, i);
                    treeSet.clear();
                }
                i = i2;
            }
            treeSet.add(new Integer(intValue));
        }
        c(fixdVar, treeSet, i);
    }

    public final boolean b() {
        return this.a.isEmpty();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            stringBuffer.append(fjaf.a(((Integer) it.next()).intValue()));
            if (it.hasNext()) {
                stringBuffer.append(' ');
            }
        }
        return stringBuffer.toString();
    }

    public fjag(fixb fixbVar) {
        while (fixbVar.d() > 0) {
            if (fixbVar.d() < 2) {
                throw new fjan("invalid bitmap descriptor");
            }
            int c = fixbVar.c();
            int c2 = fixbVar.c();
            if (c2 > fixbVar.d()) {
                throw new fjan("invalid bitmap");
            }
            for (int i = 0; i < c2; i++) {
                int c3 = fixbVar.c();
                if (c3 != 0) {
                    for (int i2 = 0; i2 < 8; i2++) {
                        if (((1 << (7 - i2)) & c3) != 0) {
                            this.a.add(fiyi.b((c * 256) + (i * 8) + i2));
                        }
                    }
                }
            }
        }
    }
}
