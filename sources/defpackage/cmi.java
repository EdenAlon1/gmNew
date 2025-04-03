package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cmi extends cmt {
    final /* synthetic */ cmj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmi(cmj cmjVar) {
        super(cmjVar.c);
        this.a = cmjVar;
    }

    @Override // defpackage.cmt
    protected final Object a(int i) {
        return this.a.b(i);
    }

    @Override // defpackage.cmt
    protected final void b(int i) {
        this.a.c(i);
    }
}
