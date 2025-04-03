package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class glm {
    public static final glm a;
    public static final glm b;
    public static final glm c;
    public static final glm d;
    public static final glm e;
    private static final /* synthetic */ glm[] f;

    static {
        glm glmVar = new glm("TopBar", 0);
        a = glmVar;
        glm glmVar2 = new glm("MainContent", 1);
        b = glmVar2;
        glm glmVar3 = new glm("Snackbar", 2);
        c = glmVar3;
        glm glmVar4 = new glm("Fab", 3);
        d = glmVar4;
        glm glmVar5 = new glm("BottomBar", 4);
        e = glmVar5;
        glm[] glmVarArr = {glmVar, glmVar2, glmVar3, glmVar4, glmVar5};
        f = glmVarArr;
        ffhw.a(glmVarArr);
    }

    private glm(String str, int i) {
    }

    public static glm[] values() {
        return (glm[]) f.clone();
    }
}
