package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjwv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjwz b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjwv(ffgu ffguVar, cjwz cjwzVar) {
        super(2, ffguVar);
        this.b = cjwzVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjwv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        if (this.a != 0) {
            ffci.b(obj);
        } else {
            ffci.b(obj);
            cjwz cjwzVar = this.b;
            this.a = 1;
            obj = cjwzVar.c.invoke(this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        Iterator it = ((Iterable) obj).iterator();
        int i = 0;
        while (it.hasNext()) {
            i += cjwt.b(cjwt.a((bseh) it.next()));
        }
        return new Integer(i);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        cjwv cjwvVar = new cjwv(ffguVar, this.b);
        cjwvVar.c = obj;
        return cjwvVar;
    }
}
