package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cssv {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    private final ffbr d;

    public cssv(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.d = ffbrVar3;
        this.c = ffbrVar4;
    }

    public final boolean a() {
        if (b()) {
            return true;
        }
        return ((Boolean) this.d.b()).booleanValue();
    }

    public final boolean b() {
        return ((ctyx) this.b.b()).q("debugging_features_enabled", ((Boolean) cful.al.e()).booleanValue());
    }
}
