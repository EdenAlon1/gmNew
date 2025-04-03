package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fjdu<T> {
    public final fhhb a;
    public final Object b;

    public fjdu(fhhb fhhbVar, Object obj) {
        this.a = fhhbVar;
        this.b = obj;
    }

    public static fjdu b(Object obj, fhhb fhhbVar) {
        if (fhhbVar.a()) {
            return new fjdu(fhhbVar, obj);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public final int a() {
        return this.a.d;
    }

    public final boolean c() {
        return this.a.a();
    }

    public final String toString() {
        return this.a.toString();
    }
}
