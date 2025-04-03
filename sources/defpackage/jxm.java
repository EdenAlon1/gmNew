package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jxm {
    public final Object a;
    private final hkx b;
    private final jxm c;

    public jxm(hkx hkxVar, jxm jxmVar) {
        this.b = hkxVar;
        this.c = jxmVar;
        this.a = hkxVar.a();
    }

    public final boolean a() {
        if (this.b.a() != this.a) {
            return true;
        }
        jxm jxmVar = this.c;
        return jxmVar != null && jxmVar.a();
    }
}
