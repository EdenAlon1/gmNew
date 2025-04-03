package defpackage;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czns extends cznx {
    public static final entd a = entd.c("BugleRbmDeepLinking");
    private static final List p = ffdx.g("www.google", "search.google.com", "ads.google.com");
    public final Activity b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    private final cznm q;
    private final ffbr r;
    private final ffbr s;
    private final ffbr t;
    private final ffbr u;
    private final ffbr v;
    private final ffbr w;

    public czns(Activity activity, cznm cznmVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, ffbr ffbrVar18, ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22) {
        activity.getClass();
        ffbrVar2.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        ffbrVar14.getClass();
        ffbrVar15.getClass();
        ffbrVar16.getClass();
        ffbrVar17.getClass();
        ffbrVar20.getClass();
        ffbrVar21.getClass();
        this.b = activity;
        this.q = cznmVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
        this.g = ffbrVar5;
        this.h = ffbrVar6;
        this.i = ffbrVar7;
        this.j = ffbrVar9;
        this.k = ffbrVar10;
        this.l = ffbrVar11;
        this.r = ffbrVar12;
        this.m = ffbrVar13;
        this.s = ffbrVar14;
        this.t = ffbrVar15;
        this.n = ffbrVar16;
        this.u = ffbrVar18;
        this.v = ffbrVar19;
        this.w = ffbrVar22;
    }

    public static final Uri h(Uri uri) {
        if (uri != null && uri.isHierarchical()) {
            return uri;
        }
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        uri2.getClass();
        return Uri.parse(ffpc.r(uri2));
    }

    public static final boolean i(Intent intent) {
        Uri data = intent.getData();
        if (ffkj.e(data != null ? data.getScheme() : null, "sms")) {
            return true;
        }
        Uri data2 = intent.getData();
        return ffkj.e(data2 != null ? data2.getScheme() : null, "smsto");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cznt
            if (r0 == 0) goto L13
            r0 = r6
            cznt r0 = (defpackage.cznt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cznt r0 = new cznt
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.ffci.b(r6)
            ffbr r6 = r4.w
            java.lang.Object r6 = r6.b()
            ckac r6 = (defpackage.ckac) r6
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r5 = defpackage.bdgq.b(r5)
            elfl r5 = r6.d(r5)
            r0.c = r3
            java.lang.Object r6 = defpackage.fgfz.c(r5, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r6.getClass()
            j$.util.Optional r6 = (j$.util.Optional) r6
            java.lang.Object r5 = defpackage.fflm.b(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czns.a(java.lang.String, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Intent r6, java.lang.String r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.cznw
            if (r0 == 0) goto L13
            r0 = r8
            cznw r0 = (defpackage.cznw) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            cznw r0 = new cznw
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.b
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.String r6 = r0.f
            java.lang.Object r7 = r0.a
            czns r0 = r0.e
            defpackage.ffci.b(r8)
            r4 = r8
            r8 = r6
            r6 = r7
            r7 = r4
            goto L61
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            defpackage.ffci.b(r8)
            android.net.Uri r8 = r6.getData()
            if (r8 != 0) goto L43
            goto L4e
        L43:
            android.net.Uri r8 = h(r8)
            if (r8 == 0) goto L4e
            java.lang.String r2 = "gid"
            r8.getQueryParameter(r2)
        L4e:
            java.lang.String r8 = r5.c(r6)
            r0.e = r5
            r0.a = r6
            r0.f = r8
            r0.d = r3
            java.lang.Object r7 = r5.a(r7, r0)
            if (r7 == r1) goto Laf
            r0 = r5
        L61:
            awui r7 = (defpackage.awui) r7
            android.content.Intent r6 = (android.content.Intent) r6
            java.lang.String r1 = "android.intent.extra.REFERRER"
            java.lang.String r6 = r6.getStringExtra(r1)
            if (r6 != 0) goto L6e
            goto L98
        L6e:
            java.util.List r1 = defpackage.czns.p
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L7a
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L98
        L7a:
            java.util.Iterator r1 = r1.iterator()
        L7e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L98
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = defpackage.ffpc.M(r6, r2)
            if (r2 == 0) goto L7e
            ffbr r6 = r0.u
            java.lang.Object r6 = r6.b()
            asud r6 = (defpackage.asud) r6
        L98:
            if (r7 == 0) goto Lac
            if (r8 == 0) goto Lac
            ffbr r6 = r0.u
            java.lang.Object r6 = r6.b()
            asud r6 = (defpackage.asud) r6
            ffbr r6 = r0.v
            java.lang.Object r6 = r6.b()
            asue r6 = (defpackage.asue) r6
        Lac:
            ffcu r6 = defpackage.ffcu.a
            return r6
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czns.b(android.content.Intent, java.lang.String, ffgu):java.lang.Object");
    }

    public final String c(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            return null;
        }
        if (!((asmu) this.r.b()).a() || !i(intent)) {
            Uri h = h(data);
            if (h != null) {
                return h.getQueryParameter("bot-id");
            }
            return null;
        }
        Uri h2 = h(intent.getData());
        if (h2 == null) {
            return null;
        }
        ((ensz) a.h()).t("getBotIdFromSmsUri extracted uri: %s", h2);
        String queryParameter = h2.getQueryParameter("service_id");
        if (queryParameter != null) {
            return queryParameter;
        }
        String str = (String) ffdx.M(d(intent));
        if (str == null) {
            return null;
        }
        cskc cskcVar = cpdg.a;
        if (aoqw.h(str)) {
            return str;
        }
        return null;
    }

    public final List d(Intent intent) {
        Optional b = ((ctbd) this.t.b()).b(intent);
        final ffji ffjiVar = new ffji() { // from class: cznn
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                String[] strArr = (String[]) obj;
                entd entdVar = czns.a;
                strArr.getClass();
                return ffdo.L(strArr);
            }
        };
        Object orElseGet = b.map(new Function() { // from class: czno
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = czns.a;
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElseGet(new Supplier() { // from class: cznp
            @Override // java.util.function.Supplier
            public final Object get() {
                entd entdVar = czns.a;
                return ffel.a;
            }
        });
        orElseGet.getClass();
        return (List) orElseGet;
    }

    public final void e(Uri uri, String str, String str2, String str3) {
        ((ensz) a.h()).D("RBM deep link Url fallback: %s, referer: %s", uri, str3);
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        try {
            eldl.p(this.q.fe(), intent);
            this.b.finish();
        } catch (ActivityNotFoundException e) {
            ((ensz) ((ensz) a.j()).g(e)).t("Activity was not found for intent, %s", intent);
            ((avjf) this.i.b()).m(8, str, str2, str3);
            g();
        }
    }

    public final void f() {
        Uri data = this.b.getIntent().getData();
        ((ensz) a.h()).t("Short Code not resolved, SMS fallback: %s", cskt.b(data != null ? data.toString() : null));
        Intent putExtra = new Intent("android.intent.action.VIEW").setClassName((Context) this.s.b(), "com.google.android.apps.messaging.ui.conversation.LaunchConversationActivity").setFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM).setData(data).putExtra("rbm_sms_short_code_fallback", true);
        putExtra.getClass();
        eldl.p(this.b, putExtra);
        this.b.finish();
        avjf avjfVar = (avjf) this.i.b();
        eqdw eqdwVar = (eqdw) eqea.a.createBuilder();
        eqdwVar.getClass();
        eqwb.d(9, eqdwVar);
        eqwb.c(6, eqdwVar);
        avjfVar.e(eqwb.a(eqdwVar), "", "sms", null);
    }

    public final void g() {
        ((ensz) a.h()).q("RBM Deep Link Error Page");
        czny cznyVar = new czny();
        fbae.e(cznyVar);
        cg cgVar = new cg(this.q.fe().a());
        cgVar.E(R.id.content, cznyVar);
        cgVar.c();
    }

    public final void j(int i, String str, String str2, boolean z, String str3) {
        avjf avjfVar = (avjf) this.i.b();
        eqdw eqdwVar = (eqdw) eqea.a.createBuilder();
        eqdwVar.getClass();
        eqwb.d(9, eqdwVar);
        eqwb.c(i, eqdwVar);
        eqwb.b(z, eqdwVar);
        avjfVar.e(eqwb.a(eqdwVar), str, str2, str3);
    }

    /* compiled from: PG */
    final class a implements ejwd<avhy> {
        public a() {
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            Uri data = czns.this.b.getIntent().getData();
            ((ensz) ((ensz) czns.a.j()).g(th)).t("Failed to retrieve bot metadata: %s", cskt.b(data != null ? data.toString() : null));
            avjf avjfVar = (avjf) czns.this.i.b();
            czns cznsVar = czns.this;
            Intent intent = cznsVar.b.getIntent();
            intent.getClass();
            czns cznsVar2 = czns.this;
            String c = cznsVar.c(intent);
            Uri data2 = cznsVar2.b.getIntent().getData();
            avjfVar.m(10, c, data2 != null ? data2.getScheme() : null, czns.this.b.getIntent().getStringExtra("android.intent.extra.REFERRER"));
            czoi czoiVar = (czoi) czns.this.m.b();
            Intent intent2 = czns.this.b.getIntent();
            intent2.getClass();
            if (czoiVar.b(intent2).isPresent()) {
                czns.this.f();
            } else {
                czns.this.g();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:123:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0119  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0102  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x021d  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x02da  */
        @Override // defpackage.ejwd
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* synthetic */ void b(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 1014
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: czns.a.b(java.lang.Object):void");
        }

        @Override // defpackage.ejwd
        public final /* synthetic */ void hB() {
        }
    }
}
