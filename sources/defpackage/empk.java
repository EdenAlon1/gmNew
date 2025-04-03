package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class empk {
    public final fbxq a;
    public final fbxq b;
    public final String c;
    public final String d;
    public boolean e;
    public boolean f;
    public final float g;

    public empk(fbxm fbxmVar) {
        fbxq fbxqVar;
        fbxq fbxqVar2;
        this.e = false;
        this.f = false;
        if ((fbxmVar.b & 1) != 0) {
            fbxqVar = fbxmVar.e;
            if (fbxqVar == null) {
                fbxqVar = fbxq.a;
            }
        } else {
            fbxqVar = empl.a;
        }
        this.a = fbxqVar;
        if ((fbxmVar.b & 2) != 0) {
            fbxqVar2 = fbxmVar.f;
            if (fbxqVar2 == null) {
                fbxqVar2 = fbxq.a;
            }
        } else {
            fbxqVar2 = empl.b;
        }
        this.b = fbxqVar2;
        String str = fbxmVar.c == 2 ? (String) fbxmVar.d : "";
        if (str.isEmpty()) {
            this.c = "";
        } else {
            this.c = str;
            this.e = true;
        }
        String str2 = fbxmVar.c == 1 ? (String) fbxmVar.d : "";
        if (str2.isEmpty()) {
            this.d = "";
        } else {
            this.d = str2;
            this.f = true;
        }
        this.g = fbxmVar.g;
    }
}
