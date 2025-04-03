package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwfa implements cwed {
    public static final enru a = enru.c("com/google/android/apps/messaging/startchat/suggestion/ContactSuggestionsAdapterImpl");
    public final Context b;
    public final cwhc c;
    public final ffbr d;
    public final cwav e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final attl i;
    public final cwec j;
    private final ffsk k;
    private final amav l;
    private final cwis m;
    private final ffbr n;
    private final ffbr o;
    private final cvwx p;
    private final fgdj q;
    private final fgdj r;
    private final fgdj s;
    private final fgdj t;
    private final fgdj u;
    private final fgdj v;
    private final fgdj w;

    public cwfa(ffsk ffskVar, Context context, cwhc cwhcVar, amav amavVar, cwis cwisVar, ffbr ffbrVar, cwav cwavVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, cvwx cvwxVar, attl attlVar) {
        ffskVar.getClass();
        context.getClass();
        cwhcVar.getClass();
        amavVar.getClass();
        cwisVar.getClass();
        cwavVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        cvwxVar.getClass();
        attlVar.getClass();
        this.k = ffskVar;
        this.b = context;
        this.c = cwhcVar;
        this.l = amavVar;
        this.m = cwisVar;
        this.d = ffbrVar;
        this.e = cwavVar;
        this.n = ffbrVar2;
        this.o = ffbrVar3;
        this.f = ffbrVar4;
        this.g = ffbrVar5;
        this.h = ffbrVar6;
        this.p = cvwxVar;
        this.i = attlVar;
        cwec cwecVar = new cwec((String) null, (List) null, (ffix) null, (String) null, (cweb) null, 63);
        this.j = cwecVar;
        cwep cwepVar = new cwep(cwhcVar.b(), this);
        int i = fgcz.a;
        fgdj b = fgbn.b(cwepVar, ffskVar, fgcy.a(0L, 3), new cwgo(null));
        this.q = b;
        fgdj a2 = ((cwgj) ffbrVar2.b()).a();
        this.r = a2;
        fgdj a3 = ((cwft) ffbrVar3.b()).a();
        this.s = a3;
        fgdj b2 = fgbn.b(new fgch(new cwes(b, this), cwisVar.a(), new cwej(this)), ffskVar, fgcy.a(0L, 3), cwecVar);
        this.t = b2;
        fgdj b3 = fgbn.b(new fgch(new cwev(b, this), cwisVar.a(), new cwez(this, null)), ffskVar, fgcy.a(0L, 3), ffel.a);
        this.u = b3;
        fgdj b4 = fgbn.b(new fgch(new cwey(b, this), cwisVar.a(), new cweh(this, null)), ffskVar, fgcy.a(0L, 3), ffel.a);
        this.v = b4;
        this.w = fgbn.b(axqw.a(a2, b2, b3, b4, a3, cvwxVar.a(), new cwei(this)), ffskVar, fgcy.a(0L, 3), cwecVar);
    }

    @Override // defpackage.cwed
    public final /* synthetic */ ffxx a() {
        return this.w;
    }

    public final cwfb b() {
        String string = this.b.getString(R.string.group_directory_header);
        string.getClass();
        return new cwfb("group_header", new dngr(string));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r9, java.util.regex.Pattern r10, defpackage.ffgu r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.cwek
            if (r0 == 0) goto L13
            r0 = r11
            cwek r0 = (defpackage.cwek) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cwek r0 = new cwek
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "queryCorp"
            java.lang.String r4 = "com/google/android/apps/messaging/startchat/suggestion/ContactSuggestionsAdapterImpl"
            java.lang.String r5 = "ContactSuggestionsAdapterImpl.kt"
            java.lang.String r6 = "BugleContacts"
            r7 = 1
            if (r2 == 0) goto L3b
            if (r2 != r7) goto L33
            java.util.regex.Pattern r10 = r0.e
            java.lang.String r9 = r0.d
            defpackage.ffci.b(r11)
            goto L84
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            defpackage.ffci.b(r11)
            int r11 = r9.length()
            if (r11 != 0) goto L4b
            cwdw r9 = new cwdw
            r10 = 0
            r9.<init>(r10)
            return r9
        L4b:
            enru r11 = defpackage.cwfa.a
            ensk r11 = r11.e()
            ensn r2 = defpackage.ente.a
            r11.Y(r2, r6)
            enrr r11 = (defpackage.enrr) r11
            ensn r2 = defpackage.csux.E
            r11.Y(r2, r9)
            r2 = 169(0xa9, float:2.37E-43)
            ensk r11 = r11.h(r4, r3, r2, r5)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r2 = "searching corp contacts"
            r11.q(r2)
            amav r11 = r8.l
            amaw r11 = r11.b()
            elfl r11 = r11.a(r9)
            r11.getClass()
            r0.d = r9
            r0.e = r10
            r0.c = r7
            java.lang.Object r11 = defpackage.fgfz.c(r11, r0)
            if (r11 != r1) goto L84
            return r1
        L84:
            engw r11 = (defpackage.engw) r11
            enru r0 = defpackage.cwfa.a
            ensk r0 = r0.e()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r6)
            enrr r0 = (defpackage.enrr) r0
            ensn r1 = defpackage.csux.E
            r0.Y(r1, r9)
            r1 = 172(0xac, float:2.41E-43)
            ensk r0 = r0.h(r4, r3, r1, r5)
            enrr r0 = (defpackage.enrr) r0
            java.lang.String r1 = "finished searching corp contacts"
            r0.q(r1)
            cwdw r0 = new cwdw
            r11.getClass()
            r0.<init>(r9, r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwfa.c(java.lang.String, java.util.regex.Pattern, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r10, java.util.regex.Pattern r11, defpackage.ffgu r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.cwel
            if (r0 == 0) goto L13
            r0 = r12
            cwel r0 = (defpackage.cwel) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cwel r0 = new cwel
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "queryPersonal"
            java.lang.String r4 = "com/google/android/apps/messaging/startchat/suggestion/ContactSuggestionsAdapterImpl"
            java.lang.String r5 = "ContactSuggestionsAdapterImpl.kt"
            java.lang.String r6 = "BugleContacts"
            r7 = 1
            if (r2 == 0) goto L41
            if (r2 != r7) goto L39
            ecri r10 = r0.f
            java.util.regex.Pattern r11 = r0.e
            java.lang.String r0 = r0.d
            defpackage.ffci.b(r12)
            r8 = r12
            r12 = r10
            r10 = r0
            r0 = r8
            goto L97
        L39:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L41:
            defpackage.ffci.b(r12)
            int r12 = r10.length()
            if (r12 != 0) goto L51
            cwgh r10 = new cwgh
            r11 = 0
            r10.<init>(r11)
            return r10
        L51:
            enru r12 = defpackage.cwfa.a
            ensk r12 = r12.e()
            ensn r2 = defpackage.ente.a
            r12.Y(r2, r6)
            enrr r12 = (defpackage.enrr) r12
            ensn r2 = defpackage.csux.E
            r12.Y(r2, r10)
            r2 = 146(0x92, float:2.05E-43)
            ensk r12 = r12.h(r4, r3, r2, r5)
            enrr r12 = (defpackage.enrr) r12
            java.lang.String r2 = "searching personal contacts"
            r12.q(r2)
            ffbr r12 = r9.d
            java.lang.Object r12 = r12.b()
            ecrj r12 = (defpackage.ecrj) r12
            ecri r12 = r12.d()
            amav r2 = r9.l
            amaw r2 = r2.b()
            elfl r2 = r2.b(r10)
            r2.getClass()
            r0.d = r10
            r0.e = r11
            r0.f = r12
            r0.c = r7
            java.lang.Object r0 = defpackage.fgfz.c(r2, r0)
            if (r0 == r1) goto Lc0
        L97:
            engw r0 = (defpackage.engw) r0
            enru r1 = defpackage.cwfa.a
            ensk r1 = r1.e()
            ensn r2 = defpackage.ente.a
            r1.Y(r2, r6)
            enrr r1 = (defpackage.enrr) r1
            ensn r2 = defpackage.csux.E
            r1.Y(r2, r10)
            r2 = 150(0x96, float:2.1E-43)
            ensk r1 = r1.h(r4, r3, r2, r5)
            enrr r1 = (defpackage.enrr) r1
            java.lang.String r2 = "finished searching personal contacts"
            r1.q(r2)
            cwgh r1 = new cwgh
            r0.getClass()
            r1.<init>(r10, r0, r11, r12)
        Lc0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwfa.d(java.lang.String, java.util.regex.Pattern, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r9, java.util.regex.Pattern r10, defpackage.ffgu r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.cwem
            if (r0 == 0) goto L13
            r0 = r11
            cwem r0 = (defpackage.cwem) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cwem r0 = new cwem
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            java.lang.String r3 = "queryWork"
            java.lang.String r4 = "com/google/android/apps/messaging/startchat/suggestion/ContactSuggestionsAdapterImpl"
            java.lang.String r5 = "ContactSuggestionsAdapterImpl.kt"
            java.lang.String r6 = "BugleContacts"
            r7 = 1
            if (r2 == 0) goto L3b
            if (r2 != r7) goto L33
            java.util.regex.Pattern r10 = r0.e
            java.lang.String r9 = r0.d
            defpackage.ffci.b(r11)
            goto L84
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            defpackage.ffci.b(r11)
            int r11 = r9.length()
            if (r11 != 0) goto L4b
            cwdw r9 = new cwdw
            r10 = 0
            r9.<init>(r10)
            return r9
        L4b:
            enru r11 = defpackage.cwfa.a
            ensk r11 = r11.e()
            ensn r2 = defpackage.ente.a
            r11.Y(r2, r6)
            enrr r11 = (defpackage.enrr) r11
            ensn r2 = defpackage.csux.E
            r11.Y(r2, r9)
            r2 = 158(0x9e, float:2.21E-43)
            ensk r11 = r11.h(r4, r3, r2, r5)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r2 = "searching work contacts"
            r11.q(r2)
            amav r11 = r8.l
            amaw r11 = r11.b()
            elfl r11 = r11.c(r9)
            r11.getClass()
            r0.d = r9
            r0.e = r10
            r0.c = r7
            java.lang.Object r11 = defpackage.fgfz.c(r11, r0)
            if (r11 != r1) goto L84
            return r1
        L84:
            engw r11 = (defpackage.engw) r11
            enru r0 = defpackage.cwfa.a
            ensk r0 = r0.e()
            ensn r1 = defpackage.ente.a
            r0.Y(r1, r6)
            enrr r0 = (defpackage.enrr) r0
            ensn r1 = defpackage.csux.E
            r0.Y(r1, r9)
            r1 = 161(0xa1, float:2.26E-43)
            ensk r0 = r0.h(r4, r3, r1, r5)
            enrr r0 = (defpackage.enrr) r0
            java.lang.String r1 = "finished searching work contacts"
            r0.q(r1)
            cwdw r0 = new cwdw
            r11.getClass()
            r0.<init>(r9, r11, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwfa.e(java.lang.String, java.util.regex.Pattern, ffgu):java.lang.Object");
    }

    public final cwfy f(final ambn ambnVar, final String str, final cwir cwirVar, final Pattern pattern) {
        return new cwfy(str, new ffix() { // from class: cwef
            @Override // defpackage.ffix
            public final Object invoke() {
                dngx dngpVar;
                List g;
                List g2;
                ambn ambnVar2 = ambn.this;
                cwir cwirVar2 = cwirVar;
                cwjb cwjbVar = cwirVar2.d;
                String c = ambnVar2.c();
                boolean e = cwjbVar.e();
                String concat = c.concat(" ");
                cwfa cwfaVar = this;
                Pattern pattern2 = pattern;
                if (e) {
                    dnym d = tud.d((tud) cwfaVar.g.b(), ambnVar2);
                    String e2 = ambnVar2.e();
                    String concat2 = concat.concat(String.valueOf(ambnVar2.d()));
                    boolean b = cwirVar2.b(ambnVar2.b());
                    g2 = cwfaVar.g(pattern2, ambnVar2.e(), 1, 0);
                    dngpVar = new dngv(d, e2, concat2, b, ffdx.ad(g2, cwfaVar.g(pattern2, ambnVar2.d(), 2, concat.length())), ((cwfz) cwfaVar.f.b()).c(ambnVar2, cwirVar2), new dngq((byte[]) null));
                } else {
                    dnym d2 = tud.d((tud) cwfaVar.g.b(), ambnVar2);
                    String e3 = ambnVar2.e();
                    String concat3 = concat.concat(String.valueOf(ambnVar2.d()));
                    g = cwfaVar.g(pattern2, ambnVar2.e(), 1, 0);
                    dngpVar = new dngp(d2, e3, concat3, ffdx.ad(g, cwfaVar.g(pattern2, ambnVar2.d(), 2, concat.length())), ((cwfz) cwfaVar.f.b()).c(ambnVar2, cwirVar2), new dngq((byte[]) null), 8);
                }
                return new cwfb(str, dngpVar);
            }
        });
    }

    public final List g(Pattern pattern, String str, int i, int i2) {
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
