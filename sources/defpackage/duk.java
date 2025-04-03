package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class duk extends ffhv implements ffjm {
    Object a;
    int b;
    final /* synthetic */ fflb c;
    final /* synthetic */ duq d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public duk(fflb fflbVar, duq duqVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = fflbVar;
        this.d = duqVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((duk) c((dnh) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0044 -> B:4:0x0047). Please report as a decompilation issue!!! */
    @Override // defpackage.ffhp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6) {
        /*
            r5 = this;
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.b
            if (r1 == 0) goto L10
            java.lang.Object r1 = r5.a
            java.lang.Object r2 = r5.e
            dnh r2 = (defpackage.dnh) r2
            defpackage.ffci.b(r6)
            goto L47
        L10:
            defpackage.ffci.b(r6)
            java.lang.Object r6 = r5.e
            dnh r6 = (defpackage.dnh) r6
            r2 = r6
        L18:
            fflb r6 = r5.c
            java.lang.Object r6 = r6.a
            boolean r1 = r6 instanceof defpackage.dtz
            if (r1 != 0) goto L4c
            boolean r1 = r6 instanceof defpackage.dtx
            if (r1 == 0) goto L27
            dtx r6 = (defpackage.dtx) r6
            goto L28
        L27:
            r6 = 0
        L28:
            if (r6 == 0) goto L33
            float r1 = r6.a
            long r3 = r6.b
            float r6 = r6.c
            r2.a(r1, r3, r6)
        L33:
            fflb r1 = r5.c
            duq r6 = r5.d
            r5.e = r2
            r5.a = r1
            r3 = 1
            r5.b = r3
            ffwm r6 = r6.d
            java.lang.Object r6 = r6.i(r5)
            if (r6 != r0) goto L47
            return r0
        L47:
            fflb r1 = (defpackage.fflb) r1
            r1.a = r6
            goto L18
        L4c:
            ffcu r6 = defpackage.ffcu.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duk.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        duk dukVar = new duk(this.c, this.d, ffguVar);
        dukVar.e = obj;
        return dukVar;
    }
}
