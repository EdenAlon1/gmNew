package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daby {
    public static final dabz a(long j) {
        dabz dabzVar;
        dabz[] values = dabz.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                dabzVar = null;
                break;
            }
            dabzVar = values[i];
            if (dabzVar.e == j) {
                break;
            }
            i++;
        }
        return dabzVar == null ? dabz.a : dabzVar;
    }
}
