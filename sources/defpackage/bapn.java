package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bapn extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bara b;
    final /* synthetic */ bdfy c;
    final /* synthetic */ bapo d;
    final /* synthetic */ epvo e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bapn(ffgu ffguVar, bara baraVar, bdfy bdfyVar, bapo bapoVar, epvo epvoVar) {
        super(2, ffguVar);
        this.b = baraVar;
        this.c = bdfyVar;
        this.d = bapoVar;
        this.e = epvoVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bapn) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        bara baraVar = this.b;
        cskc cskcVar = bara.a;
        ayzn ayznVar = (ayzn) baraVar.D.b();
        bdfy bdfyVar = this.c;
        bapo bapoVar = this.d;
        engw engwVar = bapoVar.b;
        ConversationIdType a = bdfyVar.a();
        boolean b = bdfyVar.b();
        ArrayList arrayList = new ArrayList(ffdx.n(engwVar, 10));
        Iterator<E> it = engwVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((aoku) it.next()).n());
        }
        elfl a2 = ayznVar.a(a, b, bapoVar.a, engq.a(ffdx.aa(arrayList)), this.e);
        a2.getClass();
        this.a = 1;
        Object c = fgfz.c(a2, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bapn bapnVar = new bapn(ffguVar, this.b, this.c, this.d, this.e);
        bapnVar.f = obj;
        return bapnVar;
    }
}
