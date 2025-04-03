package defpackage;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hjn implements ffsk, hjk {
    public static final ffhd a = new heu();
    public final ffhd b;
    public final ffhd c;
    private final Object d = this;
    private volatile ffhd e;

    public hjn(ffhd ffhdVar, ffhd ffhdVar2) {
        this.b = ffhdVar;
        this.c = ffhdVar2;
    }

    public final void a() {
        synchronized (this.d) {
            ffhd ffhdVar = this.e;
            if (ffhdVar == null) {
                this.e = a;
            } else {
                ffui.d(ffhdVar, new hgt());
            }
        }
    }

    @Override // defpackage.hjk
    public final void g() {
        a();
    }

    @Override // defpackage.hjk
    public final void h() {
        a();
    }

    @Override // defpackage.ffsk
    public final ffhd hT() {
        ffhd ffhdVar;
        ffhd ffhdVar2 = this.e;
        if (ffhdVar2 == null || ffhdVar2 == a) {
            hua huaVar = (hua) this.b.get(hua.a);
            ffhd hjmVar = huaVar != null ? new hjm(CoroutineExceptionHandler.c, huaVar, this) : ffhe.a;
            synchronized (this.d) {
                ffhdVar = this.e;
                if (ffhdVar == null) {
                    ffhd ffhdVar3 = this.b;
                    ffhdVar = ffhdVar3.plus(new ffuf((ffud) ffhdVar3.get(ffud.c))).plus(this.c).plus(hjmVar);
                } else if (ffhdVar == a) {
                    ffhd ffhdVar4 = this.b;
                    ffuf ffufVar = new ffuf((ffud) ffhdVar4.get(ffud.c));
                    ffufVar.t(new hgt());
                    ffhdVar = ffhdVar4.plus(ffufVar).plus(this.c).plus(hjmVar);
                }
                this.e = ffhdVar;
            }
            ffhdVar2 = ffhdVar;
        }
        ffhdVar2.getClass();
        return ffhdVar2;
    }

    @Override // defpackage.hjk
    public final void i() {
    }
}
