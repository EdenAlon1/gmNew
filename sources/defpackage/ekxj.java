package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekxj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffjm b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekxj(ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ekxj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Closeable closeable;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            closeable = (Closeable) this.c;
            try {
                ffci.b(obj);
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    ffig.a(closeable, th);
                    throw th2;
                }
            }
        } else {
            ffci.b(obj);
            ffsk ffskVar = (ffsk) this.c;
            Closeable m = ekyf.m(ekzt.a);
            ffjm ffjmVar = this.b;
            try {
                this.c = m;
                this.a = 1;
                if (ffjmVar.a(ffskVar, this) == ffhhVar) {
                    return ffhhVar;
                }
                closeable = m;
            } catch (Throwable th3) {
                th = th3;
                closeable = m;
                throw th;
            }
        }
        ffig.a(closeable, null);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ekxj ekxjVar = new ekxj(this.b, ffguVar);
        ekxjVar.c = obj;
        return ekxjVar;
    }
}
