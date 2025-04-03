package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvyr {
    private final int a;
    private final dvxb[] b;
    private final dvxc[] c;

    public dvyr(int i, dvxb[] dvxbVarArr, dvxc[] dvxcVarArr) {
        dvxbVarArr.getClass();
        dvxcVarArr.getClass();
        this.a = i;
        this.b = dvxbVarArr;
        this.c = dvxcVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvyr)) {
            return false;
        }
        dvyr dvyrVar = (dvyr) obj;
        return this.a == dvyrVar.a && Arrays.equals(this.b, dvyrVar.b) && Arrays.equals(this.c, dvyrVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
    }
}
