package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class owd {
    public static final int a(oxf oxfVar, String str) {
        int a = owc.a(oxfVar, str);
        if (a >= 0) {
            return a;
        }
        int a2 = owc.a(oxfVar, "`" + str + '`');
        if (a2 >= 0) {
            return a2;
        }
        return -1;
    }
}
