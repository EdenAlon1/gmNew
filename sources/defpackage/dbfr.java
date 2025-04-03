package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbfr extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ dbfy b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbfr(dbfy dbfyVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = dbfyVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
