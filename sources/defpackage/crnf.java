package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crnf {
    private byte[] d = new byte[0];
    private List e = new ArrayList();
    private final Object f = new Object();
    private final ffbr g;
    private final altk h;
    private static final cskc c = cskc.g("BugleAnnotation", "OtpMessageAnnotator");
    public static final cfup a = cfvl.i(cfvl.b, "otp_allow_from_contact", true);
    static final cfup b = cfvl.i(cfvl.b, "disable_logging_annotation_otp_matching_pattern", true);

    public crnf(ffbr ffbrVar, altk altkVar) {
        this.g = ffbrVar;
        this.h = altkVar;
    }

    public final fbuk a(MessageCoreData messageCoreData) {
        return b(messageCoreData, false);
    }

    public final fbuk b(MessageCoreData messageCoreData, boolean z) {
        ArrayList<emmy> arrayList;
        emxd emxdVar;
        emxd emxdVar2;
        if (messageCoreData.d() == 0 || messageCoreData.d() == 3) {
            String az = messageCoreData.az();
            if (!TextUtils.isEmpty(az)) {
                synchronized (this.f) {
                    arrayList = new ArrayList(this.e);
                }
                ParticipantsTable.BindData b2 = ((bdrr) this.g.b()).b(messageCoreData.aA());
                boolean z2 = b2 == null || TextUtils.isEmpty(b2.T());
                if (!emxe.c(az)) {
                    for (emmy emmyVar : arrayList) {
                        Matcher matcher = emmyVar.a.matcher(az);
                        if (matcher.find()) {
                            String group = matcher.group(emmyVar.c);
                            Pattern pattern = emmyVar.b;
                            if (pattern == null || pattern.matcher(group).matches()) {
                                emxdVar = new emxd(group, Integer.valueOf(matcher.start()));
                                if (emxdVar == null && !((String) emxdVar.a).isEmpty()) {
                                    String str = (String) emxdVar.a;
                                    String replaceAll = str.replaceAll("[\\s_-]", "");
                                    int intValue = ((Integer) emxdVar.b).intValue();
                                    fbuj fbujVar = (fbuj) fbuk.a.createBuilder();
                                    fbujVar.copyOnWrite();
                                    ((fbuk) fbujVar.instance).h = intValue;
                                    int length = intValue + str.length();
                                    fbujVar.copyOnWrite();
                                    ((fbuk) fbujVar.instance).i = length;
                                    fbqt fbqtVar = fbqt.OTP;
                                    fbujVar.copyOnWrite();
                                    ((fbuk) fbujVar.instance).e = fbqtVar.a();
                                    fbujVar.copyOnWrite();
                                    ((fbuk) fbujVar.instance).f = "OTP";
                                    fbuz fbuzVar = (fbuz) fbva.a.createBuilder();
                                    fbuzVar.copyOnWrite();
                                    fbva fbvaVar = (fbva) fbuzVar.instance;
                                    replaceAll.getClass();
                                    fbvaVar.b = replaceAll;
                                    fbujVar.copyOnWrite();
                                    fbuk fbukVar = (fbuk) fbujVar.instance;
                                    fbva fbvaVar2 = (fbva) fbuzVar.build();
                                    fbvaVar2.getClass();
                                    fbukVar.d = fbvaVar2;
                                    fbukVar.c = 2;
                                    emxdVar2 = new emxd((fbuk) fbujVar.build(), emmyVar.a.pattern());
                                    break;
                                }
                            }
                        }
                        emxdVar = null;
                        if (emxdVar == null) {
                        }
                    }
                }
                emxdVar2 = null;
                if (emxdVar2 != null) {
                    c.m("Found an OTP");
                    if (!z) {
                        altk altkVar = this.h;
                        String str2 = (String) emxdVar2.b;
                        eoqw eoqwVar = (eoqw) eoqx.a.createBuilder();
                        if (!((Boolean) b.e()).booleanValue()) {
                            eoqwVar.copyOnWrite();
                            eoqx eoqxVar = (eoqx) eoqwVar.instance;
                            str2.getClass();
                            eoqxVar.b |= 1;
                            eoqxVar.c = str2;
                        }
                        eoir eoirVar = (eoir) eoit.a.createBuilder();
                        int s = b2 != null ? bdqu.s(b2) : 1;
                        eoirVar.copyOnWrite();
                        eoit eoitVar = (eoit) eoirVar.instance;
                        eoitVar.d = s - 1;
                        eoitVar.b |= 2;
                        eoirVar.copyOnWrite();
                        eoit eoitVar2 = (eoit) eoirVar.instance;
                        eoitVar2.b |= 4;
                        eoitVar2.e = !z2;
                        fbqt fbqtVar2 = fbqt.OTP;
                        eoirVar.copyOnWrite();
                        eoit eoitVar3 = (eoit) eoirVar.instance;
                        eoitVar3.c = fbqtVar2.a();
                        eoitVar3.b |= 1;
                        eoirVar.copyOnWrite();
                        eoit eoitVar4 = (eoit) eoirVar.instance;
                        eoqx eoqxVar2 = (eoqx) eoqwVar.build();
                        eoqxVar2.getClass();
                        eoitVar4.f = eoqxVar2;
                        eoitVar4.b |= 8;
                        altkVar.E(messageCoreData, (eoit) eoirVar.build());
                    }
                    if (z2 || ((Boolean) a.e()).booleanValue()) {
                        return (fbuk) emxdVar2.a;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0035 A[Catch: all -> 0x000d, TryCatch #3 {all -> 0x000d, blocks: (B:63:0x0007, B:6:0x0011, B:8:0x001a, B:9:0x0023, B:13:0x0030, B:19:0x0034, B:24:0x0035, B:26:0x003d, B:27:0x0044, B:30:0x0046, B:32:0x0049, B:33:0x00ac, B:34:0x00bc, B:36:0x004f, B:37:0x0066, B:39:0x006c, B:41:0x007b, B:43:0x0089, B:45:0x008d, B:46:0x00aa, B:59:0x00bf, B:60:0x00e5, B:55:0x00e8, B:56:0x00f6, B:51:0x00f9, B:52:0x0107, B:11:0x0024, B:12:0x002f), top: B:62:0x0007, inners: #1, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a A[Catch: all -> 0x000d, TryCatch #3 {all -> 0x000d, blocks: (B:63:0x0007, B:6:0x0011, B:8:0x001a, B:9:0x0023, B:13:0x0030, B:19:0x0034, B:24:0x0035, B:26:0x003d, B:27:0x0044, B:30:0x0046, B:32:0x0049, B:33:0x00ac, B:34:0x00bc, B:36:0x004f, B:37:0x0066, B:39:0x006c, B:41:0x007b, B:43:0x0089, B:45:0x008d, B:46:0x00aa, B:59:0x00bf, B:60:0x00e5, B:55:0x00e8, B:56:0x00f6, B:51:0x00f9, B:52:0x0107, B:11:0x0024, B:12:0x002f), top: B:62:0x0007, inners: #1, #4, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(byte[] r10) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crnf.c(byte[]):boolean");
    }
}
