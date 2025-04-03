package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlah extends dlaf {
    public final int a;
    private final byte[] b;
    private final dllb c;

    public dlah() {
        this(0, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlah)) {
            return false;
        }
        dlah dlahVar = (dlah) obj;
        return this.a == dlahVar.a && ffkj.e(this.b, dlahVar.b) && ffkj.e(this.c, dlahVar.c);
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            i = 0;
        }
        byte[] bArr = this.b;
        int hashCode = bArr == null ? 0 : Arrays.hashCode(bArr);
        int i2 = i * 31;
        dllb dllbVar = this.c;
        return ((i2 + hashCode) * 31) + (dllbVar != null ? dllbVar.hashCode() : 0);
    }

    public dlah(int i, byte[] bArr, dllb dllbVar) {
        this.a = i;
        this.b = bArr;
        this.c = dllbVar;
    }

    public /* synthetic */ dlah(int i, int i2) {
        this(1 == (i2 & 1) ? 0 : i, null, null);
    }
}
