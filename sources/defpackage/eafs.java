package defpackage;

import android.content.Context;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eafs extends ffhv implements ffjm {
    Object a;
    Object b;
    int c;
    final /* synthetic */ eaft d;
    final /* synthetic */ easy e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eafs(eaft eaftVar, easy easyVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.d = eaftVar;
        this.e = easyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eafs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object c;
        enqu enquVar;
        Object valueOf;
        Object a;
        ffhh ffhhVar = ffhh.a;
        if (this.c != 0) {
            Object obj2 = this.b;
            c = this.a;
            try {
                ffci.b(obj);
                enquVar = obj2;
            } catch (Exception e) {
                e = e;
                return new eafi(e);
            }
        } else {
            ffci.b(obj);
            try {
                eaft eaftVar = this.d;
                entd entdVar = eaft.a;
                c = eaftVar.b.c(this.e);
                enquVar = ((enpd) this.d.e).listIterator();
            } catch (eago e2) {
                e = e2;
                return new eafi(e);
            }
        }
        while (enquVar.hasNext()) {
            eafr eafrVar = (eafr) enquVar.next();
            this.a = c;
            this.b = enquVar;
            this.c = 1;
            if (eafrVar.a() == ffhhVar) {
                return ffhhVar;
            }
        }
        eaft eaftVar2 = this.d;
        entd entdVar2 = eaft.a;
        Context context = eaftVar2.d;
        if (c != null) {
            try {
                valueOf = Long.valueOf(((eagt) c).e());
            } catch (Throwable th) {
                a = ffci.a(th);
            }
        } else {
            valueOf = "device_level";
        }
        Objects.toString(valueOf);
        a = Boolean.valueOf(context.deleteDatabase(valueOf.toString().concat("_per_account_gnp_room.db")));
        eafl a2 = eafm.a(a);
        if (a2 instanceof eafo) {
            a2 = new eafo(ffcu.a);
        } else if (!(a2 instanceof eafh)) {
            throw new ffcd();
        }
        if (a2 instanceof eafh) {
            ((ensz) ((ensz) eaft.a.j()).g(((eafh) a2).a())).q("Failed to delete per account Room database.");
        }
        eaft eaftVar3 = this.d;
        entd entdVar3 = eaft.a;
        return eaftVar3.b.a(((eagt) c).s()) != 1 ? new eafi(new Exception("Failed deleting account")) : new eafo(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eafs(this.d, this.e, ffguVar);
    }
}
