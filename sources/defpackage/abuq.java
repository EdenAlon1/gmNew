package defpackage;

import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abuq implements alkx {
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private static final entd c = entd.c("MixedUpConvInspector");
    public static final cfva a = cfvl.e(cfvl.b, "maximum_number_of_conversation_collected", 5);
    public static final cfva b = cfvl.e(cfvl.b, "number_of_conversations_retrieved_limit", Alert.DURATION_SHOW_INDEFINITELY);

    public abuq(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8) {
        this.j = ffbrVar2;
        this.d = ffbrVar;
        this.g = ffbrVar3;
        this.f = ffbrVar5;
        this.e = ffbrVar6;
        this.h = ffbrVar4;
        this.i = ffbrVar7;
        this.k = ffbrVar8;
    }

    private final engw c(Collection collection, final ayym ayymVar, final ayvm ayvmVar) {
        if (collection == null || collection.isEmpty()) {
            int i = engw.d;
            return enou.a;
        }
        Stream map = Collection.EL.stream(collection).map(new Function() { // from class: abul
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ayya ayyaVar = (ayya) ayymVar.a(((bseh) obj).C());
                cpxu cpxuVar = new cpxu(ayyaVar.a.d);
                final epwr epwrVar = (epwr) epws.a.createBuilder();
                Stream stream = Collection.EL.stream(abuq.this.a(cpxuVar));
                final ayvm ayvmVar2 = ayvmVar;
                Stream map2 = stream.map(new Function() { // from class: abuc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        cfva cfvaVar = abuq.a;
                        return ayym.c(ayvm.this.a((String) obj2));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                epwrVar.getClass();
                map2.forEach(new Consumer() { // from class: abud
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        epwr epwrVar2 = epwr.this;
                        epvd epvdVar = (epvd) obj2;
                        epwrVar2.copyOnWrite();
                        epws epwsVar = (epws) epwrVar2.instance;
                        epws epwsVar2 = epws.a;
                        epvdVar.getClass();
                        eygr eygrVar = epwsVar.d;
                        if (!eygrVar.c()) {
                            epwsVar.d = eyfy.mutableCopy(eygrVar);
                        }
                        epwsVar.d.add(epvdVar);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                epvj epvjVar = ayyaVar.a;
                epwrVar.copyOnWrite();
                epws epwsVar = (epws) epwrVar.instance;
                epwsVar.c = epvjVar;
                epwsVar.b |= 1;
                return epwrVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = engw.d;
        return (engw) map.collect(endq.a);
    }

    private static String d(String str) {
        String trim = abrh.a.matcher(str).replaceAll("").trim();
        int length = trim.length() - abrh.b;
        return length > 0 ? trim.substring(length) : "";
    }

    private final void e(epwt epwtVar) {
        abuy abuyVar = (abuy) this.d.b();
        abut abutVar = new abut();
        abutVar.d(epwn.MIXED_UP_PARTICIPANT);
        abutVar.c(new ConversationIdType(-1L));
        abutVar.e = Optional.of((epwu) epwtVar.build());
        abuyVar.b(abutVar.e());
        ((ensz) ((ensz) c.h()).h("com/google/android/apps/messaging/custodian/inspectors/mixedupparticipant/MixedUpParticipantInspector", "logReportError", 570, "MixedUpParticipantInspector.java")).q("logging Mixed Up Participant Info to clearcut completed successfully");
    }

    private final boolean f(String str, String str2) {
        boolean z;
        String d = d(str);
        String d2 = d(str2);
        if (d.equals(d2)) {
            return true;
        }
        int length = d.length();
        int length2 = d2 == null ? 0 : d2.length();
        if (length == 0 || length2 == 0) {
            return false;
        }
        int i = length - 1;
        int i2 = length2 - 1;
        int i3 = 0;
        while (i >= 0 && i2 >= 0) {
            char charAt = d.charAt(i);
            char charAt2 = d2.charAt(i2);
            if (abrh.d(charAt)) {
                z = false;
            } else {
                i--;
                z = true;
            }
            if (!abrh.d(charAt2)) {
                i2--;
                z = true;
            }
            if (!z) {
                if (charAt2 != charAt) {
                    break;
                }
                i--;
                i2--;
                i3++;
            }
        }
        return i3 >= abrh.b;
    }

    private final int g(String str, String str2, ayvm ayvmVar) {
        String a2 = ((abrh) this.i.b()).a(str, ayvmVar);
        String a3 = ((abrh) this.i.b()).a(str2, ayvmVar);
        if (a2 == null && a3 == null) {
            return 3;
        }
        return (a2 == null || a3 == null || !a2.equals(a3)) ? 1 : 2;
    }

    public final engw a(cpxu cpxuVar) {
        Optional C = ((coxk) this.g.b()).C(cpxuVar);
        int i = engw.d;
        return (engw) Collection.EL.stream((engw) C.orElse(enou.a)).map(new Function() { // from class: abuj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aoku) obj).n();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: abuk
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
                cfva cfvaVar = abuq.a;
                return !TextUtils.isEmpty((String) obj);
            }
        }).collect(endq.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01f1, code lost:
    
        if (r7.equals(r4) != false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0261 A[Catch: all -> 0x03f0, TryCatch #0 {all -> 0x03f0, blocks: (B:77:0x011b, B:33:0x0125, B:35:0x012e, B:40:0x01f3, B:51:0x0203, B:53:0x0219, B:56:0x021d, B:58:0x0233, B:61:0x023f, B:63:0x0255, B:66:0x0261, B:70:0x0141, B:72:0x0147, B:97:0x0158, B:102:0x017a, B:105:0x017e, B:107:0x01ed, B:109:0x0264, B:114:0x0290), top: B:76:0x011b }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013c  */
    @Override // defpackage.alkx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            Method dump skipped, instructions count: 1040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abuq.b():void");
    }
}
