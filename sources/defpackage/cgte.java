package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgte {
    public static final cfup a;
    private static final int b;
    private static final String c;
    private static final String d;
    private static final String e;
    private final Context f;
    private final cqoh g;
    private final ffbr h;
    private final csuk i;
    private final cpbs j;
    private final ctap k;
    private final bdve l;
    private final csuu m;
    private final akzt n;
    private final crmg o;
    private final cnce p;
    private final asne q;
    private final bamz r;

    static {
        int millis = (int) TimeUnit.SECONDS.toMillis(5L);
        b = millis;
        c = "<par dur=\"" + millis + "ms\"><img src=\"%s\" region=\"Image\" /></par>";
        d = "<par dur=\"" + millis + "ms\"><text src=\"%s\" region=\"Text\" /></par>";
        e = "<par dur=\"" + millis + "ms\"><ref src=\"%s\" /></par>";
        a = cfvl.e(cfvl.b, "max_image_width_height_rcs", 131072);
    }

    public cgte(Context context, cqoh cqohVar, ffbr ffbrVar, csuk csukVar, cpbs cpbsVar, ctap ctapVar, bdve bdveVar, csuu csuuVar, akzt akztVar, crmg crmgVar, bamz bamzVar, cnce cnceVar, asne asneVar) {
        this.f = context;
        this.g = cqohVar;
        this.h = ffbrVar;
        this.i = csukVar;
        this.j = cpbsVar;
        this.k = ctapVar;
        this.l = bdveVar;
        this.m = csuuVar;
        this.n = akztVar;
        this.o = crmgVar;
        this.r = bamzVar;
        this.p = cnceVar;
        this.q = asneVar;
    }

    public static String b(String str, String str2, String str3, int i, String str4) {
        if (str != null) {
            return str;
        }
        if (true == TextUtils.isEmpty(str2)) {
            str2 = str3;
        }
        return String.format(str4, Integer.valueOf(i), str2);
    }

    private final long c(ln lnVar, MessagePartCoreData messagePartCoreData, String str) {
        Uri t = messagePartCoreData.t();
        if (t == null) {
            csjy.f("Bugle", "Null otherPart uri");
            return 0L;
        }
        String V = messagePartCoreData.V();
        V.getClass();
        if (csjy.q("Bugle", 2)) {
            csjy.l("Bugle", "addPart attachmentUrl: ".concat(t.toString()));
        }
        long b2 = this.m.b(t);
        d(lnVar, str, t, V);
        return b2;
    }

    private static void d(ln lnVar, String str, Uri uri, String str2) {
        lt ltVar = new lt();
        ltVar.e = uri;
        ltVar.h(str2.getBytes());
        e(ltVar, str);
        lnVar.d(ltVar);
    }

    private static void e(lt ltVar, String str) {
        ltVar.g(str.getBytes());
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str = str.substring(0, lastIndexOf);
        }
        ltVar.f(str.getBytes());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0936  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x093e  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x08ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cgtf a(android.content.Context r55, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r56, int r57) {
        /*
            Method dump skipped, instructions count: 2449
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgte.a(android.content.Context, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, int):cgtf");
    }
}
