package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcmn extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ fcmo b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcmn(fcmo fcmoVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = fcmoVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, null, this);
    }
}
