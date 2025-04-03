package defpackage;

import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azjr implements azfk {
    private final ffhd a;
    private final cbwj b;

    public azjr(ffhd ffhdVar, cbwj cbwjVar) {
        ffhdVar.getClass();
        cbwjVar.getClass();
        this.a = ffhdVar;
        this.b = cbwjVar;
    }

    @Override // defpackage.azfk
    public final Object a(List list, ffgu ffguVar) {
        return list.isEmpty() ? ffem.a : ffra.a(ekxi.a(this.a), new azjp(null, list, this), ffguVar);
    }

    @Override // defpackage.azfk
    public final Object b(final Map map, ffgu ffguVar) {
        final ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            azfn azfnVar = ((azfj) entry.getValue()).a;
            String[] strArr = azjm.a;
            azhy azhyVar = new azhy();
            azhyVar.b(azhr.a);
            azfl azflVar = (azfl) azfnVar;
            azhyVar.g(azflVar.c);
            azhyVar.c(azflVar.d);
            azff azffVar = azflVar.b;
            byte[] bArr = null;
            azhyVar.d(azffVar != null ? (String) azffVar.b : null);
            azhyVar.h(azflVar.e);
            azhyVar.e(azflVar.g);
            azhyVar.f(azflVar.h);
            eyee eyeeVar = azflVar.f;
            if (eyeeVar != null) {
                bArr = eyeeVar.I();
            }
            azhyVar.i(bArr);
            azhyVar.j(azcm.a((azhq) entry.getKey()));
            arrayList.add(azhyVar.a());
        }
        final ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry2 : map.entrySet()) {
            azcr a = azcm.a((azhq) entry2.getKey());
            Set<azfx> set = ((azfj) entry2.getValue()).b;
            ArrayList arrayList3 = new ArrayList(ffdx.n(set, 10));
            for (azfx azfxVar : set) {
                String[] strArr2 = azhc.a;
                azgh azghVar = new azgh();
                azghVar.c(a);
                azghVar.b(azfxVar.a);
                arrayList3.add(azghVar.a());
            }
            ffdx.w(arrayList2, arrayList3);
        }
        elfl b = this.b.b("GroupsTableOperations#insertGroup", new Runnable() { // from class: azjn
            @Override // java.lang.Runnable
            public final void run() {
                Object apply;
                azhv[] azhvVarArr = (azhv[]) arrayList.toArray(new azhv[0]);
                dtub.A(azjm.a(), 5, false, new BiConsumer() { // from class: azht
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        String[] strArr3 = azjm.a;
                    }

                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                    }
                }, (azhv[]) Arrays.copyOf(azhvVarArr, azhvVarArr.length));
                String[] strArr3 = azhc.a;
                azgv azgvVar = new azgv();
                azgvVar.f("GroupsTableOperations#insertGroup");
                final Map map2 = map;
                apply = new Function() { // from class: azjo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        azhb azhbVar = (azhb) obj;
                        Set keySet = map2.keySet();
                        ArrayList arrayList4 = new ArrayList(ffdx.n(keySet, 10));
                        Iterator it = keySet.iterator();
                        while (it.hasNext()) {
                            arrayList4.add(azcm.a((azhq) it.next()));
                        }
                        engr engrVar = new engr();
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            engrVar.h(String.valueOf(azcs.b((azcr) it2.next())));
                        }
                        azhbVar.aq(new dtrw("group_members.group_token", 3, azhb.at(engrVar.g()), false));
                        return azhbVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new azhb());
                azgvVar.b = new azha((azhb) apply);
                azgvVar.d();
                azge[] azgeVarArr = (azge[]) arrayList2.toArray(new azge[0]);
                dtub.A(azhc.a(), 5, false, new BiConsumer() { // from class: azgb
                    @Override // java.util.function.BiConsumer
                    public final void accept(Object obj, Object obj2) {
                        String[] strArr4 = azhc.a;
                    }

                    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                        return BiConsumer$CC.$default$andThen(this, biConsumer);
                    }
                }, (azge[]) Arrays.copyOf(azgeVarArr, azgeVarArr.length));
            }
        });
        b.getClass();
        Object c = fgfz.c(b, ffguVar);
        return c == ffhh.a ? c : ffcu.a;
    }
}
