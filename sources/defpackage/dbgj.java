package defpackage;

import android.content.Context;
import defpackage.dbgh;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbgj extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dbgh b;
    Object c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbgj(ffgu ffguVar, dbgh dbghVar) {
        super(2, ffguVar);
        this.b = dbghVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dbgj) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Class<dbgh.a> cls;
        Object obj2;
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            obj2 = this.c;
            cls = (Class) this.d;
            ffci.b(obj);
        } else {
            ffci.b(obj);
            dbgh dbghVar = this.b;
            cls = dbgh.a.class;
            this.d = cls;
            Context context = dbghVar.c;
            this.c = context;
            this.a = 1;
            obj = dbghVar.d.c(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
            obj2 = context;
        }
        return ((dbgh.a) ekhv.a((Context) obj2, cls, (eisx) obj)).fv();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dbgj dbgjVar = new dbgj(ffguVar, this.b);
        dbgjVar.d = obj;
        return dbgjVar;
    }
}
