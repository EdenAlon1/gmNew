package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cppf {
    public static final febo a(String str) {
        if (str == null) {
            return null;
        }
        febo feboVar = new febo();
        febf febfVar = febo.c;
        int i = febj.d;
        feboVar.g(new febe("Authorization", febfVar), "Bearer ".concat(str));
        return feboVar;
    }
}
