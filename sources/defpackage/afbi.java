package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afbi implements bqab {
    public static final entd a = entd.c("BugleSuperSort");
    public final tbn b;
    private bvvl c;
    private final afaz d;
    private final AtomicBoolean e = new AtomicBoolean(false);

    public afbi(tbn tbnVar, ffbr ffbrVar) {
        this.b = tbnVar;
        this.d = new afaz(new Consumer() { // from class: afbg
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                Object apply;
                final engw engwVar = (engw) obj;
                if (!aewg.h()) {
                    ((ensz) afbi.a.o().h("com/google/android/apps/messaging/label/data/observer/ContactChangeObserver", "handleContactChange", 72, "ContactChangeObserver.java")).q("Skipping ContactChangeObserver:handleContactChange, feature disabled.");
                    return;
                }
                if (engwVar.isEmpty()) {
                    return;
                }
                String[] strArr = bsdr.a;
                final bsdm bsdmVar = new bsdm(bsdr.a);
                bsdmVar.z("handleContactChange-conversationparticipants");
                bsdmVar.e(new Function() { // from class: afba
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        entd entdVar = afbi.a;
                        return ((bscz) obj2).a;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bsdmVar.f(new Function() { // from class: afbb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsdq bsdqVar = (bsdq) obj2;
                        entd entdVar = afbi.a;
                        Stream map = Collection.EL.stream(engw.this).map(new Function() { // from class: afbf
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return Long.valueOf(Long.parseLong((String) obj3));
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int i = engw.d;
                        bsdqVar.g((Iterable) map.collect(endq.a));
                        return bsdqVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                String[] strArr2 = buaw.a;
                buat buatVar = new buat();
                buatVar.ap("handleContactChange-messagelabels");
                buatVar.c(String.valueOf(aewg.e()).concat("_old"));
                apply = new Function() { // from class: afbc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        buav buavVar = (buav) obj2;
                        entd entdVar = afbi.a;
                        agsp a2 = agss.a();
                        a2.z("ContactChangeObserver#handleContactChange");
                        a2.d(new Function() { // from class: afbd
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                entd entdVar2 = afbi.a;
                                return ((agsi) obj3).a;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        final bsdm bsdmVar2 = bsdm.this;
                        a2.e(new Function() { // from class: afbe
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                agsr agsrVar = (agsr) obj3;
                                entd entdVar2 = afbi.a;
                                agsrVar.aq(new dtru("messages.conversation_id", 3, bsdm.this.b()));
                                return agsrVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        buavVar.aq(new dtru("message_labels._id", 3, a2.b()));
                        return buavVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new buav());
                buatVar.af(new buau((buav) apply));
                if (buatVar.b().e() > 0) {
                    afbi.this.b.a();
                } else {
                    ((ensz) ((ensz) afbi.a.j()).h("com/google/android/apps/messaging/label/data/observer/ContactChangeObserver", "handleContactChange", 88, "ContactChangeObserver.java")).q("ContactChangeObserver:handleContactChange participant(s) were added/removed to contacts without corresponding labeled messages.");
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, ffbrVar);
    }

    @Override // defpackage.bqab
    public final void a() {
        bvvn e = ParticipantsTable.e();
        e.z("ClassifyMissingMessagesQueue");
        e.e(new Function() { // from class: afbh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bvtg bvtgVar = (bvtg) obj;
                entd entdVar = afbi.a;
                return new bvth[]{bvtgVar.a, bvtgVar.r};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.c = e.b();
    }

    @Override // defpackage.bqab
    public final void fF() {
        if (this.e.compareAndSet(false, true)) {
            this.c.L(this.d);
        }
    }
}
