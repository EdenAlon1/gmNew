package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avkg extends IllegalArgumentException {
    public avkg(String str) {
        super(str);
    }

    static avkg a(String str, Throwable th) {
        return new avkg(String.format("%s cannot be converted into a ChatEndpoint.", str), th);
    }

    private avkg(String str, Throwable th) {
        super(str, th);
    }
}
