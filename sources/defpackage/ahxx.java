package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahxx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ xhu b;
    final /* synthetic */ ahyk c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahxx(xhu xhuVar, ahyk ahykVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = xhuVar;
        this.c = ahykVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahxx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
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
            xhu xhuVar = this.b;
            ahyk ahykVar = this.c;
            ekzz f = eleg.f("MultiShare SendButtonUiAdapterImpl#createAttachments");
            try {
                List<xhp> list = xhuVar.b;
                ArrayList<xho> arrayList = new ArrayList();
                for (xhp xhpVar : list) {
                    xho xhoVar = xhpVar instanceof xho ? (xho) xhpVar : null;
                    if (xhoVar != null) {
                        arrayList.add(xhoVar);
                    }
                }
                ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
                for (xho xhoVar2 : arrayList) {
                    arrayList2.add(ffra.b(ffskVar, ekxi.a(ffhe.a), ffsm.a, new ahxw(null, ahykVar, xhoVar2)));
                }
                this.d = f;
                this.a = 1;
                obj = ffqv.a(arrayList2, this);
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
        engw a = engq.a((Collection) obj);
        ffig.a(closeable, null);
        return a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ahxx ahxxVar = new ahxx(this.b, this.c, ffguVar);
        ahxxVar.d = obj;
        return ahxxVar;
    }
}
