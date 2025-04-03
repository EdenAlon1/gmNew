package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eltt implements elpf {
    final /* synthetic */ eltu a;
    final /* synthetic */ elmy b;

    public eltt(eltu eltuVar, elmy elmyVar) {
        this.b = elmyVar;
        this.a = eltuVar;
    }

    @Override // defpackage.elpf
    public final void a(Throwable th) {
        this.b.a(1);
        throw new IllegalStateException("unhandled exception in request processing", th);
    }

    @Override // defpackage.elpf
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Object apply;
        elod elodVar = (elod) obj;
        elzv elzvVar = (elzv) emaa.a.createBuilder();
        elodVar.b();
        elzvVar.copyOnWrite();
        ((emaa) elzvVar.instance).d = false;
        Object a = elodVar.a();
        if (a != null) {
            eltu eltuVar = this.a;
            elzw elzwVar = (elzw) elzz.a.createBuilder();
            for (Map.Entry entry : eltuVar.b.d.entrySet()) {
                apply = afg$$ExternalSyntheticApiModelOutline0.m105m(entry.getValue()).apply(a);
                List list = (List) apply;
                if (!list.isEmpty()) {
                    elzx elzxVar = (elzx) elzy.a.createBuilder();
                    String str = (String) entry.getKey();
                    elzxVar.copyOnWrite();
                    elzy elzyVar = (elzy) elzxVar.instance;
                    str.getClass();
                    elzyVar.b = str;
                    elzxVar.copyOnWrite();
                    elzy elzyVar2 = (elzy) elzxVar.instance;
                    eygr eygrVar = elzyVar2.c;
                    if (!eygrVar.c()) {
                        elzyVar2.c = eyfy.mutableCopy(eygrVar);
                    }
                    eydl.addAll(list, elzyVar2.c);
                    elzy elzyVar3 = (elzy) elzxVar.build();
                    elzwVar.copyOnWrite();
                    elzz elzzVar = (elzz) elzwVar.instance;
                    elzyVar3.getClass();
                    eygr eygrVar2 = elzzVar.b;
                    if (!eygrVar2.c()) {
                        elzzVar.b = eyfy.mutableCopy(eygrVar2);
                    }
                    elzzVar.b.add(elzyVar3);
                }
            }
            elzz elzzVar2 = (elzz) elzwVar.build();
            elzvVar.copyOnWrite();
            emaa emaaVar = (emaa) elzvVar.instance;
            elzzVar2.getClass();
            emaaVar.c = elzzVar2;
            emaaVar.b = 3;
        }
        elmy elmyVar = this.b;
        elmyVar.a.o(elnr.a("app_action_result", (emaa) elzvVar.build()));
    }
}
