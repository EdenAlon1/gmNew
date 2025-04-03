package defpackage;

import android.content.Context;
import j$.util.Comparator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Comparator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aans {
    private static final enru k = enru.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/text/TextBubbleUiAdapter");
    public final Context a;
    public final aigz b;
    public final aawu c;
    public final cvny d;
    public final ffsk e;
    public final ffhd f;
    public final aubs g;
    public final ConcurrentHashMap h;
    public final ffji i;
    public final ffji j;
    private final cstx l;
    private final czmd m;
    private final cglo n;
    private final aamn o;
    private final cpdg p;
    private final askd q;
    private final cwrk r;
    private final asnh s;
    private final athg t;
    private final atho u;
    private final athc v;
    private final asqn w;
    private final abln x;

    public aans(Context context, cstx cstxVar, czmd czmdVar, cglo cgloVar, abln ablnVar, aigz aigzVar, aamn aamnVar, aawu aawuVar, cpdg cpdgVar, askd askdVar, cvny cvnyVar, ffsk ffskVar, ffhd ffhdVar, cwrk cwrkVar, asnh asnhVar, aubs aubsVar, athg athgVar, atho athoVar, athc athcVar, asqn asqnVar) {
        ffji a;
        ffji a2;
        context.getClass();
        cstxVar.getClass();
        czmdVar.getClass();
        aigzVar.getClass();
        aawuVar.getClass();
        cpdgVar.getClass();
        askdVar.getClass();
        cvnyVar.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        cwrkVar.getClass();
        this.a = context;
        this.l = cstxVar;
        this.m = czmdVar;
        this.n = cgloVar;
        this.x = ablnVar;
        this.b = aigzVar;
        this.o = aamnVar;
        this.c = aawuVar;
        this.p = cpdgVar;
        this.q = askdVar;
        this.d = cvnyVar;
        this.e = ffskVar;
        this.f = ffhdVar;
        this.r = cwrkVar;
        this.s = asnhVar;
        this.g = aubsVar;
        this.t = athgVar;
        this.u = athoVar;
        this.v = athcVar;
        this.w = asqnVar;
        this.h = new ConcurrentHashMap();
        a = axqa.a(new aanp(this), 1000L, ffskVar);
        this.i = a;
        a2 = axqa.a(new aanq(this), 1000L, ffskVar);
        this.j = a2;
    }

    public static final List e(List list) {
        aanr aanrVar = new aanr();
        final ffjm ffjmVar = new ffjm() { // from class: aamu
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                dlus dlusVar;
                dlus dlusVar2;
                dltq dltqVar = (dltq) obj;
                boolean z = dltqVar instanceof dlto;
                dltq dltqVar2 = (dltq) obj2;
                int i = 0;
                if (z && ((dlto) dltqVar).a == dlus.q) {
                    if ((dltqVar2 instanceof dltn) || ((dltqVar2 instanceof dlto) && ((dlusVar2 = ((dlto) dltqVar2).a) == dlus.p || dlusVar2 == dlus.n || dlusVar2 == dlus.o))) {
                        i = 1;
                    }
                } else if ((dltqVar2 instanceof dlto) && ((dlto) dltqVar2).a == dlus.q && ((dltqVar instanceof dltn) || (z && ((dlusVar = ((dlto) dltqVar).a) == dlus.p || dlusVar == dlus.n || dlusVar == dlus.o)))) {
                    i = -1;
                }
                return Integer.valueOf(i);
            }
        };
        Comparator thenComparing = Comparator.EL.thenComparing(aanrVar, new java.util.Comparator() { // from class: aamv
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Number) ffjm.this.a(obj, obj2)).intValue();
            }
        });
        final ffjm ffjmVar2 = new ffjm() { // from class: aamw
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                dltq dltqVar = (dltq) obj;
                dltq dltqVar2 = (dltq) obj2;
                return Integer.valueOf(dltqVar.a() <= dltqVar2.b() ? -1 : dltqVar2.a() <= dltqVar.b() ? 1 : ffkj.a(dltqVar2.a(), dltqVar.a()));
            }
        };
        java.util.Comparator thenComparing2 = Comparator.EL.thenComparing(thenComparing, new java.util.Comparator() { // from class: aamx
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Number) ffjm.this.a(obj, obj2)).intValue();
            }
        });
        thenComparing2.getClass();
        return ffdx.ah(list, thenComparing2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (r3 == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String f(defpackage.aamr r8) {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            appw r1 = r8.a
            boolean r1 = defpackage.aant.b(r1)
            java.lang.String r2 = "\n"
            if (r1 == 0) goto L22
            android.content.Context r1 = r7.a
            android.content.res.Resources r1 = r1.getResources()
            r3 = 2132088759(0x7f1517b7, float:1.981781E38)
            java.lang.String r1 = r1.getString(r3)
            r0.append(r1)
            r0.append(r2)
        L22:
            cpdg r1 = r7.p
            android.content.Context r3 = r7.a
            appw r4 = r8.a
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r4 = defpackage.aant.a(r4)
            java.lang.String r1 = r1.c(r3, r4)
            appw r3 = r8.a
            java.lang.String r3 = r3.c()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L5d
            android.content.Context r4 = r7.a
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2132083668(0x7f1503d4, float:1.9807485E38)
            java.lang.String r4 = r4.getString(r5)
            r0.append(r4)
            r0.append(r1)
            if (r3 != 0) goto L68
            r0.append(r2)
            goto L5f
        L5d:
            if (r3 != 0) goto L68
        L5f:
            appw r2 = r8.a
            java.lang.String r2 = r2.c()
            r0.append(r2)
        L68:
            java.lang.String r0 = r0.toString()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto Laa
            enru r2 = defpackage.aans.k
            ensk r2 = r2.i()
            enrr r2 = (defpackage.enrr) r2
            com.google.android.apps.messaging.shared.api.messaging.MessageId r3 = r8.r
            ensn r4 = defpackage.csux.c
            r2.Y(r4, r3)
            java.lang.String r3 = "generateFullMessage"
            r4 = 304(0x130, float:4.26E-43)
            java.lang.String r5 = "com/google/android/apps/messaging/conversation2/messagelist/message/bubble/text/TextBubbleUiAdapter"
            java.lang.String r6 = "TextBubbleUiAdapter.kt"
            ensk r2 = r2.h(r5, r3, r4, r6)
            enrr r2 = (defpackage.enrr) r2
            appw r8 = r8.a
            java.lang.String r8 = r8.c()
            int r8 = r8.length()
            if (r1 == 0) goto La4
            int r1 = r1.length()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto La5
        La4:
            r1 = 0
        La5:
            java.lang.String r3 = "Detected an empty text message. Message length=%s, subject length=%s"
            r2.w(r3, r8, r1)
        Laa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aans.f(aamr):java.lang.String");
    }

    private final boolean g(String str) {
        return this.l.f() && str != null && str.length() != 0 && this.l.g(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0232  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.axrc a(final defpackage.ffsk r27, final defpackage.aamr r28) {
        /*
            Method dump skipped, instructions count: 1596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aans.a(ffsk, aamr):axrc");
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r21, java.lang.String r22, defpackage.aamr r23, defpackage.ffgu r24) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aans.b(android.content.Context, java.lang.String, aamr, ffgu):java.lang.Object");
    }

    public final List c(aamr aamrVar, String str) {
        fffs fffsVar = new fffs((byte[]) null);
        zwb zwbVar = aamrVar.l;
        if (zwbVar != null) {
            fffsVar.addAll(ffdx.ak(this.x.a(zwbVar.b, str, zwbVar.a)));
        }
        return ffdx.a(fffsVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final doml d(aamr aamrVar, String str, List list, ffix ffixVar) {
        boolean z;
        boolean g = g(aamrVar.a.c());
        cstx cstxVar = this.l;
        boolean g2 = g(str);
        List<String> c = cstxVar.c(str);
        c.getClass();
        List list2 = null;
        if (!c.isEmpty() && c.size() <= ((Number) czhm.f.e()).intValue()) {
            fffs fffsVar = new fffs((byte[]) null);
            for (String str2 : c) {
                fffsVar.add(new dolr(str2, this.m.b(str2)));
            }
            list2 = ffdx.a(fffsVar);
        }
        List list3 = list2;
        domv domvVar = new domv(this.q.a(), this.s.a(), ((ersq) ((atgb) this.t).a.b()).a("bugle.enable_get_text_with_content_min_width_fix"), this.u.a() && this.q.a(), this.v.a(), this.w.a());
        ffix ffixVar2 = aamrVar.o;
        boolean z2 = aamrVar.p;
        dnwi dnwiVar = aamrVar.s;
        dofn dofnVar = aamrVar.t;
        if (cojh.a().booleanValue() && ctid.i) {
            engw a = aamrVar.a.a();
            a.getClass();
            if (!a.isEmpty()) {
                enqv it = a.iterator();
                while (it.hasNext()) {
                    if (((apcy) it.next()).c() == appv.OTP) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        return new doml(str, list, aamrVar.e, g, aamrVar.d, aamrVar.b, aamrVar.c, ffixVar, g2, list3, domvVar, ffixVar2, z2, false, dofnVar, dnwiVar, z, !g(str) || aamrVar.p, aamrVar.u, 98560);
    }
}
