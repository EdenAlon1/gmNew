package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bcpi {
    public static final Map a;
    public static final Set b;
    public static final Map c;
    private static final dtvy d;
    private static final dtzj e;
    private static final dtzj f;
    private static final dtzj g;

    static {
        bcdt bcdtVar = bcdt.a;
        Map map = bcdt.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!ffkj.e(entry.getKey(), bcds.c.a) && !ffkj.e(entry.getKey(), bcds.c.b)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        a = ffew.l(linkedHashMap);
        b = fffi.b(new bckm(bcds.c.b, PartsTable.d.b, bckf.b));
        String[] strArr = bqea.a;
        bqdv bqdvVar = new bqdv(bqea.a);
        bqdvVar.c(bqea.c.d);
        bqdvVar.d(new Function() { // from class: bcpf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqdz bqdzVar = (bqdz) obj;
                Map map2 = bcpi.a;
                bqdzVar.as(new dtzq("$V{J:convo_id_map} = $V", new Object[]{bqea.c.b, bckf.a.a}));
                return bqdzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtvy i = dtvz.i(bqdvVar.b(), bqea.c.c, bcba.c.g);
        ((dtrd) i).e = "convo_id_map";
        d = i;
        bqdv bqdvVar2 = new bqdv(bqea.a);
        bqdvVar2.c(bqea.c.d);
        bqdvVar2.d(new Function() { // from class: bcpg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqdz bqdzVar = (bqdz) obj;
                Map map2 = bcpi.a;
                bqdzVar.f(bckf.a.a);
                return bqdzVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        dtvz.i(bqdvVar2.b(), bqea.c.c, bcba.c.g);
        bcdp a2 = bcds.a();
        a2.z("conversationIdForPartQuery");
        a2.u();
        ((dtri) a2.a).u = "bp";
        bcax a3 = bcba.a();
        a3.u();
        dtvy i2 = dtvz.i(((bcax) a3.j(i)).b(), bcba.c.a, bcds.c.b);
        ((dtrd) i2).e = "bm";
        bcdo b2 = ((bcdp) a2.j(i2)).b();
        e = b2;
        dtzq dtzqVar = new dtzq("(SELECT bugle_id FROM ($V))", new Object[]{b2});
        f = dtzqVar;
        dtzq dtzqVar2 = new dtzq("($V)", new Object[]{1});
        g = dtzqVar2;
        bwat bwatVar = PartsTable.d;
        c = ffew.g(new ffcf(bwatVar.o, dtzqVar), new ffcf(bwatVar.P, dtzqVar2));
    }
}
