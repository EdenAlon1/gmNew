package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dwec {
    private static final ThreadLocal a = new dwdy();

    public static dwec c() {
        return (dwec) a.get();
    }

    public abstract void a(dwea dweaVar);

    public abstract void b(dwea dweaVar);
}
