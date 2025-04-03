package defpackage;

import java.io.Closeable;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cajy extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cakc b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cajy(cakc cakcVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cakcVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cajy) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
            cakc cakcVar = this.b;
            ekzz f = eleg.f("DetailsPageE2eeInfoDataSource#loadData");
            try {
                this.c = f;
                this.a = 1;
                obj = cakcVar.e(ffskVar, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
                closeable = f;
            } catch (Throwable th3) {
                th = th3;
                closeable = f;
                throw th;
            }
        }
        ejug ejugVar = (ejug) obj;
        ffig.a(closeable, null);
        return ejugVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cajy cajyVar = new cajy(this.b, ffguVar);
        cajyVar.c = obj;
        return cajyVar;
    }
}
