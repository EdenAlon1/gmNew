package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cevr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cevt b;
    final /* synthetic */ ceze c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cevr(ffgu ffguVar, cevt cevtVar, ceze cezeVar) {
        super(2, ffguVar);
        this.b = cevtVar;
        this.c = cezeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cevr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Closeable closeable;
        Throwable th;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            closeable = (Closeable) this.d;
            try {
                ffci.b(obj);
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    ffig.a(closeable, th);
                    throw th3;
                }
            }
        } else {
            ffci.b(obj);
            ekzz f = eleg.f("WorkQueueBatchingImpl#schedulingDeferred");
            try {
                elfl a = this.b.b.a(this.c);
                a.getClass();
                this.d = f;
                this.a = 1;
                if (fgfz.c(a, this) == ffhhVar) {
                    return ffhhVar;
                }
                closeable = f;
            } catch (Throwable th4) {
                closeable = f;
                th = th4;
                throw th;
            }
        }
        ffig.a(closeable, null);
        return true;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cevr cevrVar = new cevr(ffguVar, this.b, this.c);
        cevrVar.d = obj;
        return cevrVar;
    }
}
