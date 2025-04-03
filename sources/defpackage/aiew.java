package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.multishare.chip.ChipData;
import com.google.android.apps.messaging.multishare.chip.ChipId;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiew implements aidw {
    public static final cskc a = cskc.g("BugleMultiShare", "SuggestionsAdapterImpl");
    public final Context b;
    public final ffbr c;
    public final ffbr d;
    public final aicd e;
    public final ahuu f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final equr j;
    public final aidv k;
    private final ffsk l;
    private final amav m;
    private final ffbr n;
    private final fgdj o;
    private final fgdj p;
    private final fgdj q;
    private final fgdj r;
    private final fgdj s;
    private final fgdj t;

    public aiew(ffsk ffskVar, Context context, ffbr ffbrVar, ffbr ffbrVar2, aicd aicdVar, amav amavVar, ahuu ahuuVar, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, equr equrVar, ffbr ffbrVar7) {
        ffskVar.getClass();
        context.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        aicdVar.getClass();
        amavVar.getClass();
        ahuuVar.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        equrVar.getClass();
        ffbrVar7.getClass();
        this.l = ffskVar;
        this.b = context;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = aicdVar;
        this.m = amavVar;
        this.f = ahuuVar;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
        this.n = ffbrVar6;
        this.j = equrVar;
        aidv aidvVar = new aidv(null);
        this.k = aidvVar;
        aiel aielVar = new aiel(aicdVar.b(), this);
        int i = fgcz.a;
        fgdj b = fgbn.b(aielVar, ffskVar, fgcy.a(0L, 3), new aids(null));
        this.o = b;
        fgdj b2 = fgbn.b(new fgch(new aieo(b, this), ahuuVar.b(), new aief(this)), ffskVar, fgcy.a(0L, 3), aidvVar);
        this.p = b2;
        fgdj b3 = fgbn.b(new fgch(new aier(b, this), ahuuVar.b(), new aiev(this, null)), ffskVar, fgcy.a(0L, 3), ffel.a);
        this.q = b3;
        fgdj b4 = fgbn.b(new fgch(new aieu(b, this), ahuuVar.b(), new aied(this, null)), ffskVar, fgcy.a(0L, 3), ffel.a);
        this.r = b4;
        fgdj a2 = ((aidh) ffbrVar6.b()).a();
        this.s = a2;
        this.t = fgbn.b(fgck.b(b2, b3, b4, a2, new aiee(this)), ffskVar, fgcy.a(0L, 3), aidvVar);
    }

    @Override // defpackage.aidw
    public final fgdj a() {
        return this.t;
    }

    public final aidq b(final ambn ambnVar, final String str, final ahut ahutVar, final Pattern pattern) {
        return new aidq(str, new ffix() { // from class: aiec
            @Override // defpackage.ffix
            public final Object invoke() {
                final aiew aiewVar = this;
                final ambn ambnVar2 = ambn.this;
                String c = ambnVar2.c();
                dnym d = tud.d((tud) aiewVar.i.b(), ambnVar2);
                String e = ambnVar2.e();
                String valueOf = String.valueOf(ambnVar2.d());
                boolean f = ahutVar.f(ambnVar2.b());
                Pattern pattern2 = pattern;
                List f2 = aiewVar.f(pattern2, ambnVar2.e(), 1, 0);
                String concat = c.concat(" ");
                return new aide(str, new dngv(d, e, concat.concat(valueOf), f, ffdx.ad(f2, aiewVar.f(pattern2, ambnVar2.d(), 2, concat.length())), new ffix() { // from class: aidy
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        aiew aiewVar2 = aiew.this;
                        aifv.d((aifv) aiewVar2.h.b(), 6, 0, 0, 6);
                        ambn ambnVar3 = ambnVar2;
                        ambnVar3.getClass();
                        aiewVar2.f.c(new ChipData(new ChipId.Identity(ambnVar3.b()), ambnVar3.e(), ambnVar3.g(), ambnVar3.a(), false, 16, null));
                        aiewVar2.e.c();
                        return ffcu.a;
                    }
                }, null, 64));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, java.util.regex.Pattern r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.aieg
            if (r0 == 0) goto L13
            r0 = r8
            aieg r0 = (defpackage.aieg) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aieg r0 = new aieg
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "query"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.util.regex.Pattern r7 = r0.e
            java.lang.String r6 = r0.d
            defpackage.ffci.b(r8)
            goto L70
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.ffci.b(r8)
            int r8 = r6.length()
            if (r8 != 0) goto L45
            aidd r6 = new aidd
            r7 = 0
            r6.<init>(r7)
            return r6
        L45:
            cskc r8 = defpackage.aiew.a
            csjb r8 = r8.a()
            r8.M(r3, r6)
            java.lang.String r2 = "searching corp contacts"
            r8.I(r2)
            r8.r()
            amav r8 = r5.m
            amaw r8 = r8.b()
            elfl r8 = r8.a(r6)
            r8.getClass()
            r0.d = r6
            r0.e = r7
            r0.c = r4
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)
            if (r8 != r1) goto L70
            return r1
        L70:
            engw r8 = (defpackage.engw) r8
            cskc r0 = defpackage.aiew.a
            csjb r0 = r0.a()
            r0.M(r3, r6)
            java.lang.String r1 = "finished searching corp contacts"
            r0.I(r1)
            r0.r()
            aidd r0 = new aidd
            r8.getClass()
            r0.<init>(r6, r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiew.c(java.lang.String, java.util.regex.Pattern, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r7, java.util.regex.Pattern r8, defpackage.ffgu r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.aieh
            if (r0 == 0) goto L13
            r0 = r9
            aieh r0 = (defpackage.aieh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aieh r0 = new aieh
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "query"
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 != r4) goto L33
            ecri r7 = r0.f
            java.util.regex.Pattern r8 = r0.e
            java.lang.String r0 = r0.d
            defpackage.ffci.b(r9)
            r5 = r9
            r9 = r7
            r7 = r0
            r0 = r5
            goto L83
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            defpackage.ffci.b(r9)
            int r9 = r7.length()
            if (r9 != 0) goto L4b
            aidr r7 = new aidr
            r8 = 0
            r7.<init>(r8)
            return r7
        L4b:
            cskc r9 = defpackage.aiew.a
            csjb r9 = r9.a()
            r9.M(r3, r7)
            java.lang.String r2 = "searching personal contacts"
            r9.I(r2)
            r9.r()
            ffbr r9 = r6.g
            java.lang.Object r9 = r9.b()
            ecrj r9 = (defpackage.ecrj) r9
            ecri r9 = r9.d()
            amav r2 = r6.m
            amaw r2 = r2.b()
            elfl r2 = r2.b(r7)
            r2.getClass()
            r0.d = r7
            r0.e = r8
            r0.f = r9
            r0.c = r4
            java.lang.Object r0 = defpackage.fgfz.c(r2, r0)
            if (r0 == r1) goto L9e
        L83:
            engw r0 = (defpackage.engw) r0
            cskc r1 = defpackage.aiew.a
            csjb r1 = r1.a()
            r1.M(r3, r7)
            java.lang.String r2 = "finished searching personal contacts"
            r1.I(r2)
            r1.r()
            aidr r1 = new aidr
            r0.getClass()
            r1.<init>(r7, r0, r8, r9)
        L9e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiew.d(java.lang.String, java.util.regex.Pattern, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r6, java.util.regex.Pattern r7, defpackage.ffgu r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.aiei
            if (r0 == 0) goto L13
            r0 = r8
            aiei r0 = (defpackage.aiei) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aiei r0 = new aiei
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "query"
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.util.regex.Pattern r7 = r0.e
            java.lang.String r6 = r0.d
            defpackage.ffci.b(r8)
            goto L70
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            defpackage.ffci.b(r8)
            int r8 = r6.length()
            if (r8 != 0) goto L45
            aidd r6 = new aidd
            r7 = 0
            r6.<init>(r7)
            return r6
        L45:
            cskc r8 = defpackage.aiew.a
            csjb r8 = r8.a()
            r8.M(r3, r6)
            java.lang.String r2 = "searching work contacts"
            r8.I(r2)
            r8.r()
            amav r8 = r5.m
            amaw r8 = r8.b()
            elfl r8 = r8.c(r6)
            r8.getClass()
            r0.d = r6
            r0.e = r7
            r0.c = r4
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)
            if (r8 != r1) goto L70
            return r1
        L70:
            engw r8 = (defpackage.engw) r8
            cskc r0 = defpackage.aiew.a
            csjb r0 = r0.a()
            r0.M(r3, r6)
            java.lang.String r1 = "finished searching work contacts"
            r0.I(r1)
            r0.r()
            aidd r0 = new aidd
            r8.getClass()
            r0.<init>(r6, r8, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiew.e(java.lang.String, java.util.regex.Pattern, ffgu):java.lang.Object");
    }

    public final List f(Pattern pattern, String str, int i, int i2) {
        if (pattern == null) {
            return ffel.a;
        }
        Locale c = ctid.c(this.b);
        c.getClass();
        String lowerCase = str.toLowerCase(c);
        lowerCase.getClass();
        Matcher matcher = pattern.matcher(lowerCase);
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (matcher.find(i3)) {
            int start = matcher.start();
            int end = matcher.end();
            arrayList.add(new dnep(1, i, start + i2, end + i2));
            i3 = end;
        }
        if (i == 2) {
            arrayList.add(new dnep(2, 2, i2, str.length() + i2));
        }
        return arrayList;
    }
}
