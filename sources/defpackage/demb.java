package defpackage;

import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class demb extends ffhv implements ffjm {
    int a;
    final /* synthetic */ deme b;
    final /* synthetic */ WorkerParameters c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public demb(deme demeVar, WorkerParameters workerParameters, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = demeVar;
        this.c = workerParameters;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((demb) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                deme demeVar = this.b;
                this.a = 1;
                obj = demeVar.g(this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            if (((Boolean) obj).booleanValue()) {
                return new ppp();
            }
            dely.b("Marking phone verification for retry");
            return this.b.c(this.c);
        } catch (Throwable th) {
            dely.c("Error thrown. Retrying", th);
            return this.b.c(this.c);
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new demb(this.b, this.c, ffguVar);
    }
}
