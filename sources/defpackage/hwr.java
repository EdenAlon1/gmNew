package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hwr extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ hwu b;
    int c;
    hwu d;
    ffwc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hwr(hwu hwuVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = hwuVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.h(this);
    }
}
