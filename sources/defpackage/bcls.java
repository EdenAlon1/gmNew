package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcls extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bclv b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcls(ffgu ffguVar, bclv bclvVar) {
        super(2, ffguVar);
        this.b = bclvVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bcls) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        bsob e = bsom.e();
        e.g(bclt.a);
        List f = e.b().f();
        if (!((aucm) this.b.d.b()).a()) {
            f.getClass();
            List arrayList = new ArrayList();
            enqv it = f.iterator();
            while (it.hasNext()) {
                E next = it.next();
                if (((bdfl) this.b.b.b()).k((ConversationIdType) next)) {
                    arrayList.add(next);
                }
            }
            f = arrayList;
        }
        bclv bclvVar = this.b;
        f.getClass();
        engw a = engq.a(f);
        this.a = 1;
        Object b = bclvVar.b(a, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bcls bclsVar = new bcls(ffguVar, this.b);
        bclsVar.c = obj;
        return bclsVar;
    }
}
