package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeza implements aeyq {
    public static final cskc a = cskc.g("BugleSuperSort", "LabelDatabaseHandlerImpl");
    public final ffbr b;
    public final dtuu c;
    public final ffbr d;
    private final errl e;
    private final ffbr f;

    public aeza(errl errlVar, ffbr ffbrVar, dtuu dtuuVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.e = errlVar;
        this.b = ffbrVar;
        this.c = dtuuVar;
        this.f = ffbrVar2;
        this.d = ffbrVar3;
    }

    public static boolean c(buad buadVar, aeyp aeypVar) {
        aeyc aeycVar = (aeyc) aeypVar;
        if (aeycVar.a.equals(buadVar.e())) {
            return aeycVar.b.i == buadVar.c() && aeycVar.d == buadVar.g() && aeycVar.e == buadVar.f() && aeycVar.f.equals(buadVar.j());
        }
        return false;
    }

    public static boolean d(buad buadVar, aeyp aeypVar) {
        return ((aeyc) aeypVar).c.equals(buadVar.i());
    }

    @Override // defpackage.aeyq
    public final elfl a(final aeyp aeypVar) {
        final emyl emylVar = new emyl() { // from class: aeyx
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:100:0x03f5 A[Catch: all -> 0x0465, TryCatch #0 {all -> 0x0465, blocks: (B:73:0x033e, B:76:0x0357, B:77:0x035c, B:80:0x0375, B:82:0x037a, B:83:0x0383, B:86:0x03a4, B:88:0x03a9, B:89:0x03b2, B:92:0x03ca, B:94:0x03cf, B:95:0x03d8, B:98:0x03f0, B:100:0x03f5, B:101:0x03fe, B:104:0x0416, B:106:0x041b, B:107:0x0424, B:110:0x0451, B:116:0x0347), top: B:72:0x033e }] */
            /* JADX WARN: Removed duplicated region for block: B:104:0x0416 A[Catch: all -> 0x0465, TRY_ENTER, TryCatch #0 {all -> 0x0465, blocks: (B:73:0x033e, B:76:0x0357, B:77:0x035c, B:80:0x0375, B:82:0x037a, B:83:0x0383, B:86:0x03a4, B:88:0x03a9, B:89:0x03b2, B:92:0x03ca, B:94:0x03cf, B:95:0x03d8, B:98:0x03f0, B:100:0x03f5, B:101:0x03fe, B:104:0x0416, B:106:0x041b, B:107:0x0424, B:110:0x0451, B:116:0x0347), top: B:72:0x033e }] */
            /* JADX WARN: Removed duplicated region for block: B:106:0x041b A[Catch: all -> 0x0465, TryCatch #0 {all -> 0x0465, blocks: (B:73:0x033e, B:76:0x0357, B:77:0x035c, B:80:0x0375, B:82:0x037a, B:83:0x0383, B:86:0x03a4, B:88:0x03a9, B:89:0x03b2, B:92:0x03ca, B:94:0x03cf, B:95:0x03d8, B:98:0x03f0, B:100:0x03f5, B:101:0x03fe, B:104:0x0416, B:106:0x041b, B:107:0x0424, B:110:0x0451, B:116:0x0347), top: B:72:0x033e }] */
            /* JADX WARN: Removed duplicated region for block: B:80:0x0375 A[Catch: all -> 0x0465, TRY_ENTER, TryCatch #0 {all -> 0x0465, blocks: (B:73:0x033e, B:76:0x0357, B:77:0x035c, B:80:0x0375, B:82:0x037a, B:83:0x0383, B:86:0x03a4, B:88:0x03a9, B:89:0x03b2, B:92:0x03ca, B:94:0x03cf, B:95:0x03d8, B:98:0x03f0, B:100:0x03f5, B:101:0x03fe, B:104:0x0416, B:106:0x041b, B:107:0x0424, B:110:0x0451, B:116:0x0347), top: B:72:0x033e }] */
            /* JADX WARN: Removed duplicated region for block: B:82:0x037a A[Catch: all -> 0x0465, TryCatch #0 {all -> 0x0465, blocks: (B:73:0x033e, B:76:0x0357, B:77:0x035c, B:80:0x0375, B:82:0x037a, B:83:0x0383, B:86:0x03a4, B:88:0x03a9, B:89:0x03b2, B:92:0x03ca, B:94:0x03cf, B:95:0x03d8, B:98:0x03f0, B:100:0x03f5, B:101:0x03fe, B:104:0x0416, B:106:0x041b, B:107:0x0424, B:110:0x0451, B:116:0x0347), top: B:72:0x033e }] */
            /* JADX WARN: Removed duplicated region for block: B:86:0x03a4 A[Catch: all -> 0x0465, TRY_ENTER, TryCatch #0 {all -> 0x0465, blocks: (B:73:0x033e, B:76:0x0357, B:77:0x035c, B:80:0x0375, B:82:0x037a, B:83:0x0383, B:86:0x03a4, B:88:0x03a9, B:89:0x03b2, B:92:0x03ca, B:94:0x03cf, B:95:0x03d8, B:98:0x03f0, B:100:0x03f5, B:101:0x03fe, B:104:0x0416, B:106:0x041b, B:107:0x0424, B:110:0x0451, B:116:0x0347), top: B:72:0x033e }] */
            /* JADX WARN: Removed duplicated region for block: B:88:0x03a9 A[Catch: all -> 0x0465, TryCatch #0 {all -> 0x0465, blocks: (B:73:0x033e, B:76:0x0357, B:77:0x035c, B:80:0x0375, B:82:0x037a, B:83:0x0383, B:86:0x03a4, B:88:0x03a9, B:89:0x03b2, B:92:0x03ca, B:94:0x03cf, B:95:0x03d8, B:98:0x03f0, B:100:0x03f5, B:101:0x03fe, B:104:0x0416, B:106:0x041b, B:107:0x0424, B:110:0x0451, B:116:0x0347), top: B:72:0x033e }] */
            /* JADX WARN: Removed duplicated region for block: B:92:0x03ca A[Catch: all -> 0x0465, TRY_ENTER, TryCatch #0 {all -> 0x0465, blocks: (B:73:0x033e, B:76:0x0357, B:77:0x035c, B:80:0x0375, B:82:0x037a, B:83:0x0383, B:86:0x03a4, B:88:0x03a9, B:89:0x03b2, B:92:0x03ca, B:94:0x03cf, B:95:0x03d8, B:98:0x03f0, B:100:0x03f5, B:101:0x03fe, B:104:0x0416, B:106:0x041b, B:107:0x0424, B:110:0x0451, B:116:0x0347), top: B:72:0x033e }] */
            /* JADX WARN: Removed duplicated region for block: B:94:0x03cf A[Catch: all -> 0x0465, TryCatch #0 {all -> 0x0465, blocks: (B:73:0x033e, B:76:0x0357, B:77:0x035c, B:80:0x0375, B:82:0x037a, B:83:0x0383, B:86:0x03a4, B:88:0x03a9, B:89:0x03b2, B:92:0x03ca, B:94:0x03cf, B:95:0x03d8, B:98:0x03f0, B:100:0x03f5, B:101:0x03fe, B:104:0x0416, B:106:0x041b, B:107:0x0424, B:110:0x0451, B:116:0x0347), top: B:72:0x033e }] */
            /* JADX WARN: Removed duplicated region for block: B:98:0x03f0 A[Catch: all -> 0x0465, TRY_ENTER, TryCatch #0 {all -> 0x0465, blocks: (B:73:0x033e, B:76:0x0357, B:77:0x035c, B:80:0x0375, B:82:0x037a, B:83:0x0383, B:86:0x03a4, B:88:0x03a9, B:89:0x03b2, B:92:0x03ca, B:94:0x03cf, B:95:0x03d8, B:98:0x03f0, B:100:0x03f5, B:101:0x03fe, B:104:0x0416, B:106:0x041b, B:107:0x0424, B:110:0x0451, B:116:0x0347), top: B:72:0x033e }] */
            @Override // defpackage.emyl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() {
                /*
                    Method dump skipped, instructions count: 1492
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aeyx.get():java.lang.Object");
            }
        };
        return elfo.g(new Callable() { // from class: aeyy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return (Boolean) aeza.this.c.c("LabelDatabaseHandler#setLabel", emylVar);
            }
        }, this.e);
    }

    public final void b(aeyp aeypVar, final Optional optional, final MessageCoreData messageCoreData) {
        if (messageCoreData.cS()) {
            return;
        }
        aeyc aeycVar = (aeyc) aeypVar;
        buay buayVar = aeycVar.d;
        int i = 1;
        if (buayVar == buay.MODEL) {
            i = true != aeycVar.g ? 2 : 3;
        } else if (buayVar == buay.USER) {
            i = 4;
        }
        final int i2 = i;
        final aexn aexnVar = (aexn) this.f.b();
        final SuperSortLabel superSortLabel = aeycVar.b;
        final String str = aeycVar.f;
        if (((Boolean) aexw.a.e()).booleanValue()) {
            return;
        }
        axnw.i(((ahik) aexnVar.c.b()).b(), new Consumer() { // from class: aexj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final int i3;
                cxkc cxkcVar = (cxkc) obj;
                boolean booleanValue = ((Boolean) aexn.a.e()).booleanValue();
                int i4 = i2;
                boolean z = false;
                if (booleanValue && i4 == 2) {
                    z = true;
                    i3 = 2;
                } else {
                    i3 = i4;
                }
                if (cxkcVar == null || !cxkcVar.c() || z) {
                    return;
                }
                final MessageCoreData messageCoreData2 = messageCoreData;
                final String str2 = str;
                final Optional optional2 = optional;
                final SuperSortLabel superSortLabel2 = superSortLabel;
                final aexn aexnVar2 = aexn.this;
                aexnVar2.o(new Supplier() { // from class: aexl
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        final eqjc eqjcVar = (eqjc) eqje.a.createBuilder();
                        eqjv b = aeya.b(superSortLabel2);
                        eqjcVar.copyOnWrite();
                        eqje eqjeVar = (eqje) eqjcVar.instance;
                        eqjeVar.c = b.i;
                        eqjeVar.b |= 1;
                        eqjcVar.copyOnWrite();
                        eqje eqjeVar2 = (eqje) eqjcVar.instance;
                        eqjeVar2.e = i3 - 1;
                        eqjeVar2.b |= 4;
                        aexn aexnVar3 = aexn.this;
                        akvz akvzVar = (akvz) aexnVar3.b.b();
                        MessageCoreData messageCoreData3 = messageCoreData2;
                        long d = akvzVar.d(messageCoreData3);
                        eqjcVar.copyOnWrite();
                        eqje eqjeVar3 = (eqje) eqjcVar.instance;
                        eqjeVar3.b |= 16;
                        eqjeVar3.g = d;
                        long b2 = ((akvz) aexnVar3.b.b()).b(messageCoreData3.z());
                        eqjcVar.copyOnWrite();
                        eqje eqjeVar4 = (eqje) eqjcVar.instance;
                        eqjeVar4.b |= 32;
                        eqjeVar4.h = b2;
                        optional2.ifPresent(new Consumer() { // from class: aexk
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void o(Object obj2) {
                                int i5 = aexn.e;
                                eqjv b3 = aeya.b((SuperSortLabel) obj2);
                                eqjc eqjcVar2 = eqjc.this;
                                eqjcVar2.copyOnWrite();
                                eqje eqjeVar5 = (eqje) eqjcVar2.instance;
                                eqje eqjeVar6 = eqje.a;
                                eqjeVar5.d = b3.i;
                                eqjeVar5.b |= 2;
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        String str3 = str2;
                        if (!TextUtils.isEmpty(str3)) {
                            eqjcVar.copyOnWrite();
                            eqje eqjeVar5 = (eqje) eqjcVar.instance;
                            eqjeVar5.b |= 8;
                            eqjeVar5.f = str3;
                        }
                        return (eqje) eqjcVar.build();
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, aexnVar.d);
    }
}
