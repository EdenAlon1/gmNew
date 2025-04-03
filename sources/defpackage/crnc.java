package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crnc {
    public static final cskc a = cskc.g("BugleAnnotation", "MessageAnnotationUtils");
    public static final cfuz b = cfvl.s(cfvl.b, "otp_message_annotations_grammar", new emyl() { // from class: crmw
        @Override // defpackage.emyl
        public final Object get() {
            cskc cskcVar = crnc.a;
            emhj emhjVar = (emhj) emhk.a.createBuilder();
            emhl emhlVar = (emhl) emhm.a.createBuilder();
            emhlVar.copyOnWrite();
            ((emhm) emhlVar.instance).b = "(?i)((otp|sms|secret|safepass|unique\\s+id|secure|security|authorization|authentication|access|login|verification|confirmation|check|password\\s+reset|one-time|identification|activation|registration|validation)\\s+){1,3}code(\\s+(for(\\s+[^\\s]+){1,3}|you\\s+requested))?(\\s+is:?|:)?\\s+(?-i)([a-z]-|[\"'\\(])?([A-Z0-9]{4,})[\"'\\)]?(\\s|\\.|,)";
            emhlVar.copyOnWrite();
            ((emhm) emhlVar.instance).c = 8;
            emhlVar.copyOnWrite();
            ((emhm) emhlVar.instance).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            emhjVar.a(emhlVar);
            emhl emhlVar2 = (emhl) emhm.a.createBuilder();
            emhlVar2.copyOnWrite();
            ((emhm) emhlVar2.instance).b = "(?-i)([a-z]-|[\"'\\(])?([A-Z0-9]{4,})[\"'\\)]?(?i)(\\s+is\\s+your)?(\\s+facebook|\\s+messenger){0,2}(\\s+[^\\s]+){0,2}(\\s+(otp|sms|secret|safepass|unique\\s+id|secure|security|authorization|authentication|access|login|verification|confirmation|check|password\\s+reset|one-time|identification|activation|registration|validation)){1,3}\\s+code";
            emhlVar2.copyOnWrite();
            ((emhm) emhlVar2.instance).c = 2;
            emhlVar2.copyOnWrite();
            ((emhm) emhlVar2.instance).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            emhjVar.a(emhlVar2);
            emhl emhlVar3 = (emhl) emhm.a.createBuilder();
            emhlVar3.copyOnWrite();
            ((emhm) emhlVar3.instance).b = "^(?i)([^\\s]+\\s+)?your\\s+([^\\s]+\\s+){0,2}code(\\s+is:?|:)\\s+(?-i)([a-z]-|[\"'\\(])?([A-Z0-9]{4,})[\"'\\)]?(\\s|\\.)";
            emhlVar3.copyOnWrite();
            ((emhm) emhlVar3.instance).c = 5;
            emhlVar3.copyOnWrite();
            ((emhm) emhlVar3.instance).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            emhjVar.a(emhlVar3);
            emhl emhlVar4 = (emhl) emhm.a.createBuilder();
            emhlVar4.copyOnWrite();
            ((emhm) emhlVar4.instance).b = "^(?-i)([a-z]-|[\"'\\(])?([A-Z0-9]{4,})[\"'\\)]?(?i)\\s+is\\s+your\\s+([^\\s]+\\s+)?code(\\.|\\s+for|\\s+to)";
            emhlVar4.copyOnWrite();
            ((emhm) emhlVar4.instance).c = 2;
            emhlVar4.copyOnWrite();
            ((emhm) emhlVar4.instance).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            emhjVar.a(emhlVar4);
            emhl emhlVar5 = (emhl) emhm.a.createBuilder();
            emhlVar5.copyOnWrite();
            ((emhm) emhlVar5.instance).b = "(?i)(enter|use)\\s+(the\\s+|this\\s+)?([^\\s]+\\s+)?code:?\\s+(?-i)([a-z]-|[\"'\\(])?([A-Z0-9]{4,})[\"'\\)]?(?i)\\s+to\\s+(confirm|verify)";
            emhlVar5.copyOnWrite();
            ((emhm) emhlVar5.instance).c = 5;
            emhlVar5.copyOnWrite();
            ((emhm) emhlVar5.instance).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            emhjVar.a(emhlVar5);
            emhl emhlVar6 = (emhl) emhm.a.createBuilder();
            emhlVar6.copyOnWrite();
            ((emhm) emhlVar6.instance).b = "^(?i)([^\\s]+\\s+)?code(\\s+is:?|:)?\\s+(?-i)([a-z]-|[\"'\\(])?([A-Z0-9]{4,})[\"'\\)]?(\\.|\\s)$";
            emhlVar6.copyOnWrite();
            ((emhm) emhlVar6.instance).c = 4;
            emhlVar6.copyOnWrite();
            ((emhm) emhlVar6.instance).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            emhjVar.a(emhlVar6);
            emhl emhlVar7 = (emhl) emhm.a.createBuilder();
            emhlVar7.copyOnWrite();
            ((emhm) emhlVar7.instance).b = "^(?i)use\\s+(?-i)([A-Z0-9]{4,})(?i)\\s+as(\\s+your)?(\\s+microsoft\\s+account|\\s+instagram)(\\s+[^\\s]+){0,2}\\s+code";
            emhlVar7.copyOnWrite();
            ((emhm) emhlVar7.instance).c = 1;
            emhlVar7.copyOnWrite();
            ((emhm) emhlVar7.instance).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            emhjVar.a(emhlVar7);
            emhl emhlVar8 = (emhl) emhm.a.createBuilder();
            emhlVar8.copyOnWrite();
            ((emhm) emhlVar8.instance).b = "^(?i)snapchat\\s+code:\\s+(?-i)([A-Z0-9]{4,})\\.";
            emhlVar8.copyOnWrite();
            ((emhm) emhlVar8.instance).c = 1;
            emhlVar8.copyOnWrite();
            ((emhm) emhlVar8.instance).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            emhjVar.a(emhlVar8);
            emhl emhlVar9 = (emhl) emhm.a.createBuilder();
            emhlVar9.copyOnWrite();
            ((emhm) emhlVar9.instance).b = "^(?i)enter\\s+this\\s+code\\s+to\\s+reset\\s+your\\s+twitter\\s+password:\\s+(?-i)([A-Z0-9]{4,})\\.?";
            emhlVar9.copyOnWrite();
            ((emhm) emhlVar9.instance).c = 1;
            emhlVar9.copyOnWrite();
            ((emhm) emhlVar9.instance).d = "[0-9A-Z]*[0-9][0-9A-Z]*";
            emhjVar.a(emhlVar9);
            return ((emhk) emhjVar.build()).toByteArray();
        }
    });
    public final fazb c;
    public final ctgw d;
    public final ffbr e;
    public final ffbr f;
    public final crnj g = new crnj();
    public final ctgw h;
    public final errl i;
    public final errl j;
    public final ffbr k;
    private final Context l;
    private final ffbr m;
    private final crmq n;
    private final ffbr o;
    private final ffbr p;

    public crnc(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, fazb fazbVar, ffbr ffbrVar4, ctgw ctgwVar, ctgw ctgwVar2, errl errlVar, errl errlVar2, ffbr ffbrVar5, ffbr ffbrVar6) {
        this.l = context;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.m = ffbrVar3;
        this.c = fazbVar;
        this.o = ffbrVar4;
        this.n = new crmq(errlVar2, this);
        this.d = ctgwVar;
        this.h = ctgwVar2;
        this.i = errlVar;
        this.j = errlVar2;
        this.k = ffbrVar5;
        this.p = ffbrVar6;
    }

    public static boolean g(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fbuk fbukVar = (fbuk) it.next();
            fbqt b2 = fbqt.b(fbukVar.e);
            if (b2 == null) {
                b2 = fbqt.UNRECOGNIZED;
            }
            if (b2 == fbqt.ADDRESS_ANNOTATION && fbukVar.c == 7) {
                return true;
            }
        }
        return false;
    }

    public static boolean i() {
        return ((Boolean) ctim.i.e()).booleanValue();
    }

    public static boolean j() {
        return ((Boolean) ctim.b.e()).booleanValue() || k() || ((Boolean) ctim.d.e()).booleanValue() || ((Boolean) ctim.f.e()).booleanValue() || ((Boolean) ctim.g.e()).booleanValue() || ((Boolean) ctim.h.e()).booleanValue();
    }

    private static boolean k() {
        return ((Boolean) ctim.c.e()).booleanValue();
    }

    public final elfl a(String str, final MessageIdType messageIdType, final fbqp fbqpVar) {
        if (TextUtils.isEmpty(str)) {
            return elfo.d(new IllegalArgumentException("otpCode id is null"));
        }
        cuxz cuxzVar = (cuxz) this.o.b();
        if (cuxzVar != null) {
            cuxzVar.b(str, this.l.getString(R.string.otp_copied_to_clipboard));
        }
        if (!messageIdType.c()) {
            return elfo.g(new Callable() { // from class: crmv
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    crnc crncVar = crnc.this;
                    MessageIdType messageIdType2 = messageIdType;
                    fbqp fbqpVar2 = fbqpVar;
                    try {
                        MessageCoreData v = ((bdmq) crncVar.f.b()).v(messageIdType2);
                        if (v == null) {
                            csjb e = crnc.a.e();
                            e.I("Couldn't read message when trying to copy otp code.");
                            e.d(messageIdType2);
                            e.r();
                        } else {
                            eotx eotxVar = (eotx) eoty.a.createBuilder();
                            eotxVar.copyOnWrite();
                            eoty eotyVar = (eoty) eotxVar.instance;
                            eotyVar.d = fbqpVar2.a();
                            eotyVar.b |= 2;
                            eotxVar.copyOnWrite();
                            eoty eotyVar2 = (eoty) eotxVar.instance;
                            eotyVar2.c = fbqr.a(3);
                            eotyVar2.b |= 1;
                            ((altk) crncVar.k.b()).X(v, (eoty) eotxVar.build());
                        }
                        return null;
                    } catch (Exception e2) {
                        csjb b2 = crnc.a.b();
                        b2.I("Couldn't log otp copy.");
                        b2.d(messageIdType2);
                        b2.A("actionSource", fbqpVar2);
                        b2.s(e2);
                        return null;
                    }
                }
            }, this.i);
        }
        csjb e = a.e();
        e.I("No message id passed");
        e.M("OTP code", str);
        e.r();
        return elfo.d(new IllegalArgumentException("Message id is null"));
    }

    public final elfl b(String str) {
        return !k() ? elfo.e(null) : this.d.a(str).h(new emwl() { // from class: crmt
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = crnc.a;
                for (fbuk fbukVar : (List) obj) {
                    if (fbukVar.c == 7) {
                        return fbukVar;
                    }
                }
                return null;
            }
        }, this.j);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.elfl c(final java.lang.String r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto La8
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 == 0) goto Lb
            goto La8
        Lb:
            boolean r1 = defpackage.cuxu.b(r11)
            if (r1 != 0) goto L16
            elfl r11 = defpackage.elfo.e(r0)
            return r11
        L16:
            crmq r0 = r10.n
            android.net.Uri r1 = android.net.Uri.parse(r11)
            fbrx r2 = defpackage.fbrx.a
            eyfq r2 = r2.createBuilder()
            fbrw r2 = (defpackage.fbrw) r2
            java.lang.String r3 = r1.getPath()
            r4 = 0
            if (r3 == 0) goto L7e
            java.util.regex.Pattern r5 = defpackage.crmq.b
            java.util.regex.Matcher r5 = r5.matcher(r3)
            boolean r6 = r5.find()
            java.lang.String r7 = ""
            java.lang.String r8 = "UTF-8"
            r9 = 1
            if (r6 == 0) goto L4c
            java.lang.String r5 = r5.group(r9)     // Catch: java.io.UnsupportedEncodingException -> L4c
            if (r5 != 0) goto L43
            r5 = r7
        L43:
            java.lang.String r5 = j$.net.URLDecoder.decode(r5, r8)     // Catch: java.io.UnsupportedEncodingException -> L4c
            boolean r5 = defpackage.crmq.c(r5, r2)     // Catch: java.io.UnsupportedEncodingException -> L4c
            goto L4d
        L4c:
            r5 = r4
        L4d:
            java.util.regex.Pattern r6 = defpackage.crmq.a
            java.util.regex.Matcher r3 = r6.matcher(r3)
            boolean r6 = r3.find()
            if (r6 == 0) goto L75
            java.lang.String r3 = r3.group(r9)     // Catch: java.io.UnsupportedEncodingException -> L7e
            if (r3 != 0) goto L60
            goto L61
        L60:
            r7 = r3
        L61:
            java.lang.String r3 = j$.net.URLDecoder.decode(r7, r8)     // Catch: java.io.UnsupportedEncodingException -> L7e
            elfl r3 = r0.a(r3, r2)     // Catch: java.io.UnsupportedEncodingException -> L7e
            crml r6 = new crml     // Catch: java.io.UnsupportedEncodingException -> L7e
            r6.<init>()     // Catch: java.io.UnsupportedEncodingException -> L7e
            errl r5 = r0.d     // Catch: java.io.UnsupportedEncodingException -> L7e
            elfl r3 = r3.h(r6, r5)     // Catch: java.io.UnsupportedEncodingException -> L7e
            goto L86
        L75:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            elfl r3 = defpackage.elfo.e(r3)
            goto L86
        L7e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            elfl r3 = defpackage.elfo.e(r3)
        L86:
            crmm r4 = new crmm
            r4.<init>()
            errl r5 = r0.d
            elfl r3 = r3.i(r4, r5)
            crmn r4 = new crmn
            r4.<init>()
            errl r1 = r0.d
            elfl r1 = r3.h(r4, r1)
            crmo r3 = new crmo
            r3.<init>()
            errl r11 = r0.d
            elfl r11 = r1.h(r3, r11)
            return r11
        La8:
            elfl r11 = defpackage.elfo.e(r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crnc.c(java.lang.String):elfl");
    }

    public final eoit d(MessageCoreData messageCoreData, String str, fbqt fbqtVar) {
        ParticipantsTable.BindData b2 = ((bdrr) this.m.b()).b(messageCoreData.aA());
        eoir eoirVar = (eoir) eoit.a.createBuilder();
        int s = b2 != null ? bdqu.s(b2) : 1;
        eoirVar.copyOnWrite();
        eoit eoitVar = (eoit) eoirVar.instance;
        eoitVar.d = s - 1;
        eoitVar.b |= 2;
        boolean z = false;
        if (b2 != null && TextUtils.isEmpty(b2.T())) {
            z = true;
        }
        eoirVar.copyOnWrite();
        eoit eoitVar2 = (eoit) eoirVar.instance;
        eoitVar2.b |= 4;
        eoitVar2.e = z;
        eoirVar.copyOnWrite();
        eoit eoitVar3 = (eoit) eoirVar.instance;
        eoitVar3.c = fbqtVar.a();
        eoitVar3.b |= 1;
        eoirVar.copyOnWrite();
        eoit eoitVar4 = (eoit) eoirVar.instance;
        eoitVar4.b |= 64;
        eoitVar4.h = str;
        return (eoit) eoirVar.build();
    }

    public final void e(SuggestionData suggestionData, fbqp fbqpVar) {
        if (suggestionData instanceof SmartSuggestionItemSuggestionData) {
            fbxa fbxaVar = ((SmartSuggestionItemSuggestionData) suggestionData).c;
            String str = (fbxaVar.c == 18 ? (fbva) fbxaVar.d : fbva.a).b;
            fbwy fbwyVar = fbxaVar.e;
            if (fbwyVar == null) {
                fbwyVar = fbwy.b;
            }
            MessageIdType b2 = bdhb.b(fbwyVar.m);
            fbwy fbwyVar2 = fbxaVar.e;
            if (fbwyVar2 == null) {
                fbwyVar2 = fbwy.b;
            }
            ConversationIdType b3 = bdgq.b(fbwyVar2.n);
            elfr.l(a(str, b2, fbqpVar), axou.a(new crnb()), this.i);
            if (b3.b()) {
                return;
            }
            ((bbfd) this.p.b()).d(b3);
        }
    }

    public final void f(MessageCoreData messageCoreData) {
        fbuk b2;
        if (h() && (b2 = ((crnf) this.c.b()).b(messageCoreData, true)) != null) {
            ((ctgv) this.e.b()).b(messageCoreData.z(), messageCoreData.B(), engw.r(b2));
        }
    }

    public final boolean h() {
        return ((crnf) this.c.b()).c((byte[]) b.e());
    }
}
