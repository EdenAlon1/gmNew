package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fead {
    private List a;
    private final fdxd b = fdxd.a;
    private Object[][] c = (Object[][]) Array.newInstance((Class<?>) Object.class, 0, 2);

    public final feaf a() {
        return new feaf(this.a, this.b, this.c);
    }

    public final void b(feae feaeVar, Object obj) {
        int i = 0;
        while (true) {
            Object[][] objArr = this.c;
            if (i >= objArr.length) {
                i = -1;
                break;
            } else if (feaeVar.equals(objArr[i][0])) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            Object[][] objArr2 = this.c;
            int length = objArr2.length;
            Object[][] objArr3 = (Object[][]) Array.newInstance((Class<?>) Object.class, length + 1, 2);
            System.arraycopy(objArr2, 0, objArr3, 0, length);
            this.c = objArr3;
            i = objArr3.length - 1;
        }
        this.c[i] = new Object[]{feaeVar, obj};
    }

    public final void c(List list) {
        emxf.b(!list.isEmpty(), "addrs is empty");
        this.a = DesugarCollections.unmodifiableList(new ArrayList(list));
    }
}
