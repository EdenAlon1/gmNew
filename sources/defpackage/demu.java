package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class demu {
    public final ffbr a;
    public final fgcm b;
    private final ffsk c;

    public demu(ffbr ffbrVar, ffsk ffskVar) {
        ffbrVar.getClass();
        ffskVar.getClass();
        this.a = ffbrVar;
        this.c = ffskVar;
        this.b = fgdm.a(cjtw.SHARE_TO_UNKNOWN);
        axol.m(ffskVar, new demt(this, null));
    }

    public final void a(cjtw cjtwVar) {
        cjtwVar.getClass();
        if (cjtwVar == cjtw.SHARE_TO_UNKNOWN) {
            cjtwVar = cjtw.SHARE_TO_EVERYONE;
        }
        this.b.f(cjtwVar);
    }
}
