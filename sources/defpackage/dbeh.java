package defpackage;

import android.content.Context;
import defpackage.dbed;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbeh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dbed b;
    Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbeh(ffgu ffguVar, dbed dbedVar) {
        super(2, ffguVar);
        this.b = dbedVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbeh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Class<dbed.a> cls;
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            obj2 = this.c;
            cls = (Class) this.d;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            dbed dbedVar = this.b;
            cls = dbed.a.class;
            this.d = cls;
            Context context = dbedVar.c;
            this.c = context;
            this.a = 1;
            obj = dbedVar.d.c(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            obj2 = context;
        }
        return ((dbed.a) ekhv.a((Context) obj2, cls, (eisx) obj)).fu();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dbeh dbehVar = new dbeh(ffguVar, this.b);
        dbehVar.d = obj;
        return dbehVar;
    }
}
