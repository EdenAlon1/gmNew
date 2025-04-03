package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djrk {
    private final ctvb a;

    public djrk(ctvb ctvbVar) {
        ctvbVar.getClass();
        this.a = ctvbVar;
    }

    public final djrj a(String str) {
        str.getClass();
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Input is an empty String.");
        }
        if (this.a.I(str)) {
            return new djrj(str);
        }
        throw new IllegalArgumentException("Input is not in E164 number format.");
    }
}
