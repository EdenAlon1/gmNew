package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczi implements eknz {
    final /* synthetic */ aczj a;
    final /* synthetic */ ekoa b;

    public aczi(aczj aczjVar, ekoa ekoaVar) {
        this.a = aczjVar;
        this.b = ekoaVar;
    }

    @Override // defpackage.eknz
    public final emxc a() {
        return emxc.i(null);
    }

    @Override // defpackage.eknz
    public final ListenableFuture c() {
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        ffhd a = ekxi.a(ffheVar);
        aczj aczjVar = this.a;
        return fgfz.b(aczjVar.b, a, ffsmVar, new aczh(null, aczjVar, this, this.b));
    }

    @Override // defpackage.eknz
    public final /* synthetic */ eknx e() {
        return ekny.a();
    }

    @Override // defpackage.eknz
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.eknz
    public final /* synthetic */ void d() {
    }
}
