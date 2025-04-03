package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsx {
    public static final jsv a(String str, float f) {
        if (str.length() != 4) {
            jwo.b("Name must be exactly four characters. Actual: '" + str + '\'');
        }
        return new jsv(str, f);
    }
}
