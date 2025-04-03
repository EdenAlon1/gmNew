package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ksx implements ksy {
    public final /* synthetic */ ksy a;
    public final /* synthetic */ ksy b;

    public /* synthetic */ ksx(ksy ksyVar, ksy ksyVar2) {
        this.a = ksyVar;
        this.b = ksyVar2;
    }

    @Override // defpackage.ksy
    public final /* synthetic */ ksy a(ksy ksyVar) {
        return new ksx(this, ksyVar);
    }

    @Override // defpackage.ksy
    public final boolean b(Object obj) {
        return this.a.b(obj) || this.b.b(obj);
    }
}
