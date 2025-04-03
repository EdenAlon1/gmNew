package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feyx {
    public String[] a;
    public String[] b;
    public boolean c;

    public feyx() {
    }

    public final void a(feyw... feywVarArr) {
        String[] strArr = new String[feywVarArr.length];
        for (int i = 0; i < feywVarArr.length; i++) {
            strArr[i] = feywVarArr[i].bb;
        }
        this.a = strArr;
    }

    public final void b() {
        this.c = true;
    }

    public final void c(fezk... fezkVarArr) {
        String[] strArr = new String[fezkVarArr.length];
        for (int i = 0; i < fezkVarArr.length; i++) {
            strArr[i] = fezkVarArr[i].f;
        }
        this.b = strArr;
    }

    public feyx(feyy feyyVar) {
        boolean z = feyyVar.b;
        this.a = feyyVar.c;
        this.b = feyyVar.d;
        this.c = feyyVar.e;
    }
}
