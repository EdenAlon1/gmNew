package defpackage;

import android.content.Context;
import android.text.TextUtils;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciyf {
    public static final entd a = entd.c("BugleNotifications");
    public final Context b;
    public final errl c;
    public final errl d;
    public final cjbl e;
    public final cjbb f;
    public final cjad g;
    public final cjcb h;
    public final cjax i;
    public final boolean j;

    public ciyf(Context context, errl errlVar, errl errlVar2, cjbl cjblVar, cjbb cjbbVar, cjad cjadVar, cjcb cjcbVar, cjax cjaxVar, boolean z) {
        this.b = context;
        this.c = errlVar;
        this.d = errlVar2;
        this.e = cjblVar;
        this.f = cjbbVar;
        this.g = cjadVar;
        this.h = cjcbVar;
        this.i = cjaxVar;
        this.j = z;
    }

    public static String a(cjax cjaxVar) {
        return cjaxVar == null ? "" : b(DesugarCollections.unmodifiableMap(cjaxVar.c));
    }

    public static String b(Map map) {
        return map.isEmpty() ? "" : TextUtils.join(",", (Iterable) Collection.EL.stream(map.entrySet()).map(new Function() { // from class: ciya
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                entd entdVar = ciyf.a;
                return ((String) entry.getKey()) + ":" + ((cjap) entry.getValue()).c;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new ciyb())));
    }

    public static Map c(enhk enhkVar, enhk enhkVar2) {
        HashMap hashMap = new HashMap(enhkVar);
        enqu listIterator = enhkVar2.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            String str = (String) entry.getKey();
            if (hashMap.containsKey(str)) {
                long j = ((cjap) entry.getValue()).c;
                cjap cjapVar = (cjap) hashMap.get(str);
                cjapVar.getClass();
                long j2 = cjapVar.c;
                cjap cjapVar2 = (cjap) hashMap.get(str);
                cjapVar2.getClass();
                cjao cjaoVar = (cjao) cjapVar2.toBuilder();
                long min = Math.min(j2, j);
                cjaoVar.copyOnWrite();
                cjap cjapVar3 = (cjap) cjaoVar.instance;
                cjapVar3.b |= 1;
                cjapVar3.c = min;
                hashMap.put(str, (cjap) cjaoVar.build());
            } else {
                hashMap.put(str, (cjap) entry.getValue());
            }
        }
        return hashMap;
    }
}
