package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.SetupExpressiveStickersAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.bayt;
import defpackage.bayv;
import defpackage.bayw;
import defpackage.caqz;
import defpackage.cful;
import defpackage.cqoh;
import defpackage.csjb;
import defpackage.cskc;
import defpackage.csum;
import defpackage.ctyx;
import defpackage.dfyt;
import defpackage.dtnq;
import defpackage.dtuu;
import defpackage.eere;
import defpackage.eeui;
import defpackage.ekmq;
import defpackage.ekms;
import defpackage.ekmt;
import defpackage.ekzz;
import defpackage.eldl;
import defpackage.eleg;
import defpackage.emwl;
import defpackage.eogt;
import defpackage.ernq;
import defpackage.erny;
import defpackage.eroh;
import defpackage.erpp;
import defpackage.erqc;
import defpackage.erqt;
import defpackage.errl;
import defpackage.errm;
import defpackage.ewnm;
import defpackage.eyfy;
import defpackage.fazb;
import defpackage.ffbr;
import defpackage.rbv;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class SetupExpressiveStickersAction extends ThrottledAction implements Parcelable {
    public final ffbr b;
    public final ctyx c;
    public final cqoh d;
    public final fazb e;
    public final eeui f;
    public final dtuu g;
    private final Context k;
    private final ekmt l;
    private final errl m;
    private final errl n;
    private final ScheduledExecutorService o;
    public static final cskc a = cskc.g("BugleDataModel", "SetupExpressiveStickersAction");
    private static final long h = TimeUnit.MINUTES.toMillis(10);
    private static final long i = TimeUnit.MINUTES.toMillis(3);
    private static final long j = TimeUnit.SECONDS.toMillis(30);
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bayv();

    /* compiled from: PG */
    public interface a {
        bayw io();
    }

    public SetupExpressiveStickersAction(Context context, ffbr ffbrVar, ctyx ctyxVar, cqoh cqohVar, fazb fazbVar, errl errlVar, errl errlVar2, errm errmVar, eeui eeuiVar, dtuu dtuuVar) {
        super(eogt.SETUP_EXPRESSIVE_STICKERS_ACTION);
        this.k = context;
        this.b = ffbrVar;
        this.c = ctyxVar;
        this.l = ekmq.a(context);
        this.d = cqohVar;
        this.e = fazbVar;
        this.m = errlVar;
        this.n = errlVar2;
        this.o = errmVar;
        this.f = eeuiVar;
        this.g = dtuuVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("SetupExpressiveStickersAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SetupExpressiveStickers.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final int f() {
        return 128;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final long g() {
        return h;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final String h() {
        return "SetupExpressiveStickersAction";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction
    public final void i() {
        final ewnm ewnmVar;
        if (!((Boolean) cful.f.e()).booleanValue()) {
            a.r("isExpressiveStickersEnabled is false.");
            return;
        }
        if (this.c.q("is_expressive_stickers_setup_done", false)) {
            return;
        }
        if (!caqz.c().isEmpty()) {
            this.c.h("is_expressive_stickers_setup_done", true);
            return;
        }
        this.f.d();
        try {
            ewnmVar = (ewnm) eyfy.parseFrom(ewnm.a, (byte[]) cful.N.e());
        } catch (Exception e) {
            a.o("Failed to parse StickerMarketConfig.", e);
            ewnmVar = ewnm.a;
        }
        if (ewnmVar.b.size() == 0) {
            a.n("StickerMarketConfig has no default sticker packs!");
            this.f.f(5);
            erqt.i(null);
            return;
        }
        ListenableFuture p = erqt.p(erny.f(((eere) this.e.b()).d(), new emwl() { // from class: bayi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                List list = (List) obj;
                cskc cskcVar = SetupExpressiveStickersAction.a;
                if (list == null || list.isEmpty()) {
                    throw new IllegalStateException("No sticker metadata available");
                }
                return null;
            }
        }, erpp.a), j, TimeUnit.MILLISECONDS, this.o);
        erqt.r(p, new bayt(this), erpp.a);
        ListenableFuture f = erny.f(erny.f(erny.g(erny.f(erqc.o(p), new emwl() { // from class: bayp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                SetupExpressiveStickersAction setupExpressiveStickersAction = SetupExpressiveStickersAction.this;
                erqt.r(((eere) setupExpressiveStickersAction.e.b()).b(), axou.a(new bayu(setupExpressiveStickersAction, ewnmVar)), erpp.a);
                return null;
            }
        }, erpp.a), new eroh() { // from class: bayq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ewnm ewnmVar2 = ewnmVar;
                int size = ewnmVar2.e.size();
                SetupExpressiveStickersAction setupExpressiveStickersAction = SetupExpressiveStickersAction.this;
                if (size > 0) {
                    Stream stream = Collection.EL.stream(ewnmVar2.e);
                    final eere eereVar = (eere) setupExpressiveStickersAction.e.b();
                    eereVar.getClass();
                    return erny.f(erqt.o((List) stream.map(new Function() { // from class: baye
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return eere.this.e((String) obj2);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).collect(Collectors.toCollection(new bayk()))), new emwl() { // from class: bayj
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            List list = (List) obj2;
                            cskc cskcVar = SetupExpressiveStickersAction.a;
                            return list == null ? new ArrayList() : (List) Collection.EL.stream(list).filter(new Predicate() { // from class: bayg
                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                    return Predicate$CC.$default$and(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                /* renamed from: negate */
                                public final /* synthetic */ Predicate mo439negate() {
                                    return Predicate$CC.$default$negate(this);
                                }

                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                    return Predicate$CC.$default$or(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj3) {
                                    return Objects.nonNull((ewnk) obj3);
                                }
                            }).collect(Collectors.toCollection(new bayk()));
                        }
                    }, erpp.a);
                }
                Stream stream2 = Collection.EL.stream(ewnmVar2.b);
                final eere eereVar2 = (eere) setupExpressiveStickersAction.e.b();
                eereVar2.getClass();
                return erny.f(erqt.o((List) stream2.map(new Function() { // from class: bayl
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return eere.this.c((String) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new bayk()))), new emwl() { // from class: bayo
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        List list = (List) obj2;
                        cskc cskcVar = SetupExpressiveStickersAction.a;
                        return list == null ? new ArrayList() : (List) Collection.EL.stream(list).filter(new Predicate() { // from class: baym
                            public final /* synthetic */ Predicate and(Predicate predicate) {
                                return Predicate$CC.$default$and(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            /* renamed from: negate */
                            public final /* synthetic */ Predicate mo439negate() {
                                return Predicate$CC.$default$negate(this);
                            }

                            public final /* synthetic */ Predicate or(Predicate predicate) {
                                return Predicate$CC.$default$or(this, predicate);
                            }

                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj3) {
                                ewnp ewnpVar = (ewnp) obj3;
                                cskc cskcVar2 = SetupExpressiveStickersAction.a;
                                return ewnpVar != null && ewnpVar.h.size() > 0;
                            }
                        }).map(new Function() { // from class: bayn
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                cskc cskcVar2 = SetupExpressiveStickersAction.a;
                                return (ewnk) ((ewnp) obj3).h.get(0);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.toCollection(new bayk()));
                    }
                }, erpp.a);
            }
        }, erpp.a), eldl.a(new emwl() { // from class: bayr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                final SetupExpressiveStickersAction setupExpressiveStickersAction;
                List list = (List) obj;
                final ArrayList arrayList = new ArrayList();
                int size = list.size() - 1;
                while (true) {
                    setupExpressiveStickersAction = SetupExpressiveStickersAction.this;
                    if (size < 0) {
                        break;
                    }
                    ewnk ewnkVar = (ewnk) list.get(size);
                    String str = ewnkVar.c;
                    ewmw ewmwVar = ewnkVar.e;
                    if (ewmwVar == null) {
                        ewmwVar = ewmw.a;
                    }
                    Uri l = setupExpressiveStickersAction.l(str, ewmwVar.c);
                    if (l != null) {
                        ewmw ewmwVar2 = ewnkVar.e;
                        if (ewmwVar2 == null) {
                            ewmwVar2 = ewmw.a;
                        }
                        ewmt ewmtVar = ewmwVar2.f;
                        if (ewmtVar == null) {
                            ewmtVar = ewmt.a;
                        }
                        int i2 = ewmtVar.b;
                        ewmw ewmwVar3 = ewnkVar.e;
                        ewmt ewmtVar2 = (ewmwVar3 == null ? ewmw.a : ewmwVar3).f;
                        if (ewmtVar2 == null) {
                            ewmtVar2 = ewmt.a;
                        }
                        int i3 = ewmtVar2.c;
                        String str2 = ewnkVar.c;
                        if (ewmwVar3 == null) {
                            ewmwVar3 = ewmw.a;
                        }
                        arrayList.add(cara.a(str2, l, caqv.a(ewmwVar3), i2 > 0 ? i2 : -1, i3 > 0 ? i3 : -1, setupExpressiveStickersAction.d.f().toEpochMilli()));
                    }
                    size--;
                }
                if (arrayList.isEmpty()) {
                    setupExpressiveStickersAction.f.f(4);
                    throw new IllegalStateException("Failed to download any recent stickers");
                }
                setupExpressiveStickersAction.g.d("SetupExpressiveStickersAction#saveAsDefaultRecentItems", new Runnable() { // from class: bayh
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            SetupExpressiveStickersAction setupExpressiveStickersAction2 = SetupExpressiveStickersAction.this;
                            ((caqz) setupExpressiveStickersAction2.b.b()).b((bwwz) it.next());
                        }
                    }
                });
                return null;
            }
        }), this.n), new emwl() { // from class: bays
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                SetupExpressiveStickersAction setupExpressiveStickersAction = SetupExpressiveStickersAction.this;
                setupExpressiveStickersAction.c.h("is_expressive_stickers_setup_done", true);
                setupExpressiveStickersAction.f.e();
                ((eere) setupExpressiveStickersAction.e.b()).k();
                return null;
            }
        }, this.m);
        erqc erqcVar = (erqc) f;
        ernq.f(erqcVar.p(i, TimeUnit.MILLISECONDS, this.o), Exception.class, new emwl() { // from class: bayf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                SetupExpressiveStickersAction.a.o("Failed to setup expressive stickers.", (Exception) obj);
                return null;
            }
        }, erpp.a);
    }

    public final Uri l(String str, String str2) {
        try {
            File file = (File) dtnq.b(((ekms) this.l.d().V(rbv.a, 7500)).l(str2).s(), 7500L, TimeUnit.MILLISECONDS);
            File file2 = new File(this.k.getFilesDir(), "recent_expressive_stickers/".concat(String.valueOf(str)));
            if (!csum.h(file2)) {
                csjb b = a.b();
                b.I("Failed to create directories for");
                b.I(file2);
                b.r();
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        dfyt.c(fileInputStream, fileOutputStream);
                        fileOutputStream.close();
                        fileInputStream.close();
                        return Uri.fromFile(file2);
                    } finally {
                    }
                } finally {
                }
            } catch (IOException e) {
                a.o("Error copying expressive sticker file.", e);
                return null;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            csjb b2 = a.b();
            b2.I("Failed to download sticker");
            b2.I(str);
            b2.s(e2);
            return null;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        D(parcel, i2);
    }

    public SetupExpressiveStickersAction(Context context, ffbr ffbrVar, ctyx ctyxVar, cqoh cqohVar, fazb fazbVar, errl errlVar, errl errlVar2, errm errmVar, eeui eeuiVar, dtuu dtuuVar, Parcel parcel) {
        super(parcel, eogt.SETUP_EXPRESSIVE_STICKERS_ACTION);
        this.k = context;
        this.b = ffbrVar;
        this.c = ctyxVar;
        this.l = ekmq.a(context);
        this.d = cqohVar;
        this.e = fazbVar;
        this.m = errlVar;
        this.n = errlVar2;
        this.o = errmVar;
        this.f = eeuiVar;
        this.g = dtuuVar;
    }
}
