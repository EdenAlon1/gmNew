package defpackage;

import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeij extends odt {
    public static final cskc a = cskc.g("Bugle", "ConversationListDataSources");
    public static final enru b = enru.c("com/google/android/apps/messaging/home/list/ConversationListDataSources");
    public final cqoh c;
    public final alrv d;
    public final aemg e;
    public final elbx f;
    public final errl g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final cgix k;
    public final aeze m;
    public final ffbr n;
    public ofe o;
    public final int t;
    elfl u;
    public elfl v;
    private final errl z;
    public boolean p = true;
    public boolean q = true;
    public boolean r = false;
    public aeii s = aeii.NOT_STARTED;
    public Map w = new HashMap();
    public final AtomicLong x = new AtomicLong(0);
    final cfup y = cfvl.e(cfvl.b, "conversation_list_data_source_invalidation_frequency_log_limit", 33);
    public final AtomicReference l = new AtomicReference(SuperSortLabel.UNKNOWN);

    public aeij(cqoh cqohVar, alrv alrvVar, aemg aemgVar, elbx elbxVar, errl errlVar, errl errlVar2, aeze aezeVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, cgix cgixVar, int i) {
        this.c = cqohVar;
        this.d = alrvVar;
        this.e = aemgVar;
        this.f = elbxVar;
        this.g = errlVar2;
        this.h = ffbrVar;
        this.j = ffbrVar3;
        this.k = cgixVar;
        this.z = errlVar;
        this.t = i;
        this.m = aezeVar;
        this.n = ffbrVar4;
        this.i = ffbrVar2;
    }

    public static long a(aeho aehoVar) {
        return aiqn.a(aehoVar.c(), aehoVar.a());
    }

    public static String b(dtuk dtukVar) {
        StringBuilder sb = new StringBuilder("TRIGGER: ");
        if (dtukVar.d() != null) {
            sb.append("UPDATE ");
            duaj d = dtukVar.d();
            d.getClass();
            sb.append(d.getClass());
            sb.append(" COLUMNS MODIFIED ");
            duaj d2 = dtukVar.d();
            d2.getClass();
            sb.append(Arrays.toString(d2.p()));
        }
        if (dtukVar.b() != null) {
            sb.append("INSERT ");
            dtro b2 = dtukVar.b();
            b2.getClass();
            sb.append(b2.getClass());
        }
        if (dtukVar.c() != null) {
            sb.append("INSERT-FROM-SQL ");
            dtyq c = dtukVar.c();
            c.getClass();
            sb.append(c.toString());
        }
        if (dtukVar.a() != null) {
            sb.append("BULK-INSERT ");
            dtro[] a2 = dtukVar.a();
            a2.getClass();
            for (dtro dtroVar : a2) {
                sb.append(dtroVar.toString());
                sb.append(";\n");
            }
        }
        if (dtukVar.e() != null) {
            sb.append("DELETE ");
            duap e = dtukVar.e();
            e.getClass();
            sb.append(e.toString());
        }
        return sb.toString();
    }

    public final void c() {
        ofe ofeVar = this.o;
        if (ofeVar != null) {
            ofeVar.c();
        }
    }

    public final void d(final List list) {
        this.z.submit(new Runnable() { // from class: aehz
            @Override // java.lang.Runnable
            public final void run() {
                Map map = (Map) Collection.EL.stream(list).collect(Collectors.groupingBy(new Function() { // from class: bdue
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((btrw) obj).l();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }));
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((ConversationIdType) entry.getKey()).b()) {
                        csjb e = bduq.a.e();
                        e.G(((List) entry.getValue()).size());
                        e.I("annotations with null conversationId");
                        e.r();
                    } else {
                        bduq bduqVar = new bduq();
                        bduqVar.d((List) entry.getValue());
                        hashMap.put((ConversationIdType) entry.getKey(), bduqVar);
                    }
                }
                aeij aeijVar = aeij.this;
                aeijVar.w = hashMap;
                if (aeijVar.o != null) {
                    ensk h = aeij.b.h();
                    h.Y(ente.a, "ConversationListDataSources");
                    ((enrr) ((enrr) h).h("com/google/android/apps/messaging/home/list/ConversationListDataSources", "setAnnotations", 389, "ConversationListDataSources.java")).q("setAnnotations invalidate data source");
                    aeijVar.o.c();
                }
            }
        });
    }

    public final void e(aekq aekqVar) {
        this.m.g = aekqVar;
    }

    public final void f() {
        sth.c(this.c);
    }
}
