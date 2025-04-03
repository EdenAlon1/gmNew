package defpackage;

import com.google.android.libraries.geller.portable.Geller;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dudg {
    public static final enru a = enru.c("com/google/android/libraries/geller/gellersync/GellerBatchSyncResultWriter");
    public static final enip b = new enpx(ezib.HOME_AUTOMATION_DISCOVERY);
    public final ducn c;
    public final Map d;
    public final Geller e;
    public final String f;
    public final ExecutorService g;
    public final ExecutorService h;

    public dudg(String str, Geller geller, ducn ducnVar, ExecutorService executorService, ExecutorService executorService2) {
        this.c = ducnVar;
        this.e = geller;
        this.f = str;
        this.g = executorService;
        this.h = executorService2;
        if (geller.e.l) {
            this.d = new ConcurrentHashMap();
        } else {
            this.d = new HashMap();
        }
    }

    public static eyoq b(int i, List list) {
        eync eyncVar;
        eyon eyonVar = (eyon) eyoq.a.createBuilder();
        if (i == 1) {
            eyonVar.copyOnWrite();
            eyoq eyoqVar = (eyoq) eyonVar.instance;
            eyoqVar.c = 1;
            eyoqVar.b |= 1;
        } else if (i == 3) {
            eyonVar.copyOnWrite();
            eyoq eyoqVar2 = (eyoq) eyonVar.instance;
            eyoqVar2.c = 2;
            eyoqVar2.b |= 1;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dugd dugdVar = (dugd) it.next();
            eynb eynbVar = (eynb) eync.a.createBuilder();
            String b2 = dugdVar.b();
            eynbVar.copyOnWrite();
            eync eyncVar2 = (eync) eynbVar.instance;
            eyncVar2.b |= 2;
            eyncVar2.d = b2;
            if (dugdVar.a().g()) {
                long longValue = ((Long) dugdVar.a().c()).longValue();
                eynbVar.copyOnWrite();
                eync eyncVar3 = (eync) eynbVar.instance;
                eyncVar3.b |= 1;
                eyncVar3.c = longValue;
                eyncVar = (eync) eynbVar.build();
            } else {
                eyncVar = (eync) eynbVar.build();
            }
            eyonVar.copyOnWrite();
            eyoq eyoqVar3 = (eyoq) eyonVar.instance;
            eyncVar.getClass();
            eygr eygrVar = eyoqVar3.d;
            if (!eygrVar.c()) {
                eyoqVar3.d = eyfy.mutableCopy(eygrVar);
            }
            eyoqVar3.d.add(eyncVar);
        }
        return (eyoq) eyonVar.build();
    }

    public final dufr a(ezib ezibVar) {
        if (this.e.e.l) {
            return (dufr) Map.EL.computeIfAbsent(this.d, ezibVar, new Function() { // from class: ducv
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    enru enruVar = dudg.a;
                    return new ducl();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        }
        if (!this.d.containsKey(ezibVar)) {
            this.d.put(ezibVar, new ducl());
        }
        return (dufr) this.d.get(ezibVar);
    }
}
