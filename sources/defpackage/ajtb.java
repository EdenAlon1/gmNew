package defpackage;

import android.net.Uri;
import android.text.format.DateUtils;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajtb implements ajss, ajrp {
    public static final /* synthetic */ int b = 0;
    private static final entd c = entd.c("BugleReplies");
    private static final ajso d;
    public final ffhd a;
    private final ffsk e;
    private final ffhd f;
    private final ajtr g;

    static {
        ajsn ajsnVar = (ajsn) ajso.a.createBuilder();
        ajsnVar.getClass();
        ajrs ajrsVar = (ajrs) ajrt.a.createBuilder();
        ajrsVar.getClass();
        ajrv ajrvVar = (ajrv) ajrw.a.createBuilder();
        ajrvVar.getClass();
        ajrx.c(4, ajrvVar);
        ajru.b(ajrx.a(ajrvVar), ajrsVar);
        ajtc.b(ajru.a(ajrsVar), ajsnVar);
        d = ajtc.a(ajsnVar);
    }

    public ajtb(ffsk ffskVar, ffhd ffhdVar, ffhd ffhdVar2, ajtr ajtrVar) {
        ffskVar.getClass();
        ffhdVar.getClass();
        ffhdVar2.getClass();
        this.e = ffskVar;
        this.f = ffhdVar;
        this.a = ffhdVar2;
        this.g = ajtrVar;
    }

    @Override // defpackage.ajrp
    public final RepliedToDataAdapter a(ajqt ajqtVar) {
        return ajsr.a(d(ajqtVar));
    }

    @Override // defpackage.ajss
    public final elfl b(ajqt ajqtVar) {
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        return axol.a(ffra.b(this.e, ekxi.a(ffheVar), ffsmVar, new ajsx(null, this, ajqtVar)));
    }

    @Override // defpackage.ajss
    public final elfl c(MessageIdType messageIdType) {
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        return axol.a(ffra.b(this.e, ekxi.a(ffheVar), ffsmVar, new ajsy(null, this, messageIdType)));
    }

    public final ajso d(ajqt ajqtVar) {
        if (ajqtVar instanceof ajqr) {
            ((ensz) c.h()).q("MessageRepliesQueryResult is an AbsentRepliedToMessage");
            return d;
        }
        if (ajqtVar instanceof ajra) {
            return e((ajra) ajqtVar);
        }
        throw new ffcd();
    }

    public final ajso e(ajra ajraVar) {
        ajrt a;
        String str;
        String str2;
        ajrw b2;
        ajtm a2 = ajtn.a(ajraVar);
        c.n().t("Extracting RepliedToData for snippet type %s", a2);
        ajsn ajsnVar = (ajsn) ajso.a.createBuilder();
        ajsnVar.getClass();
        String b3 = ajraVar.a.b();
        b3.getClass();
        ajsnVar.copyOnWrite();
        ((ajso) ajsnVar.instance).c = b3;
        String str3 = ajraVar.c.a;
        ajsnVar.copyOnWrite();
        ((ajso) ajsnVar.instance).d = str3;
        switch (a2.ordinal()) {
            case 0:
                a = ajtq.a(ajraVar);
                break;
            case 1:
                a = ajts.a(ajraVar);
                break;
            case 2:
                ajtr ajtrVar = this.g;
                ajraVar.getClass();
                ajtm a3 = ajtn.a(ajraVar);
                if (a3 != ajtm.c) {
                    Objects.toString(a3);
                    throw new IllegalArgumentException("Using LinkPreviewContentExtractor on snippet type ".concat(String.valueOf(a3)));
                }
                ajqs ajqsVar = ajraVar.e;
                if (ajqsVar == null) {
                    throw new IllegalStateException("Extracting link preview snippet with null linkPreview");
                }
                if (ajtrVar.a.c()) {
                    long epochMilli = ajtrVar.b.f().toEpochMilli();
                    if (!ajqsVar.e && ajqsVar.b > epochMilli && (str = ajqsVar.c) != null && (str2 = ajqsVar.d) != null) {
                        ajrs ajrsVar = (ajrs) ajrt.a.createBuilder();
                        ajrsVar.getClass();
                        ajru.c(ajraVar.b(), ajrsVar);
                        ajrv ajrvVar = (ajrv) ajrw.a.createBuilder();
                        ajrvVar.getClass();
                        ajrx.b(str, ajrvVar);
                        ajru.b(ajrx.a(ajrvVar), ajrsVar);
                        ajsi ajsiVar = (ajsi) ajsj.a.createBuilder();
                        ajsiVar.getClass();
                        ajry ajryVar = (ajry) ajrz.a.createBuilder();
                        ajryVar.getClass();
                        ajsa.b(str2, ajryVar);
                        ajsk.b(ajsa.a(ajryVar), ajsiVar);
                        ajru.d(ajsk.a(ajsiVar), ajrsVar);
                        a = ajru.a(ajrsVar);
                        break;
                    }
                }
                a = ajts.a(ajraVar);
                break;
                break;
            case 3:
                ajraVar.getClass();
                ajtm a4 = ajtn.a(ajraVar);
                if (a4 != ajtm.d) {
                    Objects.toString(a4);
                    throw new IllegalArgumentException("Using ImageContentExtractor on snippet type ".concat(String.valueOf(a4)));
                }
                ajrs ajrsVar2 = (ajrs) ajrt.a.createBuilder();
                ajrsVar2.getClass();
                ajru.c(ajraVar.b(), ajrsVar2);
                ajrv ajrvVar2 = (ajrv) ajrw.a.createBuilder();
                ajrvVar2.getClass();
                ajrx.c(5, ajrvVar2);
                ajru.b(ajrx.a(ajrvVar2), ajrsVar2);
                String c2 = ajraVar.c();
                if (c2 == null) {
                    throw new IllegalStateException("ImageContentExtractor with null content type");
                }
                Uri a5 = ajraVar.a();
                if (a5 == null) {
                    throw new IllegalStateException("ImageContentExtractor with null content URI");
                }
                ajru.d(ajtp.a(c2, a5), ajrsVar2);
                a = ajru.a(ajrsVar2);
                break;
            case 4:
                ajraVar.getClass();
                ajtm a6 = ajtn.a(ajraVar);
                if (a6 != ajtm.e) {
                    Objects.toString(a6);
                    throw new IllegalArgumentException("Using AudioContentExtractor on snippet type ".concat(String.valueOf(a6)));
                }
                ajrs ajrsVar3 = (ajrs) ajrt.a.createBuilder();
                ajrsVar3.getClass();
                Long valueOf = Long.valueOf(ajraVar.d.e);
                boolean z = valueOf.longValue() > 0;
                Boolean.valueOf(z).getClass();
                if (true != z) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    long longValue = valueOf.longValue();
                    ajrv ajrvVar3 = (ajrv) ajrw.a.createBuilder();
                    ajrvVar3.getClass();
                    ajrx.b(DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(longValue)), ajrvVar3);
                    b2 = ajrx.a(ajrvVar3);
                } else {
                    b2 = ajraVar.b();
                }
                ajru.c(b2, ajrsVar3);
                ajrv ajrvVar4 = (ajrv) ajrw.a.createBuilder();
                ajrvVar4.getClass();
                ajrx.c(6, ajrvVar4);
                ajru.b(ajrx.a(ajrvVar4), ajrsVar3);
                ajsi ajsiVar2 = (ajsi) ajsj.a.createBuilder();
                ajsiVar2.getClass();
                ajsf ajsfVar = (ajsf) ajsg.a.createBuilder();
                ajsfVar.getClass();
                ajsh.b(3, ajsfVar);
                ajsk.c(ajsh.a(ajsfVar), ajsiVar2);
                ajru.d(ajsk.a(ajsiVar2), ajrsVar3);
                a = ajru.a(ajrsVar3);
                break;
            case 5:
                ajraVar.getClass();
                ajtm a7 = ajtn.a(ajraVar);
                if (a7 != ajtm.f) {
                    Objects.toString(a7);
                    throw new IllegalArgumentException("Using VideoContentExtractor on snippet type ".concat(String.valueOf(a7)));
                }
                ajrs ajrsVar4 = (ajrs) ajrt.a.createBuilder();
                ajrsVar4.getClass();
                ajru.c(ajraVar.b(), ajrsVar4);
                ajrv ajrvVar5 = (ajrv) ajrw.a.createBuilder();
                ajrvVar5.getClass();
                ajrx.c(8, ajrvVar5);
                ajru.b(ajrx.a(ajrvVar5), ajrsVar4);
                String c3 = ajraVar.c();
                if (c3 == null) {
                    throw new IllegalStateException("VideoContentExtractor with null content type");
                }
                Uri a8 = ajraVar.a();
                if (a8 == null) {
                    throw new IllegalStateException("VideoContentExtractor with null content URI");
                }
                ajru.d(ajtp.a(c3, a8), ajrsVar4);
                a = ajru.a(ajrsVar4);
                break;
            case 6:
            case 7:
                a = ajtq.a(ajraVar);
                break;
            default:
                throw new ffcd();
        }
        ajtc.b(a, ajsnVar);
        eyja eyjaVar = ajraVar.b;
        ajsnVar.copyOnWrite();
        ajso ajsoVar = (ajso) ajsnVar.instance;
        ajsoVar.g = eyjaVar;
        ajsoVar.b |= 2;
        return ajtc.a(ajsnVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ajqt r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ajsv
            if (r0 == 0) goto L13
            r0 = r7
            ajsv r0 = (defpackage.ajsv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajsv r0 = new ajsv
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r7)
            ffhd r7 = r5.f
            ffhd r7 = defpackage.ekxi.a(r7)
            ajst r2 = new ajst
            r4 = 0
            r2.<init>(r4, r5, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.ffra.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajtb.f(ajqt, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r6, defpackage.ffgu r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ajsw
            if (r0 == 0) goto L13
            r0 = r7
            ajsw r0 = (defpackage.ajsw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ajsw r0 = new ajsw
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r7)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.ffci.b(r7)
            ffhd r7 = r5.f
            ffhd r7 = defpackage.ekxi.a(r7)
            ajsu r2 = new ajsu
            r4 = 0
            r2.<init>(r4, r5, r6)
            r0.c = r3
            java.lang.Object r7 = defpackage.ffra.a(r7, r2, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r7.getClass()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajtb.g(com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, ffgu):java.lang.Object");
    }
}
