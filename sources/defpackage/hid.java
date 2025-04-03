package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hid extends ffhr {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ hie c;
    int d;
    hie e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hid(hie hieVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = hieVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
