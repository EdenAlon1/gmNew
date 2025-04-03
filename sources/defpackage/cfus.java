package defpackage;

import j$.util.Collection;
import j$.util.Map;
import j$.util.Objects;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfus {
    private final ertc a;

    public cfus(ertc ertcVar) {
        this.a = ertcVar;
    }

    public final String a() {
        return b(false);
    }

    public final String b(final boolean z) {
        ArrayList arrayList;
        final StringBuilder sb = new StringBuilder();
        ecwh ecwhVar = cfvl.a;
        cfup cfupVar = cful.a;
        synchronized (cfvl.d) {
            arrayList = new ArrayList(cfvl.e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (arrayList.isEmpty()) {
            sb2.append("No phenotype keys/values");
        } else {
            Collections.sort(arrayList, new cfvm());
            for (int i = 0; i < arrayList.size(); i++) {
                cfva cfvaVar = (cfva) arrayList.get(i);
                Object e = cfvaVar.e();
                boolean equals = Objects.equals(e, cfvaVar.f());
                String j = cfvaVar.j();
                if (z && j != null && j.startsWith("bugle_phenotype__")) {
                    j = j.substring(17);
                }
                cfvl.A(sb2, z, (true != equals ? '*' : ' ') + j, e);
            }
        }
        String sb3 = sb2.toString();
        if (sb3.endsWith("\n")) {
            sb.append(sb3);
        }
        ertc ertcVar = this.a;
        final enhd enhdVar = new enhd();
        for (String str : ertcVar.a.values()) {
            if (!str.isEmpty()) {
                enhdVar.k(str, Boolean.valueOf(ertcVar.c.a(str)));
            }
        }
        Map.EL.forEach(ertcVar.b, new BiConsumer() { // from class: ertb
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                Object b = ((ffbr) obj2).b();
                enhd.this.k((String) obj, b);
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        Collection.EL.stream(enhdVar.c().entrySet()).sorted(new cfur()).forEach(new Consumer() { // from class: cfuq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                Map.Entry entry = (Map.Entry) obj;
                String valueOf = String.valueOf((String) entry.getKey());
                cfvl.A(sb, z, "@".concat(valueOf), entry.getValue());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        String sb4 = sb.toString();
        return sb4.isEmpty() ? "No phenotype keys/values" : sb4;
    }
}
