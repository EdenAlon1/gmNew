package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crga {
    public final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final errl d;

    public crga(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errl errlVar) {
        this.a = ffbrVar3;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = errlVar;
    }

    public static final void e(eoop eoopVar, Optional optional) {
        eopv eopvVar = ((eopq) eoopVar.instance).j;
        if (eopvVar == null) {
            eopvVar = eopv.a;
        }
        eopu eopuVar = (eopu) eopvVar.toBuilder();
        if (((eopv) eopuVar.instance).b.size() > 0 && optional.isPresent() && ((crbg) optional.get()).e.isPresent()) {
            eohk eohkVar = (eohk) eopuVar.b().toBuilder();
            int a = csuc.a(((crbg) optional.get()).e.getAsLong());
            eohkVar.copyOnWrite();
            eohl eohlVar = (eohl) eohkVar.instance;
            eohlVar.f = eohg.a(a);
            eohlVar.b |= 16;
            eopuVar.c(eohkVar);
        }
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopv eopvVar2 = (eopv) eopuVar.build();
        eopvVar2.getClass();
        eopqVar.j = eopvVar2;
        eopqVar.b |= 8;
    }

    private final void f(MessageCoreData messageCoreData, int i, Consumer consumer) {
        eoop eoopVar = (eoop) eopq.a.createBuilder();
        long b = ((akvz) this.b.b()).b(messageCoreData.z());
        eoopVar.copyOnWrite();
        eopq eopqVar = (eopq) eoopVar.instance;
        eopqVar.b |= 1073741824;
        eopqVar.G = b;
        long t = messageCoreData.t();
        eoopVar.copyOnWrite();
        eopq eopqVar2 = (eopq) eoopVar.instance;
        eopqVar2.b |= 128;
        eopqVar2.n = t;
        int d = altl.d(messageCoreData.d());
        eoopVar.copyOnWrite();
        eopq eopqVar3 = (eopq) eoopVar.instance;
        eopqVar3.g = d - 1;
        eopqVar3.b |= 1;
        eoopVar.copyOnWrite();
        eopq eopqVar4 = (eopq) eoopVar.instance;
        eopqVar4.h = i - 1;
        eopqVar4.b |= 2;
        int i2 = true != messageCoreData.cB() ? 3 : 2;
        eoopVar.copyOnWrite();
        eopq eopqVar5 = (eopq) eoopVar.instance;
        eopqVar5.S = i2 - 1;
        eopqVar5.c |= 16384;
        String f = messageCoreData.E().f();
        eoopVar.copyOnWrite();
        eopq eopqVar6 = (eopq) eoopVar.instance;
        eopqVar6.b |= Integer.MIN_VALUE;
        eopqVar6.H = f;
        eosd eosdVar = (eosd) eose.a.createBuilder();
        int f2 = messageCoreData.f();
        eosdVar.copyOnWrite();
        eose eoseVar = (eose) eosdVar.instance;
        eoseVar.b |= 1;
        eoseVar.c = f2;
        eose eoseVar2 = (eose) eosdVar.build();
        eoopVar.copyOnWrite();
        eopq eopqVar7 = (eopq) eoopVar.instance;
        eoseVar2.getClass();
        eopqVar7.f = eoseVar2;
        eopqVar7.e = 60;
        List<MessagePartCoreData> ab = messageCoreData.ab();
        eopu eopuVar = (eopu) eopv.a.createBuilder();
        for (MessagePartCoreData messagePartCoreData : ab) {
            String V = messagePartCoreData.V();
            eohj a = V != null ? csud.a(V) : eohj.UNKNOWN_BUGLE_CONTENT_TYPE;
            eohk eohkVar = (eohk) eohl.a.createBuilder();
            eohkVar.copyOnWrite();
            eohl eohlVar = (eohl) eohkVar.instance;
            eohlVar.c = a.a();
            eohlVar.b |= 1;
            eohh N = messagePartCoreData.N();
            eohkVar.copyOnWrite();
            eohl eohlVar2 = (eohl) eohkVar.instance;
            eohlVar2.d = N.a();
            eohlVar2.b |= 4;
            eohkVar.copyOnWrite();
            eohl.a((eohl) eohkVar.instance);
            long l = messagePartCoreData.l() > 0 ? messagePartCoreData.l() : messagePartCoreData.p();
            eohkVar.copyOnWrite();
            eohl eohlVar3 = (eohl) eohkVar.instance;
            eohlVar3.f = eohg.a(csuc.a(l));
            eohlVar3.b |= 16;
            eopuVar.a(eohkVar);
        }
        eopv eopvVar = (eopv) eopuVar.build();
        eoopVar.copyOnWrite();
        eopq eopqVar8 = (eopq) eoopVar.instance;
        eopvVar.getClass();
        eopqVar8.j = eopvVar;
        eopqVar8.b |= 8;
        if (messageCoreData.cX()) {
            eqyl a2 = ((avkk) this.c.b()).a();
            eoopVar.copyOnWrite();
            eopq eopqVar9 = (eopq) eoopVar.instance;
            eopqVar9.aa = a2.h;
            eopqVar9.c |= 2097152;
        }
        consumer.o(eoopVar);
        final eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_MESSAGE;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eopq eopqVar10 = (eopq) eoopVar.build();
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eopqVar10.getClass();
        eolvVar2.l = eopqVar10;
        eolvVar2.b |= 4;
        axnw.f(elfo.f(new Runnable() { // from class: crfy
            @Override // java.lang.Runnable
            public final void run() {
                ((akyb) crga.this.a.b()).a().j(eoluVar, alal.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
            }
        }, this.d), "Failed to log upload event.");
    }

    public final void a(MessageCoreData messageCoreData, final epyb epybVar, final Optional optional) {
        f(messageCoreData, 21, new Consumer() { // from class: crfv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                eoop eoopVar = (eoop) obj;
                eoopVar.copyOnWrite();
                eopq eopqVar = (eopq) eoopVar.instance;
                eopq eopqVar2 = eopq.a;
                epyb epybVar2 = epyb.this;
                epybVar2.getClass();
                eopqVar.an = epybVar2;
                eopqVar.d |= 4;
                crga.e(eoopVar, optional);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void b(MessageCoreData messageCoreData, final epyb epybVar, final epxv epxvVar, final Optional optional) {
        f(messageCoreData, 21, new Consumer() { // from class: crfx
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                eoop eoopVar = (eoop) obj;
                eoopVar.copyOnWrite();
                eopq eopqVar = (eopq) eoopVar.instance;
                eopq eopqVar2 = eopq.a;
                epyb epybVar2 = epyb.this;
                epybVar2.getClass();
                eopqVar.an = epybVar2;
                eopqVar.d |= 4;
                eoopVar.copyOnWrite();
                eopq eopqVar3 = (eopq) eoopVar.instance;
                epxv epxvVar2 = epxvVar;
                epxvVar2.getClass();
                eopqVar3.at = epxvVar2;
                eopqVar3.d |= 256;
                crga.e(eoopVar, optional);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void c(MessageCoreData messageCoreData) {
        f(messageCoreData, 19, new Consumer() { // from class: crfw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void d(MessageCoreData messageCoreData, final Optional optional, final awvb awvbVar) {
        f(messageCoreData, 20, new Consumer() { // from class: crfz
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                final eoop eoopVar = (eoop) obj;
                eoopVar.getClass();
                Optional.this.ifPresent(new Consumer() { // from class: crfu
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj2) {
                        eoop eoopVar2 = eoop.this;
                        epyb epybVar = (epyb) obj2;
                        eoopVar2.copyOnWrite();
                        eopq eopqVar = (eopq) eoopVar2.instance;
                        eopq eopqVar2 = eopq.a;
                        epybVar.getClass();
                        eopqVar.ay = epybVar;
                        eopqVar.d |= 8192;
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                eopv eopvVar = ((eopq) eoopVar.instance).j;
                if (eopvVar == null) {
                    eopvVar = eopv.a;
                }
                eopu eopuVar = (eopu) eopvVar.toBuilder();
                if (((eopv) eopuVar.instance).b.size() > 0) {
                    awvb awvbVar2 = awvbVar;
                    eohk eohkVar = (eohk) eopuVar.b().toBuilder();
                    long j = awvbVar2.d;
                    eohkVar.copyOnWrite();
                    eohl eohlVar = (eohl) eohkVar.instance;
                    eohlVar.f = eohg.a(csuc.a(j));
                    eohlVar.b |= 16;
                    eopuVar.c(eohkVar);
                }
                eoopVar.copyOnWrite();
                eopq eopqVar = (eopq) eoopVar.instance;
                eopv eopvVar2 = (eopv) eopuVar.build();
                eopvVar2.getClass();
                eopqVar.j = eopvVar2;
                eopqVar.b |= 8;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
