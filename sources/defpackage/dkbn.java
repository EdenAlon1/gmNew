package defpackage;

import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dkbn {
    public static dkbm i(ezez ezezVar, Optional optional) {
        String str = (String) optional.map(new Function() { // from class: dkbi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return emxe.a((String) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse("unknown");
        dkbb dkbbVar = new dkbb();
        dkbbVar.i(ezezVar);
        dkbbVar.c = 2;
        dkbbVar.h(UUID.randomUUID().toString());
        dkbbVar.g(str);
        dkbbVar.m(2);
        dkbbVar.f("");
        return dkbbVar;
    }

    public static String l(eyyw eyywVar) {
        return TextUtils.join(",", eyywVar.b);
    }

    public static dkbm m(int i) {
        String uuid = UUID.randomUUID().toString();
        dkbb dkbbVar = new dkbb();
        dkbbVar.i(ezez.RCS_PROVISIONING_UNKNOWN_STATE);
        dkbbVar.c = i;
        dkbbVar.h(uuid);
        dkbbVar.g(uuid);
        dkbbVar.m(2);
        dkbbVar.f("");
        return dkbbVar;
    }

    public abstract eyzd a();

    public abstract ezez b();

    public abstract Optional c();

    public abstract Optional d();

    public abstract String e();

    public abstract String f();

    public abstract String g();

    public abstract int h();

    public final enhk j() {
        final enhd enhdVar = new enhd();
        Map.EL.forEach(DesugarCollections.unmodifiableMap(a().f), new BiConsumer() { // from class: dkbj
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                String l = dkbn.l((eyyw) obj2);
                enhd.this.k((String) obj, l);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        return enhdVar.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String k(String str) {
        eyzd a = a();
        eyyw eyywVar = eyyw.a;
        eyhm eyhmVar = a.f;
        if (eyhmVar.containsKey(str)) {
            eyywVar = (eyyw) eyhmVar.get(str);
        }
        return l(eyywVar);
    }
}
