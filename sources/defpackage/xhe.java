package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.conversation.draft.EditingData;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhe extends alhh implements xhg {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/send/BugleMessageQueuedLogger");
    private final ffsk b;
    private final xgo c;
    private final xfu d;
    private final Optional e;
    private final Optional g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xhe(ffsk ffskVar, xgo xgoVar, xfu xfuVar, Optional optional, Optional optional2, ffbr ffbrVar, alcs alcsVar, Executor executor) {
        super(ffbrVar, alcsVar, executor);
        ffskVar.getClass();
        optional.getClass();
        ffbrVar.getClass();
        executor.getClass();
        this.b = ffskVar;
        this.c = xgoVar;
        this.d = xfuVar;
        this.e = optional;
        this.g = optional2;
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new BiConsumer() { // from class: xgz
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                eoji eojiVar = (eoji) obj;
                eqar eqarVar = (eqar) obj2;
                eojiVar.getClass();
                eqarVar.getClass();
                eojiVar.copyOnWrite();
                eojj eojjVar = (eojj) eojiVar.instance;
                eojj eojjVar2 = eojj.a;
                eojjVar.c = eqarVar;
                eojjVar.b = 7;
            }

            public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        };
    }

    public final Object b(xhu xhuVar, ffgu ffguVar) {
        cmju cmjuVar;
        EditingData editingData = xhuVar.f;
        if (editingData == null || (cmjuVar = (cmju) fflm.b(this.g)) == null) {
            return null;
        }
        Object b = cmjuVar.b(new cmjs(editingData.a), ffguVar);
        return b == ffhh.a ? b : (epwy) b;
    }

    public final List c(xhf xhfVar, xgv xgvVar) {
        Uri uri;
        List<xhp> list = xhfVar.a.b;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        for (xhp xhpVar : list) {
            if (!(xhpVar instanceof xho)) {
                Objects.toString(xhpVar);
                throw new IllegalArgumentException("Cannot create AttachmentInfo for pending ".concat(String.valueOf(xhpVar)));
            }
            xho xhoVar = (xho) xhpVar;
            doxs doxsVar = xhoVar.a;
            xgv xgvVar2 = null;
            if (!(doxsVar instanceof drli)) {
                uri = null;
            } else {
                if (!xhfVar.c.containsKey(doxsVar)) {
                    throw new IllegalArgumentException("Missing selected variation for ".concat(String.valueOf(doxsVar.fo())));
                }
                uri = (Uri) ffew.e(xhfVar.c, doxsVar);
            }
            String str = (String) xhfVar.d.get(doxsVar);
            List a2 = str != null ? this.c.a(str, xhfVar.b, true) : ffel.a;
            if (true == (xhoVar.a instanceof drni)) {
                xgvVar2 = xgvVar;
            }
            arrayList.add(ffdx.ad(ffdx.b(xfu.a(new xft(xhoVar, uri, xgvVar2))), a2));
        }
        return arrayList;
    }

    public final List d(xhu xhuVar, xgc xgcVar) {
        String str = xhuVar.a;
        if (str != null) {
            return this.c.a(str, xgcVar, false);
        }
        return null;
    }

    public final void e(final xhu xhuVar, final equc equcVar) {
        final ffji ffjiVar = new ffji() { // from class: xgx
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ajqb ajqbVar = (ajqb) obj;
                ajqbVar.getClass();
                if (xhu.this.e != null) {
                    ajqbVar.a(equcVar, new ajqc(bdhg.a, null));
                }
                return ffcu.a;
            }
        };
        this.e.ifPresent(new Consumer() { // from class: xgy
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.xhg
    public final void f(xhf xhfVar, List list, xgv xgvVar) {
        axol.k(this.b, null, new xhd(xhfVar, list, xgvVar, this, null), 3);
    }

    @Override // defpackage.xhg
    public final void g(xhf xhfVar, apcs apcsVar, xgv xgvVar) {
        apcsVar.getClass();
        axol.k(this.b, null, new xhb(xhfVar, apcsVar, xgvVar, this, null), 3);
    }
}
