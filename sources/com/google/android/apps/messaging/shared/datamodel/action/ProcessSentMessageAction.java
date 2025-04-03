package com.google.android.apps.messaging.shared.datamodel.action;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessSentMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementResponse;
import defpackage.arqd;
import defpackage.arqf;
import defpackage.awua;
import defpackage.awuc;
import defpackage.awud;
import defpackage.awyp;
import defpackage.baoh;
import defpackage.baoi;
import defpackage.bbcg;
import defpackage.bbfr;
import defpackage.bdgr;
import defpackage.bdhb;
import defpackage.bdhg;
import defpackage.covh;
import defpackage.coxc;
import defpackage.csmz;
import defpackage.dipx;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.elfl;
import defpackage.emxf;
import defpackage.emyl;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ente;
import defpackage.eogt;
import defpackage.eopp;
import defpackage.eopq;
import defpackage.eqxi;
import defpackage.eqyl;
import defpackage.ersq;
import defpackage.eyev;
import defpackage.eykj;
import defpackage.ffix;
import defpackage.fgjz;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ProcessSentMessageAction extends Action<Void> {
    public final baoi b;
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/action/ProcessSentMessageAction");
    public static final Parcelable.Creator<Action<?>> CREATOR = new baoh();

    /* compiled from: PG */
    public interface a {
        bbfr bi();
    }

    private ProcessSentMessageAction(baoi baoiVar) {
        super(eogt.PROCESS_SENT_MESSAGE_ACTION);
        this.b = baoiVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("ProcessSentMessageAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.ProcessSentMessage.ExecuteAction.Latency";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final elfl e() {
        bdhg b = bdhg.b(this.t.f(), "rcs_message_id");
        if (b.k() && this.t.b("status", 2) == 0) {
            baoi baoiVar = this.b;
            baoiVar.f.d(b, bdhb.a, true);
        }
        ((covh) this.b.k.b()).c(b, 1);
        covh covhVar = (covh) this.b.k.b();
        baoi baoiVar2 = this.b;
        return covhVar.a(b, baoiVar2.l, new ffix() { // from class: baof
            @Override // defpackage.ffix
            public final Object invoke() {
                return ProcessSentMessageAction.this.b();
            }
        });
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final Void b() {
        ensk h = a.h();
        h.Y(ente.a, "BugleDataModel");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/datamodel/action/ProcessSentMessageAction", "executeAction", 677, "ProcessSentMessageAction.java")).q("ProcessSentMessageAction::executeInScope");
        ekzz f = eleg.f("ProcessSentMessageAction::executeActionInScope");
        try {
            Void r1 = (Void) this.b.i.b(new emyl() { // from class: baog
                /* JADX WARN: Removed duplicated region for block: B:121:0x04ca A[Catch: all -> 0x0536, TryCatch #3 {all -> 0x0536, blocks: (B:6:0x0038, B:8:0x007d, B:9:0x0089, B:12:0x009d, B:14:0x0144, B:17:0x016c, B:20:0x01c8, B:163:0x01e7, B:25:0x0217, B:28:0x0221, B:30:0x0230, B:32:0x0236, B:33:0x025e, B:35:0x026a, B:36:0x027b, B:39:0x0286, B:41:0x028c, B:43:0x02a1, B:45:0x02a5, B:47:0x02c9, B:49:0x0334, B:51:0x033a, B:54:0x0341, B:58:0x035d, B:61:0x0387, B:142:0x0393, B:64:0x03c3, B:66:0x03cd, B:68:0x03d7, B:70:0x03ff, B:72:0x040f, B:73:0x0413, B:75:0x0457, B:76:0x0419, B:77:0x041c, B:78:0x041f, B:79:0x0422, B:80:0x0425, B:81:0x0428, B:82:0x042b, B:83:0x042e, B:84:0x0431, B:85:0x0434, B:86:0x0437, B:87:0x043a, B:88:0x043d, B:89:0x0440, B:90:0x0443, B:91:0x0446, B:92:0x0449, B:93:0x044c, B:94:0x044f, B:95:0x0452, B:96:0x0455, B:97:0x045b, B:100:0x047a, B:103:0x048a, B:105:0x0490, B:106:0x0496, B:109:0x049e, B:111:0x04a4, B:112:0x04aa, B:114:0x04b0, B:116:0x04b6, B:118:0x04bc, B:119:0x04c2, B:121:0x04ca, B:123:0x04d0, B:124:0x04d3, B:125:0x04d5, B:128:0x04df, B:130:0x04e7, B:132:0x04ed, B:133:0x04f0, B:134:0x04f2, B:136:0x0500, B:137:0x050d, B:138:0x0509, B:146:0x03a7, B:148:0x02a8, B:149:0x02be, B:152:0x02e6, B:154:0x030f, B:167:0x01ee, B:169:0x0178, B:171:0x0186, B:172:0x018b, B:174:0x0191, B:175:0x01a0, B:177:0x0154, B:178:0x00b1, B:180:0x00b7, B:181:0x00c6, B:183:0x00d8, B:185:0x00de, B:188:0x0105, B:190:0x010a, B:191:0x0128, B:202:0x013b, B:201:0x0138, B:187:0x00ee, B:197:0x0133), top: B:5:0x0038, inners: #1, #2, #4, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:127:0x04dd A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:132:0x04ed A[Catch: all -> 0x0536, TryCatch #3 {all -> 0x0536, blocks: (B:6:0x0038, B:8:0x007d, B:9:0x0089, B:12:0x009d, B:14:0x0144, B:17:0x016c, B:20:0x01c8, B:163:0x01e7, B:25:0x0217, B:28:0x0221, B:30:0x0230, B:32:0x0236, B:33:0x025e, B:35:0x026a, B:36:0x027b, B:39:0x0286, B:41:0x028c, B:43:0x02a1, B:45:0x02a5, B:47:0x02c9, B:49:0x0334, B:51:0x033a, B:54:0x0341, B:58:0x035d, B:61:0x0387, B:142:0x0393, B:64:0x03c3, B:66:0x03cd, B:68:0x03d7, B:70:0x03ff, B:72:0x040f, B:73:0x0413, B:75:0x0457, B:76:0x0419, B:77:0x041c, B:78:0x041f, B:79:0x0422, B:80:0x0425, B:81:0x0428, B:82:0x042b, B:83:0x042e, B:84:0x0431, B:85:0x0434, B:86:0x0437, B:87:0x043a, B:88:0x043d, B:89:0x0440, B:90:0x0443, B:91:0x0446, B:92:0x0449, B:93:0x044c, B:94:0x044f, B:95:0x0452, B:96:0x0455, B:97:0x045b, B:100:0x047a, B:103:0x048a, B:105:0x0490, B:106:0x0496, B:109:0x049e, B:111:0x04a4, B:112:0x04aa, B:114:0x04b0, B:116:0x04b6, B:118:0x04bc, B:119:0x04c2, B:121:0x04ca, B:123:0x04d0, B:124:0x04d3, B:125:0x04d5, B:128:0x04df, B:130:0x04e7, B:132:0x04ed, B:133:0x04f0, B:134:0x04f2, B:136:0x0500, B:137:0x050d, B:138:0x0509, B:146:0x03a7, B:148:0x02a8, B:149:0x02be, B:152:0x02e6, B:154:0x030f, B:167:0x01ee, B:169:0x0178, B:171:0x0186, B:172:0x018b, B:174:0x0191, B:175:0x01a0, B:177:0x0154, B:178:0x00b1, B:180:0x00b7, B:181:0x00c6, B:183:0x00d8, B:185:0x00de, B:188:0x0105, B:190:0x010a, B:191:0x0128, B:202:0x013b, B:201:0x0138, B:187:0x00ee, B:197:0x0133), top: B:5:0x0038, inners: #1, #2, #4, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:133:0x04f0 A[Catch: all -> 0x0536, TryCatch #3 {all -> 0x0536, blocks: (B:6:0x0038, B:8:0x007d, B:9:0x0089, B:12:0x009d, B:14:0x0144, B:17:0x016c, B:20:0x01c8, B:163:0x01e7, B:25:0x0217, B:28:0x0221, B:30:0x0230, B:32:0x0236, B:33:0x025e, B:35:0x026a, B:36:0x027b, B:39:0x0286, B:41:0x028c, B:43:0x02a1, B:45:0x02a5, B:47:0x02c9, B:49:0x0334, B:51:0x033a, B:54:0x0341, B:58:0x035d, B:61:0x0387, B:142:0x0393, B:64:0x03c3, B:66:0x03cd, B:68:0x03d7, B:70:0x03ff, B:72:0x040f, B:73:0x0413, B:75:0x0457, B:76:0x0419, B:77:0x041c, B:78:0x041f, B:79:0x0422, B:80:0x0425, B:81:0x0428, B:82:0x042b, B:83:0x042e, B:84:0x0431, B:85:0x0434, B:86:0x0437, B:87:0x043a, B:88:0x043d, B:89:0x0440, B:90:0x0443, B:91:0x0446, B:92:0x0449, B:93:0x044c, B:94:0x044f, B:95:0x0452, B:96:0x0455, B:97:0x045b, B:100:0x047a, B:103:0x048a, B:105:0x0490, B:106:0x0496, B:109:0x049e, B:111:0x04a4, B:112:0x04aa, B:114:0x04b0, B:116:0x04b6, B:118:0x04bc, B:119:0x04c2, B:121:0x04ca, B:123:0x04d0, B:124:0x04d3, B:125:0x04d5, B:128:0x04df, B:130:0x04e7, B:132:0x04ed, B:133:0x04f0, B:134:0x04f2, B:136:0x0500, B:137:0x050d, B:138:0x0509, B:146:0x03a7, B:148:0x02a8, B:149:0x02be, B:152:0x02e6, B:154:0x030f, B:167:0x01ee, B:169:0x0178, B:171:0x0186, B:172:0x018b, B:174:0x0191, B:175:0x01a0, B:177:0x0154, B:178:0x00b1, B:180:0x00b7, B:181:0x00c6, B:183:0x00d8, B:185:0x00de, B:188:0x0105, B:190:0x010a, B:191:0x0128, B:202:0x013b, B:201:0x0138, B:187:0x00ee, B:197:0x0133), top: B:5:0x0038, inners: #1, #2, #4, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:136:0x0500 A[Catch: all -> 0x0536, TryCatch #3 {all -> 0x0536, blocks: (B:6:0x0038, B:8:0x007d, B:9:0x0089, B:12:0x009d, B:14:0x0144, B:17:0x016c, B:20:0x01c8, B:163:0x01e7, B:25:0x0217, B:28:0x0221, B:30:0x0230, B:32:0x0236, B:33:0x025e, B:35:0x026a, B:36:0x027b, B:39:0x0286, B:41:0x028c, B:43:0x02a1, B:45:0x02a5, B:47:0x02c9, B:49:0x0334, B:51:0x033a, B:54:0x0341, B:58:0x035d, B:61:0x0387, B:142:0x0393, B:64:0x03c3, B:66:0x03cd, B:68:0x03d7, B:70:0x03ff, B:72:0x040f, B:73:0x0413, B:75:0x0457, B:76:0x0419, B:77:0x041c, B:78:0x041f, B:79:0x0422, B:80:0x0425, B:81:0x0428, B:82:0x042b, B:83:0x042e, B:84:0x0431, B:85:0x0434, B:86:0x0437, B:87:0x043a, B:88:0x043d, B:89:0x0440, B:90:0x0443, B:91:0x0446, B:92:0x0449, B:93:0x044c, B:94:0x044f, B:95:0x0452, B:96:0x0455, B:97:0x045b, B:100:0x047a, B:103:0x048a, B:105:0x0490, B:106:0x0496, B:109:0x049e, B:111:0x04a4, B:112:0x04aa, B:114:0x04b0, B:116:0x04b6, B:118:0x04bc, B:119:0x04c2, B:121:0x04ca, B:123:0x04d0, B:124:0x04d3, B:125:0x04d5, B:128:0x04df, B:130:0x04e7, B:132:0x04ed, B:133:0x04f0, B:134:0x04f2, B:136:0x0500, B:137:0x050d, B:138:0x0509, B:146:0x03a7, B:148:0x02a8, B:149:0x02be, B:152:0x02e6, B:154:0x030f, B:167:0x01ee, B:169:0x0178, B:171:0x0186, B:172:0x018b, B:174:0x0191, B:175:0x01a0, B:177:0x0154, B:178:0x00b1, B:180:0x00b7, B:181:0x00c6, B:183:0x00d8, B:185:0x00de, B:188:0x0105, B:190:0x010a, B:191:0x0128, B:202:0x013b, B:201:0x0138, B:187:0x00ee, B:197:0x0133), top: B:5:0x0038, inners: #1, #2, #4, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:138:0x0509 A[Catch: all -> 0x0536, TryCatch #3 {all -> 0x0536, blocks: (B:6:0x0038, B:8:0x007d, B:9:0x0089, B:12:0x009d, B:14:0x0144, B:17:0x016c, B:20:0x01c8, B:163:0x01e7, B:25:0x0217, B:28:0x0221, B:30:0x0230, B:32:0x0236, B:33:0x025e, B:35:0x026a, B:36:0x027b, B:39:0x0286, B:41:0x028c, B:43:0x02a1, B:45:0x02a5, B:47:0x02c9, B:49:0x0334, B:51:0x033a, B:54:0x0341, B:58:0x035d, B:61:0x0387, B:142:0x0393, B:64:0x03c3, B:66:0x03cd, B:68:0x03d7, B:70:0x03ff, B:72:0x040f, B:73:0x0413, B:75:0x0457, B:76:0x0419, B:77:0x041c, B:78:0x041f, B:79:0x0422, B:80:0x0425, B:81:0x0428, B:82:0x042b, B:83:0x042e, B:84:0x0431, B:85:0x0434, B:86:0x0437, B:87:0x043a, B:88:0x043d, B:89:0x0440, B:90:0x0443, B:91:0x0446, B:92:0x0449, B:93:0x044c, B:94:0x044f, B:95:0x0452, B:96:0x0455, B:97:0x045b, B:100:0x047a, B:103:0x048a, B:105:0x0490, B:106:0x0496, B:109:0x049e, B:111:0x04a4, B:112:0x04aa, B:114:0x04b0, B:116:0x04b6, B:118:0x04bc, B:119:0x04c2, B:121:0x04ca, B:123:0x04d0, B:124:0x04d3, B:125:0x04d5, B:128:0x04df, B:130:0x04e7, B:132:0x04ed, B:133:0x04f0, B:134:0x04f2, B:136:0x0500, B:137:0x050d, B:138:0x0509, B:146:0x03a7, B:148:0x02a8, B:149:0x02be, B:152:0x02e6, B:154:0x030f, B:167:0x01ee, B:169:0x0178, B:171:0x0186, B:172:0x018b, B:174:0x0191, B:175:0x01a0, B:177:0x0154, B:178:0x00b1, B:180:0x00b7, B:181:0x00c6, B:183:0x00d8, B:185:0x00de, B:188:0x0105, B:190:0x010a, B:191:0x0128, B:202:0x013b, B:201:0x0138, B:187:0x00ee, B:197:0x0133), top: B:5:0x0038, inners: #1, #2, #4, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:140:0x03fb  */
                /* JADX WARN: Removed duplicated region for block: B:141:0x0393 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:147:0x0385  */
                /* JADX WARN: Removed duplicated region for block: B:161:0x0328  */
                /* JADX WARN: Removed duplicated region for block: B:162:0x01e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:168:0x0176  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0175  */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0217 A[Catch: all -> 0x0536, TRY_ENTER, TryCatch #3 {all -> 0x0536, blocks: (B:6:0x0038, B:8:0x007d, B:9:0x0089, B:12:0x009d, B:14:0x0144, B:17:0x016c, B:20:0x01c8, B:163:0x01e7, B:25:0x0217, B:28:0x0221, B:30:0x0230, B:32:0x0236, B:33:0x025e, B:35:0x026a, B:36:0x027b, B:39:0x0286, B:41:0x028c, B:43:0x02a1, B:45:0x02a5, B:47:0x02c9, B:49:0x0334, B:51:0x033a, B:54:0x0341, B:58:0x035d, B:61:0x0387, B:142:0x0393, B:64:0x03c3, B:66:0x03cd, B:68:0x03d7, B:70:0x03ff, B:72:0x040f, B:73:0x0413, B:75:0x0457, B:76:0x0419, B:77:0x041c, B:78:0x041f, B:79:0x0422, B:80:0x0425, B:81:0x0428, B:82:0x042b, B:83:0x042e, B:84:0x0431, B:85:0x0434, B:86:0x0437, B:87:0x043a, B:88:0x043d, B:89:0x0440, B:90:0x0443, B:91:0x0446, B:92:0x0449, B:93:0x044c, B:94:0x044f, B:95:0x0452, B:96:0x0455, B:97:0x045b, B:100:0x047a, B:103:0x048a, B:105:0x0490, B:106:0x0496, B:109:0x049e, B:111:0x04a4, B:112:0x04aa, B:114:0x04b0, B:116:0x04b6, B:118:0x04bc, B:119:0x04c2, B:121:0x04ca, B:123:0x04d0, B:124:0x04d3, B:125:0x04d5, B:128:0x04df, B:130:0x04e7, B:132:0x04ed, B:133:0x04f0, B:134:0x04f2, B:136:0x0500, B:137:0x050d, B:138:0x0509, B:146:0x03a7, B:148:0x02a8, B:149:0x02be, B:152:0x02e6, B:154:0x030f, B:167:0x01ee, B:169:0x0178, B:171:0x0186, B:172:0x018b, B:174:0x0191, B:175:0x01a0, B:177:0x0154, B:178:0x00b1, B:180:0x00b7, B:181:0x00c6, B:183:0x00d8, B:185:0x00de, B:188:0x0105, B:190:0x010a, B:191:0x0128, B:202:0x013b, B:201:0x0138, B:187:0x00ee, B:197:0x0133), top: B:5:0x0038, inners: #1, #2, #4, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:47:0x02c9 A[Catch: all -> 0x0536, TryCatch #3 {all -> 0x0536, blocks: (B:6:0x0038, B:8:0x007d, B:9:0x0089, B:12:0x009d, B:14:0x0144, B:17:0x016c, B:20:0x01c8, B:163:0x01e7, B:25:0x0217, B:28:0x0221, B:30:0x0230, B:32:0x0236, B:33:0x025e, B:35:0x026a, B:36:0x027b, B:39:0x0286, B:41:0x028c, B:43:0x02a1, B:45:0x02a5, B:47:0x02c9, B:49:0x0334, B:51:0x033a, B:54:0x0341, B:58:0x035d, B:61:0x0387, B:142:0x0393, B:64:0x03c3, B:66:0x03cd, B:68:0x03d7, B:70:0x03ff, B:72:0x040f, B:73:0x0413, B:75:0x0457, B:76:0x0419, B:77:0x041c, B:78:0x041f, B:79:0x0422, B:80:0x0425, B:81:0x0428, B:82:0x042b, B:83:0x042e, B:84:0x0431, B:85:0x0434, B:86:0x0437, B:87:0x043a, B:88:0x043d, B:89:0x0440, B:90:0x0443, B:91:0x0446, B:92:0x0449, B:93:0x044c, B:94:0x044f, B:95:0x0452, B:96:0x0455, B:97:0x045b, B:100:0x047a, B:103:0x048a, B:105:0x0490, B:106:0x0496, B:109:0x049e, B:111:0x04a4, B:112:0x04aa, B:114:0x04b0, B:116:0x04b6, B:118:0x04bc, B:119:0x04c2, B:121:0x04ca, B:123:0x04d0, B:124:0x04d3, B:125:0x04d5, B:128:0x04df, B:130:0x04e7, B:132:0x04ed, B:133:0x04f0, B:134:0x04f2, B:136:0x0500, B:137:0x050d, B:138:0x0509, B:146:0x03a7, B:148:0x02a8, B:149:0x02be, B:152:0x02e6, B:154:0x030f, B:167:0x01ee, B:169:0x0178, B:171:0x0186, B:172:0x018b, B:174:0x0191, B:175:0x01a0, B:177:0x0154, B:178:0x00b1, B:180:0x00b7, B:181:0x00c6, B:183:0x00d8, B:185:0x00de, B:188:0x0105, B:190:0x010a, B:191:0x0128, B:202:0x013b, B:201:0x0138, B:187:0x00ee, B:197:0x0133), top: B:5:0x0038, inners: #1, #2, #4, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:51:0x033a A[Catch: all -> 0x0536, TryCatch #3 {all -> 0x0536, blocks: (B:6:0x0038, B:8:0x007d, B:9:0x0089, B:12:0x009d, B:14:0x0144, B:17:0x016c, B:20:0x01c8, B:163:0x01e7, B:25:0x0217, B:28:0x0221, B:30:0x0230, B:32:0x0236, B:33:0x025e, B:35:0x026a, B:36:0x027b, B:39:0x0286, B:41:0x028c, B:43:0x02a1, B:45:0x02a5, B:47:0x02c9, B:49:0x0334, B:51:0x033a, B:54:0x0341, B:58:0x035d, B:61:0x0387, B:142:0x0393, B:64:0x03c3, B:66:0x03cd, B:68:0x03d7, B:70:0x03ff, B:72:0x040f, B:73:0x0413, B:75:0x0457, B:76:0x0419, B:77:0x041c, B:78:0x041f, B:79:0x0422, B:80:0x0425, B:81:0x0428, B:82:0x042b, B:83:0x042e, B:84:0x0431, B:85:0x0434, B:86:0x0437, B:87:0x043a, B:88:0x043d, B:89:0x0440, B:90:0x0443, B:91:0x0446, B:92:0x0449, B:93:0x044c, B:94:0x044f, B:95:0x0452, B:96:0x0455, B:97:0x045b, B:100:0x047a, B:103:0x048a, B:105:0x0490, B:106:0x0496, B:109:0x049e, B:111:0x04a4, B:112:0x04aa, B:114:0x04b0, B:116:0x04b6, B:118:0x04bc, B:119:0x04c2, B:121:0x04ca, B:123:0x04d0, B:124:0x04d3, B:125:0x04d5, B:128:0x04df, B:130:0x04e7, B:132:0x04ed, B:133:0x04f0, B:134:0x04f2, B:136:0x0500, B:137:0x050d, B:138:0x0509, B:146:0x03a7, B:148:0x02a8, B:149:0x02be, B:152:0x02e6, B:154:0x030f, B:167:0x01ee, B:169:0x0178, B:171:0x0186, B:172:0x018b, B:174:0x0191, B:175:0x01a0, B:177:0x0154, B:178:0x00b1, B:180:0x00b7, B:181:0x00c6, B:183:0x00d8, B:185:0x00de, B:188:0x0105, B:190:0x010a, B:191:0x0128, B:202:0x013b, B:201:0x0138, B:187:0x00ee, B:197:0x0133), top: B:5:0x0038, inners: #1, #2, #4, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:60:0x0384  */
                /* JADX WARN: Removed duplicated region for block: B:66:0x03cd A[Catch: all -> 0x0536, TryCatch #3 {all -> 0x0536, blocks: (B:6:0x0038, B:8:0x007d, B:9:0x0089, B:12:0x009d, B:14:0x0144, B:17:0x016c, B:20:0x01c8, B:163:0x01e7, B:25:0x0217, B:28:0x0221, B:30:0x0230, B:32:0x0236, B:33:0x025e, B:35:0x026a, B:36:0x027b, B:39:0x0286, B:41:0x028c, B:43:0x02a1, B:45:0x02a5, B:47:0x02c9, B:49:0x0334, B:51:0x033a, B:54:0x0341, B:58:0x035d, B:61:0x0387, B:142:0x0393, B:64:0x03c3, B:66:0x03cd, B:68:0x03d7, B:70:0x03ff, B:72:0x040f, B:73:0x0413, B:75:0x0457, B:76:0x0419, B:77:0x041c, B:78:0x041f, B:79:0x0422, B:80:0x0425, B:81:0x0428, B:82:0x042b, B:83:0x042e, B:84:0x0431, B:85:0x0434, B:86:0x0437, B:87:0x043a, B:88:0x043d, B:89:0x0440, B:90:0x0443, B:91:0x0446, B:92:0x0449, B:93:0x044c, B:94:0x044f, B:95:0x0452, B:96:0x0455, B:97:0x045b, B:100:0x047a, B:103:0x048a, B:105:0x0490, B:106:0x0496, B:109:0x049e, B:111:0x04a4, B:112:0x04aa, B:114:0x04b0, B:116:0x04b6, B:118:0x04bc, B:119:0x04c2, B:121:0x04ca, B:123:0x04d0, B:124:0x04d3, B:125:0x04d5, B:128:0x04df, B:130:0x04e7, B:132:0x04ed, B:133:0x04f0, B:134:0x04f2, B:136:0x0500, B:137:0x050d, B:138:0x0509, B:146:0x03a7, B:148:0x02a8, B:149:0x02be, B:152:0x02e6, B:154:0x030f, B:167:0x01ee, B:169:0x0178, B:171:0x0186, B:172:0x018b, B:174:0x0191, B:175:0x01a0, B:177:0x0154, B:178:0x00b1, B:180:0x00b7, B:181:0x00c6, B:183:0x00d8, B:185:0x00de, B:188:0x0105, B:190:0x010a, B:191:0x0128, B:202:0x013b, B:201:0x0138, B:187:0x00ee, B:197:0x0133), top: B:5:0x0038, inners: #1, #2, #4, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:72:0x040f A[Catch: all -> 0x0536, TryCatch #3 {all -> 0x0536, blocks: (B:6:0x0038, B:8:0x007d, B:9:0x0089, B:12:0x009d, B:14:0x0144, B:17:0x016c, B:20:0x01c8, B:163:0x01e7, B:25:0x0217, B:28:0x0221, B:30:0x0230, B:32:0x0236, B:33:0x025e, B:35:0x026a, B:36:0x027b, B:39:0x0286, B:41:0x028c, B:43:0x02a1, B:45:0x02a5, B:47:0x02c9, B:49:0x0334, B:51:0x033a, B:54:0x0341, B:58:0x035d, B:61:0x0387, B:142:0x0393, B:64:0x03c3, B:66:0x03cd, B:68:0x03d7, B:70:0x03ff, B:72:0x040f, B:73:0x0413, B:75:0x0457, B:76:0x0419, B:77:0x041c, B:78:0x041f, B:79:0x0422, B:80:0x0425, B:81:0x0428, B:82:0x042b, B:83:0x042e, B:84:0x0431, B:85:0x0434, B:86:0x0437, B:87:0x043a, B:88:0x043d, B:89:0x0440, B:90:0x0443, B:91:0x0446, B:92:0x0449, B:93:0x044c, B:94:0x044f, B:95:0x0452, B:96:0x0455, B:97:0x045b, B:100:0x047a, B:103:0x048a, B:105:0x0490, B:106:0x0496, B:109:0x049e, B:111:0x04a4, B:112:0x04aa, B:114:0x04b0, B:116:0x04b6, B:118:0x04bc, B:119:0x04c2, B:121:0x04ca, B:123:0x04d0, B:124:0x04d3, B:125:0x04d5, B:128:0x04df, B:130:0x04e7, B:132:0x04ed, B:133:0x04f0, B:134:0x04f2, B:136:0x0500, B:137:0x050d, B:138:0x0509, B:146:0x03a7, B:148:0x02a8, B:149:0x02be, B:152:0x02e6, B:154:0x030f, B:167:0x01ee, B:169:0x0178, B:171:0x0186, B:172:0x018b, B:174:0x0191, B:175:0x01a0, B:177:0x0154, B:178:0x00b1, B:180:0x00b7, B:181:0x00c6, B:183:0x00d8, B:185:0x00de, B:188:0x0105, B:190:0x010a, B:191:0x0128, B:202:0x013b, B:201:0x0138, B:187:0x00ee, B:197:0x0133), top: B:5:0x0038, inners: #1, #2, #4, #6 }] */
                /* JADX WARN: Removed duplicated region for block: B:99:0x0478 A[ADDED_TO_REGION] */
                @Override // defpackage.emyl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object get() {
                    /*
                        Method dump skipped, instructions count: 1396
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.baog.get():java.lang.Object");
                }
            });
            f.close();
            return r1;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public ProcessSentMessageAction(baoi baoiVar, int i, Uri uri, Bundle bundle) {
        this(baoiVar);
        bbcg bbcgVar = this.t;
        bbcgVar.p("sent_by_mms_api_or_lib", true);
        bbcgVar.v("message_id", bundle.getString("message_id"));
        bbcgVar.t("message_uri", uri);
        bbcgVar.t("updated_message_uri", bundle.getParcelable("updated_message_uri"));
        bbcgVar.r("sub_id", bundle.getInt("sub_id", -1));
        bbcgVar.r("result_code", i);
        if (baoiVar.m.a() && i == 13) {
            bbcgVar.r("raw_status", 10006);
        }
        bbcgVar.r("http_status_code", bundle.getInt("android.telephony.extra.MMS_HTTP_STATUS", 0));
        bbcgVar.t("content_uri", bundle.getParcelable("content_uri"));
        byte[] byteArray = bundle.getByteArray("android.telephony.extra.MMS_DATA");
        if (byteArray != null) {
            bbcgVar.q(GroupManagementResponse.XML_TAG, byteArray);
        }
        bbcgVar.p("response_important", bundle.getBoolean("response_important"));
        this.t.r("mms_api", 1);
        bbcgVar.r("mms_last_connection_failure_cause_code", bundle.getInt("android.telephony.extra.LAST_CONNECTION_FAILURE_CAUSE_CODE"));
        if (bundle.getBoolean("android.telephony.extra.HANDLED_BY_CARRIER_APP")) {
            this.t.r("mms_api", 3);
        }
        bbcgVar.r("key_rcs_transport_type", eqyl.NOT_RCS.h);
        bbcgVar.r("xsl_bugle_sending_status", fgjz.BUGLE_SENDING_INTERNAL_STATUS_RETURNED_FROM_MMS.a());
        if (bundle.containsKey("android.telephony.extra.HANDLED_BY_CARRIER_APP")) {
            bbcgVar.p("handled_by_carrier_app", bundle.getBoolean("android.telephony.extra.HANDLED_BY_CARRIER_APP"));
        }
        bbcgVar.r("xms_transport", eopp.TELEPHONY_UNSPECIFIED.h);
    }

    public ProcessSentMessageAction(baoi baoiVar, Parcel parcel) {
        super(parcel, eogt.PROCESS_SENT_MESSAGE_ACTION);
        this.b = baoiVar;
    }

    public ProcessSentMessageAction(baoi baoiVar, bdgr bdgrVar, int i, int i2) {
        this(baoiVar);
        emxf.b(!bdgrVar.f().isEmpty(), "Missing Datagram Id");
        bbcg bbcgVar = this.t;
        bbcgVar.p("sent_by_mms_api_or_lib", false);
        bdgr.h(bbcgVar.f(), "datagram_id", bdgrVar);
        bbcgVar.r("status", i);
        bbcgVar.r("raw_status", 0);
        bbcgVar.r("result_code", i2);
        bbcgVar.r("key_rcs_transport_type", eqyl.NOT_RCS.h);
    }

    public ProcessSentMessageAction(baoi baoiVar, MessageIdType messageIdType, bdhg bdhgVar, Uri uri, Uri uri2, int i, int i2, int i3, int i4, eqxi eqxiVar, eopp eoppVar) {
        this(baoiVar);
        bbcg bbcgVar = this.t;
        bbcgVar.p("sent_by_mms_api_or_lib", false);
        bbcgVar.v("message_id", messageIdType.b());
        if (bdhgVar != null) {
            bdhg.h(bbcgVar.f(), "rcs_message_id", bdhgVar);
        }
        bbcgVar.t("message_uri", uri);
        bbcgVar.t("updated_message_uri", uri2);
        bbcgVar.r("sub_id", i);
        bbcgVar.r("status", i2);
        bbcgVar.r("raw_status", i3);
        bbcgVar.r("result_code", i4);
        bbcgVar.r("sms_error_code", -1);
        bbcgVar.r("sms_part_count", 1);
        if (eqxiVar != null) {
            bbcgVar.q("rcs_diagnostics", eqxiVar.toByteArray());
        }
        bbcgVar.r("xsl_bugle_sending_status", fgjz.BUGLE_SENDING_INTERNAL_STATUS_RETURNED_FROM_FAST_FAILURE.a());
        bbcgVar.r("xms_transport", eoppVar.h);
    }

    public ProcessSentMessageAction(baoi baoiVar, MessageIdType messageIdType, String str, int i, int i2) {
        this(baoiVar);
        bbcg bbcgVar = this.t;
        bbcgVar.p("sent_by_mms_api_or_lib", false);
        bbcgVar.v("message_id", messageIdType.b());
        bbcgVar.r("sub_id", i);
        bbcgVar.r("status", i2 != -1 ? 2 : 0);
        bbcgVar.r("raw_status", 0);
        bbcgVar.r("result_code", i2);
        bbcgVar.r("sms_error_code", -1);
        bbcgVar.r("sms_part_count", 1);
        if (str != null) {
            bbcgVar.v("cloud_sync_id", str);
        }
        bbcgVar.r("key_rcs_transport_type", eqyl.UNKNOWN_RCS_TYPE.h);
    }

    public ProcessSentMessageAction(baoi baoiVar, bdhg bdhgVar, int i, long j, long j2, Duration duration) {
        this(baoiVar);
        int i2;
        final bbcg bbcgVar = this.t;
        bbcgVar.p("sent_by_mms_api_or_lib", false);
        bdhgVar.g(new Consumer() { // from class: baoe
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                bdhg.h(bbcg.this.f(), "rcs_message_id", (bdhg) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        bbcgVar.r("http_status_code", 0);
        bbcgVar.s("delivered_time", j2);
        bbcgVar.r("sms_error_code", -1);
        if (i == 50030) {
            bbcgVar.r("status", 0);
            bbcgVar.r("raw_status", 0);
            bbcgVar.r("result_code", 0);
        } else {
            switch ((int) j) {
                case 59:
                case 60:
                case 62:
                case 63:
                    i2 = 3;
                    break;
                case 61:
                default:
                    i2 = 1;
                    break;
            }
            bbcgVar.r("status", i2);
            bbcgVar.r("result_code", i2);
            bbcgVar.r("raw_status", 0);
            bbcgVar.r("rcs_chat_session_event_info", dipx.a(j) - 1);
        }
        bbcgVar.r("key_rcs_transport_type", eqyl.RCS_LEGACY.h);
        bbcgVar.G(duration);
        bbcgVar.r("xsl_bugle_sending_status", fgjz.BUGLE_SENDING_INTERNAL_STATUS_RETURNED_FROM_RCS.a());
    }

    public ProcessSentMessageAction(baoi baoiVar, bdhg bdhgVar, int i, Instant instant, eopq eopqVar, awyp awypVar) {
        this(baoiVar);
        emxf.b(!bdhgVar.f().isEmpty(), "Missing RCS Message Id");
        bbcg bbcgVar = this.t;
        bbcgVar.p("sent_by_mms_api_or_lib", false);
        bdhg.h(bbcgVar.f(), "rcs_message_id", bdhgVar);
        bbcgVar.r("sub_id", i);
        bbcgVar.r("http_status_code", 0);
        bbcgVar.s("delivered_time", instant.toEpochMilli());
        bbcgVar.r("sms_error_code", -1);
        bbcgVar.r("raw_status", 0);
        bbcgVar.r("status", 6);
        bbcgVar.r("result_code", 6);
        eqyl b = eqyl.b(eopqVar.aa);
        bbcgVar.r("key_rcs_transport_type", (b == null ? eqyl.UNKNOWN_RCS_TYPE : b).h);
        if ((awypVar.b & 2) != 0) {
            eyev eyevVar = awypVar.d;
            bbcgVar.G(eykj.c(eyevVar == null ? eyev.a : eyevVar));
        }
        bbcgVar.r("xsl_bugle_sending_status", fgjz.BUGLE_SENDING_INTERNAL_STATUS_RETURNED_FROM_CHATAPI.a());
    }

    public ProcessSentMessageAction(baoi baoiVar, bdhg bdhgVar, awud awudVar, Instant instant, boolean z, eopq eopqVar, awyp awypVar, eqxi eqxiVar) {
        this(baoiVar);
        int i = 1;
        emxf.b(!bdhgVar.f().isEmpty(), "Missing RCS Message Id");
        bbcg bbcgVar = this.t;
        bbcgVar.p("sent_by_mms_api_or_lib", false);
        bdhg.h(bbcgVar.f(), "rcs_message_id", bdhgVar);
        bbcgVar.r("http_status_code", 0);
        bbcgVar.s("delivered_time", instant.toEpochMilli());
        bbcgVar.r("sms_error_code", -1);
        bbcgVar.r("raw_status", 0);
        awuc b = awuc.b(awudVar.c);
        int ordinal = (b == null ? awuc.UNKNOWN_STATUS : b).ordinal();
        if (ordinal == 1) {
            bbcgVar.p("is_revocation_supported", z);
            i = 0;
        } else if (ordinal != 3) {
            if (ordinal != 4) {
                awuc b2 = awuc.b(awudVar.c);
                throw new IllegalArgumentException(String.format("Unexpected chatApiResult %s for rcsMessageId %s", (b2 == null ? awuc.UNKNOWN_STATUS : b2).name(), bdhgVar.b));
            }
            i = !awypVar.c ? 5 : 3;
        }
        bbcgVar.r("status", i);
        awua b3 = awua.b(awudVar.d);
        bbcgVar.r("result_code", (b3 == null ? awua.UNKNOWN_CAUSE : b3).v);
        eqyl b4 = eqyl.b(eopqVar.aa);
        bbcgVar.r("key_rcs_transport_type", (b4 == null ? eqyl.UNKNOWN_RCS_TYPE : b4).h);
        if ((awypVar.b & 2) != 0) {
            eyev eyevVar = awypVar.d;
            bbcgVar.G(eykj.c(eyevVar == null ? eyev.a : eyevVar));
        }
        if (eqxiVar != null) {
            bbcgVar.q("rcs_diagnostics", eqxiVar.toByteArray());
        }
        bbcgVar.r("xsl_bugle_sending_status", fgjz.BUGLE_SENDING_INTERNAL_STATUS_RETURNED_FROM_CHATAPI.a());
    }

    public ProcessSentMessageAction(baoi baoiVar, coxc coxcVar, MessageIdType messageIdType, Uri uri, int i, int i2, int i3, int i4, String str, Boolean bool) {
        this(baoiVar);
        int i5;
        bbcg bbcgVar = this.t;
        bbcgVar.p("sent_by_mms_api_or_lib", false);
        bbcgVar.v("message_id", messageIdType.b());
        bbcgVar.t("message_uri", uri);
        bbcgVar.r("sub_id", i3);
        if (i == -1) {
            i5 = 0;
        } else {
            i5 = 2;
            if ((!coxcVar.e.E() && coxcVar.i.a() > 0) || ((csmz) coxcVar.f.a()).x()) {
                if (i == 1) {
                    coxc.a.n("Generic failure");
                } else if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            coxc.a.r("No service, returning message send status AUTO_RETRY");
                        } else if (i == 5) {
                            coxc.a.n("Message sending limit is exceeded. Either the telephony is applying throttle, or the user declined the premium SMS feature for Bugle.");
                        } else if (i == 17) {
                            if (((ersq) ((arqd) coxcVar.l).a.b()).a("bugle.enable_network_error_network_timeout_retry") && i2 == 332) {
                                i2 = 332;
                                i5 = 1;
                            }
                            ((enrr) coxc.a.k().h("com/google/android/apps/messaging/shared/sms/SmsSender", "getStatusFromResult", 480, "SmsSender.java")).J("Sms ResultCode: %d and ErrCode: %d mapped to RetryAction: %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i5));
                        } else if (i != 112) {
                            coxc.a.n(defpackage.a.h(i, "Unexpected sent intent resultCode = "));
                        } else if (((ersq) ((arqf) coxcVar.k).a.b()).a("bugle.enable_network_failure_error_code_retries_sms")) {
                            coxc.a.r("RESULT_RIL_NETWORK_ERR: returning message send status AUTO_RETRY");
                        } else {
                            coxc.a.r("RESULT_RIL_NETWORK_ERR: returning message send status MANUAL_RETRY");
                        }
                        i5 = 1;
                    } else {
                        coxc.a.n("The PDU sent to the SmsManager was null");
                    }
                } else if (((csmz) coxcVar.f.a()).x()) {
                    coxc.a.r("Radio is off, returning message send status AUTO_RETRY");
                    i5 = 1;
                } else {
                    coxc.a.r("Radio is off");
                }
            }
        }
        bbcgVar.r("status", i5);
        bbcgVar.r("raw_status", 0);
        bbcgVar.r("result_code", i);
        bbcgVar.r("sms_error_code", i2);
        bbcgVar.r("sms_part_count", i4);
        bbcgVar.r("key_rcs_transport_type", eqyl.NOT_RCS.h);
        bbcgVar.r("xsl_bugle_sending_status", fgjz.BUGLE_SENDING_INTERNAL_STATUS_RETURNED_FROM_SMS.a());
        if (str != null) {
            bbcgVar.v("format", str);
        }
        if (bool != null) {
            bbcgVar.p("is_ims", bool.booleanValue());
        }
        bbcgVar.r("xms_transport", eopp.TELEPHONY_UNSPECIFIED.h);
    }
}
