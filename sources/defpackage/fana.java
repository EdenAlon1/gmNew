package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fana extends fanj {
    private final engw a;
    private final int b;

    /* JADX WARN: Multi-variable type inference failed */
    public fana(engw engwVar) {
        engwVar.getClass();
        this.a = engwVar;
        int i = 0;
        int i2 = 0;
        while (true) {
            engw engwVar2 = this.a;
            if (i >= ((enou) engwVar2).c) {
                break;
            }
            int b = ((fanj) engwVar2.get(i)).b();
            if (i2 < b) {
                i2 = b;
            }
            i++;
        }
        int i3 = i2 + 1;
        this.b = i3;
        if (i3 > 8) {
            throw new famz("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // defpackage.fanj
    protected final int a() {
        return c(Byte.MIN_VALUE);
    }

    @Override // defpackage.fanj
    protected final int b() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        fanj fanjVar = (fanj) obj;
        if (a() != fanjVar.a()) {
            return a() - fanjVar.a();
        }
        fana fanaVar = (fana) fanjVar;
        engw engwVar = this.a;
        int i = ((enou) fanaVar.a).c;
        int i2 = ((enou) engwVar).c;
        if (i2 != i) {
            return i2 - i;
        }
        int i3 = 0;
        while (true) {
            engw engwVar2 = this.a;
            if (i3 >= ((enou) engwVar2).c) {
                return 0;
            }
            int compareTo = ((fanj) engwVar2.get(i3)).compareTo((fanj) fanaVar.a.get(i3));
            if (compareTo != 0) {
                return compareTo;
            }
            i3++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return enkr.h(this.a, ((fana) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(a()), this.a});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        if (this.a.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        engw engwVar = this.a;
        for (int i = 0; i < ((enou) engwVar).c; i++) {
            arrayList.add(((fanj) engwVar.get(i)).toString().replace("\n", "\n  "));
        }
        emww emwwVar = new emww(",\n  ");
        StringBuilder sb = new StringBuilder("[\n  ");
        emwwVar.i(sb, arrayList);
        sb.append("\n]");
        return sb.toString();
    }
}
