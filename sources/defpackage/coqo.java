package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.ims.util.common.RcsIntents;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coqo implements coqc {
    private final auni A;
    private final ffbr B;
    private final AtomicBoolean C;
    public final ffsk c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final coqb g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    private final Context m;
    private final ffsk n;
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;
    private final ffbr r;
    private final ffbr s;
    private final ffbr t;
    private final ffbr u;
    private final ffbr v;
    private final ffbr w;
    private final ffbr x;
    private final ffbr y;
    private final aunj z;
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl");
    private static final fgjb l = new fgjf();
    public static final fgjb b = new fgjf();

    public coqo(Context context, ffsk ffskVar, ffsk ffskVar2, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, coqb coqbVar, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, aunj aunjVar, auni auniVar, ffbr ffbrVar20, ffbr ffbrVar21) {
        context.getClass();
        ffskVar.getClass();
        ffskVar2.getClass();
        ffbrVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        coqbVar.getClass();
        ffbrVar8.getClass();
        ffbrVar9.getClass();
        ffbrVar10.getClass();
        ffbrVar11.getClass();
        ffbrVar12.getClass();
        ffbrVar14.getClass();
        ffbrVar15.getClass();
        ffbrVar16.getClass();
        ffbrVar17.getClass();
        ffbrVar18.getClass();
        ffbrVar19.getClass();
        ffbrVar20.getClass();
        ffbrVar21.getClass();
        this.m = context;
        this.n = ffskVar;
        this.c = ffskVar2;
        this.d = ffbrVar;
        this.o = ffbrVar2;
        this.p = ffbrVar3;
        this.e = ffbrVar4;
        this.f = ffbrVar7;
        this.g = coqbVar;
        this.h = ffbrVar8;
        this.q = ffbrVar9;
        this.r = ffbrVar10;
        this.s = ffbrVar11;
        this.t = ffbrVar12;
        this.i = ffbrVar13;
        this.u = ffbrVar14;
        this.v = ffbrVar15;
        this.j = ffbrVar16;
        this.w = ffbrVar17;
        this.x = ffbrVar18;
        this.y = ffbrVar19;
        this.z = aunjVar;
        this.A = auniVar;
        this.k = ffbrVar20;
        this.B = ffbrVar21;
        this.C = new AtomicBoolean(true);
    }

    private final dkvt l(int i) {
        if (!this.z.a()) {
            return dkvt.g(this.m).f(i);
        }
        dkvt f = dkvt.g(this.m).f(i);
        if (f == null) {
            ensk j = a.j();
            j.Y(ente.a, "BugleSimStateTracker");
            ((enrr) j.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "createSafeTelephonyManager-0jkzt_0", 980, "PhoneSimsStateUpdaterImpl.kt")).t("getSimOperator: TelephonyManager is null for subscription ID %s", new djrq(i));
        }
        return f;
    }

    private final String m(int i) {
        String i2;
        String str;
        String phoneNumber;
        if (((auno) this.w.b()).a() && Build.VERSION.SDK_INT >= 33) {
            try {
                try {
                    phoneNumber = dkvq.b(this.m).a.getPhoneNumber(i);
                    phoneNumber.getClass();
                    if (phoneNumber.length() != 0) {
                        return phoneNumber;
                    }
                } catch (SecurityException e) {
                    throw new dkvd("READ_PHONE_STATE permission is missing.", e);
                }
            } catch (IllegalStateException unused) {
                ensk j = a.j();
                j.Y(ente.a, "BugleSimStateTracker");
                ((enrr) j.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getRawMsisdnInternal-0jkzt_0", 764, "PhoneSimsStateUpdaterImpl.kt")).q("getRawMsisdnInternal: Telephony process currently unavailable");
            }
        }
        try {
            if (!this.z.a()) {
                dkvt l2 = l(i);
                return (l2 == null || (i2 = l2.i()) == null) ? "" : i2;
            }
            dkvt l3 = l(i);
            if (l3 == null || (str = l3.i()) == null) {
                str = "";
            }
            if (str.length() == 0) {
                ensk j2 = a.j();
                j2.Y(ente.a, "BugleSimStateTracker");
                ((enrr) j2.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getRawMsisdnInternal-0jkzt_0", 774, "PhoneSimsStateUpdaterImpl.kt")).t("getRawMsisdnInternal: line1Number is empty for subscription ID %s", new djrq(i));
            }
            return str;
        } catch (dkvd unused2) {
            ensk j3 = a.j();
            j3.Y(ente.a, "BugleSimStateTracker");
            ((enrr) j3.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getRawMsisdnInternal-0jkzt_0", 782, "PhoneSimsStateUpdaterImpl.kt")).q("getRawMsisdnInternal: Missing permissions for TelephonyManager");
            return "";
        }
    }

    private final void n(Set set) {
        Set set2 = (Set) this.j.b();
        if (!set2.isEmpty()) {
            axol.k(this.c, null, new coqg(set2, set, null), 3);
            return;
        }
        ensk e = a.e();
        e.Y(ente.a, "BugleSimStateTracker");
        ((enrr) e.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "handleMultiSimsLoaded", 495, "PhoneSimsStateUpdaterImpl.kt")).q("No sim changed listeners registered.");
    }

    private final void o(String str) {
        if (str != null) {
            ((ctyx) this.o.b()).h("is_fi_device_".concat(str), true);
        }
    }

    private final boolean p(int i, String str) {
        String i2 = i(str);
        boolean z = true;
        if (i2 != null && ((ctyx) this.o.b()).q("is_fi_device_".concat(i2), false)) {
            ensk h = a.h();
            h.Y(ente.a, "BugleSimStateTracker");
            ((enrr) h.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "isFiDevice-bYZ02fE", 842, "PhoneSimsStateUpdaterImpl.kt")).q("Found isFiDevice from Fi cache");
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                dkvt l2 = l(i);
                if (l2 != null && l2.d() == 1989) {
                    o(i2);
                    return true;
                }
            } catch (dkvd unused) {
                ensk j = a.j();
                j.Y(ente.a, "BugleSimStateTracker");
                ((enrr) j.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "isFiDevice-bYZ02fE", 858, "PhoneSimsStateUpdaterImpl.kt")).q("isFiDevice: Missing permissions for TelephonyManager");
            }
        }
        ensk h2 = a.h();
        h2.Y(ente.a, "BugleSimStateTracker");
        ((enrr) h2.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "isFiDevice-bYZ02fE", 863, "PhoneSimsStateUpdaterImpl.kt")).q("Looking up Fi through package names.");
        Object a2 = dinr.i.a();
        a2.getClass();
        String str2 = (String) a2;
        if (str2.length() == 0) {
            return false;
        }
        Iterator it = emye.d(",").g(str2).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            String obj = ffpc.x((String) it.next()).toString();
            if (obj.length() != 0) {
                try {
                    if (dkvv.a(this.m).b(obj, i)) {
                        break;
                    }
                } catch (dkvd unused2) {
                    ensk h3 = a.h();
                    h3.Y(ente.a, "BugleSimStateTracker");
                    ((enrr) h3.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "hasCarrierPrivileges-0_gSl_s", 879, "PhoneSimsStateUpdaterImpl.kt")).q("Missing permissions for SystemApiManager");
                } catch (NoSuchMethodException unused3) {
                    ensk h4 = a.h();
                    h4.Y(ente.a, "BugleSimStateTracker");
                    ((enrr) h4.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "hasCarrierPrivileges-0_gSl_s", 881, "PhoneSimsStateUpdaterImpl.kt")).q("Method not found in SystemApiManager");
                }
            }
        }
        if (z) {
            o(i2);
        }
        return z;
    }

    private final boolean q(String str) {
        return (str == null || str.length() == 0) ? false : true;
    }

    private final String r(String str) {
        if (str.length() == 0) {
            return "";
        }
        String y = ((ctvb) this.p.b()).y(str, false);
        y.getClass();
        return y;
    }

    private static final String s(String str, ctwi ctwiVar) {
        try {
            String substring = str.substring(0, 3);
            substring.getClass();
            return substring;
        } catch (StringIndexOutOfBoundsException e) {
            ensk j = a.j();
            j.Y(ente.a, "BugleSimStateTracker");
            ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getMcc", 931, "PhoneSimsStateUpdaterImpl.kt")).q("Invalid simOperator provided when setting MCC");
            return String.valueOf(ctwiVar.E()[0]);
        }
    }

    private static final String t(String str, ctwi ctwiVar) {
        try {
            String substring = str.substring(3);
            substring.getClass();
            return substring;
        } catch (StringIndexOutOfBoundsException e) {
            ensk j = a.j();
            j.Y(ente.a, "BugleSimStateTracker");
            ((enrr) ((enrr) j).g(e).h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getMnc", 940, "PhoneSimsStateUpdaterImpl.kt")).q("Invalid simOperator provided when setting MNC");
            return String.valueOf(ctwiVar.E()[1]);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r12v0, types: [eraj] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r12v3 */
    @Override // defpackage.coqc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.eraj r12, defpackage.ffgu r13) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coqo.a(eraj, ffgu):java.lang.Object");
    }

    @Override // defpackage.coqc
    public final ffss b(List list, eraj erajVar) {
        erajVar.getClass();
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        return ffra.b(this.n, ekxi.a(ffheVar), ffsmVar, new coqm(null, list, this, erajVar));
    }

    @Override // defpackage.coqc
    public final ffss c(eraj erajVar) {
        erajVar.getClass();
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        return ffra.b(this.n, ekxi.a(ffheVar), ffsmVar, new coqn(null, this, erajVar));
    }

    public final cost d(cost costVar) {
        String h = h(((ctwb) this.d.b()).f());
        if (h.length() <= 0) {
            h = null;
        }
        if (h == null) {
            h = costVar.c;
            h.getClass();
        }
        String h2 = h(((ctwb) this.d.b()).c());
        if (h2.length() <= 0) {
            h2 = null;
        }
        if (h2 == null) {
            h2 = costVar.d;
            h2.getClass();
        }
        String h3 = h(((ctwb) this.d.b()).b());
        if (h3.length() <= 0) {
            h3 = null;
        }
        if (h3 == null) {
            h3 = costVar.e;
            h3.getClass();
        }
        String h4 = h(((ctwb) this.d.b()).f());
        String str = h4.length() > 0 ? h4 : null;
        if (str == null) {
            str = costVar.f;
            str.getClass();
        }
        ensk h5 = a.h();
        h5.Y(ente.a, "BugleSimStateTracker");
        ((enrr) h5.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getDefaultSubscriptions", 704, "PhoneSimsStateUpdaterImpl.kt")).J("default call SIM: %s, default sms SIM %s. default data SIM %s.", dktx.SIM_ID.c(h), dktx.SIM_ID.c(h2), dktx.SIM_ID.c(h3));
        coss cossVar = (coss) cost.a.createBuilder();
        cossVar.getClass();
        cosu.b(h, cossVar);
        cosu.e(h2, cossVar);
        cosu.c(h3, cossVar);
        cosu.d(str, cossVar);
        return cosu.a(cossVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.ctwi r21, defpackage.ffgu r22) {
        /*
            Method dump skipped, instructions count: 853
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coqo.e(ctwi, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f8, code lost:
    
        if (r0 != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d A[Catch: all -> 0x0050, TryCatch #1 {all -> 0x0050, blocks: (B:25:0x004c, B:26:0x0099, B:28:0x009d, B:30:0x00f6), top: B:24:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.djrm r11, defpackage.ffgu r12) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coqo.f(djrm, ffgu):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:297:0x025a, code lost:
    
        if (r0 == r3) goto L241;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00dd: MOVE (r13 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]) (LINE:222), block:B:307:0x00dd */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x036b A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:13:0x004b, B:15:0x0633, B:18:0x065e, B:20:0x0696, B:21:0x06c8, B:23:0x06d2, B:24:0x06fa, B:27:0x070a, B:29:0x076a, B:30:0x0773, B:32:0x0779, B:33:0x0784, B:35:0x078a, B:39:0x079d, B:58:0x07ee, B:41:0x07a2, B:43:0x07ac, B:45:0x07b6, B:47:0x07c0, B:49:0x07ca, B:51:0x07d4, B:53:0x07de, B:55:0x07e4, B:75:0x07f2, B:77:0x07f8, B:78:0x081c, B:80:0x0822, B:82:0x083b, B:84:0x084c, B:86:0x085a, B:87:0x0861, B:91:0x0718, B:93:0x0721, B:94:0x0745, B:96:0x074b, B:98:0x0762, B:113:0x0357, B:115:0x036b, B:116:0x0374, B:118:0x037a, B:121:0x0389, B:126:0x038d, B:127:0x039b, B:129:0x03a1, B:132:0x03b4, B:137:0x03b8, B:138:0x03c6, B:140:0x03cc, B:143:0x03db, B:148:0x03df, B:149:0x040f, B:151:0x0415, B:153:0x042b, B:154:0x043c, B:156:0x0442, B:158:0x0458, B:159:0x046a, B:161:0x0470, B:163:0x047c, B:164:0x0485, B:166:0x048b, B:167:0x04a3, B:169:0x04a9, B:171:0x04b5, B:173:0x04bb, B:178:0x04c1, B:179:0x04c5, B:181:0x04cb, B:183:0x0558, B:184:0x057e, B:186:0x0584, B:188:0x05a5, B:190:0x05be, B:195:0x05ec, B:198:0x04d8, B:199:0x04e9, B:201:0x04ef, B:204:0x04fe, B:209:0x0502, B:210:0x0510, B:212:0x0516, B:215:0x0529, B:220:0x052d, B:221:0x053b, B:223:0x0541, B:226:0x0550, B:231:0x0554, B:235:0x029b, B:236:0x0274, B:238:0x027a, B:243:0x02a2, B:245:0x02b0, B:246:0x0334, B:249:0x02da, B:250:0x0302, B:252:0x0308, B:254:0x032d, B:256:0x00ef, B:258:0x025c, B:260:0x0128, B:261:0x014e, B:263:0x0154, B:266:0x01ee, B:269:0x016f, B:271:0x0175, B:275:0x0192, B:278:0x01a0, B:280:0x01a6, B:281:0x01ea, B:283:0x01bf, B:288:0x01f9, B:289:0x0218, B:291:0x021e, B:293:0x0231, B:295:0x0237, B:296:0x0243), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0584 A[Catch: all -> 0x0052, LOOP:13: B:184:0x057e->B:186:0x0584, LOOP_END, TryCatch #1 {all -> 0x0052, blocks: (B:13:0x004b, B:15:0x0633, B:18:0x065e, B:20:0x0696, B:21:0x06c8, B:23:0x06d2, B:24:0x06fa, B:27:0x070a, B:29:0x076a, B:30:0x0773, B:32:0x0779, B:33:0x0784, B:35:0x078a, B:39:0x079d, B:58:0x07ee, B:41:0x07a2, B:43:0x07ac, B:45:0x07b6, B:47:0x07c0, B:49:0x07ca, B:51:0x07d4, B:53:0x07de, B:55:0x07e4, B:75:0x07f2, B:77:0x07f8, B:78:0x081c, B:80:0x0822, B:82:0x083b, B:84:0x084c, B:86:0x085a, B:87:0x0861, B:91:0x0718, B:93:0x0721, B:94:0x0745, B:96:0x074b, B:98:0x0762, B:113:0x0357, B:115:0x036b, B:116:0x0374, B:118:0x037a, B:121:0x0389, B:126:0x038d, B:127:0x039b, B:129:0x03a1, B:132:0x03b4, B:137:0x03b8, B:138:0x03c6, B:140:0x03cc, B:143:0x03db, B:148:0x03df, B:149:0x040f, B:151:0x0415, B:153:0x042b, B:154:0x043c, B:156:0x0442, B:158:0x0458, B:159:0x046a, B:161:0x0470, B:163:0x047c, B:164:0x0485, B:166:0x048b, B:167:0x04a3, B:169:0x04a9, B:171:0x04b5, B:173:0x04bb, B:178:0x04c1, B:179:0x04c5, B:181:0x04cb, B:183:0x0558, B:184:0x057e, B:186:0x0584, B:188:0x05a5, B:190:0x05be, B:195:0x05ec, B:198:0x04d8, B:199:0x04e9, B:201:0x04ef, B:204:0x04fe, B:209:0x0502, B:210:0x0510, B:212:0x0516, B:215:0x0529, B:220:0x052d, B:221:0x053b, B:223:0x0541, B:226:0x0550, B:231:0x0554, B:235:0x029b, B:236:0x0274, B:238:0x027a, B:243:0x02a2, B:245:0x02b0, B:246:0x0334, B:249:0x02da, B:250:0x0302, B:252:0x0308, B:254:0x032d, B:256:0x00ef, B:258:0x025c, B:260:0x0128, B:261:0x014e, B:263:0x0154, B:266:0x01ee, B:269:0x016f, B:271:0x0175, B:275:0x0192, B:278:0x01a0, B:280:0x01a6, B:281:0x01ea, B:283:0x01bf, B:288:0x01f9, B:289:0x0218, B:291:0x021e, B:293:0x0231, B:295:0x0237, B:296:0x0243), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x065e A[Catch: all -> 0x0052, TRY_ENTER, TryCatch #1 {all -> 0x0052, blocks: (B:13:0x004b, B:15:0x0633, B:18:0x065e, B:20:0x0696, B:21:0x06c8, B:23:0x06d2, B:24:0x06fa, B:27:0x070a, B:29:0x076a, B:30:0x0773, B:32:0x0779, B:33:0x0784, B:35:0x078a, B:39:0x079d, B:58:0x07ee, B:41:0x07a2, B:43:0x07ac, B:45:0x07b6, B:47:0x07c0, B:49:0x07ca, B:51:0x07d4, B:53:0x07de, B:55:0x07e4, B:75:0x07f2, B:77:0x07f8, B:78:0x081c, B:80:0x0822, B:82:0x083b, B:84:0x084c, B:86:0x085a, B:87:0x0861, B:91:0x0718, B:93:0x0721, B:94:0x0745, B:96:0x074b, B:98:0x0762, B:113:0x0357, B:115:0x036b, B:116:0x0374, B:118:0x037a, B:121:0x0389, B:126:0x038d, B:127:0x039b, B:129:0x03a1, B:132:0x03b4, B:137:0x03b8, B:138:0x03c6, B:140:0x03cc, B:143:0x03db, B:148:0x03df, B:149:0x040f, B:151:0x0415, B:153:0x042b, B:154:0x043c, B:156:0x0442, B:158:0x0458, B:159:0x046a, B:161:0x0470, B:163:0x047c, B:164:0x0485, B:166:0x048b, B:167:0x04a3, B:169:0x04a9, B:171:0x04b5, B:173:0x04bb, B:178:0x04c1, B:179:0x04c5, B:181:0x04cb, B:183:0x0558, B:184:0x057e, B:186:0x0584, B:188:0x05a5, B:190:0x05be, B:195:0x05ec, B:198:0x04d8, B:199:0x04e9, B:201:0x04ef, B:204:0x04fe, B:209:0x0502, B:210:0x0510, B:212:0x0516, B:215:0x0529, B:220:0x052d, B:221:0x053b, B:223:0x0541, B:226:0x0550, B:231:0x0554, B:235:0x029b, B:236:0x0274, B:238:0x027a, B:243:0x02a2, B:245:0x02b0, B:246:0x0334, B:249:0x02da, B:250:0x0302, B:252:0x0308, B:254:0x032d, B:256:0x00ef, B:258:0x025c, B:260:0x0128, B:261:0x014e, B:263:0x0154, B:266:0x01ee, B:269:0x016f, B:271:0x0175, B:275:0x0192, B:278:0x01a0, B:280:0x01a6, B:281:0x01ea, B:283:0x01bf, B:288:0x01f9, B:289:0x0218, B:291:0x021e, B:293:0x0231, B:295:0x0237, B:296:0x0243), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x05be A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:13:0x004b, B:15:0x0633, B:18:0x065e, B:20:0x0696, B:21:0x06c8, B:23:0x06d2, B:24:0x06fa, B:27:0x070a, B:29:0x076a, B:30:0x0773, B:32:0x0779, B:33:0x0784, B:35:0x078a, B:39:0x079d, B:58:0x07ee, B:41:0x07a2, B:43:0x07ac, B:45:0x07b6, B:47:0x07c0, B:49:0x07ca, B:51:0x07d4, B:53:0x07de, B:55:0x07e4, B:75:0x07f2, B:77:0x07f8, B:78:0x081c, B:80:0x0822, B:82:0x083b, B:84:0x084c, B:86:0x085a, B:87:0x0861, B:91:0x0718, B:93:0x0721, B:94:0x0745, B:96:0x074b, B:98:0x0762, B:113:0x0357, B:115:0x036b, B:116:0x0374, B:118:0x037a, B:121:0x0389, B:126:0x038d, B:127:0x039b, B:129:0x03a1, B:132:0x03b4, B:137:0x03b8, B:138:0x03c6, B:140:0x03cc, B:143:0x03db, B:148:0x03df, B:149:0x040f, B:151:0x0415, B:153:0x042b, B:154:0x043c, B:156:0x0442, B:158:0x0458, B:159:0x046a, B:161:0x0470, B:163:0x047c, B:164:0x0485, B:166:0x048b, B:167:0x04a3, B:169:0x04a9, B:171:0x04b5, B:173:0x04bb, B:178:0x04c1, B:179:0x04c5, B:181:0x04cb, B:183:0x0558, B:184:0x057e, B:186:0x0584, B:188:0x05a5, B:190:0x05be, B:195:0x05ec, B:198:0x04d8, B:199:0x04e9, B:201:0x04ef, B:204:0x04fe, B:209:0x0502, B:210:0x0510, B:212:0x0516, B:215:0x0529, B:220:0x052d, B:221:0x053b, B:223:0x0541, B:226:0x0550, B:231:0x0554, B:235:0x029b, B:236:0x0274, B:238:0x027a, B:243:0x02a2, B:245:0x02b0, B:246:0x0334, B:249:0x02da, B:250:0x0302, B:252:0x0308, B:254:0x032d, B:256:0x00ef, B:258:0x025c, B:260:0x0128, B:261:0x014e, B:263:0x0154, B:266:0x01ee, B:269:0x016f, B:271:0x0175, B:275:0x0192, B:278:0x01a0, B:280:0x01a6, B:281:0x01ea, B:283:0x01bf, B:288:0x01f9, B:289:0x0218, B:291:0x021e, B:293:0x0231, B:295:0x0237, B:296:0x0243), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05ec A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #1 {all -> 0x0052, blocks: (B:13:0x004b, B:15:0x0633, B:18:0x065e, B:20:0x0696, B:21:0x06c8, B:23:0x06d2, B:24:0x06fa, B:27:0x070a, B:29:0x076a, B:30:0x0773, B:32:0x0779, B:33:0x0784, B:35:0x078a, B:39:0x079d, B:58:0x07ee, B:41:0x07a2, B:43:0x07ac, B:45:0x07b6, B:47:0x07c0, B:49:0x07ca, B:51:0x07d4, B:53:0x07de, B:55:0x07e4, B:75:0x07f2, B:77:0x07f8, B:78:0x081c, B:80:0x0822, B:82:0x083b, B:84:0x084c, B:86:0x085a, B:87:0x0861, B:91:0x0718, B:93:0x0721, B:94:0x0745, B:96:0x074b, B:98:0x0762, B:113:0x0357, B:115:0x036b, B:116:0x0374, B:118:0x037a, B:121:0x0389, B:126:0x038d, B:127:0x039b, B:129:0x03a1, B:132:0x03b4, B:137:0x03b8, B:138:0x03c6, B:140:0x03cc, B:143:0x03db, B:148:0x03df, B:149:0x040f, B:151:0x0415, B:153:0x042b, B:154:0x043c, B:156:0x0442, B:158:0x0458, B:159:0x046a, B:161:0x0470, B:163:0x047c, B:164:0x0485, B:166:0x048b, B:167:0x04a3, B:169:0x04a9, B:171:0x04b5, B:173:0x04bb, B:178:0x04c1, B:179:0x04c5, B:181:0x04cb, B:183:0x0558, B:184:0x057e, B:186:0x0584, B:188:0x05a5, B:190:0x05be, B:195:0x05ec, B:198:0x04d8, B:199:0x04e9, B:201:0x04ef, B:204:0x04fe, B:209:0x0502, B:210:0x0510, B:212:0x0516, B:215:0x0529, B:220:0x052d, B:221:0x053b, B:223:0x0541, B:226:0x0550, B:231:0x0554, B:235:0x029b, B:236:0x0274, B:238:0x027a, B:243:0x02a2, B:245:0x02b0, B:246:0x0334, B:249:0x02da, B:250:0x0302, B:252:0x0308, B:254:0x032d, B:256:0x00ef, B:258:0x025c, B:260:0x0128, B:261:0x014e, B:263:0x0154, B:266:0x01ee, B:269:0x016f, B:271:0x0175, B:275:0x0192, B:278:0x01a0, B:280:0x01a6, B:281:0x01ea, B:283:0x01bf, B:288:0x01f9, B:289:0x0218, B:291:0x021e, B:293:0x0231, B:295:0x0237, B:296:0x0243), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x04d8 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:13:0x004b, B:15:0x0633, B:18:0x065e, B:20:0x0696, B:21:0x06c8, B:23:0x06d2, B:24:0x06fa, B:27:0x070a, B:29:0x076a, B:30:0x0773, B:32:0x0779, B:33:0x0784, B:35:0x078a, B:39:0x079d, B:58:0x07ee, B:41:0x07a2, B:43:0x07ac, B:45:0x07b6, B:47:0x07c0, B:49:0x07ca, B:51:0x07d4, B:53:0x07de, B:55:0x07e4, B:75:0x07f2, B:77:0x07f8, B:78:0x081c, B:80:0x0822, B:82:0x083b, B:84:0x084c, B:86:0x085a, B:87:0x0861, B:91:0x0718, B:93:0x0721, B:94:0x0745, B:96:0x074b, B:98:0x0762, B:113:0x0357, B:115:0x036b, B:116:0x0374, B:118:0x037a, B:121:0x0389, B:126:0x038d, B:127:0x039b, B:129:0x03a1, B:132:0x03b4, B:137:0x03b8, B:138:0x03c6, B:140:0x03cc, B:143:0x03db, B:148:0x03df, B:149:0x040f, B:151:0x0415, B:153:0x042b, B:154:0x043c, B:156:0x0442, B:158:0x0458, B:159:0x046a, B:161:0x0470, B:163:0x047c, B:164:0x0485, B:166:0x048b, B:167:0x04a3, B:169:0x04a9, B:171:0x04b5, B:173:0x04bb, B:178:0x04c1, B:179:0x04c5, B:181:0x04cb, B:183:0x0558, B:184:0x057e, B:186:0x0584, B:188:0x05a5, B:190:0x05be, B:195:0x05ec, B:198:0x04d8, B:199:0x04e9, B:201:0x04ef, B:204:0x04fe, B:209:0x0502, B:210:0x0510, B:212:0x0516, B:215:0x0529, B:220:0x052d, B:221:0x053b, B:223:0x0541, B:226:0x0550, B:231:0x0554, B:235:0x029b, B:236:0x0274, B:238:0x027a, B:243:0x02a2, B:245:0x02b0, B:246:0x0334, B:249:0x02da, B:250:0x0302, B:252:0x0308, B:254:0x032d, B:256:0x00ef, B:258:0x025c, B:260:0x0128, B:261:0x014e, B:263:0x0154, B:266:0x01ee, B:269:0x016f, B:271:0x0175, B:275:0x0192, B:278:0x01a0, B:280:0x01a6, B:281:0x01ea, B:283:0x01bf, B:288:0x01f9, B:289:0x0218, B:291:0x021e, B:293:0x0231, B:295:0x0237, B:296:0x0243), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x027a A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:13:0x004b, B:15:0x0633, B:18:0x065e, B:20:0x0696, B:21:0x06c8, B:23:0x06d2, B:24:0x06fa, B:27:0x070a, B:29:0x076a, B:30:0x0773, B:32:0x0779, B:33:0x0784, B:35:0x078a, B:39:0x079d, B:58:0x07ee, B:41:0x07a2, B:43:0x07ac, B:45:0x07b6, B:47:0x07c0, B:49:0x07ca, B:51:0x07d4, B:53:0x07de, B:55:0x07e4, B:75:0x07f2, B:77:0x07f8, B:78:0x081c, B:80:0x0822, B:82:0x083b, B:84:0x084c, B:86:0x085a, B:87:0x0861, B:91:0x0718, B:93:0x0721, B:94:0x0745, B:96:0x074b, B:98:0x0762, B:113:0x0357, B:115:0x036b, B:116:0x0374, B:118:0x037a, B:121:0x0389, B:126:0x038d, B:127:0x039b, B:129:0x03a1, B:132:0x03b4, B:137:0x03b8, B:138:0x03c6, B:140:0x03cc, B:143:0x03db, B:148:0x03df, B:149:0x040f, B:151:0x0415, B:153:0x042b, B:154:0x043c, B:156:0x0442, B:158:0x0458, B:159:0x046a, B:161:0x0470, B:163:0x047c, B:164:0x0485, B:166:0x048b, B:167:0x04a3, B:169:0x04a9, B:171:0x04b5, B:173:0x04bb, B:178:0x04c1, B:179:0x04c5, B:181:0x04cb, B:183:0x0558, B:184:0x057e, B:186:0x0584, B:188:0x05a5, B:190:0x05be, B:195:0x05ec, B:198:0x04d8, B:199:0x04e9, B:201:0x04ef, B:204:0x04fe, B:209:0x0502, B:210:0x0510, B:212:0x0516, B:215:0x0529, B:220:0x052d, B:221:0x053b, B:223:0x0541, B:226:0x0550, B:231:0x0554, B:235:0x029b, B:236:0x0274, B:238:0x027a, B:243:0x02a2, B:245:0x02b0, B:246:0x0334, B:249:0x02da, B:250:0x0302, B:252:0x0308, B:254:0x032d, B:256:0x00ef, B:258:0x025c, B:260:0x0128, B:261:0x014e, B:263:0x0154, B:266:0x01ee, B:269:0x016f, B:271:0x0175, B:275:0x0192, B:278:0x01a0, B:280:0x01a6, B:281:0x01ea, B:283:0x01bf, B:288:0x01f9, B:289:0x0218, B:291:0x021e, B:293:0x0231, B:295:0x0237, B:296:0x0243), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x06d2 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:13:0x004b, B:15:0x0633, B:18:0x065e, B:20:0x0696, B:21:0x06c8, B:23:0x06d2, B:24:0x06fa, B:27:0x070a, B:29:0x076a, B:30:0x0773, B:32:0x0779, B:33:0x0784, B:35:0x078a, B:39:0x079d, B:58:0x07ee, B:41:0x07a2, B:43:0x07ac, B:45:0x07b6, B:47:0x07c0, B:49:0x07ca, B:51:0x07d4, B:53:0x07de, B:55:0x07e4, B:75:0x07f2, B:77:0x07f8, B:78:0x081c, B:80:0x0822, B:82:0x083b, B:84:0x084c, B:86:0x085a, B:87:0x0861, B:91:0x0718, B:93:0x0721, B:94:0x0745, B:96:0x074b, B:98:0x0762, B:113:0x0357, B:115:0x036b, B:116:0x0374, B:118:0x037a, B:121:0x0389, B:126:0x038d, B:127:0x039b, B:129:0x03a1, B:132:0x03b4, B:137:0x03b8, B:138:0x03c6, B:140:0x03cc, B:143:0x03db, B:148:0x03df, B:149:0x040f, B:151:0x0415, B:153:0x042b, B:154:0x043c, B:156:0x0442, B:158:0x0458, B:159:0x046a, B:161:0x0470, B:163:0x047c, B:164:0x0485, B:166:0x048b, B:167:0x04a3, B:169:0x04a9, B:171:0x04b5, B:173:0x04bb, B:178:0x04c1, B:179:0x04c5, B:181:0x04cb, B:183:0x0558, B:184:0x057e, B:186:0x0584, B:188:0x05a5, B:190:0x05be, B:195:0x05ec, B:198:0x04d8, B:199:0x04e9, B:201:0x04ef, B:204:0x04fe, B:209:0x0502, B:210:0x0510, B:212:0x0516, B:215:0x0529, B:220:0x052d, B:221:0x053b, B:223:0x0541, B:226:0x0550, B:231:0x0554, B:235:0x029b, B:236:0x0274, B:238:0x027a, B:243:0x02a2, B:245:0x02b0, B:246:0x0334, B:249:0x02da, B:250:0x0302, B:252:0x0308, B:254:0x032d, B:256:0x00ef, B:258:0x025c, B:260:0x0128, B:261:0x014e, B:263:0x0154, B:266:0x01ee, B:269:0x016f, B:271:0x0175, B:275:0x0192, B:278:0x01a0, B:280:0x01a6, B:281:0x01ea, B:283:0x01bf, B:288:0x01f9, B:289:0x0218, B:291:0x021e, B:293:0x0231, B:295:0x0237, B:296:0x0243), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x02a2 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:13:0x004b, B:15:0x0633, B:18:0x065e, B:20:0x0696, B:21:0x06c8, B:23:0x06d2, B:24:0x06fa, B:27:0x070a, B:29:0x076a, B:30:0x0773, B:32:0x0779, B:33:0x0784, B:35:0x078a, B:39:0x079d, B:58:0x07ee, B:41:0x07a2, B:43:0x07ac, B:45:0x07b6, B:47:0x07c0, B:49:0x07ca, B:51:0x07d4, B:53:0x07de, B:55:0x07e4, B:75:0x07f2, B:77:0x07f8, B:78:0x081c, B:80:0x0822, B:82:0x083b, B:84:0x084c, B:86:0x085a, B:87:0x0861, B:91:0x0718, B:93:0x0721, B:94:0x0745, B:96:0x074b, B:98:0x0762, B:113:0x0357, B:115:0x036b, B:116:0x0374, B:118:0x037a, B:121:0x0389, B:126:0x038d, B:127:0x039b, B:129:0x03a1, B:132:0x03b4, B:137:0x03b8, B:138:0x03c6, B:140:0x03cc, B:143:0x03db, B:148:0x03df, B:149:0x040f, B:151:0x0415, B:153:0x042b, B:154:0x043c, B:156:0x0442, B:158:0x0458, B:159:0x046a, B:161:0x0470, B:163:0x047c, B:164:0x0485, B:166:0x048b, B:167:0x04a3, B:169:0x04a9, B:171:0x04b5, B:173:0x04bb, B:178:0x04c1, B:179:0x04c5, B:181:0x04cb, B:183:0x0558, B:184:0x057e, B:186:0x0584, B:188:0x05a5, B:190:0x05be, B:195:0x05ec, B:198:0x04d8, B:199:0x04e9, B:201:0x04ef, B:204:0x04fe, B:209:0x0502, B:210:0x0510, B:212:0x0516, B:215:0x0529, B:220:0x052d, B:221:0x053b, B:223:0x0541, B:226:0x0550, B:231:0x0554, B:235:0x029b, B:236:0x0274, B:238:0x027a, B:243:0x02a2, B:245:0x02b0, B:246:0x0334, B:249:0x02da, B:250:0x0302, B:252:0x0308, B:254:0x032d, B:256:0x00ef, B:258:0x025c, B:260:0x0128, B:261:0x014e, B:263:0x0154, B:266:0x01ee, B:269:0x016f, B:271:0x0175, B:275:0x0192, B:278:0x01a0, B:280:0x01a6, B:281:0x01ea, B:283:0x01bf, B:288:0x01f9, B:289:0x0218, B:291:0x021e, B:293:0x0231, B:295:0x0237, B:296:0x0243), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0154 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:13:0x004b, B:15:0x0633, B:18:0x065e, B:20:0x0696, B:21:0x06c8, B:23:0x06d2, B:24:0x06fa, B:27:0x070a, B:29:0x076a, B:30:0x0773, B:32:0x0779, B:33:0x0784, B:35:0x078a, B:39:0x079d, B:58:0x07ee, B:41:0x07a2, B:43:0x07ac, B:45:0x07b6, B:47:0x07c0, B:49:0x07ca, B:51:0x07d4, B:53:0x07de, B:55:0x07e4, B:75:0x07f2, B:77:0x07f8, B:78:0x081c, B:80:0x0822, B:82:0x083b, B:84:0x084c, B:86:0x085a, B:87:0x0861, B:91:0x0718, B:93:0x0721, B:94:0x0745, B:96:0x074b, B:98:0x0762, B:113:0x0357, B:115:0x036b, B:116:0x0374, B:118:0x037a, B:121:0x0389, B:126:0x038d, B:127:0x039b, B:129:0x03a1, B:132:0x03b4, B:137:0x03b8, B:138:0x03c6, B:140:0x03cc, B:143:0x03db, B:148:0x03df, B:149:0x040f, B:151:0x0415, B:153:0x042b, B:154:0x043c, B:156:0x0442, B:158:0x0458, B:159:0x046a, B:161:0x0470, B:163:0x047c, B:164:0x0485, B:166:0x048b, B:167:0x04a3, B:169:0x04a9, B:171:0x04b5, B:173:0x04bb, B:178:0x04c1, B:179:0x04c5, B:181:0x04cb, B:183:0x0558, B:184:0x057e, B:186:0x0584, B:188:0x05a5, B:190:0x05be, B:195:0x05ec, B:198:0x04d8, B:199:0x04e9, B:201:0x04ef, B:204:0x04fe, B:209:0x0502, B:210:0x0510, B:212:0x0516, B:215:0x0529, B:220:0x052d, B:221:0x053b, B:223:0x0541, B:226:0x0550, B:231:0x0554, B:235:0x029b, B:236:0x0274, B:238:0x027a, B:243:0x02a2, B:245:0x02b0, B:246:0x0334, B:249:0x02da, B:250:0x0302, B:252:0x0308, B:254:0x032d, B:256:0x00ef, B:258:0x025c, B:260:0x0128, B:261:0x014e, B:263:0x0154, B:266:0x01ee, B:269:0x016f, B:271:0x0175, B:275:0x0192, B:278:0x01a0, B:280:0x01a6, B:281:0x01ea, B:283:0x01bf, B:288:0x01f9, B:289:0x0218, B:291:0x021e, B:293:0x0231, B:295:0x0237, B:296:0x0243), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x021e A[Catch: all -> 0x0052, LOOP:19: B:289:0x0218->B:291:0x021e, LOOP_END, TryCatch #1 {all -> 0x0052, blocks: (B:13:0x004b, B:15:0x0633, B:18:0x065e, B:20:0x0696, B:21:0x06c8, B:23:0x06d2, B:24:0x06fa, B:27:0x070a, B:29:0x076a, B:30:0x0773, B:32:0x0779, B:33:0x0784, B:35:0x078a, B:39:0x079d, B:58:0x07ee, B:41:0x07a2, B:43:0x07ac, B:45:0x07b6, B:47:0x07c0, B:49:0x07ca, B:51:0x07d4, B:53:0x07de, B:55:0x07e4, B:75:0x07f2, B:77:0x07f8, B:78:0x081c, B:80:0x0822, B:82:0x083b, B:84:0x084c, B:86:0x085a, B:87:0x0861, B:91:0x0718, B:93:0x0721, B:94:0x0745, B:96:0x074b, B:98:0x0762, B:113:0x0357, B:115:0x036b, B:116:0x0374, B:118:0x037a, B:121:0x0389, B:126:0x038d, B:127:0x039b, B:129:0x03a1, B:132:0x03b4, B:137:0x03b8, B:138:0x03c6, B:140:0x03cc, B:143:0x03db, B:148:0x03df, B:149:0x040f, B:151:0x0415, B:153:0x042b, B:154:0x043c, B:156:0x0442, B:158:0x0458, B:159:0x046a, B:161:0x0470, B:163:0x047c, B:164:0x0485, B:166:0x048b, B:167:0x04a3, B:169:0x04a9, B:171:0x04b5, B:173:0x04bb, B:178:0x04c1, B:179:0x04c5, B:181:0x04cb, B:183:0x0558, B:184:0x057e, B:186:0x0584, B:188:0x05a5, B:190:0x05be, B:195:0x05ec, B:198:0x04d8, B:199:0x04e9, B:201:0x04ef, B:204:0x04fe, B:209:0x0502, B:210:0x0510, B:212:0x0516, B:215:0x0529, B:220:0x052d, B:221:0x053b, B:223:0x0541, B:226:0x0550, B:231:0x0554, B:235:0x029b, B:236:0x0274, B:238:0x027a, B:243:0x02a2, B:245:0x02b0, B:246:0x0334, B:249:0x02da, B:250:0x0302, B:252:0x0308, B:254:0x032d, B:256:0x00ef, B:258:0x025c, B:260:0x0128, B:261:0x014e, B:263:0x0154, B:266:0x01ee, B:269:0x016f, B:271:0x0175, B:275:0x0192, B:278:0x01a0, B:280:0x01a6, B:281:0x01ea, B:283:0x01bf, B:288:0x01f9, B:289:0x0218, B:291:0x021e, B:293:0x0231, B:295:0x0237, B:296:0x0243), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0237 A[Catch: all -> 0x0052, TryCatch #1 {all -> 0x0052, blocks: (B:13:0x004b, B:15:0x0633, B:18:0x065e, B:20:0x0696, B:21:0x06c8, B:23:0x06d2, B:24:0x06fa, B:27:0x070a, B:29:0x076a, B:30:0x0773, B:32:0x0779, B:33:0x0784, B:35:0x078a, B:39:0x079d, B:58:0x07ee, B:41:0x07a2, B:43:0x07ac, B:45:0x07b6, B:47:0x07c0, B:49:0x07ca, B:51:0x07d4, B:53:0x07de, B:55:0x07e4, B:75:0x07f2, B:77:0x07f8, B:78:0x081c, B:80:0x0822, B:82:0x083b, B:84:0x084c, B:86:0x085a, B:87:0x0861, B:91:0x0718, B:93:0x0721, B:94:0x0745, B:96:0x074b, B:98:0x0762, B:113:0x0357, B:115:0x036b, B:116:0x0374, B:118:0x037a, B:121:0x0389, B:126:0x038d, B:127:0x039b, B:129:0x03a1, B:132:0x03b4, B:137:0x03b8, B:138:0x03c6, B:140:0x03cc, B:143:0x03db, B:148:0x03df, B:149:0x040f, B:151:0x0415, B:153:0x042b, B:154:0x043c, B:156:0x0442, B:158:0x0458, B:159:0x046a, B:161:0x0470, B:163:0x047c, B:164:0x0485, B:166:0x048b, B:167:0x04a3, B:169:0x04a9, B:171:0x04b5, B:173:0x04bb, B:178:0x04c1, B:179:0x04c5, B:181:0x04cb, B:183:0x0558, B:184:0x057e, B:186:0x0584, B:188:0x05a5, B:190:0x05be, B:195:0x05ec, B:198:0x04d8, B:199:0x04e9, B:201:0x04ef, B:204:0x04fe, B:209:0x0502, B:210:0x0510, B:212:0x0516, B:215:0x0529, B:220:0x052d, B:221:0x053b, B:223:0x0541, B:226:0x0550, B:231:0x0554, B:235:0x029b, B:236:0x0274, B:238:0x027a, B:243:0x02a2, B:245:0x02b0, B:246:0x0334, B:249:0x02da, B:250:0x0302, B:252:0x0308, B:254:0x032d, B:256:0x00ef, B:258:0x025c, B:260:0x0128, B:261:0x014e, B:263:0x0154, B:266:0x01ee, B:269:0x016f, B:271:0x0175, B:275:0x0192, B:278:0x01a0, B:280:0x01a6, B:281:0x01ea, B:283:0x01bf, B:288:0x01f9, B:289:0x0218, B:291:0x021e, B:293:0x0231, B:295:0x0237, B:296:0x0243), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:298:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x074b A[Catch: all -> 0x0052, LOOP:3: B:94:0x0745->B:96:0x074b, LOOP_END, TryCatch #1 {all -> 0x0052, blocks: (B:13:0x004b, B:15:0x0633, B:18:0x065e, B:20:0x0696, B:21:0x06c8, B:23:0x06d2, B:24:0x06fa, B:27:0x070a, B:29:0x076a, B:30:0x0773, B:32:0x0779, B:33:0x0784, B:35:0x078a, B:39:0x079d, B:58:0x07ee, B:41:0x07a2, B:43:0x07ac, B:45:0x07b6, B:47:0x07c0, B:49:0x07ca, B:51:0x07d4, B:53:0x07de, B:55:0x07e4, B:75:0x07f2, B:77:0x07f8, B:78:0x081c, B:80:0x0822, B:82:0x083b, B:84:0x084c, B:86:0x085a, B:87:0x0861, B:91:0x0718, B:93:0x0721, B:94:0x0745, B:96:0x074b, B:98:0x0762, B:113:0x0357, B:115:0x036b, B:116:0x0374, B:118:0x037a, B:121:0x0389, B:126:0x038d, B:127:0x039b, B:129:0x03a1, B:132:0x03b4, B:137:0x03b8, B:138:0x03c6, B:140:0x03cc, B:143:0x03db, B:148:0x03df, B:149:0x040f, B:151:0x0415, B:153:0x042b, B:154:0x043c, B:156:0x0442, B:158:0x0458, B:159:0x046a, B:161:0x0470, B:163:0x047c, B:164:0x0485, B:166:0x048b, B:167:0x04a3, B:169:0x04a9, B:171:0x04b5, B:173:0x04bb, B:178:0x04c1, B:179:0x04c5, B:181:0x04cb, B:183:0x0558, B:184:0x057e, B:186:0x0584, B:188:0x05a5, B:190:0x05be, B:195:0x05ec, B:198:0x04d8, B:199:0x04e9, B:201:0x04ef, B:204:0x04fe, B:209:0x0502, B:210:0x0510, B:212:0x0516, B:215:0x0529, B:220:0x052d, B:221:0x053b, B:223:0x0541, B:226:0x0550, B:231:0x0554, B:235:0x029b, B:236:0x0274, B:238:0x027a, B:243:0x02a2, B:245:0x02b0, B:246:0x0334, B:249:0x02da, B:250:0x0302, B:252:0x0308, B:254:0x032d, B:256:0x00ef, B:258:0x025c, B:260:0x0128, B:261:0x014e, B:263:0x0154, B:266:0x01ee, B:269:0x016f, B:271:0x0175, B:275:0x0192, B:278:0x01a0, B:280:0x01a6, B:281:0x01ea, B:283:0x01bf, B:288:0x01f9, B:289:0x0218, B:291:0x021e, B:293:0x0231, B:295:0x0237, B:296:0x0243), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:181:0x0299 -> B:176:0x029b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.util.List r21, defpackage.eraj r22, defpackage.ffgu r23) {
        /*
            Method dump skipped, instructions count: 2192
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coqo.g(java.util.List, eraj, ffgu):java.lang.Object");
    }

    public final String h(int i) {
        String str;
        String n;
        String n2;
        djrm a2 = this.g.a(i);
        if (a2 != null) {
            return djrn.a(a2).a;
        }
        String w = ((ctwb) this.d.b()).h(i).w();
        w.getClass();
        if (p(i, w)) {
            ensk h = a.h();
            h.Y(ente.a, "BugleSimStateTracker");
            ((enrr) h.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getRcsProvisioningIdForFi-bYZ02fE", 747, "PhoneSimsStateUpdaterImpl.kt")).q("Getting RcsProvisioningId for Fi subscription.");
            String i2 = i(w);
            str = i2 != null ? ((ctyx) this.o.b()).f("msisdn_for_iccid_".concat(i2), null) : null;
            if (str == null) {
                str = r(m(i));
            }
        } else {
            str = "";
            if (this.z.a()) {
                dkvt l2 = l(i);
                if (l2 != null && (n2 = l2.n()) != null) {
                    str = n2;
                }
                if (str.length() == 0) {
                    ensk j = a.j();
                    j.Y(ente.a, "BugleSimStateTracker");
                    ((enrr) j.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "getSimSerialNumberFromTelephony-0jkzt_0", 951, "PhoneSimsStateUpdaterImpl.kt")).t("getSimSerialNumberFromTelephony: SimSerialNumber is empty for subscription ID %s", new djrq(i));
                }
            } else {
                dkvt l3 = l(i);
                if (l3 != null && (n = l3.n()) != null) {
                    str = n;
                }
            }
        }
        djro djroVar = new djro(str);
        if (djrn.a(djroVar).a.length() != 0) {
            coqb coqbVar = this.g;
            if (i >= 0 && djrn.a(djroVar).a.length() != 0) {
                coqbVar.b.set(true);
                coqbVar.c.put(new djrq(i), djroVar);
            }
        }
        return str;
    }

    public final String i(String str) {
        return ((ctyx) this.o.b()).f("rcs_user_id_".concat(str), str);
    }

    public final void j(String str) {
        ensk h = a.h();
        h.Y(ente.a, "BugleSimStateTracker");
        ((enrr) h.h("com/google/android/apps/messaging/shared/simstatetracker/PhoneSimsStateUpdaterImpl", "broadcastSimRemovalIntent", 376, "PhoneSimsStateUpdaterImpl.kt")).t("Broadcasting SimRemoval for: %s", dktx.SIM_ID.c(str));
        Intent intent = new Intent(RcsIntents.ACTION_RCS_SIM_REMOVED);
        intent.putExtra(RcsIntents.EXTRA_PREVIOUS_SIM_ID, str);
        dkuk.b(this.m, intent, "com.google.android.apps.messaging.rcsprovisioning.RcsProvisioningBroadcastReceiver", dkuj.SIM_STATE_TRACKER);
    }

    public final void k(int i) {
        ((akzt) ((cosh) this.v.b()).a.b()).e("Bugle.Dsdr.PhoneSimsStateUpdater", i - 1);
    }
}
