package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekxk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ elat b;
    final /* synthetic */ ffjm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekxk(elat elatVar, ffjm ffjmVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = elatVar;
        this.c = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ekxk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Closeable closeable;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            closeable = (Closeable) this.d;
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
            ffsk ffskVar = (ffsk) this.d;
            elat elatVar = this.b;
            ffjm ffjmVar = this.c;
            Closeable m = ekyf.m(elatVar);
            try {
                this.d = m;
                this.a = 1;
                obj = ffjmVar.a(ffskVar, this);
                if (obj == ffhhVar) {
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
        return obj;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ekxk ekxkVar = new ekxk(this.b, this.c, ffguVar);
        ekxkVar.d = obj;
        return ekxkVar;
    }
}
