package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvom implements ejwd<Boolean> {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public boolean f = false;

    public cvom(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
    }

    @Override // defpackage.ejwd
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.f = ((Boolean) obj).booleanValue();
    }

    @Override // defpackage.ejwd
    public final /* synthetic */ void hB() {
    }

    @Override // defpackage.ejwd
    public final void a(Throwable th) {
    }
}
