package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.HashMap;
import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afaz extends dtrs {
    public static final /* synthetic */ int c = 0;
    public final Consumer a;
    public final HashMap b = new HashMap();
    private final ffbr d;

    public afaz(Consumer consumer, ffbr ffbrVar) {
        this.a = consumer;
        this.d = ffbrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void f(duaj duajVar, Consumer consumer) {
        bvvn e = ParticipantsTable.e();
        e.z("executeOnCursor");
        e.e(new Function() { // from class: afay
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvtg bvtgVar = (bvtg) obj;
                int i = afaz.c;
                return new bvth[]{bvtgVar.a, bvtgVar.r};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        enqv it = duajVar.e.iterator();
        while (it.hasNext()) {
            e.k((bvvs) ((duap) it.next()));
        }
        bvti bvtiVar = (bvti) e.b().o();
        while (bvtiVar.moveToNext()) {
            try {
                consumer.o(bvtiVar);
            } catch (Throwable th) {
                try {
                    bvtiVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bvtiVar.close();
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void b(dtyq dtyqVar, dtuk dtukVar) {
        if (this.b.isEmpty()) {
            return;
        }
        duaj d = dtukVar.d();
        final HashSet hashSet = new HashSet();
        d.getClass();
        f(d, new Consumer() { // from class: afau
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                bvti bvtiVar = (bvti) obj;
                if (TextUtils.isEmpty((String) afaz.this.b.get(bvtiVar.p())) != TextUtils.isEmpty(bvtiVar.q())) {
                    hashSet.add(bvtiVar.p());
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.b.clear();
        if (hashSet.isEmpty()) {
            return;
        }
        final engw n = engw.n(hashSet);
        ((dtuu) this.d.b()).g(new dtut() { // from class: afav
            @Override // defpackage.dtut
            public final ekzz a() {
                int i = afaz.c;
                return eleg.f("CCL::onChangeInTransaction::runAfterCommit");
            }
        }, String.valueOf(n.hashCode()), new Runnable() { // from class: afaw
            @Override // java.lang.Runnable
            public final void run() {
                afaz.this.a.o(n);
            }
        });
    }

    @Override // defpackage.dtrs
    public final /* bridge */ /* synthetic */ void c(dtyq dtyqVar, dtuk dtukVar) {
        if (aewg.h()) {
            this.b.clear();
            duaj d = dtukVar.d();
            if (d == null || !d.n("lookup_key")) {
                return;
            }
            f(d, new Consumer() { // from class: afax
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    bvti bvtiVar = (bvti) obj;
                    String p = bvtiVar.p();
                    String q = bvtiVar.q();
                    if (q == null) {
                        q = "";
                    }
                    afaz.this.b.put(p, q);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }
}
