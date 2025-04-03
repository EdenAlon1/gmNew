package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbfp extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dbfy b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbfp(ffgu ffguVar, dbfy dbfyVar) {
        super(2, ffguVar);
        this.b = dbfyVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbfp) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            dbfy dbfyVar = this.b;
            elfl a = dbfyVar.f.a(dbfyVar.e);
            this.a = 1;
            obj = fgfz.c(a, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        List list = (List) obj;
        int size = list.size();
        list.getClass();
        String str = "KeyMaterials size: " + size + "\n***********************************\n\n" + ffdx.aA(list, "\n***********************************\n\n", null, null, dbfq.a, 30);
        dbfy.a.p("keyMaterial: \n\n".concat(str));
        return str;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dbfp dbfpVar = new dbfp(ffguVar, this.b);
        dbfpVar.c = obj;
        return dbfpVar;
    }
}
