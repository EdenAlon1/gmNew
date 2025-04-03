package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffrv {
    public static final Object a(Object obj, ffgu ffguVar) {
        if (!(obj instanceof ffrt)) {
            return obj;
        }
        Throwable th = ((ffrt) obj).b;
        if (ffso.b && (ffguVar instanceof ffhs)) {
            th = fghn.a(th, (ffhs) ffguVar);
        }
        return ffci.a(th);
    }

    public static final Object b(Object obj) {
        Throwable c = ffch.c(obj);
        return c == null ? obj : new ffrt(c);
    }
}
