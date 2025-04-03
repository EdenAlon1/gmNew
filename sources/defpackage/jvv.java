package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jvv {
    public static final jlm a(jvu jvuVar) {
        long j = jvuVar.c;
        return jvuVar.b.subSequence(jpm.d(j), jpm.c(j));
    }

    public static final jlm b(jvu jvuVar, int i) {
        return jvuVar.b.subSequence(jpm.c(jvuVar.c), Math.min(jpm.c(jvuVar.c) + i, jvuVar.a().length()));
    }

    public static final jlm c(jvu jvuVar, int i) {
        int d = jpm.d(jvuVar.c) - i;
        long j = jvuVar.c;
        return jvuVar.b.subSequence(Math.max(0, d), jpm.d(j));
    }
}
