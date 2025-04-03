package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class covp {
    private static final enru d = enru.c("com/google/android/apps/messaging/shared/sms/MmsDebugUtils");
    public final Context a;
    public final cqoh b;
    public final csrv c;
    private final ctyx e;

    public covp(Context context, cqoh cqohVar, ctyx ctyxVar, csrv csrvVar) {
        this.a = context;
        this.b = cqohVar;
        this.e = ctyxVar;
        this.c = csrvVar;
    }

    public static lx a(byte[] bArr) {
        lh lhVar = null;
        if (bArr != null) {
            try {
                lhVar = new ls(bArr, true).a();
            } catch (RuntimeException e) {
                ensk e2 = d.e();
                e2.Y(ente.a, "Bugle");
                ((enrr) ((enrr) ((enrr) e2).g(e)).h("com/google/android/apps/messaging/shared/sms/MmsDebugUtils", "parsePduForAnyCarrier", 'g', "MmsDebugUtils.java")).q("parsePduForAnyCarrier: Failed to parse PDU with content disposition");
            }
            if (lhVar == null) {
                try {
                    lhVar = new ls(bArr, false).a();
                } catch (RuntimeException e3) {
                    ensk e4 = d.e();
                    e4.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) e4).g(e3)).h("com/google/android/apps/messaging/shared/sms/MmsDebugUtils", "parsePduForAnyCarrier", 'n', "MmsDebugUtils.java")).q("parsePduForAnyCarrier: Failed to parse PDU without content disposition");
                }
            }
        }
        if (lhVar instanceof lx) {
            return (lx) lhVar;
        }
        ensk i = d.i();
        i.Y(ente.a, "Bugle");
        ((enrr) ((enrr) i).h("com/google/android/apps/messaging/shared/sms/MmsDebugUtils", "receiveFromDumpFile", 121, "MmsDebugUtils.java")).q("receiveFromDumpFile: Parsing retrieved PDU failure");
        throw new covq(2, "Failed reading dump file");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final File b(String str, engw engwVar) {
        File a = this.c.a(str, true, this.a);
        ensk h = d.h();
        h.Y(ente.a, "Bugle");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/sms/MmsDebugUtils", "writeDumpFile", 212, "MmsDebugUtils.java")).t("dump mms filename: %s", a.getAbsolutePath());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(a);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                try {
                    enqv it = engwVar.iterator();
                    while (it.hasNext()) {
                        bufferedOutputStream.write((byte[]) it.next());
                    }
                    bufferedOutputStream.close();
                    csrl.a(a);
                    fileOutputStream.close();
                    return a;
                } finally {
                }
            } finally {
            }
        } catch (IOException e) {
            ensk i = d.i();
            i.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/shared/sms/MmsDebugUtils", "writeDumpFile", 221, "MmsDebugUtils.java")).t("dumpPdu: %s", e);
            return a;
        }
    }

    public final String c(lh lhVar) {
        String str = null;
        if (lhVar instanceof lx) {
            lx lxVar = (lx) lhVar;
            if (lxVar.k() != null) {
                str = new String(lxVar.k());
            } else if (lxVar.l() != null) {
                str = new String(lxVar.l());
            }
        }
        return (TextUtils.isEmpty(str) ? "" : String.valueOf(str).concat("_")).concat(String.valueOf(this.b.g().toString()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(byte[] bArr, lh lhVar) {
        String b;
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        String str = (lhVar == null || lhVar.a() != 130) ? "" : "_wappush_";
        String str2 = "mmsdump-" + str + c(lhVar) + "_email";
        b(str2, engw.r(bArr));
        if (lhVar != null) {
            String concat = str2.concat("_email");
            StringBuilder sb = new StringBuilder();
            for (int i = 129; i <= 191; i++) {
                lq lqVar = lhVar.a;
                int i2 = 0;
                switch (i) {
                    case 129:
                    case 130:
                    case 151:
                        lg[] l = lqVar.l(i);
                        if (l != null) {
                            ArrayList arrayList = new ArrayList();
                            while (i2 < l.length) {
                                lg lgVar = l[i2];
                                if (lgVar != null) {
                                    arrayList.add(lgVar.b());
                                }
                                i2++;
                            }
                            b = new emww(", ").b(arrayList);
                            break;
                        }
                        b = "PDU header value not present";
                        break;
                    case 131:
                    case 132:
                    case 138:
                    case 139:
                    case 152:
                    case 158:
                    case 183:
                    case 184:
                    case 185:
                    case 189:
                    case 190:
                        byte[] k = lqVar.k(i);
                        if (k != null) {
                            b = new String(k);
                            break;
                        }
                        b = "PDU header value not present";
                        break;
                    case 133:
                        b = new Date(lqVar.b(133)).toString();
                        break;
                    case 134:
                    case 144:
                    case 145:
                    case 162:
                    case 167:
                    case 169:
                    case 171:
                    case 177:
                    case 187:
                    case 188:
                        b = lqVar.d(i, lq.c);
                        break;
                    case 135:
                    case 136:
                    case 157:
                        engw engwVar = lq.d;
                        long b2 = lqVar.b(i);
                        if (b2 != -1) {
                            int i3 = ((enou) engwVar).c;
                            while (true) {
                                if (i2 >= i3) {
                                    b = lq.e(i, Long.valueOf(b2));
                                    break;
                                } else {
                                    lp lpVar = (lp) engwVar.get(i2);
                                    i2++;
                                    if (b2 == lpVar.a()) {
                                        b = lpVar.b();
                                        break;
                                    }
                                }
                            }
                        }
                        b = "PDU header value not present";
                        break;
                    case 137:
                    case 147:
                    case 150:
                    case 154:
                    case 160:
                    case 164:
                    case 166:
                    case 181:
                    case 182:
                        lg c = lqVar.c(i);
                        if (c != null) {
                            b = c.b();
                            break;
                        }
                        b = "PDU header value not present";
                        break;
                    case 140:
                        b = lqVar.d(140, lq.b);
                        break;
                    case 141:
                        b = lqVar.d(141, lq.e);
                        break;
                    case 142:
                    case 159:
                    case 161:
                    case 173:
                    case 175:
                    case 179:
                        long b3 = lqVar.b(i);
                        if (b3 != -1) {
                            b = String.valueOf(b3);
                            break;
                        }
                        b = "PDU header value not present";
                        break;
                    case 143:
                        b = lqVar.d(143, lq.g);
                        break;
                    case 146:
                        b = lqVar.d(146, lq.h);
                        break;
                    case 148:
                        b = lqVar.d(148, lq.j);
                        break;
                    case 149:
                        b = lqVar.d(149, lq.f);
                        break;
                    case 153:
                        b = lqVar.d(153, lq.i);
                        break;
                    case 155:
                        b = lqVar.d(155, lq.k);
                        break;
                    case 156:
                        b = lqVar.d(156, lq.m);
                        break;
                    case 163:
                        b = lqVar.d(163, lq.n);
                        break;
                    case 165:
                        b = lqVar.d(165, lq.p);
                        break;
                    case 168:
                    case 170:
                    case 172:
                    case 174:
                    case 176:
                    case 178:
                    case 180:
                    default:
                        ensk i4 = lq.a.i();
                        i4.Y(ente.a, "PduParser");
                        ((enrr) ((enrr) i4).h("android/support/v7/mms/pdu/PduHeaders", "getFieldDisplayValue", 1160, "PduHeaders.java")).u("PduHeaders: Unknown field: %d (%02x)", i, i);
                        b = "PDU header value not present";
                        break;
                    case 186:
                        b = lqVar.d(186, lq.o);
                        break;
                    case 191:
                        b = lqVar.d(191, lq.l);
                        break;
                }
                if (!b.equals("PDU header value not present")) {
                    sb.append(lq.q[i - 129]);
                    sb.append(": ");
                    sb.append(b);
                    sb.append("\n");
                }
            }
            b(concat, engw.s(a.a(sb.toString(), "Pdu Headers: \n", "\nRaw pdu bytes:\n").getBytes(), bArr));
        }
    }

    public final boolean e(int i, int i2) {
        Resources resources = this.a.getResources();
        return this.e.q(resources.getString(i), resources.getBoolean(i2));
    }

    public final boolean f() {
        if (this.c.q()) {
            return e(R.string.dump_mms_pref_key, R.bool.dump_mms_pref_default);
        }
        return false;
    }
}
