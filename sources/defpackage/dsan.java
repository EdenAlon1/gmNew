package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsan extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dsao b;
    final /* synthetic */ Object c;
    final /* synthetic */ String d;
    final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsan(dsao dsaoVar, Object obj, String str, int i, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = dsaoVar;
        this.c = obj;
        this.d = str;
        this.e = i;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsan) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                ffjo e = this.b.e();
                Object obj2 = this.c;
                String str = this.d;
                Integer num = new Integer(this.e);
                this.a = 1;
                obj = e.a(obj2, str, num, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            Iterable iterable = (Iterable) obj;
            ffji d = this.b.d();
            ArrayList arrayList = new ArrayList(ffdx.n(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(d.invoke(it.next()));
            }
            return arrayList;
        } catch (IOException e2) {
            ((enrr) ((enrr) dsao.c.i()).g(e2).h("com/google/android/libraries/compose/proxy/ui/search/SearchSuggestionsSource$provideSuggestions$3$1", "invokeSuspend", 34, "SearchSuggestionsSource.kt")).q("Unable to fetch search rows.");
            return ffel.a;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dsan(this.b, this.c, this.d, this.e, ffguVar);
    }
}
