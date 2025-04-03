package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class envt extends envu {
    private final envs[] a;

    public envt(envs[] envsVarArr) {
        this.a = envsVarArr;
    }

    @Override // defpackage.envu
    public final envs a(int i) {
        return this.a[i];
    }

    @Override // defpackage.ents
    public final int b() {
        return this.a.length;
    }

    @Override // defpackage.ents
    public final Object d(ensn ensnVar) {
        envs envsVar;
        enxb.a(!ensnVar.b, "metadata key must be single valued");
        int length = this.a.length;
        do {
            length--;
            if (length < 0) {
                return null;
            }
            envsVar = this.a[length];
        } while (!envsVar.a.equals(ensnVar));
        return envsVar.b;
    }

    @Override // defpackage.envu
    public final envu f(envu envuVar) {
        int b = envuVar.b();
        if (b == 0) {
            return this;
        }
        envs[] envsVarArr = this.a;
        int length = envsVarArr.length;
        if (length == 0) {
            return envuVar;
        }
        envs[] envsVarArr2 = (envs[]) Arrays.copyOf(envsVarArr, length + b);
        for (int i = 0; i < b; i++) {
            envsVarArr2[this.a.length + i] = envuVar.a(i);
        }
        return new envt(envsVarArr2);
    }
}
