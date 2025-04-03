package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpdo implements ffxy {
    final /* synthetic */ dpds a;

    public dpdo(dpds dpdsVar) {
        this.a = dpdsVar;
    }

    @Override // defpackage.ffxy
    public final /* bridge */ /* synthetic */ Object fQ(Object obj, ffgu ffguVar) {
        dpdf dpdfVar = (dpdf) obj;
        if (dpdfVar instanceof dpde) {
            dpde dpdeVar = (dpde) dpdfVar;
            this.a.j += ((ByteBuffer) dpdeVar.b).remaining();
            faem faemVar = this.a.h;
            if (faemVar == null) {
                ffkj.c("processor");
                faemVar = null;
            }
            faemVar.a((ByteBuffer) dpdeVar.b, ernd.a(dpdeVar.a), this.a.d.c);
        }
        return ffcu.a;
    }
}
