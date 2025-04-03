package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.IntPredicate$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxmm extends mo {
    private final cxno a;
    private final cxno b;

    public cxmm(cxno cxnoVar, cxno cxnoVar2) {
        this.a = cxnoVar;
        this.b = cxnoVar2;
    }

    public static final boolean f(MessagePartCoreData messagePartCoreData, MessagePartCoreData messagePartCoreData2) {
        return messagePartCoreData.bH(messagePartCoreData2);
    }

    private static final boolean g(int i, cxno cxnoVar) {
        return i == ((cxnq) cxnoVar).c;
    }

    @Override // defpackage.mo
    public final int a() {
        return this.b.c();
    }

    @Override // defpackage.mo
    public final int b() {
        return this.a.c();
    }

    @Override // defpackage.mo
    public final boolean d(int i, int i2) {
        cxno cxnoVar = this.b;
        boolean g = g(i, this.a);
        boolean g2 = g(i2, cxnoVar);
        if (g) {
            if (g2) {
                cxno cxnoVar2 = this.a;
                cxno cxnoVar3 = this.b;
                cxnq cxnqVar = (cxnq) cxnoVar2;
                final engw engwVar = cxnqVar.b;
                int i3 = ((enou) engwVar).c;
                cxnq cxnqVar2 = (cxnq) cxnoVar3;
                final engw engwVar2 = cxnqVar2.b;
                if (i3 == ((enou) engwVar2).c && cxnqVar.d == cxnqVar2.d) {
                    return IntStream.CC.range(0, i3).allMatch(new IntPredicate() { // from class: cxmj
                        public final /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
                            return IntPredicate$CC.$default$and(this, intPredicate);
                        }

                        public final /* synthetic */ IntPredicate negate() {
                            return IntPredicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
                            return IntPredicate$CC.$default$or(this, intPredicate);
                        }

                        @Override // java.util.function.IntPredicate
                        public final boolean test(int i4) {
                            return Objects.equals(((MessagePartCoreData) engwVar.get(i4)).t(), ((MessagePartCoreData) engwVar2.get(i4)).t());
                        }
                    });
                }
                return false;
            }
            g2 = false;
        }
        if (!g && !g2) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) ((cxnq) this.a).a.get(Integer.valueOf(i));
            messagePartCoreData.getClass();
            MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) ((cxnq) this.b).a.get(Integer.valueOf(i2));
            messagePartCoreData2.getClass();
            if ((messagePartCoreData instanceof PendingAttachmentData) == (messagePartCoreData2 instanceof PendingAttachmentData)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mo
    public final boolean e(int i, int i2) {
        cxno cxnoVar = this.b;
        boolean g = g(i, this.a);
        boolean g2 = g(i2, cxnoVar);
        if (g) {
            if (g2) {
                cxno cxnoVar2 = this.a;
                cxno cxnoVar3 = this.b;
                Stream stream = Collection.EL.stream(((cxnq) cxnoVar2).b);
                final engw engwVar = ((cxnq) cxnoVar3).b;
                return stream.anyMatch(new Predicate() { // from class: cxmk
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
                    public final boolean test(Object obj) {
                        final MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
                        return Collection.EL.stream(engwVar).anyMatch(new Predicate() { // from class: cxml
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
                            public final boolean test(Object obj2) {
                                return cxmm.f(MessagePartCoreData.this, (MessagePartCoreData) obj2);
                            }
                        });
                    }
                });
            }
            g2 = false;
        }
        if (g || g2) {
            return false;
        }
        MessagePartCoreData messagePartCoreData = (MessagePartCoreData) ((cxnq) this.a).a.get(Integer.valueOf(i));
        messagePartCoreData.getClass();
        MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) ((cxnq) this.b).a.get(Integer.valueOf(i2));
        messagePartCoreData2.getClass();
        return f(messagePartCoreData, messagePartCoreData2);
    }
}
