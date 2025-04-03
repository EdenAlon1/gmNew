package defpackage;

import android.content.Context;
import android.util.Base64;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class shp implements bdod, bdnu {
    public static final entd a = entd.c("BugleAudio");
    public final shk b;
    private final Context c;
    private final bcwz d;
    private final amhs e;

    public shp(Context context, shk shkVar, bcwz bcwzVar, amhs amhsVar) {
        context.getClass();
        bcwzVar.getClass();
        amhsVar.getClass();
        this.c = context;
        this.b = shkVar;
        this.d = bcwzVar;
        this.e = amhsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.bdod
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.shn
            if (r0 == 0) goto L13
            r0 = r7
            shn r0 = (defpackage.shn) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            shn r0 = new shn
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            ekzz r6 = r0.d
            defpackage.ffci.b(r7)     // Catch: java.lang.Throwable -> L29
            goto L49
        L29:
            r7 = move-exception
            goto L53
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.ffci.b(r7)
            java.lang.String r7 = "VoiceMoodsTransportListener::onBeforeInsertion"
            ekzz r7 = defpackage.eleg.f(r7)
            r0.d = r7     // Catch: java.lang.Throwable -> L4f
            r0.c = r3     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r6 = r5.c(r6, r0)     // Catch: java.lang.Throwable -> L4f
            if (r6 == r1) goto L4e
            r4 = r7
            r7 = r6
            r6 = r4
        L49:
            r0 = 0
            defpackage.ffig.a(r6, r0)
            return r7
        L4e:
            return r1
        L4f:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L53:
            throw r7     // Catch: java.lang.Throwable -> L54
        L54:
            r0 = move-exception
            defpackage.ffig.a(r6, r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.shp.a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.shp.c(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, ffgu):java.lang.Object");
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bdnu
    public final void e(final MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        if (j() && messageCoreData.cX()) {
            Optional a2 = clbh.a(messageCoreData.aa(), clbg.VOICE_MOODS_NAMESPACE, GroupManagementRequest.DATA_TAG);
            final ffji ffjiVar = new ffji() { // from class: shl
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    String str = (String) obj;
                    str.getClass();
                    MessageCoreData messageCoreData2 = MessageCoreData.this;
                    shp shpVar = this;
                    try {
                        MessagePartCoreData G = messageCoreData2.G();
                        if (G != null) {
                            dteh M = G.M();
                            M.getClass();
                            dteg dtegVar = (dteg) M.toBuilder();
                            dtegVar.getClass();
                            dtei.c((dtfd) eyfy.parseFrom(dtfd.a, Base64.decode(str, 2)), dtegVar);
                            G.aL(dtei.a(dtegVar));
                            shk shkVar = shpVar.b;
                            dtfd dtfdVar = G.M().c;
                            if (dtfdVar == null) {
                                dtfdVar = dtfd.a;
                            }
                            int b = dtfg.b(dtfdVar.c);
                            if (b == 0) {
                                b = 1;
                            }
                            akxn a3 = ((akyb) shkVar.a.b()).a();
                            eolu eoluVar = (eolu) eolv.a.createBuilder();
                            eoluVar.getClass();
                            eogy.g(eolt.VOICE_MOOD_EVENT, eoluVar);
                            eqlu eqluVar = (eqlu) eqlw.a.createBuilder();
                            eqluVar.getClass();
                            erco.b(3, eqluVar);
                            erco.c(b, eqluVar);
                            eogy.k(erco.a(eqluVar), eoluVar);
                            a3.i(elfo.e(eogy.a(eoluVar).toBuilder()), alal.LOG_SPEC_VOICE_MOOD_EVENTS);
                            akxn a4 = ((akyb) shkVar.b.b()).a();
                            eolu eoluVar2 = (eolu) eolv.a.createBuilder();
                            eoluVar2.getClass();
                            eogy.g(eolt.VOICE_MOOD_EVENT, eoluVar2);
                            eqlu eqluVar2 = (eqlu) eqlw.a.createBuilder();
                            eqluVar2.getClass();
                            erco.b(5, eqluVar2);
                            eogy.k(erco.a(eqluVar2), eoluVar2);
                            a4.i(elfo.e(eogy.a(eoluVar2).toBuilder()), alal.LOG_SPEC_VOICE_MOOD_EVENTS);
                        }
                    } catch (eygu e) {
                        ((ensz) ((ensz) shp.a.i()).g(e)).q("Failed to deserialize voice mood.");
                    }
                    return ffcu.a;
                }
            };
            a2.ifPresent(new Consumer() { // from class: shm
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    entd entdVar = shp.a;
                    ffji.this.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        bdoc.a(messageCoreData, messageIdType);
    }

    @Override // defpackage.bdod
    public final boolean j() {
        Object e = ardj.g.e();
        e.getClass();
        return ((Boolean) e).booleanValue();
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void k(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bdnu
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void h(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ void i(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bdod
    public final /* synthetic */ Object b(MessageCoreData messageCoreData, List list, ffgu ffguVar) {
        return messageCoreData;
    }
}
