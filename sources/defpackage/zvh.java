package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zvh extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ zvj c;
    final /* synthetic */ alxr d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvh(zvj zvjVar, alxr alxrVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = zvjVar;
        this.d = alxrVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zvh) c((ffxy) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [ffxy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [ffxy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.List] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ?? r2;
        ArrayList arrayList;
        List b;
        String n;
        Object e;
        ffhh ffhhVar = ffhh.a;
        int i = this.b;
        if (i == 0) {
            ffci.b(obj);
            r2 = (ffxy) this.e;
            arrayList = new ArrayList();
            zvj zvjVar = this.c;
            alya d = this.d.d();
            if (d instanceof alxp) {
                b = zvjVar.h(((alxp) d).a());
            } else {
                if (!(d instanceof alyn)) {
                    throw new UnsupportedOperationException();
                }
                aqux c = ((alyn) d).c();
                String string = zvjVar.a.getString(R.string.message_metatext_sent_by_you);
                string.getClass();
                aoku aokuVar = (aoku) fflm.b(c.m());
                String ad = (aokuVar == null || (n = aokuVar.n()) == null) ? null : ffpc.ad(n, 4);
                if (ad == null) {
                    ad = c.p();
                }
                b = ffdx.b(new dntl(string, null, null, false, ad, null, true, false, 174));
            }
            Iterator it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(((dntl) it.next()).a);
            }
            zvj zvjVar2 = this.c;
            alxr alxrVar = this.d;
            this.e = arrayList;
            this.a = r2;
            this.b = 1;
            alya d2 = alxrVar.d();
            if (d2 instanceof alxp) {
                e = zvjVar2.c(((alxp) d2).a());
            } else {
                if (!(d2 instanceof alyn)) {
                    throw new UnsupportedOperationException();
                }
                e = zvjVar2.e(((alyn) d2).c(), this);
            }
            if (e == ffhhVar) {
                return ffhhVar;
            }
        } else {
            if (i != 1) {
                ffci.b(obj);
                return ffcu.a;
            }
            r2 = this.a;
            ?? r3 = (List) this.e;
            ffci.b(obj);
            arrayList = r3;
            e = obj;
        }
        zvj zvjVar3 = this.c;
        alxr alxrVar2 = this.d;
        zic zicVar = new zic((dntg) e, arrayList, zvjVar3.g(alxrVar2), ffdx.b(alxrVar2.v() ? dmzz.bZ : dmzz.ca));
        this.e = null;
        this.a = null;
        this.b = 2;
        if (r2.fQ(zicVar, this) == ffhhVar) {
            return ffhhVar;
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        zvh zvhVar = new zvh(this.c, this.d, ffguVar);
        zvhVar.e = obj;
        return zvhVar;
    }
}
