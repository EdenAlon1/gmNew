package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjsj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjsn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjsj(ffgu ffguVar, cjsn cjsnVar) {
        super(2, ffguVar);
        this.b = cjsnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjsj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        eygr eygrVar;
        ewrw ewrwVar;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            ListenableFuture b = ((cjui) this.b.b).d.b();
            b.getClass();
            this.a = 1;
            obj = fgfz.c(b, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ewrq ewrqVar = (ewrq) ((emxc) obj).f();
        if (ewrqVar == null || (eygrVar = ewrqVar.b) == null || (ewrwVar = (ewrw) ffdx.M(eygrVar)) == null) {
            return null;
        }
        eisi eisiVar = ewrwVar.c;
        return eisiVar == null ? eisi.a : eisiVar;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjsj cjsjVar = new cjsj(ffguVar, this.b);
        cjsjVar.c = obj;
        return cjsjVar;
    }
}
