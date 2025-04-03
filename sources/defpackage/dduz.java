package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.ArrayMap;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchResult;
import j$.util.Collection;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dduz extends ddsw {
    public ddqu i;
    public final ffbr j;
    public final ddpl k;
    public enhk l;
    public final AtomicInteger m;
    private final lkr n;
    private final ddwg o;
    private final ddql p;
    private final ffbr q;

    public dduz(Context context, lkr lkrVar, ffbr ffbrVar, ddpl ddplVar, ddql ddqlVar, ddwg ddwgVar, ffbr ffbrVar2) {
        super(context, context.getResources().getDimensionPixelSize(R.dimen.zero_state_search_video_corner_radius));
        this.m = new AtomicInteger(0);
        this.n = lkrVar;
        this.j = ffbrVar;
        this.k = ddplVar;
        this.p = ddqlVar;
        this.o = ddwgVar;
        this.q = ffbrVar2;
    }

    @Override // defpackage.ddsw
    public final int F(boolean z) {
        return z ? 6 : 4;
    }

    @Override // defpackage.ddsw
    public final void G(List list) {
        efbd.c();
        ekzz f = eleg.f("VideosAdapter#updateResults");
        try {
            super.G(list);
            this.l = (enhk) Collection.EL.stream(list).collect(endq.b(new Function() { // from class: ddus
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Uri h = ((MediaSearchResult) obj).h();
                    h.getClass();
                    return h;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new Function() { // from class: ddut
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new llg();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }, new BinaryOperator() { // from class: dduu
                public final /* synthetic */ BiFunction andThen(Function function) {
                    return BiFunction$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.BiFunction
                public final Object apply(Object obj, Object obj2) {
                    return (llg) obj;
                }
            }));
            final int incrementAndGet = this.m.incrementAndGet();
            ddql ddqlVar = this.p;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final MediaSearchResult mediaSearchResult = (MediaSearchResult) it.next();
                final ddqo ddqoVar = (ddqo) ddqlVar;
                arrayList.add(((ddqo) ddqlVar).c.submit(new Callable() { // from class: ddqm
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        long j;
                        ctee cteeVar = new ctee(ddqo.this.b);
                        MediaSearchResult mediaSearchResult2 = mediaSearchResult;
                        Uri h = mediaSearchResult2.h();
                        h.getClass();
                        try {
                            try {
                                cteeVar.c(mediaSearchResult2.h());
                                j = cteeVar.d(0L);
                            } catch (Throwable th) {
                                cteeVar.b();
                                throw th;
                            }
                        } catch (IOException | NumberFormatException e) {
                            ensz enszVar = (ensz) ((ensz) ddqo.a.j()).g(e);
                            enszVar.Y(ddoa.d, h);
                            ((ensz) enszVar.h("com/google/android/apps/messaging/ui/search/presenter/VideoDurationProviderImpl", "getVideoDurations", 75, "VideoDurationProviderImpl.java")).q("Unable to calculate video duration.");
                            j = -1;
                        }
                        cteeVar.b();
                        return Pair.create(h, Long.valueOf(j));
                    }
                }));
            }
            erqt.r(erqc.o(erny.f(erqc.o(erqt.e(arrayList)), new emwl() { // from class: ddqn
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    List<Pair> list2 = (List) obj;
                    entd entdVar = ddqo.a;
                    ArrayMap arrayMap = new ArrayMap();
                    if (list2 != null) {
                        for (Pair pair : list2) {
                            if (pair != null && ((Long) pair.second).longValue() != -1) {
                                arrayMap.put((Uri) pair.first, (Long) pair.second);
                            }
                        }
                    }
                    return arrayMap;
                }
            }, erpp.a)), axnw.c(new Consumer() { // from class: dduv
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    int i = incrementAndGet;
                    dduz dduzVar = dduz.this;
                    Map map = (Map) obj;
                    if (i != dduzVar.m.get() || map == null || map.isEmpty()) {
                        return;
                    }
                    for (Map.Entry entry : map.entrySet()) {
                        if (entry.getValue() != null) {
                            llg llgVar = (llg) dduzVar.l.get(entry.getKey());
                            llgVar.getClass();
                            llgVar.j((Long) entry.getValue());
                        }
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), (Executor) this.q.b());
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vk
    public final /* bridge */ /* synthetic */ wr e(ViewGroup viewGroup, int i) {
        final dduy dduyVar = new dduy(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zero_state_search_video_result_item, viewGroup, false));
        dduyVar.u.setOnClickListener(new View.OnClickListener() { // from class: dduw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dduz dduzVar = dduz.this;
                dduzVar.i.u(new ddpq(3, dduyVar.fr()));
                ((ddpm) dduzVar.j.b()).e(3);
                dduzVar.k.f(6, 4);
            }
        });
        return dduyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005a  */
    @Override // defpackage.vk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void g(defpackage.wr r8, int r9) {
        /*
            r7 = this;
            dduy r8 = (defpackage.dduy) r8
            android.widget.ImageView r0 = r8.v
            android.view.View r1 = r8.u
            com.google.android.apps.messaging.ui.search.resultsview.MediaGridLayoutManager r2 = r7.e
            int r1 = r2.bN(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            r2.width = r1
            r2.height = r1
            java.util.List r2 = r7.g
            java.lang.Object r9 = r2.get(r9)
            com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchResult r9 = (com.google.android.apps.messaging.shared.datamodel.databasegen.queries.MediaSearchResult) r9
            ddwg r2 = r7.o
            r3 = 1
            java.lang.String r2 = r2.a(r9, r3)
            r0.setContentDescription(r2)
            enhk r2 = r7.l
            android.net.Uri r4 = r9.h()
            java.lang.Object r2 = r2.get(r4)
            llg r2 = (defpackage.llg) r2
            r2.getClass()
            boolean r4 = r9.o()
            crly r5 = r8.w
            boolean r6 = r5.i()
            if (r6 != 0) goto L45
            if (r4 != 0) goto L44
            goto L54
        L44:
            r4 = r3
        L45:
            android.view.View r5 = r5.b()
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            if (r3 == r4) goto L50
            r3 = 8
            goto L51
        L50:
            r3 = 0
        L51:
            r5.setVisibility(r3)
        L54:
            lkr r3 = r7.n
            lld r4 = r8.s
            if (r4 == 0) goto L5f
            llh r5 = r8.t
            r4.k(r5)
        L5f:
            llh r4 = r8.t
            r2.f(r3, r4)
            r8.s = r2
            qqs r8 = r7.a
            android.net.Uri r9 = r9.h()
            qqo r8 = r8.f(r9)
            rig r9 = r7.f
            rhx r9 = r9.P(r1)
            qqo r8 = r8.q(r9)
            rjc r9 = r7.h
            rff r9 = defpackage.rff.c(r9)
            qqo r8 = r8.p(r9)
            r8.v(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dduz.g(wr, int):void");
    }
}
