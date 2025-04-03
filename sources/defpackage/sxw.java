package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sxw extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ sxx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxw(sxx sxxVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = sxxVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        sxw sxwVar = new sxw(this.c, (ffgu) obj3);
        sxwVar.a = (alxj) obj;
        sxwVar.b = (engw) obj2;
        return sxwVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [alxj, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r8 = this.a;
        Object obj2 = this.b;
        boolean z = false;
        if (r8.b() == alxi.GROUP) {
            HashSet hashSet = new HashSet(this.c.b.keySet());
            enqv it = ((engw) obj2).iterator();
            it.getClass();
            boolean z2 = false;
            while (it.hasNext()) {
                ResolvedRecipient resolvedRecipient = (ResolvedRecipient) it.next();
                if (resolvedRecipient.z()) {
                    if (!ffkj.e(this.c.b.get(resolvedRecipient.F()), true)) {
                        z2 = true;
                    }
                }
                this.c.b.put(resolvedRecipient.F(), Boolean.valueOf(resolvedRecipient.z()));
                hashSet.remove(resolvedRecipient.F());
            }
            Iterator it2 = hashSet.iterator();
            it2.getClass();
            while (it2.hasNext()) {
                this.c.b.remove((aqkv) it2.next());
            }
            if (z2) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
