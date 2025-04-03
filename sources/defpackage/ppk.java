package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ppk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ ffjm b;
    final /* synthetic */ kfb c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ppk(ffjm ffjmVar, kfb kfbVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = ffjmVar;
        this.c = kfbVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ppk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                ffsk ffskVar = (ffsk) this.d;
                ffjm ffjmVar = this.b;
                this.a = 1;
                obj = ffjmVar.a(ffskVar, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            this.c.b(obj);
        } catch (CancellationException unused) {
            this.c.d();
        } catch (Throwable th) {
            this.c.c(th);
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ppk ppkVar = new ppk(this.b, this.c, ffguVar);
        ppkVar.d = obj;
        return ppkVar;
    }
}
