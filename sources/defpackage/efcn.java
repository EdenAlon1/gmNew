package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efcn {
    public final String a;
    public final String b;

    public efcn(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String toString() {
        String str = this.b;
        if (str == null) {
            return efco.a(this.a);
        }
        return efco.a(this.a) + "=" + efco.a(str);
    }
}
