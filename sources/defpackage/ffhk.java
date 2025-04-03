package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffhk extends ffhr {
    final /* synthetic */ ffjm a;
    final /* synthetic */ Object b;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffhk(ffgu ffguVar, ffhd ffhdVar, ffjm ffjmVar, Object obj) {
        super(ffguVar, ffhdVar);
        this.a = ffjmVar;
        this.b = obj;
    }

    @Override // defpackage.ffhp
    protected final Object b(Object obj) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.c = 2;
            ffci.b(obj);
            return obj;
        }
        this.c = 1;
        ffci.b(obj);
        ffjm ffjmVar = this.a;
        fflf.e(ffjmVar, 2);
        return ffjmVar.a(this.b, this);
    }
}
