package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czuc implements cpfu {
    private static final cskc a = cskc.g("Bugle", "RbmSuggestionsFilter");
    private final cpfn b;

    public czuc(cpfn cpfnVar) {
        this.b = cpfnVar;
    }

    @Override // defpackage.cpfu
    public final /* synthetic */ engw a(List list, cpff cpffVar, int i) {
        return cpfs.a(this, list, cpffVar, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0081 -> B:10:0x0086). Please report as a decompilation issue!!! */
    @Override // defpackage.cpfu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r9, defpackage.cpff r10, int r11, defpackage.ffgu r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.czub
            if (r0 == 0) goto L13
            r0 = r12
            czub r0 = (defpackage.czub) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            czub r0 = new czub
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.d
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r9 = r0.c
            java.lang.Object r10 = r0.b
            engr r11 = r0.h
            int r2 = r0.i
            java.lang.Object r4 = r0.a
            czuc r5 = r0.g
            defpackage.ffci.b(r12)
            goto L86
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            defpackage.ffci.b(r12)
            boolean r12 = r9.isEmpty()
            if (r12 == 0) goto L4c
            int r9 = defpackage.engw.d
            engw r9 = defpackage.enou.a
            r9.getClass()
            return r9
        L4c:
            int r12 = defpackage.engw.d
            engr r12 = new engr
            r12.<init>()
            java.util.Iterator r9 = r9.iterator()
            r5 = r10
            r10 = r9
            r9 = r5
            r5 = r12
            r12 = r11
            r11 = r5
            r5 = r8
        L5e:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto Lac
            java.lang.Object r2 = r10.next()
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData r2 = (com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData) r2
            cpfn r4 = r5.b
            r0.g = r5
            r0.a = r9
            r0.i = r12
            r0.h = r11
            r0.b = r10
            r0.c = r2
            r0.f = r3
            java.lang.Object r4 = r4.a(r2, r9, r12, r0)
            if (r4 != r1) goto L81
            return r1
        L81:
            r7 = r4
            r4 = r9
            r9 = r2
            r2 = r12
            r12 = r7
        L86:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L92
            r11.h(r9)
            goto La9
        L92:
            cskc r12 = defpackage.czuc.a
            csjb r12 = r12.a()
            java.lang.String r6 = "Discarding unacceptable"
            r12.I(r6)
            java.lang.String r9 = r9.toString()
            java.lang.String r6 = "suggestion"
            r12.D(r6, r9)
            r12.r()
        La9:
            r12 = r2
            r9 = r4
            goto L5e
        Lac:
            engw r9 = r11.g()
            r9.getClass()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czuc.b(java.util.List, cpff, int, ffgu):java.lang.Object");
    }
}
