package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fjbz implements fjbj {
    final Executor a;
    final fjbj b;

    public fjbz(Executor executor, fjbj fjbjVar) {
        this.a = executor;
        this.b = fjbjVar;
    }

    @Override // defpackage.fjbj
    public final fhgv a() {
        return this.b.a();
    }

    @Override // defpackage.fjbj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final fjbj clone() {
        return new fjbz(this.a, this.b.clone());
    }

    @Override // defpackage.fjbj
    public final void c() {
        this.b.c();
    }

    @Override // defpackage.fjbj
    public final void d(fjbm fjbmVar) {
        this.b.d(new fjby(this, fjbmVar));
    }

    @Override // defpackage.fjbj
    public final boolean e() {
        return this.b.e();
    }
}
