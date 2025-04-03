package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwdm implements evew {
    private static final febj a;
    private ListenableFuture b;
    private final dwdl c;

    static {
        febf febfVar = febo.c;
        int i = febj.d;
        a = new febe("Cookie", febfVar);
    }

    public dwdm(dwdl dwdlVar) {
        dwdlVar.getClass();
        this.c = dwdlVar;
    }

    @Override // defpackage.evew
    public final evgb a(eves evesVar) {
        ListenableFuture listenableFuture = this.b;
        if (listenableFuture != null) {
            try {
                Object q = erqt.q(listenableFuture);
                q.getClass();
                String str = (String) q;
                if (!ffkj.e(str, "")) {
                    evesVar.a.g(a, a.t(str, "NID="));
                }
            } catch (Exception unused) {
            }
        }
        return evgb.a;
    }

    @Override // defpackage.evew
    public final evgb b(eves evesVar) {
        ListenableFuture a2 = this.c.a();
        this.b = a2;
        return evgb.c(a2);
    }

    @Override // defpackage.evew
    public final /* synthetic */ evgb c() {
        return evgb.a;
    }

    @Override // defpackage.evew
    public final /* synthetic */ evgb e() {
        return evgb.a;
    }

    @Override // defpackage.evew
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.evew
    public final /* synthetic */ void g() {
    }

    @Override // defpackage.evew
    public final /* synthetic */ void d(ever everVar) {
    }
}
